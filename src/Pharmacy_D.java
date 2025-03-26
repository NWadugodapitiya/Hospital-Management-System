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
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Pharmacy_D extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;
    String UID = login.userid();

    JLabel userward,ward,warddeds;
    Pharmacy_D(){
        setLayout(null);


        Font Exit = new Font ("calibri",Font.BOLD,20);
        Font text1 = new Font ("Arial Rounded MT",Font.BOLD,18);
        Font GrClass = new Font ("Segoe UI",Font.BOLD,22);
        Font Usname = new Font ("Arial Rounded MT",Font.BOLD,16);
        Font calandertext = new Font ("Segoe UI",Font.BOLD,25);
        Font name1 = new Font ("Arial Rounded MT",Font.BOLD,22);
        Font lessonstext1 = new Font ("Arial Rounded MT",Font.BOLD,24);












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
        T1.setForeground(new Color(0, 0, 0,250));
        add(T1);
        T1.setFont(text1);

        JLabel T2 = new JLabel ("Add Medicine");
        T2.setBounds(45,253,120,21);
        T2.setForeground(new Color(250, 250, 250, 255));
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















        JLabel lessonstext = new JLabel ("Most used medicines");
        lessonstext.setBounds(282,284,244,28);
        lessonstext.setForeground(new Color(0, 0, 0,250));
        add(lessonstext);
        lessonstext.setFont(lessonstext1);

        JLabel sa = new JLabel ("Prescription History");
        sa.setBounds(664,284,235,28);
        sa.setForeground(new Color(0, 0, 0,250));
        add(sa);
        sa.setFont(lessonstext1);

        JLabel we = new JLabel ("Available Medicine");
        we.setBounds(282,513,220,28);
        we.setForeground(new Color(0, 0, 0,250));
        add(we);
        we.setFont(lessonstext1);

        JLabel chartlabel1 = new JLabel ("A");
        chartlabel1.setBounds(297,340,90,26);
        chartlabel1.setForeground(Color.black);
        add(chartlabel1);
        chartlabel1.setFont(Exit);

        JLabel chartlabel2 = new JLabel ("B");
        chartlabel2.setBounds(297,370,90,22);
        chartlabel2.setForeground(Color.black);
        add(chartlabel2);
        chartlabel2.setFont(Exit);

        JLabel chartlabel3 = new JLabel ("C");
        chartlabel3.setBounds(297,403,120,22);
        chartlabel3.setForeground(Color.black);
        add(chartlabel3);
        chartlabel3.setFont(Exit);

//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        JFrame frame2 = new JFrame();
        JTable table2 = new JTable();

        Object[] columns2 = {"Prescription ID"," Medicine ID","Count","Date"};
        DefaultTableModel model2;
        model2 = new DefaultTableModel();
        model2.setColumnIdentifiers(columns2);

        table2.setModel(model2);
        table2.setBackground(Color.LIGHT_GRAY);
        table2.setForeground(Color.black);

        JScrollPane pane2 = new JScrollPane(table2);
        pane2.setBounds(645, 317, 519, 150);
        frame2.setLayout(null);
        add(pane2);

        Object[] row2 = new Object[4];

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system", "root", "");
            Statement st = (Statement) con.createStatement ();
            ResultSet rs = st.executeQuery("SELECT * FROM prescription_history");

            while (rs.next()) {
                row2[0] = rs.getString("Prescription_id");
                row2[1] = rs.getString("Medicine_id");
                row2[2] = rs.getString("count");
                row2[3] = rs.getString("Date");

                // add row to the model
                model2.addRow(row2);
            }
            rs.close();
            con.close();
        } catch (Exception ew) {
            ew.printStackTrace();
        }


        JFrame frame1 = new JFrame();
        JTable table1 = new JTable();

        Object[] columns1 = {"Medicine ID"," Medicine Name","Stock","Expiration Date","Last Update"};
        DefaultTableModel model1;
        model1 = new DefaultTableModel();
        model1.setColumnIdentifiers(columns1);

        table1.setModel(model1);
        table1.setBackground(Color.LIGHT_GRAY);
        table1.setForeground(Color.black);

        JScrollPane pane1 = new JScrollPane(table1);
        pane1.setBounds(254, 545, 911, 163);
        frame1.setLayout(null);
        add(pane1);

        Object[] row = new Object[5];

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
                model1.addRow(row);
            }
            rs.close();
            con.close();
        } catch (Exception ew) {
            ew.printStackTrace();
        }
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        JLabel a = new JLabel();
        a.setBounds(0,0,1200,753);
        a.setIcon(new ImageIcon(getClass().getResource("img/Pharmacy_D.png")));
        add(a);
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hospital_management_system", "root", "");
            Statement st = (Statement) con.createStatement ();

            // Query to find the top three most used Medicine IDs and their counts
            ResultSet rs = st.executeQuery("SELECT Medicine_id, COUNT(*) AS count FROM prescription_history GROUP BY Medicine_id ORDER BY count DESC LIMIT 3");

            // Store the top three most used Medicine IDs and their counts
            String[] topMedicineIds = new String[3];
            int[] counts = new int[3];
            int index = 0;

            // Retrieve the top three most used Medicine IDs and their counts
            while (rs.next() && index < 3) {
                topMedicineIds[index] = rs.getString("Medicine_id");
                counts[index] = rs.getInt("count");
                index++;
            }
            rs.close();

            // Assign counts to variables
            count1 = counts[0];
            count2 = counts[1];
            count3 = counts[2];

            // Query to find the Medicine names for the top three most used Medicine IDs
            for (int i = 0; i < 3; i++) {
                String medicineId = topMedicineIds[i];
                rs = st.executeQuery("SELECT Medicine_name FROM medicine_history WHERE Medicine_id = '" + medicineId + "'");

                // Retrieve the Medicine name and assign it to the respective JLabel
                if (rs.next()) {
                    String medicineName = rs.getString("Medicine_name");
                    // Assign the Medicine name to the respective JLabel
                    switch (i) {
                        case 0:
                            chartlabel1.setText(medicineName);
                            break;
                        case 1:
                            chartlabel2.setText(medicineName);
                            break;
                        case 2:
                            chartlabel3.setText(medicineName);
                            break;
                    }
                }
                rs.close();
            }

            con.close();
        } catch (Exception ew) {
            ew.printStackTrace();
        }

//------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Medicine 1", count1);
        dataset.setValue("Medicine 2", count2);
        dataset.setValue("Medicine 3", count3);

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
        panel.setBounds(358, 296, 299, 189); // Adjusted bounds to fit the chart properly
        panel.setPreferredSize(new Dimension(300, 300)); // Set preferred size to be square

        panel.setBorder(null);
        // Add Panel to Frame
        add(panel);

        panel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Pharmacy_D  Frame = new Pharmacy_D ();
                dispose();
            }
        });
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
