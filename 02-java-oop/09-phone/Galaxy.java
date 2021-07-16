public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public String ring() {
        System.out.println(this.versionNumber + " says " + this.ringTone);
        return this.getRingTone();
    }

    @Override
    public String unlock() {
        return "Unlocking via simple, easy to use interface";
    }

    @Override
    public void displayInfo() {
        System.out.println(this.getClass().getSimpleName());
    }
}
