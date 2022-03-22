import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import static org.junit.Assert.assertFalse;

public class AddNewObjectTestPozitive {
    @Before
    public void fillFullStore(){
        Storage.addObject("apple", 10);
        Storage.addObject("banana", 10);

    }

    @Test
    public void addNewObjectTest1(){
        Storage.addNewObject("melone", 1);
        Assert.assertTrue(Storage.isInStock("melone"));
    }

    @AfterClass
    public static void allRemoveStore(){
        Storage.removeObject("apple");
        Storage.removeObject("banana");
        Storage.removeObject("melone");
    }



}
