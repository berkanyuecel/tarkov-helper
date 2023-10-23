package byuecel.labor.tarkovhelper.model.trader;

import byuecel.labor.tarkovhelper.model.item.ContainedItem;

public class Barter {
    private int id;
    private Trader trader;
    private int level;
    private Task taskUnlock;
    private ContainedItem[] requiredItems;
    private ContainedItem[] rewardItems;

    public Barter() {
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Task getTaskUnlock() {
        return taskUnlock;
    }

    public void setTaskUnlock(Task taskUnlock) {
        this.taskUnlock = taskUnlock;
    }

    public Item[] getRequiredItems() {
        return requiredItems;
    }

    public void setRequiredItems(Item[] requiredItems) {
        this.requiredItems = requiredItems;
    }

    public Item[] getRewardItems() {
        return rewardItems;
    }

    public void setRewardItems(Item[] rewardItems) {
        this.rewardItems = rewardItems;
    }
}
