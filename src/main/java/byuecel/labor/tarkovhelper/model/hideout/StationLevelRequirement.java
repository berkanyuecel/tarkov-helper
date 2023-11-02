package byuecel.labor.tarkovhelper.model.hideout;

public class StationLevelRequirement {
    private int id;
    private Station station;
    private int level;

    public StationLevelRequirement() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
