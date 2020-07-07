/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.list;
import model.Manager;
import model.Pegawai;
import java.util.*;
import model.Pekerja;

/**
 *
 * @author Kuroi
 */
public class Controller {
   private Pegawai pg;
   private Manager mg;
   List<Pegawai> listP;
   List<Manager> listM;
   int counter=0;
    public Controller() {
        listP = new ArrayList<>();
        listM = new ArrayList<>();
    }
    public void addPegawai(String Nama,int Usia,double bonus,String UnitKerja,int JamKerja){
        //list.listM.add( );
        listP.add(pg = new Pegawai(Nama, Usia, bonus, UnitKerja, JamKerja));
       counter++;
    }
    public void addManager(String Nama,int Usia,String bonus_manager,String bidang,int jumlah_bawahan){
        listM.add( mg = new Manager(Nama, Usia, bonus_manager, bidang, jumlah_bawahan));
        counter++;
    }
    public String getPekerja(List<? extends Pekerja> list){
        String a= "";
        for(Pekerja P : list)
        {
            a=a+P.Print();
        }
        return a;
    }
    public String getPegawai(){
        return getPekerja(listP);
    }
    public String getManager(){
        return getPekerja(listM);
    }
}
