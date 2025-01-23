package ProxyPattern;

import java.util.Map;

public class YoutubeProxy {

    private Youtube youtube;
    private Map<String, String> cache;

    public YoutubeProxy(Youtube youtube) {
        this.youtube = youtube;
    }

    public void getVideoInfo(String id) {
        if (cache.containsKey(id)) {
            System.out.println("Getting video info from cache");
            System.out.println(cache.get(id));
        } else {
            youtube.getVideoInfo(id);
            cache.put(id, youtube.getVideoInfo(id));
        }
    }

    public void downloadVideo(String id) {
        if (cache.containsKey(id)) {
            System.out.println("Downloading video from cache");
        } else {
            youtube.downloadVideo(id);
            cache.put(id, youtube.downloadVideo(id));
        }
    }

    public void playVideo(String id) {
        if (cache.containsKey(id)) {
            System.out.println("Playing video from cache");
        } else {
            youtube.playVideo(id);
            cache.put(id, youtube.playVideo(id));
        }
    }
}
