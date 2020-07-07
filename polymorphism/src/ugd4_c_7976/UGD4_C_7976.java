/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ugd4_c_7976;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author Praktikan
 */
public class UGD4_C_7976
{ 
    public static BufferedReader B = new BufferedReader(new InputStreamReader(System.in));

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       int jumlah_kelinci=0;
       int jumlah_burung=0;
       Hewan data_k[]=new Kelinci[jumlah_kelinci];
       Hewan data_b[]=new Burung[jumlah_burung];
        try
        {
            
            System.out.print("jumlah kelinci : ");jumlah_kelinci= Integer.parseInt(B.readLine());
            System.out.print("jumlah burung : ");jumlah_burung= Integer.parseInt(B.readLine());
            for(int i=0;i<jumlah_kelinci;i++)
            {
                System.out.println("====KELINCI====");
                System.out.println("nama: ");String nama =B.readLine();
                System.out.println("jenis: ");String jenis =B.readLine();
                 String jenis_k;
                do
                {
                    System.out.println("jenis kelamin: ");jenis_k =B.readLine();
                    
                }while(jenis_k.equalsIgnoreCase("perempuan") || jenis_k.equalsIgnoreCase("laki"));
                System.out.println("warna: ");String warna =B.readLine();
                System.out.println("biaya makanan: ");double biaya_m= Double.parseDouble(B.readLine());
                System.out.println("biaya perawatan: ");double biaya_p= Double.parseDouble(B.readLine());
                System.out.println("umur: ");int umur= Integer.parseInt(B.readLine());
                String warna_mata;
                do
                {
                    System.out.println("warna mata: ");warna_mata =B.readLine();
                }while(warna_mata.equalsIgnoreCase("merah")|| warna_mata.equalsIgnoreCase("biru") || warna_mata.equalsIgnoreCase("coklat"));
                
                System.out.println("berat: ");int berat= Integer.parseInt(B.readLine());
                System.out.println("jual min: ");double jual_min= Double.parseDouble(B.readLine());
               
               // data_k[i]=new data_k(nama,jenis,jenis_k,warna,biaya_m,biaya_p,umur,berat,warna_mata);
                data_k[i].hitung_pengeluaran();
                data_k[i].MinHargaJual();
                data_k[i].cetak_info();
            }
             for(int i=0;i<jumlah_kelinci;i++)
            {
                System.out.println("====BURUNG====");
                System.out.println("nama: ");String nama =B.readLine();
                System.out.println("jenis: ");String jenis =B.readLine();
                String jenis_k;
                do
                {
                    System.out.println("jenis kelamin: ");jenis_k =B.readLine();
                    
                }while(jenis_k.equalsIgnoreCase("perempuan") || jenis_k.equalsIgnoreCase("laki"));
                
                System.out.println("warna: ");String warna =B.readLine();
                System.out.println("biaya makanan: ");double biaya_m= Double.parseDouble(B.readLine());
                System.out.println("biaya perawatan: ");double biaya_p= Double.parseDouble(B.readLine());
                System.out.println("umur: ");int umur= Integer.parseInt(B.readLine());
                String kualitas;
                do
                {
                    System.out.println("jenis kelamin: ");kualitas=B.readLine();
                    
                }while(kualitas.equalsIgnoreCase("kurang") || kualitas.equalsIgnoreCase("standart") ||kualitas.equalsIgnoreCase("bagus"));
                System.out.println("jual min: ");double jual_min= Double.parseDouble(B.readLine());
               
                //data_b[i]=new data_k(nama,jenis,jenis_k,warna,biaya_m,biaya_p,umur,kualitas);
                data_b[i].hitung_pengeluaran();
                data_b[i].MinHargaJual();
                data_b[i].cetak_info();
            }
            
            
        }catch(Exception e){}
    }
}

       
       
       
       
       
        

        // TODO code application logic here
    

