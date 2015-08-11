package gg.bravo.model;

import gg.bravo.constants.TaxesRates;
import gg.bravo.enums.EnumItemCategory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by grivelg on 11/08/2015.
 */
public class ImportedGoodTest {

    private ImportedGood anExemptedGood;
    private ImportedGood aGood;
    private double cost=10.00;
    private String aGoodDesc="music CD";
    private String anExemptedGoodDesc = "a book";


    @BeforeClass
    public void init(){
        anExemptedGood = new ImportedGood(anExemptedGoodDesc, EnumItemCategory.BOOK,cost);
        aGood = new ImportedGood(aGoodDesc, EnumItemCategory.OTHER,cost);
    }

    @Test
    public void getBaseTaxRate(){
        double baseRate = anExemptedGood.getBaseTaxRate();
        assertEquals(TaxesRates.EXEMPTED_RATE,baseRate);
        baseRate = aGood.getBaseTaxRate();
        assertEquals(TaxesRates.BASE_RATE,baseRate);
    }

    @Test
    public void getImportedGoodTaxRate(){
        double importedGoodTaxRate = anExemptedGood.getImportedGoodTaxRate();
        assertEquals(TaxesRates.IMPORT_RATE,importedGoodTaxRate);
    }

    @Test
    public void getTotalTaxes(){
        double totalTaxes = anExemptedGood.getTotalTaxes();
        double expected = TaxesRates.EXEMPTED_RATE*cost+TaxesRates.IMPORT_RATE*cost;
        assertEquals(expected,totalTaxes);
        totalTaxes = aGood.getTotalTaxes();
        expected=TaxesRates.BASE_RATE*cost+TaxesRates.IMPORT_RATE*cost;
        assertEquals(expected,totalTaxes);
    }

    @Test
    public void getfinalCost(){
        double expected = cost*TaxesRates.EXEMPTED_RATE+cost*TaxesRates.IMPORT_RATE+cost;
        double totalCost = anExemptedGood.getFinalCost();
        assertEquals(expected,totalCost);
        expected = cost*TaxesRates.BASE_RATE+cost*TaxesRates.IMPORT_RATE+cost;
        totalCost =aGood.getFinalCost();
        assertEquals(expected,totalCost);

    }

    @Test
    public void getRawCost(){
        double goodCost = aGood.getRawCost();
        assertEquals(cost,goodCost);
    }

    @Test
    public void getCategory(){
        assertEquals(EnumItemCategory.OTHER, aGood.getCategory());
    }


    @Test
    public void getDescription(){
        assertEquals(aGoodDesc,aGood.getDescription());
    }
}

