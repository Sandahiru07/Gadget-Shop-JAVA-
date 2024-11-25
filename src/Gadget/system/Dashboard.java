package Gadget.system;

import java.awt.Color;
import java.awt.print.PrinterException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Sadahiru
 */
public class Dashboard extends javax.swing.JFrame {
    //Mouse clicked
    Color selectionColour = new Color(34, 48, 62);
    Color sidecolour = new Color(64, 194, 150);
    Color textselectionclolour = new Color(255, 255, 255);
    //Mouse Exited
    Color eselectionColour = new Color(0, 102, 102);
    Color esidecolour = new Color(0, 102, 102);
    Color etextselectionclolour = new Color(102, 120, 138);

    private Double total = 0.0;
    private int x = 0;

    public Dashboard() {
        initComponents();
        init();
    }

    public void init() {
        setTime();
    }

    //Exit Buttons Colour change
    public void EPhonesbtn() {
        jPanel9.setBackground(eselectionColour);
        jPanel10.setBackground(esidecolour);
        Phonelbl.setForeground(etextselectionclolour);
    }

    public void ETabletsbtn() {
        jPanel5.setBackground(eselectionColour);
        jPanel6.setBackground(esidecolour);
        Tablesbtn.setForeground(etextselectionclolour);
    }

    public void ELaptopssbtn() {
        jPanel7.setBackground(eselectionColour);
        jPanel8.setBackground(esidecolour);
        Laptopbtn.setForeground(etextselectionclolour);
    }

    public void EAccessoriesbtn() {
        jPanel11.setBackground(eselectionColour);
        jPanel12.setBackground(esidecolour);
        Accessoriesbtn.setForeground(etextselectionclolour);
    }

    //Reset Button
    public void reset() {
        jSpinner1.setValue(0);
        jSpinner2.setValue(0);
        jSpinner4.setValue(0);
        jSpinner5.setValue(0);
        jSpinner6.setValue(0);
        jSpinner7.setValue(0);
        jSpinner8.setValue(0);
        jSpinner9.setValue(0);
        jSpinner10.setValue(0);
        jSpinner11.setValue(0);
        jSpinner12.setValue(0);
        jSpinner13.setValue(0);
        jSpinner14.setValue(0);
        jSpinner15.setValue(0);
        jSpinner16.setValue(0);
        jSpinner17.setValue(0);
        jSpinner18.setValue(0);
        jSpinner19.setValue(0);
        jSpinner20.setValue(0);
        jSpinner21.setValue(0);
        jSpinner22.setValue(0);
        jSpinner23.setValue(0);
        jSpinner24.setValue(0);
        jSpinner25.setValue(0);
        jSpinner26.setValue(0);
        jSpinner27.setValue(0);
        jSpinner28.setValue(0);
        jSpinner31.setValue(0);
        jSpinner32.setValue(0);
        jLabel4.setText("00.00");
        jLabel96.setText("00.00");
        jTextArea1.setText("");
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        jCheckBox6.setSelected(false);
        jCheckBox7.setSelected(false);
        jCheckBox8.setSelected(false);
        jCheckBox9.setSelected(false);
        jCheckBox10.setSelected(false);
        jCheckBox11.setSelected(false);
        jCheckBox12.setSelected(false);
        jCheckBox13.setSelected(false);
        jCheckBox14.setSelected(false);
        jCheckBox15.setSelected(false);
        jCheckBox16.setSelected(false);
        jCheckBox17.setSelected(false);
        jCheckBox18.setSelected(false);
        jCheckBox19.setSelected(false);
        jCheckBox20.setSelected(false);
        jCheckBox21.setSelected(false);
        jCheckBox22.setSelected(false);
        jCheckBox23.setSelected(false);
        jCheckBox24.setSelected(false);
        jCheckBox25.setSelected(false);
        jCheckBox26.setSelected(false);
        jCheckBox27.setSelected(false);
        jCheckBox30.setSelected(false);

        x = 0;
        total = 0.0;
        jPanel9.setBackground(selectionColour);
        jPanel10.setBackground(sidecolour);
        Phonelbl.setForeground(textselectionclolour);
        jLabel11.setVisible(true);
        jTabbedPane1.setSelectedIndex(0);
        ETabletsbtn();
        ELaptopssbtn();
        EAccessoriesbtn();
        Totalbtn.setEnabled(true);
    }

    public boolean qtyisZero(int qty) {
        if (qty == 0) {
            JOptionPane.showMessageDialog(null, "Please increase the item quantity");
            return false;
        }
        return true;
    }

    //Time
    public void setTime() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {

                    } catch (Exception e) {
                    }
                    Date date = new Date();
                    SimpleDateFormat tf = new SimpleDateFormat("h:mm:ss aa");
                    SimpleDateFormat df = new SimpleDateFormat("EEEE, dd-MM-yyyy");
                    String time = tf.format(date);
                    Timelbl.setText(time.split(" ")[0] + " " + time.split(" ")[1]);
                    Datalbl.setText(df.format(date));
                }
            }
        }).start();
    }

    public void GeniusTech() {
        int PurchaseID = 15020 + (int) (Math.random() * 80800);
        jTextArea1.setText("***************Genius Tech*****************\n"
                + "Purchase ID: " + PurchaseID + "\n"
                + "Date: " + Datalbl.getText()
                + "\nTime: " + Timelbl.getText()
                + "\n**********************************************"
                + "\nItem Name:\t\t" + "Price(Rs)\n");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Tablesbtn = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        Laptopbtn = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        Phonelbl = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        Accessoriesbtn = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jSpinner21 = new javax.swing.JSpinner();
        jCheckBox21 = new javax.swing.JCheckBox();
        jLabel188 = new javax.swing.JLabel();
        jLabel189 = new javax.swing.JLabel();
        jSpinner22 = new javax.swing.JSpinner();
        jCheckBox22 = new javax.swing.JCheckBox();
        jLabel190 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        jSpinner23 = new javax.swing.JSpinner();
        jCheckBox23 = new javax.swing.JCheckBox();
        jLabel192 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        jSpinner24 = new javax.swing.JSpinner();
        jCheckBox24 = new javax.swing.JCheckBox();
        jLabel194 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        jSpinner25 = new javax.swing.JSpinner();
        jCheckBox25 = new javax.swing.JCheckBox();
        jLabel196 = new javax.swing.JLabel();
        jLabel197 = new javax.swing.JLabel();
        jSpinner26 = new javax.swing.JSpinner();
        jCheckBox26 = new javax.swing.JCheckBox();
        jLabel198 = new javax.swing.JLabel();
        jLabel199 = new javax.swing.JLabel();
        jSpinner27 = new javax.swing.JSpinner();
        jCheckBox27 = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel13 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jSpinner17 = new javax.swing.JSpinner();
        jCheckBox17 = new javax.swing.JCheckBox();
        jLabel180 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jSpinner18 = new javax.swing.JSpinner();
        jCheckBox18 = new javax.swing.JCheckBox();
        jLabel182 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jSpinner19 = new javax.swing.JSpinner();
        jCheckBox19 = new javax.swing.JCheckBox();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        jSpinner20 = new javax.swing.JSpinner();
        jCheckBox20 = new javax.swing.JCheckBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel14 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jCheckBox11 = new javax.swing.JCheckBox();
        jLabel134 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jSpinner12 = new javax.swing.JSpinner();
        jCheckBox12 = new javax.swing.JCheckBox();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jSpinner13 = new javax.swing.JSpinner();
        jCheckBox13 = new javax.swing.JCheckBox();
        jLabel141 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jSpinner14 = new javax.swing.JSpinner();
        jCheckBox14 = new javax.swing.JCheckBox();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jSpinner15 = new javax.swing.JSpinner();
        jCheckBox15 = new javax.swing.JCheckBox();
        jLabel176 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jSpinner16 = new javax.swing.JSpinner();
        jCheckBox16 = new javax.swing.JCheckBox();
        jSpinner28 = new javax.swing.JSpinner();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel15 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jPanel53 = new javax.swing.JPanel();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jPanel54 = new javax.swing.JPanel();
        jLabel122 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel124 = new javax.swing.JLabel();
        jSpinner6 = new javax.swing.JSpinner();
        jLabel125 = new javax.swing.JLabel();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jSpinner7 = new javax.swing.JSpinner();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jSpinner8 = new javax.swing.JSpinner();
        jCheckBox8 = new javax.swing.JCheckBox();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jSpinner9 = new javax.swing.JSpinner();
        jCheckBox9 = new javax.swing.JCheckBox();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jSpinner32 = new javax.swing.JSpinner();
        jCheckBox30 = new javax.swing.JCheckBox();
        jSpinner31 = new javax.swing.JSpinner();
        jLabel121 = new javax.swing.JLabel();
        jCheckBox29 = new javax.swing.JCheckBox();
        jSpinner30 = new javax.swing.JSpinner();
        jLabel200 = new javax.swing.JLabel();
        jCheckBox28 = new javax.swing.JCheckBox();
        jSpinner29 = new javax.swing.JSpinner();
        jCheckBox2 = new javax.swing.JCheckBox();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jSpinner4 = new javax.swing.JSpinner();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jSpinner5 = new javax.swing.JSpinner();
        jLabel108 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jSpinner10 = new javax.swing.JSpinner();
        jCheckBox10 = new javax.swing.JCheckBox();
        Timelbl = new javax.swing.JLabel();
        Datalbl = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        Resetbtn = new javax.swing.JButton();
        Receiptbtn = new javax.swing.JButton();
        Exitbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        SignOutbtn = new javax.swing.JButton();
        jSpinner11 = new javax.swing.JSpinner();
        Totalbtn = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dashboard");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(800, 525));
        setName(" Dashboard"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(810, 525));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(180, 540));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/Login_Logo-removebg-preview.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 110, 88));

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" GENIUS TECH");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 170, 42));

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tablesbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Tablesbtn.setForeground(new java.awt.Color(102, 120, 138));
        Tablesbtn.setText("Tablets");
        Tablesbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tablesbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablesbtnMouseClicked(evt);
            }
        });
        jPanel5.add(Tablesbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 60, 30));

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/Dashboard Tablets.png"))); // NOI18N
        jLabel9.setText("jLabel2");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 30, 30));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 180, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Version 1.0");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 70, -1));

        jPanel7.setBackground(new java.awt.Color(0, 102, 102));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Laptopbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Laptopbtn.setForeground(new java.awt.Color(102, 120, 138));
        Laptopbtn.setText("Laptops");
        Laptopbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Laptopbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LaptopbtnMouseClicked(evt);
            }
        });
        jPanel7.add(Laptopbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 60, 30));

        jPanel8.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/Dashboard laptop.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 30, 30));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 180, -1));

        jPanel9.setBackground(new java.awt.Color(34, 48, 62));
        jPanel9.setMaximumSize(new java.awt.Dimension(170, 30));
        jPanel9.setMinimumSize(new java.awt.Dimension(170, 30));
        jPanel9.setPreferredSize(new java.awt.Dimension(170, 30));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Phonelbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Phonelbl.setForeground(new java.awt.Color(255, 255, 255));
        Phonelbl.setText("Phones");
        Phonelbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Phonelbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PhonelblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PhonelblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PhonelblMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PhonelblMouseReleased(evt);
            }
        });
        jPanel9.add(Phonelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 100, 30));

        jPanel10.setBackground(new java.awt.Color(64, 194, 150));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/Dashboard phones.png"))); // NOI18N
        jLabel11.setText("jLabel2");
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 30, 30));

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 180, -1));

        jPanel11.setBackground(new java.awt.Color(0, 102, 102));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Accessoriesbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Accessoriesbtn.setForeground(new java.awt.Color(102, 120, 138));
        Accessoriesbtn.setText("Accessories");
        Accessoriesbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Accessoriesbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccessoriesbtnMouseClicked(evt);
            }
        });
        jPanel11.add(Accessoriesbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 80, 30));

        jPanel12.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/Dashboard Accessories.png"))); // NOI18N
        jLabel13.setText("jLabel2");
        jPanel11.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 30, 30));

        jPanel2.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 180, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 540));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/Apple-16-pro-max-phones.jpg"))); // NOI18N
        jPanel17.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 90, 130));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("LKR 448,000/=");
        jPanel17.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 100, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel18.setText("Pro Max (256GB)");
        jPanel17.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 90, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel19.setText("Apple iPhone 16");
        jPanel17.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 90, 30));

        jPanel4.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 31, 100, 200));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/Apple-iPhone-15-Pro-Max-copy-thi.jpg"))); // NOI18N
        jPanel18.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 90, 130));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("LKR 322,600/=");
        jPanel18.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 100, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel22.setText("Pro Max (256GB)");
        jPanel18.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 90, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel23.setText("Apple iPhone 15");
        jPanel18.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 90, 30));

        jPanel4.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 31, -1, -1));

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/galaxy-s21-phantom-white-this.jpg"))); // NOI18N
        jPanel19.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 90, 130));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText(" LKR 95,240/=");
        jPanel19.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 100, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel26.setText("S21 5G (128GB)");
        jPanel19.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 90, 30));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel27.setText("  Samsung Galaxy ");
        jPanel19.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 100, 30));

        jPanel4.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 31, -1, -1));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/Redmo-Note-12-Pro-5G-Blue-600x60.jpg"))); // NOI18N
        jPanel20.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 90, 130));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setText(" LKR 98,999/=");
        jPanel20.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 100, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel30.setText("12 Pro (128GB)");
        jPanel20.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 90, 30));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel31.setText("Xiaomi Redmi Note");
        jPanel20.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 100, 30));

        jPanel4.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/Xiaomi-Redmi-Note-13-Pro-4G-500x.jpg"))); // NOI18N
        jPanel21.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 90, 130));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setText("LKR 109,990/=");
        jPanel21.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 180, -1, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel34.setText("13 Pro (512GB)");
        jPanel21.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 90, 30));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel35.setText("Xiaomi Redmi Note");
        jPanel21.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 100, 30));

        jPanel4.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/s24-samsung-this.jpg"))); // NOI18N
        jPanel23.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 90, 130));

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel41.setText("LKR 263,000/=");
        jPanel23.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 100, -1));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel42.setText("S24 Ultra (256GB)");
        jPanel23.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 90, 30));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel43.setText("Samsung Galaxy");
        jPanel23.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 90, 30));

        jPanel4.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/Xiaomi-Redmi-Note-11-Pro-5G-8GB.jpg"))); // NOI18N
        jPanel22.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 90, 130));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setText("LKR 136,570/=");
        jPanel22.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 100, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel38.setText("11 Pro + (256GB)");
        jPanel22.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 90, 30));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel39.setText("Xiaomi Redmi Note");
        jPanel22.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 100, 30));

        jPanel4.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, -1, 205));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 10));

        jLabel186.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel186.setText("Quantity :");
        jPanel4.add(jLabel186, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel187.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel187.setText("Purchase :");
        jPanel4.add(jLabel187, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jSpinner21.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jSpinner21.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));
        jSpinner21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSpinner21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSpinner21MouseClicked(evt);
            }
        });
        jPanel4.add(jSpinner21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 40, 20));

        jCheckBox21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox21ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 20, -1));

        jLabel188.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel188.setText("Quantity :");
        jPanel4.add(jLabel188, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        jLabel189.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel189.setText("Purchase :");
        jPanel4.add(jLabel189, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        jSpinner22.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jSpinner22.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));
        jSpinner22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jSpinner22, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 40, 20));

        jCheckBox22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox22ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox22, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 20, -1));

        jLabel190.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel190.setText("Quantity :");
        jPanel4.add(jLabel190, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        jLabel191.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel191.setText("Purchase :");
        jPanel4.add(jLabel191, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        jSpinner23.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jSpinner23.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));
        jSpinner23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jSpinner23, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 40, 20));

        jCheckBox23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox23ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox23, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 20, -1));

        jLabel192.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel192.setText("Quantity :");
        jPanel4.add(jLabel192, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        jLabel193.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel193.setText("Purchase :");
        jPanel4.add(jLabel193, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, -1));

        jSpinner24.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jSpinner24.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));
        jSpinner24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jSpinner24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, 40, 20));

        jCheckBox24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox24ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 20, -1));

        jLabel194.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel194.setText("Quantity :");
        jPanel4.add(jLabel194, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, -1, -1));

        jLabel195.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel195.setText("Purchase :");
        jPanel4.add(jLabel195, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, -1, -1));

        jSpinner25.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jSpinner25.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));
        jSpinner25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jSpinner25, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 40, 20));

        jCheckBox25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox25ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox25, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 20, -1));

        jLabel196.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel196.setText("Quantity :");
        jPanel4.add(jLabel196, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, -1, -1));

        jLabel197.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel197.setText("Purchase :");
        jPanel4.add(jLabel197, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, -1, -1));

        jSpinner26.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jSpinner26.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));
        jSpinner26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jSpinner26, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, 40, 20));

        jCheckBox26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox26ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox26, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 20, -1));

        jLabel198.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel198.setText("Quantity :");
        jPanel4.add(jLabel198, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 790, -1, -1));

        jLabel199.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel199.setText("Purchase :");
        jPanel4.add(jLabel199, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 820, -1, -1));

        jSpinner27.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jSpinner27.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));
        jSpinner27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jSpinner27, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 790, 40, 20));

        jCheckBox27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox27ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox27, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 820, 20, -1));

        jScrollPane1.setViewportView(jPanel4);

        jTabbedPane1.addTab("Phones", jScrollPane1);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/s6-black-600x600-rs110-this.jpg"))); // NOI18N
        jPanel24.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 90, 130));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setText("LKR 110,000/=");
        jPanel24.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 100, -1));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel46.setText("Tab s6 Lite (128GB)");
        jPanel24.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 100, 30));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel47.setText("  Samsung Galaxy");
        jPanel24.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 100, 30));

        jPanel13.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/Samsung-Galaxy-Tab-A9-Specificat.jpg"))); // NOI18N
        jPanel25.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 90, 130));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel49.setText("  LKR 34,990/=");
        jPanel25.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 100, -1));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel50.setText("Tab A9 WIFI(128GB)");
        jPanel25.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 100, 30));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel51.setText("   Samsung Galaxy");
        jPanel25.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 100, 30));

        jPanel13.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/3-2-this.jpg"))); // NOI18N
        jPanel26.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 90, 130));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel53.setText("  LKR 40,000/=");
        jPanel26.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 100, -1));

        jLabel54.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel54.setText(" 4G 3GB (32GB)");
        jPanel26.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 90, 30));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel55.setText("  Greentel A10 Tab");
        jPanel26.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 100, 30));

        jPanel13.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 100, -1));

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/blue-tab-ipad-air-6.jpg"))); // NOI18N
        jPanel27.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 90, 130));

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel57.setText("LKR 290,285/=");
        jPanel27.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 100, -1));

        jLabel58.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel58.setText("  M2 WIFI (128GB)");
        jPanel27.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 100, 30));

        jLabel59.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel59.setText("  Apple iPad Air 6");
        jPanel27.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 100, 30));

        jPanel13.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));
        jPanel13.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 10));

        jLabel178.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel178.setText("Quantity :");
        jPanel13.add(jLabel178, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel179.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel179.setText("Purchase :");
        jPanel13.add(jLabel179, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jSpinner17.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jSpinner17.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));
        jSpinner17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel13.add(jSpinner17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 40, 20));

        jCheckBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox17ActionPerformed(evt);
            }
        });
        jPanel13.add(jCheckBox17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 20, -1));

        jLabel180.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel180.setText("Quantity :");
        jPanel13.add(jLabel180, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        jLabel181.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel181.setText("Purchase :");
        jPanel13.add(jLabel181, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        jSpinner18.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jSpinner18.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));
        jSpinner18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel13.add(jSpinner18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 40, 20));

        jCheckBox18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox18ActionPerformed(evt);
            }
        });
        jPanel13.add(jCheckBox18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 20, -1));

        jLabel182.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel182.setText("Quantity :");
        jPanel13.add(jLabel182, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        jLabel183.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel183.setText("Purchase :");
        jPanel13.add(jLabel183, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        jSpinner19.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jSpinner19.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));
        jSpinner19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel13.add(jSpinner19, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 40, 20));

        jCheckBox19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox19ActionPerformed(evt);
            }
        });
        jPanel13.add(jCheckBox19, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 20, -1));

        jLabel184.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel184.setText("Quantity :");
        jPanel13.add(jLabel184, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        jLabel185.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel185.setText("Purchase :");
        jPanel13.add(jLabel185, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, -1));

        jSpinner20.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jSpinner20.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));
        jSpinner20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel13.add(jSpinner20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, 40, 20));

        jCheckBox20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox20ActionPerformed(evt);
            }
        });
        jPanel13.add(jCheckBox20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 20, -1));

        jScrollPane2.setViewportView(jPanel13);

        jTabbedPane1.addTab("Tablets", jScrollPane2);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/DELL5510-I7-8GB512-SIL-01-164087.jpg"))); // NOI18N
        jPanel28.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 100, 130));

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel61.setText("LKR 353,990/=");
        jPanel28.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 100, -1));

        jLabel62.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel62.setText("Intel i7 11th Gen");
        jPanel28.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 90, 30));

        jLabel63.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel63.setText("  Dell Inspiron 5510");
        jPanel28.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 100, 30));

        jPanel14.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 110, -1));

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel65.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel65.setText("  LKR 210,000/=");
        jPanel29.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 110, -1));

        jLabel66.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel66.setText(" i5 13Gen (8GB RAM)");
        jPanel29.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 110, 30));

        jLabel67.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel67.setText("Dell Vostro 3530");
        jPanel29.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 90, 30));

        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/Dell-Inspiron-3530-i5 (1).jpg"))); // NOI18N
        jPanel29.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 130));

        jPanel14.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 110, -1));

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/111999-SP747-mbp13-silver.jpg"))); // NOI18N
        jPanel30.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 100, 130));

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel69.setText(" LKR 425,000/=");
        jPanel30.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 180, -1, -1));

        jLabel71.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel71.setText("    MacBook Pro");
        jPanel30.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 100, 30));

        jLabel72.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel72.setText(" 13-inch 2017");
        jPanel30.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 70, 30));

        jPanel14.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 110, -1));

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));
        jPanel34.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/hp-laptop-ryzen-5-166600170663.jpg"))); // NOI18N
        jPanel34.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 120));

        jLabel85.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel85.setText("LKR 285,290/=");
        jPanel34.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel86.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel86.setText("  1TB (8GB Ram)");
        jPanel34.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 90, 30));

        jLabel87.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel87.setText(" HP Laptop Razen 5");
        jPanel34.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 100, 30));

        jPanel14.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 110, -1));

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/HP-Laptop-250-G10-i5-removebg-preview.png"))); // NOI18N
        jPanel35.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 90));

        jLabel89.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel89.setText("  LKR 176,000/=");
        jPanel35.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 110, -1));

        jLabel90.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel90.setText("13th Gen Laptop");
        jPanel35.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 90, 30));

        jLabel91.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel91.setText("HP 250 G10 I5");
        jPanel35.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 80, 30));

        jPanel14.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 110, -1));

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));
        jPanel36.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/acer-laptop-i7-12Th-Gen.jpg"))); // NOI18N
        jPanel36.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 100, 100));

        jLabel93.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel93.setText("  LKR 425,000/=");
        jPanel36.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 110, -1));

        jLabel94.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel94.setText(" 12th Gen (8GB Ram)");
        jPanel36.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 110, 30));

        jLabel95.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel95.setText("Acer Intel Core i7 ");
        jPanel36.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 90, 30));

        jPanel14.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 110, -1));
        jPanel14.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 10));

        jLabel132.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel132.setText("Quantity :");
        jPanel14.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel133.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel133.setText("Purchase :");
        jPanel14.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11ActionPerformed(evt);
            }
        });
        jPanel14.add(jCheckBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 20, -1));

        jLabel134.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel134.setText("Quantity :");
        jPanel14.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        jLabel138.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel138.setText("Purchase :");
        jPanel14.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        jSpinner12.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jSpinner12.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));
        jSpinner12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel14.add(jSpinner12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 40, 20));

        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });
        jPanel14.add(jCheckBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 20, -1));

        jLabel139.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel139.setText("Quantity :");
        jPanel14.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        jLabel140.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel140.setText("Purchase :");
        jPanel14.add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        jSpinner13.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jSpinner13.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));
        jSpinner13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel14.add(jSpinner13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 40, 20));

        jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox13ActionPerformed(evt);
            }
        });
        jPanel14.add(jCheckBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 20, -1));

        jLabel141.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel141.setText("Quantity :");
        jPanel14.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        jLabel153.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel153.setText("Purchase :");
        jPanel14.add(jLabel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, -1));

        jSpinner14.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jSpinner14.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));
        jSpinner14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel14.add(jSpinner14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, 40, 20));

        jCheckBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox14ActionPerformed(evt);
            }
        });
        jPanel14.add(jCheckBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 20, -1));

        jLabel154.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel154.setText("Quantity :");
        jPanel14.add(jLabel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, -1, -1));

        jLabel155.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel155.setText("Purchase :");
        jPanel14.add(jLabel155, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, -1, -1));

        jSpinner15.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jSpinner15.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));
        jSpinner15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel14.add(jSpinner15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 40, 20));

        jCheckBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox15ActionPerformed(evt);
            }
        });
        jPanel14.add(jCheckBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 20, -1));

        jLabel176.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel176.setText("Quantity :");
        jPanel14.add(jLabel176, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, -1, -1));

        jLabel177.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel177.setText("Purchase :");
        jPanel14.add(jLabel177, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, -1, -1));

        jSpinner16.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jSpinner16.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));
        jSpinner16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel14.add(jSpinner16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, 40, 20));

        jCheckBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox16ActionPerformed(evt);
            }
        });
        jPanel14.add(jCheckBox16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 20, -1));

        jSpinner28.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jSpinner28.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));
        jSpinner28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel14.add(jSpinner28, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 40, 20));

        jScrollPane4.setViewportView(jPanel14);

        jTabbedPane1.addTab("Laptops", jScrollPane4);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/Beats-Studio3-Wireless-Noise-Can.jpg"))); // NOI18N
        jPanel31.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 90, 130));

        jLabel70.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel70.setText(" LKR 18,000/=");
        jPanel31.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 100, -1));

        jLabel73.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel73.setText("     Headphone");
        jPanel31.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 100, 30));

        jLabel74.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel74.setText(" Beats M3 Wireless");
        jPanel31.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 100, 30));

        jPanel15.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 31, 100, 200));

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/054d2cc068cc52238453a98d2fce0ba7.jpg"))); // NOI18N
        jPanel32.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 90, 130));

        jLabel76.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel76.setText("   LKR 4,000/=");
        jPanel32.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 100, -1));

        jLabel77.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel77.setText("  iphones ");
        jPanel32.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 70, 30));

        jLabel78.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel78.setText("   Fast Charger for ");
        jPanel32.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 100, 30));

        jPanel15.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 31, -1, -1));

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/EOS-850D-EF-S18-55mm-f4-56-IS-ST.jpg"))); // NOI18N
        jPanel33.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 90, 130));

        jLabel80.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel80.setText(" LKR 185,000/=");
        jPanel33.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 180, -1, -1));

        jLabel81.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel81.setText(" Camera EOS 850D");
        jPanel33.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 100, 30));

        jLabel82.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel82.setText("Genuin Canon ");
        jPanel33.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 80, 30));

        jPanel15.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 31, -1, -1));

        jPanel49.setBackground(new java.awt.Color(255, 255, 255));
        jPanel49.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel49.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel142.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/DIP-6KVA-Online-1-600x600.jpg"))); // NOI18N
        jPanel49.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 90, 130));

        jLabel143.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel143.setText("LKR 440,000/=");
        jPanel49.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 100, -1));

        jLabel144.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel144.setText("Online Ups (2Y)");
        jPanel49.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 90, 30));

        jLabel145.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel145.setText("DIP 6Kva ");
        jPanel49.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 130, 50, 30));

        jPanel15.add(jPanel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        jPanel50.setBackground(new java.awt.Color(255, 255, 255));
        jPanel50.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel50.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel146.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/1-aa26048c-e77c-4786-bb9f-f8ab76.jpg"))); // NOI18N
        jPanel50.add(jLabel146, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 90, 130));

        jLabel147.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel147.setText(" LKR 22,600/=");
        jPanel50.add(jLabel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 100, -1));

        jLabel148.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel148.setText("JAYROOM Funpods");
        jPanel50.add(jLabel148, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 100, 30));

        jLabel149.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel149.setText(" wireless earphone");
        jPanel50.add(jLabel149, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 100, 30));

        jPanel15.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        jPanel51.setBackground(new java.awt.Color(255, 255, 255));
        jPanel51.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel51.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/718yxonHN8L-AC-SX425.jpg"))); // NOI18N
        jPanel51.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 120));

        jLabel150.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel150.setText("  LKR 28,000/=");
        jPanel51.add(jLabel150, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 100, -1));

        jLabel151.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel151.setText(" Waterproof 25W");
        jPanel51.add(jLabel151, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 150, -1, 30));

        jLabel152.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel152.setText("  Portable Speaker");
        jPanel51.add(jLabel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 100, 30));

        jPanel15.add(jPanel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 100, -1));

        jPanel53.setBackground(new java.awt.Color(255, 255, 255));
        jPanel53.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel53.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel156.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/1-34-2.jpg"))); // NOI18N
        jPanel53.add(jLabel156, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 90, 130));

        jLabel157.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel157.setText(" LKR 15,240/=");
        jPanel53.add(jLabel157, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 100, -1));

        jLabel158.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel158.setText("Wireless Mouse");
        jPanel53.add(jLabel158, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 90, 30));

        jLabel159.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel159.setText(" Logitech M650");
        jPanel53.add(jLabel159, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 90, 30));

        jPanel15.add(jPanel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 570, -1, -1));

        jPanel47.setBackground(new java.awt.Color(255, 255, 255));
        jPanel47.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel47.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/2023-Smart-Watch-Series-8-T900-U.jpg"))); // NOI18N
        jPanel47.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 90, 130));

        jLabel135.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel135.setText("   LKR 8,000/=");
        jPanel47.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 100, -1));

        jLabel136.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel136.setText("  Smart Watch");
        jPanel47.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 80, 30));

        jLabel137.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel137.setText(" T900 Ultra BIG");
        jPanel47.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 90, 30));

        jPanel15.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, -1, -1));

        jPanel54.setBackground(new java.awt.Color(255, 255, 255));
        jPanel54.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(230, 230, 230), 2, true));
        jPanel54.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel122.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photoes/Mi-10000-Power-Bank-White (1).jpg"))); // NOI18N
        jPanel54.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 90, 130));

        jLabel160.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel160.setText("  LKR 10,690/=");
        jPanel54.add(jLabel160, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 100, -1));

        jLabel161.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel161.setText("  Power Bank 3");
        jPanel54.add(jLabel161, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 90, 30));

        jLabel162.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel162.setText("  Mi 10000mAh");
        jPanel54.add(jLabel162, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 90, 30));

        jPanel15.add(jPanel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 570, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 153, 51));
        jPanel15.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 10));

        jLabel124.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel124.setText("Purchase :");
        jPanel15.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jSpinner6.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));
        jSpinner6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel15.add(jSpinner6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 40, 20));

        jLabel125.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel125.setText("Quantity :");
        jPanel15.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jCheckBox6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox6MouseClicked(evt);
            }
        });
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 20, -1));

        jLabel126.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel126.setText("Quantity :");
        jPanel15.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        jLabel127.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel127.setText("Purchase :");
        jPanel15.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 20, -1));

        jSpinner7.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jSpinner7.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));
        jSpinner7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel15.add(jSpinner7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 40, 20));

        jLabel128.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel128.setText("Purchase :");
        jPanel15.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        jLabel129.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel129.setText("Quantity :");
        jPanel15.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        jSpinner8.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jSpinner8.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));
        jSpinner8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel15.add(jSpinner8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 40, 20));

        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 20, -1));

        jLabel130.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel130.setText("Quantity :");
        jPanel15.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        jLabel131.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel131.setText("Purchase :");
        jPanel15.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, -1));

        jSpinner9.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jSpinner9.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));
        jSpinner9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel15.add(jSpinner9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, 40, 20));

        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 20, -1));

        jLabel174.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel174.setText("Purchase :");
        jPanel15.add(jLabel174, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, -1, -1));

        jLabel175.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel175.setText("Quantity :");
        jPanel15.add(jLabel175, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, -1, -1));

        jSpinner32.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jSpinner32.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));
        jSpinner32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel15.add(jSpinner32, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 40, 20));

        jCheckBox30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox30ActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckBox30, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 20, -1));

        jSpinner31.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jSpinner31.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));
        jSpinner31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel15.add(jSpinner31, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, 40, 20));

        jLabel121.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel121.setText("Purchase :");
        jPanel15.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, -1, -1));

        jCheckBox29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox29ActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckBox29, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 20, -1));

        jSpinner30.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jSpinner30.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));
        jSpinner30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel15.add(jSpinner30, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 40, 20));

        jLabel200.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel200.setText("Purchase :");
        jPanel15.add(jLabel200, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        jCheckBox28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox28ActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckBox28, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 20, -1));

        jSpinner29.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jSpinner29.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));
        jSpinner29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel15.add(jSpinner29, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 40, 20));

        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 810, 20, -1));

        jSpinner2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));
        jSpinner2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel15.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 780, 40, -1));

        jLabel101.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel101.setText("Quantity :");
        jPanel15.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 780, -1, -1));

        jLabel102.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel102.setText("Purchase :");
        jPanel15.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 810, -1, -1));

        jSpinner1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));
        jSpinner1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel15.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 780, 40, -1));

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 810, 20, -1));

        jLabel99.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel99.setText("Purchase :");
        jPanel15.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 810, -1, -1));

        jLabel100.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel100.setText("Quantity :");
        jPanel15.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 780, -1, -1));

        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 810, 20, -1));

        jSpinner4.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));
        jSpinner4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel15.add(jSpinner4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 780, 40, -1));

        jLabel105.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel105.setText("Quantity :");
        jPanel15.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 780, -1, -1));

        jLabel106.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel106.setText("Purchase :");
        jPanel15.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 810, -1, -1));

        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 20, -1));

        jSpinner5.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));
        jSpinner5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel15.add(jSpinner5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, 40, 20));

        jLabel108.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel108.setText("Quantity :");
        jPanel15.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, -1, -1));

        jLabel107.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel107.setText("Purchase :");
        jPanel15.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, -1, -1));

        jSpinner10.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jSpinner10.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));
        jSpinner10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel15.add(jSpinner10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 40, 20));

        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });
        jPanel15.add(jCheckBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 20, -1));

        jScrollPane3.setViewportView(jPanel15);

        jTabbedPane1.addTab("Accessories", jScrollPane3);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 490, 550));

        Timelbl.setText("Time");
        jPanel1.add(Timelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, -1, -1));

        Datalbl.setText("Date");
        jPanel1.add(Datalbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, -4, 570, 530));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 250, 20));

        Resetbtn.setBackground(new java.awt.Color(0, 102, 102));
        Resetbtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Resetbtn.setForeground(new java.awt.Color(255, 255, 255));
        Resetbtn.setText("Reset");
        Resetbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetbtnActionPerformed(evt);
            }
        });
        jPanel3.add(Resetbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 70, -1));

        Receiptbtn.setBackground(new java.awt.Color(0, 102, 102));
        Receiptbtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Receiptbtn.setForeground(new java.awt.Color(255, 255, 255));
        Receiptbtn.setText("Print");
        Receiptbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Receiptbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceiptbtnActionPerformed(evt);
            }
        });
        jPanel3.add(Receiptbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 70, -1));

        Exitbtn.setBackground(new java.awt.Color(255, 0, 51));
        Exitbtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Exitbtn.setForeground(new java.awt.Color(255, 255, 255));
        Exitbtn.setText("Exit");
        Exitbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitbtnActionPerformed(evt);
            }
        });
        jPanel3.add(Exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("%");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 20, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("00.00");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 110, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Offer        :");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 80, 20));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Sub Total :");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 80, 20));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Rs.");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 20, 20));

        jLabel96.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(255, 255, 255));
        jLabel96.setText("00.00");
        jPanel3.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 110, 20));

        jLabel97.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(255, 255, 255));
        jLabel97.setText("Total        :");
        jPanel3.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 80, 20));

        jLabel98.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(255, 255, 255));
        jLabel98.setText("Rs.");
        jPanel3.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 20, 20));

        SignOutbtn.setBackground(new java.awt.Color(0, 102, 102));
        SignOutbtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SignOutbtn.setForeground(new java.awt.Color(255, 255, 255));
        SignOutbtn.setText("SignOut");
        SignOutbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignOutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutbtnActionPerformed(evt);
            }
        });
        jPanel3.add(SignOutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 90, -1));

        jSpinner11.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jSpinner11.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
        jSpinner11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jSpinner11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 50, 20));

        Totalbtn.setBackground(new java.awt.Color(0, 102, 102));
        Totalbtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Totalbtn.setForeground(new java.awt.Color(255, 255, 255));
        Totalbtn.setText("Total");
        Totalbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Totalbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalbtnActionPerformed(evt);
            }
        });
        jPanel3.add(Totalbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 70, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane6.setViewportView(jTextArea1);

        jPanel3.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 340));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PhonelblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhonelblMouseClicked
        jPanel9.setBackground(selectionColour);
        jPanel10.setBackground(sidecolour);
        Phonelbl.setForeground(textselectionclolour);
        jLabel11.setVisible(true);
        jTabbedPane1.setSelectedIndex(0);
        ETabletsbtn();
        ELaptopssbtn();
        EAccessoriesbtn();
    }//GEN-LAST:event_PhonelblMouseClicked

    private void PhonelblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhonelblMouseEntered

    }//GEN-LAST:event_PhonelblMouseEntered

    private void PhonelblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhonelblMouseExited
//        jPanel9.setBackground(eselectionColour);
//        jPanel10.setBackground(esidecolour);
//        jLabel10.setForeground(etextselectionclolour);
//        jLabel11.setVisible(true);
    }//GEN-LAST:event_PhonelblMouseExited

    private void PhonelblMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhonelblMouseReleased

    }//GEN-LAST:event_PhonelblMouseReleased

    private void TablesbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablesbtnMouseClicked
        jPanel5.setBackground(selectionColour);
        jPanel6.setBackground(sidecolour);
        Tablesbtn.setForeground(textselectionclolour);
        jTabbedPane1.setSelectedIndex(1);
        EPhonesbtn();
        ELaptopssbtn();
        EAccessoriesbtn();
    }//GEN-LAST:event_TablesbtnMouseClicked

    private void LaptopbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LaptopbtnMouseClicked
        jPanel7.setBackground(selectionColour);
        jPanel8.setBackground(sidecolour);
        Laptopbtn.setForeground(textselectionclolour);
        jTabbedPane1.setSelectedIndex(2);
        ETabletsbtn();
        EPhonesbtn();
        EAccessoriesbtn();
    }//GEN-LAST:event_LaptopbtnMouseClicked

    private void AccessoriesbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccessoriesbtnMouseClicked
        jPanel11.setBackground(selectionColour);
        jPanel12.setBackground(sidecolour);
        Accessoriesbtn.setForeground(textselectionclolour);
        jTabbedPane1.setSelectedIndex(3);
        ETabletsbtn();
        EPhonesbtn();
        ELaptopssbtn();
    }//GEN-LAST:event_AccessoriesbtnMouseClicked

    private void ResetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetbtnActionPerformed
        reset();
    }//GEN-LAST:event_ResetbtnActionPerformed

    private void ReceiptbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceiptbtnActionPerformed
        if (total != 0) {
            if (!Totalbtn.isEnabled()) {
                if (!jTextArea1.getText().isEmpty()) {
                    try {
                        jTextArea1.setVisible(true);
                        jTextArea1.print();
                        JOptionPane.showMessageDialog(null, "Done");
                    } catch (PrinterException ex) {
                        Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Text area is empty!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "First, you should calculate the total price!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "You haven't purchased any product!");
        }
    }//GEN-LAST:event_ReceiptbtnActionPerformed

    private void ExitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitbtnActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Are you sure want to close?", "Confirm Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_ExitbtnActionPerformed

    private void SignOutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutbtnActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Are you sure want to close?", "Confirm Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            Login login = new Login();
            login.setVisible(true);
            this.dispose();
        } else {
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_SignOutbtnActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        int qty = Integer.parseInt(jSpinner6.getValue().toString());
        if (qtyisZero(qty) && jCheckBox6.isSelected()) {
            x++;
            if (x == 1) {
                GeniusTech();
            }
            double price = qty * 18000;
            total += price;
            jTextArea1.setText(jTextArea1.getText() + x + ". " + jLabel74.getText() + "\n" + jLabel73.getText() + "                               " + price + "\n");
        } else {
            jCheckBox6.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox6MouseClicked

    }//GEN-LAST:event_jCheckBox6MouseClicked

    private void jCheckBox21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox21ActionPerformed
        int qty = Integer.parseInt(jSpinner21.getValue().toString());
        if (qtyisZero(qty) && jCheckBox21.isSelected()) {
            x++;
            if (x == 1) {
                GeniusTech();
            }
            double price = qty * 448000;
            total += price;
            jTextArea1.setText(jTextArea1.getText() + x + ". " + jLabel19.getText() + "\n" + jLabel18.getText() + "                        " + price + "\n");
        } else {
            jCheckBox21.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox21ActionPerformed

    private void jSpinner21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSpinner21MouseClicked

    }//GEN-LAST:event_jSpinner21MouseClicked

    private void jCheckBox22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox22ActionPerformed
        int qty = Integer.parseInt(jSpinner22.getValue().toString());
        if (qtyisZero(qty) && jCheckBox22.isSelected()) {
            x++;
            if (x == 1) {
                GeniusTech();
            }
            double price = qty * 322600;
            total += price;
            jTextArea1.setText(jTextArea1.getText() + x + ". " + jLabel23.getText() + "\n" + jLabel22.getText() + "                        " + price + "\n");
        } else {
            jCheckBox22.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox22ActionPerformed

    private void jCheckBox23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox23ActionPerformed
        int qty = Integer.parseInt(jSpinner23.getValue().toString());
        if (qtyisZero(qty) && jCheckBox23.isSelected()) {
            x++;
            if (x == 1) {
                GeniusTech();
            }
            double price = qty * 95240;
            total += price;
            jTextArea1.setText(jTextArea1.getText() + x + ". " + jLabel27.getText() + "\n" + jLabel26.getText() + "                            " + price + "\n");
        } else {
            jCheckBox23.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox23ActionPerformed

    private void jCheckBox24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox24ActionPerformed
        int qty = Integer.parseInt(jSpinner24.getValue().toString());
        if (qtyisZero(qty) && jCheckBox24.isSelected()) {
            x++;
            if (x == 1) {
                GeniusTech();
            }
            double price = qty * 263000;
            total += price;
            jTextArea1.setText(jTextArea1.getText() + x + ". " + jLabel43.getText() + "\n" + jLabel42.getText() + "                      " + price + "\n");
        } else {
            jCheckBox24.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox24ActionPerformed

    private void jCheckBox25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox25ActionPerformed
        int qty = Integer.parseInt(jSpinner25.getValue().toString());
        if (qtyisZero(qty) && jCheckBox25.isSelected()) {
            x++;
            if (x == 1) {
                GeniusTech();
            }
            double price = qty * 109990;
            total += price;
            jTextArea1.setText(jTextArea1.getText() + x + ". " + jLabel35.getText() + "\n" + jLabel34.getText() + "                           " + price + "\n");
        } else {
            jCheckBox25.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox25ActionPerformed

    private void jCheckBox26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox26ActionPerformed
        int qty = Integer.parseInt(jSpinner26.getValue().toString());
        if (qtyisZero(qty) && jCheckBox26.isSelected()) {
            x++;
            if (x == 1) {
                GeniusTech();
            }
            double price = qty * 98999;
            total += price;
            jTextArea1.setText(jTextArea1.getText() + x + ". " + jLabel31.getText() + "\n" + jLabel30.getText() + "                              " + price + "\n");
        } else {
            jCheckBox26.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox26ActionPerformed

    private void jCheckBox27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox27ActionPerformed
        int qty = Integer.parseInt(jSpinner27.getValue().toString());
        if (qtyisZero(qty) && jCheckBox27.isSelected()) {
            x++;
            if (x == 1) {
                GeniusTech();
            }
            double price = qty * 136570;
            total += price;
            jTextArea1.setText(jTextArea1.getText() + x + ". " + jLabel39.getText() + "\n" + jLabel38.getText() + "                        " + price + "\n");
        } else {
            jCheckBox27.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox27ActionPerformed

    private void jCheckBox17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox17ActionPerformed
        int qty = Integer.parseInt(jSpinner17.getValue().toString());
        if (qtyisZero(qty) && jCheckBox17.isSelected()) {
            x++;
            if (x == 1) {
                GeniusTech();
            }
            double price = qty * 110000;
            total += price;
            jTextArea1.setText(jTextArea1.getText() + x + ". " + jLabel47.getText() + "\n" + jLabel46.getText() + "                    " + price + "\n");
        } else {
            jCheckBox17.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox17ActionPerformed

    private void jCheckBox18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox18ActionPerformed
        int qty = Integer.parseInt(jSpinner18.getValue().toString());
        if (qtyisZero(qty) && jCheckBox18.isSelected()) {
            x++;
            if (x == 1) {
                GeniusTech();
            }
            double price = qty * 290285;
            total += price;
            jTextArea1.setText(jTextArea1.getText() + x + ". " + jLabel59.getText() + "\n" + jLabel58.getText() + "                      " + price + "\n");
        } else {
            jCheckBox18.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox18ActionPerformed

    private void jCheckBox19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox19ActionPerformed
        int qty = Integer.parseInt(jSpinner19.getValue().toString());
        if (qtyisZero(qty) && jCheckBox19.isSelected()) {
            x++;
            if (x == 1) {
                GeniusTech();
            }
            double price = qty * 34900;
            total += price;
            jTextArea1.setText(jTextArea1.getText() + x + ". " + jLabel51.getText() + "\n" + jLabel50.getText() + "                     " + price + "\n");
        } else {
            jCheckBox19.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox19ActionPerformed

    private void jCheckBox20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox20ActionPerformed
        int qty = Integer.parseInt(jSpinner20.getValue().toString());
        if (qtyisZero(qty) && jCheckBox20.isSelected()) {
            x++;
            if (x == 1) {
                GeniusTech();
            }
            double price = qty * 40000;
            total += price;
            jTextArea1.setText(jTextArea1.getText() + x + ". " + jLabel55.getText() + "\n" + jLabel54.getText() + "                             " + price + "\n");
        } else {
            jCheckBox20.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox20ActionPerformed

    private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox11ActionPerformed
        int qty = Integer.parseInt(jSpinner28.getValue().toString());
        if (qtyisZero(qty) && jCheckBox11.isSelected()) {
            x++;
            if (x == 1) {
                GeniusTech();
            }
            double price = qty * 285290;
            total += price;
            jTextArea1.setText(jTextArea1.getText() + x + ". " + jLabel87.getText() + "\n" + jLabel86.getText() + "                         " + price + "\n");
        } else {
            jCheckBox11.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox11ActionPerformed

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox12ActionPerformed
        int qty = Integer.parseInt(jSpinner12.getValue().toString());
        if (qtyisZero(qty) && jCheckBox12.isSelected()) {
            x++;
            if (x == 1) {
                GeniusTech();
            }
            double price = qty * 176000;
            total += price;
            jTextArea1.setText(jTextArea1.getText() + x + ". " + jLabel91.getText() + "\n" + jLabel90.getText() + "                        " + price + "\n");
        } else {
            jCheckBox12.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox12ActionPerformed

    private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox13ActionPerformed
        int qty = Integer.parseInt(jSpinner13.getValue().toString());
        if (qtyisZero(qty) && jCheckBox13.isSelected()) {
            x++;
            if (x == 1) {
                GeniusTech();
            }
            double price = qty * 425000;
            total += price;
            jTextArea1.setText(jTextArea1.getText() + x + ". " + jLabel95.getText() + "\n" + jLabel94.getText() + "                " + price + "\n");
        } else {
            jCheckBox13.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox13ActionPerformed

    private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox14ActionPerformed
        int qty = Integer.parseInt(jSpinner14.getValue().toString());
        if (qtyisZero(qty) && jCheckBox14.isSelected()) {
            x++;
            if (x == 1) {
                GeniusTech();
            }
            double price = qty * 353990;
            total += price;
            jTextArea1.setText(jTextArea1.getText() + x + ". " + jLabel63.getText() + "\n" + jLabel62.getText() + "                        " + price + "\n");
        } else {
            jCheckBox14.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox14ActionPerformed

    private void jCheckBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox15ActionPerformed
        int qty = Integer.parseInt(jSpinner15.getValue().toString());
        if (qtyisZero(qty) && jCheckBox15.isSelected()) {
            x++;
            if (x == 1) {
                GeniusTech();
            }
            double price = qty * 210000;
            total += price;
            jTextArea1.setText(jTextArea1.getText() + x + ". " + jLabel67.getText() + "\n" + jLabel66.getText() + "                " + price + "\n");
        } else {
            jCheckBox15.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox15ActionPerformed

    private void jCheckBox16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox16ActionPerformed
        int qty = Integer.parseInt(jSpinner16.getValue().toString());
        if (qtyisZero(qty) && jCheckBox16.isSelected()) {
            x++;
            if (x == 1) {
                GeniusTech();
            }
            double price = qty * 425000;
            total += price;
            jTextArea1.setText(jTextArea1.getText() + x + ". " + jLabel71.getText() + "\n" + jLabel72.getText() + "                              " + price + "\n");
        } else {
            jCheckBox16.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox16ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        int qty = Integer.parseInt(jSpinner7.getValue().toString());
        if (qtyisZero(qty) && jCheckBox7.isSelected()) {
            x++;
            if (x == 1) {
                GeniusTech();
            }
            double price = qty * 4000;
            total += price;
            jTextArea1.setText(jTextArea1.getText() + x + ". " + jLabel78.getText() + "\n" + jLabel77.getText() + "                                          " + price + "\n");
        } else {
            jCheckBox7.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        int qty = Integer.parseInt(jSpinner8.getValue().toString());
        if (qtyisZero(qty) && jCheckBox8.isSelected()) {
            x++;
            if (x == 1) {
                GeniusTech();
            }
            double price = qty * 185000;
            total += price;
            jTextArea1.setText(jTextArea1.getText() + x + ". " + jLabel82.getText() + "\n" + jLabel81.getText() + "                      " + price + "\n");
        } else {
            jCheckBox8.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        int qty = Integer.parseInt(jSpinner9.getValue().toString());
        if (qtyisZero(qty) && jCheckBox9.isSelected()) {
            x++;
            if (x == 1) {
                GeniusTech();
            }
            double price = qty * 28000;
            total += price;
            jTextArea1.setText(jTextArea1.getText() + x + ". " + jLabel152.getText() + "\n" + jLabel151.getText() + "                         " + price + "\n");
        } else {
            jCheckBox9.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        int qty = Integer.parseInt(jSpinner10.getValue().toString());
        if (qtyisZero(qty) && jCheckBox10.isSelected()) {
            x++;
            if (x == 1) {
                GeniusTech();
            }
            double price = qty * 22600;
            total += price;
            jTextArea1.setText(jTextArea1.getText() + x + ". " + jLabel149.getText() + "\n" + jLabel148.getText() + "                      " + price + "\n");
        } else {
            jCheckBox10.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        int qty = Integer.parseInt(jSpinner31.getValue().toString());
        if (qtyisZero(qty) && jCheckBox5.isSelected()) {
            x++;
            if (x == 1) {
                GeniusTech();
            }
            double price = qty * 440000;
            total += price;
            jTextArea1.setText(jTextArea1.getText() + x + ". " + jLabel145.getText() + "\n" + jLabel144.getText() + "                           " + price + "\n");
        } else {
            jCheckBox5.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        int qty = Integer.parseInt(jSpinner4.getValue().toString());
        if (qtyisZero(qty) && jCheckBox4.isSelected()) {
            x++;
            if (x == 1) {
                GeniusTech();
            }
            double price = qty * 8000;
            total += price;
            jTextArea1.setText(jTextArea1.getText() + x + ". " + jLabel137.getText() + "\n" + jLabel136.getText() + "                                  " + price + "\n");
        } else {
            jCheckBox4.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        int qty = Integer.parseInt(jSpinner1.getValue().toString());
        if (qtyisZero(qty) && jCheckBox1.isSelected()) {
            x++;
            if (x == 1) {
                GeniusTech();
            }
            double price = qty * 10690;
            total += price;
            jTextArea1.setText(jTextArea1.getText() + x + ". " + jLabel162.getText() + "\n" + jLabel161.getText() + "                              " + price + "\n");
        } else {
            jCheckBox1.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        int qty = Integer.parseInt(jSpinner2.getValue().toString());
        if (qtyisZero(qty) && jCheckBox2.isSelected()) {
            x++;
            if (x == 1) {
                GeniusTech();
            }
            double price = qty * 15240;
            total += price;
            jTextArea1.setText(jTextArea1.getText() + x + ". " + jLabel159.getText() + "\n" + jLabel158.getText() + "                             " + price + "\n");
        } else {
            jCheckBox2.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void TotalbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalbtnActionPerformed
        if (total == 0.0) {
            JOptionPane.showMessageDialog(null, "You haven't selected any item ");
        } else {
            int offer = Integer.parseInt(jSpinner11.getValue().toString());
            double offerprice = (double) offer * total / 100;
            jTextArea1.setText(jTextArea1.getText() + "\n**********************************************\n"
                    + "Offer: \t                          " + offer + "%" + "\n"
                    + "Sub Total(LKR):                           " + total + "\n"
                    + "Total(LKR): \t                          " + (total - offerprice) + "\n\n"
                    + "****************Thank You!******************\n");
            //subtotal and total print in labels
            jLabel96.setText(String.valueOf(total));
            jLabel4.setText(String.valueOf(total - offerprice));
            Totalbtn.setEnabled(false);
        }
    }//GEN-LAST:event_TotalbtnActionPerformed

    private void jCheckBox28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox28ActionPerformed

    private void jCheckBox29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox29ActionPerformed

    private void jCheckBox30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox30ActionPerformed
        int qty = Integer.parseInt(jSpinner32.getValue().toString());
        if (qtyisZero(qty) && jCheckBox30.isSelected()) {
            x++;
            if (x == 1) {
                GeniusTech();
            }
            double price = qty * 22600;
            total += price;
            jTextArea1.setText(jTextArea1.getText() + x + ". " + jLabel149.getText() + "\n" + jLabel148.getText() + "                      " + price + "\n");
        } else {
            jCheckBox30.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox30ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Accessoriesbtn;
    private javax.swing.JLabel Datalbl;
    private javax.swing.JButton Exitbtn;
    private javax.swing.JLabel Laptopbtn;
    private javax.swing.JLabel Phonelbl;
    private javax.swing.JButton Receiptbtn;
    private javax.swing.JButton Resetbtn;
    private javax.swing.JButton SignOutbtn;
    private javax.swing.JLabel Tablesbtn;
    private javax.swing.JLabel Timelbl;
    private javax.swing.JButton Totalbtn;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JCheckBox jCheckBox26;
    private javax.swing.JCheckBox jCheckBox27;
    private javax.swing.JCheckBox jCheckBox28;
    private javax.swing.JCheckBox jCheckBox29;
    private javax.swing.JCheckBox jCheckBox30;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner12;
    private javax.swing.JSpinner jSpinner13;
    private javax.swing.JSpinner jSpinner14;
    private javax.swing.JSpinner jSpinner15;
    private javax.swing.JSpinner jSpinner16;
    private javax.swing.JSpinner jSpinner17;
    private javax.swing.JSpinner jSpinner18;
    private javax.swing.JSpinner jSpinner19;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner20;
    private javax.swing.JSpinner jSpinner21;
    private javax.swing.JSpinner jSpinner22;
    private javax.swing.JSpinner jSpinner23;
    private javax.swing.JSpinner jSpinner24;
    private javax.swing.JSpinner jSpinner25;
    private javax.swing.JSpinner jSpinner26;
    private javax.swing.JSpinner jSpinner27;
    private javax.swing.JSpinner jSpinner28;
    private javax.swing.JSpinner jSpinner29;
    private javax.swing.JSpinner jSpinner30;
    private javax.swing.JSpinner jSpinner31;
    private javax.swing.JSpinner jSpinner32;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
