package tutorial;

public class WarriorGame{
    public static void main(String[] args){
        Warrior thor = new Warrior("Thor", 800, 130, 40);
        Warrior loki = new DodgeWarrior("Loki", 800, 85, 40, 0.25);

        Battle.fight(thor, loki);
    }
}