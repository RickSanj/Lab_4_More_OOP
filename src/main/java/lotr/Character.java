// class Character 
//   - attributes: int power, in hp
//   - methods: void kick(Character c), boolean isAlive()

package lotr;

import kick.KickStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public abstract class Character {
    private int hp;
    private int power;
    private KickStrategy kickstrategy;

    public void kick(Character opponent) {
        kickstrategy.kick(this, opponent);
    }

    public boolean isAlive() {
        return getHp() > 0;
    }

    public Character(int hp, int power) {
        this.hp = hp;
        this.power = power;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }

    public void setHp(int hp) {
        this.hp = hp > 0 ? hp : 0;
    }
    
    public void setPower(int power) {
        this.power = power > 0 ? power : 0;
    }
}