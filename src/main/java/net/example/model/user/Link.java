package net.example.model.user;

/**
 * Created by xiu on 9/20/16.
 */
public class Link {

    private String linkedName;
    private String url;

    public Link() {
    }

    public Link(String linkedName, String url) {
        this.linkedName = linkedName;
        this.url = url;
    }

    public String getLinkedName() {
        return linkedName;
    }

    public void setLinkedName(String linkedName) {
        this.linkedName = linkedName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
