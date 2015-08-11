package gg.bravo.model;

import gg.bravo.enums.EnumItemCategory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Created by grivelg on 11/08/2015.
 */
public class ItemContainerTest {

    private Good aGood;
    private ItemContainer container;
    private double cost=10.00;
    private String anExemptedGoodDesc = "a book";
    private int quantity =2;



    @BeforeClass
    public void init(){
        aGood = new Good(anExemptedGoodDesc, EnumItemCategory.BOOK,cost);
        container = new ItemContainer(quantity,aGood);
    }

    @Test
    public void getItem(){
        assertEquals(aGood,container.getItem());
    }

    @Test
    public void getQuantity(){
        assertEquals(quantity,container.getQuantity());
    }

}
