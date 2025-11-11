package week09;

public class Device {

    private String brand;
    private String model;

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Device Info: Brand: " + brand + ", Model: " + model);
    }

    // Nested Interface Connectivity
    interface Connectivity {
        void connectToWiFi(String networkName);
        void disconnectFromWiFi();
    }
}
