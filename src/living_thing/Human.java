package living_thing;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class Human extends LivingThing {
    private String nama;

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    @Override
    public  void walk(String nama){
        System.out.println(nama + " sedang berjalan");
    }
}
