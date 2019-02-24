package demo.com;

public class Drill {

    private String title;
    private String info;
    private int imageSourceId;

    String getTitle() {
        return title;
    }

    String getInfo() {
        return info;
    }

    int getImageSourceId() {
        return imageSourceId;
    }

    Drill(String title, String info, int imageSourceId) {
        this.title = title;
        this.info = info;
        this.imageSourceId = imageSourceId;
    }

    @Override
    public String toString() {
        return title;
    }
}
