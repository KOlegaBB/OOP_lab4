package lotr;

public class Character {
    private
    int power; int hp;

    public Character(int hp, int power) {
        this.hp = hp;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }


    public void setHp(int hp) {
        if (hp < 0) {
            hp = 0;
        }
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void kick(Character c) {
        c.setHp(c.getHp() - power);
    }

    public boolean isAlive() {
        return getHp() > 0;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "{" +
                "hp=" + getHp() +
                ", power=" + getPower() +
                '}';
    }
}
