/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dollarformat;

/**
 *
 * @author Omar Acosta <omardil@itesm.mx>
 */
public class DollarFormat {


      public static void main(String[] args) {
        
        writeln(100.00);
        writeln(10.00);
        writeln(1.00);
        writeln(0.10);
        writeln(0.01);
        writeln(0.001);
        writeln(0.00);
        writeln(12.78);
        
        writeln(-100.00);
        writeln(-10.00);
        writeln(-1.00);
        writeln(-0.10);
        writeln(-0.01);
        writeln(-0.001);
        writeln(-0.00);
        writeln(-12.78);        

        
        
    }
    
    
    public static void write(double amount) {
        
        if (amount < 0) {
            System.out.print("-");
        }
        
        double amountPositive = Math.abs(amount);
        writePositive(amountPositive);
        
    }
    
    public static void writePositive(double amount) {
        
        System.out.print("$");
        
        int allCents = (int)(Math.round( amount * 100 ));
        int dollars  = allCents / 100;
        System.out.print(dollars);
        System.out.print(".");        
        int cents    = allCents % 100;
        
        if (cents < 10) {
            System.out.print(0);
        }
        
        System.out.print(cents);
        
    }
    
    
    public static void writeln(double amount) {
        
        write(amount);
        System.out.println();
    }
    
    
}
