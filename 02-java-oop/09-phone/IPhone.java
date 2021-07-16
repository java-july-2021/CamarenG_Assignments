public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public String ring() {
        System.out.println("the " + this.versionNumber + " is ringing " + this.ringTone);
        return this.getRingTone();
    }

    @Override
    public String unlock() {
        return "Unlocking via overly complicated interface";
    }

    @Override
    public void displayInfo() {
        System.out.println(this.getClass().getSimpleName());

    }
}
