package FileSystem;

public class Main {

    public static void main(String[] args) {
        Directory documents = new Directory("Documents");

        documents.addFile(new File("resume.pdf"));

        Directory music = new Directory("Music");

        Directory movies = new Directory("Movies");

        music.addFile(new File("song1.mp3"));
        music.addFile(new File("song2.mp3"));

        movies.addFile(new File("movie1.mp4"));
        movies.addFile(new File("movie2.mp4"));

        documents.addFile(music);
        documents.addFile(movies);

        documents.ls();
    }
}
