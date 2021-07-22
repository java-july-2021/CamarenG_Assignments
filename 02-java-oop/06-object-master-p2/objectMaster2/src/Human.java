public class Human {
    protected int strength;
    protected int stealth;
    protected int intelligence;
    protected int health;

    // setters//

    public int setHealth(int health) {
        return this.health = health;
    }

    public int setIntel(int intelligence) {
        return this.intelligence = intelligence;
    }

    public int setStealth(int stealth) {
        return this.stealth = stealth;
    }

    public int setStrength(int strength) {
        return this.strength = strength;
    }

    // getters//

    public int getHealth() {
        return this.health;
    }

    public int getIntel() {
        return this.intelligence;
    }

    public int getStealth() {
        return this.stealth;
    }

    public int getStrength() {
        return this.strength;
    }

    public Human(int strength, int stealth, int intelligence, int health) {
        this.strength = strength;
        this.stealth = stealth;
        this.intelligence = intelligence;
        this.health = health;
    }

    public Human() {
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
        this.health = 100;
    }

    public int attack(Human attk) {
        System.out.println(" someone is being attacked");
        System.out.println("their new health level is " + (attk.getHealth() - attk.getStrength()) + " out of 100 ");

        this.health = (attk.getHealth() - attk.getStrength());

        return health;

    }
}
