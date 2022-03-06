package model;

import java.util.List;

public class ReleaseGroup {
    private String releaseGroups;
    private List<Release> releases;

    public ReleaseGroup(String releaseGroups, List<Release> releases) {
        this.releaseGroups = releaseGroups;
        this.releases = releases;
    }

    public String getReleaseGroups() {
        return releaseGroups;
    }

    public void setReleaseGroups(String releaseGroups) {
        this.releaseGroups = releaseGroups;
    }

    public List<Release> getReleases() {
        return releases;
    }

    public void setReleases(List<Release> releases) {
        this.releases = releases;
    }

    @Override
    public String toString() {
        return "ReleaseGroups{" +
                "releaseGroups='" + releaseGroups + '\'' +
                ", releases=" + releases +
                '}';
    }
}
