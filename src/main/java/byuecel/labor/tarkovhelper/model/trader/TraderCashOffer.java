package byuecel.labor.tarkovhelper.model.trader;

import byuecel.labor.tarkovhelper.model.enums.CurrencyType;

public class TraderCashOffer {
    private int id;
    private Item item;
    private int minTraderLevel;
    private int price;
    private int priceInRUB;
    private CurrencyType currency;
    private Task taskUnlock;
}
