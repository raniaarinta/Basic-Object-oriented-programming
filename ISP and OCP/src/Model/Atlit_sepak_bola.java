/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Praktikan
 */
public class Atlit_sepak_bola implements IHitungBiayaPelatihan,IHitungBonus
{
    private String nama,alamat,tingkat_pertandingan,posisi;
    private int umur;
    private double hadiah;
    private double gaji_pokok,jumlah_kemenangan;
    
    public Atlit_sepak_bola(String nama,String alamat,String tingkat_pertandingan,String posisi, int umur,double gaji_pokok,double jumlah_kemenangan,double hadiah)
    {
        this.nama=nama;
        this.alamat=alamat;
        this.tingkat_pertandingan=tingkat_pertandingan;
        this.hadiah=hadiah;
        this.posisi=posisi;
        this.umur=umur;
        this.gaji_pokok=gaji_pokok;
        this.jumlah_kemenangan=jumlah_kemenangan;
    }

    /**
     * @return the nama
     */
    public String getNama()
    {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }

    /**
     * @return the alamat
     */
    public String getAlamat()
    {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat)
    {
        this.alamat = alamat;
    }

    /**
     * @return the tingkat_pertandingan
     */
    public String getTingkat_pertandingan()
    {
        return tingkat_pertandingan;
    }

    /**
     * @param tingkat_pertandingan the tingkat_pertandingan to set
     */
    public void setTingkat_pertandingan(String tingkat_pertandingan)
    {
        this.tingkat_pertandingan = tingkat_pertandingan;
    }

    /**
     * @return the hadiah
     */
    

    /**
     * @return the posisi
     */
    public String getPosisi()
    {
        return posisi;
    }

    /**
     * @param posisi the posisi to set
     */
    public void setPosisi(String posisi)
    {
        this.posisi = posisi;
    }

    /**
     * @return the umur
     */
    public int getUmur()
    {
        return umur;
    }

    /**
     * @param umur the umur to set
     */
    public void setUmur(int umur)
    {
        this.umur = umur;
    }

    /**
     * @return the gaji_pokok
     */
    public double getGaji_pokok()
    {
        return gaji_pokok;
    }

    /**
     * @param gaji_pokok the gaji_pokok to set
     */
    public void setGaji_pokok(double gaji_pokok)
    {
        this.gaji_pokok = gaji_pokok;
    }

    /**
     * @return the jumlah_kemenangan
     */
    public double getJumlah_kemenangan()
    {
        return jumlah_kemenangan;
    }

    /**
     * @param jumlah_kemenangan the jumlah_kemenangan to set
     */
    public void setJumlah_kemenangan(double jumlah_kemenangan)
    {
        this.jumlah_kemenangan = jumlah_kemenangan;
    }
    
    
    public double getBonus()
     {
         if(posisi.equalsIgnoreCase("penyerang"))
         {
             return jumlah_kemenangan*40000;
             
         }
         else if(posisi.equalsIgnoreCase("gelandang"))
         {
             return jumlah_kemenangan*30000;
         }
         else if(posisi.equalsIgnoreCase("kiper"))
         {
             return jumlah_kemenangan*30000;
         }
         else
         return 0;
     }

    /**
     * @return the hadiah
     */
   

    /**
     * @param hadiah the hadiah to set
     */
    public void setHadiah(double hadiah)
    {
        this.hadiah = hadiah;
    }
     public double getHadiah()
    {
        return hadiah;
    }
     public double getbiayapelatihan()
     {
         if(tingkat_pertandingan.equalsIgnoreCase("internasional"))
         {
             return(gaji_pokok-(gaji_pokok*0.10));
         }
         else if(tingkat_pertandingan.equalsIgnoreCase("nasional"))
         {
             return(gaji_pokok-(gaji_pokok*0.8));
         }
         else if(tingkat_pertandingan.equalsIgnoreCase("provinsi"))
         {
             return(gaji_pokok-(gaji_pokok*0.5));
         }
         else
         return 0;
     }
     
     public double gettotalgaji()
    {
        
        return((gaji_pokok +getBonus())+(hadiah-(hadiah *0.1)));
    }
     public String Print(){
         return( "\n\n nama : " +getNama()
                + "\nAlamat: " +getAlamat()
                + "\nTingkat pertandingan:  " +getTingkat_pertandingan()
                + "\n jenis permainan: " +getPosisi()
                + "\nusia: " +getUmur()
            + "\nbaiaya pelatihan: \n\n" +getbiayapelatihan()
                  + "\ntotal gaji: \n\n" +gettotalgaji()
                  + "\ngaji pokok: \n\n" +getGaji_pokok()
                  + "\nJumlah hadiah: \n\n" +getHadiah()
                 + "\nJumlah hadiah: \n\n" +getBonus()
                 + "\nJumlah hadiah: \n\n" +getJumlah_kemenangan());
    }
    
}
