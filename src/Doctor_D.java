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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Doctor_D extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;
    String UID = login.userid();
    JLabel bord,pannel1,pannel2,status;
    Doctor_D(){
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
        Font lessonstext1 = new Font ("Arial Rounded MT",Font.BOLD,24);



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
        T1.setForeground(new Color(0, 0, 0, 255));
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
        T4.setForeground(new Color(250, 250, 250, 255));
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
                name.setText("Dr."+ first_name+" "+last_name);
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }
//------------------------------------------------------------------------------------------------------------------------------

















//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------

// ------------------------------------------------------------------------------------------------------------------------------


//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------


//------------------------------------------------------------------------------------------------------------------------------


////======================================================================================================================




//======================================================================================================================

//----------------------------------------------------------------------------------------------------------------------------------------------------------------

        JLabel lessonstext = new JLabel ("Types of patients");
        lessonstext.setBounds(271,284,199,28);
        lessonstext.setForeground(new Color(0, 0, 0,250));
        add(lessonstext);
        lessonstext.setFont(lessonstext1);

        JLabel sa = new JLabel ("Upcoming Appointment");
        sa.setBounds(631,284,275,28);
        sa.setForeground(new Color(0, 0, 0,250));
        add(sa);
        sa.setFont(lessonstext1);

        JLabel we = new JLabel ("Patient Ward");
        we.setBounds(270,513,151,28);
        we.setForeground(new Color(0, 0, 0,250));
        add(we);
        we.setFont(lessonstext1);

        JLabel re = new JLabel ("Appointment History");
        re.setBounds(546,513,240,28);
        re.setForeground(new Color(0, 0, 0,250));
        add(re);
        re.setFont(lessonstext1);
//------------------------------------------------------------------------------------------------------------------------------


// ------------------------------------------------------------------------------------------------------------------------------

//------------------------------------------------------------------------------------------------------------------------------

//----------------------------------------------------------------------------------------------------------



//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
//-----Database--------------------------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        JFrame frame = new JFrame();
        JTable table = new JTable();

        Object[] columns = {"Patients NIC"," Full Name","Telephone","Age","Type","Date Time"};
        DefaultTableModel model;
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);

        table.setModel(model);
        table.setBackground(Color.LIGHT_GRAY);
        table.setForeground(Color.black);

        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(518, 547, 646, 161);
        frame.setLayout(null);
        add(pane);

        Object[] row = new Object[6];

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM patient_register WHERE Doctor_id = '"+Integer.parseInt(UID)+ "' && Appointment_status ='"+status.getText()+"'");

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            while (rs.next()) {
                String birthdateStr = rs.getString("Date_of_birth");
                LocalDate birthdate;
                try {
                    birthdate = LocalDate.parse(birthdateStr, formatter);
                } catch (DateTimeParseException e) {
                    System.out.println("Error parsing date: " + e.getMessage());
                    continue;
                }

                LocalDate currentDate = LocalDate.now();
                Period age = Period.between(birthdate, currentDate);

                row[0] = rs.getString("NIC_Number");
                row[1] = rs.getString("First_Name") + " " + rs.getString("Last_Name");
                row[2] = rs.getString("Telephone_Numbers");
                row[3] = age.getYears();
                row[4] = rs.getString("Type");
                row[5] = rs.getString("Date") + "/ " + rs.getString("Time");

                model.addRow(row);
            }
        } catch (Exception ew) {
            System.out.println(ew);
        }
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        JFrame frame1 = new JFrame();
        JTable table1 = new JTable();

        Object[] columns1 = {"Patients NIC"," Full Name","Telephone","Age","Type"};
        DefaultTableModel model1;
        model1 = new DefaultTableModel();
        model1.setColumnIdentifiers(columns1);

        table1.setModel(model1);
        table1.setBackground(Color.LIGHT_GRAY);
        table1.setForeground(Color.black);

        JScrollPane pane1 = new JScrollPane(table1);
        pane1.setBounds(604, 319, 560, 147);
        frame1.setLayout(null);
        add(pane1);

        Object[] row1 = new Object[5];

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM patient_register WHERE Doctor_id = '"+Integer.parseInt(UID)+ "' && Appointment_status ='"+pannel1.getText()+"'");

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            while (rs.next()) {
                String birthdateStr = rs.getString("Date_of_birth");
                LocalDate birthdate;
                try {
                    birthdate = LocalDate.parse(birthdateStr, formatter);
                } catch (DateTimeParseException e) {
                    System.out.println("Error parsing date: " + e.getMessage());
                    continue;
                }

                LocalDate currentDate = LocalDate.now();
                Period age = Period.between(birthdate, currentDate);

                row1[0] = rs.getString("NIC_Number");
                row1[1] = rs.getString("First_Name") + " " + rs.getString("Last_Name");
                row1[2] = rs.getString("Telephone_Numbers");
                row1[3] = age.getYears();
                row1[4] = rs.getString("Type");

                model1.addRow(row1);
            }
        } catch (Exception ew) {
            System.out.println(ew);
        }
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------

        JFrame frame2 = new JFrame();
        JTable table2 = new JTable();

        Object[] columns2 = {"Patients NIC"," Full Name"};
        DefaultTableModel model2;
        model2 = new DefaultTableModel();
        model2.setColumnIdentifiers(columns2);

        table2.setModel(model2);
        table2.setBackground(Color.LIGHT_GRAY);
        table2.setForeground(Color.black);

        JScrollPane pane2 = new JScrollPane(table2);
        pane2.setBounds(254, 547, 227, 161);
        frame2.setLayout(null);
        add(pane2);

        Object[] row2 = new Object[2];

        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system", "root", "");
                 PreparedStatement pst = con.prepareStatement("SELECT * FROM patient_update INNER JOIN patient_register ON patient_update.NIC_Number = patient_register.NIC_Number WHERE patient_register.Doctor_id = ? AND patient_update.status = ?")) {

                pst.setInt(1, Integer.parseInt(UID));
                pst.setString(2, pannel2.getText());
                try (ResultSet rs = pst.executeQuery()) {

                    while (rs.next()) {

                        row2[0] = rs.getString("NIC_Number");
                        row2[1] = rs.getString("First_Name") + " " + rs.getString("Last_Name");

                        model2.addRow(row2);
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
//------------------------------------------------------------------------------------------------------------------------------
        JLabel chartlabel1 = new JLabel ("Child");
        chartlabel1.setBounds(297,343,50,22);
        chartlabel1.setForeground(Color.black);
        add(chartlabel1);
        chartlabel1.setFont(Exit);

        JLabel chartlabel2 = new JLabel ("Young");
        chartlabel2.setBounds(297,373,60,22);
        chartlabel2.setForeground(Color.black);
        add(chartlabel2);
        chartlabel2.setFont(Exit);

        JLabel chartlabel3 = new JLabel ("Old");
        chartlabel3.setBounds(297,403,35,22);
        chartlabel3.setForeground(Color.black);
        add(chartlabel3);
        chartlabel3.setFont(Exit);

//------------------------------------------------------------------------------------------------------------------------------
        JLabel a = new JLabel();
        a.setBounds(0,0,1200,753);
        a.setIcon(new ImageIcon(getClass().getResource("img/Doctor_home.png")));
        add(a);
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        String jdbcUrl = "jdbc:mysql://localhost/hospital_management_system";
        String username = "root";
        String password = "";

        int childrenCount = 0;
        int youngCount = 0;
        int oldCount = 0;

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establishing a connection
            try (Connection con = DriverManager.getConnection(jdbcUrl, username, password);
                 PreparedStatement pst = con.prepareStatement(
                         "SELECT * FROM patient_update " +
                                 "INNER JOIN patient_register ON patient_update.NIC_Number = patient_register.NIC_Number " +
                                 "WHERE patient_register.Doctor_id = ? AND patient_update.status = ?")) {

                pst.setInt(1, Integer.parseInt(UID));
                pst.setString(2,  pannel2.getText());

                // Executing the query and processing the result set
                try (ResultSet rs = pst.executeQuery()) {
                    LocalDate currentDate = LocalDate.now();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                    while (rs.next()) {
                        String birthdateStr = rs.getString("Date_of_birth"); // Assume the birthdate is stored as a string in dd/MM/yyyy format
                        LocalDate birthdate = LocalDate.parse(birthdateStr, formatter);
                        int age = Period.between(birthdate, currentDate).getYears();

                        if (age < 15) {
                            childrenCount++;
                        } else if (age >= 15 && age <= 39) {
                            youngCount++;
                        } else if (age >= 40) {
                            oldCount++;
                        }
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }


        // Create dataset
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Child", childrenCount);
        dataset.setValue("Young", youngCount);
        dataset.setValue("Old", oldCount);

        // Create chart
        JFreeChart chart = ChartFactory.createPieChart(
                "",  // chart title
                dataset,             // dataset
                false,                // include legend
                true,
                true
        );

        // Customize the chart
        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setShadowPaint(null); // Remove shadow effect
        plot.setLabelGenerator(null); // Disable section labels

        // Customizing section colors by index
        plot.setSectionPaint(0, new Color(76, 175, 80, 255)); // Child
        plot.setSectionPaint(1, new Color(255,193,7,250)); // Young
        plot.setSectionPaint(2, new Color(33, 150, 243, 255)); // Old

        // Create Panel
        ChartPanel panel = new ChartPanel(chart);
        panel.setLayout(null); // Set layout to null for absolute positioning
        panel.setBounds(328, 296, 299, 189); // Adjusted bounds to fit the chart properly
        panel.setPreferredSize(new Dimension(300, 300)); // Set preferred size to be square

        panel.setBorder(null);
        // Add Panel to Frame
        add(panel);

        panel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Doctor_D  Frame = new Doctor_D ();
                dispose();
            }
        });
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
}
