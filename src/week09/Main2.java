package week09;

public class Main2 {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("Samsung", "Galaxy S21");

        myPhone.displayInfo();
        myPhone.turnOn();
        myPhone.increaseVolume(5);
        myPhone.decreaseVolume(3);
        myPhone.connectToWiFi("HomeNetwork");
        myPhone.disconnectFromWiFi();
        myPhone.turnOff();
    }
}
