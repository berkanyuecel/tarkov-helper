package byuecel.labor.tarkovhelper.model.hideout;

import byuecel.labor.tarkovhelper.model.item.ContainedItem;
import byuecel.labor.tarkovhelper.model.trader.Trader;

public class StationLevel {
    private int id;
    private int level;
    private float constructionTime;
    private String description;
    private ContainedItem[] requiredItems;
    private StationLevelRequirement stationLevelRequirement;
    private Skill[] skillRequirements;
    private Trader[] traderRequirements;
    private Craft[] crafts;
    private StationBonus[] bonuses;

    public StationLevel() {
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

    public float getConstructionTime() {
        return constructionTime;
    }

    public void setConstructionTime(float constructionTime) {
        this.constructionTime = constructionTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ContainedItem[] getRequiredItems() {
        return requiredItems;
    }

    public void setRequiredItems(ContainedItem[] requiredItems) {
        this.requiredItems = requiredItems;
    }

    public StationLevelRequirement getStationLevelRequirement() {
        return stationLevelRequirement;
    }

    public void setStationLevelRequirement(StationLevelRequirement stationLevelRequirement) {
        this.stationLevelRequirement = stationLevelRequirement;
    }

    public Skill[] getSkillRequirements() {
        return skillRequirements;
    }

    public void setSkillRequirements(Skill[] skillRequirements) {
        this.skillRequirements = skillRequirements;
    }

    public Trader[] getTraderRequirements() {
        return traderRequirements;
    }

    public void setTraderRequirements(Trader[] traderRequirements) {
        this.traderRequirements = traderRequirements;
    }

    public Craft[] getCrafts() {
        return crafts;
    }

    public void setCrafts(Craft[] crafts) {
        this.crafts = crafts;
    }

    public StationBonus[] getBonuses() {
        return bonuses;
    }

    public void setBonuses(StationBonus[] bonuses) {
        this.bonuses = bonuses;
    }
}
