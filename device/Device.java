package device;

public interface Device {

    boolean work();
    void turnOn();
    void turnOff();
    int getIntensity();
    void setIntensity(int intensity);
    String getType();
    void setType(String type);

    void printStatus();
}
