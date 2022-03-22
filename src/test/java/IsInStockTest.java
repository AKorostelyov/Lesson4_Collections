import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

public class IsInStockTest {
    @Before
    public void fillFullStore() {
        Storage.addObject("apple", 9);
        Storage.addObject("banana", 9);
    }

    @Test
    public void isInStockTest1(){
        Assert.assertTrue(Storage.isInStock("apple"));
    }
    @Test
    public void isInStockTest2(){
        Assert.assertFalse(Storage.isInStock("lemone"));
    }
    @AfterClass
    public static void allRemoveStore(){
        Storage.removeObject("apple");
        Storage.removeObject("banana");
        Storage.removeObject("melone");
    }
}
