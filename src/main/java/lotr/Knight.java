package lotr;

import java.util.Random;

public class Knight extends Character {
    public Knight() {
        super(new Random().nextInt(11) + 2, new Random().nextInt(11) + 2);
    }

    public void kick(Character c) {
        c.setHp(c.getHp() - new Random().nextInt(this.getPower() + 1));
    }
}
