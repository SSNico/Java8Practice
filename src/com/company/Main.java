package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
	// write your code here


        GreetingMessage greets = message -> System.out.println("output: " + message);
        MathOperation add = (a, b) -> a+b;

        Button button = new Button();


        MathOperation multimes = new MathOperation() {
            @Override
            public int opearation(int a, int b) {
                return a * b;
            }
        };

        int result = multimes.opearation(5,6);

        System.out.println(result);

        /**
         * Old way to do that.
         *
         * inline.
         */

        GreetingMessage goodByeOld = new GreetingMessage() {
            @Override
            public void sayMessage(String message) {
                System.out.println("good bye " + message);
            }
        };


        goodByeOld.sayMessage("inline Admin");


        /**
         * lambda function
         */
        GreetingMessage goodbye = message -> System.out.println("good bye" + message);

        goodbye.sayMessage("new Java 8 Admin");



    }



    interface MathOperation{
        int opearation(int a, int b);
    }

    interface GreetingMessage{
        void sayMessage(String message);
    }

}
