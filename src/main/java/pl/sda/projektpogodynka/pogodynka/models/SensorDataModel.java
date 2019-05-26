package pl.sda.projektpogodynka.pogodynka.models;

import java.time.LocalDateTime;
import java.util.HashMap;


// tu są dane, które się zmieniają czyli id obiektu, temperatura, czy wilgotność, które będą słane do BD
    class SensorDataModel {
        String sensorId;
        HashMap<String, Double> values;
        LocalDateTime date;
    }