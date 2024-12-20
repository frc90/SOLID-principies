import liskov_substitution.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        liskov_substitution_principle_test();
    }

    public static void liskov_substitution_principle_test() {
        Video v1 = new Video("Liskov Substitution", 30, 500, 5822);
        Video v2 = new Video("Open / Closed", 25, 450, 3511);
        PremiumVideo pv1 = new PremiumVideo("Single Principle", 100, 1265, 16646, 1);

        List<IVideo> listOfVideo = new ArrayList<>();
        listOfVideo.add(v1);
        listOfVideo.add(v2);
        listOfVideo.add(pv1);

        for (IVideo video : listOfVideo) {
            System.out.println("Number of hours played: " + video.getNumberOfHoursPlayed());

            if (video instanceof IPlayAd) {
                System.out.println(((IPlayAd) video).playRandomAd());
            }
        }
    }
}