/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//ruhitrafian
package hospitalmanagement;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author cb3ss
 */
public class medicine {
    
    public int price;
    public int amount;
    public String name;
    public String info;
    private Component frame;
    protected static double profit=1.05;
    public medicine(int price, int amount, String name, String info){
        this.price = price;
        this.amount = amount;
        this.name = name;
        this.info = info;
        accounts.cash = accounts.cash-(price*amount);
    }
    public void sellmedicine(int soldAmount){
        double payCashier;
        if(amount<=soldAmount){
            buymedicine(soldAmount);
           amount-=soldAmount;
        }
        else{
        amount-=soldAmount;
        }
          payCashier = ((price*profit)*soldAmount);
          accounts.cash+=payCashier;
          
        JOptionPane.showMessageDialog(frame, "Sold, please pay TK: "+payCashier+" to the cashier");
    }
    public void buymedicine(int boughtAmount ){
        amount+=boughtAmount;
        accounts.cash = accounts.cash-(price*boughtAmount);
        JOptionPane.showMessageDialog(frame, "bought");
    }
    public static void EditProfit(double newProfit){
        profit = newProfit/100;
    }
    public int CheckInventory(){
        return amount;
    }
}