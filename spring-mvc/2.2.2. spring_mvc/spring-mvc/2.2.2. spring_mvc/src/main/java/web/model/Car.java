package web.model;

public class Car {

    private String firm;
    private String model;
    private int year;

    public Car(String firm, String model, int year) {
        this.firm = firm;
        this.model = model;
        this.year = year;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "firm='" + firm + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
