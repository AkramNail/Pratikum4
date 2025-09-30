package encapsulationS;

public class Main {
    
    public static void main(String[] args) {

        Siswa siswa1 = new Siswa();
        siswa1.nama = "Budi";
        Siswa.alamat = "Jakarta";
        siswa1.setUmur(17);
        siswa1.tampilkanInfo();

    }

}
