package web.model;

public class Car {

    private String model;
    private String color;
    private String series;

    public Car(String model, String color, String series) {
        this.model = model;
        this.color = color;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getSeries() {
        return series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model  +
                ", color='" + color +
                ", series='" + series + '\'' +
                '}';
    }

    public Car() {
    }



}
