package pl.sda.projektpogodynka.pogodynka;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/pogodynka")
public class SensorDataViewControler {

    private SensorRepository sensorRepository;

    public SensorDataViewControler(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    @GetMapping
    public String allSensorsView(Model indexViewModel){
    indexViewModel.addAttribute("allSensors", sensorRepository.findAll());

    return "index";
}
}
