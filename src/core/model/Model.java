package core.model;



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
    private AnswerE answerE;



    public ArrayList getStatistic (){
        return tryList;
    }



    /*Generate int random number from "a" to "b"*/
    public void getRandomResult  (int fromInt, int toInt){
        randomNumber = ThreadLocalRandom.current().nextInt(fromInt, toInt);

        System.out.println(randomNumber);
    }


    /*Check the number*/
    public Boolean checkNumber (int number){

        SimpleDateFormat formatForDateNow = new SimpleDateFormat("hh:mm:ss");

        boolean b = false;

        if (number < randomNumber){
            System.out.println(answerE = AnswerE.MORE);
            b = false;
        }else if (number>randomNumber){
            System.out.println(answerE = AnswerE.LESS);
            b = false;
        }else if (number == randomNumber){
            System.out.println(answerE = AnswerE.YES);
            b = true;
        }

        tryList.add(number + " " + answerE + " " + formatForDateNow.format(dateNow));
        return  b;
    }
}
