package liskov_substitution;

public class Video extends VideoManager implements IPlayAd {
    public Video(String title, int time, int likes, int views) {
        super(title, time, likes, views);
    }

    @Override
    public double getNumberOfHoursPlayed() {
        return (this.getTime() / 3600.0) * this.getViews();
    }

    @Override
    public String playRandomAd() {
        return "play an AD";
    }
}
