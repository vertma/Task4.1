package ru.vsu.shegoleva;

public class IndividualClient extends Client {
    private String phone;

    public IndividualClient(String name, String phone) {
        super(name);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public void displayInfo() {

    }
}

