package gg.bravo.model;

import gg.bravo.enums.EnumExemptedCategory;
import gg.bravo.enums.EnumItemCategory;



/**
 * Created by grivelg on 07/08/2015.
 */
public class Good extends Item {

    public Good(String description, EnumItemCategory category,double rawCost){
        super(description,category,rawCost);
    }

    @Override
    public double getBaseTaxRate() {
        return baseTaxRate;
    }

    public double getFinalCost() {
        return finalCost = round05(rawCost*baseTaxRate)+rawCost;
    }

    @Override
    public double getTotalTaxes(){
        totalTaxes =round05(rawCost * baseTaxRate);
        return  totalTaxes;
    }
}
