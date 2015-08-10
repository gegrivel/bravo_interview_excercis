package gg.bravo.model;

/**
 * Created by grivelg on 10/08/2015.
 */
public class ItemContainer {
    int quantity;
    Item item;

    public ItemContainer(int quantity,Item item){
        this.quantity =quantity;
        this.item=item;

    }

    public int getQuantity() {
        return quantity;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    private void setItem(Item item) {
        this.item = item;
    }
}
