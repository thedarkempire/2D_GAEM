import javax.swing.*;
public class Dam1 extends JButton {
    private static void main(Entity entity, Weapons weapon) {
        while (entity.hp > 0 && Entity.Player.hp > 0) {
            Entity.Player.hp -= Math.max(0, Game.damage(entity) - (Entity.Player.def));
            entity.hp -= (Game.damage(Entity.Player, weapon));
        }
    }
}
