package pl.sda.projektpogodynka.pogodynka.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.sda.projektpogodynka.pogodynka.repository.SensorRepository;
import pl.sda.projektpogodynka.pogodynka.objects.Sensor;

import java.util.Optional;

@RestController
@RequestMapping(SensorController.API_SENSOR_PATH)
public class SensorController {

    static final String API_SENSOR_PATH = "api/pogodynka";
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