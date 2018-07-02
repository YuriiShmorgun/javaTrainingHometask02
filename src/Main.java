
import core.model.Model;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Yurii on 30.06.2018.
 */
public class Main {

    public static void main(String[] args) {


        Model model = new Model();
        model.getRandomResult(0,10);
        model.checkNumber();



    }
}
