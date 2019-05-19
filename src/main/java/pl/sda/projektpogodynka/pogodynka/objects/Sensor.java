package pl.sda.projektpogodynka.pogodynka.objects;

import pl.sda.projektpogodynka.pogodynka.objects.SensorData;

import java.time.LocalDateTime;
import java.util.List;


public class Sensor {

    private String id;
    private String name;
    private String description;
    private List<SensorData> sensorData;
    private LocalDateTime date;

    public Sensor() {
    }

    public Sensor(String name, String description, List<SensorData> sensorData, LocalDateTime date) {
        this.name = name;
        this.description = description;
        this.sensorData = sensorData;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<SensorData> getSensorData() {
        return sensorData;
    }

    public void setSensorData(List<SensorData> sensorData) {
        this.sensorData = sensorData;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", sensorData=" + sensorData +
                ", date=" + date +
                '}';
    }
}
