import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame {
    static Weapons weapons;
    static Equipment equip;

    public static void main(String[] args) {
        JFrame j = new JFrame("2D_GAME");//this is the window
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\PC\\Desktop\\idk\\export\\iconic.PNG");//creates icon for the application
        j.setIconImage(icon);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//closes frame
        j.setResizable(false);
        j.setSize(500, 200);//frame size
        j.getContentPane().setBackground(Color.BLACK);//applies color
        j.setLocationRelativeTo(null);//centers the frame to the screen
        j.setVisible(true);
        j.setLayout(null);


        Icon icon1 = new ImageIcon("C:\\Users\\PC\\IdeaProjects\\final_game\\src\\pics\\armour.PNG");//another icon
        JButton b1 = new JButton();
        b1.setBounds(50, 50, 100, 50);//size of button and coordinates
        b1.setIcon(icon1);
        b1.setText("Equipment");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame f1 = new JFrame();
                f1.setSize(600, 600);//size of new frame
                f1.setVisible(true);
                f1.setLayout(null);
                f1.setResizable(false);

                JButton eqp1 = new JButton("armour1");
                eqp1.setBounds(100, 50, 400, 100);//size of button and coordinates
                eqp1.setHorizontalTextPosition(SwingConstants.LEFT);
                eqp1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        equip = Game.arm.get(1);
                        System.out.println("Armour Equipped!");
                        f1.dispose();//closes the current frame without closing the main frame
                    }
                });

                JButton eqp2 = new JButton("armour2");
                eqp2.setBounds(100, 200, 400, 100);//size of button and coordinates
                eqp2.setHorizontalTextPosition(SwingConstants.CENTER);
                eqp2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        equip = Game.arm.get(2);
                        System.out.println("Armour Equipped!");
                        f1.dispose();//closes the current frame without closing the main frame
                    }
                });

                JButton eqp3 = new JButton("armour3");
                eqp3.setHorizontalTextPosition(SwingConstants.LEFT);
                eqp3.setBounds(100, 350, 400, 100);//size of button and coordinates
                eqp3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        equip = Game.arm.get(3);
                        System.out.println("Armour Equipped!");
                        f1.dispose();//closes the current frame without closing the main frame
                    }
                });
                f1.add(eqp1);
                f1.add(eqp2);
                f1.add(eqp3);
                f1.setDefaultCloseOperation(f1.DISPOSE_ON_CLOSE);//closes the current frame without closing the main frame
            }
        });
        j.add(b1);//adds button to main frame

        Icon icon2 = new ImageIcon("C:\\Users\\PC\\IdeaProjects\\final_game\\src\\pics\\equipment.PNG");
        JButton b2 = new JButton();
        b2.setBounds(200, 50, 100, 50);//size of button and coordinates
        b2.setIcon(icon2);
        b2.setText("");
        b2.setHorizontalTextPosition(SwingConstants.CENTER);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame f1 = new JFrame();
                f1.setSize(600, 600);//size of new frame
                f1.setVisible(true);
                f1.setLayout(null);
                f1.setResizable(false);

                JButton a1 = new JButton("Bow");
                a1.setBounds(100, 50, 400, 100);//size of button and coordinates
                a1.setHorizontalTextPosition(SwingConstants.LEFT);
                a1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        weapons = Game.wep.get(3);
                        System.out.println("You are using a bow");
                        f1.dispose();//closes the current frame without closing the main frame
                    }
                });

                JButton a2 = new JButton("Dagger");
                a2.setBounds(100, 200, 400, 100);//size of button and coordinates
                a2.setHorizontalTextPosition(SwingConstants.CENTER);
                a2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        weapons = Game.wep.get(2);
                        System.out.println("You are using a dagger");
                        f1.dispose();//closes the current frame without closing the main frame
                    }
                });

                JButton a3 = new JButton("Sword");
                a3.setHorizontalTextPosition(SwingConstants.LEFT);
                a3.setBounds(100, 350, 400, 100);//size of button and coordinates
                a3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        weapons = Game.wep.get(5);
                        System.out.println("You are using a sword");
                        f1.dispose();//closes the current frame without closing the main frame
                    }
                });
                f1.add(a1);
                f1.add(a2);
                f1.add(a3);
                f1.setDefaultCloseOperation(f1.DISPOSE_ON_CLOSE);//closes the current frame without closing the main frame
            }
        });
        j.add(b2);//adds button to main frame

        JButton b3 = new JButton("Battle");
        b3.setBounds(350, 50, 100, 50);//size of button and coordinates
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Game.fight(equip);
                JFrame j2 = new JFrame("GAME");
                j2.setSize(960, 720);
                j2.setResizable(false);

                j2.setLocationRelativeTo(null);//centers the frame to the screen
                j2.setVisible(true);
                j2.setLayout(new BorderLayout());
                j2.setContentPane(new JLabel(new ImageIcon("C:\\Users\\PC\\Desktop\\idk\\export\\bg.PNG")));
                j2.setLayout(null);
                j2.pack();

                ImageIcon hero = new ImageIcon(Entity.Player.sprite());//display the images
                ImageIcon enemy = new ImageIcon(Game.entity.sprite());
                JLabel l = new JLabel();
                l.setBounds(100, 230, 256, 256);
                l.setIcon(hero);
                JLabel l1 = new JLabel();
                l1.setBounds(764, 230, 256, 256);
                l1.setIcon(enemy);
                JLabel t= new JLabel();
                t.setBounds(100, 486, 100, 25);
                JLabel t1= new JLabel();
                t1.setBounds(764, 486, 100, 25);
                /*JButton restart=new JButton("restart");
                restart.setBounds(800,100,100,50);
                restart.addActionListener(new ActionListener() {
                                              public void actionPerformed(ActionEvent e) {
                                                  Game.entity.reset();
                                                  Entity.Player.reset();
                                              }
                                          });
                                          j2.add(restart);*/

                j2.add(t);
                j2.add(t1);
                j2.add(l);
                j2.add(l1);
                j2.setDefaultCloseOperation(j2.DISPOSE_ON_CLOSE);//closes the current frame without closing the main frame
                if (j2.isActive()) {
                    b3.setEnabled(false);
                }
                    JButton atk = new JButton("Attack");
                    atk.setBounds(100, 600, 100, 50);
                    atk.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            if (Game.entity.hp > 0 && Entity.Player.hp > 0) {
                                Entity.Player.hp -= Math.max(0, Game.damage(Game.entity) - 0.15 * (Entity.Player.def));
                                Game.entity.hp -= (Game.damage(Entity.Player, weapons));
                                System.out.println("You have " + Entity.Player.hp + " left");
                                t.setText("Your hp" + Entity.Player.hp);
                                t1.setText("Enemy hp" + Game.entity.hp);
                                System.out.println("Your opponent has " + Game.entity.hp + " left");
                                if (Game.entity.hp <= 0) {
                                    System.out.println("You defeated Your opponent!!! " + Game.entity.name);
                                } else if(Entity.Player.hp <= 0) {
                                    System.out.println("You have been defeated by " + Game.entity.name);
                                }
                            }
                        }
                    });
                    j2.add(atk);
                    JButton heal = new JButton("Heal");
                    heal.setBounds(760, 600, 100, 50);
                    heal.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            if (Game.entity.hp > 0 && Entity.Player.hp > 0) {
                                Game.PotionEffect(1);
                                System.out.println("You've healed yourself");
                                Entity.Player.hp -= Math.max(0, Game.damage(Game.entity) - 0.4 * (Entity.Player.def));
                                t.setText("Your hp" + Entity.Player.hp);
                                t1.setText("Enemy hp" + Game.entity.hp);
                                System.out.println("You have " + Entity.Player.hp + " left");
                                System.out.println("Your opponent has " + Game.entity.hp + " left");
                                if (Game.entity.hp <= 0) {
                                    System.out.println("You defeated Your opponent!!! " + Game.entity.name);
                                } else if(Entity.Player.hp <= 0) {
                                    System.out.println("You have been defeated by " + Game.entity.name);
                                }
                            }
                        }
                    });
                    j2.add(heal);
                    JButton forti = new JButton("Fortify");
                    forti.setBounds(430, 600, 100, 50);
                    forti.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            if (Game.entity.hp > 0 && Entity.Player.hp > 0) {
                                Game.PotionEffect(3);
                                System.out.println("You increased your defence");
                                Entity.Player.hp -= Math.max(0, Game.damage(Game.entity) - 0.4 * (Entity.Player.def));
                                t.setText("Your hp" + Entity.Player.hp);
                                t1.setText("Enemy hp" + Game.entity.hp);
                                System.out.println("You have " + Entity.Player.hp + " left");
                                System.out.println("Your opponent has " + Game.entity.hp + " left");
                                if (Game.entity.hp <= 0) {
                                    System.out.println("You defeated Your opponent!!! " + Game.entity.name);
                                } else if(Entity.Player.hp <= 0) {
                                    System.out.println("You have been defeated by " + Game.entity.name);
                                }
                            }
                        }
                    });
                    forti.setLayout(null);
                    j2.add(forti);


            }
        });
        j.add(b3);//adds button to main frame

        JPanel p1 = new JPanel();
        p1.setBounds(0, 120, 960, 430);
        p1.setVisible(true);
        p1.setBackground(Color.BLACK);
        p1.setLayout(null);
        j.add(p1);

    }
}