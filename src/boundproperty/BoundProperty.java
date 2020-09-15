/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundproperty;

import java.util.Scanner;


/**
 *
 * @author tasanajb
 */
public class BoundProperty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyPropertyBean mySource = new MyPropertyBean();
        Scanner input = new Scanner(System.in);
        Listener1 listener1 = new Listener1();
        Listener2 listener2 = new Listener2();
        mySource.addPropertyChangeListener(listener1);
        mySource.addPropertyChangeListener(listener2);
        while(true){
        System.out.print("Enter Score");
        String score = input.nextLine();
        if(score.equals("")){
            break;
        }
        mySource.setValue(score);
       }
    }
    
}
