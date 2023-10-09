package kick;

import lotr.Character;

public class ElfKick implements KickStrategy {
    public void toKill(Character whoKick, Character opponent) {
        //kill everybody weaker than him, 
        //otherwise decrease the power of character by 1 
        opponent.setHp(opponent.getHp() - whoKick.getPower());
        if (opponent.isAlive()) {
            whoKick.setPower(whoKick.getPower() - 1);
        }
    }

    @Override
    public void kick(Character whoKick, Character opponent) {
        toKill(whoKick, opponent);
    }
}
