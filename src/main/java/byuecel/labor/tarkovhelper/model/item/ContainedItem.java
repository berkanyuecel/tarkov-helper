package byuecel.labor.tarkovhelper.model.item;

public class ContainedItem {
    private Item item;
    private int quantity;

    public ContainedItem() {
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
