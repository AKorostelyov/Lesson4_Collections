import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

public class AddToExistObjectTest {
    @Before
    public void fillFullStore(){
        Storage.addObject("apple", 9);
        Storage.addObject("banana", 9);
        Storage.addObject("melone", 9);
    }

    @Test
    public void addExistingProductTestPozitive(){
        Assert.assertTrue(Storage.addToExistObject("melone", 1));
    }

    @Test (expected = AssertionError.class)
    public void addExistingProductTestNegative(){
        Assert.assertTrue(Storage.addToExistObject("banana", 5));
    }

    @AfterClass
    public static void allRemoveStore(){
        Storage.removeObject("apple");
        Storage.removeObject("banana");
        Storage.removeObject("melone");
    }
}
