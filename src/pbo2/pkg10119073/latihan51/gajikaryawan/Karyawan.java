package pbo2.pkg10119073.latihan51.gajikaryawan;

import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menghitung gaji karyawan
 * dengan konsep pewarisan class
 *
 */

public class Karyawan {
    protected String nik, nama, jabatan;
    protected int golongan;
    
    Scanner scanner = new Scanner(System.in);
    public String getNik(){
        return nik;
    }
    
    public void setNik(String nik){ 
        this.nik = nik;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getJabatan(){
        return jabatan;
    }
    
    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }
    
    public int getGolongan(){
        return golongan;
    }

    public void setGolongan(int golongan){
        this.golongan = golongan;
    }
}
