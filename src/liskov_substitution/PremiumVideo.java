package liskov_substitution;

public class PremiumVideo extends VideoManager{
    private int premiumId;

    public PremiumVideo(String title, int time, int likes, int views, int premiumId) {
        super(title, time, likes, views);
        this.premiumId = premiumId;
    }

    public int getPremiumId() {
        return premiumId;
    }

    public void setPremiumId(int premiumId) {
        this.premiumId = premiumId;
    }
}
