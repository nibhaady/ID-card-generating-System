package idcardgeneratingsystem;

import java.awt.*;
import javax.swing.*;
import idcardgeneratingsystem.newpackage.isWord;//User Defined Package
public class Home extends javax.swing.JFrame {
public Home() {
initComponents();
}
private void initComponents() {
jPanel1 = new javax.swing.JPanel(); //creates a JPanel
jPanel3 = new javax.swing.JPanel();
jPanel4 = new javax.swing.JPanel();
jLabelNAME = new javax.swing.JLabel(); //creates a Jlabel
txtname = new javax.swing.JTextField(); //creates a textfield
jLabelDOB = new javax.swing.JLabel();
//bdate = new com.toedter.calendar.JDateChooser(); //creates a JDateChooser
jLabelADDRESS = new javax.swing.JLabel();
jScrollPane1 = new javax.swing.JScrollPane(); //creates a scrollpane
txtadress = new javax.swing.JTextArea(); //creates a JtextArea
jLabelDATE = new javax.swing.JLabel();
//idate = new com.toedter.calendar.JDateChooser();
jLabelCOURSE = new javax.swing.JLabel();
cmbcourse = new javax.swing.JComboBox(); //creates a JComboBox
jButton2 = new javax.swing.JButton(); //creates a JButton
jLabelVALIDITY = new javax.swing.JLabel();
jCheckBox1 = new javax.swing.JCheckBox(); //creates a JCheckbox

jCheckBox2 = new javax.swing.JCheckBox();
jCheckBox3 = new javax.swing.JCheckBox();
jCheckBox4 = new javax.swing.JCheckBox();
jToggleButton1 = new javax.swing.JToggleButton(); //creates a JTogglebutton
jLabel11 = new javax.swing.JLabel();
jLabelGENDER = new javax.swing.JLabel();
jRadioButton3 = new javax.swing.JRadioButton(); //creates a JRadiobutton
jRadioButton4 = new javax.swing.JRadioButton();
jLabelBLD_GRP = new javax.swing.JLabel();
jScrollPane3 = new javax.swing.JScrollPane();
jList1 = new javax.swing.JList<>(); //creates a Jlist
jCheckBox5 = new javax.swing.JCheckBox();
jLabelPH_NO = new javax.swing.JLabel();
txtPhone = new javax.swing.JTextField();
panelid = new javax.swing.JPanel();
jPanel6 = new javax.swing.JPanel();
jPanel10 = new javax.swing.JPanel();
jLabel8 = new javax.swing.JLabel();
lblcollge = new javax.swing.JLabel();
lblusn = new javax.swing.JLabel();
jLabel12 = new javax.swing.JLabel();
lbldate = new javax.swing.JLabel();
jLabel14 = new javax.swing.JLabel();
jLabel16 = new javax.swing.JLabel();
jLabel1 = new javax.swing.JLabel();
jLabel2 = new javax.swing.JLabel();
jPanel7 = new javax.swing.JPanel();
jPanel12 = new javax.swing.JPanel();
college_label = new javax.swing.JLabel();
name_label = new javax.swing.JLabel();
dob_label = new javax.swing.JLabel();
address_label = new javax.swing.JLabel();
gender_label = new javax.swing.JLabel();
blood_label = new javax.swing.JLabel();
ph_no_label = new javax.swing.JLabel();
course_label = new javax.swing.JLabel();
valid_label = new javax.swing.JLabel();
lblbname = new javax.swing.JLabel();
lblname = new javax.swing.JLabel();
lblbday = new javax.swing.JLabel();
lbladdress = new javax.swing.JLabel();
lblgender = new javax.swing.JLabel();
lblbldgrp = new javax.swing.JLabel();
lblphone = new javax.swing.JLabel();
lblcourse = new javax.swing.JLabel();
lblyear = new javax.swing.JLabel();
jLabel9 = new javax.swing.JLabel();
setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//Java process gets closed when the JFrame is closed
jPanel1.setLayout(new java.awt.BorderLayout()); //sets a border layout for panel1
jPanel3.setBackground(new java.awt.Color(204, 204, 204));//sets the backgroung colour of panel3

jPanel4.setBackground(new Color(204, 255, 204));//sets the backgroung colour of panel4
jLabelNAME.setFont(new Font("Tw Cen MT Condensed", 1, 14));//sets the text font for the label name
jLabelNAME.setText("NAME:");//sets the Jlabel text
jLabelDOB.setFont(new Font("Tahoma", 1, 12));
jLabelDOB.setText("D.O.B:");
bdate.setDateFormatString("dd-MM-yyyy");
jLabelADDRESS.setFont(new Font("Tahoma", 1, 12));
jLabelADDRESS.setText("ADDRESS:");
txtadress.setColumns(20); //sets the number of columns in the textarea
txtadress.setRows(5); //sets the number of rows in the textarea
jScrollPane1.setViewportView(txtadress); //sets the viewing mode of the textarea
jLabelDATE.setFont(new Font("Tw Cen MT Condensed", 1, 14));
jLabelDATE.setText("ISSUE DATE:");
idate.setDateFormatString("dd-MM-yyyy");//the date is displayed in the format 'dd-mm-yyyy'
jLabelCOURSE.setFont(new Font("Tahoma", 1, 12));
jLabelCOURSE.setText("COURSE:");
//sets the data model the combo box uses to get the items
cmbcourse.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "COURSE", "CS", "ECE", "EEE",
"CIV", "MECH" }));
jButton2.setFont(new Font("Sitka Text", 3, 14));
jButton2.setText("Genarate ID");
jButton2.setEnabled(false);//the JButton2 is initially disabled
////Action listener is added to handle all the action events of JButton2
jButton2.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton2ActionPerformed(evt);
}
});
jLabelVALIDITY.setFont(new Font("Tahoma", 1, 11));
jLabelVALIDITY.setText("VALID UPTO:");
jCheckBox1.setText("2022");
jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jCheckBox1ActionPerformed(evt);
}
});
jCheckBox2.setText("2023");
jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jCheckBox2ActionPerformed(evt);
}
});

jCheckBox3.setText("2024");
jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jCheckBox3ActionPerformed(evt);
}
});
jCheckBox4.setText("2025");
jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jCheckBox4ActionPerformed(evt);
}
});
jToggleButton1.setText("YES");
jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jToggleButton1ActionPerformed(evt);
}
});
jLabel11.setFont(new Font("Tw Cen MT Condensed", 1, 14));
jLabel11.setText("I HAVE VERIFIED ALL THE DETAILS");
jLabelGENDER.setFont(new Font("Tw Cen MT Condensed", 1, 14));
jLabelGENDER.setText("GENDER:");
jRadioButton3.setText("MALE");
jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jRadioButton3ActionPerformed(evt);
}
});
jRadioButton4.setText("FEMALE");
jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jRadioButton4ActionPerformed(evt);
}
});
jLabelBLD_GRP.setFont(new Font("Tw Cen MT Condensed", 1, 14));
jLabelBLD_GRP.setText("BLOOP GROUP:");
//sets the data model the Jlist uses to get items
jList1.setModel(new javax.swing.AbstractListModel<String>() {
String[] strings = { "A+ve", "B+ve", "AB+ve", "A-ve", "B-ve", "AB-ve", "O+ve", "O-ve" };
public int getSize() { return strings.length; }
public String getElementAt(int i) { return strings[i]; }
});
jScrollPane3.setViewportView(jList1);
jCheckBox5.setText("ADD THE BLOOD GROUP");

jLabelPH_NO.setFont(new Font("Tw Cen MT Condensed", 1, 14));
jLabelPH_NO.setText("PH.NO");
javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);//creating a group layout in panel4 to position all the components inside
jPanel4.setLayout(jPanel4Layout);
jPanel4Layout.setHorizontalGroup( //Horizontal group gets created
//parallel and sequential groups are created in the horizontal layout (their allignment is also mentioned i.e;LEADING,TRAILING,BASELINE etc)
jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel4Layout.createSequentialGroup()
.addContainerGap()//gaps are added
.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel4Layout.createSequentialGroup()
.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel4Layout.createSequentialGroup()
.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabelADDRESS)//components jLabelADDRESS and jLabelCOURSE are addedparallely
.addComponent(jLabelCOURSE))
.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel4Layout.createSequentialGroup()
.addGap(19, 19, 19)
//here the size of the combo box,checkbox,toggle button,jLabelPH_NO are fixed to the preferredsize.Their size cant be altered

.addComponent(cmbcourse, javax.swing.GroupLayout.PREFERRED_SIZE, 161,

javax.swing.GroupLayout.PREFERRED_SIZE))

.addGroup(jPanel4Layout.createSequentialGroup()
.addGap(18, 18, 18)
.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101,

javax.swing.GroupLayout.PREFERRED_SIZE))))

.addGroup(jPanel4Layout.createSequentialGroup()
.addComponent(jLabelVALIDITY)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 81,

javax.swing.GroupLayout.PREFERRED_SIZE)

.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 81,

javax.swing.GroupLayout.PREFERRED_SIZE)

.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 81,

javax.swing.GroupLayout.PREFERRED_SIZE)

.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 81,

javax.swing.GroupLayout.PREFERRED_SIZE))

.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116,

javax.swing.GroupLayout.PREFERRED_SIZE)

.addGroup(jPanel4Layout.createSequentialGroup()
.addComponent(jLabelPH_NO, javax.swing.GroupLayout.PREFERRED_SIZE, 144,

javax.swing.GroupLayout.PREFERRED_SIZE)

.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 141,

javax.swing.GroupLayout.PREFERRED_SIZE))

.addGroup(jPanel4Layout.createSequentialGroup()
.addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 203,

javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(38, 38, 38)
.addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63,

javax.swing.GroupLayout.PREFERRED_SIZE)))
.addGap(0, 0, Short.MAX_VALUE))
.addGroup(jPanel4Layout.createSequentialGroup()
.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel4Layout.createSequentialGroup()
.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabelDATE)
.addComponent(jLabelNAME))
.addGap(18, 18, 18)
.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 319,

javax.swing.GroupLayout.PREFERRED_SIZE)

.addComponent(idate, javax.swing.GroupLayout.PREFERRED_SIZE, 127,

javax.swing.GroupLayout.PREFERRED_SIZE)))

.addGroup(jPanel4Layout.createSequentialGroup()
.addComponent(jLabelDOB)
.addGap(39, 39, 39)
.addComponent(bdate, javax.swing.GroupLayout.PREFERRED_SIZE, 127,

javax.swing.GroupLayout.PREFERRED_SIZE))

.addGroup(jPanel4Layout.createSequentialGroup()
.addComponent(jLabelGENDER, javax.swing.GroupLayout.PREFERRED_SIZE, 65,

javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(18, 18, 18)
.addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 93,

javax.swing.GroupLayout.PREFERRED_SIZE)

.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 93,

javax.swing.GroupLayout.PREFERRED_SIZE))

.addGroup(jPanel4Layout.createSequentialGroup()
.addComponent(jLabelBLD_GRP)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 68,

javax.swing.GroupLayout.PREFERRED_SIZE)

.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 195,

javax.swing.GroupLayout.PREFERRED_SIZE)))

.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
);
jPanel4Layout.setVerticalGroup( //vertical group is created
jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel4Layout.createSequentialGroup()
.addContainerGap()
.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabelDATE)
.addComponent(idate, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabelNAME)

.addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addComponent(jLabelDOB)
.addComponent(bdate, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabelADDRESS)
.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55,

javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel4Layout.createSequentialGroup()
.addGap(9, 9, 9)
.addComponent(cmbcourse, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(jLabelCOURSE)))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabelVALIDITY)
.addComponent(jCheckBox1)
.addComponent(jCheckBox2)
.addComponent(jCheckBox3)
.addComponent(jCheckBox4))
.addGap(3, 3, 3)
.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabelGENDER)
.addComponent(jRadioButton3)
.addComponent(jRadioButton4))
.addGap(18, 18, 18)
.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel4Layout.createSequentialGroup()
.addComponent(jLabelBLD_GRP)
.addGap(71, 71, 71)
.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabelPH_NO)
.addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))

.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
.addGap(9, 9, 9)
.addComponent(jCheckBox5))
.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 76,

javax.swing.GroupLayout.PREFERRED_SIZE)))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel11)
.addComponent(jToggleButton1))
.addGap(18, 18, 18)
.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
javax.swing.GroupLayout.PREFERRED_SIZE)

.addGap(26, 26, 26))
);
panelid.setBackground(new Color(153, 255, 153));
jPanel6.setBackground(new Color(102, 102, 102));
jPanel10.setBackground(new Color(255, 255, 255));
//locates the icon on the classpath and gives back the URL and uses it to load the image icon
jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo2.jpeg")));
lblcollge.setFont(new java.awt.Font("Tahoma", 1, 8));
lblcollge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
lblcollge.setText("COLLEGE");
lblusn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
jLabel12.setText("Date");
lbldate.setText("Date Here");
jLabel14.setText("Signature");
jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/SIGN.png")));
jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/PHOTO.png")));
jLabel1.setText("jLabel1");
jLabel2.setText("ID NO:");
javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);//creating a group layout to organize components in jPanel10
jPanel10.setLayout(jPanel10Layout);
jPanel10Layout.setHorizontalGroup(//horizontal group is created
jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel10Layout.createSequentialGroup()
.addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel10Layout.createSequentialGroup()
.addContainerGap()
.addComponent(lblcollge, javax.swing.GroupLayout.DEFAULT_SIZE,

javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
.addGroup(jPanel10Layout.createSequentialGroup()
.addGap(42, 42, 42)
.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42,

javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(18, 18, 18)
.addComponent(lblusn, javax.swing.GroupLayout.PREFERRED_SIZE, 199,

javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(0, 0, Short.MAX_VALUE))
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
.addGap(16, 16, 16)
.addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 85,

javax.swing.GroupLayout.PREFERRED_SIZE)

.addComponent(lbldate, javax.swing.GroupLayout.PREFERRED_SIZE, 85,

javax.swing.GroupLayout.PREFERRED_SIZE))

.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,

javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

.addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING,
javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING,
javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))

.addGap(17, 17, 17)))
.addContainerGap())
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
.addContainerGap(125, Short.MAX_VALUE)
.addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
.addComponent(jLabel8)
.addGap(136, 136, 136))
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105,

javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(109, 109, 109))))
);
jPanel10Layout.setVerticalGroup(//vertical group is created
jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel10Layout.createSequentialGroup()
.addContainerGap()
.addComponent(lblcollge, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(3, 3, 3)
.addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48,
javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(lblusn)
.addComponent(jLabel2))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118,
javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(22, 22, 22)
.addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
.addComponent(lbldate)
.addComponent(jLabel16))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel12)
.addComponent(jLabel14))
.addContainerGap(62, Short.MAX_VALUE))
);
javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
jPanel6.setLayout(jPanel6Layout);
jPanel6Layout.setHorizontalGroup(
jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel6Layout.createSequentialGroup()

.addContainerGap()
.addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addContainerGap())
);
jPanel6Layout.setVerticalGroup(
jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
.addContainerGap()
.addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addContainerGap())
);
jPanel7.setBackground(new Color(102, 102, 102));
jPanel12.setBackground(new Color(204, 255, 255));
college_label.setText("College");
name_label.setText("Name");
dob_label.setText("D.O.B");
address_label.setText("Address");
gender_label.setText("gender");
blood_label.setFont(new java.awt.Font("Tahoma", 0, 10));
blood_label.setText("Blood grp");
ph_no_label.setFont(new java.awt.Font("Tahoma", 0, 10));
ph_no_label.setText("PH.NO:");
course_label.setText("Course");
valid_label.setText("VALID TILL:");
lbladdress.setFont(new java.awt.Font("Tahoma", 0, 8));
javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);//group layout to organizecomponents in Jpanel12
jPanel12.setLayout(jPanel12Layout);
jPanel12Layout.setHorizontalGroup(
jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel12Layout.createSequentialGroup()
.addContainerGap()
.addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel12Layout.createSequentialGroup()
.addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(address_label)
.addComponent(dob_label)
.addComponent(name_label)
.addComponent(college_label)

.addComponent(gender_label, javax.swing.GroupLayout.PREFERRED_SIZE, 50,

javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(31, 31, 31)
.addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(lblbday, javax.swing.GroupLayout.DEFAULT_SIZE,

javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

.addComponent(lbladdress, javax.swing.GroupLayout.DEFAULT_SIZE,

javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addGroup(jPanel12Layout.createSequentialGroup()
.addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel12Layout.createSequentialGroup()
.addGap(29, 29, 29)
.addComponent(lblgender, javax.swing.GroupLayout.PREFERRED_SIZE, 44,

javax.swing.GroupLayout.PREFERRED_SIZE))

.addComponent(lblbname, javax.swing.GroupLayout.PREFERRED_SIZE, 189,

javax.swing.GroupLayout.PREFERRED_SIZE)

.addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 144,

javax.swing.GroupLayout.PREFERRED_SIZE)

.addComponent(lblphone, javax.swing.GroupLayout.PREFERRED_SIZE, 148,

javax.swing.GroupLayout.PREFERRED_SIZE)

.addComponent(lblbldgrp, javax.swing.GroupLayout.PREFERRED_SIZE, 108,

javax.swing.GroupLayout.PREFERRED_SIZE))

.addGap(0, 40, Short.MAX_VALUE))))
.addGroup(jPanel12Layout.createSequentialGroup()
.addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(course_label)
.addComponent(blood_label, javax.swing.GroupLayout.PREFERRED_SIZE, 50,

javax.swing.GroupLayout.PREFERRED_SIZE)

.addComponent(ph_no_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40,

javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(valid_label))
.addGap(21, 21, 21)
.addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel12Layout.createSequentialGroup()
.addComponent(lblyear, javax.swing.GroupLayout.PREFERRED_SIZE, 40,

javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(0, 0, Short.MAX_VALUE))
.addComponent(lblcourse, javax.swing.GroupLayout.DEFAULT_SIZE,

javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
.addContainerGap())
);
jPanel12Layout.setVerticalGroup(
jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel12Layout.createSequentialGroup()
.addContainerGap()
.addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(college_label)
.addComponent(lblbname))
.addGap(25, 25, 25)
.addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(name_label)
.addComponent(lblname))
.addGap(18, 18, 18)
.addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

.addComponent(dob_label)
.addComponent(lblbday))
.addGap(18, 18, 18)
.addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(address_label)
.addComponent(lbladdress, javax.swing.GroupLayout.PREFERRED_SIZE, 23,

javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(18, 18, 18)
.addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(gender_label)
.addComponent(lblgender, javax.swing.GroupLayout.PREFERRED_SIZE, 0,

javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(18, 18, 18)
.addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(blood_label)
.addComponent(lblbldgrp))
.addGap(26, 26, 26)
.addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(ph_no_label)
.addComponent(lblphone))
.addGap(29, 29, 29)
.addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(course_label)
.addComponent(lblcourse))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
.addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(valid_label, javax.swing.GroupLayout.PREFERRED_SIZE, 23,

javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(lblyear))
.addGap(36, 36, 36))
);
javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);//group layout in jpanel7
jPanel7.setLayout(jPanel7Layout);
jPanel7Layout.setHorizontalGroup(
jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel7Layout.createSequentialGroup()
.addContainerGap()
.addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addContainerGap())
);
jPanel7Layout.setVerticalGroup(
jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel7Layout.createSequentialGroup()
.addContainerGap()
.addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addContainerGap())
);
javax.swing.GroupLayout panelidLayout = new javax.swing.GroupLayout(panelid);
panelid.setLayout(panelidLayout);
panelidLayout.setHorizontalGroup(

panelidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(panelidLayout.createSequentialGroup()
.addGap(6, 6, 6)
.addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addContainerGap())
);
panelidLayout.setVerticalGroup(
panelidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelidLayout.createSequentialGroup()
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addGroup(panelidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE,

javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

.addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE,

javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
.addContainerGap())
);
jLabel9.setFont(new Font("Sitka Heading", 3, 48));
jLabel9.setForeground(new Color(255, 255, 255));
jLabel9.setText("ID CARD GENERATOR");
javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);//group layout in jpanel3
jPanel3.setLayout(jPanel3Layout);
jPanel3Layout.setHorizontalGroup(
jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel3Layout.createSequentialGroup()
.addContainerGap()
.addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel3Layout.createSequentialGroup()
.addGap(67, 67, 67)
.addComponent(jLabel9)
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
.addGroup(jPanel3Layout.createSequentialGroup()
.addComponent(panelid, javax.swing.GroupLayout.DEFAULT_SIZE,

javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

.addContainerGap())))
);
jPanel3Layout.setVerticalGroup(
jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
.addGap(20, 20, 20)
.addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(panelid, javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

.addGap(132, 132, 132))
.addGroup(jPanel3Layout.createSequentialGroup()
.addContainerGap()
.addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
);
jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);
javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
Short.MAX_VALUE)
);
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(layout.createSequentialGroup()
.addContainerGap()
.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
);
pack();//pack method packs all the components within the window based on the component sizes
}
private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
if (jRadioButton4.isSelected()) {
jRadioButton3.setEnabled(false);//if 'Female'button is selected then 'Male'button is disabled
} else {
jRadioButton3.setEnabled(true);//else 'Male'button is enabled
}
}
private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
if (jRadioButton3.isSelected()) {
jRadioButton4.setEnabled(false);//if 'Male'button is selected then 'Female'button is disabled
} else {
jRadioButton4.setEnabled(true);//else 'Female'button is enabled
}
}
private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
if (jToggleButton1.isSelected()) {
jButton2.setEnabled(true);//if 'YES'button is clicked 'Generate Id'button is enabled

} else {
jButton2.setEnabled(false);//if 'YES'button is not clicked 'Generate Id'button is disabled
}
}
private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
if (jCheckBox4.isSelected()) { //if jCheckBox4 is checked then
jCheckBox2.setEnabled(false);//jCheckBox2 is disabled
jCheckBox3.setEnabled(false);//jCheckBox3 is disabled
jCheckBox1.setEnabled(false);//jCheckBox1 is disabled
} else { //else
jCheckBox2.setEnabled(true);//jCheckBox2 is enabled
jCheckBox3.setEnabled(true);//jCheckBox3 is enabled
jCheckBox1.setEnabled(true);//jCheckBox1 is enabled
}
}
private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
if (jCheckBox3.isSelected()) { //ifjCheckBox3 is checked then
jCheckBox2.setEnabled(false);//jCheckBox2 is disabled
jCheckBox1.setEnabled(false);//jCheckBox1 is disabled
jCheckBox4.setEnabled(false);//jCheckBox4 is disabled
} else { //else
jCheckBox2.setEnabled(true);//jCheckBox2 is enabled
jCheckBox1.setEnabled(true);//jCheckBox1 is enabled
jCheckBox4.setEnabled(true);//jCheckBox4 is enabled
}
}
private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
if (jCheckBox2.isSelected()) { //if jCheckBox2 is checked then
jCheckBox3.setEnabled(false);//jCheckBox3 is disabled
jCheckBox4.setEnabled(false);//jCheckBox4 is disabled
jCheckBox1.setEnabled(false);//jCheckBox1 is disabled
} else { //else
jCheckBox3.setEnabled(true);//jCheckBox3 is enabled
jCheckBox4.setEnabled(true);//jCheckBox4 is enabled
jCheckBox1.setEnabled(true);//jCheckBox1 is enabled
}
}
private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
if (jCheckBox1.isSelected()) { //if jCheckBox1 is checked then
jCheckBox2.setEnabled(false);//jCheckBox2 is disabled
jCheckBox3.setEnabled(false);//jCheckBox3 is disabled
jCheckBox4.setEnabled(false);//jCheckBox4 is disabled
} else { //else

jCheckBox2.setEnabled(true);//jCheckBox2 is enabled
jCheckBox3.setEnabled(true);//jCheckBox3 is enabled
jCheckBox4.setEnabled(true);//jCheckBox4 is enabled
}
}
private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
try {
String date = ((JTextField) idate.getDateEditor()).getText();//string in the date editor is stored in Stringdate
String birthday = ((JTextField) bdate.getDateEditor()).getText();//string in the date editor is stored inString birthday
String name = txtname.getText();// text entered in label txtname is stored in String name
String address = txtadress.getText();//text entered in label txtadress is stored in String name
String PHNO = txtPhone.getText();//number entered in label txtPHNE is stored in String name
lblcollge.setText("St.Joseph Engineering College");//updates the text on the label lblcollge
lblbname.setText("St.Joseph Engineering College");//updates the text on the label lblbname
if (date.isEmpty())//checks if the issue date is entered
{
JOptionPane.showMessageDialog(this, "ISSUE DATE FEILD MISSING!");//creates a message dialog box ifthe issue date field is empty
}
lbldate.setText(date);//updates the text on the label lbldate
if (birthday.isEmpty())//checks if d.o.b is entered
{
JOptionPane.showMessageDialog(this, "D.O.B FEILD MISSING!");//creates a message dialog box if theD.O.B field is empty
}
lblbday.setText(birthday);//updates the text on the label lblbday
if (isWord.Word(name)) //checks if the name entered fulfills all the conditions//this function is importedfrom idcardgeneratingsystem.newpackage
{
lblname.setText(name);//updates the text on the label lblname
} else {
JOptionPane.showMessageDialog(this, "INVALID NAME");//creates a message dialog box if an invalidname is entered
}
if (address.isEmpty())//checks if address is entered
{
JOptionPane.showMessageDialog(this, "ADRESS FEILD MISSING!");//creates a message dialog box if theaddress field is missing
}
lbladdress.setText(address);//updates the text on the label lbladdress
//check if the phone no entered starts with '6','7','8'or'9' and if the phone number has 10 digits
try {
if (PHNO.charAt(0) == '6' || PHNO.charAt(0) == '7' || PHNO.charAt(0) == '8' || PHNO.charAt(0) == '9'
&& PHNO.length() == 10) {

lblphone.setText(PHNO);//updates the text on the label lphone
} else {
JOptionPane.showMessageDialog(this, "INVALID PHONE NUMBER!");//creates a message dialog box ifthe phone number entered is invalid
}
} catch (Exception e) {
JOptionPane.showMessageDialog(this, "PHONE NUMBER MISSING!");
}
if (jRadioButton3.isSelected()) //checks if male is selected
{
lblgender.setText(jRadioButton3.getText());//updates 'male' on the label lblgender
} else if (jRadioButton4.isSelected())//checks if female is selected
{
lblgender.setText(jRadioButton4.getText());//updates 'female' on the label lblgender
} else if (jRadioButton3.isSelected() == false && jRadioButton4.isSelected() == false)//checks if both radiobuttons are not selected
{
JOptionPane.showMessageDialog(this, "GENDER FEILD MISSING!");//creates a message dialog box ifgender feild is missing
}
if (jCheckBox1.isSelected()) //check if '2022'is selected
{
lblyear.setText("2022");//updates '2022' on label lblyear
} else if (jCheckBox2.isSelected())//check if '2023'is selected
{
lblyear.setText("2023");//updates '2023' on label lblyear
} else if (jCheckBox3.isSelected())//check if '2024'is selected
{
lblyear.setText("2024");//updates '2024' on label lblyear
} else if (jCheckBox4.isSelected()) //check if '2025'is selected
{
lblyear.setText("2025");//updates '2025' on label lblyear
} else {
JOptionPane.showMessageDialog(this, "PLEASE SELECT THE VALID YEAR");//if none of the boxes arechecked return a dialog box
}
boolean res = !jList1.isSelectionEmpty();//jList1.isSelectionEmpty() returns true if none of the items in thelist is selected
//res is updated as negation of the value returned by jList1.isSelectionEmpty()
if (jCheckBox5.isSelected() && res) //checks if jCheckBox5 is checked and if an item in the list is selected
{
lblbldgrp.setText(jList1.getSelectedValue());//updates selected item on the label lblbldgrp
} else {
JOptionPane.showMessageDialog(this, "PLEASE SELECT YOUR BLOOD GROUP");//if none of the items isselected return a dialog box
}
String course = cmbcourse.getSelectedItem().toString();//course selected is stored in String course
if (course.equals("COURSE")) //checks if a course is not selected

{
JOptionPane.showMessageDialog(this, "COURSE FIELD NOT SELECTED");//if none of the courses isselected return a dialog box
} else {
lblcourse.setText(course);//update the course selected on the label lblcourse
}
//generating an id number
String day = birthday.substring(0, 2);
String month = birthday.substring(3, 5);
int start;
switch (course) {
case "CS":
start = 100;
break;
case "EC":
start = 101;
break;
case "EEE":
start = 102;
break;
case "CIV":
start = 103;
break;
default:
start = 104;
break;
}
String gen = String.valueOf(start);
String nic = gen + day + month;
lblusn.setText(nic);
} catch (Exception e) {
}//exceptions are handeled using try-catch blocks
}

public static void main(String args[]) {
/* Create and display the form */
java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new Home().setVisible(true);
}
});
}

// Variables declaration
private javax.swing.JLabel address_label;
private com.toedter.calendar.JDateChooser bdate;
private javax.swing.JLabel blood_label;
private javax.swing.JComboBox cmbcourse;
private javax.swing.JLabel college_label;
private javax.swing.JLabel course_label;
private javax.swing.JLabel dob_label;
private javax.swing.JLabel gender_label;
private com.toedter.calendar.JDateChooser idate;
private javax.swing.JButton jButton2;
private javax.swing.JCheckBox jCheckBox1;
private javax.swing.JCheckBox jCheckBox2;
private javax.swing.JCheckBox jCheckBox3;
private javax.swing.JCheckBox jCheckBox4;
private javax.swing.JCheckBox jCheckBox5;
private javax.swing.JLabel jLabel1;
private javax.swing.JLabel jLabel11;
private javax.swing.JLabel jLabel12;
private javax.swing.JLabel jLabel14;
private javax.swing.JLabel jLabel16;
private javax.swing.JLabel jLabel2;
private javax.swing.JLabel jLabel8;
private javax.swing.JLabel jLabel9;
private javax.swing.JLabel jLabelADDRESS;
private javax.swing.JLabel jLabelBLD_GRP;
private javax.swing.JLabel jLabelCOURSE;
private javax.swing.JLabel jLabelDATE;
private javax.swing.JLabel jLabelDOB;
private javax.swing.JLabel jLabelGENDER;
private javax.swing.JLabel jLabelNAME;
private javax.swing.JLabel jLabelPH_NO;
private javax.swing.JLabel jLabelVALIDITY;
private javax.swing.JList<String> jList1;
private javax.swing.JPanel jPanel1;
private javax.swing.JPanel jPanel10;
private javax.swing.JPanel jPanel12;
private javax.swing.JPanel jPanel3;
private javax.swing.JPanel jPanel4;
private javax.swing.JPanel jPanel6;
private javax.swing.JPanel jPanel7;
private javax.swing.JRadioButton jRadioButton3;
private javax.swing.JRadioButton jRadioButton4;
private javax.swing.JScrollPane jScrollPane1;
private javax.swing.JScrollPane jScrollPane3;
private javax.swing.JToggleButton jToggleButton1;
private javax.swing.JLabel lbladdress;
private javax.swing.JLabel lblbday;
private javax.swing.JLabel lblbldgrp;
private javax.swing.JLabel lblbname;
private javax.swing.JLabel lblcollge;
private javax.swing.JLabel lblcourse;
private javax.swing.JLabel lbldate;
private javax.swing.JLabel lblgender;

private javax.swing.JLabel lblname;
private javax.swing.JLabel lblphone;
private javax.swing.JLabel lblusn;
private javax.swing.JLabel lblyear;
private javax.swing.JLabel name_label;
private javax.swing.JPanel panelid;
private javax.swing.JLabel ph_no_label;
private javax.swing.JTextField txtPhone;
private javax.swing.JTextArea txtadress;
private javax.swing.JTextField txtname;
private javax.swing.JLabel valid_label;
// End of variables declaration
}