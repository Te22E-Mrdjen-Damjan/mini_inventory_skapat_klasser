


public class Weapon {
    public int minDamage = 10;
    public int maxDamage = 100;
    public int Attack(){

        return (int) (Math.random() * (maxDamage - minDamage))+ minDamage;

    }
}
