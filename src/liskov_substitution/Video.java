package liskov_substitution;

public class Video extends VideoManager {
    public Video(String title, int time, int likes, int views) {
        super(title, time, likes, views);
    }
}
