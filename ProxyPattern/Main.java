package ProxyPattern;

public class Main {

    public static void main(String[] args) {
        YoutubeProxy youtubeProxy = new YoutubeProxy(new Youtube());

        youtubeProxy.getVideoInfo("123");
        youtubeProxy.downloadVideo("123");
        youtubeProxy.playVideo("123");
    }
}
