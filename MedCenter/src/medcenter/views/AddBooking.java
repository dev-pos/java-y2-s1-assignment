/*
 * Copyright (C) 2020 Senal Ransika
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package medcenter.views;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListCellRenderer;
import medcenter.controller.BookingController;
import medcenter.controller.UserController;
import medcenter.models.ComboItem;
import medcenter.models.Doctor;
import medcenter.models.Schedule;

/**
 *
 * @author Senal Ransika
 */
public class AddBooking extends javax.swing.JFrame {

    Schedule selected;
    UserController userController;
    BookingController bookingController;

    /**
     * Creates new form AddBooking
     */
    public AddBooking(Schedule selected) {
        this.userController = new UserController();
        this.bookingController = new BookingController();
        this.selected = selected;
        initComponents();
//        drawDoctorsCombo();
        setDefaultValues();
    }

    private void drawDoctorsCombo() {
        List<Doctor> doctors = this.userController.fetchAllDoctors();
        doctors.forEach((doctor) -> cmdSelectDoctor.addItem(new ComboItem(doctor.getName(), Integer.toString(doctor.getId()))));
    }

    private void setDefaultValues() {
        cmdSelectDoctor.addItem(new ComboItem(this.selected.getDoctor().getName(), Integer.toString(this.selected.getDoctor().getId())));
        txtDateTime.setText(String.format("%s, %s-%s", this.selected.getDay().toString(), this.selected.getFrom().toString(), this.selected.getTo().toString()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cmdSelectDoctor = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtDateTime = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtStudentId = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Booking");
        setResizable(false);

        jLabel2.setText("Doctor:");

        cmdSelectDoctor.setEnabled(false);
        cmdSelectDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSelectDoctorActionPerformed(evt);
            }
        });

        jLabel3.setText("Date and Time: ");

        txtDateTime.setEnabled(false);
        txtDateTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateTimeActionPerformed(evt);
            }
        });

        jLabel4.setText("Student ID: ");

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnAdd.setText("Add Booking");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStudentId, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDateTime, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmdSelectDoctor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdSelectDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnReset))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdSelectDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSelectDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdSelectDoctorActionPerformed

    private void txtDateTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateTimeActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtStudentId.setText("");            // TODO add your handling code here:
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String stdId = txtStudentId.getText();
        if (stdId.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Student ID cannot be empty", "Error!", JOptionPane.ERROR_MESSAGE);
        } else {
            bookingController.addBooking(this.selected.getDoctor().getId(), Integer.parseInt(stdId), this.selected.getId());
            dispose();
        }
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox cmdSelectDoctor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtDateTime;
    private javax.swing.JTextField txtStudentId;
    // End of variables declaration//GEN-END:variables
}
