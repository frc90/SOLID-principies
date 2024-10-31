package open_closed;

// @Data
public class Video {
    private String title;
    private int time;
    private int likes;
    private int views;

    public Video(String title, int time, int likes, int views) {
        this.title = title;
        this.time = time;
        this.likes = likes;
        this.views = views;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public double getNumberOfHoursPlayed(){
        return (time / 3600.0) * views;
    }
}
