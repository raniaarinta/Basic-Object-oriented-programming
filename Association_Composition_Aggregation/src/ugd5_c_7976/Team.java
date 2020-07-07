/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ugd5_c_7976;

/**
 *
 * @author Praktikan
 */
public class Team
{
    private String nama_team;
    private String universitas;
    private int jml_makanan;
    private Mahasiswa M[];
    private int counter;
    
    public Team(){}
    public Team(String nama_team,String universitas,int jml_makanan)
    {
        this.nama_team=nama_team;
        this.universitas=universitas;
        this.jml_makanan=jml_makanan;
        
        M= new Mahasiswa[3];
        counter=0;
        
    }

    /**
     * @return the nama_team
     */
    public String getNama_team()
    {
        return nama_team;
    }

    /**
     * @param nama_team the nama_team to set
     */
    public void setNama_team(String nama_team)
    {
        this.nama_team = nama_team;
    }

    /**
     * @return the universitas
     */
    public String getUniversitas()
    {
        return universitas;
    }

    /**
     * @param universitas the universitas to set
     */
    public void setUniversitas(String universitas)
    {
        this.universitas = universitas;
    }

    /**
     * @return the jml_makanan
     */
    public int getJml_makanan()
    {
        return jml_makanan;
    }

    /**
     * @param jml_makanan the jml_makanan to set
     */
    public void setJml_makanan(int jml_makanan)
    {
        this.jml_makanan = jml_makanan;
    }

    /**
     * @return the total_biaya
     */
   
    public double biaya()
    {
        if(jml_makanan==1)
        {
            return 50000;
        }
        else if(jml_makanan>1)
        {
            return(50000+((jml_makanan-1)*10000));
        }
        else
        {
            return 0;
        }
        
    }
    public void insertMahasiswa(Mahasiswa m)
    {
        M[counter]=m;
        counter++;
        
    }
    public void tampil()
    {
        System.out.println("nama team: "+getNama_team());
        System.out.println("asal universitas: "+getUniversitas());
        System.out.println("jumlah_makanan: "+getJml_makanan());
        System.out.println("total biaya: "+biaya());
        for(int i=0;i<counter;i++)
        {
            M[i].tampil_Mahasiswa();
        
        }
    }
    public void cari(String nama)
    {
        for(int i=0;i<counter;i++)
        {
            if(nama.equalsIgnoreCase(M[i].getNama()))
            {
                System.out.println("nama: "+M[i].getNama());
                System.out.println("IPK: "+M[i].getIpk());
                System.out.println("NPM: "+M[i].getNpm());
                
            }
        }
    }
}
