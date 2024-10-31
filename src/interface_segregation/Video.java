package interface_segregation;

import interface_segregation.interfaces.IAdsActions;
import interface_segregation.interfaces.IVideoActions;

public class Video extends VideoManager implements IVideoActions, IAdsActions {
    public Video(String title, int time, int likes, int views) {
        super(title, time, likes, views);
    }

    @Override
    public double getNumberOfHoursPlayed(){
        return (this.getTime() / 3600.0) * this.getViews();
    }

    @Override
    public void playRandomAd(){
        System.out.println("play an AD");
    }
}
