package byuecel.labor.tarkovhelper.model.hideout;

import byuecel.labor.tarkovhelper.model.enums.CompareType;

public class TraderRequirement {
    private int id;
    private Trader trader;
    private String requirementType;
    private CompareType compareMethod;
    private int value;

    public TraderRequirement() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Trader getTrader() {
        return trader;
    }

    public void setTrader(Trader trader) {
        this.trader = trader;
    }

    public String getRequirementType() {
        return requirementType;
    }

    public void setRequirementType(String requirementType) {
        this.requirementType = requirementType;
    }

    public CompareType getCompareMethod() {
        return compareMethod;
    }

    public void setCompareMethod(CompareType compareMethod) {
        this.compareMethod = compareMethod;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
