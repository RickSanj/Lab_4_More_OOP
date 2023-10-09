// class Elf 
//    - attributes: int power=10, int hp=10
//    - methods: void kick(Character c) { 
//                 kill everybody weaker than him, 
//                 otherwise decrease the power of character by 1 
//               }
package lotr;

import kick.ElfKick;

public class Elf extends Character{
    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character c) {
        ElfKick elfKick = new ElfKick();
        elfKick.kick(this, c);
    }
    
}