import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import static org.junit.Assert.assertFalse;

public class RemoveObjectTest {
    @Before
    public void setUp(){
        Storage.addObject("apple", 3);
        Storage.addObject("melone", 7);
    }
    @Test
    public void pozitiveTestRemove() {
        Storage.removeObject("melone");
        assertFalse(Storage.isInStock("melone"));
    }

    @Test
    public void missingProductTestRemove(){
        Storage.removeObject("banana");
        assertFalse(Storage.isInStock("banana"));
    }

    @AfterClass
    public static void allRemoveStore(){
        Storage.removeObject("apple");
        Storage.removeObject("banana");
        Storage.removeObject("melone");
    }

}
