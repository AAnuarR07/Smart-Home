package modes;
import device.Device;

public class DayMode extends Mode {

    protected Device device;
    public DayMode() {}
    public DayMode(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        if (device.work()) {
            device.turnOff();
        } else {
            device.turnOn();
        }
    }

    @Override
    public void intensityUp() {
        device.setIntensity(device.getIntensity() + 2);
    }

    @Override
    public void intensityDown() {
        device.setIntensity(device.getIntensity() - 2);
    }

    @Override
    public void typeChange(String type) {
        device.setType(type);
    }
}