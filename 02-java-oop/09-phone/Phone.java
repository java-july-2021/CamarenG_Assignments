public abstract class Phone {

    protected String versionNumber;
    private int batteryPercentage;
    private String carrier;
    protected String ringTone;

    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }

    // abstract method

    public abstract void displayInfo();

    // getters

    public String getVersionNumber() {
        return this.versionNumber;
    }

    public int getBatteryPercentage() {
        return this.batteryPercentage;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public String getRingTone() {
        return this.ringTone;
    }

    // setterss

    public String setVersionNumber() {
        return this.versionNumber = versionNumber;
    }

    public int setBatteryPercentage() {
        return this.batteryPercentage = batteryPercentage;
    }

    public String setCarrier() {
        return this.carrier = carrier;
    }

    public String setRingTone() {
        return this.ringTone = ringTone;
    }

}
