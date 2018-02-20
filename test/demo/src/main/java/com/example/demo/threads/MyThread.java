/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.threads;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author michalnowak
 */
@Component
@Scope("prototype")
public class MyThread implements Runnable{
    
    
    @Override
    public void run(){
        while(true){
            try {
                Thread.sleep(12000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("WATEK " + this.toString());
        }
        
    }
    
    
}
