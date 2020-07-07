/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Praktikan
 */
public class Penerjemah extends Pegawai
{
    private String kategori;
    public Penerjemah(String nip,String nama,String tanggal,double gaji_pokok,String kategori)
    {
        super(nip,nama,tanggal,gaji_pokok);
        this.kategori=kategori;
    }

    /**
     * @return the kategori
     */
    public String getKategori()
    {
        return kategori;
    }

    /**
     * @param kategori the kategori to set
     */
    public void setKategori(String kategori)
    {
        this.kategori = kategori;
    }
     public double lama_kerja()
     {
         double hasil=2016;
         hasil=hasil-  Double.parseDouble(super.tanggal.substring(4,8));
         return hasil;
         
     }
    public double pendapatan()
    {
        if(kategori.equalsIgnoreCase("tetap"))
        {
            return (super.gaji_pokok +(0.10 * super.gaji_pokok) + (lama_kerja()/100) * super.gaji_pokok);
        }
        else if(kategori.equalsIgnoreCase("sementara"))
        {
            return (super.gaji_pokok +(0.5 * super.gaji_pokok) + (lama_kerja()/100) * super.gaji_pokok);
        }
        else
        return 0;
        
    }
    public String print()
    {
         // super(nip,nama,tanggal,gaji_pokok);
       // this.kategori=kategori;
        return "\n\n nip : " +super.getNip()
                + "\nnama: " +super.getNama()
                + "\ntanggal:  " +super.getTanggal()
                + "\n gaji pokok: " +super.getGaji_pokok()
                + "\nkategori: " +getKategori()
                + "\npendapatan: " +pendapatan();
    }
    
    
}
