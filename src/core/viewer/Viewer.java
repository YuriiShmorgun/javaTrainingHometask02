/* @Task2.java   v2   03.07.18
 *
 * Copyright (c) Open source project
 *
 * This software use for home task2 and learn book clear code
 * You can use any material for your oven project
 * You haven`t change the code if you are not a trainer
 */


package core.viewer;

import core.model.AnswerE;

/*
 * This is the Viever class. Only class to shoe information for user
 *
 * @version     2     03.07.2018
 * @author      Yurii Shmorgun
 */
public class Viewer {

    /*Take enum variable from controller and print String from ENUM AnswerE*/
    public void printFromController (AnswerE aEnum){
        System.out.println(aEnum.getMessage());
    }
}
