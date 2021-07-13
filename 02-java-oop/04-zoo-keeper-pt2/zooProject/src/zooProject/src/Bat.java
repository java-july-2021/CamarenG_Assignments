//package zooProject.src;

public class Bat extends mammal {
    public int displayEnergy(){
        energyLevel += 200;
        super.displayEnergy();
        return energyLevel;
    }

    public int fly(){
        energyLevel -= 50;
        System.out.println(" WOOSH ");
        return energyLevel;
    }

    public int eatHumans(){
        energyLevel += 25;
        return energyLevel;
    }

    public int attackTown(){
        energyLevel -= 100;
        System.out.println(" * town slowly burns to the ground * ");
        return energyLevel;
    }
}

