import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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
        j.setContentPane(new JLabel(new ImageIcon("C:\\Users\\PC\\Desktop\\idk\\export\\bg2.PNG")));//applies color
        j.setLocationRelativeTo(null);//centers the frame to the screen
        j.setVisible(true);
        j.setLayout(null);
        j.pack();


        Icon icon1 = new ImageIcon("C:\\Users\\PC\\IdeaProjects\\final_game\\src\\pics\\armour.PNG");//another icon
        JButton b1 = new JButton();
        b1.setBounds(50, 50, 100, 50);//size of button and coordinates
        b1.setIcon(icon1);
        b1.setText("Equipment");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame f2 = new JFrame();
                f2.setSize(600, 600);//size of new frame
                f2.setVisible(true);
                f2.setLayout(null);
                f2.setResizable(false);
                f2.setLocationRelativeTo(null);
                f2.addWindowListener(new WindowAdapter() {
                    public void windowOpened(WindowEvent windowEvent) {
                b1.setEnabled(false);
                    }
                    });
                f2.addWindowListener(new WindowAdapter() {
                    public void windowClosed(WindowEvent e) {
                        b1.setEnabled(true);
                    }
                });

                JButton eqp1 = new JButton("armour1");
                eqp1.setBounds(100, 50, 400, 100);//size of button and coordinates
                eqp1.setHorizontalTextPosition(SwingConstants.LEFT);
                eqp1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        equip = Game.arm.get(1);
                        System.out.println("Armour Equipped!");
                        f2.dispose();//closes the current frame without closing the main frame
                    }
                });

                JButton eqp2 = new JButton("armour2");
                eqp2.setBounds(100, 200, 400, 100);//size of button and coordinates
                eqp2.setHorizontalTextPosition(SwingConstants.CENTER);
                eqp2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        equip = Game.arm.get(2);
                        System.out.println("Armour Equipped!");
                        f2.dispose();//closes the current frame without closing the main frame
                    }
                });

                JButton eqp3 = new JButton("armour3");
                eqp3.setHorizontalTextPosition(SwingConstants.LEFT);
                eqp3.setBounds(100, 350, 400, 100);//size of button and coordinates
                eqp3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        equip = Game.arm.get(3);
                        System.out.println("Armour Equipped!");
                        f2.dispose();//closes the current frame without closing the main frame
                    }
                });
                f2.add(eqp1);
                f2.add(eqp2);
                f2.add(eqp3);
                f2.setDefaultCloseOperation(f2.DISPOSE_ON_CLOSE);//closes the current frame without closing the main frame
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
                f1.setLocationRelativeTo(null);
                f1.addWindowListener(new WindowAdapter() {
                    public void windowOpened(WindowEvent windowEvent) {
                        b2.setEnabled(false);
                    }
                });
                f1.addWindowListener(new WindowAdapter() {
                    public void windowClosed(WindowEvent e) {
                        b2.setEnabled(true);
                    }
                });

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
                j2.setSize(1280, 720);
                j2.setResizable(false);
                j2.setLocationRelativeTo(null);
                j2.addWindowListener(new WindowAdapter() {
                    public void windowOpened(WindowEvent windowEvent){
                        b3.setEnabled(false);
                    }
                });
                j2.addWindowListener(new WindowAdapter() {
                    public void windowClosed(WindowEvent e) {
                        b3.setEnabled(true);
                    }
                });

                j2.setLocationRelativeTo(null);//centers the frame to the screen
                j2.setVisible(true);
                j2.setLayout(new BorderLayout());
                j2.setContentPane(new JLabel(new ImageIcon("C:\\Users\\PC\\Desktop\\idk\\export\\bg3.PNG")));
                j2.setLayout(null);
                j2.pack();

                ImageIcon hero = new ImageIcon(Entity.Player.sprite());//display the images
                ImageIcon enemy = new ImageIcon(Game.entity.sprite());
                JLabel ent=new JLabel("You have encountered "+Game.entity.name,JLabel.CENTER);
                ent.setBounds(330,100,700,25);
                ent.setForeground(Color.WHITE);
                ent.setFont(new Font("Comic Sans", Font.PLAIN, 20));
                j2.add(ent);
                JLabel l = new JLabel();
                l.setBounds(0, 350, 350, 350);
                l.setIcon(hero);
                JLabel l1 = new JLabel();
                l1.setBounds(764, 350, 350, 350);
                l1.setIcon(enemy);
                JLabel t= new JLabel();
                t.setBounds(100, 486, 150, 25);
                t.setForeground(Color.WHITE);
                t.setFont(new Font("Comic Sans", Font.PLAIN, 20));
                JLabel t1= new JLabel();
                t1.setBounds(764, 486, 150, 25);
                t1.setForeground(Color.WHITE);
                t1.setFont(new Font("Comic Sans", Font.PLAIN, 20));
                JLabel t2=new JLabel();
                t2.setText("");
                JButton restart=new JButton("exit");
                restart.setBounds(1150,50,100,50);
                restart.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Entity.Player.reset();
                    Game.entity.reset();
                j2.dispose();
                }
                });
                j2.add(restart);

                j2.add(t);
                j2.add(t1);
                j2.add(l);
                j2.add(l1);
                j2.setDefaultCloseOperation(j2.DISPOSE_ON_CLOSE);//closes the current frame without closing the main frame
                t.setText("Your hp:" + Math.max(0, Entity.Player.hp));
                t1.setText("Enemy hp:" + Math.max(0, Game.entity.hp));
                    JButton atk = new JButton("Attack");
                    atk.setBounds(1100, 150, 100, 50);
                    atk.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            if (Game.entity.hp > 0 && Entity.Player.hp > 0) {
                                Entity.Player.hp -= Math.max(0, Game.damage(Game.entity) - 0.15 * (Entity.Player.def));
                                Game.entity.hp -= (Game.damage(Entity.Player, weapons));
                                System.out.println("You have " + Entity.Player.hp + " left");
                                t.setText("Your hp:" + Entity.Player.hp);
                                t1.setText("Enemy hp:" + Math.max(0, Game.entity.hp));
                                System.out.println("Your opponent has " +Math.max(0, Game.entity.hp)+ " left");
                                if (Game.entity.hp <= 0) {
                                    System.out.println("You defeated Your opponent!!! " + Game.entity.name);
                                    Entity.Player.reset();
                                    Game.entity.reset();
                                } else if(Entity.Player.hp <= 0) {
                                    System.out.println("You have been defeated by " + Game.entity.name);
                                    Entity.Player.reset();
                                    Game.entity.reset();
                                }
                            }
                        }
                    });
                    j2.add(atk);
                    JButton heal = new JButton("Heal");
                    heal.setBounds(1100, 350, 100, 50);
                    heal.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            if (Game.entity.hp > 0 && Entity.Player.hp > 0) {
                                Game.PotionEffect(1);
                                System.out.println("You've healed yourself");
                                Entity.Player.hp -= Math.max(0, Game.damage(Game.entity) - 0.4 * (Entity.Player.def));
                                t.setText("Your hp:" + Entity.Player.hp);
                                t1.setText("Enemy hp:" + Game.entity.hp);
                                System.out.println("You have " + Entity.Player.hp + " left");
                                System.out.println("Your opponent has " + Game.entity.hp + " left");
                                if (Game.entity.hp <= 0) {
                                    System.out.println("You defeated Your opponent!!! " + Game.entity.name);
                                    Entity.Player.reset();
                                    Game.entity.reset();
                                } else if(Entity.Player.hp <= 0) {
                                    System.out.println("You have been defeated by " + Game.entity.name);
                                    Entity.Player.reset();
                                    Game.entity.reset();
                                }
                            }
                        }
                    });
                    j2.add(heal);
                    JButton forti = new JButton("Fortify");
                    forti.setBounds(1100, 600, 100, 50);
                    forti.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            if (Game.entity.hp > 0 && Entity.Player.hp > 0) {
                                Game.PotionEffect(3);
                                System.out.println("You increased your defence");
                                Entity.Player.hp -= Math.max(0, Game.damage(Game.entity) - 0.4 * (Entity.Player.def));
                                t.setText("Your hp:" + Entity.Player.hp);
                                t1.setText("Enemy hp:" + Game.entity.hp);
                                System.out.println("You have " + Entity.Player.hp + " left");
                                System.out.println("Your opponent has " + Game.entity.hp + " left");
                                if (Game.entity.hp <= 0) {
                                    System.out.println("You defeated Your opponent!!! " + Game.entity.name);
                                    Entity.Player.reset();
                                    Game.entity.reset();
                                } else if(Entity.Player.hp <= 0) {
                                    System.out.println("You have been defeated by " + Game.entity.name);
                                    Entity.Player.reset();
                                    Game.entity.reset();
                                }
                            }
                        }
                    });
                    forti.setLayout(null);
                    j2.add(forti);


            }
        });
        j.add(b3);//adds button to main frame

    }
}