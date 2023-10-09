// class CharacterFactory 
//    - methods: Character createCharacter() { 
//                 returns random instance of any existing character 
//               }

package lotr;

import java.lang.reflect.Constructor;
import java.util.Random;
import lombok.SneakyThrows;

public class CharacterFactory {
    @SneakyThrows
    public Character createCharacter() {
        Class<?>[] characters = {Hobbit.class, King.class, Knight.class};
        int randomIndex = new Random().nextInt(characters.length);
        Class<?> characterClass = characters[randomIndex];
        Constructor<?> constructor = characterClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        return (Character) constructor.newInstance();
    }
}
