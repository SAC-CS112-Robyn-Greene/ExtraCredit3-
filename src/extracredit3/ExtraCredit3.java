/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extracredit3;

/**
 *
 * @author Robyn
 */
public class ExtraCredit3 {

    /**
     * change variable so each statement resolves as true
     */ public static class Main {

        public Main() {
        }
    }
    public static void main(String[] args) {
      Main c = new Main() {
         
            public boolean equals(Object obj) {
                return true;
            }
        }; 
      Main d = c; 
      Main e = new Main() {          
            public boolean equals(Object obj) {
                return false;
            }
        };

      //String c = new String("5");
     //String d = new String ("6-1");
      //String sameC = c;
      boolean a1=c==d;//false,not the same object
      boolean a2= c.equals(d + "!");//true, logically equal
      boolean a3 = !e. equals(c);//true, sameC and c are same object
      if (a1 && a2 && a3){
          System.out.println("So this is successful?!");
      }//if
    }//main

   
    
}//class
