/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Praktikan
 */
public class Pemandu extends Pegawai
{
    private String area;
    public Pemandu(String nip,String nama,String tanggal,double gaji_pokok,String area)
    {
        super(nip,nama,tanggal,gaji_pokok);
        this.area=area;
    }

    /**
     * @return the area
     */
    public String getArea()
    {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area)
    {
        this.area = area;
    }
    
     public double lama_kerja()
     {
         double hasil=2016;
         hasil=hasil-  Double.parseDouble(super.tanggal.substring(4,8));
         return hasil;
         
     }
    
    public double pendapatan()
    {
       
        if(area.equalsIgnoreCase("dalam negeri"))
        {
            return (super.gaji_pokok + ((lama_kerja()/100) *super.gaji_pokok) +50000);
            
        }
        if(area.equalsIgnoreCase("luar negeri"))
        {
            return (super.gaji_pokok + ((lama_kerja()/100) *super.gaji_pokok) +100000);
        }
        else
            return 0;
        
    }
    public String print()
    {
          return "\n\n nip : " +super.getNip()
                + "\nnama: " +super.getNama()
                + "\ntanggal:  " +super.getTanggal()
                + "\n gaji pokok: " +super.getGaji_pokok()
                + "\n Area: " +getArea()
                + "\npendapatan: " +pendapatan();
    }
    
}
