import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.*;

public class login extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;
    String xx;
    private static String z;

    login(){
        setLayout(null);

        Font t22 = new Font ("Arial Rounded MT",Font.BOLD,16);
        Font Atel3 = new Font ("Arial Rounded MT",Font.BOLD,22);
        Font duraa = new Font ("Arial Rounded MT",Font.PLAIN,14);
        Font Atl1 = new Font ("Arial Rounded MT",Font.BOLD,60);
        Font Atell = new Font ("Arial Rounded MT",Font.BOLD,37);
        Font Atel2 = new Font ("Arial Rounded MT",Font.BOLD,21);
        Font Exit = new Font ("calibri",Font.BOLD,20);

//------------------------------------------------------------------------------------------------------------------------------
        JTextField t1 = new JTextField();
        t1.setBounds (127,283,456,66);
        t1.setForeground(Color.BLACK);
        t1.setBackground(new Color(101, 52, 216, 0));
        t1.setBorder(null);
        t1.setEditable(true);
        t1.setOpaque(false);
        add(t1);
        t1.setFont(Atel3);

        JPasswordField t2 =new JPasswordField();
        t2.setBounds(127,380,456,66);
        t2.setForeground(Color.black);
        t2.setBorder(null);
        t2.setEditable(true);
        t2.setOpaque(false);
        add(t2);
        t2.setFont(t22);

        //   User Name

        JLabel l3 = new JLabel ("User ID");
        l3.setForeground(new Color(129, 129, 129, 255));
        l3.setBounds(1,23,91,20);
        t1.add(l3);
        l3.setFont(Atel3);

        JLabel QQ = new JLabel();
        QQ.setIcon(new ImageIcon(getClass().getResource("img/user id icon.png")));
        QQ.setBounds(96,300,20,30);
        add(QQ);

        //   Password

        JLabel V3 = new JLabel ("Enter Password");
        V3.setForeground(new Color(129, 129, 129, 255));
        V3.setBounds(1,18,201,30);
        t2.add(V3);
        V3.setFont(Atel3);

        JLabel VV = new JLabel();
        VV.setIcon(new ImageIcon(getClass().getResource("img/password icon.png")));
        VV.setBounds(98,402,17,24);
        add(VV);

//------------------------------------------------------------------------------------------------------------------------------

        t1.addKeyListener(new KeyAdapter() {
            public void keyPressed(final KeyEvent ke){
                int keypad = ke.getKeyCode();
                if (keypad == KeyEvent.VK_ENTER){
                    t2.requestFocus(true);

                }
            }
        });


        DocumentListener documentListenert4 = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t1.getText().isEmpty()){
                    l3.setBounds(1,23,91,20);
                    QQ.setBounds(96,300,20,30);
                } else{
                    l3.setBounds(0,0,0,0);
                }
            }
            public void insertUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t1.getText().isEmpty()){
                    l3.setBounds(1,23,91,20);
                    QQ.setBounds(96,300,20,30);
                } else{
                    l3.setBounds(0,0,0,0);
                }
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t1.getText().isEmpty()){
                    l3.setBounds(1,23,91,20);
                    QQ.setBounds(96,300,20,30);
                } else{
                    l3.setBounds(0,0,0,0);
                }
            }

            private void printIT(DocumentEvent documentEvent) {
                System.out.println(t1.getText());

            }
        };
        t1.getDocument().addDocumentListener(documentListenert4);


        DocumentListener documentListenert5 = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t2.getText().isEmpty()){
                    V3.setBounds(1,18,201,30);
                    VV.setBounds(98,402,17,24);
                } else{
                    V3.setBounds(0,0,0,0);
                }
            }
            public void insertUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t2.getText().isEmpty()){
                    V3.setBounds(1,18,201,30);
                    VV.setBounds(98,402,17,24);
                } else{
                    V3.setBounds(0,0,0,0);
                }
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t2.getText().isEmpty()){
                    V3.setBounds(1,18,201,30);
                    VV.setBounds(98,402,17,24);
                } else{
                    V3.setBounds(0,0,0,0);
                }
            }

            private void printIT(DocumentEvent documentEvent) {
                System.out.println(t2.getText());

            }
        };
        t2.getDocument().addDocumentListener(documentListenert5);

        JLabel login = new JLabel();
        login.setIcon(new ImageIcon(getClass().getResource("img/login but.png")));
        login.setBounds(83,507,167,55);
        add(login);

        JLabel loginx = new JLabel();
        loginx.setIcon(new ImageIcon(getClass().getResource("img/login but x.png")));
        add(loginx);

        login.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                loginx.setBounds(78,503,177,63);
                login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        login.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                loginx.setBounds(0,0,0,0);
            }
        });

//------------------------------------------------------------------------------------------------------------------------------
        JComboBox dura = new JComboBox();
        dura.setBounds(477,228,106,24);
        dura.setForeground(Color.BLACK);
        dura.addItem("Doctor");
        dura.addItem("Sister");
        dura.addItem("Pharmacy");
        dura.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(dura);
        dura.setFont(duraa);
//------------------------------------------------------------------------------------------------------------------------------
        JLabel l1 = new JLabel ("Gampola General Hospital");
        l1.setBounds(62,37,770,70);
        l1.setForeground(Color.BLACK);
        add(l1);
        l1.setFont(Atl1);

        JLabel ll = new JLabel ("Welcome Back!");
        ll.setForeground(Color.BLACK);
        ll.setBounds(70,166,279,43);
        add(ll);
        ll.setFont(Atell);

        JLabel l2 = new JLabel ("Login to continue");
        l2.setForeground(Color.BLACK);
        l2.setBounds(70,209,180,24);
        add(l2);
        l2.setFont(Atel2);

        JLabel Cle = new JLabel ("Forget Password?");
        Cle.setForeground(new Color(0,0,0));
        Cle.setBounds(336,517,220,24);
        add(Cle);
        Cle.setFont(Atel2);

        Cle.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                Cle.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                Cle.setForeground(new Color(0, 85, 255));
            }
        });

        Cle.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                Cle.setForeground(new Color(0,0,0));
            }
        });
//------------------------------------------------------------------------------------------------------------------------------
        Cle.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Forget_password Frame = new Forget_password();
                dispose();
            }
        });
// ------------------------------------------------------------------------------------------------------------------------------
        JLabel exit = new JLabel ("Exit");
        exit.setBounds(1205,615,35,20);
        exit.setForeground(Color.black);
        add(exit);
        exit.setFont(Exit);
//----------------------------------------------------------------------------------
        JLabel a2 = new JLabel();
        a2.setIcon(new ImageIcon(getClass().getResource("img/exit.png")));
        add(a2);
//----------------------------------------------------------------------------------
        exit.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                a2.setBounds(1176,606,81,37);
                exit.setForeground(Color.white);
            }
        });

        exit.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                a2.setBounds(0,0,0,0);
                exit.setForeground(Color.black);
            }
        });
//----------------------------------------------------------------------------------------------------------
        exit.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
//--------------------------------------------------------------------------------------------------------------------------------
        JLabel a = new JLabel();
        add(a);
//--------------------------------------
        Thread snn = new Thread() {
            @Override
            public void run() {
                for(int j = 1; j <= 5000; j++){
                    for(int lk = 1; lk <=   3; lk++){
                        for (int i = 583; i < 613; i=i+3) {
                            {
                                a.setBounds(i,37,608,580);
                                a.setIcon(new ImageIcon(getClass().getResource("img/"+lk+".png")));
                                try {
                                    sleep(100);
                                } catch (InterruptedException ex) {}
                            }
                        }
                        //-----------

                        try
                        {
                            Thread.sleep(5000);
                            //-----------------------------------

                        }catch (InterruptedException ie)
                        {
                            System.out.println(ie.getMessage());
                        }  }   }    }
        };
        snn.start();
//------------------------------------------------------------------------------------------------------------------------------
        JLabel xmain = new JLabel();
        xmain.setIcon(new ImageIcon(getClass().getResource("img/Main_login.png")));
        xmain.setBounds(0,0,1257,664);
        add(xmain);
//------------------------------------------------------------------------------------------------------------------------------
// Databace

//-------------------------------------------------------------------------------------------------------------------------------
        login.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                if(t1.getText().isEmpty() && t2.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, " Type Item User ID and Password ","Type Item User ID and Password ",JOptionPane.WARNING_MESSAGE);
                } else{

                    Login_User df = new Login_User();

                    String us = t1.getText();
                    df.setUserid(us);

                    String ps = t2.getText();
                    df.setPassword(ps);

                    String use = (String)dura.getSelectedItem();
                    df.setUser(use);

                    if(df.getUsname().equals("success")) {
                        JOptionPane.showMessageDialog(null, " Login Success", "Login ok ", JOptionPane.WARNING_MESSAGE);

                        z = t1.getText();

                        if (dura.getSelectedItem().equals("Doctor")) {
                            Doctor_D Frame = new Doctor_D();
                            dispose();

                        } else if (dura.getSelectedItem().equals("Sister")) {
                            Sister_D Frame = new Sister_D();
                            dispose();
                        } else if (dura.getSelectedItem().equals("Pharmacy")) {
                            Pharmacy_D Frame = new Pharmacy_D();
                            dispose();
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Invalid User ID or Password ","Invalid User ID or Password",JOptionPane.ERROR_MESSAGE);

                        login Frame = new login();
                        dispose();
                    }
                }
            }
        });
//-------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        setSize (1257,664);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setBackground(new Color(21,21,21,0));
        setVisible(true);
    }
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {

        for(UIManager.LookAndFeelInfo lafInfo : UIManager.getInstalledLookAndFeels()){
        }

        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        login Frame = new login();

        Frame.addMouseListener(new MouseListener(){
            public void mouseReleased(MouseEvent e) {

            }
            public void mousePressed(MouseEvent e) {
                mouseDownScreenCoords = e.getLocationOnScreen();
                mouseDownCompCoords = e.getPoint();
            }
            public void mouseExited(MouseEvent e) {
            }
            public void mouseEntered(MouseEvent e) {
            }
            public void mouseClicked(MouseEvent e) {
            }
        });
        Frame.addMouseMotionListener(new MouseMotionListener(){
            public void mouseMoved(MouseEvent e) {
            }
            public void mouseDragged(MouseEvent e) {

                Point currCoords = e.getLocationOnScreen();
                Frame.setLocation(mouseDownScreenCoords.x + (currCoords.x -
                                mouseDownScreenCoords.x) - mouseDownCompCoords.x,
                        mouseDownScreenCoords.y + (currCoords.y -
                                mouseDownScreenCoords.y) - mouseDownCompCoords.y);

            }
        });
    }
    public static String userid(){
        return z;
    }
}