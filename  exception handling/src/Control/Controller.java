/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import java.util.*;
import Model.*;
/**
 *
 * @author Praktikan
 */
public class Controller
{
    private Pemandu pemandu;
    private  Penerjemah penerjemah;
    List<Pemandu> listpemandu;
   List<Penerjemah> listpenerjemah;
   int counter=0;
   
   public Controller() {
        listpemandu =  new ArrayList<Pemandu>();
        listpenerjemah = new ArrayList<Penerjemah>();
    }
   public void add_pemandu(Pemandu _p)
   {
       listpemandu.add(pemandu);
   }
   public void add_penerjemah(Penerjemah _p)
   {
       listpenerjemah.add(penerjemah);
   }
    public String getPegawai(List<? extends Pegawai> list){
        String a= "";
        for(Pegawai P : list)
        {
            a=a+P.print();
        }
        return a;
    }
    public String getPenerjemah(){
        return getPegawai(listpenerjemah);
    }
    public String getPemandu(){
        return getPegawai(listpemandu);
    }
}
