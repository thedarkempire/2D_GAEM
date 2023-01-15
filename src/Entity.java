public class Entity {
    int hp,atk,def,acc,backhp,backatk,backdef,backacc;
    String name;
    Entity (int x ,int y ,int z ,String n ,int a){
        this.hp=x;
        this.atk=y;
        this.def=z;
        this.name=n;
        this.acc=a;
        this.backhp=this.hp;
        this.backatk=this.atk;
        this.backdef=this.def;
        this.backacc=this.acc;
        this.reset();
    }

    public void reset() {
        hp = backhp;
        atk = backatk;
        def = backdef;
        acc = backacc;
    }

    public String sprite(){
        return "./Sprite/"+name;
    }

    static Entity Player = new Entity(1000, 100, 200, "Gamer", 0);//You yourself
    static Entity Dragon = new Entity(10000, 500, 1000, "The Majestic Flame Breather", 80);//Boss enemy with highest stats
    static Entity Warrior = new Entity(500, 300, 100, "a Gladiator", 70);//Skilled warrior,good at fighting hence high atk
    static Entity Zombie = new Entity(1000, 100, 500, "a Infected", 40);//Infected player everything same except more def for virus
    static Entity Golem = new Entity(1000, 50, 10000, "a Golem", 50);//Bulky enemy made of rocky material hence high def
    static Entity Giant = new Entity(10000, 100, 200, "a Giant", 60);//Large and beefy enemy hence has high hp
    static Entity Mage = new Entity(500, 0, 200, "an Abyssal Mage",100);//Learned magician sucks out hp from player and heals itself
    static Entity Robot = new Entity(1000, Player.hp / 2, 150, "an Adaptive Robot", 70);//Adaptive robot fights stronger the higher hp left
    static Entity Pufferfish = new Entity(20, 0, 0, "Puffer-Fish", 0);
}