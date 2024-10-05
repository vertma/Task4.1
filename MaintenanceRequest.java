package ru.vsu.shegoleva;

class MaintenanceRequest implements ServiceRequest {
    private int requestId;
    private String equipmentType;
    private String description;

    public MaintenanceRequest(int requestId, String equipmentType, String description) {
        this.requestId = requestId;
        this.equipmentType = equipmentType;
        this.description = description;
    }

    public int getRequestId() {
        return requestId;
    }

    public String getDescription() {
        return description;
    }
    @Override
    public String getDetails() {
        return "Заявка(ID: " + requestId + ", Тип оборудования: " + equipmentType +
                ", Описание проблемы: " + description + ")";
    }

    @Override
    public String toString() {
        return getDetails();
    }
}