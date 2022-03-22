import categories.Basic;
import org.junit.AfterClass;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ru.digitalleague.storage_example.Storage;

@RunWith(Categories.class)
@Suite.SuiteClasses({
        AddNewObjectTestNegative.class,
        AddNewObjectTestPozitive.class,
        AddObjectTestNegative.class,
        AddObjectTestPozitive.class,
        AddToExistObjectTest.class,
        GetFreePlacesTest.class,
        IsInStockTest.class,
        RemoveObjectTest.class
})



public class StoreSuiteTests {


}
