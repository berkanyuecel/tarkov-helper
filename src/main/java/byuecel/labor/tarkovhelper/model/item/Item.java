package byuecel.labor.tarkovhelper.model.item;

import byuecel.labor.tarkovhelper.model.enums.ItemType;

public class Item {
    private int id;
    private String name;
    private String normalizedName;
    private String description;
    private in basePrice;
    private int width;
    private int heigth;
    private BackgroundColorType backgroundColor;
    private ItemType type;
    private float weigth;
    private Task[] usedInTasks;
    private Task[] receivedFromTasks;
    private Barter[] bartersFor;
    private Barter[] bartersUsing;
    private Craft[] craftsFor;
    private Craft[] craftsUsing;

    public Item() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public in getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(in basePrice) {
        this.basePrice = basePrice;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public BackgroundColorType getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(BackgroundColorType backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public float getWeigth() {
        return weigth;
    }

    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }

    public Task[] getUsedInTasks() {
        return usedInTasks;
    }

    public void setUsedInTasks(Task[] usedInTasks) {
        this.usedInTasks = usedInTasks;
    }

    public Task[] getReceivedFromTasks() {
        return receivedFromTasks;
    }

    public void setReceivedFromTasks(Task[] receivedFromTasks) {
        this.receivedFromTasks = receivedFromTasks;
    }

    public Barter[] getBartersFor() {
        return bartersFor;
    }

    public void setBartersFor(Barter[] bartersFor) {
        this.bartersFor = bartersFor;
    }

    public Barter[] getBartersUsing() {
        return bartersUsing;
    }

    public void setBartersUsing(Barter[] bartersUsing) {
        this.bartersUsing = bartersUsing;
    }

    public Craft[] getCraftsFor() {
        return craftsFor;
    }

    public void setCraftsFor(Craft[] craftsFor) {
        this.craftsFor = craftsFor;
    }

    public Craft[] getCraftsUsing() {
        return craftsUsing;
    }

    public void setCraftsUsing(Craft[] craftsUsing) {
        this.craftsUsing = craftsUsing;
    }


}