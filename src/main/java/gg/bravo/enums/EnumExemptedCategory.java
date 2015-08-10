package gg.bravo.enums;

/**
 * Created by grivelg on 07/08/2015.
 */
public enum EnumExemptedCategory {

FOOD("food"),MED_PRD("medical product"),BOOK("book");

    String propertyName;

    private EnumExemptedCategory(String propertyName) {
        this.propertyName = propertyName;

    }

    public String getPropertyValue(){
        return propertyName;
    }
}
