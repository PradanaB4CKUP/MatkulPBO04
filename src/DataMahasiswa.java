import java.util.Scanner;

public class DataMahasiswa{
    public String Nim;
    public String Nama;
    public String NamaProdi;
    public int KodeProdi;
    Scanner input = new Scanner(System.in);

    public void InputData(){
        System.out.print("Input Nim : ");
        Nim = input.nextLine();
        System.out.print("Input Nama : ");
        Nama = input.nextLine();
        System.out.print("Masukkan Kode Prodi : ");
        KodeProdi = input.nextInt();
    }

    public int getProdi(){
        if(KodeProdi == 11){
            NamaProdi="Sistem Informasi";
        }
        else if(KodeProdi == 12){
            NamaProdi="Informatika";
        }
        else if(KodeProdi == 15){
            NamaProdi="Sains Data";
        }
        else {
            NamaProdi="Salah Input";
        }
        return KodeProdi;
    }   
    
    void Cetak(){
        System.out.println("NIM : " + Nim);
        System.out.println("Nama : " + Nama);
        System.out.println("Kode Prodi : " + KodeProdi);
        System.out.println("Nama Prodi : " + NamaProdi);
    }
}



