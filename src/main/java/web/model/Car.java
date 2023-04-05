package web.model;

public class Car {
    private String model;
    private int series;
    private String licensePlate;

    public Car(String model, int series, String licensePlate) {
        this.model = model;
        this.series = series;
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return model + " " + series + " " + licensePlate;
    }
}
