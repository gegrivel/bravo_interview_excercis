package gg.bravo.enums;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Created by grivelg on 11/08/2015.
 */
public class EnumItemCategoryTest {

    @Test
    public void getCategoryName(){
        assertEquals("book",EnumItemCategory.BOOK.getCategoryName());
    }
}
