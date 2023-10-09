package kick;

import java.util.Random;

import lotr.Character;

public class NobleKick implements KickStrategy{
    private static Random random = new Random();

    @Override
    public void kick(Character whoKick, Character opponent) {
        opponent.setHp(opponent.getHp() - random.nextInt(whoKick.getPower()));
    }
    
}
