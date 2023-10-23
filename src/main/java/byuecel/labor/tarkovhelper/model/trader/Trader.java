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

    public Trader() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNormalizedName() {
        return normalizedName;
    }

    public void setNormalizedName(String normalizedName) {
        this.normalizedName = normalizedName;
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

    public TraderCashOffer getCashOffers() {
        return cashOffers;
    }

    public void setCashOffers(TraderCashOffer cashOffers) {
        this.cashOffers = cashOffers;
    }
}
