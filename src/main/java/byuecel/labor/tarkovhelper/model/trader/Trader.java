package byuecel.labor.tarkovhelper.model.trader;

import byuecel.labor.tarkovhelper.model.enums.CurrencyType;

public class Trader extends Vendor{

    private String biography;
    private String resetTime;
    private CurrencyType currency;
    private TraderLevel levels;
    private Barter barters;
    private CashOffer[] cashOffers;

    public Trader() {
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getResetTime() {
        return resetTime;
    }

    public void setResetTime(String resetTime) {
        this.resetTime = resetTime;
    }

    public CurrencyType getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyType currency) {
        this.currency = currency;
    }

    public TraderLevel getLevels() {
        return levels;
    }

    public void setLevels(TraderLevel levels) {
        this.levels = levels;
    }

    public Barter getBarters() {
        return barters;
    }

    public void setBarters(Barter barters) {
        this.barters = barters;
    }

    public CashOffer[] getCashOffers() {
        return cashOffers;
    }

    public void setCashOffers(CashOffer[] cashOffers) {
        this.cashOffers = cashOffers;
    }
}
