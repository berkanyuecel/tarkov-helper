package byuecel.labor.tarkovhelper.model.trader;

public class TraderLevel {
    private int id;
    private int level;
    private int requiredPlayerLevel;
    private float requiredReputation;
    private int requiredCommerce;
    private float payRate;
    private float insuranceRate;
    private float repairCostMultiplier;
    private Barter barters;
    private CashOffer[] cashOffers;

    public TraderLevel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getRequiredPlayerLevel() {
        return requiredPlayerLevel;
    }

    public void setRequiredPlayerLevel(int requiredPlayerLevel) {
        this.requiredPlayerLevel = requiredPlayerLevel;
    }

    public float getRequiredReputation() {
        return requiredReputation;
    }

    public void setRequiredReputation(float requiredReputation) {
        this.requiredReputation = requiredReputation;
    }

    public int getRequiredCommerce() {
        return requiredCommerce;
    }

    public void setRequiredCommerce(int requiredCommerce) {
        this.requiredCommerce = requiredCommerce;
    }

    public float getPayRate() {
        return payRate;
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }

    public float getInsuranceRate() {
        return insuranceRate;
    }

    public void setInsuranceRate(float insuranceRate) {
        this.insuranceRate = insuranceRate;
    }

    public float getRepairCostMultiplier() {
        return repairCostMultiplier;
    }

    public void setRepairCostMultiplier(float repairCostMultiplier) {
        this.repairCostMultiplier = repairCostMultiplier;
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
