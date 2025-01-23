package ProxyPattern;

public class Youtube {

    public String getVideoInfo(String id) {
        System.out.println("Getting video info");
        return "Info";
    }

    public String downloadVideo(String id) {
        System.out.println("Downloading video");
        return "Downloaded Video";
    }

    public String playVideo(String id) {
        System.out.println("Playing video");
        return "Playing Video";
    }

}
