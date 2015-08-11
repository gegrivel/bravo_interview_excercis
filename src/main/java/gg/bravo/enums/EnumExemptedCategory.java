package gg.bravo.enums;

import gg.bravo.constants.CategoryNameConstants;

/**
 * Created by grivelg on 07/08/2015.
 */
public enum EnumExemptedCategory {

FOOD(CategoryNameConstants.FOOD),MED_PRD(CategoryNameConstants.MED_PRD),BOOK(CategoryNameConstants.BOOK);

    String categoryName;

    private EnumExemptedCategory(String categoryName) {
        this.categoryName = categoryName;

    }

    public String getCategoryName(){
        return categoryName;
    }
}
