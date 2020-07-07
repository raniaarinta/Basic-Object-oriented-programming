/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Praktikan
 */
public class Pegawai extends Pekerja implements IHitungGaji 
{
  private  String UnitKerja; 
    private  int JamKerja;
     
    
    public Pegawai(String Nama,int Usia,double bonus,String UnitKerja,int JamKerja)
    {
        
        super(Nama,Usia,bonus);
        this.UnitKerja=UnitKerja;
        this.JamKerja=JamKerja;
       
        
    }

    /**
     * @return the UnitKerja
     */
    public String getUnitKerja()
    {
        return UnitKerja;
    }

    /**
     * @param UnitKerja the UnitKerja to set
     */
    public void setUnitKerja(String UnitKerja)
    {
        this.UnitKerja = UnitKerja;
    }

    /**
     * @return the JamKerja
     */
    public int getJamKerja()
    {
        return JamKerja;
    }

    /**
     * @param JamKerja the JamKerja to set
     */
    public void setJamKerja(int JamKerja)
    {
        this.JamKerja = JamKerja;
    }
    public double getHitungGaji()
    {
        if(UnitKerja.equalsIgnoreCase("CS"))
        {
            return 10000 * JamKerja * 30;
        }else if(UnitKerja.equalsIgnoreCase("teknisi"))
        {
             return 12500 * JamKerja * 30;
        }
        else if(UnitKerja.equalsIgnoreCase("salesman"))
        {
             return 12000 * JamKerja * 30;
        }else
        return 0;
    }
    
    public double bonus_tahunan()
    {
        double temp =JamKerja*30*12;
        if(temp> 3500)
        {
         return 0;
            
        }
        else if(temp <= 3500)
        {
            return 0;
        }
        return 0;
    }
    public String Print(){
        return( "\n\n nama : " +super.getNama()
                + "\nbonus: " +super.getB_tahunan()
                + "\nusia:  " +super.getUsia()
                + "\n unit kerja: " +getUnitKerja()
                + "\njam kerja: " +getJamKerja()
                + "\nhitung gaji: " +getHitungGaji());
    }
}
