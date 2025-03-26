import com.lowagie.text.*;
import com.lowagie.text.Image;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.*;
import com.toedter.calendar.JCalendar;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class D_History extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;
    JLabel bord;
    JLabel pannel1;
    JLabel pannel2;
    JLabel status;
    JLabel wardnomber;
    static JTextField tq1;

    static JLabel name;
    static  JLabel did;
    static JLabel wardNam;
    String UID = login.userid();
    D_History(){
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
        Font Atelq3 = new Font ("Arial Rounded MT",Font.BOLD,21);




        bord = new JLabel();
        add(bord);
        pannel1 = new JLabel("available");
        pannel2 = new JLabel("Ward");
        status = new JLabel("not available");
        wardnomber = new JLabel();
        wardNam = new JLabel();
        did = new JLabel(UID);

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
        T3.setForeground(new Color(0, 0, 0, 255));
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
        name = new JLabel ("Dr. Nihal Peeris");
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
                String wardno= rs.getString("ward_no");
                name.setText("Dr."+ first_name+" "+last_name);
                wardnomber.setText(wardno);
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        try{
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system","root","");
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM ward_details WHERE ward_no = "+wardnomber.getText()+"");
            while(rs.next()){
                String wardName= rs.getString("ward_name");
                wardNam.setText(wardName);
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }
//------------------------------------------------------------------------------------------------------------------------------

        tq1 = new JTextField();
        tq1.setBounds (263,275,323,43);
        tq1.setForeground(Color.BLACK);
        tq1.setBackground(new Color(101, 52, 216, 0));
        tq1.setBorder(null);
        tq1.setEditable(true);
        tq1.setOpaque(false);

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
            tq1.setText(dateString);
            calendarDialog.setVisible(false); // Hide the dialog after selecting a date
        });

        // Add a mouse listener to the text field to show the calendar dialog when clicked
        tq1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                calendarDialog.setLocationRelativeTo(tq1); // Position the dialog relative to the text field
                calendarDialog.setVisible(true); // Show the dialog
            }
        });

        add(tq1);
        tq1.setFont(Atelq3);


        JLabel lq3 = new JLabel ("Select Date");
        lq3.setForeground(new Color(0, 0, 0, 255));
        lq3.setBounds(284,281,160,28);
        add(lq3);
        lq3.setFont(Atelq3);

        JFrame frame = new JFrame();
        JTable table = new JTable();

        Object[] columns = {"Patients NIC"," Full Name","Gender","Telephone","Age","Type","Date Time"};
        DefaultTableModel model;
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);

        table.setModel(model);
        table.setBackground(Color.LIGHT_GRAY);
        table.setForeground(Color.black);

        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(253, 338, 906, 324);
        frame.setLayout(null);
        add(pane);

        Object[] row = new Object[7];

        DocumentListener  documentListener1 = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIt(documentEvent);
                if(tq1.getText().isEmpty()){
                    lq3.setBounds(284,281,160,28);

                } else{
                    lq3.setBounds(0,0,0,0);
                }
            }

            public void insertUpdate(DocumentEvent documentEvent) {
                model.setRowCount(0);
                printIt(documentEvent);
                if(tq1.getText().isEmpty()){
                    lq3.setBounds(284,281,79,28);

                } else{
                    lq3.setBounds(0,0,0,0);
                }
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                printIt(documentEvent);
                if(tq1.getText().isEmpty()){
                    lq3.setBounds(284,281,160,28);

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
                            row[2] = rs.getString("Gender");
                            row[3] = rs.getString("Telephone_Numbers");
                            row[4] = age.getYears();
                            row[5] = rs.getString("Type");
                            row[6] = rs.getString("Date") + "/ " + rs.getString("Time");

                            model.addRow(row);
                        }
                    } catch (Exception ew) {
                        System.out.println(ew);
                    }

                } else{
                    model.setRowCount(0);
                    lq3.setBounds(0,0,0,0);
                }
            }

            private void printIt(DocumentEvent documentEvent) {
                // ta.setVisible(true);
                // ta.setText("No Information");
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system", "root", "");
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM patient_register WHERE Doctor_id = '"+Integer.parseInt(UID)+ "' && Appointment_status ='"+status.getText()+"' && Date ='"+tq1.getText()+"'");

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
                        row[2] = rs.getString("Gender");
                        row[3] = rs.getString("Telephone_Numbers");
                        row[4] = age.getYears();
                        row[5] = rs.getString("Type");
                        row[6] = rs.getString("Date") + "/ " + rs.getString("Time");

                        model.addRow(row);
                    }
                } catch (Exception ew) {
                    System.out.println(ew);
                }


            }
        };
        tq1.getDocument().addDocumentListener(documentListener1);



//----------------------------------------------------------------------------------------------------------------------------------------------------------------







// ------------------------------------------------------------------------------------------------------------------------------


//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------

//------------------------------------------------------------------------------------------------------------------------------
        JLabel topic = new JLabel ("Patient History");
        topic.setBounds(250,61,238,38);
        topic.setForeground(new Color(0, 0, 0, 255));
        add(topic);
        topic.setFont(fdas);
//------------------------------------------------------------------------------------------------------------------------------




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
                row[2] = rs.getString("Gender");
                row[3] = rs.getString("Telephone_Numbers");
                row[4] = age.getYears();
                row[5] = rs.getString("Type");
                row[6] = rs.getString("Date") + "/ " + rs.getString("Time");

                model.addRow(row);
            }
        } catch (Exception ew) {
            System.out.println(ew);
        }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        JPanel addbu = new JPanel();
        addbu.setBounds(1013,690,136,28);
        addbu.setBackground(new Color(21,21,21,0));
        add(addbu);

        addbu.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                addbu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        addbu.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                // Use JFileChooser to select the output file path
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Save PDF");
                fileChooser.setSelectedFile(new File("PatientDetails.pdf"));

                int userSelection = fileChooser.showSaveDialog(null);

                if (userSelection == JFileChooser.APPROVE_OPTION) {
                    File fileToSave = fileChooser.getSelectedFile();
                    String outputFile = fileToSave.getAbsolutePath();
                    // Image path
                    String imagePath = "/img/A 4 – 1.png";

                    try {
                        // Create a document
                        Document document = new Document();
                        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(outputFile));

                        // Open document for writing
                        document.open();

                        // Add image to the background
                        addImageToBackground(writer, imagePath, document);

                        // Add text elements
                        addTextElements(writer, document);

                        // Create a PDF table with 7 columns (combined First Name and Last Name)
                        PdfPTable table = new PdfPTable(7);
                        table.setWidthPercentage(100); // Width 100%

                        // Set column widths
                        float[] columnWidths = {2f, 4f, 1.5f, 2f, 1.5f, 2f, 2f};
                        table.setWidths(columnWidths);

                        // Add table header
                        addTableHeader(table);

                        // Fetch data and add to table
                        fetchDataAndAddToTable(table);

                        // Set table position
                        table.setTotalWidth(document.getPageSize().width() - document.leftMargin() - document.rightMargin());
                        float yPosition = document.bottomMargin() + 580; // Adjust Y position as needed
                        table.writeSelectedRows(0, -1, document.leftMargin(), yPosition, writer.getDirectContent());

                        // Close document
                        document.close();

                        File outputFile2 = new File(outputFile);

                        if (outputFile2.exists()) {
                            if (Desktop.isDesktopSupported()) {
                                Desktop.getDesktop().open(outputFile2);
                                System.out.println("PDF generated successfully: " + outputFile);
                            } else {
                                System.out.println("Awt Desktop is not supported!");
                            }
                        }

                    } catch (Exception we) {
                        we.printStackTrace();
                    }
                }
            }
        });

//------------------------------------------------------------------------------------------------------------------------------























//------------------------------------------------------------------------------------------------------------------------------
        JLabel a = new JLabel();
        a.setBounds(0,0,1200,753);
        a.setIcon(new ImageIcon(getClass().getResource("img/Doctor_history.png")));
        add(a);
//------------------------------------------------------------------------------------------------------------------------------

        setSize (1200,753);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setBackground(new Color(21,21,21,0));
        setVisible(true);
    }


    // Method to add image to the background of the document
    private static void addImageToBackground(PdfWriter writer, String imagePath, Document document) {
        try {
            // Load image
            Image image = Image.getInstance(D_History.class.getResource(imagePath));

            // Get page dimensions
            Rectangle pageSize = document.getPageSize();
            float pageWidth = document.getPageSize().width();
            float pageHeight = document.getPageSize().height();

            // Set absolute positioning
            image.setAbsolutePosition(0, 0);
            image.scaleAbsolute(pageWidth, pageHeight);

            // Add image to the background layer
            PdfContentByte under = writer.getDirectContentUnder();
            under.addImage(image);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to add text elements to the PDF
    private static void addTextElements(PdfWriter writer, Document document) {
        try {
            PdfContentByte cb = writer.getDirectContent();

            // Header and footer text
            com.lowagie.text.Font ffont = FontFactory.getFont(FontFactory.TIMES_ROMAN, 8);
            Phrase header = new Phrase("   ", ffont);
            Phrase footer = new Phrase("Softwared by @Color Studio - 0703620555", ffont);
            ColumnText.showTextAligned(cb, Element.ALIGN_CENTER, header, (document.right() - document.left()) / 2 + document.leftMargin(), document.top() + 10, 0);
            ColumnText.showTextAligned(cb, Element.ALIGN_CENTER, footer, (document.right() - document.left()) / 2 + document.leftMargin(), document.bottom() - 10, 0);

            // Title text
            String LINE2 = "List of Patient ward( " + wardNam.getText() + " )";
            BaseFont baseFont = BaseFont.createFont(BaseFont.TIMES_BOLD, BaseFont.WINANSI, BaseFont.NOT_EMBEDDED);
            cb.setFontAndSize(baseFont, 20);
            float textWidth = baseFont.getWidthPoint(LINE2, 18);
            float centerX = (document.getPageSize().width() - textWidth) / 2;
            cb.setTextMatrix(centerX, 650);
            cb.showText(LINE2);

            String dname = name.getText();
            cb.setFontAndSize(BaseFont.createFont(BaseFont.TIMES_BOLD, BaseFont.WINANSI, BaseFont.NOT_EMBEDDED), 13);
            cb.setTextMatrix(35, 625);
            cb.showText(dname);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate currentDate = LocalDate.now();
            String formattedDate = currentDate.format(formatter);
            cb.setFontAndSize(BaseFont.createFont(BaseFont.TIMES_BOLD, BaseFont.WINANSI, BaseFont.NOT_EMBEDDED), 13);
            cb.setTextMatrix(500, 625); // Set position for the text
            cb.showText(formattedDate); // Show the formatted date



        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to add table header
    private static void addTableHeader(PdfPTable table) {
        String[] headers = {"NIC", "Full Name", "Gender", "Telephone", "Age", "Type", "Date"};

        // Add headers to table
        for (String header : headers) {
            PdfPCell cell = new PdfPCell(new Phrase(header));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);
        }
    }

    // Method to fetch data from database and add to table
    private static void fetchDataAndAddToTable(PdfPTable table) {
        String url = "jdbc:mysql://localhost:3306/hospital_management_system";
        String user = "root";
        String password = "";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM patient_register WHERE Date = '"+tq1.getText()+"' && Doctor_id = '"+ did.getText()+"'")) {

            // DateTimeFormatter for parsing Date_of_birth
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            // Process each row in the ResultSet
            while (resultSet.next()) {
                String nicNumber = resultSet.getString("NIC_Number");
                String firstName = resultSet.getString("First_Name");
                String lastName = resultSet.getString("Last_Name");
                String fullName = firstName + " " + lastName; // Combine first name and last name
                String gender = resultSet.getString("Gender");
                String telephone = resultSet.getString("Telephone_Numbers");
                String type = resultSet.getString("Type");
                String date = resultSet.getString("Date");

                // Parse Date_of_birth into LocalDate
                String dateOfBirthStr = resultSet.getString("Date_of_birth");
                LocalDate dateOfBirth;
                try {
                    dateOfBirth = LocalDate.parse(dateOfBirthStr, formatter);
                } catch (DateTimeParseException e) {
                    // Handle parsing exception if needed
                    System.out.println("Error parsing date: " + dateOfBirthStr);
                    e.printStackTrace();
                    continue; // Skip this record and continue with the next one
                }

                // Calculate age based on current date
                LocalDate currentDate = LocalDate.now();
                int age = calculateAge(dateOfBirth, currentDate);

                // Add data to table cells with centered alignment
                table.addCell(createCenteredCell(nicNumber));
                table.addCell(createCenteredCell(fullName));
                table.addCell(createCenteredCell(gender));
                table.addCell(createCenteredCell(telephone));
                table.addCell(createCenteredCell(String.valueOf(age))); // Add age to table cell
                table.addCell(createCenteredCell(type));
                table.addCell(createCenteredCell(date));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to create a centered cell
    private static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }
    private static PdfPCell createCenteredCell(String content) {
        PdfPCell cell = new PdfPCell(new Paragraph(content));
        cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
        cell.setVerticalAlignment(PdfPCell.ALIGN_MIDDLE); // Optional: Vertical alignment
        cell.setPadding(4); // Adjust padding as needed
        return cell;
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
