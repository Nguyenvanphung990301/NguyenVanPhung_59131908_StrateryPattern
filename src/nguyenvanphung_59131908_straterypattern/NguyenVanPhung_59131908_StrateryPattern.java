/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenvanphung_59131908_straterypattern;
import BT1.Cong;
import BT1.Tru;
import BT1.Context;
import BT2.HangHoa;
import BT2.ThanhToanCOD;
import BT2.ThanhToanOnline;
import BT2.GioHang;





/**
 *
 * @author Administrator
 */
public class NguyenVanPhung_59131908_StrateryPattern {
    static void BT1(){
     Context ct1 = new Context(new Cong());
        System.out.println("75 + 12 = " + ct1.tinh(75, 12));
        Context ct2 = new Context(new Tru());
        System.out.println("54 - 78 = " + ct2.tinh(54, 78));
}
    static void BT2(){
        HangHoa h1 = new HangHoa("iPhone", 1200000, "San Pham Moi");
        ThanhToanOnline thanhToanOnline = new ThanhToanOnline();
        HangHoa h2 = new HangHoa("Samsung Galaxy", 3000000, "S50");
        ThanhToanCOD thanhToanCOD = new ThanhToanCOD();
        
        GioHang gh1 = new GioHang();
        gh1.setHinhThucTT(thanhToanOnline);
        gh1.themHang(h1);
        gh1.inDS();
        System.out.println("Thanh toan Online:"+gh1.thanhToan());
        
        GioHang gh2 = new GioHang();
        gh2.setHinhThucTT(thanhToanCOD);
        gh2.themHang(h2);
        gh2.inDS();
        System.out.println("Thanh toan COD:"+gh2.thanhToan());
        
                
                
                
        
    }
   
    
    
    /**
     * @param args the command line arguments
     */
     public static void main(String[] args){
       BT1();
       BT2();
    }
     
}
