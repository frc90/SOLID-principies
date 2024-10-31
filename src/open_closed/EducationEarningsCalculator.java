package open_closed;

public class EducationEarningsCalculator implements IEarningsCalculator{
    public double calculateEarnings(Video video){
        return video.getLikes() * 0.013 + video.getViews() * 0.013;
    }
}
