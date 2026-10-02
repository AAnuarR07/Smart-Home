package modes;

public abstract class Mode {
    public abstract void power();
    public abstract void intensityUp();
    public abstract void intensityDown();
    public abstract void typeChange(String type);
}
