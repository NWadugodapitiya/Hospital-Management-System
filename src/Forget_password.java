import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Forget_password extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;

    Forget_password(){
        setLayout(null);

        Font Exit = new Font ("calibri",Font.BOLD,20);
        Font Temc = new Font ("Arial Rounded MT",Font.BOLD,54);
        Font Atetl = new Font ("Arial Rounded MT",Font.BOLD,20);
        Font Atet3 = new Font ("Arial Rounded MT",Font.BOLD,11);
        Font Atel2 = new Font ("Arial Rounded MT",Font.BOLD,17);



//------------------------------------------------------------------------------------------------------------------------------
        JLabel tc = new JLabel ("Forget Password");
        tc.setBounds(659,48,448,62);
        tc.setForeground(Color.black);
        add(tc);
        tc.setFont(Temc);
//------------------------------------------------------------------------------------------------------------------------------
        JTextField t1 = new JTextField();
        t1.setBounds (797,158,357,46);
        t1.setForeground(Color.BLACK);
        t1.setBackground(new Color(101, 52, 216, 0));
        t1.setBorder(null);
        t1.setEditable(true);
        t1.setOpaque(false);
        add(t1);
        t1.setFont(Atetl);

        JTextField t2 = new JTextField();
        t2.setBounds (797,231,357,46);
        t2.setForeground(Color.BLACK);
        t2.setBackground(new Color(101, 52, 216, 0));
        t2.setBorder(null);
        t2.setEditable(true);
        t2.setOpaque(false);
        add(t2);
        t2.setFont(Atetl);

        JPasswordField t3 =new JPasswordField();
        t3.setBounds(797,305,357,46);
        t3.setForeground(Color.black);
        t3.setBorder(null);
        t3.setEditable(true);
        t3.setOpaque(false);
        add(t3);
        t3.setFont(Atet3);

        JPasswordField t4 =new JPasswordField();
//        t4.setBounds(797,377,357,46);
        t4.setForeground(Color.black);
        t4.setBorder(null);
        t4.setEditable(true);
        t4.setOpaque(false);
        add(t4);
        t4.setFont(Atet3);
//------------------------------------------------------------------------------------------------------------------------------

// User ID

        t1.requestFocus(true);

        JLabel QQ = new JLabel();
        QQ.setIcon(new ImageIcon(getClass().getResource("img/user id icon.png")));
        QQ.setBounds(770,166,20,30);
        add(QQ);

        JLabel l3 = new JLabel ("Your ID");
        l3.setForeground(new Color(129, 129, 129, 255));
        l3.setBounds(797,165,95,30);
        add(l3);
        l3.setFont(Atetl);

        DocumentListener documentListener = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t1.getText().isEmpty()){
                    l3.setBounds(797,165,95,30);
                } else{
                    l3.setBounds(0,0,0,0);
                }
            }
            public void insertUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t1.getText().isEmpty()){
                    l3.setBounds(797,165,95,30);
                } else{
                    l3.setBounds(0,0,0,0);

                }
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t1.getText().isEmpty()){
                    l3.setBounds(797,165,95,30);
                } else{
                    l3.setBounds(0,0,0,0);
                }
            }

            private void printIT(DocumentEvent documentEvent) {
                System.out.println(t1.getText());

            }
        };
        t1.getDocument().addDocumentListener(documentListener);

////------------------------------------------------------------------------------------------------------------------------------

// Your Last Name

        JLabel nn = new JLabel();
        nn.setIcon(new ImageIcon(getClass().getResource("img/user id icon.png")));
        nn.setBounds(770,239,20,30);
        add(nn);

        JLabel l4 = new JLabel ("Your Last Name");
        l4.setForeground(new Color(129, 129, 129, 255));
        l4.setBounds(797,239,200,30);
        add(l4);
        l4.setFont(Atetl);

        DocumentListener documentListenert2 = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t2.getText().isEmpty()){
                    l4.setBounds(797,239,200,30);
                } else{
                    l4.setBounds(0,0,0,0);
                }
            }
            public void insertUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t2.getText().isEmpty()){
                    l4.setBounds(797,239,200,30);
                } else{
                    l4.setBounds(0,0,0,0);
                }
            }
            public void removeUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t2.getText().isEmpty()){
                    l4.setBounds(797,239,200,30);
                } else{
                    l4.setBounds(0,0,0,0);
                }
            }

            private void printIT(DocumentEvent documentEvent) {
                System.out.println(t2.getText());

            }
        };
        t2.getDocument().addDocumentListener(documentListenert2);

//------------------------------------------------------------------------------------------------------------------------------

//  Your Backup Code

        JLabel bb = new JLabel();
        bb.setIcon(new ImageIcon(getClass().getResource("img/password icon.png")));
        bb.setBounds(772,315,17,24);
        add(bb);

        JLabel l5 = new JLabel ("Your Backup Code");
        l5.setForeground(new Color(129, 129, 129, 255));
        l5.setBounds(797,311,235,30);
        add(l5);
        l5.setFont(Atetl);

        DocumentListener documentListenert3 = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t3.getText().isEmpty()){
                    l5.setBounds(797,311,235,30);
                } else{
                    l5.setBounds(0,0,0,0);
                }
            }
            public void insertUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t3.getText().isEmpty()){
                    l5.setBounds(797,311,235,30);
                } else{
                    l5.setBounds(0,0,0,0);
                }
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t3.getText().isEmpty()){
                    l5.setBounds(797,311,235,30);
                } else{
                    l5.setBounds(0,0,0,0);
                }
            }

            private void printIT(DocumentEvent documentEvent) {
                System.out.println(t3.getText());

            }
        };
        t3.getDocument().addDocumentListener(documentListenert3);

//------------------------------------------------------------------------------------------------------------------------------

// User New Password

        JLabel vv = new JLabel();
        vv.setIcon(new ImageIcon(getClass().getResource("img/password icon.png")));
//        vv.setBounds(772,387,17,24);
        add(vv);

        JLabel l6 = new JLabel ("New Password");
        l6.setForeground(new Color(129, 129, 129, 255));
//        l6.setBounds(797,381,188,30);
        add(l6);
        l6.setFont(Atetl);

        DocumentListener documentListenert4 = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t4.getText().isEmpty()){
                    l6.setBounds(800,381,188,30);
                } else{
                    l6.setBounds(0,0,0,0);
                }
            }
            public void insertUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t4.getText().isEmpty()){
                    l6.setBounds(800,381,188,30);
                } else{
                    l6.setBounds(0,0,0,0);
                }
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t4.getText().isEmpty()){
                    l6.setBounds(800,381,188,30);
                } else{
                    l6.setBounds(0,0,0,0);
                }
            }

            private void printIT(DocumentEvent documentEvent) {
                System.out.println(t4.getText());

            }
        };
        t4.getDocument().addDocumentListener(documentListenert4);

// ------------------------------------------------------------------------------------------------------------------------------
        JLabel Cle = new JLabel ("Back to Login");
        Cle.setForeground(new Color(0,0,0));
        Cle.setBounds(1031,385,120,20);
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
                login Frame = new login();
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

//------------------------------------------------------------------------------------------------------------------------------
        JLabel cangp = new JLabel();
        cangp.setIcon(new ImageIcon(getClass().getResource("img/c_passowrd.png")));
        cangp.setBounds(762,379,223,42);
        add(cangp);

        JLabel caxx = new JLabel();
        caxx.setIcon(new ImageIcon(getClass().getResource("img/c_passowrd.png")));
        add(caxx);

        JLabel cangpx = new JLabel();
        cangpx.setIcon(new ImageIcon(getClass().getResource("img/c_password_x.png")));
        add(cangpx);

        cangp.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                cangpx.setBounds(759,377,229,47);
                cangp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        cangp.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                cangpx.setBounds(0,0,0,0);
            }
        });

//------------------------------------------------------------------------------------------------------------------------------
        caxx.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                cangpx.setBounds(759,447,229,46);
                cangp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        caxx.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                cangpx.setBounds(0,0,0,0);
            }
        });
//-------------------------------------------------------------------------------------------------------------------------------

//------------------------------------------------------------------------------------------------------------------------------

//--------------------------------------------------------------------------------------------------------------------------------
        JLabel a = new JLabel();
        add(a);
//--------------------------------------
        Thread snn = new Thread() {
            @Override
            public void run() {
                for(int j = 1; j <= 5000; j++){
                    for(int lk = 1; lk <=   3; lk++){
                        for (int i = 21; i < 51; i=i+3) {
                            {
                                a.setBounds(i,35,608,580);
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
        xmain.setIcon(new ImageIcon(getClass().getResource("img/Forget Password.png")));
        xmain.setBounds(0,0,1257,664);
        add(xmain);

//-------------------------------------------------------------------------------------------------------------------------------

//------------------------------------------------------------------------------------------------------------------------------


        cangp.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system","root","");
                    Statement st = (Statement) con.createStatement ();
                    ResultSet rs=st.executeQuery("SELECT * FROM user_register WHERE user_id = '"+t1.getText()+ "' && last_name ='"+t2.getText()+ "' && backup_code ='"+t3.getText()+"'");

                    if (rs.next()){

                        Cle.setBounds(1041,462,120,20);
                        caxx.setBounds(762,450,223,42);
                        cangp.setBounds(0,0,0,0);
                        xmain.setIcon(new ImageIcon(getClass().getResource("img/Main_forgetpassword.png")));

                        t4.setBounds(797,377,357,46);
                        t4.requestFocus(true);
                        l6.setBounds(797,381,188,30);
                        vv.setBounds(772,387,17,24);



                        System.out.println();
                    }

                    else{System.out.println();
                        JOptionPane.showMessageDialog(null, "Invalid ","Invalid",JOptionPane.ERROR_MESSAGE);

                        Forget_password Frame = new Forget_password();
                        dispose();
                    }
                }
                catch(Exception ew){
                    System.out.println(ew);
                }
            }
        });


//--------------------------------------------------------------------------------------
        caxx.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                PreparedStatement pstx;
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conx = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system","root","");

                    java.sql.Statement stmtx = conx.createStatement();
                    pstx = (PreparedStatement) conx.prepareStatement("update user_register set password=?,update_date=? WHERE user_id ="+t1.getText());

                    LocalDateTime myDateObj = LocalDateTime.now();
                    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

                    String formattedDate = myDateObj.format(myFormatObj);
                    System.out.println("Date and Time: " + formattedDate);

                    {

                        pstx.setString(1, t4.getText());
                        pstx.setString(2, formattedDate);
                        pstx.executeUpdate();
                        JOptionPane.showMessageDialog(null, "update ok","success",JOptionPane.WARNING_MESSAGE);


                        login Frame = new login();
                        dispose();

                    }
                    stmtx.close();
                    conx.close();
                }catch (Exception eo){
                    System.out.println(eo);
                }

            }
        });

//-------------------------------------------------------------------------------------------------------------------------------
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
}

