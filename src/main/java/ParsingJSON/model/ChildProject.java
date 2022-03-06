package model;

import java.util.List;

public class ChildProject {
    private String name;
    private String releaseGroup;
    private List<ReportFile> reportFiles;
    private Object childProject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseGroup() {
        return releaseGroup;
    }

    public void setReleaseGroup(String releaseGroup) {
        this.releaseGroup = releaseGroup;
    }

    public List<ReportFile> getReportFiles() {
        return reportFiles;
    }

    public void setReportFiles(List<ReportFile> reportFiles) {
        this.reportFiles = reportFiles;
    }

    public Object getChildProject() {
        return childProject;
    }

    public void setChildProject(Object childProject) {
        this.childProject = childProject;
    }

    @Override
    public String toString() {
        return "ChildProject{" +
                "name='" + name + '\'' +
                ", releaseGroup='" + releaseGroup + '\'' +
                ", reportFiles=" + reportFiles +
                ", childProject=" + childProject +
                '}';
    }
}
