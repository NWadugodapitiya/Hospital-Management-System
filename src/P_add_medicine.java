import com.toedter.calendar.JCalendar;

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
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class P_add_medicine extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;
    String UID = login.userid();
    P_add_medicine(){
        setLayout(null);

        Font Exit = new Font ("calibri",Font.BOLD,20);
        Font text1 = new Font ("Arial Rounded MT",Font.BOLD,18);
        Font GrClass = new Font ("Segoe UI",Font.BOLD,22);
        Font Usname = new Font ("Arial Rounded MT",Font.BOLD,16);
        Font calandertext = new Font ("Segoe UI",Font.BOLD,25);
        Font name1 = new Font ("Arial Rounded MT",Font.BOLD,22);
        Font Atelq3 = new Font ("Arial Rounded MT",Font.BOLD,21);


//------------------------------------------------------------------------------------------------------------------------------
        JLabel i1 = new JLabel();
        i1.setIcon(new ImageIcon(getClass().getResource("img/P_ico.png")));
        i1.setBounds(19,192,18,208);
        add(i1);

        i1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                i1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });
//------------------------------------------------------------------------------------------------------------------------------
        JLabel T1 = new JLabel ("Dashboard");
        T1.setBounds(45,189,97,21);
        T1.setForeground(new Color(255, 255, 255,250));
        add(T1);
        T1.setFont(text1);

        JLabel T2 = new JLabel ("Add Medicine");
        T2.setBounds(45,253,120,21);
        T2.setForeground(new Color(0, 0, 0, 255));
        add(T2);
        T2.setFont(text1);

        JLabel T3 = new JLabel ("History");
        T3.setBounds(47,317,113,21);
        T3.setForeground(new Color(250, 250, 250, 255));
        add(T3);
        T3.setFont(text1);

        JLabel T4 = new JLabel ("Settings");
        T4.setBounds(48,381,73,21);
        T4.setForeground(new Color(250, 250, 250, 255));
        add(T4);
        T4.setFont(text1);
////====================================================================================================================
        T1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                T1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Pharmacy_D  Frame = new Pharmacy_D ();
                dispose();
            }
        });

////====================================================================================================================
        T2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                T2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                P_add_medicine  Frame = new P_add_medicine ();
                dispose();
            }
        });

////====================================================================================================================
        T3.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                T3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                p_history  Frame = new p_history ();
                dispose();
            }
        });
////====================================================================================================================
        T4.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                T4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                P_setting  Frame = new P_setting ();
                dispose();
            }
        });
//======================================================================================================================
        JLabel GClass = new JLabel ("<html>Gampola General<br><center>Hospital</html>");
        GClass.setBounds(22,90,184,55);
        GClass.setForeground(new Color(250, 250, 250,250));
        add(GClass);
        GClass.setFont(GrClass);

        JLabel Uname = new JLabel ("<html><center>Today number<br>of Prescription</html>");
        Uname.setBounds(275,127,116,40);
        Uname.setForeground(new Color(0, 0, 0,250));
        add(Uname);
        Uname.setFont(Usname);

        JLabel cat1 = new JLabel ("15");
        cat1.setBounds(322,170,29,28);
        cat1.setForeground(new Color(0, 0, 0,250));
        add(cat1);
        cat1.setFont(calandertext);

        JLabel subjecttext = new JLabel ("<html>Total types<br><center>of medicine</html>");
        subjecttext.setBounds(501,127,90,40);
        subjecttext.setForeground(new Color(0, 0, 0,250));
        add(subjecttext);
        subjecttext.setFont(Usname);

        JLabel lessons = new JLabel ("85");
        lessons.setBounds(531,172,29,28);
        lessons.setForeground(new Color(0, 0, 0,250));
        add(lessons);
        lessons.setFont(calandertext);
//------------------------------------------------------------------------------------------------------------------------------
        JPanel b1 = new JPanel();
        b1.setBounds(250,117,173,92);
        b1.setBackground(new Color(21,21,21,0));
        add(b1);

        JPanel b2 = new JPanel();
        b2.setBounds(459,117,173,92);
        b2.setBackground(new Color(21,21,21,0));
        add(b2);

        b1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        b2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });
// ------------------------------------------------------------------------------------------------------------------------------
        JLabel l3 = new JLabel ("Search");
        l3.setForeground(new Color(0, 0, 0, 255));
        l3.setBounds(285,19,45,15);
        add(l3);
        Font Atel3 = new Font ("Arial Rounded MT",Font.BOLD,13);
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
        Font Atetl = new Font ("calibri",Font.BOLD,15);
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
                    preparedStmt.setString(3,("Pharmacy"));
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
//------------------------------------------------------------------------------------------------------------------------------
        JLabel name = new JLabel ("Pharmacy");
        name.setBounds(934,11,167,26);
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
                P_setting  Frame = new P_setting ();
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
                P_setting  Frame = new P_setting ();
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
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        try{
            Connection con; Statement st; ResultSet rs;

            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system","root","");
            st=con.createStatement();
            rs=st.executeQuery("SELECT COUNT(Medicine_id) FROM medicine_history ");
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
        {         e.printStackTrace();
        }
//------------------------------------------------------------------------------------------------------------------------------
        // Get current date and time
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = currentDate.format(dateFormatter);
//------------------------------------------------------------------------------------------------------------------------------
        try{
            Connection con; Statement st; ResultSet rs;

            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system","root","");
            st=con.createStatement();
            rs=st.executeQuery("SELECT COUNT(Prescription_id) FROM prescription_history  WHERE Date ='"+formattedDate+ "'");
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
        {         e.printStackTrace();
        }
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------






// ------------------------------------------------------------------------------------------------------------------------------
        JLabel topic = new JLabel ("Add Medicine");
        topic.setBounds(250,61,330,38);
        topic.setForeground(new Color(0, 0, 0, 255));
        add(topic);
        Font fdas = new Font ("Arial Rounded MT",Font.BOLD,33);
        topic.setFont(fdas);
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        JLabel lq3 = new JLabel ("Medicine");
        lq3.setForeground(new Color(0, 0, 0, 255));
        lq3.setBounds(878,295,100,24);
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

        JTextField tq2 = new JTextField();
        tq2.setBounds (282,287,312,43);
        tq2.setForeground(Color.BLACK);
        tq2.setBackground(new Color(101, 52, 216, 0));
        tq2.setBorder(null);
        tq2.setEditable(true);
        tq2.setOpaque(false);
        add(tq2);
        tq2.setFont(Atelq3);

        JTextField tq3 = new JTextField();
        tq3.setBounds (282,346,312,43);
        tq3.setForeground(Color.BLACK);
        tq3.setBackground(new Color(101, 52, 216, 0));
        tq3.setBorder(null);
        tq3.setEditable(true);
        tq3.setOpaque(false);



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
            tq3.setText(dateString);
            calendarDialog.setVisible(false); // Hide the dialog after selecting a date
        });

        // Add a mouse listener to the text field to show the calendar dialog when clicked
        tq3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                calendarDialog.setLocationRelativeTo(tq3); // Position the dialog relative to the text field
                calendarDialog.setVisible(true); // Show the dialog
            }
        });

        add(tq3);
        tq3.setFont(Atelq3);

        JLabel lq4 = new JLabel ("Medicine Count");
        lq4.setForeground(new Color(0, 0, 0, 255));
        lq4.setBounds(282,293,216,28);
        add(lq4);
        lq4.setFont(Atelq3);

        JLabel lq5 = new JLabel ("Select Expiration date");
        lq5.setForeground(new Color(0, 0, 0, 255));
        lq5.setBounds(282,352,220,28);
        add(lq5);
        lq5.setFont(Atelq3);

//------------------------------------------------------------------------------------------------------------------------------
        DocumentListener documentListener2 = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(tq2.getText().isEmpty()){
                    lq4.setBounds(282,293,216,28);
                } else{
                    lq4.setBounds(0,0,0,0);
                }
            }
            public void insertUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(tq2.getText().isEmpty()){
                    lq4.setBounds(282,293,216,28);
                } else{
                    lq4.setBounds(0,0,0,0);
                }
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(tq2.getText().isEmpty()){
                    lq4.setBounds(282,293,216,28);
                } else{
                    lq4.setBounds(0,0,0,0);
                }
            }
            private void printIT(DocumentEvent documentEvent) {
                System.out.println(tq2.getText());

            }
        };
        tq2.getDocument().addDocumentListener(documentListener2);
//------------------------------------------------------------------------------------------------------------------------------
        DocumentListener documentListener3 = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(tq3.getText().isEmpty()){
                    lq5.setBounds(282,352,220,28);
                } else{
                    lq5.setBounds(0,0,0,0);
                }
            }
            public void insertUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(tq3.getText().isEmpty()){
                    lq5.setBounds(282,352,220,28);
                } else{
                    lq5.setBounds(0,0,0,0);
                }
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(tq3.getText().isEmpty()){
                    lq5.setBounds(282,352,220,28);
                } else{
                    lq5.setBounds(0,0,0,0);
                }
            }

            private void printIT(DocumentEvent documentEvent) {
                System.out.println(tq3.getText());

            }
        };
        tq3.getDocument().addDocumentListener(documentListener3);
//------------------------------------------------------------------------------------------------------------------------------

        JFrame frame = new JFrame();
        JTable table = new JTable();

        Object[] columns = {"Medicine ID"," Medicine Name","Stock","Expiration Date","Last Update"};
        DefaultTableModel model;
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);

        table.setModel(model);
        table.setBackground(Color.LIGHT_GRAY);
        table.setForeground(Color.black);


        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(262, 423, 906, 275);
        frame.setLayout(null);
        add(pane);

        Object[] row = new Object[5];


        DocumentListener  documentListener1 = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIt(documentEvent);
                if(tq1.getText().isEmpty()){
                    lq3.setBounds(878,295,100,24);
                } else{
                    lq3.setBounds(0,0,0,0);
                }
            }

            public void insertUpdate(DocumentEvent documentEvent) {
                model.setRowCount(0);
                printIt(documentEvent);
                if(tq1.getText().isEmpty()){
                    lq3.setBounds(878,295,100,24);

                } else{
                    lq3.setBounds(0,0,0,0);
                }
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                printIt(documentEvent);
                if(tq1.getText().isEmpty()){
                    lq3.setBounds(878,295,100,24);
                    model.setRowCount(0);
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system", "root", "");
                        Statement st = (Statement) con.createStatement ();
                        ResultSet rs = st.executeQuery("SELECT * FROM medicine_history");

                        while (rs.next()) {
                            row[0] = rs.getString("Medicine_id");
                            row[1] = rs.getString("Medicine_name");
                            row[2] = rs.getString("Stock");
                            row[3] = rs.getString("Ex_date");
                            row[4] = rs.getString("Last_update");

                            // add row to the model
                            model.addRow(row);
                        }
                        rs.close();
                        con.close();
                    } catch (Exception ew) {
                        ew.printStackTrace();
                    }

                } else{
                    lq3.setBounds(0,0,0,0);
                }
            }

            private void printIt(DocumentEvent documentEvent) {
                // ta.setVisible(true);
                // ta.setText("No Information");
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system", "root", "");
                    Statement st = (Statement) con.createStatement ();
                    ResultSet rs = st.executeQuery("SELECT * FROM medicine_history WHERE Medicine_id = '"+tq1.getText()+ "'");

                    while (rs.next()) {
                        row[0] = rs.getString("Medicine_id");
                        row[1] = rs.getString("Medicine_name");
                        row[2] = rs.getString("Stock");
                        row[3] = rs.getString("Ex_date");
                        row[4] = rs.getString("Last_update");

                        // add row to the model
                        model.addRow(row);
                    }
                    rs.close();
                    con.close();
                } catch (Exception ew) {
                    ew.printStackTrace();
                }


            }
        };
        tq1.getDocument().addDocumentListener(documentListener1);


        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system", "root", "");
            Statement st = (Statement) con.createStatement ();
            ResultSet rs = st.executeQuery("SELECT * FROM medicine_history");

            while (rs.next()) {

                row[0] = rs.getString("Medicine_id");
                row[1] = rs.getString("Medicine_name");
                row[2] = rs.getString("Stock");
                row[3] = rs.getString("Ex_date");
                row[4] = rs.getString("Last_update");


                // add row to the model
                model.addRow(row);
                //int i = table.getSelectedRow();

            }
        } catch (Exception ew) {
            System.out.println(ew);
        }


        JPanel addbu = new JPanel();
        addbu.setBounds(617, 348, 121, 41);
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
                if (tq1.getText().isEmpty() && tq2.getText().isEmpty() && tq3.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Search Medicine Id & Type Count ", "Search Medicine Id & Type Count ", JOptionPane.WARNING_MESSAGE);
                } else {
                    PreparedStatement pst;
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system","root","");

                        java.sql.Statement stmt = con.createStatement();
                        pst = con.prepareStatement("update medicine_history set Stock=?,Ex_date=?,Last_update=? WHERE Medicine_id ='"+tq1.getText()+"'");

                        LocalDateTime myDateObj = LocalDateTime.now();
                        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

                        String formattedDate = myDateObj.format(myFormatObj);
                        System.out.println("Date and Time: " + formattedDate);
                        {
                            pst.setString(1, tq2.getText());
                            pst.setString(2, tq3.getText());
                            pst.setString(3, formattedDate);

                            pst.executeUpdate();
                            JOptionPane.showMessageDialog(null, "update ok","success",JOptionPane.WARNING_MESSAGE);

                            P_add_medicine Frame = new P_add_medicine();
                            dispose();
                        }
                        stmt.close();
                        con.close();
                    }catch (Exception eo){
                        System.out.println(eo);
                    }
                }
            }
        });


//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------


//------------------------------------------------------------------------------------------------------------------------------

//======================================================================================================================
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        JLabel a = new JLabel();
        a.setBounds(0,0,1200,753);
        a.setIcon(new ImageIcon(getClass().getResource("img/P_add_medicine.png")));
        add(a);
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
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
        P_add_medicine Frame = new P_add_medicine();

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
