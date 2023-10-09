// class Knight 
//    - attributes: int power=from 2 to 12, int hp=from 2 to 12
//    - methods: void kick(Character c) { like King }

package lotr;

import kick.NobleKick;

public class Knight extends Noble{

    public Knight() {
        super(2, 12);
    }

    @Override
    public void kick(Character c) {
        NobleKick knightKick = new NobleKick();
        knightKick.kick(this, c);
    }
    
}
