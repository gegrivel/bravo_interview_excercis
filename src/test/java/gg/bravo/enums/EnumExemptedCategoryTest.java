package gg.bravo.enums;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by grivelg on 11/08/2015.
 */
public class EnumExemptedCategoryTest {

    @Test
    public void getCategoryName(){
        assertEquals("book",EnumExemptedCategory.BOOK.getCategoryName());
    }
}
