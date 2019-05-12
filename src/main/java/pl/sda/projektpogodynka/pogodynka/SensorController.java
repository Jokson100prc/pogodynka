package pl.sda.projektpogodynka.pogodynka;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/pogodynka")
public class SensorController {

    private SensorRepository sensorRepository;

    public SensorController() {
    }

    @Autowired
    public SensorController(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    @GetMapping
    public Iterable<Sensor> getSensors() {
        return sensorRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Sensor> getSensorById(@PathVariable String id) {
        return sensorRepository.findById(id);
    }

    @PostMapping
    public void sendSensor(@RequestBody Sensor sensor) {
        sensorRepository.save(sensor);
    }

    @DeleteMapping("/{id}")
    public void deleteSensorById(@PathVariable String id) {
        sensorRepository.deleteById(id);
    }
}
