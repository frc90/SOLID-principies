package open_closed;

public class GamingEarningsCalculator implements IEarningsCalculator{
    public double calculateEarnings(Video video){
        return video.getLikes() * 0.012 + video.getViews() * 0.012;
    }
}
