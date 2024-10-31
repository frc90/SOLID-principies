package interface_segregation;

import interface_segregation.interfaces.IVideoActions;

public class PremiumVideo extends VideoManager implements IVideoActions {
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

    @Override
    public double getNumberOfHoursPlayed(){
        return (this.getTime() / 3600.0) * this.getViews();
    }
}
