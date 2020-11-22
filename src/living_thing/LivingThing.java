package living_thing;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public abstract class LivingThing {
    public abstract void walk(String nama);

    public void breath(String nama){
        System.out.println(nama + " bernafas");
    }

    public void eat(String nama){
        System.out.println(nama + " makan");
    }
}
