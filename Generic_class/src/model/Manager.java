/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Praktikan
 */
public class Manager extends Pekerja implements IHitungGaji
{
    //berupa Bidang dan JumlahBawahan
    private String bidang;
    private int  jumlah_bawahan;
    
    
    
    public Manager(){}
    public Manager(String Nama,int Usia,String bonus_manager,String bidang,int jumlah_bawahan)
    {
        super(Nama,Usia,bonus_manager);
        this.bidang=bidang;
        this.jumlah_bawahan=jumlah_bawahan;
      
    }

    /**
     * @return the bidang
     */
    public String getBidang()
    {
        return bidang;
    }

    /**
     * @param bidang the bidang to set
     */
    public void setBidang(String bidang)
    {
        this.bidang = bidang;
    }

    /**
     * @return the jumlah_bawahan
     */
    public int getJumlah_bawahan()
    {
        return jumlah_bawahan;
    }

    /**
     * @param jumlah_bawahan the jumlah_bawahan to set
     */
    public void setJumlah_bawahan(int jumlah_bawahan)
    {
        this.jumlah_bawahan = jumlah_bawahan;
    }
    
    public double  getHitungGaji()
    {
        if(bidang.equalsIgnoreCase("IT"))
        {
            return 3000000 + 100000*jumlah_bawahan;
        }else if(bidang.equalsIgnoreCase("akutansi"))
        {
            return 2500000 + 50000*jumlah_bawahan;
        }
        else if(bidang.equalsIgnoreCase("pemasaran"))
        {
            return 3000000 + 150000 *jumlah_bawahan;
        }else
            
        return 0;
    }
    
    public String bonus_tahunan()
    {
        
       if(bidang.equalsIgnoreCase("IT"))
        {
            
//            return(super.b_tahunan="");
            return("");
        }else if(bidang.equalsIgnoreCase("akutansi"))
        {
       //     return(super.b_tahunan="");
            return("");
        }
        else if(bidang.equalsIgnoreCase("pemasaran"))
        {
        //    return(super.b_tahunan="");
            return("");
        }else
            
        return("");
    }
    
    public String Print(){
        return( "\n\n nama : " +super.getNama()
                + "\nbonus: " +super.getB_tahunan()
                + "\nusia  " +super.getUsia()
                + "\n bidang: " +getBidang()
                + "\njumlah bawahan: " +getJumlah_bawahan()
                + "\ngaji: " +getHitungGaji());
    }
}
