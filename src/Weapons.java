public class Weapons {
    int atk, critRate, accuracy;

    Weapons(int a, int b, int c){
        this.atk = a;
        this.critRate = b;
        this.accuracy = c;
    }
    static Weapons sword = new Weapons(150, 40, 50);
    static Weapons dagger = new Weapons(70, 100, 60);
    static Weapons bow = new Weapons(100, 80, 70);
    static Weapons MythSword = new Weapons(200, 60, 60);
    static Weapons gun = new Weapons(160, 30, 75);
}