package byuecel.labor.tarkovhelper.model.hideout;

public class Station {
    private int id;
    private String name;
    private String normalizedName;
    private StationLevel[] levels;
    private Craft[] crafts;

    public Station() {
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

    public StationLevel[] getLevels() {
        return levels;
    }

    public void setLevels(StationLevel[] levels) {
        this.levels = levels;
    }

    public Craft[] getCrafts() {
        return crafts;
    }

    public void setCrafts(Craft[] crafts) {
        this.crafts = crafts;
    }
}
