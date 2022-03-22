import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

public class GetFreePlacesTest {
    @Before
    public void fillFullStore() {
        Storage.addObject("apple", 9);
        Storage.addObject("banana", 9);
    }

    @Test
    public void getFreePlacesTest1(){
        Assert.assertTrue(Storage.getFreePlaces()==1);
    }
    @Test
    public void getFreePlacesTest2(){
        Storage.addObject("melone", 9);
        Assert.assertTrue(Storage.getFreePlaces()==0);
    }
    @AfterClass
    public static void allRemoveStore(){
        Storage.removeObject("apple");
        Storage.removeObject("banana");
        Storage.removeObject("melone");
    }
}
