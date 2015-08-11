package gg.bravo.model;

import com.sun.org.apache.xalan.internal.xsltc.trax.TrAXFilter;
import gg.bravo.constants.TaxesRates;
import gg.bravo.enums.EnumExemptedCategory;
import gg.bravo.enums.EnumItemCategory;

import java.math.BigDecimal;
import java.math.RoundingMode;


/**
 * Created by grivelg on 07/08/2015.
 */
public abstract class Item {

    String description;
    EnumItemCategory category;
    double baseTaxRate;
    double rawCost;
    double finalCost;
    double totalTaxes;

    public Item(String description,EnumItemCategory category, double rawCost){
        baseTaxRate = TaxesRates.BASE_RATE;
        totalTaxes=0.00;
        this.description=description;
        this.category=category;
        this.rawCost = rawCost;
        for(EnumExemptedCategory item :EnumExemptedCategory.values()){
            if (item.getPropertyValue().equals(this.category.getPropertyValue()))
                baseTaxRate= TaxesRates.EXEMPTED_RATE;
        }
    }

    abstract double getBaseTaxRate();
    abstract double getFinalCost();
    abstract public double getTotalTaxes();

    public double getRawCost() {
        return rawCost;
    }

    private void setRawCost(double rawCost) {
        this.rawCost = rawCost;
    }

    public EnumItemCategory getCategory() {
        return category;
    }

    private void setCategory(EnumItemCategory category) {
        this.category = category;
    }

    private void setTotaleTaxes(double totaleTaxes) {
        this.totalTaxes = totaleTaxes;
    }

    public String getDescription() {
        return description;
    }

    protected static double round05(double num) {
        BigDecimal amount = new BigDecimal(num);
        // To round to the nearest .05, multiply by 20, round to the nearest integer, then divide by 20
        BigDecimal result =  new BigDecimal(Math.ceil(amount.doubleValue() * 20) / 20);
        result.setScale(2, RoundingMode.HALF_UP);
        return result.doubleValue();
    }
}
