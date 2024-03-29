/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Doctor;
import Controller.DoctorModel;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.function.Predicate;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author hoang
 */
public class DoctorView extends javax.swing.JFrame {

    String code, name, spec;
    int avai;
    private String newName;
    private String newSpec;
    private int newAvai;
//    private JTable jTable_Doctor = new JTable();

    DefaultTableModel defaultTableModel;

    /**
     * Creates new form DoctorView
     */
    public DoctorView() {
        initComponents();
        this.setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        showDoctor();
        countDoctor();
        setIconApp();
    }

    public DoctorModel model = new DoctorModel();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Header = new javax.swing.JPanel();
        jLabel_title = new javax.swing.JLabel();
        lb_StringSearch = new javax.swing.JLabel();
        textf_CodeSearch = new javax.swing.JTextField();
        jSeparator_HeadBody = new javax.swing.JSeparator();
        jButton_StringSearch = new javax.swing.JButton();
        jPanel_Body = new javax.swing.JPanel();
        jLabel_countDoctorValue = new javax.swing.JLabel();
        jLabel_countDoctor = new javax.swing.JLabel();
        jPanel_Fotter = new javax.swing.JPanel();
        jButton_SaveDoctor = new javax.swing.JButton();
        jButton_addDoctor1 = new javax.swing.JButton();
        jButton_updateDoctor1 = new javax.swing.JButton();
        jButton_reset = new javax.swing.JButton();
        lb_avai = new javax.swing.JLabel();
        lb_name = new javax.swing.JLabel();
        lb_code = new javax.swing.JLabel();
        lb_spec = new javax.swing.JLabel();
        textf_name = new javax.swing.JTextField();
        textf_spec = new javax.swing.JTextField();
        textf_avai = new javax.swing.JTextField();
        textf_code = new javax.swing.JTextField();
        jButton_deleteDoctor2 = new javax.swing.JButton();
        jSeparator_BodyFoot = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Doctor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator_HeadBody1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Doctor Management");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_Header.setBackground(new java.awt.Color(51, 51, 51));
        jPanel_Header.setForeground(new java.awt.Color(255, 255, 255));
        jPanel_Header.setName("jPanel_head"); // NOI18N
        jPanel_Header.setOpaque(false);
        jPanel_Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_title.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel_title.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_title.setText("DOCTOR MANAGEMENT");
        jPanel_Header.add(jLabel_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 14, 426, 56));

        lb_StringSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_StringSearch.setForeground(new java.awt.Color(255, 0, 51));
        lb_StringSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_StringSearch.setText("String to search");
        jPanel_Header.add(lb_StringSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 89, 121, 33));

        textf_CodeSearch.setText(" ");
        textf_CodeSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textf_CodeSearchActionPerformed(evt);
            }
        });
        jPanel_Header.add(textf_CodeSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 87, 587, 38));
        jPanel_Header.add(jSeparator_HeadBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 140, 860, 10));

        jButton_StringSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_StringSearch.setForeground(new java.awt.Color(0, 0, 0));
        jButton_StringSearch.setText("Search");
        jButton_StringSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_StringSearchActionPerformed(evt);
            }
        });
        jPanel_Header.add(jButton_StringSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(739, 86, -1, 40));

        getContentPane().add(jPanel_Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 860, -1));

        jPanel_Body.setName("jPanel_body"); // NOI18N
        jPanel_Body.setOpaque(false);
        jPanel_Body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_countDoctorValue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_countDoctorValue.setForeground(new java.awt.Color(255, 0, 51));
        jLabel_countDoctorValue.setText("Doctor");
        jPanel_Body.add(jLabel_countDoctorValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 432, -1, -1));

        jLabel_countDoctor.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel_countDoctor.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_countDoctor.setText("List have :");
        jPanel_Body.add(jLabel_countDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 432, 64, -1));

        jPanel_Fotter.setName("jPanel_Fotter"); // NOI18N
        jPanel_Fotter.setOpaque(false);

        jButton_SaveDoctor.setText("Save");
        jButton_SaveDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SaveDoctorActionPerformed(evt);
            }
        });

        jButton_addDoctor1.setText("Add Doctor");
        jButton_addDoctor1.setMaximumSize(new java.awt.Dimension(107, 23));
        jButton_addDoctor1.setMinimumSize(new java.awt.Dimension(107, 23));
        jButton_addDoctor1.setPreferredSize(new java.awt.Dimension(107, 23));
        jButton_addDoctor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addDoctor1ActionPerformed(evt);
            }
        });

        jButton_updateDoctor1.setText("Update Doctor");
        jButton_updateDoctor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_updateDoctor1ActionPerformed(evt);
            }
        });

        jButton_reset.setText("Reset");
        jButton_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_resetActionPerformed(evt);
            }
        });

        lb_avai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_avai.setForeground(new java.awt.Color(0, 0, 0));
        lb_avai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_avai.setText("Availability");

        lb_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_name.setForeground(new java.awt.Color(0, 0, 0));
        lb_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_name.setText("Name");

        lb_code.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_code.setForeground(new java.awt.Color(0, 0, 0));
        lb_code.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_code.setText("Code");

        lb_spec.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_spec.setForeground(new java.awt.Color(0, 0, 0));
        lb_spec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_spec.setText("Specialization");

        textf_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textf_nameActionPerformed(evt);
            }
        });

        textf_spec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textf_specActionPerformed(evt);
            }
        });

        textf_avai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textf_avaiActionPerformed(evt);
            }
        });

        textf_code.setToolTipText("");
        textf_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textf_codeActionPerformed(evt);
            }
        });

        jButton_deleteDoctor2.setText("Delete Doctor");
        jButton_deleteDoctor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deleteDoctor2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_FotterLayout = new javax.swing.GroupLayout(jPanel_Fotter);
        jPanel_Fotter.setLayout(jPanel_FotterLayout);
        jPanel_FotterLayout.setHorizontalGroup(
            jPanel_FotterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_FotterLayout.createSequentialGroup()
                .addGroup(jPanel_FotterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_FotterLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel_FotterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_code, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel_FotterLayout.createSequentialGroup()
                                .addComponent(lb_spec, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_FotterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textf_spec, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(textf_code))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel_FotterLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jButton_addDoctor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(jButton_updateDoctor1)
                        .addGap(38, 38, 38)))
                .addGroup(jPanel_FotterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_name, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_avai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_FotterLayout.createSequentialGroup()
                        .addComponent(jButton_deleteDoctor2)
                        .addGap(12, 12, 12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_FotterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_FotterLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton_reset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(jButton_SaveDoctor))
                    .addComponent(textf_name)
                    .addComponent(textf_avai))
                .addGap(51, 51, 51))
            .addGroup(jPanel_FotterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_FotterLayout.createSequentialGroup()
                    .addGap(0, 392, Short.MAX_VALUE)
                    .addComponent(jSeparator_BodyFoot, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 393, Short.MAX_VALUE)))
        );
        jPanel_FotterLayout.setVerticalGroup(
            jPanel_FotterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_FotterLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel_FotterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_code, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textf_name, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(textf_code, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel_FotterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_avai, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_spec, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textf_avai, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textf_spec, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel_FotterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_updateDoctor1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_addDoctor1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_SaveDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_deleteDoctor2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel_FotterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_FotterLayout.createSequentialGroup()
                    .addGap(0, 87, Short.MAX_VALUE)
                    .addComponent(jSeparator_BodyFoot, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 88, Short.MAX_VALUE)))
        );

        jPanel_Body.add(jPanel_Fotter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 458, -1, -1));
        jPanel_Fotter.getAccessibleContext().setAccessibleName("");
        jPanel_Fotter.getAccessibleContext().setAccessibleDescription("");

        jTable_Doctor.setAutoCreateRowSorter(true);
        jTable_Doctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Code", "Name", "Specialization", "Availability"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Doctor.setShowGrid(true);
        jTable_Doctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_DoctorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Doctor);

        jScrollPane2.setViewportView(jScrollPane1);

        jPanel_Body.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 17, 780, 411));

        getContentPane().add(jPanel_Body, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 164, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/anhnen.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 810));
        getContentPane().add(jSeparator_HeadBody1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 787, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_resetActionPerformed
        countDoctor();
        reset();
    }//GEN-LAST:event_jButton_resetActionPerformed

    private void jButton_updateDoctor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_updateDoctor1ActionPerformed
        updateDoctor();
        showDoctor();
        countDoctor();
    }//GEN-LAST:event_jButton_updateDoctor1ActionPerformed

    private void jButton_addDoctor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addDoctor1ActionPerformed
        addDoctor();
        showDoctor();
        countDoctor();
    }//GEN-LAST:event_jButton_addDoctor1ActionPerformed

    private void jButton_SaveDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SaveDoctorActionPerformed
        model.saveToFile();
        countDoctor();
    }//GEN-LAST:event_jButton_SaveDoctorActionPerformed

    private void textf_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textf_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textf_nameActionPerformed

    private void textf_specActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textf_specActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textf_specActionPerformed

    private void textf_avaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textf_avaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textf_avaiActionPerformed

    private void textf_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textf_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textf_codeActionPerformed

    private void jButton_deleteDoctor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deleteDoctor2ActionPerformed
        // TODO add your handling code here:
        deleteDoctor();
        showDoctor();
        model.deleteDoctorModel();
        countDoctor();
    }//GEN-LAST:event_jButton_deleteDoctor2ActionPerformed

    private void jTable_DoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_DoctorMouseClicked
        showDetailDoctor();
    }//GEN-LAST:event_jTable_DoctorMouseClicked

    private void jButton_StringSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_StringSearchActionPerformed
        // TODO add your handling code here:
        searchDoctor();
        countDoctor();;
    }//GEN-LAST:event_jButton_StringSearchActionPerformed

    private void textf_CodeSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textf_CodeSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textf_CodeSearchActionPerformed

//    Methods Button
    public void addDoctor() {
        this.code = validationCode();
        if (codeExistsPredicate(code) || code == null) {
            JOptionPane.showMessageDialog(null, "Code is existed or invalid format DOCxxxxxx!");
        } else {
            this.name = String.valueOf(textf_name.getText());
            this.spec = String.valueOf(textf_spec.getText());
            try {
                this.avai = Integer.parseInt(textf_avai.getText());
                Doctor doctor = new Doctor(code, name, spec, avai);
                if (doctor == null) {
                    throw new NumberFormatException("Number format");
                }
                model.addDoctoModel(doctor);
                setNull();
//                showDoctor();
                DefaultTableModel tablemode = (DefaultTableModel) jTable_Doctor.getModel();
                tablemode.addRow(new Object[]{doctor.getCode(), doctor.getName(), doctor.getSpecialization(), doctor.getAvailability() + ""});
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid Availability format!");
            }
        }
    }

    public String validationCode() {
        String code = String.valueOf(textf_code.getText().toUpperCase());
        String pattern = "^DOC\\d{6}$";
        if (!code.matches(pattern)) {
            return null;
        }
        return code;
    }

    public void updateDoctor() {
        this.code = String.valueOf(textf_code.getText());
        Doctor doctorToUpdate = getDoctorByCode(code);
        if (!codeExistsPredicate(code)) {
            JOptionPane.showMessageDialog(null, "Code is not existed !");
        } else {
            Doctor updatedDoctor = new Doctor(doctorToUpdate.getCode(),
                    doctorToUpdate.getName(),
                    doctorToUpdate.getSpecialization(),
                    doctorToUpdate.getAvailability());
            this.newName = String.valueOf(textf_name.getText());
            if (!newName.isEmpty()) {
                updatedDoctor.setName(newName);
            }
            this.newSpec = String.valueOf(textf_spec.getText());
            if (!newSpec.isEmpty()) {
                updatedDoctor.setSpecialization(newSpec);
            }
            String newAvaiStr = textf_avai.getText();
            if (!newAvaiStr.isEmpty()) {
                try {
                    int newAvailability = Integer.parseInt(newAvaiStr);
                    updatedDoctor.setAvailability(newAvailability);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Invalid availability input. Doctor availability was not updated.");
                }
            }
            DoctorModel.listDoctor.remove(doctorToUpdate);
            model.updateDoctorModel(updatedDoctor);
        }
    }

    public void deleteDoctor() {
        try {
            int i = jTable_Doctor.getSelectedRow();
            DoctorModel.getListDoctor().remove(i);
        } catch (IndexOutOfBoundsException e) {
        }

    }

    //Check code is exist with predicate
    public boolean codeExistsPredicate(String code) {
        Predicate<Doctor> checkCode = d -> d.getCode().equalsIgnoreCase(code);
        for (Doctor d : DoctorModel.getListDoctor()) {
            if (checkCode.test(d)) {
                return true;
            }
        }
        return false;
    }

    public Doctor getDoctorByCode(String code) {
        for (Doctor d : DoctorModel.getListDoctor()) {
            if (d.getCode().equals(code)) {
                return d;
            }
        }
        return null;
    }

    public void setNull() {
        this.textf_code.setText("");
        this.textf_name.setText("");
        this.textf_spec.setText("");
        this.textf_avai.setText("");
    }

    public void showDoctor() {
        ArrayList<Doctor> doc = DoctorModel.getListDoctor();
        defaultTableModel = (DefaultTableModel) jTable_Doctor.getModel();
        defaultTableModel.setRowCount(0);
        doc.forEach((doctor) -> {
            defaultTableModel.addRow(new Object[]{doctor.getCode(), doctor.getName(), doctor.getSpecialization(), doctor.getAvailability() + ""});
        });
    }

    public void searchDoctor() {
        String stringSearch = textf_CodeSearch.getText().trim();
        ArrayList<Doctor> listSearch = new ArrayList();
        for (Doctor d : DoctorModel.getListDoctor()) {
            if (d.getCode().equalsIgnoreCase(stringSearch)
                    || d.getName().equalsIgnoreCase(stringSearch)
                    || d.getSpecialization().equalsIgnoreCase(stringSearch)
                    || (d.getAvailability() + "").equalsIgnoreCase(stringSearch)) {
                listSearch.add(d);
            }
        }
        if (listSearch.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No data found ! ");
        } else {
            defaultTableModel = (DefaultTableModel) jTable_Doctor.getModel();
            defaultTableModel.setRowCount(0);
            listSearch.forEach((doctor) -> {
                defaultTableModel.addRow(new Object[]{doctor.getCode(), doctor.getName(), doctor.getSpecialization(), doctor.getAvailability() + ""});
            });
        }
    }

    public void reset() {
        setNull();
        showDoctor();
        this.jLabel_countDoctorValue.setText(jTable_Doctor.getRowCount() + "");
    }

    public void showDetailDoctor() {
        int i = jTable_Doctor.getSelectedRow();
        Doctor doctor = DoctorModel.getListDoctor().get(i);
        textf_code.setText(doctor.getCode());
        textf_name.setText(doctor.getName());
        textf_spec.setText(doctor.getSpecialization());
        textf_avai.setText(doctor.getAvailability() + "");
    }

    public void countDoctor() {
        int count = jTable_Doctor.getRowCount();
        jLabel_countDoctorValue.setText(count + "");
    }

    /**
     * @param args the command line arguments
     */
    public JTextField getTextf_CodeSearch() {
        return textf_CodeSearch;
    }

    public void setTextf_CodeSearch(JTextField textf_CodeSearch) {
        this.textf_CodeSearch = textf_CodeSearch;
    }

    public JTextField getTextf_avai() {
        return textf_avai;
    }

    public void setTextf_avai(JTextField textf_avai) {
        this.textf_avai = textf_avai;
    }

    public JTextField getTextf_code() {
        return textf_code;
    }

    public void setTextf_code(JTextField textf_code) {
        this.textf_code = textf_code;
    }

    public JTextField getTextf_name() {
        return textf_name;
    }

    public void setTextf_name(JTextField textf_name) {
        this.textf_name = textf_name;
    }

    public JTextField getTextf_spec() {
        return textf_spec;
    }

    public void setTextf_spec(JTextField textf_spec) {
        this.textf_spec = textf_spec;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_SaveDoctor;
    private javax.swing.JButton jButton_StringSearch;
    private javax.swing.JButton jButton_addDoctor1;
    private javax.swing.JButton jButton_deleteDoctor2;
    private javax.swing.JButton jButton_reset;
    private javax.swing.JButton jButton_updateDoctor1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_countDoctor;
    private javax.swing.JLabel jLabel_countDoctorValue;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JPanel jPanel_Body;
    private javax.swing.JPanel jPanel_Fotter;
    private javax.swing.JPanel jPanel_Header;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator_BodyFoot;
    private javax.swing.JSeparator jSeparator_HeadBody;
    private javax.swing.JSeparator jSeparator_HeadBody1;
    private javax.swing.JTable jTable_Doctor;
    private javax.swing.JLabel lb_StringSearch;
    private javax.swing.JLabel lb_avai;
    private javax.swing.JLabel lb_code;
    private javax.swing.JLabel lb_name;
    private javax.swing.JLabel lb_spec;
    private javax.swing.JTextField textf_CodeSearch;
    private javax.swing.JTextField textf_avai;
    private javax.swing.JTextField textf_code;
    private javax.swing.JTextField textf_name;
    private javax.swing.JTextField textf_spec;
    // End of variables declaration//GEN-END:variables

    private void setIconApp() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\Code\\NetBeans\\DoctorGUI\\src\\Res\\health.png"));
    }

}

