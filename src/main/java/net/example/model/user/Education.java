package net.example.model.user;

/**
 * Created by xiu on 9/20/16.
 */
public class Education {
    private String colledgeName;
    private String major;

    public Education(String colledgeName, String major) {
        this.colledgeName = colledgeName;
        this.major = major;
    }

    public Education() {
    }

    public String getColledgeName() {
        return colledgeName;
    }

    public void setColledgeName(String colledgeName) {
        this.colledgeName = colledgeName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
