import com.toedter.calendar.JCalendar;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Enumeration;

public class S_add_patients extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;
    String UID = login.userid();
    JLabel userward,ward,warddeds,status,userdid,asta;
    ButtonGroup genderGroup;
    S_add_patients(){
        setLayout(null);


        Font Exit = new Font ("calibri",Font.BOLD,20);
        Font text1 = new Font ("Arial Rounded MT",Font.BOLD,18);
        Font GrClass = new Font ("Segoe UI",Font.BOLD,22);
        Font Usname = new Font ("Arial Rounded MT",Font.BOLD,16);
        Font calandertext = new Font ("Segoe UI",Font.BOLD,25);
        Font Atel3 = new Font ("Arial Rounded MT",Font.BOLD,13);
        Font Atetl = new Font ("calibri",Font.BOLD,15);
        Font name1 = new Font ("Arial Rounded MT",Font.BOLD,22);
        Font Qq02 = new Font ("Segoe UI",Font.PLAIN,18);
        Font Atet1 = new Font ("Arial Rounded MT",Font.BOLD,17);
        Font duraa = new Font ("Arial Rounded MT",Font.PLAIN,14);
        Font fdas = new Font ("Arial Rounded MT",Font.BOLD,33);


        userward = new JLabel();
        ward = new JLabel("Ward");
        warddeds = new JLabel("");
        status = new JLabel("Doctor");
        userdid = new JLabel("");
        asta = new JLabel("available");
//------------------------------------------------------------------------------------------------------------------------------
        JLabel GClass = new JLabel ("<html>Gampola General<br><center>Hospital</html>");
        GClass.setBounds(22,90,184,55);
        GClass.setForeground(new Color(250, 250, 250,250));
        add(GClass);
        GClass.setFont(GrClass);
//------------------------------------------------------------------------------------------------------------------------------
        JLabel i1 = new JLabel();
        i1.setIcon(new ImageIcon(getClass().getResource("img/S_ico.png")));
        i1.setBounds(19,192,18,273);
        add(i1);

        i1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                i1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });
//------------------------------------------------------------------------------
        JLabel T1 = new JLabel ("Dashboard");
        T1.setBounds(45,189,97,21);
        T1.setForeground(new Color(255, 255, 255,250));
        add(T1);
        T1.setFont(text1);

        JLabel T2 = new JLabel ("Add Patients");
        T2.setBounds(45,253,113,21);
        T2.setForeground(new Color(0, 0, 0, 255));
        add(T2);
        T2.setFont(text1);

        JLabel T3 = new JLabel ("Patient Ward");
        T3.setBounds(47,317,113,21);
        T3.setForeground(new Color(250, 250, 250, 255));
        add(T3);
        T3.setFont(text1);

        JLabel T4 = new JLabel ("Staff");
        T4.setBounds(48,381,50,21);
        T4.setForeground(new Color(250, 250, 250, 255));
        add(T4);
        T4.setFont(text1);

        JLabel T5 = new JLabel ("Settings");
        T5.setBounds(48,445,72,21);
        T5.setForeground(new Color(250, 250, 250, 255));
        add(T5);
        T5.setFont(text1);
////==============================================================================
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
                Sister_D  Frame = new Sister_D ();
                dispose();
            }
        });
////==============================================================================
        T2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                T2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                S_add_patients  Frame = new S_add_patients ();
                dispose();
            }
        });

////==============================================================================
        T3.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                T3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                S_Patient_Ward  Frame = new S_Patient_Ward ();
                dispose();
            }
        });
////==============================================================================
        T4.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                T4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                S_Staff  Frame = new S_Staff ();
                dispose();
            }
        });
////==============================================================================
        T5.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                T5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T5.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                S_setting Frame = new S_setting ();
                dispose();
            }
        });
////==============================================================================
//------------------------------------------------------------------------------------------------------------------------------
        JLabel login = new JLabel();
        login.setIcon(new ImageIcon(getClass().getResource("img/logout.png")));
        login.setBounds(36,685,93,28);
        add(login);

        login.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            }
        });
//------------------------------------------------------------------------------
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
                    preparedStmt.setString(3,("Sister"));
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
        JLabel Uname = new JLabel ("<html><center>Number of<br>beds</html>");
        Uname.setBounds(275,127,100,40);
        Uname.setForeground(new Color(0, 0, 0,250));
        add(Uname);
        Uname.setFont(Usname);

        JLabel cat1 = new JLabel ("25");
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

        JLabel subjecttext = new JLabel ("<html>Number of<br><center>Staff</html>");
        subjecttext.setBounds(569,127,108,40);
        subjecttext.setForeground(new Color(0, 0, 0,250));
        add(subjecttext);
        subjecttext.setFont(Usname);

        JLabel lessons = new JLabel ("12");
        lessons.setBounds(597,170,57,28);
        lessons.setForeground(new Color(0, 0, 0,250));
        add(lessons);
        lessons.setFont(calandertext);
//------------------------------------------------------------------------------
        JLabel bord = new JLabel();
        add(bord);

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
//====================================================================================
        b1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                bord.setIcon(new ImageIcon(getClass().getResource("img/DH1.png")));
                bord.setBounds(250,117,131,92);
            }
        });

        b1.addMouseListener(new MouseAdapter() {public void mouseExited(MouseEvent e) {
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

        b2.addMouseListener(new MouseAdapter() {public void mouseExited(MouseEvent e) {
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
//------------------------------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------------------------------
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
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        JLabel name = new JLabel ("Sister");
        name.setBounds(870,11,167,26);
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
                S_setting  Frame = new S_setting ();
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
                S_setting  Frame = new S_setting ();
                dispose();
            }
        });
        noti.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                noti.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });
//------------------------------------------------------------------------------------------------------------------------------
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
//------------------------------------------------------------------------------------------------------------------------------
//====================================================================================
        try{
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system","root","");
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM user_register WHERE user_id = "+Integer.parseInt(UID));
            while(rs.next()){
                String first_name= rs.getString("first_name");
                String last_name= rs.getString("last_name");
                String it= rs.getString("ward_no");
                userward.setText(it);
                name.setText(first_name+" "+last_name);
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }
//=================================
        try{
            Connection con; Statement st; ResultSet rs;
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system","root","");
            st=con.createStatement();
            rs=st.executeQuery("SELECT COUNT(NIC_Number) FROM patient_update  WHERE ward_no = '"+userward.getText()+ "' && status ='"+ward.getText()+ "'");
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
//=================================
        try{
            Connection con; Statement st; ResultSet rs;
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system","root","");
            st=con.createStatement();
            rs=st.executeQuery("SELECT * FROM ward_details  WHERE ward_no = '"+userward.getText()+ "'");
            while(rs.next()){
                String it= rs.getString("ward_beds");
                warddeds.setText(it);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
//=================================
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(user_id) FROM user_register WHERE ward_no = '"+userward.getText()+ "'");
            int i = 0;
            while (rs.next())
            {
                i=rs.getInt(1);
            }
            lessons.setText(""+i);
            con.close();
            st.close();
            rs.close();
        } catch (Exception ew) {
            System.out.println(ew);
        }
//=================================
        int v11 = Integer.parseInt(warddeds.getText());
        int v21 = Integer.parseInt((subject.getText()));
        int tot = v11-v21;
        cat1.setText(""+tot);
//====================================================================================
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        JLabel topic = new JLabel ("Add Patients");
        topic.setBounds(250,61,330,43);
        topic.setForeground(new Color(0, 0, 0, 255));
        add(topic);
        topic.setFont(fdas);

        JLabel q02 = new JLabel ("NIC Number");
        q02.setBounds(265,281,194,24);
        q02.setForeground(Color.BLACK);
        add(q02);
        q02.setFont(Qq02);

        JTextField A1 = new JTextField();
        A1.setBounds (500,279,254,28);
        A1.setForeground(Color.BLACK);
        A1.setBackground(new Color(101, 52, 216, 0));
        A1.setBorder(null);
        A1.setEditable(true);
        A1.setOpaque(false);
        add(A1);
        A1.setFont(Atet1);

        JLabel q022 = new JLabel ("First Name");
        q022.setBounds(265,325,194,24);
        q022.setForeground(Color.BLACK);
        add(q022);
        q022.setFont(Qq02);

        JTextField A2 = new JTextField();
        A2.setBounds (500,323,254,28);
        A2.setForeground(Color.BLACK);
        A2.setBackground(new Color(101, 52, 216, 0));
        A2.setBorder(null);
        A2.setEditable(true);
        A2.setOpaque(false);
        add(A2);
        A2.setFont(Atet1);

        JLabel q03 = new JLabel ("Last Name");
        q03.setBounds(265,369,196,24);
        q03.setForeground(Color.BLACK);
        add(q03);
        q03.setFont(Qq02);

        JTextField A3 = new JTextField();
        A3.setBounds (500,367,254,28);
        A3.setForeground(Color.BLACK);
        A3.setBackground(new Color(101, 52, 216, 0));
        A3.setBorder(null);
        A3.setEditable(true);
        A3.setOpaque(false);
        add(A3);
        A3.setFont(Atet1);

        JLabel q04 = new JLabel ("Address");
        q04.setBounds(265,413,195,24);
        q04.setForeground(Color.BLACK);
        add(q04);
        q04.setFont(Qq02);

        JTextField A4 = new JTextField();
        A4.setBounds (500,411,254,28);
        A4.setForeground(Color.BLACK);
        A4.setBackground(new Color(101, 52, 216, 0));
        A4.setBorder(null);
        A4.setEditable(true);
        A4.setOpaque(false);
        add(A4);
        A4.setFont(Atet1);

        JLabel q05 = new JLabel ("Telephone Numbers");
        q05.setBounds(265,457,197,24);
        q05.setForeground(Color.BLACK);
        add(q05);
        q05.setFont(Qq02);

        JTextField A5 = new JTextField();
        A5.setBounds (500,455,254,28);
        A5.setForeground(Color.BLACK);
        A5.setBackground(new Color(101, 52, 216, 0));
        A5.setBorder(null);
        A5.setEditable(true);
        A5.setOpaque(false);
        add(A5);
        A5.setFont(Atet1);

        JLabel q06 = new JLabel ("Date of birth");
        q06.setBounds(265,501,200,24);
        q06.setForeground(Color.BLACK);
        add(q06);
        q06.setFont(Qq02);

        JTextField A6 = new JTextField();
        A6.setBounds(492, 499, 242, 28);
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

        JLabel q01 = new JLabel ("Type");
        q01.setBounds(265,545,50,24);
        q01.setForeground(Color.BLACK);
        add(q01);
        q01.setFont(Qq02);

        JComboBox dura = new JComboBox();
        dura.setBounds(491,543,274,28);
        dura.setForeground(Color.BLACK);
        dura.addItem("Select");
        dura.addItem("Clinic");
        dura.addItem("Vehicle Accident");
        dura.addItem("Accident");
        dura.addItem("From another hospital");
        dura.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(dura);
        dura.setFont(duraa);

        JLabel q07 = new JLabel ("Note");
        q07.setBounds(265,581,200,24);
        q07.setForeground(Color.BLACK);
        add(q07);
        q07.setFont(Qq02);

        JTextArea A7 = new JTextArea();
        JScrollPane scrol = new JScrollPane(A7);
        scrol.setBounds(490,579,553,83);
        A7.setLineWrap(true);
        A7.setBorder(null);
        A7.setEditable(true);
        A7.setOpaque(false);
        A7.setBackground(new Color(253, 253, 254, 250));
        add(scrol);
        A7.setFont(Atet1);

        JLabel q08 = new JLabel ("Gender");
        q08.setBounds(800,277,86,24);
        q08.setForeground(Color.BLACK);
        add(q08);
        q08.setFont(Qq02);

        JLabel q09 = new JLabel ("Male");
        q09.setBounds(947,278,67,24);
        q09.setForeground(Color.BLACK);
        add(q09);
        q09.setFont(Qq02);

        JLabel q10 = new JLabel ("Female");
        q10.setBounds(1060,278,85,24);
        q10.setForeground(Color.BLACK);
        add(q10);
        q10.setFont(Qq02);

        // Create radio button
        JRadioButton male = new JRadioButton("Male", true);
        male.setBackground(new Color(250, 250, 250, 250));  // Fully opaque white color
        male.setBounds(921,281,20,20);  // Adjust width for text visibility

        // Create another radio button for demonstration
        JRadioButton female = new JRadioButton("Female");
        female.setBackground(new Color(250, 250, 250, 250));  // Fully opaque white color
        female.setBounds(1030, 281, 20, 20);  // Adjust width for text visibility

        // Group the radio buttons
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        // Add radio buttons to the frame
        add(male);
        add(female);
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        JLabel q11 = new JLabel ("Doctor");
        q11.setBounds(800,323,63,24);
        q11.setForeground(Color.BLACK);
        add(q11);
        q11.setFont(Atet1);

        JComboBox dura2 = new JComboBox();
        dura2.setBounds(875,321,249,28);
        dura2.setForeground(Color.BLACK);
        dura2.addItem("Select Doctor");
        dura2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(dura2);
        dura2.setFont(duraa);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system","root","");
            Statement st = (Statement) con.createStatement ();
            ResultSet rs = st.executeQuery("SELECT * FROM user_register WHERE User ='"+status.getText()+"'");
            while(rs.next()){
                String firstName = rs.getString("first_name");
                String lastname = rs.getString("last_name");
                dura2.addItem(firstName+" "+lastname);
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        JLabel update = new JLabel();
        update.setIcon(new ImageIcon(getClass().getResource("img/update.png")));
        update.setBounds(1020,685,104,28);
        add(update);

        JLabel updatex = new JLabel();
        updatex.setIcon(new ImageIcon(getClass().getResource("img/update D.png")));
        add(updatex);

        update.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                updatex.setBounds(1018,682,108,34);
                update.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        update.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                updatex.setBounds(0,0,0,0);
            }
        });
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        dura2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) { // Check if an item is selected
                    String selectedItem = (String) dura2.getSelectedItem();
                    if (selectedItem != null) { // Ensure selected item is not null
                        Connection con = null;
                        PreparedStatement pstmt = null;
                        ResultSet rs = null;
                        try {
                            // Establish database connection
                            con = DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system", "root", "");

                            // Prepare SQL statement with parameterized query
                            String sql = "SELECT user_id FROM user_register WHERE CONCAT(first_name, ' ', last_name) = ?";
                            pstmt = con.prepareStatement(sql);
                            pstmt.setString(1, selectedItem); // Set the parameter value

                            // Execute query
                            rs = pstmt.executeQuery();

                            // Process results
                            if (rs.next()) {
                                String userId = rs.getString("user_id");
                                userdid.setText(userId);
                            }
                        } catch (SQLException ex) {
                            // Handle database errors
                            ex.printStackTrace(); // Consider logging instead
                        } finally {
                            // Close database resources in reverse order of creation
                            try {
                                if (rs != null) {
                                    rs.close();
                                }
                                if (pstmt != null) {
                                    pstmt.close();
                                }
                                if (con != null) {
                                    con.close();
                                }
                            } catch (SQLException ex) {
                                ex.printStackTrace(); // Handle closing errors
                            }
                        }
                    }
                }
            }
        });
//------------------------------------------------------------------------------
        update.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                if(A1.getText().isEmpty() && A2.getText().isEmpty() && A3.getText().isEmpty() && A4.getText().isEmpty() && A5.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, " Type Items ","Type Items ",JOptionPane.WARNING_MESSAGE);
                } else{

                    Connection con;
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        con = DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system","root","");

                        String query = "insert into patient_register (NIC_Number,First_Name,Last_Name,Gender,Address,Telephone_Numbers,Date_of_birth,Type,Note,Date,Time,Doctor_id,Appointment_status)" + " values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
                        PreparedStatement preparedStmt = con.prepareStatement(query);

                        // Get current date and time
                        LocalDate currentDate = LocalDate.now();
                        LocalTime currentTime = LocalTime.now();
                        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

                        String formattedDate = currentDate.format(dateFormatter);
                        String formattedTime = currentTime.format(timeFormatter);

                        preparedStmt.setString(1, A1.getText());
                        preparedStmt.setString(2, A2.getText());
                        preparedStmt.setString(3, A3.getText());
                        preparedStmt.setString(4, getSelectedGender(genderGroup)); // Use the method to get selected gender
                        preparedStmt.setString(5, A4.getText());
                        preparedStmt.setString(6, A5.getText());
                        preparedStmt.setString(7, A6.getText());
                        preparedStmt.setString(8, (String) dura.getSelectedItem());
                        preparedStmt.setString(9, A7.getText());
                        preparedStmt.setString(10, formattedDate);
                        preparedStmt.setString(11, formattedTime);
                        preparedStmt.setString(12,userdid.getText());
                        preparedStmt.setString(13, asta.getText());

                        JOptionPane.showMessageDialog(null, " Patient Register Success", "Register ok ", JOptionPane.WARNING_MESSAGE);
                        preparedStmt.execute();

                        S_add_patients  Frame = new S_add_patients ();
                        dispose();

                        con.close();
                    }
                    catch (ClassNotFoundException | SQLException en)
                    {
                        System.err.println("Got an excepttion!");
                        System.err.println(en.getMessage());
                    }
                }
            }
        });
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        JLabel a = new JLabel();
        a.setBounds(0,0,1200,753);
        a.setIcon(new ImageIcon(getClass().getResource("img/S_add_patients.png")));
        add(a);
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
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

    private String getSelectedGender(ButtonGroup group) {
        for (Enumeration<AbstractButton> buttons = group.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                return button.getText();
            }
        }
        return null; // or you can return a default value
    }

}
