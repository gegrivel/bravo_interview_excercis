package gg.bravo.model;


import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by grivelg on 07/08/2015.
 */
public class Basket {

    public Basket(String name) {
        this.name = name;
        goods=new ArrayList<ItemContainer>();
        totalCost=0.00;
        totalTaxes =0.00;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    ArrayList<ItemContainer> goods;

    double totalCost;
    double totalTaxes;



    public double getTotalCost() {
        return totalCost;
    }

    private void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getTotalTaxes() {
        return totalTaxes;
    }

    private    void setTotalTaxes(double totalTaxes) {
        this.totalTaxes = totalTaxes;
    }

    public ArrayList<ItemContainer> getGoods() {
        return goods;
    }

    private void setGoods(ArrayList<ItemContainer> goods) {
        this.goods = goods;
    }

    public void insertGoodIntoBasket(ItemContainer good){
        goods.add(good);
        totalCost=totalCost + good.getQuantity()  *good.getItem().getFinalCost();
        totalTaxes=totalTaxes + good.getQuantity()*good.getItem().getTotalTaxes();
    }

    public void printBasket(){
        System.out.println("\nInput " + name + ":\r");
        DecimalFormatSymbols formatSymbols= new DecimalFormatSymbols(Locale.ITALY);
        formatSymbols.setDecimalSeparator('.');
        formatSymbols.setGroupingSeparator(',');
        DecimalFormat myFormatter = new DecimalFormat("####0.00",formatSymbols);
        for(ItemContainer item : goods){
            System.out.format(item.getQuantity() + " " + item.getItem().getDescription() + " at "+myFormatter.format(item.getItem().getRawCost())+"\n" );
        }

    }

    public void printBasketInvoice(){
        System.out.println("\nOutput "+ name+":\r");
        DecimalFormat myFormatter = getFormatter();
        for(ItemContainer item : goods) {
            System.out.println(item.getQuantity() + " " + item.getItem().getDescription() + ": " +myFormatter.format(item.getItem().getFinalCost()) + "\r");
        }
        System.out.println("Sales Taxes: " + myFormatter.format(totalTaxes) + "\r");
        System.out.println("Total: "+myFormatter.format(totalCost)+"\r");

    }

    private DecimalFormat getFormatter(){
        DecimalFormatSymbols formatSymbols= new DecimalFormatSymbols(Locale.ITALY);
        formatSymbols.setDecimalSeparator('.');
        formatSymbols.setGroupingSeparator(',');
        DecimalFormat myFormatter = new DecimalFormat("####0.00",formatSymbols);
        return  myFormatter;
    }

}
