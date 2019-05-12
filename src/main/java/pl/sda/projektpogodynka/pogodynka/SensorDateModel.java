package pl.sda.projektpogodynka.pogodynka;

import java.time.LocalDateTime;
import java.util.HashMap;

    class SensorDataModel {
        String sensorId;
        HashMap<String, Double> values;
        LocalDateTime date;
    }

