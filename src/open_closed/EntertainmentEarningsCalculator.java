package open_closed;

public class EntertainmentEarningsCalculator implements IEarningsCalculator{
    public double calculateEarnings(Video video){
        return video.getLikes() * 0.011 + video.getViews() * 0.011;
    }
}
