package ru.vsu.shegoleva;

class RepairRequest implements ServiceRequest {
    private int requestId;
    private String description;
    private Client client;
    private Car car;

    public RepairRequest(int requestId, Client client, Car car, String description) {
        this.requestId = requestId;
        this.description = description;
        this.client = client;
        this.car = car;
    }

    public int getRequestId() {
        return requestId;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String getDetails() {
        return "Заявка(ID: " + requestId + ", Клиент: " + client.getName() + ", " +
                "Автомобиль: " + car.getMake() + ", " + car.getYear() +
                ", Описание проблемы: " + description + ")";
    }

    @Override
    public String toString() {
        return getDetails();
    }
}