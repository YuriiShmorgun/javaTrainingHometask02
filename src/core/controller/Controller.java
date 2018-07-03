/* @Task2.java   v2   03.07.18
 *
 * Copyright (c) Open source project
 *
 * This software use for home task2 and learn book clear code
 * You can use any material for your oven project
 * You haven`t change the code if you are not a trainer
 */


package core.controller;

import core.model.AnswerE;
import core.model.Model;
import core.viewer.Viewer;
import java.util.Scanner;

/*
 * This is Controller. It used for:
 *      creating classes;
 *      check user`s entering information on validation (int / not int);
 *      only class to work with class Viewer and Model.
 *
 * @version     2     03.07.2018
 * @author      Yurii Shmorgun
 */
public class Controller {

    /*Create classes*/
    private Model model = new Model();
    private Viewer viewer = new Viewer();

    /*Create scanner*/
    Scanner scanner = new Scanner(System.in);

    /*Create and initialisation variables for working*/
    int userNumber = 0;
    private boolean checkBoolean = false;

    /*Method to start the program*/
    public void start(){

        /*Method used for creating random variable*/
        model.getRandomResult(0,100);

        /*Ask Viewer to show first message*/
        viewer.printFromController(AnswerE.GOOD_DAY);

        /*Start repeated methods*/
        processUser();
    }

    /**/
    public void processUser(){


while (! checkBoolean) {

    while (!scanner.hasNextInt()) {
        viewer.printFromController(AnswerE.NOT_INT); /*XXX */
        scanner.next();
    }
    userNumber = scanner.nextInt();

    checkBoolean = model.checkNumber(userNumber);

    System.out.println(userNumber);
}
        scanner.close();


for (int i =0; i < model.getStatistic().size(); i++) {
    System.out.println(model.getStatistic().get(i));
}
    }






    }







