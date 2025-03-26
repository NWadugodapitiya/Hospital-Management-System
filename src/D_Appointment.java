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
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class D_Appointment extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;
    String UID = login.userid();
    JLabel bord,pannel1,pannel2,status,userward;
    D_Appointment(){
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
        Font duraa = new Font ("Arial Rounded MT",Font.PLAIN,14);



        bord = new JLabel();
        add(bord);
        pannel1 = new JLabel("available");
        pannel2 = new JLabel("Ward");
        status = new JLabel("not available");
        userward = new JLabel();

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
        T2.setForeground(new Color(0, 0, 0, 255));
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
                String it= rs.getString("ward_no");
                name.setText("Dr."+ first_name+" "+last_name);
                userward.setText(it);
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }
//------------------------------------------------------------------------------------------------------------------------------















// -----------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        JLabel lq3 = new JLabel ("Patients");
        lq3.setForeground(new Color(0, 0, 0, 255));
        lq3.setBounds(878,295,84,24);
        add(lq3);
        lq3.setFont(Atelq3);

        JLabel seaqrch = new JLabel();
        seaqrch.setIcon(new ImageIcon(getClass().getResource("img/p_serch.png")));
        seaqrch.setBounds(847,297,20,20);
        add(seaqrch);

        JTextField tq1 = new JTextField();
        tq1.setBounds (879,285,281,43);
        tq1.setForeground(Color.BLACK);
        tq1.setBackground(new Color(101, 52, 216, 0));
        tq1.setBorder(null);
        tq1.setEditable(true);
        tq1.setOpaque(false);
        add(tq1);
        tq1.setFont(Atelq3);

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
        pane.setBounds(262, 354, 906, 344);
        frame.setLayout(null);
        add(pane);

        Object[] row = new Object[7];

        DocumentListener  documentListener1 = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIt(documentEvent);
                if(tq1.getText().isEmpty()){
                    lq3.setBounds(878,295,84,24);

                } else{
                    lq3.setBounds(0,0,0,0);
                }
            }

            public void insertUpdate(DocumentEvent documentEvent) {
                model.setRowCount(0);
                printIt(documentEvent);
                if(tq1.getText().isEmpty()){
                    lq3.setBounds(878,295,84,24);

                } else{
                    lq3.setBounds(0,0,0,0);
                }
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                printIt(documentEvent);
                if(tq1.getText().isEmpty()){
                    lq3.setBounds(878,295,84,24);

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

                            row[0] = rs.getString("NIC_Number");
                            row[1] = rs.getString("First_Name") + " " + rs.getString("Last_Name");
                            row[2] = rs.getString("Gender");
                            row[3] = rs.getString("Telephone_Numbers");
                            row[4] = age.getYears();
                            row[5] = rs.getString("Type");
                            row[6] = rs.getString("Date") + "/ " + rs.getString("Time");


                            // add row to the model
                            model.addRow(row);
                            //int i = table.getSelectedRow();

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
                    ResultSet rs = st.executeQuery("SELECT * FROM patient_register WHERE Doctor_id = '"+Integer.parseInt(UID)+ "' && Appointment_status ='"+pannel1.getText()+"' && NIC_Number ='"+tq1.getText()+"'");

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


                        // add row to the model
                        model.addRow(row);
                        //int i = table.getSelectedRow();

                    }
                } catch (Exception ew) {
                    System.out.println(ew);
                }


            }
        };
        tq1.getDocument().addDocumentListener(documentListener1);

//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        JComboBox dura = new JComboBox();
        dura.setBounds(259,287,335,43);
        dura.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        dura.setForeground(Color.BLACK);
        dura.addItem("Select Options");
        dura.addItem("Discharge");
        dura.addItem("Clinic");
        dura.addItem("Ward");
        dura.addItem("Another hospital");
        add(dura);
        dura.setFont(duraa);
//------------------------------------------------------------------------------------------------------------------------------

//------------------------------------------------------------------------------------------------------------------------------
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

        JPanel addbu = new JPanel();
        addbu.setBounds(607,285,97,46);
        addbu.setBackground(new Color(21,21,21,0));
        add(addbu);

        addbu.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                addbu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });




        addbu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (tq1.getText().isEmpty() && "Select Options".equals(dura.getSelectedItem())) {
                    JOptionPane.showMessageDialog(null, "Type Patients NIC Number and Select Options", "Type Patients NIC Number and Select Options", JOptionPane.WARNING_MESSAGE);
                } else {
                    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system", "root", "");
                         PreparedStatement preparedStmt = con.prepareStatement("INSERT INTO patient_update (NIC_Number, status, Date, Time, ward_no) VALUES (?, ?, ?, ?,?)");
                         PreparedStatement pstx = con.prepareStatement("UPDATE patient_register SET Appointment_status = ? WHERE NIC_Number = ?")) {

                        // Load MySQL JDBC Driver
                        Class.forName("com.mysql.jdbc.Driver");

                        // Get current date and time
                        LocalDate currentDate = LocalDate.now();
                        LocalTime currentTime = LocalTime.now();
                        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

                        String formattedDate = currentDate.format(dateFormatter);
                        String formattedTime = currentTime.format(timeFormatter);

                        // Prepare the insert statement
                        preparedStmt.setString(1, tq1.getText());
                        preparedStmt.setString(2, (String) dura.getSelectedItem());
                        preparedStmt.setString(3, formattedDate);
                        preparedStmt.setString(4, formattedTime);
                        preparedStmt.setString(5, userward.getText());
                        preparedStmt.executeUpdate();

                        // Prepare the update statement
                        pstx.setString(1, status.getText());
                        pstx.setString(2, tq1.getText());
                        pstx.executeUpdate();

                        // Show success message and dispose the current frame
                        JOptionPane.showMessageDialog(null, "Update success", "Update OK", JOptionPane.INFORMATION_MESSAGE);
                        D_Appointment frame = new D_Appointment();
                        frame.setVisible(true);
                        dispose();

                    } catch (ClassNotFoundException | SQLException ex) {
                        System.err.println("Got an exception!");
                        System.err.println(ex.getMessage());
                    }
                }
            }
        });



        JLabel topic = new JLabel ("Patient Appointment");
        topic.setBounds(250,61,330,38);
        topic.setForeground(new Color(0, 0, 0, 255));
        add(topic);
        topic.setFont(fdas);
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------

//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------

//------------------------------------------------------------------------------------------------------------------------------


////======================================================================================================================


////======================================================================================================================

////======================================================================================================================

////======================================================================================================================

//======================================================================================================================

//----------------------------------------------------------------------------------------------------------------------------------------------------------------


//------------------------------------------------------------------------------------------------------------------------------

//----------------------------------------------------------------------------------------------------------



//------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------------------------

//------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        JLabel a = new JLabel();
        a.setBounds(0,0,1200,753);
        a.setIcon(new ImageIcon(getClass().getResource("img/D_Appointment.png")));
        add(a);
//------------------------------------------------------------------------------------------------------------------------------
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
