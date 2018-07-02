package core.model;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Yurii on 30.06.2018.
 */
public class Model {




    private int randomNumber = 0;
    private ArrayList<String> tryList = new ArrayList<String>();
    private Date dateNow = new Date();
    private Answer answer;


    public ArrayList getStatistic (){
        return tryList;
    }



    /*Generate int random number from "a" to "b"*/
    public void getRandomResult  (int fromInt, int toInt){
        randomNumber = ThreadLocalRandom.current().nextInt(fromInt, toInt);
    }


    /*Check the number*/
    public Answer checkNumber (int number){

        SimpleDateFormat formatForDateNow = new SimpleDateFormat("hh:mm:ss");

        if (number < randomNumber){
            System.out.println(answer = Answer.LESS);
        }else if (number>randomNumber){
            System.out.println(answer = Answer.MORE);
        }else if (number == randomNumber){
            System.out.println(answer = Answer.YES);
        }

        tryList.add(number + " " +  answer + " " + formatForDateNow.format(dateNow));
        return answer;
    }
}
