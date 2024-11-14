public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Weapon feinCannon = new Weapon();
        int AttackDamage = feinCannon.Attack();
        System.out.println(AttackDamage);
    }
}