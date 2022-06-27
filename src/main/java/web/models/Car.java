package web.models;

public class Car {
    private String model;
    private String color;
    private int version;

    public Car(String model, String color, int version) {
        this.model = model;
        this.color = color;
        this.version = version;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
