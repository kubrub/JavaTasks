package model;

public class ReportFile {
    public String fileLocation;
    public String startDateOffset;

    public ReportFile(String fileLocation, String startDateOffset) {
        this.fileLocation = fileLocation;
        this.startDateOffset = startDateOffset;
    }

    public String getFileLocation() {
        return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public String getStartDateOffset() {
        return startDateOffset;
    }

    public void setStartDateOffset(String startDateOffset) {
        this.startDateOffset = startDateOffset;
    }

    @Override
    public String toString() {
        return "ReportFiles{" +
                "fileLocation='" + fileLocation + '\'' +
                ", startDateOffset='" + startDateOffset + '\'' +
                '}';
    }
}
