package pl.sda.projektpogodynka.pogodynka.objects;


class SensorData {
    private String name;
    private Double value;

    public SensorData() {
    }

    public SensorData(String name, Double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SensorData{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
