/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ugd2_c_7976;

/**
 *
 * @author Praktikan
 */
public class Dokter
{
    //nik,nama,usia,jabatan,status
    private int usia;
    private String nama,jabatan,status,nik;
    public Dokter(){}
    
    public Dokter(int usia,String nama,String jabatan,String status,String nik)
    {
        setUsia(usia);
        setNama(nama);
        setJabatan(jabatan);
        setStatus(status);
        setNik(nik);
        
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
     * @return the usia_dokter
     */
   

    /**
     * @return the jabatan
     */
    public String getJabatan()
    {
        return jabatan;
    }

    /**
     * @param jabatan the jabatan to set
     */
    public void setJabatan(String jabatan)
    {
        this.jabatan = jabatan;
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
     * @return the nik
     */
    public String getNik()
    {
        return nik;
    }

    /**
     * @param nik the nik to set
     */
    public void setNik(String nik)
    {
        this.nik = nik;
    }
    
    
    
            
    
}
