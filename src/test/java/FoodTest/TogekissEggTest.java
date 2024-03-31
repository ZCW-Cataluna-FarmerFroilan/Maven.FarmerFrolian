package FoodTest;
import com.zipcodewilmington.froilansfarm.Crop.Storage;
import com.zipcodewilmington.froilansfarm.Person.Person;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TogekissEggTest
{
    @Test
    public void isInstanceOfTest()
    {
        TogekissEgg togepi = new TogekissEgg();
        assertTrue(togepi instanceof Edible);
    }
    @Test
    public void eatTest()
    {
        //Given
        Person person = new Person(null);
        TogekissEgg togepi = new TogekissEgg();
        Storage storage = new Storage();

        //When
        storage.put(togepi, 1);
        person.eat(togepi);

        //Then
        Integer expected = 0;
        Integer actual = storage.getValue;

        Assert.assertEquals(expected, actual);
    }
}
