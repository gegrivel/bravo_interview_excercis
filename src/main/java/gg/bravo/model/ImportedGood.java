package gg.bravo.model;

import gg.bravo.enums.EnumItemCategory;



/**
 * Created by grivelg on 07/08/2015.
 */
public class ImportedGood extends Item{
    double importedGoodTaxRate;

    public ImportedGood(String description, EnumItemCategory category,double rawCost){
        super(description,category,rawCost);
        importedGoodTaxRate=0.05;
    }

    public double getBaseTaxRate() {
        return baseTaxRate;
    }

    public double getImportedGoodTaxRate() {
        return importedGoodTaxRate;
    }

    @Override
    public double getFinalCost() {
        finalCost = round05(rawCost * baseTaxRate) + round05(rawCost * importedGoodTaxRate) + rawCost;
        return finalCost;
    }

    @Override
    public double getTotalTaxes(){
        totalTaxes =round05(rawCost * baseTaxRate) + round05(importedGoodTaxRate * rawCost);
        return  totalTaxes;
    }


}
