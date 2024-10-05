package ru.vsu.shegoleva;

abstract class Client {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract void displayInfo();
}
