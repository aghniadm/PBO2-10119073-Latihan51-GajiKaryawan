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

public class PBO210119073Latihan51GajiKaryawan {

    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("---Program Perhitungan Gaji Karyawan---");
        System.out.print("Masukan NIK: ");
        manager.setNik(scanner.next());
        System.out.print("Masukkan Nama : ");
        manager.setNama(scanner.next());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        manager.setGolongan(scanner.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        manager.setJabatan(scanner.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        manager.setKehadiran(scanner.nextInt());
        
        System.out.println("\n----Hasil Perhitungan----");
        System.out.println("\nNIK      : "+manager.getNik());
        System.out.println("NAMA     : "+manager.getNama());
        System.out.println("GOLONGAN : "+manager.getGolongan());
        System.out.println("JABATAN  : "+manager.getJabatan());
        
        System.out.println("\nTUNJANGAN GOLONGAN   : "+manager.tunjanganGolongan(manager.getGolongan()));
        System.out.println("TUNJANGAN JABATAN    : "+manager.tunjanganJabatan(manager.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN  : "+manager.tunjanganKehadiran(manager.getKehadiran()));
        
        System.out.println("\nGAJI TOTAL  : "+manager.gajiTotal());
        
        
        
        
        
    }
    
    
}
