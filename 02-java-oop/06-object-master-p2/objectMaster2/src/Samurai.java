public class Samurai extends Human{
    public static int samNum = 0;
    public Samurai(){
        this.health = 200;
        samNum++;
    }

    public void deathBlow(Human otherHuman){
        otherHuman.health -= otherHuman.health;
        this.health -= (this.health/2);

    }
    public void meditate(Human thisHuman){
        this.health += 100;

    }

    public static void howMany(){
        System.out.println(samNum);
    }

}