package gg.bravo;

import gg.bravo.enums.EnumItemCategory;
import gg.bravo.model.Basket;
import gg.bravo.model.Good;
import gg.bravo.model.ImportedGood;
import gg.bravo.model.ItemContainer;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by grivelg on 10/08/2015.
 */
public class Main {
    public static void main(String [] args)
    {
        ArrayList<Basket> baskets = new ArrayList<Basket>();
        baskets.add(createBasket1());
        baskets.add(createBasket2());
        baskets.add(createBasket3());
        System.out.println("INPUT \r");
        for(Basket basket:baskets){
            basket.printBasket();
        }
        System.out.println("\nOUTPUT \r");
        for(Basket basket:baskets){
            basket.printBasketInvoice();
        }

    }


   private static Basket createBasket1(){
       Basket basket1 = new Basket("1");
       Good book = new Good("book", EnumItemCategory.BOOK,12.49);
       basket1.insertGoodIntoBasket(new ItemContainer(1,book));
       Good cd = new Good("music cd",EnumItemCategory.OTHER,14.99);
       basket1.insertGoodIntoBasket(new ItemContainer(1,cd));
       Good chocBar = new Good("chocolate bar",EnumItemCategory.FOOD,0.85);
       basket1.insertGoodIntoBasket(new ItemContainer(1,chocBar));
       return basket1;
    }

    private static Basket createBasket2(){
        Basket basket2 = new Basket("2");
        ImportedGood iChocBox = new ImportedGood("imported box of chocolate",EnumItemCategory.FOOD,10.00);
        basket2.insertGoodIntoBasket(new ItemContainer(1,iChocBox));
        ImportedGood iPerfBottle = new ImportedGood("imported bottle of perfume",EnumItemCategory.OTHER,47.50);
        basket2.insertGoodIntoBasket(new ItemContainer(1,iPerfBottle));
        return basket2;
    }

    private static Basket createBasket3(){
        Basket basket3 = new Basket("3");
        ImportedGood iperfBottle = new ImportedGood("imported bottle of perfume",EnumItemCategory.OTHER,27.99);
        basket3.insertGoodIntoBasket(new ItemContainer(1,iperfBottle));
        Good perfBottle = new Good("bottle of perfume",EnumItemCategory.OTHER,18.99);
        basket3.insertGoodIntoBasket(new ItemContainer(1,perfBottle));
        Good pillsPacket = new Good("packet of headache pills",EnumItemCategory.MED_PRD,9.75);
        basket3.insertGoodIntoBasket(new ItemContainer(1,pillsPacket));
        ImportedGood iChocBox = new ImportedGood("box of imported chocolate",EnumItemCategory.FOOD, 11.25);
        basket3.insertGoodIntoBasket(new ItemContainer(1,iChocBox));
        return  basket3;
    }
}
