// class GameManager
//    - methods: void fight(Character c1, Character c2) { 
//                 to provide fight between to characters and explain via command 
//                 line what happens during fight, till both of 
//                 the characters are alive 
//               }

package lotr;

import lotr.Character;
import lotr.CharacterFactory;

public class GameManager {
    public void fight(Character c1, Character c2) {
        int count = 1;
        System.out.println("What a nice day. Oh, wait someone is coming...");
        System.out.println("That is:");
        System.out.println(" + Character_1" + c1);
        System.out.println(" + Character_2" + c2);
        if (c1 instanceof Hobbit && c2 instanceof Hobbit) {
            System.out.println("The Hobbits are peaceful, so they will not fight.");
            System.exit(0);
        }
        System.out.println("It looks like they are going to fight.");
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println("Round " + Integer.toString(count) + ":");
            c1.kick(c2);
            c2.kick(c1);
            System.out.println("- Current hp for Character_1" + c1.getClass().getSimpleName() + " " + c1.getHp() + ".");
            System.out.println("- Current hp for Character_2" + c2.getClass().getSimpleName() + " " + c2.getHp() + ".");
            count += 1;
        }
        System.out.println("The fight is over.");
        if (c1.isAlive() == false) {
            System.out.println("Character_1 " + c1.getClass().getSimpleName() + " has lost.");
            System.out.println(c2.getClass().getSimpleName() + " has won with remaining " + c2.getHp() + " HP left.");
        } else {
            System.out.println(c2.getClass().getSimpleName() + " has lost.");
            System.out.println(c1.getClass().getSimpleName() + " has won with remaining " + c1.getHp() + " HP left.");
        }
    }
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        Character c1 = factory.createCharacter();
        Character c2 = factory.createCharacter();
        GameManager gameManager = new GameManager();
        gameManager.fight(c1, c2);
    }
}
