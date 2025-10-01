package Inheritance.HybridInheritance;

interface Belajar {
    void belajar();
}


class Mahasiswa extends Manusia implements Belajar {
    @Override
    public void belajar() {
        System.out.println("Mahasiswa harus belajar");
    }
}