package model;

import java.util.List;

public class Root {
    public List<ReleaseGroup> releaseGroups;
    public List<Project> projects;

    public Root(List<ReleaseGroup> releaseGroups, List<Project> projects) {
        this.releaseGroups = releaseGroups;
        this.projects = projects;
    }

    public List<ReleaseGroup> getReleaseGroups() {
        return releaseGroups;
    }

    public void setReleaseGroups(List<ReleaseGroup> releaseGroups) {
        this.releaseGroups = releaseGroups;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Root{" +
                "releaseGroups=" + releaseGroups +
                ", projects=" + projects +
                '}';
    }
}
