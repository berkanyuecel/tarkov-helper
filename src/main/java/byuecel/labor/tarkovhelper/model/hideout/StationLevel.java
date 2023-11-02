package byuecel.labor.tarkovhelper.model.hideout;

import byuecel.labor.tarkovhelper.model.item.ContainedItem;
import byuecel.labor.tarkovhelper.model.trader.TraderRequirement;

public class StationLevel {
    private int id;
    private int level;
    private float constructionTime;
    private String description;
    private ContainedItem[] requiredItems;
    private StationLevelRequirement stationLevelRequirement;
    private SkillRequirement[] skillRequirements;
    private TraderRequirement[] traderRequirements;
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

    public SkillRequirement[] getSkillRequirements() {
        return skillRequirements;
    }

    public void setSkillRequirements(SkillRequirement[] skillRequirements) {
        this.skillRequirements = skillRequirements;
    }

    public TraderRequirement[] getTraderRequirements() {
        return traderRequirements;
    }

    public void setTraderRequirements(TraderRequirement[] traderRequirements) {
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
