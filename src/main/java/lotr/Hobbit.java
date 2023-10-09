// class Hobbit 
//   - attributes: int power=0, int hp=3
//   - methods: void kick(Character c) { toCry() }

package lotr;

import kick.Cry;

public class Hobbit extends Character{
    public Hobbit() {
        super(3, 0);
    }

    @Override
    public void kick(Character c) {
        Cry cry = new Cry();
        cry.kick(this, c);
    }
}