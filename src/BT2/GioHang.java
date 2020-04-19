/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class GioHang {
   
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> ds = new ArrayList<>();
    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }
     public double thanhToan(){
        int tt = 0;
       for(int i=0;i<ds.size();i++){
            tt += ds.get(i).getGia();
        }
        return hinhThucTT.thanhToan(tt);
    }
     public void themHang(HangHoa hh){
         ds.add(hh);
     }
    public void inDS(){
        ds.forEach(hh -> System.out.println(hh.HienThi()));
    }

  
}
