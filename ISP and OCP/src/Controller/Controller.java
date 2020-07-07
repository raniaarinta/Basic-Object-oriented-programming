/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.*;

/**
 *
 * @author K46
 */
public class Controller {
    private int counter_bola=0;
    private int counter_tangkis=0;
    private list list;
    private  Atlit_sepak_bola sepakbola[]= new Atlit_sepak_bola[5];
    private  Atlit_bulu_tangkis bulu_tangkis[]= new Atlit_bulu_tangkis[5];
    private String nama,alamat,tingkat_pertandingan,posisi,jenis_permainan;
    private int umur;
    private double hadiah;
    private double gaji_pokok,jumlah_kemenangan;
    
    public void set_sepak_bola (String nama,String alamat,String tingkat_pertandingan,String posisi, int umur,double gaji_pokok,double jumlah_kemenangan,double hadiah)
    
    {
        list.list_A_bola.add(new Atlit_sepak_bola(nama, alamat, tingkat_pertandingan, posisi, umur, gaji_pokok, jumlah_kemenangan, hadiah));
  //     sepakbola[counter_bola]=new Atlit_sepak_bola(nama, alamat, tingkat_pertandingan, posisi, umur, gaji_pokok, jumlah_kemenangan, hadiah);
    //   counter_bola++;
    }
    public void set_bulu_tangkis (String nama,String alamat,String tingkat_pertandingan,double hadiah,String jenis_permainan, int umur,double gaji_pokok)
    {
        list.list_A_bulutangkis.add(new Atlit_bulu_tangkis(nama, alamat, tingkat_pertandingan, hadiah, jenis_permainan, umur, gaji_pokok));
      //  bulu_tangkis[counter_tangkis] = new Atlit_bulu_tangkis(nama, alamat, tingkat_pertandingan, hadiah, jenis_permainan, umur, gaji_pokok); 
       //counter_tangkis++;
    }
    
    public String getsepakbola()
    {
        String a="";
        for(int i=0;i<counter_bola;i++)
        {
             a=sepakbola[i].Print();
        }
       return a;
        
    }
     public String getbulutangkis()
    {
         String a="";
        for(int i=0;i<counter_tangkis;i++)
        {
             a=bulu_tangkis[i].Print();
        }
        return a;
    }
}
