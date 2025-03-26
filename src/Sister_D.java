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

public class Sister_D extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;
    String UID = login.userid();

    JLabel userward,ward,warddeds;

    Sister_D(){
        setLayout(null);


        Font Exit = new Font ("calibri",Font.BOLD,20);
        Font text1 = new Font ("Arial Rounded MT",Font.BOLD,18);
        Font GrClass = new Font ("Segoe UI",Font.BOLD,22);
        Font Usname = new Font ("Arial Rounded MT",Font.BOLD,16);
        Font calandertext = new Font ("Segoe UI",Font.BOLD,25);
        Font Atel3 = new Font ("Arial Rounded MT",Font.BOLD,13);
        Font Atetl = new Font ("calibri",Font.BOLD,15);
        Font name1 = new Font ("Arial Rounded MT",Font.BOLD,22);
        Font lessonstext1 = new Font ("Arial Rounded MT",Font.BOLD,24);

        userward = new JLabel();
        ward = new JLabel("Ward");
        warddeds = new JLabel("");
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
        T1.setForeground(new Color(0, 0, 0,250));
        add(T1);
        T1.setFont(text1);

        JLabel T2 = new JLabel ("Add Patients");
        T2.setBounds(45,253,113,21);
        T2.setForeground(new Color(250, 250, 250, 255));
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
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system","root","");
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
        JLabel lessonstext = new JLabel ("Types of patients");
        lessonstext.setBounds(271,284,199,28);
        lessonstext.setForeground(new Color(0, 0, 0,250));
        add(lessonstext);
        lessonstext.setFont(lessonstext1);

        JLabel sa = new JLabel ("Staff Details");
        sa.setBounds(631,284,275,28);
        sa.setForeground(new Color(0, 0, 0,250));
        add(sa);
        sa.setFont(lessonstext1);

        JLabel we = new JLabel ("patients Details");
        we.setBounds(270,513,185,28);
        we.setForeground(new Color(0, 0, 0,250));
        add(we);
        we.setFont(lessonstext1);

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
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        JFrame frame2 = new JFrame();
        JTable table2 = new JTable();

        Object[] columns2 = {"Staff ID"," Full Name","Gender","Telephone","Age","User","Date Time"};
        DefaultTableModel model2;
        model2 = new DefaultTableModel();
        model2.setColumnIdentifiers(columns2);

        table2.setModel(model2);
        table2.setBackground(Color.LIGHT_GRAY);
        table2.setForeground(Color.black);

        JScrollPane pane2 = new JScrollPane(table2);
        pane2.setBounds(604, 315, 560, 152);
        frame2.setLayout(null);
        add(pane2);

        Object[] row2 = new Object[7];

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM user_register WHERE ward_no = '"+userward.getText()+ "'");


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

                row2[0] = rs.getString("user_id");
                row2[1] = rs.getString("first_name") + " " + rs.getString("last_name");
                row2[2] = rs.getString("Gender");
                row2[3] = rs.getString("Tel1");
                row2[4] = age.getYears();
                row2[5] = rs.getString("User");
                row2[6] = rs.getString("staff_change_date_time");

                model2.addRow(row2);
            }
        } catch (Exception ew) {
            System.out.println(ew);
        }

//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        JFrame frame1 = new JFrame();
        JTable table1 = new JTable();

        Object[] columns1 = {"Patients NIC"," Full Name","Telephone","Age","Type","Date Time"};
        DefaultTableModel model1;
        model1 = new DefaultTableModel();
        model1.setColumnIdentifiers(columns1);

        table1.setModel(model1);
        table1.setBackground(Color.LIGHT_GRAY);
        table1.setForeground(Color.black);

        JScrollPane pane1 = new JScrollPane(table1);
        pane1.setBounds(254, 549, 910, 159);
        frame1.setLayout(null);
        add(pane1);

        Object[] row = new Object[6];

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system", "root", "");

            String query = "SELECT * FROM patient_update INNER JOIN patient_register ON patient_update.NIC_Number = patient_register.NIC_Number WHERE patient_update.status = ? AND patient_update.ward_no = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, ward.getText());  // Assuming ward is a JTextField or similar
            pst.setString(2, userward.getText());  // Assuming userward is a JTextField or similar

            ResultSet rs = pst.executeQuery();

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
                model1.addRow(row);
            }
            rs.close();
            pst.close();
            con.close();
        } catch (Exception ew) {
            ew.printStackTrace();
        }

//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------


        //------------------------------------------------------------------------------
        //------------------------------------------------------------------------------
        //------------------------------------------------------------------------------
        //------------------------------------------------------------------------------
        //------------------------------------------------------------------------------
        //------------------------------------------------------------------------------
        //------------------------------------------------------------------------------
        //------------------------------------------------------------------------------


//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        JLabel a = new JLabel();
        a.setBounds(0,0,1200,753);
        a.setIcon(new ImageIcon(getClass().getResource("img/Sister_home.png")));
        add(a);
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------

        String jdbcUrl = "jdbc:mysql://localhost/hospital_management_system";
        String username = "root";
        String password = ""; // Update with your DB password

        int childrenCount = 0;
        int youngCount = 0;
        int oldCount = 0;

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establishing a connection
            try (Connection con = DriverManager.getConnection(jdbcUrl, username, password)) {
                String query = "SELECT * FROM patient_update INNER JOIN patient_register ON patient_update.NIC_Number = patient_register.NIC_Number WHERE patient_update.status = ? AND patient_update.ward_no = ?";
                try (PreparedStatement pst = con.prepareStatement(query)) {
                    pst.setString(1, ward.getText());  // Assuming ward is a JTextField or similar
                    pst.setString(2, userward.getText());  // Assuming userward is a JTextField or similar

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
                Sister_D  Frame = new Sister_D ();
                dispose();
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
