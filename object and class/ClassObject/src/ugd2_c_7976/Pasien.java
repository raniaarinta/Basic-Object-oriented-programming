/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ugd2_c_7976;

/**
 *
 * @author Praktikan
 */
public class Pasien
{
    private int usia;
    private   String id_dokter;
    private String penyakit,status,nama,nip;
    public Pasien() {}
    public Pasien(String nip,String id_dokter,int usia,String penyakit,String status, String nama) 
    {
        setNip(nama);
        setId_dokter(id_dokter);
        setUsia(usia);
        setPenyakit(penyakit);
        setStatus(status);
        setNama(nama);
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
     * @return the id_dokter
     */
    public String getId_dokter()
    {
        return id_dokter;
    }

    /**
     * @param id_dokter the id_dokter to set
     */
    public void setId_dokter(String id_dokter)
    {
        this.id_dokter = id_dokter;
    }

    /**
     * @return the usia
     */
    public int getUsia()
    {
        return usia;
    }

    /**
     * @param usia the usia to set
     */
    public void setUsia(int usia)
    {
        this.usia = usia;
    }

    /**
     * @return the penyakit
     */
    public String getPenyakit()
    {
        return penyakit;
    }

    /**
     * @param penyakit the penyakit to set
     */
    public void setPenyakit(String penyakit)
    {
        this.penyakit = penyakit;
    }

    /**
     * @return the status
     */
    public String getStatus()
    {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status)
    {
        this.status = status;
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
    
    
    
}
