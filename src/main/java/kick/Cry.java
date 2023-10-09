package kick;

import lotr.Character;
import kick.Cry;

public class Cry implements KickStrategy{
    private void toCry() {
        System.out.println("Hobbit is crying... :(");
    }
    
    @Override
    public void kick(Character whoKick, Character opponent) {
        toCry();
    }
    
}