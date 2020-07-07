/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ugd5_c_7976;

/**
 *
 * @author Praktikan
 */
public class Mahasiswa
{
    private String nama;
    private String npm;
    private double ipk;
    
    public Mahasiswa(){}
    public Mahasiswa(String nama,String npm,double ipk)
    {
        this.nama=nama;
        this.npm=npm;
        this.ipk=ipk;
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
     * @return the npm
     */
    public String getNpm()
    {
        return npm;
    }

    /**
     * @param npm the npm to set
     */
    public void setNpm(String npm)
    {
        this.npm = npm;
    }

    /**
     * @return the ipk
     */
    public double getIpk()
    {
        return ipk;
    }

    /**
     * @param ipk the ipk to set
     */
    public void setIpk(double ipk)
    {
        this.ipk = ipk;
    }
    
    public void tampil_Mahasiswa()
    {
        System.out.println("nama: "+getNama());
        System.out.println("NPM: "+getNpm());
        System.out.println("IPK: "+getIpk());
    }
    
}
