package model;

import java.util.List;

public class Epic {
    private String name;
    private String description;
    private int sSizes;
    private int startDateOffset;
    private List<String> releases;

    public Epic(String name, String description, int sSizes, int startDateOffset, List<String> releases) {
        this.name = name;
        this.description = description;
        this.sSizes = sSizes;
        this.startDateOffset = startDateOffset;
        this.releases = releases;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getsSizes() {
        return sSizes;
    }

    public void setsSizes(int sSizes) {
        this.sSizes = sSizes;
    }

    public int getStartDateOffset() {
        return startDateOffset;
    }

    public void setStartDateOffset(int startDateOffset) {
        this.startDateOffset = startDateOffset;
    }

    public List<String> getReleases() {
        return releases;
    }

    public void setReleases(List<String> releases) {
        this.releases = releases;
    }

    @Override
    public String toString() {
        return "Epic{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", sSizes=" + sSizes +
                ", startDateOffset=" + startDateOffset +
                ", releases=" + releases +
                '}';
    }
}
