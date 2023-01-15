public class Equipment {
    int hp,def,buff;
    Equipment(int a, int b){
        this.hp=a;
        this.def=b;
    }
    Equipment(int z){
        this.buff=z;
    }

    static    Equipment armour1 = new Equipment(500,150);
    static    Equipment armour2 = new Equipment(200,400);
    static    Equipment armour3 = new Equipment(300,300);
    static    Equipment heal = new Equipment(300);
    static    Equipment amplify = new Equipment(250);
    static    Equipment fortify = new Equipment(250);
    static    Equipment precision = new Equipment(30);

}