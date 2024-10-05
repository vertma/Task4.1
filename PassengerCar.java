package ru.vsu.shegoleva;

public class PassengerCar extends Car {
    private int numberOfSeats;

    public PassengerCar(String make, int year, int numberOfSeats) {
        super(make, year);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public void displayInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Пассажирский автомобиль: Марка = " + getMake() + ", Год выпуска = " + getYear() + ", Количество мест = " + numberOfSeats;
    }
}