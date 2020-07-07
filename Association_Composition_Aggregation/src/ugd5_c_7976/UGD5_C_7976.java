/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ugd5_c_7976;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author Praktikan
 */
public class UGD5_C_7976
{
    public static BufferedReader B = new BufferedReader(new InputStreamReader(System.in));

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //int counter;
        Mahasiswa m[]=new Mahasiswa[3];
        Team t=new Team();
        
        
        // TODO code application logic here
         try
        {
           System.out.println("nama team: ");String team =B.readLine();
            System.out.println("asal universitas: ");String universitas =B.readLine();
            System.out.println("jumlah makanan: ");int jumlah = Integer.parseInt(B.readLine());
            t=new Team(team, universitas, jumlah);
            for(int i=0;i<3;i++)
            {
                System.out.println("nama: ");String nama =B.readLine();
                System.out.println("IPK: ");double IPK= Double.parseDouble(B.readLine());
                System.out.println("Npm: ");String npm =B.readLine();
                m[i]=new Mahasiswa(nama, npm, IPK);
                t.insertMahasiswa(m[i]);
            }
                
             
     
                //t.insertMahasiswa(m[]);
                t.tampil();
             System.out.println("input cari mahasiswa");String nama2 =B.readLine();
             t.cari(nama2);
           
          
            
        }catch(Exception e){}
    }
}
