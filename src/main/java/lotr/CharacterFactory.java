package lotr;

import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;

import static org.reflections.scanners.Scanners.SubTypes;

public class CharacterFactory {
    public Character createCharacter() throws NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {
        Reflections reflections = new Reflections("lotr");
        List<Class<?>> subTypes = new ArrayList<>(reflections.get(SubTypes.of(Character.class).asClass()));
        Class<?> rand_class = subTypes.get(new Random().nextInt(subTypes.size()));
        return (Character) rand_class.getConstructor().newInstance();
    }
}
