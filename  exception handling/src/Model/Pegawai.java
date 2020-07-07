/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Praktikan
 */
public abstract class Pegawai
{
   protected  String nip;
     protected  String nama;
     protected  String tanggal;
    protected  double  gaji_pokok;
   
   public Pegawai(String nip,String nama,String tanggal,double gaji_pokok)
   {
       this.nip=nip;
       this.nama=nama;
       this.tanggal=tanggal;
       this.gaji_pokok=gaji_pokok;
   }

    /**
     * @return the nip
     */
    public String getNip()
    {
        return nip;
    }

    /**
     * @param nip the nip to set
     */
    public void setNip(String nip)
    {
        this.nip = nip;
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
     * @return the tanggal
     */
    public String getTanggal()
    {
        return tanggal;
    }

    /**
     * @param tanggal the tanggal to set
     */
    public void setTanggal(String tanggal)
    {
        this.tanggal = tanggal;
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
    
    public abstract String print();
    
    
}
