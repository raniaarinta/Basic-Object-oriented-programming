/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ugd2_c_7976;
import java.io.BufferedReader;
import java.io.InputStreamReader; 

/**
 *
 * @author Praktikan
 */
public class UGD2_C_7976
{
    public static BufferedReader B = new BufferedReader(new InputStreamReader(System.in)); 
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int counter_dokter =0;
        int counter_pasien =0;
        Dokter datadokter[] = new Dokter[10];
        Pasien datapasien[] = new Pasien[10];
        int pilihan;
         try
        {
            do
            {
                //tampil data rumah sakit
                System.out.println("\n---===Rumah Sakit Sanjaya==---");
                System.out.println("             Menu");
                System.out.println("1. Tambah Dokter");
                System.out.println("2. Tambah Pasien");
                System.out.println("3. Tampil Dokter");
                System.out.println("4. Tampil Pasien");
                System.out.println("5. pasien selesai berobat");
                System.out.println("6. dokter berhenti bekerja.");
                System.out.println("0.Out");
                System.out.print("Masukkan Pilihan : ");pilihan=Integer.parseInt(B.readLine());

                
                if(pilihan==1)
                {
                    System.out.println("\n---===Rumah Sakit Sanjaya==---");
                    System.out.println("---===Tambah Dokter===---");
                    
                       
                        System.out.println("nama: ");String nama =B.readLine();
                        System.out.println("nik: ");String nik =B.readLine();
                        System.out.println("usia: ");int usia = Integer.parseInt(B.readLine());
                        System.out.println("jabatan: ");String jabatan=B.readLine();
                        System.out.println("status: ");String status=B.readLine();
                        datadokter[counter_dokter]=new Dokter(usia,nama,jabatan,status,nik);
                       counter_dokter++;
                  
                    
                }
                else if(pilihan==2)
                {
                    System.out.println("\n---===Rumah Sakit Sanjaya==---");
                    System.out.println("---===Tambah pasien===---");
                  
                       //nip,nama,penyakit,status,usia,id_dokter
                        System.out.println("nip: ");String nip=B.readLine();
                        System.out.println("nama: ");String nama=B.readLine();
                        System.out.println("penyakit: ");String penyakit=B.readLine();
                        System.out.println("status: ");String status=B.readLine();
                        System.out.println("usia: ");int usia = Integer.parseInt(B.readLine());
                        System.out.println("id dokter: ");String id=B.readLine();
                        datapasien[counter_pasien]=new Pasien(nip,id,usia,penyakit,status,nama);
                       counter_pasien++;
                   
                }
                else if(pilihan==3)
                {       
                    System.out.println("\n---===Rumah Sakit Sanjaya==---");
                    System.out.println("---===Data Dokter===---");
                    for(int i=0;i<counter_dokter;i++)
                    {
                        System.out.println("nik: " +datadokter[i].getNik());
                        System.out.println("nama: "+datadokter[i].getNama());
                        System.out.println("usia: " +datadokter[i].getUsia());
                        System.out.println("status: "+datadokter[i].getStatus());
                        
                        System.out.println("\n---===Data Pasien Yang Berobat===---");
                        for(int j=0;j<counter_pasien;j++)
                        {
                            if(datadokter[i].getNik().equalsIgnoreCase(datapasien[j].getId_dokter()))
                            {
                                System.out.println("nip: "+datapasien[j].getNip());
                                System.out.println("nama: "+datapasien[j].getNama());
                                System.out.println("penyakit: "+datapasien[j].getPenyakit());
                                System.out.println("status: "+datapasien[j].getStatus());
                                System.out.println("usia: "+datapasien[j].getUsia());
                            }
                        }
                    }
                    
                    
                }
                else if(pilihan==4)
                {
                    System.out.println("\n---===Rumah Sakit Sanjaya==---");
                    System.out.println("---===Data Pasien===---");
                    for(int i=0;i<counter_pasien;i++)
                    {
                        System.out.println("id doktor: "+datapasien[i].getId_dokter());
                        System.out.println("nip: "+datapasien[i].getNip());
                        System.out.println("nama: "+datapasien[i].getNama());
                        System.out.println("penyakit: "+datapasien[i].getPenyakit());
                        System.out.println("status: "+datapasien[i].getStatus());
                        System.out.println("usia: "+datapasien[i].getUsia());
                    }
                    
                }
                else if(pilihan==5)
                {
                    System.out.println("=====pasien selesai berobat====");
                    System.out.println("pasien nip yang selesai berobat: ");String nip=B.readLine();
                    for(int i=0;i<counter_pasien;i++)
                    {
                        if(datapasien[i].getNip().equalsIgnoreCase(nip));
                        datapasien[i]=new Pasien();
                        
                    }
                    
                }
                else if(pilihan==6)
                {
                    System.out.println("=====dokter berhenti bekerja====");
                    System.out.println("nik dokter berhenti bekerja: ");String nik=B.readLine();
                    for(int i=0;i<counter_dokter;i++)
                    {
                        if(datadokter[i].getNik().equalsIgnoreCase(nik));
                        datadokter[i]=new Dokter();
                        
                    }
                    
                }
            }while(pilihan!=0);
            
            System.out.println("\n---===Rumah Sakit Sanjaya==---");
            System.out.println("---===Bye Bye :D==---");
        }
        catch(Exception e){}
    }
}
