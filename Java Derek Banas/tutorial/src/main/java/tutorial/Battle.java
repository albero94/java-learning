package tutorial;

public class Battle {
    Warrior w1;
    Warrior w2;

    public static void fight(Warrior w1, Warrior w2) {
        while (true) {
            if(getAttackResult(w1, w2).equals("Game over")){
                break;
            }
            if(getAttackResult(w2, w1).equals("Game over")){
                break;
            }
        }
    }

    public static String getAttackResult(Warrior wA, Warrior wB) {
        int damage = wA.attack() - wB.block();
        if (damage > 0) {
            wB.health -= damage;
        } else{
            damage = 0;
        }

        System.out.printf("%s attacks %s and deals %d damage \n", wA.getName(), wB.getName(), damage);
        
        System.out.printf("%s now has %d health\n\n", wB.getName(), wB.health);

        try {
            Thread.sleep(1500);
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }

        if (wB.health <= 0) {
            System.out.printf( "%s has died in battle and %s is victorious!",wB.getName(), wA.getName());
            return "Game over";
        }else{
            return "Fight again";
        }
    }

}