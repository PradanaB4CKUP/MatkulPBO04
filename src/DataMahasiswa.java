import java.util.Scanner;

public class DataMahasiswa {
    public String Nim;
    public String Nama;
    public String NamaProdi;
    public int KodeProdi;
    public int ThnMasuk;
    public String Keterangan;
    Scanner input = new Scanner(System.in);

    public void InputData() {
        System.out.print("Input Nim : ");
        Nim = input.nextLine();
        System.out.print("Input Nama : ");
        Nama = input.nextLine();
        System.out.print("Masukkan Kode Prodi : ");
        KodeProdi = input.nextInt();
        System.out.print("Masukkan Tahun Masuk : ");
        ThnMasuk = input.nextInt();
    }

    public int getProdi() {
        if (KodeProdi == 11) {
            NamaProdi = "Sistem Informasi";
        } else if (KodeProdi == 12) {
            NamaProdi = "Informatika";
        } else if (KodeProdi == 15) {
            NamaProdi = "Sains Data";
        } else {
            NamaProdi = "Salah Input";
        }
        return KodeProdi;
    }

    public int getThnMasuk() {
        switch (ThnMasuk) {
            case 2020:
                Keterangan = "Anda Sedang di tahun keempat";
                break;
            case 2021:
                Keterangan = "Anda Sedang di tahun ketiga";
                break;
            case 2022:
                Keterangan = "Anda Sedang di tahun kedua";
                break;
            case 2023:
                Keterangan = "Anda Sedang di tahun pertama";
                break;
            default:
                Keterangan = "Silahkan Input Tahun Kuliah (2020 - 2024)";
        } return ThnMasuk;

    }

    void Cetak() {
        System.out.println("NIM : " + Nim);
        System.out.println("Nama : " + Nama);
        System.out.println("Kode Prodi : " + KodeProdi);
        System.out.println("Nama Prodi : " + NamaProdi);
        System.out.println("Tahun Kuliah : " + Keterangan);
    }
}
