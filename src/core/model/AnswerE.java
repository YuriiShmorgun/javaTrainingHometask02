/* @Task2.java   v2   03.07.18
 *
 * Copyright (c) Open source project
 *
 * This software use for home task2 and learn book clear code
 * You can use any material for your oven project
 * You haven`t change the code if you are not a trainer
 */


package core.model;

/*
 * This is the ENUM class for keeping messages
 *
 * @version     2     03.07.2018
 * @author      Yurii Shmorgun
 */
public enum AnswerE {

    /*This ENUM contain all message for program*/
    GOOD_DAY ("\t Good day, today we will play with me.\n" +
            "I made an int number from '0' to '100' and you will try to answer. \n" +
            "Please enter only int variabels \n" +
            "So we are start:"),
    NOT_INT ("Sorry but it isn`t int. Please try again \n"),
    LESS ("Less"),
    MORE ("More"),
    YES ("Yes. \n You was good. \n Your statistic: \n");

    /*Create String field for message*/
    private String message;

    /*Constructor*/
    AnswerE (String message){
    this.message = message;
    }

    /*Method for return String variable (message)*/
    public String getMessage(){
        return message;
    }
}


