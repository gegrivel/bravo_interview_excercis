package gg.bravo.enums;

/**
 * Created by grivelg on 07/08/2015.
 */
public enum EnumItemCategory {

    FOOD("food"),MED_PRD("medical product"),BOOK("book"),OTHER("other goods");

    String propertyName;

    private EnumItemCategory(String propertyName) {
        this.propertyName = propertyName;

    }

    public String getPropertyValue(){
        return propertyName;
    }

}
