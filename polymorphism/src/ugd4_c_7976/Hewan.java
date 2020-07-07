/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ugd4_c_7976;

/**
 *
 * @author Praktikan
 */
public abstract class Hewan
{
    
    protected String nama,jenis,jenis_kelamin,warna;
    protected double biaya_makanan,biaya_perwatan;
    protected int umur;
    
    public Hewan(){}
    public Hewan(String nama,String jenis,String jenis_kelamin,String warna,double biaya_makanan,double biaya_perwatan,int umur)
    {
        this.nama=nama;
        this.jenis=jenis;
        this.jenis_kelamin=jenis_kelamin;
        this.warna=warna;
        this.biaya_makanan=biaya_makanan;
        this.biaya_perwatan=biaya_perwatan;
        this.umur=umur;
        
    }

    /**
     * @return the nama
     */
    protected String getNama()
    {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    protected void setNama(String nama)
    {
        this.nama = nama;
    }

    /**
     * @return the jenis
     */
    protected String getJenis()
    {
        return jenis;
    }

    /**
     * @param jenis the jenis to set
     */
    protected void setJenis(String jenis)
    {
        this.jenis = jenis;
    }

    /**
     * @return the jenis_kelamin
     */
    protected String getJenis_kelamin()
    {
        return jenis_kelamin;
    }

    /**
     * @param jenis_kelamin the jenis_kelamin to set
     */
    protected void setJenis_kelamin(String jenis_kelamin)
    {
        this.jenis_kelamin = jenis_kelamin;
    }

    /**
     * @return the warna
     */
    protected String getWarna()
    {
        return warna;
    }

    /**
     * @param warna the warna to set
     */
    protected void setWarna(String warna)
    {
        this.warna = warna;
    }

    /**
     * @return the biaya_makanan
     */
    protected double getBiaya_makanan()
    {
        return biaya_makanan;
    }

    /**
     * @param biaya_makanan the biaya_makanan to set
     */
    protected void setBiaya_makanan(double biaya_makanan)
    {
        this.biaya_makanan = biaya_makanan;
    }

    /**
     * @return the biaya_perwatan
     */
    protected double getBiaya_perwatan()
    {
        return biaya_perwatan;
    }

    /**
     * @param biaya_perwatan the biaya_perwatan to set
     */
    protected void setBiaya_perwatan(double biaya_perwatan)
    {
        this.biaya_perwatan = biaya_perwatan;
    }

    /**
     * @return the umur
     */
    protected int getUmur()
    {
        return umur;
    }

    /**
     * @param umur the umur to set
     */
    protected void setUmur(int umur)
    {
        this.umur = umur;
    }
    //CetakInfo(void), HitungPengeluaran(double)
    public abstract double hitung_pengeluaran();
    public abstract double MinHargaJual(); 
    public abstract void cetak_info();
    
}
