import java.util.HashMap;
import java.util.Scanner;

public class Game {//main class of the game

    static HashMap<Integer, Entity> ent = new HashMap<Integer, Entity>();
    static HashMap<Integer, Equipment> arm = new HashMap<Integer, Equipment>();
    static HashMap<Integer, Equipment> pot = new HashMap<Integer, Equipment>();
    static HashMap<Integer, Weapons> wep = new HashMap<Integer, Weapons>();
    static {
        wep.put(1, Weapons.MythSword);
        wep.put(2, Weapons.dagger);
        wep.put(3, Weapons.bow);
        wep.put(4, Weapons.gun);
        wep.put(5, Weapons.sword);
        arm.put(1, Equipment.armour1);
        arm.put(2, Equipment.armour2);
        arm.put(3, Equipment.armour3);
        pot.put(1, Equipment.heal);
        pot.put(2, Equipment.amplify);
        pot.put(3, Equipment.fortify);
        pot.put(4, Equipment.precision);
        ent.put(0, Entity.Player);
        ent.put(1, Entity.Pufferfish);
        ent.put(2, Entity.Dragon);
        ent.put(3, Entity.Golem);
        ent.put(4, Entity.Giant);
        ent.put(5, Entity.Mage);
        ent.put(6, Entity.Warrior);
        ent.put(7, Entity.Zombie);
        ent.put(8, Entity.Robot);
        ent.put(9, Entity.Golem);
        ent.put(10, Entity.Golem);
        ent.put(11, Entity.Golem);
        ent.put(12, Entity.Giant);
        ent.put(13, Entity.Giant);
        ent.put(14, Entity.Giant);
        ent.put(15, Entity.Zombie);
        ent.put(16, Entity.Zombie);
        ent.put(17, Entity.Zombie);
        ent.put(18, Entity.Zombie);
        ent.put(19, Entity.Zombie);
        ent.put(20, Entity.Robot);
        ent.put(21, Entity.Robot);
        ent.put(22, Entity.Robot);
        ent.put(23, Entity.Robot);
        ent.put(24, Entity.Robot);
        ent.put(25, Entity.Mage);
        ent.put(26, Entity.Mage);
        ent.put(27, Entity.Mage);
        ent.put(28, Entity.Mage);
        ent.put(29, Entity.Warrior);
        ent.put(30, Entity.Warrior);
    }
    public static void fight(Weapons weapon , Equipment armour){
        int mob = (int) Math.ceil(Math.random() * 30);
        Entity entity = ent.get(mob);
        System.out.println("You have encountered "+entity.name);

        Entity.Player.hp+= armour.hp;
        Entity.Player.def+= armour.def;
        System.out.println("You have equipped your armour and ready to fight");
        fight(entity,weapon);
    }
    public static void fight(Entity entity , Weapons weapon){
        Scanner sc = new Scanner(System.in);
        while(entity.hp>0 && Entity.Player.hp>0) {
            Entity.Player.hp -= Math.max(0,damage(entity) - (Entity.Player.def));
        }
        if (entity.hp <= 0) {
            System.out.println("You defeated Your opponent!!! "+entity.name);
        }else {
            System.out.println("You have been defeated by "+entity.name);
        }
        entity.reset();
        Entity.Player.reset();
    }
    public static int damage(Entity entity){
        if(entity!=Entity.Mage){
            long hit = Math.round(Math.random()*100);
            if(hit<= entity.acc){
                return entity.atk;
            }
            else return 0;
        }
        else {
            return (int)(Entity.Player.hp * 0.3);
        }
    }
    public static int damage(Entity entity, Weapons weapon){
        long hit = Math.round(Math.random()*100);
        int attack;
        if(hit<= (entity.acc+ weapon.accuracy)) {
            long crit = Math.round(Math.random() * 100);
            if (crit <= weapon.critRate) {
                attack = (entity.atk + weapon.atk) * 2;
            } else {
                attack = (entity.atk + weapon.atk);
            }
            return attack;
        }else {
            return 0;
        }
    }
}