/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package splashScreenz;

import java.awt.Dimension;
import java.awt.Point;

/**
 *
 * @author user
 */

public class screen1 {
    public static void main(String[] args) {
        screen2 spl=new screen2();
        spl.setVisible(true);
        try{
            
            for(int i=0;i<=100;i++){
                Thread.sleep(15);
            screen2.jLabel1.setText("LOADING :"+i);
            screen2.jProgressBar1.setValue(i);
            if(i==100){
                spl.setVisible(false);
               // STARTING_MENU obj=new STARTING_MENU();
               //login_form obj=new login_form();
               // obj.setVisible(t
    String s[]=new String[4];
    s[0]=String.valueOf(375);
    s[1]=String.valueOf(114);
    s[2]=String.valueOf(600);
    s[3]=String.valueOf(500);
      login_form.main(s);
                //wellcome well=new wellcome();
                //well.setVisible(true);
            }
            }
        }
        catch(Exception e){}
        
    }
}
