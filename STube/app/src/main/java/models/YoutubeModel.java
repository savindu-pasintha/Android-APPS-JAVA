package models;

public class YoutubeModel {
    String videoUrl;

    public YoutubeModel () {
    }

    public YoutubeModel (String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
