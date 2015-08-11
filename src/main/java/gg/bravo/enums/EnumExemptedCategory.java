package gg.bravo.enums;

import gg.bravo.constants.CategoryNameConstants;

/**
 * Created by grivelg on 07/08/2015.
 */
public enum EnumExemptedCategory {

FOOD(CategoryNameConstants.FOOD),MED_PRD(CategoryNameConstants.MED_PRD),BOOK(CategoryNameConstants.BOOK);

    String propertyName;

    private EnumExemptedCategory(String propertyName) {
        this.propertyName = propertyName;

    }

    public String getPropertyValue(){
        return propertyName;
    }
}
