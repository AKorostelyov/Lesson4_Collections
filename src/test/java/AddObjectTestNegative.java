import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

public class AddObjectTestNegative {
    @Before
    public void fillFullStore(){
        Storage.addObject("apple", 10);


    }

    //проверка на невозможность добавить  количества больше чем установлено
    @Test
    public void addProductFulShelf(){
        Storage.addObject("apple", 1);
        Assert.assertTrue(Storage.getProductAmount("apple")==10 );
    }

    //Нужно добавить в программу запрет на добавление на склад нулевого количества
    @Test(expected = AssertionError.class)
    public void addProductFullShelf2(){
        Storage.addObject("apple", 0);
        Assert.assertFalse(Storage.isInStock("apple"));
    }

    //Нужно добавить в программу запрет на добавление на склад отрицательного количества
    @Test(expected = AssertionError.class)
    public void addProductFullShelf3(){
        Storage.addObject("apple", -4);
        Assert.assertTrue(Storage.getProductAmount("apple")==10 );
    }

    @AfterClass
    public static void allRemoveStore(){
        Storage.removeObject("apple");
        Storage.removeObject("banana");
        Storage.removeObject("melone");
    }

}
