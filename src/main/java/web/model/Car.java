package web.model;

public class Car {

    private String carModel;
    private int series;
    private String owner;

    public Car() {
    }

    public Car(String carModel, int series, String owner) {
        this.carModel = carModel;
        this.series = series;
        this.owner = owner;
    }

    public String getCarModel() {return carModel;}

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
