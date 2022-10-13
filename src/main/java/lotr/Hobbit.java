package lotr;


public class Hobbit extends Character {
    public Hobbit() {
        super(3, 0);
    }

    public void kick(Character c) {
        super.kick(c);
        System.out.println("Tears");
    }


}
