/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Praktikan
 */
public class Atlit_bulu_tangkis implements IHitungBiayaPelatihan
{
    private String nama,alamat,tingkat_pertandingan,jenis_permainan;
    private int umur;
    private double gaji_pokok;
   private double hadiah;
    
    public Atlit_bulu_tangkis(String nama,String alamat,String tingkat_pertandingan,double hadiah,String jenis_permainan, int umur,double gaji_pokok)
    {
        this.nama=nama;
        this.alamat=alamat;
        this.tingkat_pertandingan=tingkat_pertandingan;
        this.hadiah=hadiah;
        this.jenis_permainan=jenis_permainan;
        this.umur=umur;
        this.gaji_pokok=gaji_pokok;
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
     * @return the jenis_permainan
     */
    public String getJenis_permainan()
    {
        return jenis_permainan;
    }

    /**
     * @param jenis_permainan the jenis_permainan to set
     */
    public void setJenis_permainan(String jenis_permainan)
    {
        this.jenis_permainan = jenis_permainan;
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
     * @return the hadiah
     */
    public double getHadiah()
    {
        return hadiah;
    }

    /**
     * @param hadiah the hadiah to set
     */
    public void setHadiah(double hadiah)
    {
        this.hadiah = hadiah;
    }
    public double gettotalgaji()
     {
         if(jenis_permainan.equalsIgnoreCase("ganda"))
         {
             return((gaji_pokok - getbiayapelatihan())+(hadiah-(hadiah *0.1)));
         }
         else if(jenis_permainan.equalsIgnoreCase("single"))
         {
             return((gaji_pokok - getbiayapelatihan())+(hadiah-(hadiah *0.1)/2));
         }                 
         else
         return 0;
     }
    public double getbiayapelatihan()
     {
         if(tingkat_pertandingan.equalsIgnoreCase("internasional"))
         {
             return(gaji_pokok-(gaji_pokok*0.8));
         }
         else if(tingkat_pertandingan.equalsIgnoreCase("nasional"))
         {
             return(gaji_pokok-(gaji_pokok*0.6));
         }
         else if(tingkat_pertandingan.equalsIgnoreCase("provinsi"))
         {
             return(gaji_pokok-(gaji_pokok*0.4));
         }
         else
         return 0;
     }
     
    public String Print(){
         return( "\n\n nama : " +getNama()
                + "\nAlamat: " +getAlamat()
                + "\nTingkat pertandingan:  " +getTingkat_pertandingan()
                + "\n jenis permainan: " +getJenis_permainan()
                + "\nusia: " +getUmur()
            + "\nbaiaya pelatihan: \n\n" +getbiayapelatihan()
                  + "\ntotal gaji: \n\n" +gettotalgaji()
                  + "\ngaji pokok: \n\n" +getGaji_pokok()
                  + "\nJumlah hadiah: \n\n" +getHadiah());
    }
     
}
