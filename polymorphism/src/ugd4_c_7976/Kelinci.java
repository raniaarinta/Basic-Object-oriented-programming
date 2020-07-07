/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ugd4_c_7976;

/**
 *
 * @author Praktikan
 */
public class Kelinci extends Hewan
{
    private float berat;
    private String warna_mata;
    public Kelinci(){}
    public Kelinci(String nama,String jenis,String jenis_kelamin,String warna,double biaya_makanan,double biaya_perwatan,int umur,float berat,String warna_mata)
    {
        super(nama,jenis,jenis_kelamin,warna,biaya_makanan,biaya_perwatan,umur);
        setUmur(umur);
        setWarna_mata(warna_mata);
    }

    /**
     * @return the berat
     */
    private float getBerat()
    {
        return berat;
    }

    /**
     * @param berat the berat to set
     */
    private void setBerat(float berat)
    {
        this.berat = berat;
    }

    /**
     * @return the warna_mata
     */
    private String getWarna_mata()
    {
        return warna_mata;
    }

    /**
     * @param warna_mata the warna_mata to set
     */
    private void setWarna_mata(String warna_mata)
    {
        this.warna_mata = warna_mata;
    }
    public double hitung_pengeluaran()
    {
       //biayaPerawatan + biaya makanan * 30 + 30.000 
        return(super.getBiaya_perwatan()+((super.getBiaya_makanan()*30)+30000));
    }
    public double MinHargaJual()
    {
       if(warna.equalsIgnoreCase("biru"))
       {
           return(1000000+(0.7*hitung_pengeluaran()*(getUmur()/30)));
       }
       else if(warna.equalsIgnoreCase("merah"))
       {
           return(700000+(0.5*hitung_pengeluaran()*(getUmur()/30)));
       }
       else if(warna.equalsIgnoreCase("coklat"))
       {
           return(400000+(0.3*hitung_pengeluaran()*(getUmur()/30)));
       }
       else
       {
           return 0;
       }
        
    }
    
    public void cetak_info()
    {
        System.out.println("====KELINCI====");
        System.out.println("nama: "+super.getNama());
        System.out.println("jenis: "+super.getJenis());
        System.out.println("jenis kelamin: "+super.getJenis_kelamin());
        System.out.println("warna: "+super.getWarna());
        System.out.println("biaya makanan: "+super.getBiaya_makanan());
        System.out.println("biaya perawatan: "+super.getBiaya_perwatan());
        System.out.println("umur: "+super.getUmur());
        System.out.println("warna mata: "+getWarna_mata());
        System.out.println("berat: "+getBerat());
         System.out.println("biaya perawatan: "+hitung_pengeluaran());
        System.out.println("jual min: "+MinHargaJual());
        
    }
    
    
    
}
