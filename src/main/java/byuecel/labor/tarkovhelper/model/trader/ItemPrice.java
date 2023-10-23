package byuecel.labor.tarkovhelper.model.trader;

import byuecel.labor.tarkovhelper.model.enums.CurrencyType;

public class ItemPrice {
    private Vendor vendor;
    private int price;
    private int priceInRUB;
    private CurrencyType currency;

    public ItemPrice() {
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
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
}
