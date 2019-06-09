package pl.sda.projektpogodynka.pogodynka.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sda.projektpogodynka.pogodynka.repository.SensorRepository;

@Controller
@RequestMapping("api/pogodynka/view/sensors")
public class SensorDataViewControler {

    private SensorRepository sensorRepository;

    public SensorDataViewControler(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }


    @GetMapping
    public String allSensorsView(Model indexViewModel) {
        indexViewModel.addAttribute("allSensors", sensorRepository.findAll());
        return "sensor-result";
    }
}
