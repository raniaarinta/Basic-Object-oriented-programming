/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Praktikan
 */
public abstract class Pekerja <bonus> 
{
    protected  String Nama;  
    protected  int Usia;
    protected  bonus b_tahunan;
    
    
    public Pekerja(){}
    public Pekerja(String Nama,int Usia,bonus b_tahunan)
    {
        this.Nama=Nama;
        this.Usia=Usia;
        this.b_tahunan=b_tahunan;
        
    }

    /**
     * @return the Nama
     */
    public String getNama()
    {
        return Nama;
    }

    /**
     * @param Nama the Nama to set
     */
    public void setNama(String Nama)
    {
        this.Nama = Nama;
    }

    /**
     * @return the Usia
     */
    public int getUsia()
    {
        return Usia;
    }

    /**
     * @param Usia the Usia to set
     */
    public void setUsia(int Usia)
    {
        this.Usia = Usia;
    }

    /**
     * @return the b_tahunan
     */
    public bonus getB_tahunan()
    {
        return b_tahunan;
    }

    /**
     * @param b_tahunan the b_tahunan to set
     */
    public void setB_tahunan(bonus b_tahunan)
    {
        this.b_tahunan = b_tahunan;
    }
    
    public abstract String Print();
    
       // protected  String Nama;  
  //  protected  int Usia;
    //protected  bonus b_tahunan;
       
        
    
}
