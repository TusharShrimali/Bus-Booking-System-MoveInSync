package Control;

import java.awt.*;
import java.sql.*;
import java.util.Arrays;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class NewBooking extends javax.swing.JInternalFrame {
int index;
    public NewBooking(String u) {
        initComponents();
        jLabel2.setText(u);
        Connection  conn;
                        Statement stt;
                        ResultSet rss;
                        try
                        {
                            Class.forName("com.mysql.jdbc.Driver");
                            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_booking_system","root","");
                            String ss;
                            stt=conn.createStatement();
                            ss="select * from bus_booking where User='"+jLabel2.getText()+"'";
                            rss=stt.executeQuery(ss);
                            DefaultTableModel model2=(DefaultTableModel) jTable6.getModel();
                            while(rss.next())
                            {
                                model2.addRow(new Object[]{
                                        rss.getString(1), rss.getString(2), rss.getString(3),
                                        rss.getString(4), rss.getString(5), rss.getString(6),
                                        rss.getString(7), rss.getString(8)
                                });
                            }
                        }
                        catch(Exception  e)
                        {
                            System.out.println(e);
                        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cb2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(810, 350));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 27)); // NOI18N
        jLabel6.setText("Add Booking ");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Source");

        cb1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Ajmer", "Alwar", "Banswara", "Baran", "Barmer", "Bharatpur", "Bhilwara", "Bikaner", "Bundi", "Chittorgarh", "Churu", "Dausa", "Dholpur", "Dungarpur", "Hanumangarh", "Jaipur", "Jaisalmer", "Jalor", "Jhalawar", "Jhunjhunu", "Jodhpur", "Karauli", "Kota", "Nagaur", "Pali", "Pratapgarh", "Rajsamand", "Sawai Madhopur", "Sikar", "Sirohi", "Sri Ganganagar", "Tonk", "Udaipur" }));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Destination");

        cb2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Ajmer", "Alwar", "Banswara", "Baran", "Barmer", "Bharatpur", "Bhilwara", "Bikaner", "Bundi", "Chittorgarh", "Churu", "Dausa", "Dholpur", "Dungarpur", "Hanumangarh", "Jaipur", "Jaisalmer", "Jalor", "Jhalawar", "Jhunjhunu", "Jodhpur", "Karauli", "Kota", "Nagaur", "Pali", "Pratapgarh", "Rajsamand", "Sawai Madhopur", "Sikar", "Sirohi", "Sri Ganganagar", "Tonk", "Udaipur" }));

        jButton1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton1.setText("Search");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Search Result ....");

        jTable6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                    "Bus_Name", "Source", "Destination", "User", "Bus_No", "Paid", "Seats", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable6);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("Your Booking ...");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bus Name", "Bus No.", "Source", "Destination", "Time", "Price", "Seats", "Current_Occupancy", "Operation_Days", "Distance"}
        ));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(316, 316, 316)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addGap(19, 19, 19)
                                .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel4)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


//    private void setRowColor(JTable table) {
//        int rowCount = table.getRowCount();
//        for (int i = 0; i < rowCount; i++) {
//            int currentOccupancy = Integer.parseInt(table.getValueAt(i, 7).toString());
//            int availableSeats = Integer.parseInt(table.getValueAt(i, 6).toString());
//            int difference = currentOccupancy / availableSeats;
//            System.out.println("currOccu:");
//            System.out.println(currentOccupancy);
//            System.out.println("totalSeats:");
//            System.out.println(availableSeats);
//            if (difference <= 0.6) {
//                table.getRowSorter().getModel().setValueAt(Color.GREEN, i, 0);
//            } else if (difference <= 0.9) {
//                table.getRowSorter().getModel().setValueAt(Color.YELLOW, i, 0);
//            } else {
//                table.getRowSorter().getModel().setValueAt(Color.RED, i, 0);
//            }
//        }
//    }
//

//    public class CustomTableModel extends DefaultTableModel {
//        private final Class<?>[] types = new Class[] { Object.class, Object.class, Object.class, Object.class, Object.class,
//                Object.class, Object.class, Object.class, Object.class, Object.class };
//        private final boolean[] canEdit = new boolean[] { false, false, false, false, false, false, false, false, false, false };
//        private final Color[] rowColors;  // Array to store row colors
//
//        public CustomTableModel(Object[][] data, Object[] columnNames, Color[] rowColors) {
//            super(data, columnNames);
//            this.rowColors = rowColors;
//        }

//        @Override
//        public Class<?> getColumnClass(int columnIndex) {
//            return types[columnIndex];
//        }
//
//        @Override
//        public boolean isCellEditable(int rowIndex, int columnIndex) {
//            return canEdit[columnIndex];
//        }
//
//        @Override
//        public void setValueAt(Object value, int row, int col) {
//            super.setValueAt(value, row, col);
//            if (col == 0) {
//                rowColors[row] = (Color) value;
//            }
//        }

        // Custom method to get row color
//        public Color getRowColor(int row) {
//            return rowColors[row];
//        }
//    }





//
//    public class ColorRenderer extends DefaultTableCellRenderer {
//        @Override
//        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
//            Component rendererComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
//
//            if (value instanceof Color) {
//                rendererComponent.setBackground((Color) value);
//            }
//
//            return rendererComponent;
//        }
//    }
//



    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        DefaultTableModel model0=(DefaultTableModel) jTable4.getModel();
        int x=model0.getRowCount();
        if(x!=0)
        {
        for(int i=0;i<x;i++)
        {
           model0.removeRow(0);
        }
        }
        Connection  con;
        Statement st;
        ResultSet rs;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_booking_system","root","");
            String s;
            st=con.createStatement();
            s="select * from bus_detail where Source='"+cb1.getSelectedItem()+"' and Destination='"+cb2.getSelectedItem()+"'";
            rs=st.executeQuery(s);
            DefaultTableModel model=(DefaultTableModel) jTable4.getModel();
            while(rs.next())
            {
                model.addRow(new Object[]{
                        rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6),
                        rs.getString(7), rs.getString(8), rs.getString(9),
                        rs.getString(10)
                });
            }
//            Color[] rowColors = new Color[jTable4.getRowCount()];
  //          Arrays.fill(rowColors, Color.BLACK);




            DefaultTableModel defaultTableModel = (DefaultTableModel) jTable4.getModel();
            Object[][] data = new Object[defaultTableModel.getRowCount()][defaultTableModel.getColumnCount()];
            for (int i = 0; i < defaultTableModel.getRowCount(); i++) {
                for (int j = 0; j < defaultTableModel.getColumnCount(); j++) {
                    data[i][j] = defaultTableModel.getValueAt(i, j);
                }
            }

            Object[] columnNames = new Object[defaultTableModel.getColumnCount()];
            for (int i = 0; i < defaultTableModel.getColumnCount(); i++) {
                columnNames[i] = defaultTableModel.getColumnName(i);
            }

    //        CustomTableModel model1 = new CustomTableModel(data, columnNames, rowColors);







            jTable4.setModel(model);

            // Set row colors based on available seats
  //          setRowColor(jTable4);
    //        jTable4.getColumnModel().getColumn(0).setCellRenderer(new ColorRenderer());

        }
        catch(Exception  e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        index =jTable4.getSelectedRow();
        TableModel model=jTable4.getModel();
        String bus_no=(String) model.getValueAt(index, 1);
        String source=(String) model.getValueAt(index, 2);
        String dest=(String) model.getValueAt(index, 3);
        String time=(String) model.getValueAt(index, 4);
        String price=(String) model.getValueAt(index, 5);
        String avail_seat=(String) model.getValueAt(index, 6);
        String busName=(String) model.getValueAt(index, 0);
        String currOccu=(String) model.getValueAt(index, 7);
        String opDays=(String) model.getValueAt(index, 8);
        String dist=(String) model.getValueAt(index, 9);
        
        BookingFormFrame=new JFrame();
        BookingFormPanel=new JPanel();
        gl=new GridLayout(0,4);
        l1=new JLabel("Bus No");
        l11=new JLabel(bus_no);
        l3=new JLabel("Source");
        l13=new JLabel(source);
        l4=new JLabel("Dest");
        l14=new JLabel(dest);
        l6=new JLabel("Time");
        l16=new JLabel(time);
        l7=new JLabel("Price");
        l17=new JLabel(String.valueOf(price));
        l8=new JLabel("Available Seat");
        l18=new JLabel(String.valueOf(avail_seat));
        seatnoL=new JLabel("Seats");
        idnoL=new JLabel("ID No.");
        fnameL=new JLabel("First Name");
        lnameL=new JLabel("Last Name");
        t1=new JTextField(20);
        t3=new JTextField(20);
        
        BookingFormFrame.getContentPane().add(BookingFormPanel);
        BookingFormPanel.setLayout(gl);
        
        BookingFormPanel.add(l1);
        BookingFormPanel.add(l11);
        BookingFormPanel.add(l3);
        BookingFormPanel.add(l13);
        BookingFormPanel.add(l4);
        BookingFormPanel.add(l14);
        BookingFormPanel.add(l6);
        BookingFormPanel.add(l16);
        BookingFormPanel.add(l7);
        BookingFormPanel.add(l17);
        BookingFormPanel.add(l8);
        BookingFormPanel.add(l18);
        
        BookingFormPanel.add(seatnoL);
        BookingFormPanel.add(t1);
        BookingFormPanel.add(fnameL);
        BookingFormPanel.add(t3);
        int result = JOptionPane.showConfirmDialog(BookingFormFrame,BookingFormPanel,"Booking Form",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
        if(result==JOptionPane.OK_OPTION)
        {
            String booking_user=jLabel2.getText();
            String seatno=t1.getText();
            String first_tname=t3.getText();
            int remaining_seat=Integer.parseInt(avail_seat)-Integer.parseInt(seatno);
            int price_paid=Integer.parseInt(seatno)*Integer.parseInt(price);
            Connection  con;
            Statement st;
            ResultSet rs;
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_booking_system","root","");
                st=con.createStatement();    
                String s;
                s= "select * from bus_booking where Bus_no ='"+bus_no+"' and User='"+booking_user+"'";
                rs=st.executeQuery(s);
                String si;
                si= "insert into bus_booking values('"+busName+"','"+source+"','"+dest+"','"+booking_user+"','"+bus_no+"','"+price_paid+"','"+seatno+"','"+first_tname+"')";
                int i= st.executeUpdate(si);
                if(i==1)
                {
                    String updateQuery="update bus_detail set Seats='"+remaining_seat+"' where Bus_no='"+bus_no+"'";
                    int j=st.executeUpdate(updateQuery);
                    if(j==1)
                    {
                        int aa=JOptionPane.showConfirmDialog(null,"Booking Done","Sure !!!",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
                        if(aa==JOptionPane.OK_OPTION)
                        {
                            
                        DefaultTableModel model0=(DefaultTableModel) jTable6.getModel();
                        int x=model0.getRowCount();
                        if(x!=0)
                        {
                            for(i=0;i<x;i++)
                            {
                               model0.removeRow(0);
                            }
                        }   
                        Connection  conn;
                        Statement stt;
                        ResultSet rss;
                        try
                        {
                            Class.forName("com.mysql.jdbc.Driver");
                            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_booking_system","root","");
                            String ss;
                            stt=conn.createStatement();
                            ss="select * from bus_booking where User='"+jLabel2.getText()+"'";
                            rss=stt.executeQuery(ss);
                            DefaultTableModel model2=(DefaultTableModel) jTable6.getModel();
                            while(rss.next())
                            {
                                model2.addRow(new Object[]{
                                        rss.getString(1), rss.getString(2), rss.getString(3),
                                        rss.getString(4), rss.getString(5), rss.getString(6),
                                        rss.getString(7), rss.getString(8)
                                });
                            }
                        }
                        catch(Exception  e)
                        {
                            System.out.println(e);
                        }
                        }
                    }
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }  
        
    }//GEN-LAST:event_jTable4MouseClicked

    GridLayout gl;    
    public JFrame BookingFormFrame;
    public JPanel BookingFormPanel;
    public JLabel l1,l3,l4,l6,l7,l8,l11,l13,l14,l16,l17,l18,seatnoL,idnoL,fnameL,lnameL;
    public JComboBox seatCB;
    public JTextField t1,t3;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable6;
    // End of variables declaration//GEN-END:variables
}
