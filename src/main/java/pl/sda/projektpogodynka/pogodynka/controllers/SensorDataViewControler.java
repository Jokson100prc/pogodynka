package pl.sda.projektpogodynka.pogodynka.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sda.projektpogodynka.pogodynka.repository.SensorRepository;

@Controller
@RequestMapping("view/pogodynka/sensors")
public class SensorDataViewControler {

    private SensorRepository sensorRepository;

    @Autowired
    public SensorDataViewControler(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }


    @GetMapping
    public String allSensorsView(Model indexViewModel){
    indexViewModel.addAttribute("allSensors", sensorRepository.findAll());

    return "index";
}
}
