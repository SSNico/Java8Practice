package com.company;

import java.awt.event.ActionEvent;

public class ActionListenerImpl implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public String showMessage(String s) {
        return s;
    }

    @Override
    public void publicFuntion() {

    }

    public void implFuction(){
        System.out.println("this is implements");
    }

}
