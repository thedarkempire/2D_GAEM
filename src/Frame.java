import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame {
    static Weapons weapons;
    static Entity entity;
    public static void main(String[]args)  {
        JFrame j=new JFrame("2D_GAME");//this is window
        Image icon= Toolkit.getDefaultToolkit().getImage("C:\\Users\\PC\\Desktop\\idk\\export\\iconic.PNG");//creates icon for the application
        j.setIconImage(icon);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//closes frame
        j.setResizable(false);
        j.setSize(500,200);//frame size
        j.getContentPane().setBackground(Color.BLACK);//applies color
        j.setLocationRelativeTo(null);//centers the frame to the screen
        j.setVisible(true);
        j.setLayout(null);


        Icon icon1=new ImageIcon("C:\\Users\\PC\\Desktop\\idk\\export\\icon1.PNG");//another icon
        JButton b1=new JButton();
        b1.setBounds(50,50,100,50);//size of button and coordinates
        b1.setIcon(icon1);
        b1.setText("Equipment");
        b1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            JFrame f1=new JFrame();
            f1.setSize(600,600);//size of new frame
            f1.setVisible(true);
            f1.setLayout(null);
            f1.setResizable(false);

            JButton eqp1=new JButton("armour1");
            eqp1.setBounds(100,50,400,100);//size of button and coordinates
            eqp1.setHorizontalTextPosition(SwingConstants.LEFT);
            eqp1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Equipment equip=Game.arm.get(1);
                    System.out.println(equip);
                    f1.dispose();//closes the current frame without closing the main frame
                }
            });

            JButton eqp2=new JButton("armour2");
            eqp2.setBounds(100,200,400,100);//size of button and coordinates
            eqp2.setHorizontalTextPosition(SwingConstants.CENTER);
            eqp2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Equipment equip=Game.arm.get(2);
                    System.out.println(equip);
                    f1.dispose();//closes the current frame without closing the main frame
                }
            });

            JButton eqp3=new JButton("armour3");
            eqp3.setHorizontalTextPosition(SwingConstants.LEFT);
            eqp3.setBounds(100,350,400,100);//size of button and coordinates
            eqp3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Equipment equip=Game.arm.get(3);
                    System.out.println(equip);
                    f1.dispose();//closes the current frame without closing the main frame
                }
            });
            f1.add(eqp1);f1.add(eqp2);f1.add(eqp3);
            f1.setDefaultCloseOperation(f1.DISPOSE_ON_CLOSE);//closes the current frame without closing the main frame
        }
        });
        j.add(b1);//adds button to main frame

        Icon icon2=new ImageIcon("C:\\Users\\PC\\Desktop\\idk\\export\\sword.GIF");
        JButton b2=new JButton();
        b2.setBounds(200,50,100,50);//size of button and coordinates
        b2.setIcon(icon2);
        b2.setText("");
        b2.setHorizontalTextPosition(SwingConstants.CENTER);
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JFrame f1=new JFrame();
                f1.setSize(600,600);//size of new frame
                f1.setVisible(true);
                f1.setLayout(null);
                f1.setResizable(false);

                JButton a1=new JButton("Bow");
                a1.setBounds(100,50,400,100);//size of button and coordinates
                a1.setHorizontalTextPosition(SwingConstants.LEFT);
                a1.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        Weapons weapons=Game.wep.get(3);
                        System.out.println(weapons);
                        f1.dispose();//closes the current frame without closing the main frame
                    }
                });

                JButton a2=new JButton("Dagger");
                a2.setBounds(100,200,400,100);//size of button and coordinates
                a2.setHorizontalTextPosition(SwingConstants.CENTER);
                a2.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        Weapons weapons=Game.wep.get(2);
                        System.out.println(weapons);
                        f1.dispose();//closes the current frame without closing the main frame
                    }
                });

                JButton a3=new JButton("Sword");
                a3.setHorizontalTextPosition(SwingConstants.LEFT);
                a3.setBounds(100,350,400,100);//size of button and coordinates
                a3.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        Weapons weapons=Game.wep.get(5);
                        System.out.println(weapons);
                        f1.dispose();//closes the current frame without closing the main frame
                    }
                });
                f1.add(a1);f1.add(a2);f1.add(a3);
                f1.setDefaultCloseOperation(f1.DISPOSE_ON_CLOSE);//closes the current frame without closing the main frame
            }
        });
        j.add(b2);//adds button to main frame

        JButton b3=new JButton("Battle");
        b3.setBounds(350,50,100,50);//size of button and coordinates
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            JFrame j2=new JFrame("GAME");
            j2.setSize(960,720);
            j2.getContentPane().setBackground(Color.BLACK);//applies color
            j2.setLocationRelativeTo(null);//centers the frame to the screen
            j2.setVisible(true);
            j2.setLayout(null);

            ImageIcon hero=new ImageIcon("C:\\Users\\PC\\Desktop\\idk\\export\\Hero1.PNG");
            ImageIcon enemy=new ImageIcon("C:\\Users\\PC\\Desktop\\idk\\export\\wizard.PNG");
            JLabel l=new JLabel();
            l.setBounds(100,230,96,96);
            l.setIcon(hero);
            JLabel l1=new JLabel();
            l1.setBounds(764,230,96,96);
            l1.setIcon(enemy);
            j2.add(l);
            j2.add(l1);
            j2.setDefaultCloseOperation(j2.DISPOSE_ON_CLOSE);//closes the current frame without closing the main frame
            if(j2.isActive()){
            b3.setEnabled(false);}
            else {
                b3.setEnabled(true);
                JButton atk=new JButton("Attack");
                atk.setBounds(100,600,100,50);
                atk.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        if(entity.hp>0 && Entity.Player.hp>0) {
                            Entity.Player.hp -= Math.max(0, Game.damage(entity) - (Entity.Player.def));
                            entity.hp -= (Game.damage(Entity.Player, weapons));
                            if (entity.hp<=0){
                                System.out.println("you won"+entity.name);
                            }
                            else{
                                System.out.println("you lost"+entity.name);
                            }
                        }
                    }
                    });
                j2.add(atk);
                JButton heal=new JButton("Heal");
                heal.setBounds(760,600,100,50);
                heal.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                }
                });
                j2.add(heal);
                JButton forti=new JButton("Heal");
                forti.setBounds(430,600,100,50);
                forti.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                }
                });
                j2.add(forti);
            }
            }
            });
        j.add(b3);//adds button to main frame

        JPanel p1=new JPanel();
        p1.setBounds(0,120,960,430);
        p1.setVisible(true);
        p1.setBackground(Color.BLACK);
        p1.setLayout(null);
        j.add(p1);

    }
}