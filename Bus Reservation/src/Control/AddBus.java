package Control;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.*;
import javax.swing.*;

public class AddBus extends javax.swing.JInternalFrame {

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField tBusName;
    private javax.swing.JTextField tCurrOccupancy;
    private javax.swing.JTextField tOperationDays;

    public AddBus() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        // Your existing initComponents code remains unchanged

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        cb1 = new javax.swing.JComboBox<>();
        cb2 = new javax.swing.JComboBox<>();
        tBusName = new javax.swing.JTextField();
        tCurrOccupancy = new javax.swing.JTextField();
        tOperationDays = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(770, 370));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 27));
        jLabel1.setText("Add Bus Detail");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 19));
        jLabel2.setText("Bus No.");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 19));
        jLabel3.setText("Source");
        tBusName.setText("Enter Bus Name Here");

        tBusName.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // When the text field gains focus, clear the default text
                if (tBusName.getText().equals("Enter Bus Name Here")) {
                    tBusName.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // When the text field loses focus, set the default text if it's empty
                if (tBusName.getText().isEmpty()) {
                    tBusName.setText("Enter Bus Name Here");
                }
            }
        });

        tCurrOccupancy.setText("Enter Current Occupancy Here");
        tCurrOccupancy.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // When the text field gains focus, clear the default text
                if (tCurrOccupancy.getText().equals("Enter Current Occupancy Here")) {
                    tCurrOccupancy.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // When the text field loses focus, set the default text if it's empty
                if (tCurrOccupancy.getText().isEmpty()) {
                    tCurrOccupancy.setText("Enter Current Occupancy Here");
                }
            }
        });
        tOperationDays.setText("Enter Days of Operation Here");
        tOperationDays.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // When the text field gains focus, clear the default text
                if (tOperationDays.getText().equals("Enter Days of Operation Here")) {
                    tOperationDays.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // When the text field loses focus, set the default text if it's empty
                if (tOperationDays.getText().isEmpty()) {
                    tOperationDays.setText("Enter Days of Operation Here");
                }
            }
        });
        jLabel4.setFont(new java.awt.Font("Verdana", 0, 19));
        jLabel4.setText("Destination");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 19));
        jLabel5.setText("Time");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 19));
        jLabel6.setText("Price");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 19));
        jLabel7.setText("Seats");

        jButton1.setFont(new java.awt.Font("Verdana", 0, 19));
        jButton1.setText("Save");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Verdana", 0, 19));
        jButton2.setText("Reset");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        t1.setFont(new java.awt.Font("Verdana", 0, 18));
        t2.setFont(new java.awt.Font("Verdana", 0, 18));
        t5.setFont(new java.awt.Font("Verdana", 0, 18));
        t6.setFont(new java.awt.Font("Verdana", 0, 18));

        cb1.setFont(new java.awt.Font("Verdana", 0, 18));
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{" ", "Ajmer", "Alwar", "Banswara", "Baran", "Barmer", "Bharatpur", "Bhilwara", "Bikaner", "Bundi", "Chittorgarh", "Churu", "Dausa", "Dholpur", "Dungarpur", "Hanumangarh", "Jaipur", "Jaisalmer", "Jalor", "Jhalawar", "Jhunjhunu", "Jodhpur", "Karauli", "Kota", "Nagaur", "Pali", "Pratapgarh", "Rajsamand", "Sawai Madhopur", "Sikar", "Sirohi", "Sri Ganganagar", "Tonk", "Udaipur"}));

        cb2.setFont(new java.awt.Font("Verdana", 0, 18));
        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{" ", "Ajmer", "Alwar", "Banswara", "Baran", "Barmer", "Bharatpur", "Bhilwara", "Bikaner", "Bundi", "Chittorgarh", "Churu", "Dausa", "Dholpur", "Dungarpur", "Hanumangarh", "Jaipur", "Jaisalmer", "Jalor", "Jhalawar", "Jhunjhunu", "Jodhpur", "Karauli", "Kota", "Nagaur", "Pali", "Pratapgarh", "Rajsamand", "Sawai Madhopur", "Sikar", "Sirohi", "Sri Ganganagar", "Tonk", "Udaipur"}));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(232, 232, 232)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(jButton1)
                                .addGap(134, 134, 134)
                                .addComponent(jButton2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel3))
                                                .addGap(29, 29, 29)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(t5)
                                                        .addComponent(cb1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(t1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)))
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(t2)
                                        .addComponent(cb2, 0, 160, Short.MAX_VALUE)
                                        .addComponent(t6))
                                .addGap(59, 59, 59))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tBusName)
                                        .addComponent(tCurrOccupancy)
                                        .addComponent(tOperationDays, GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE))
                                .addContainerGap(0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel5)
                                        .addComponent(t1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(t2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4)
                                                .addComponent(cb2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(cb1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(t6, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(t5, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(tBusName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tCurrOccupancy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tOperationDays, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2))
                                .addGap(51, 51, 51))
        );

        pack();
    }

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        Connection con;
        Statement st;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_booking_system", "root", "");
            String s;
            int a, b, c;
            int d = 100;
            a = Integer.parseInt(t5.getText());
            b = Integer.parseInt(t6.getText());
            c = Integer.parseInt(tCurrOccupancy.getText());
            st = con.createStatement();
            s = "insert into bus_detail values('" + tBusName.getText() + "','" + t1.getText() + "','" + cb1.getSelectedItem() + "','" + cb2.getSelectedItem() + "','" + t2.getText() + "'," + a + "," + b + "," + c + ",'" + tOperationDays.getText() + "'," + d + ")";
            int x = st.executeUpdate(s);
            if (x > 0) {
                JOptionPane.showMessageDialog(this, "Bus Added Successfully", "Alert", JOptionPane.PLAIN_MESSAGE);
                t1.setText("");
                t2.setText("");
                cb1.setSelectedIndex(0);
                cb2.setSelectedIndex(0);
                t5.setText("");
                t6.setText("");
                tBusName.setText("");
                tCurrOccupancy.setText("");
                tOperationDays.setText("");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        t1.setText("");
        t2.setText("");
        cb1.setSelectedIndex(0);
        cb2.setSelectedIndex(0);
        t5.setText("");
        t6.setText("");
        tBusName.setText("");
        tCurrOccupancy.setText("");
        tOperationDays.setText("");
    }//GEN-LAST:event_jButton2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables

    // End of variables declaration//GEN-END:variables
}
