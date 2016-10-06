/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package love.calculator;

/**
 *
 * @author omit
 */
public class LoveCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ch1 = "omit";
        String ch2 = "jimikm";
                 
        int count = 0;
        
        for(int i=0;i<ch1.length();i++)
            for(int j = 0;j<ch2.length();j++){
              
            if(ch1.charAt(i)==ch2.charAt(j)&&ch1.charAt(i)!='0'&&ch2.charAt(j)!='0'){
                
                
                ch1.replace(ch1.charAt(i), '0');
                ch2.replace(ch2.charAt(j), '0');
                count++;
            
            } 
        }
        double calculation = (double)count*100/ch2.length()>100?100:(double)count*100/ch2.length();
        System.out.println("you love "+calculation+"%");
    }
    
}
