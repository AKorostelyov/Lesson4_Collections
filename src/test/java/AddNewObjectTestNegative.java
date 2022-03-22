import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

public class AddNewObjectTestNegative {
    @Before
    public void fillFullStore(){
        Storage.addObject("apple", 10);
        Storage.addObject("banana", 10);
        Storage.addObject("melone", 10);
    }

    @Test(expected = AssertionError.class)
    public void addNewProductButFreePlacesMissing(){
        Storage.addNewObject("kiwi", 1);
        Assert.assertTrue(Storage.isInStock("kiwi"));
    }

    @Test(expected = AssertionError.class)
    public void addNewProductZeroButFreePlacesMissing(){
        Storage.addNewObject("kiwi", 0);
        Assert.assertTrue(Storage.isInStock("kiwi"));
    }

    @AfterClass
    public static void allRemoveStore(){
        Storage.removeObject("apple");
        Storage.removeObject("banana");
        Storage.removeObject("melone");
    }

}
