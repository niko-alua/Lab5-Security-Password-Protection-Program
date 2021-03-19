package kz.lab5.passwordprotection.model;

public class Picture {
    private String pictureUrl;

    public Picture() {
    }

    public Picture(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }
}
