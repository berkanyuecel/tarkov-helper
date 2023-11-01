package byuecel.labor.tarkovhelper.model.trader;

import byuecel.labor.tarkovhelper.model.enums.CurrencyType;
import byuecel.labor.tarkovhelper.model.item.ContainedItem;

public class CashOffer {
    private int id;
    private ContainedItem item;
    private int minTraderLevel;
    private int price;
    private int priceInRUB;
    private CurrencyType currency;
    private Task taskUnlock;

    public CashOffer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ContainedItem getItem() {
        return item;
    }

    public void setItem(ContainedItem item) {
        this.item = item;
    }

    public int getMinTraderLevel() {
        return minTraderLevel;
    }

    public void setMinTraderLevel(int minTraderLevel) {
        this.minTraderLevel = minTraderLevel;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPriceInRUB() {
        return priceInRUB;
    }

    public void setPriceInRUB(int priceInRUB) {
        this.priceInRUB = priceInRUB;
    }

    public CurrencyType getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyType currency) {
        this.currency = currency;
    }

    public Task getTaskUnlock() {
        return taskUnlock;
    }

    public void setTaskUnlock(Task taskUnlock) {
        this.taskUnlock = taskUnlock;
    }
}
