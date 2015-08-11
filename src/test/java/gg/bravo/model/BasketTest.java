package gg.bravo.model;

import gg.bravo.enums.EnumItemCategory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Created by grivelg on 11/08/2015.
 */
public class BasketTest {
    private Good aGood;
    private ItemContainer aContainer;
    private Basket aBasket;
    private double cost=10.00;
    private String anExemptedGoodDesc = "a book";
    private int quantity =2;
    private String basketName="1";

    @BeforeClass
    public void init(){

        aGood = new Good(anExemptedGoodDesc, EnumItemCategory.BOOK,cost);
        aContainer = new ItemContainer(quantity,aGood);
        aBasket = new Basket(basketName);
        aBasket.insertGoodIntoBasket(aContainer);
    }

    @Test
    public void getName(){
        assertEquals(basketName, aBasket.getName());
    }


    @Test
    public void getTotalCost(){
        double expected = quantity*aGood.getFinalCost();
        assertEquals(expected, aBasket.getTotalCost());
    }


    @Test
    public void getTotalTaxes(){
        double expected = quantity*aGood.getTotalTaxes();
        assertEquals(expected, aBasket.getTotalTaxes());
    }

    @Test
    public void getGoods(){
        assertEquals(1, aBasket.getGoods().size());
    }



}
