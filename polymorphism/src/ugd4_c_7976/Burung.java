/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ugd4_c_7976;

/**
 *
 * @author Praktikan
 */
public class Burung extends Hewan
{
    //: kualitasKicauan (String) 
    private String kualitas_kicauan;
    public Burung(){}
    public Burung(String nama,String jenis,String jenis_kelamin,String warna,double biaya_makanan,double biaya_perwatan,int umur,String kualitas_kicauan)
    {
  
        super(nama,jenis,jenis_kelamin,warna,biaya_makanan,biaya_perwatan,umur);
        setKualitas_kicauan(kualitas_kicauan);
        
    }

    /**
     * @return the kualitas_kicauan
     */
    private String getKualitas_kicauan()
    {
        return kualitas_kicauan;
    }

    /**
     * @param kualitas_kicauan the kualitas_kicauan to set
     */
    private void setKualitas_kicauan(String kualitas_kicauan)
    {
        this.kualitas_kicauan = kualitas_kicauan;
    }
    
   
    public  double hitung_pengeluaran()
    {
       return(super.getBiaya_perwatan()+((super.getBiaya_makanan()*30)+15000));
    }
    public double MinHargaJual()
    {
        //if(warna.equalsIgnoreCase("biru"))
        if(kualitas_kicauan.equalsIgnoreCase("bagus"))
        {
            return(800000+(0.5*hitung_pengeluaran()*(getUmur()/30)));
        }
        else if(kualitas_kicauan.equalsIgnoreCase("standar"))
        {
            return(600000+(0.45*hitung_pengeluaran()*(getUmur()/30)));
        }
        else if(kualitas_kicauan.equalsIgnoreCase("kurang"))
        {
            return(300000+(0.4*hitung_pengeluaran()*(getUmur()/30)));
        }
        else
        {
            return 0;
        }
        
    }
   public void cetak_info()
    {
        System.out.println("====BURUNG====");
        System.out.println("nama: "+super.getNama());
        System.out.println("jenis: "+super.getJenis());
        System.out.println("jenis kelamin: "+super.getJenis_kelamin());
        System.out.println("warna: "+super.getWarna());
        System.out.println("biaya makanan: "+super.getBiaya_makanan());
        System.out.println("biaya perawatan: "+super.getBiaya_perwatan());
        System.out.println("umur: "+super.getUmur());
        System.out.println("kualitas kicauan: "+getKualitas_kicauan());
         System.out.println("biaya perawatan: "+hitung_pengeluaran());
        System.out.println("jual min: "+MinHargaJual());
        
    }
    
    
}
