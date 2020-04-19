/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author Administrator
 */
public class Context{
     Tinh tinhtoan;

    public Context() {
    }
     
    public Context (Tinh tinhtoan) {
        this.tinhtoan = tinhtoan;
    }
    
    public float tinh(float a, float b){
        return tinhtoan.tinh(a, b);
    }
}
