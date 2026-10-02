package device;

public class Lights implements Device {
    private boolean on = false;
    private int intensity = 5;
    private String type = "Default";

    @Override
    public boolean work() {
        return on;
    }

    @Override
    public void turnOn() {
        on = true;
    }

    @Override
    public void turnOff() {
        on = false;
    }

    @Override
    public int getIntensity() {
        return intensity;
    }

    @Override
    public void setIntensity(int intensity) {
        if (intensity > 10) {
            this.intensity = 10;
        } else if (intensity < 0) {
            this.intensity = 0;
        } else {
            this.intensity = intensity;
        }
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void printStatus() {
        System.out.println("Lights are " + (on ? "on" : "off"));
        System.out.println("Brightness is at " + intensity + " level");
        System.out.println("Color is " + type);
    }
}