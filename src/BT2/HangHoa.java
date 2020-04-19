/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

/**
 *
 * @author Administrator
 */
public class HangHoa extends GioHang {
    String tenHH;
    int gia;
    String moTa; 
    public HangHoa(String tenHH, int gia, String moTa) {
        this.tenHH = tenHH;
        this.gia = gia;
        this.moTa = moTa;
    }
    public String HienThi() {
        return this.tenHH + " " + this.gia + " " + this.moTa;
	}
   public int getGia(){
        return gia;
    }

    
}
