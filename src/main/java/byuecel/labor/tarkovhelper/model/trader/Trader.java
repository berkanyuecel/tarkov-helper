package byuecel.labor.tarkovhelper.model.trader;

import byuecel.labor.tarkovhelper.model.enums.CurrencyType;

public class Trader {

    private int id;
    private String name;
    private String normalizedName;
    private String biography;
    private String resetTime;
    private CurrencyType currency;
    private TraderLevel levels;
    private Barter barters;
    private TraderCashOffer cashOffers;
}
