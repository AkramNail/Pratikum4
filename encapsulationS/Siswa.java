package encapsulationS;

public class Siswa {
    
    public final String sekolah = "SMK Telkom Malang";
    public static String alamat = "Malang";
    public String nama;
    private int umur;

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Sekolah: " + sekolah);
        System.out.println("Alamat: " + alamat);
    }
    

}
