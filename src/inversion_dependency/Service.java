package inversion_dependency;

import open_closed.IEarningsCalculator;
import open_closed.Video;

public class Service {
    IEarningsCalculator calculator;

    public Service(IEarningsCalculator calculator){
        this.calculator = calculator;
    }

    public double calculateEarnings(Video video){
        return calculator.calculateEarnings(video);
    }
}
