package modes;
import device.Device;

public class NightMode extends Mode {
    protected Device device;
    public NightMode() {}
    public NightMode(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        if (device.work()) {
            device.turnOff();
        } else {
            System.out.println("WARNING! Lights at night DO in fact hurt");
            device.turnOn();
        }
    }

    @Override
    public void intensityUp() {
        device.setIntensity(device.getIntensity() + 1);
    }

    @Override
    public void intensityDown() {
        device.setIntensity(device.getIntensity() - 1);
    }

    @Override
    public void typeChange(String type) {
        device.setType(type);
    }
}