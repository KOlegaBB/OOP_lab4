package lotr;


public class GameManager {
    public void fight(Character c1, Character c2) {
        System.out.print(c1.getClass().getSimpleName());
        System.out.print(" vs ");
        System.out.println(c2.getClass().getSimpleName());
        System.out.print("Character_1 hp = ");
        System.out.println(c1.getHp());
        System.out.print("Character_1 power = ");
        System.out.println(c1.getPower());
        System.out.print("Character_2 hp = ");
        System.out.println(c2.getHp());
        System.out.print("Character_2 power = ");
        System.out.println(c2.getPower());
        while (c1.getHp() > 0 && c2.getHp() > 0) {
            if (c1.getPower() == 0 && c2.getPower() == 0){
                break;
            }
            c1.kick(c2);
            System.out.println("Character_1 kicked Character_2");
            System.out.print("Character_1 hp = ");
            System.out.println(c1.getHp());
            System.out.print("Character_1 power = ");
            System.out.println(c1.getPower());
            System.out.print("Character_2 hp = ");
            System.out.println(c2.getHp());
            System.out.print("Character_2 power = ");
            System.out.println(c2.getPower());
            c2.kick(c1);
            System.out.println("Character_2 kicked Character_1");
            System.out.print("Character_1 hp = ");
            System.out.println(c1.getHp());
            System.out.print("Character_1 power = ");
            System.out.println(c1.getPower());
            System.out.print("Character_2 hp = ");
            System.out.println(c2.getHp());
            System.out.print("Character_2 power = ");
            System.out.println(c2.getPower());
        }
        if (c1.getHp() > 0 && c2.getHp() == 0) {
            System.out.println("Character_1 won");
        } else if ((c2.getHp() > 0 && c1.getHp() == 0)) {
            System.out.println("Character_2 won");
        } else {
            System.out.println("Draw");
        }
    }
}