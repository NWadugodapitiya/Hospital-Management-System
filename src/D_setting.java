import com.toedter.calendar.JCalendar;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class D_setting extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;
    String UID = login.userid();
    JLabel bord,pannel1,pannel2,status;
    File fileToSave;
    D_setting(){
        setLayout(null);


        Font Exit = new Font ("calibri",Font.BOLD,20);
        Font text1 = new Font ("Arial Rounded MT",Font.BOLD,18);
        Font GrClass = new Font ("Segoe UI",Font.BOLD,22);
        Font Usname = new Font ("Arial Rounded MT",Font.BOLD,16);
        Font calandertext = new Font ("Segoe UI",Font.BOLD,25);
        Font fdas = new Font ("Arial Rounded MT",Font.BOLD,33);
        Font Atel3 = new Font ("Arial Rounded MT",Font.BOLD,13);
        Font Atetl = new Font ("calibri",Font.BOLD,15);
        Font name1 = new Font ("Arial Rounded MT",Font.BOLD,22);
        Font Qq09 = new Font ("Segoe UI",Font.PLAIN,12);
        Font Atet1 = new Font ("Arial Rounded MT",Font.BOLD,17);
        Font Qq0e1 = new Font ("Segoe UI",Font.BOLD,18);




        bord = new JLabel();
        add(bord);
        pannel1 = new JLabel("available");
        pannel2 = new JLabel("Ward");
        status = new JLabel("not available");

//----------------------------------------------------------------------------------------------------------------------
        JLabel i1 = new JLabel();
        i1.setIcon(new ImageIcon(getClass().getResource("img/ico.png")));
        i1.setBounds(19,192,18,208);
        add(i1);

        i1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                i1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        //--------------------------------------------------------------------------------------------------------------
        JLabel T1 = new JLabel ("Dashboard");
        T1.setBounds(45,189,97,21);
        T1.setForeground(new Color(250, 250, 250,250));
        add(T1);
        T1.setFont(text1);

        JLabel T2 = new JLabel ("Appointment");
        T2.setBounds(45,253,113,21);
        T2.setForeground(new Color(250, 250, 250, 255));
        add(T2);
        T2.setFont(text1);

        JLabel T3 = new JLabel ("History");
        T3.setBounds(47,317,63,21);
        T3.setForeground(new Color(255, 255, 255, 250));
        add(T3);
        T3.setFont(text1);

        JLabel T4 = new JLabel ("Settings");
        T4.setBounds(48,381,72,21);
        T4.setForeground(new Color(0, 0, 0, 255));
        add(T4);
        T4.setFont(text1);

////=====================================================================================================================
        T1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                T1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T1.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
            }
        });

        T1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Doctor_D  Frame = new Doctor_D ();
                dispose();
            }
        });

////=====================================================================================================================
        T2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                T2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                D_Appointment  Frame = new D_Appointment ();
                dispose();
            }
        });

////=====================================================================================================================
        T3.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                T3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                D_History  Frame = new D_History ();
                dispose();
            }
        });
////=====================================================================================================================
        T4.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                T4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                D_setting Frame = new D_setting ();
                dispose();
            }
        });
//======================================================================================================================
        JLabel login = new JLabel();
        login.setIcon(new ImageIcon(getClass().getResource("img/logout.png")));
        login.setBounds(36,685,93,28);
        add(login);

        login.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            }
        });

        login.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Logout success","Logout ok ",JOptionPane.WARNING_MESSAGE);
                Connection con;
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system","root","");
                    String query = "insert into login_infor (User_id,Password,User,Date_time,login_and_logout)" + " values (?,?,?,?,?)";
                    PreparedStatement preparedStmt = con.prepareStatement(query);

                    LocalDateTime myDateObj = LocalDateTime.now();
                    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                    String formattedDate = myDateObj.format(myFormatObj);
                    System.out.println("Date and Time: " + formattedDate);
                    preparedStmt.setString(1, (UID));
                    preparedStmt.setString(2, (""));
                    preparedStmt.setString(3,("Doctor"));
                    preparedStmt.setString(4, formattedDate);
                    preparedStmt.setString(5, ("Logout"));
                    preparedStmt.execute();

                    login  Frame = new login ();
                    dispose();
                    con.close();
                }
                catch (ClassNotFoundException | SQLException en)
                {
                    System.err.println("Got an excepttion!");
                    System.err.println(en.getMessage());
                }
            }
        });
//------------------------------------------------------------------------------------------------------------------------------
        JLabel GClass = new JLabel ("<html>Gampola General<br><center>Hospital</html>");
        GClass.setBounds(22,90,184,55);
        GClass.setForeground(new Color(250, 250, 250,250));
        add(GClass);
        GClass.setFont(GrClass);

        JLabel Uname = new JLabel ("<html><center>Available<br>Appointment</html>");
        Uname.setBounds(266,127,100,40);
        Uname.setForeground(new Color(0, 0, 0,250));
        add(Uname);
        Uname.setFont(Usname);

        JLabel cat1 = new JLabel ("15");
        cat1.setBounds(299,170,29,28);
        cat1.setForeground(new Color(0, 0, 0,250));
        add(cat1);
        cat1.setFont(calandertext);

        JLabel cat1l = new JLabel ("Patient Ward");
        cat1l.setBounds(414,128,100,40);
        cat1l.setForeground(new Color(0, 0, 0,250));
        add(cat1l);
        cat1l.setFont(Usname);

        JLabel subject = new JLabel ("23");
        subject.setBounds(449,170,29,28);
        subject.setForeground(new Color(0, 0, 0,250));
        add(subject);
        subject.setFont(calandertext);

        JLabel subjecttext = new JLabel ("<html>Total number<br><center>of patients</html>");
        subjecttext.setBounds(558,127,108,40);
        subjecttext.setForeground(new Color(0, 0, 0,250));
        add(subjecttext);
        subjecttext.setFont(Usname);

        JLabel lessons = new JLabel ("1052");
        lessons.setBounds(583,170,57,28);
        lessons.setForeground(new Color(0, 0, 0,250));
        add(lessons);
        lessons.setFont(calandertext);
//------------------------------------------------------------------------------------------------------------------------------
        JPanel b1 = new JPanel();
        b1.setBounds(250,117,131,92);
        b1.setBackground(new Color(21,21,21,0));
        add(b1);

        JPanel b2 = new JPanel();
        b2.setBounds(398,117,131,92);
        b2.setBackground(new Color(21,21,21,0));
        add(b2);

        JPanel b3 = new JPanel();
        b3.setBounds(546,117,131,92);
        b3.setBackground(new Color(21,21,21,0));
        add(b3);

        b1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                bord.setIcon(new ImageIcon(getClass().getResource("img/DH1.png")));
                bord.setBounds(250,117,131,92);
            }
        });

        b1.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                bord.setBounds(0,0,0,0);
            }
        });
//====================================================================================
        b2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                bord.setIcon(new ImageIcon(getClass().getResource("img/DH1.png")));
                bord.setBounds(398,117,131,92);
            }
        });

        b2.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                bord.setBounds(0,0,0,0);
            }
        });
//====================================================================================
        b3.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                bord.setIcon(new ImageIcon(getClass().getResource("img/DH1.png")));
                bord.setBounds(546,117,131,92);}
        });

        b3.addMouseListener(new MouseAdapter() {public void mouseExited(MouseEvent e) {
            bord.setBounds(0,0,0,0);
        }});
//====================================================================================
//------------------------------------------------------------------------------------------------------------------------------
// -----------------------------------------------------------------------------------------------------------------------------
        JLabel l3 = new JLabel ("Search");
        l3.setForeground(new Color(0, 0, 0, 255));
        l3.setBounds(285,19,45,15);
        add(l3);
        l3.setFont(Atel3);

        JLabel search = new JLabel();
        search.setIcon(new ImageIcon(getClass().getResource("img/search.png")));
        search.setBounds(259,21,12,13);
        add(search);

        JTextField t1 = new JTextField();
        t1.setBounds (282,13,295,27);
        t1.setForeground(Color.BLACK);
        t1.setBackground(new Color(101, 52, 216, 0));
        t1.setBorder(null);
        t1.setEditable(true);
        t1.setOpaque(false);
        add(t1);
        t1.setFont(Atetl);

        DocumentListener documentListener = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t1.getText().isEmpty()){
                    l3.setBounds(285,19,45,15);
                } else{
                    l3.setBounds(0,0,0,0);
                }
            }
            public void insertUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t1.getText().isEmpty()){
                    l3.setBounds(285,19,45,15);
                } else{
                    l3.setBounds(0,0,0,0);
                }
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t1.getText().isEmpty()){
                    l3.setBounds(285,19,45,15);
                } else{
                    l3.setBounds(0,0,0,0);
                }
            }

            private void printIT(DocumentEvent documentEvent) {
                System.out.println(t1.getText());

            }
        };
        t1.getDocument().addDocumentListener(documentListener);
//----------------------------------------------------------------------------------------------------------------------
        JLabel name = new JLabel ("Dr. Nihal Peeris");
        name.setBounds(839,11,167,26);
        name.setForeground(new Color(0, 0, 0,250));
        add(name);
        name.setFont(name1);

        JLabel prof = new JLabel();
        prof.setIcon(new ImageIcon(getClass().getResource("img/profile.png")));
        prof.setBounds(1148,11,27,30);
        add(prof);

        JLabel help = new JLabel();
        help.setIcon(new ImageIcon(getClass().getResource("img/help.png")));
        help.setBounds(1115,16,19,20);
        add(help);

        JLabel sett = new JLabel();
        sett.setIcon(new ImageIcon(getClass().getResource("img/set.png")));
        sett.setBounds(1078,16,19,20);
        add(sett);

        JLabel noti = new JLabel();
        noti.setIcon(new ImageIcon(getClass().getResource("img/noti.png")));
        noti.setBounds(1043,16,20,21);
        add(noti);
//----------------------------------------------------------------------------------------------------------

        prof.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                prof.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        prof.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                D_setting  Frame = new D_setting ();
                dispose();
            }
        });

        help.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                help.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        sett.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                sett.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });
        sett.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                D_setting  Frame = new D_setting ();
                dispose();
            }
        });

        noti.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                noti.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

// ------------------------------------------------------------------------------------------------------------------------------
        JLabel exit = new JLabel ("Exit");
        exit.setBounds(1155,724,37,23);
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
                a2.setBounds(1128,717,81,37);
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
        //----------------------------------------------------------------------------------------------------------------------------------------------------------------
        try{
            Connection con; Statement st; ResultSet rs;

            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system","root","");
            st=con.createStatement();
            rs=st.executeQuery("SELECT COUNT(NIC_Number) FROM patient_register  WHERE Doctor_id = '"+Integer.parseInt(UID)+ "' && Appointment_status ='"+pannel1.getText()+ "'");
            int i = 0;
            while (rs.next())
            {
                i=rs.getInt(1);
            }
            cat1.setText(""+i);
            con.close();
            st.close();
            rs.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        try{
            Connection con; Statement st; ResultSet rs;

            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system","root","");
            st=con.createStatement();
            rs = st.executeQuery("SELECT COUNT(patient_update.NIC_Number) FROM patient_update INNER JOIN patient_register ON patient_register.NIC_Number = patient_update.NIC_Number WHERE patient_update.status = '" +pannel2.getText()+ "' AND patient_register.Doctor_id = '" +Integer.parseInt(UID)+ "'");
            int i = 0;
            while (rs.next())
            {
                i=rs.getInt(1);
            }
            subject.setText(""+i);
            con.close();
            st.close();
            rs.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
//------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------------------------------
        try{
            Connection con; Statement st; ResultSet rs;

            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system","root","");
            st=con.createStatement();
            rs=st.executeQuery("SELECT COUNT(NIC_Number) FROM patient_register  WHERE Doctor_id = '"+Integer.parseInt(UID)+"'");
            int i = 0;
            while (rs.next())
            {
                i=rs.getInt(1);
            }
            lessons.setText(""+i);
            con.close();
            st.close();
            rs.close();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        try{
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system","root","");
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM user_register WHERE user_id = "+Integer.parseInt(UID));
            while(rs.next()){
                String first_name= rs.getString("first_name");
                String last_name= rs.getString("last_name");
                name.setText(first_name+" "+last_name);
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }
//------------------------------------------------------------------------------------------------------------------------------


































//------------------------------------------------------------------------------------------------------------------------------
        JLabel q0e1 = new JLabel ("Add Image");
        q0e1.setBounds(980,476,93,24);
        q0e1.setForeground(Color.BLACK);
        add(q0e1);
        q0e1.setFont(Qq0e1);

        JLabel q01 = new JLabel ("Your Backup Code  = ");
        q01.setBounds(853,295,300,24);
        q01.setForeground(Color.BLACK);
        add(q01);
        q01.setFont(Qq0e1);

        JLabel q02 = new JLabel ("Your ID ");
        q02.setBounds(335,365,194,24);
        q02.setForeground(Color.BLACK);
        add(q02);
        q02.setFont(Qq0e1);

        JTextField A1 = new JTextField();
        A1.setBounds (585,354,254,28);
        A1.setForeground(Color.BLACK);
        A1.setBackground(new Color(101, 52, 216, 0));
        A1.setBorder(null);
        A1.setEditable(false);
        A1.setOpaque(false);
        add(A1);
        A1.setFont(Atet1);

        JLabel q022 = new JLabel ("First Name");
        q022.setBounds(335,400,194,24);
        q022.setForeground(Color.BLACK);
        add(q022);
        q022.setFont(Qq0e1);

        JTextField A2 = new JTextField();
        A2.setBounds (585,398,254,28);
        A2.setForeground(Color.BLACK);
        A2.setBackground(new Color(101, 52, 216, 0));
        A2.setBorder(null);
        A2.setEditable(true);
        A2.setOpaque(false);
        add(A2);
        A2.setFont(Atet1);

        JLabel q03 = new JLabel ("Last Name");
        q03.setBounds(335,444,196,24);
        q03.setForeground(Color.BLACK);
        add(q03);
        q03.setFont(Qq0e1);

        JTextField A3 = new JTextField();
        A3.setBounds (585,442,254,28);
        A3.setForeground(Color.BLACK);
        A3.setBackground(new Color(101, 52, 216, 0));
        A3.setBorder(null);
        A3.setEditable(false);
        A3.setOpaque(false);
        add(A3);
        A3.setFont(Atet1);

        JLabel q04 = new JLabel ("Address");
        q04.setBounds(335,488,195,24);
        q04.setForeground(Color.BLACK);
        add(q04);
        q04.setFont(Qq0e1);

        JTextField A4 = new JTextField();
        A4.setBounds (585,486,254,28);
        A4.setForeground(Color.BLACK);
        A4.setBackground(new Color(101, 52, 216, 0));
        A4.setBorder(null);
        A4.setEditable(true);
        A4.setOpaque(false);
        add(A4);
        A4.setFont(Atet1);

        JLabel q05 = new JLabel ("Telephone Numbers");
        q05.setBounds(335,532,197,24);
        q05.setForeground(Color.BLACK);
        add(q05);
        q05.setFont(Qq0e1);

        JTextField A5 = new JTextField();
        A5.setBounds (585,530,254,28);
        A5.setForeground(Color.BLACK);
        A5.setBackground(new Color(101, 52, 216, 0));
        A5.setBorder(null);
        A5.setEditable(true);
        A5.setOpaque(false);
        add(A5);
        A5.setFont(Atet1);

        JLabel q06 = new JLabel ("Date of birth");
        q06.setBounds(335,576,200,24);
        q06.setForeground(Color.BLACK);
        add(q06);
        q06.setFont(Qq0e1);

        JTextField A6 = new JTextField();
        A6.setBounds (585,574,254,28);
        A6.setForeground(Color.BLACK);
        A6.setBackground(new Color(101, 52, 216, 0));
        A6.setBorder(null);
        A6.setEditable(true);
        A6.setOpaque(false);

        // Create a JDialog to act as a popup for the calendar
        JDialog calendarDialog = new JDialog(this, "Select Date", true);
        calendarDialog.setSize(338, 232);
        calendarDialog.setLayout(null);

        // Create a new JCalendar component
        JCalendar calendar = new JCalendar();
        calendar.setBounds(0, 0, 320, 190);

        // Add the calendar to the dialog
        calendarDialog.add(calendar);

        // Add a property change listener to the calendar to update the text field when a date is selected
        calendar.addPropertyChangeListener("calendar", evt -> {
            Date selectedDate = calendar.getDate();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String dateString = dateFormat.format(selectedDate);
            A6.setText(dateString);
            calendarDialog.setVisible(false); // Hide the dialog after selecting a date
        });

        // Add a mouse listener to the text field to show the calendar dialog when clicked
        A6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                calendarDialog.setLocationRelativeTo(A6); // Position the dialog relative to the text field
                calendarDialog.setVisible(true); // Show the dialog
            }
        });

        add(A6);

        A6.setFont(Atet1);


        JLabel q07 = new JLabel ("Change Password");
        q07.setBounds(335,620,200,24);
        q07.setForeground(Color.BLACK);
        add(q07);
        q07.setFont(Qq0e1);

        JTextField A7 = new JTextField();
        A7.setBounds (585,618,254,28);
        A7.setForeground(Color.BLACK);
        A7.setBackground(new Color(101, 52, 216, 0));
        A7.setBorder(null);
        A7.setEditable(true);
        A7.setOpaque(false);
        add(A7);
        A7.setFont(Atet1);

        JLabel q09 = new JLabel ("Last Update  = ");
        q09.setBounds(274,699,300,20);
        q09.setForeground(Color.BLACK);
        add(q09);
        q09.setFont(Qq09);
//------------------------------------------------------------------------------------------------------------------------------

        JLabel update = new JLabel();
        update.setIcon(new ImageIcon(getClass().getResource("img/update.png")));
        update.setBounds(932,687,104,29);
        add(update);

        JLabel updatex = new JLabel();
        updatex.setIcon(new ImageIcon(getClass().getResource("img/update D.png")));
        add(updatex);

        update.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                updatex.setBounds(930,684,108,34);
                update.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        update.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                updatex.setBounds(0,0,0,0);
            }
        });
//======================================================================================================================

        JLabel profl = new JLabel();
        profl.setIcon(new ImageIcon(getClass().getResource("img/up pro.png")));
        add(profl);

//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        JLabel a = new JLabel();
        a.setBounds(0,0,1200,753);
        a.setIcon(new ImageIcon(getClass().getResource("img/D_Settings.png")));
        add(a);
//---------------------------------------------------------------------------------------------------------------------------------------------------------------

        JLabel prof1 = new JLabel();
        prof1.setIcon(new ImageIcon(getClass().getResource("img/pro set.png")));
        prof1.setBounds(972,357,108,115);
        add(prof1);


        prof1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                profl.setBounds(968,357,116,118);
                profl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        prof1.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                profl.setBounds(0,0,0,0);
            }
        });

//----------------------------------------------------------------------------------------------------------------------------------------------------------------

        prof1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Select an image file");

                int userSelection = fileChooser.showOpenDialog(null);
                if (userSelection == JFileChooser.APPROVE_OPTION) {
                    fileToSave = fileChooser.getSelectedFile();
                    System.out.println("Selected file: " + fileToSave);

                    try {
                        // Establish database connection
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system", "root", "");

                        // Get UID (assuming you have it available as a variable or method)

                        // Check if the UID already exists
                        String checkSql = "SELECT COUNT(*) FROM user_images WHERE UID = ?";
                        PreparedStatement checkPre = con.prepareStatement(checkSql);
                        checkPre.setString(1, UID);
                        ResultSet rs = checkPre.executeQuery();
                        rs.next();
                        int count = rs.getInt(1);
                        rs.close();
                        checkPre.close();

                        String sql;
                        if (count > 0) {
                            // Update existing record
                            sql = "UPDATE user_images SET imageName = ?, imageData = ? WHERE UID = ?";
                        } else {
                            // Insert new record
                            sql = "INSERT INTO user_images (UID, imageName, imageData) VALUES (?, ?, ?)";
                        }

                        PreparedStatement pre = con.prepareStatement(sql);

                        // Set the values
                        if (count > 0) {
                            pre.setString(1, fileToSave.getName());
                            FileInputStream fin = new FileInputStream(fileToSave);
                            pre.setBinaryStream(2, fin, (int) fileToSave.length());
                            pre.setString(3, UID);
                        } else {
                            pre.setString(1, UID);
                            pre.setString(2, fileToSave.getName());
                            FileInputStream fin = new FileInputStream(fileToSave);
                            pre.setBinaryStream(3, fin, (int) fileToSave.length());
                        }

                        // Execute the query
                        pre.executeUpdate();

                        // Close the resources
                        pre.close();
                        con.close();

                        System.out.println("Image saved or updated in database.");
                        D_setting Frame = new D_setting();
                        dispose();

                    } catch (SQLException sqle) {
                        sqle.printStackTrace();
                    } catch (FileNotFoundException fnfe) {
                        fnfe.printStackTrace();
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                    }
                }
            }
        });
//------------------------------------------------------------------------------------------------------------------------------
        // Retrieve and display the image
        try {
            // Establish database connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system", "root", "");

            // Get UID (assuming you have it available as a variable or method)

            // Prepare the statement to retrieve image
            String sql = "SELECT imageData FROM user_images WHERE UID = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, UID);

            // Execute the query and get the result
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                InputStream is = rs.getBinaryStream("imageData");
                BufferedImage img = ImageIO.read(is);
                ImageIcon icon = new ImageIcon(img);
                prof1.setIcon(icon);
            }

            // Close the resources
            rs.close();
            pre.close();
            con.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
//------------------------------------------------------------------------------------------------------------------------------


// ------------------------------------------------------------------------------------------------------------------------------


//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------

//------------------------------------------------------------------------------------------------------------------------------


//------------------------------------------------------------------------------------------------------------------------------


////======================================================================================================================

//======================================================================================================================


//------------------------------------------------------------------------------------------------------------------------------

// ------------------------------------------------------------------------------------------------------------------------------

//------------------------------------------------------------------------------------------------------------------------------

//----------------------------------------------------------------------------------------------------------




//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        try{
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system","root","");
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM user_register WHERE user_id = "+Integer.parseInt(UID));
            while(rs.next()){
                String backup_code= rs.getString("backup_code");
                String user_id= rs.getString("user_id");
                String first_name= rs.getString("first_name");
                String last_name= rs.getString("last_name");
                String Date_of_birth= rs.getString("Date_of_birth");
                String tel1= rs.getString("Tel1");
                String Password= rs.getString("password");
                String Address= rs.getString("Address");
                String update_date= rs.getString("update_date");

                name.setText("Dr."+ first_name+" "+last_name);
                q01.setText("Your Backup Code  = "+ backup_code);
                A1.setText(user_id);
                A2.setText(first_name);
                A3.setText(last_name);
                A4.setText(Address);
                A5.setText(tel1);
                A6.setText(Date_of_birth);
                A7.setText(Password);
                q09.setText("Last Update  =  "+ update_date);
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }
//------------------------------------------------------------------------------------------------------------------------------
        update.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                PreparedStatement pst;
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system","root","");

                    java.sql.Statement stmt = con.createStatement();
                    pst = con.prepareStatement("update user_register set first_name=?,Address=?,Tel1=?,Date_of_birth=?,password=?,update_date=? WHERE user_id ="+Integer.parseInt(UID));

                    LocalDateTime myDateObj = LocalDateTime.now();
                    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

                    String formattedDate = myDateObj.format(myFormatObj);
                    System.out.println("Date and Time: " + formattedDate);

                    {

                        pst.setString(1, A2.getText());
                        pst.setString(2, A4.getText());
                        pst.setString(3, A5.getText());
                        pst.setString(4, A6.getText());
                        pst.setString(5, A7.getText());
                        pst.setString(6, formattedDate);

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "update ok","success",JOptionPane.WARNING_MESSAGE);

                        login Frame = new login();
                        dispose();

                    }
                    stmt.close();
                    con.close();
                }catch (Exception eo){
                    System.out.println(eo);
                }
            }
        });

//----------------------------------------------------------------------------------------------------------------------------------------------------------------

        setSize (1200,753);
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
