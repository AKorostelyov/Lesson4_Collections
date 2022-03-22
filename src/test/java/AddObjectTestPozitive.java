import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import static org.junit.Assert.assertFalse;

public class AddObjectTestPozitive {
    @Test
    public void addObjectEmptyStore(){
        Storage.addObject("apple", 10);
        Storage.addObject("melone", 1);
        Assert.assertTrue(Storage.isInStock("apple"));
        Assert.assertTrue(Storage.isInStock("melone"));
    }

    @AfterClass
    public static void allRemoveStore(){
        Storage.removeObject("apple");
        Storage.removeObject("banana");
        Storage.removeObject("melone");
    }

}
