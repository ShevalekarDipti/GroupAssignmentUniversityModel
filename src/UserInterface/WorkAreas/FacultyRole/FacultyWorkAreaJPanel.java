/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.FacultyRole;

import Business.CourseCatalog;
import Business.Profiles.professorDirectory;
import Business.Profiles.studentDirectory;
import Business.course;
import Business.signUpJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author dshev
 */
public class FacultyWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FacultyWorkAreaJPanel
     */
    private studentDirectory studentDirectory;
    private professorDirectory professorDirectory;
    private JPanel UserProcessContainer;
    private course course;
    private CourseCatalog CourseCatalog;

    public FacultyWorkAreaJPanel(JPanel UserProcessContainer, studentDirectory studentdirectory, professorDirectory professordirectory, course course, CourseCatalog CourseCatalog) {
        initComponents();

        this.UserProcessContainer = UserProcessContainer;
        this.studentDirectory = studentDirectory;
        this.professorDirectory = professorDirectory;
        this.CourseCatalog = CourseCatalog;
        this.course = course;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageCourses = new javax.swing.JButton();
        btnRanking = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        btnManageStudent = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        btnManageCourses.setBackground(new java.awt.Color(255, 102, 102));
        btnManageCourses.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnManageCourses.setText("Manage Courses");
        btnManageCourses.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCoursesActionPerformed(evt);
            }
        });

        btnRanking.setBackground(new java.awt.Color(255, 102, 102));
        btnRanking.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnRanking.setText("Performance Report");
        btnRanking.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRankingActionPerformed(evt);
            }
        });

        btnProfile.setBackground(new java.awt.Color(255, 102, 102));
        btnProfile.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnProfile.setText("Profile");
        btnProfile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });

        btnManageStudent.setBackground(new java.awt.Color(255, 102, 102));
        btnManageStudent.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnManageStudent.setText("Manage Students ");
        btnManageStudent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageStudentActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 102, 102));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Faculty Dashboard");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnManageCourses)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnManageStudent))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(btnRanking)))
                .addGap(147, 165, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnManageCourses, btnManageStudent, btnProfile, btnRanking});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRanking))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageStudent)
                    .addComponent(btnManageCourses))
                .addContainerGap(284, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnManageCourses, btnManageStudent, btnProfile, btnRanking});

    }// </editor-fold>//GEN-END:initComponents

    private void btnManageCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCoursesActionPerformed
        // TODO add your handling code here:

        FacultyManageCoursesJPanel FacultyManageCoursesJPanel = new FacultyManageCoursesJPanel(UserProcessContainer, professorDirectory, studentDirectory);
        UserProcessContainer.add("FacultyManageCoursesJPanel", FacultyManageCoursesJPanel);
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
        System.out.println("Switching to SignUpJPanel");
        layout.next(UserProcessContainer);
    }//GEN-LAST:event_btnManageCoursesActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        // TODO add your handling code here:
        
        FacultyProfileJPanel FacultyProfileJPanel = new FacultyProfileJPanel(UserProcessContainer,  studentDirectory,professorDirectory, course, CourseCatalog);
        UserProcessContainer.add("FacultyProfileJPanel", FacultyProfileJPanel);
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
        System.out.println("Switching to faculty profile panel");
        layout.next(UserProcessContainer);
        
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRankingActionPerformed
        // TODO add your handling code here:
        FacultyRankingJPanel FacultyRankingJPanel = new FacultyRankingJPanel(UserProcessContainer,  studentDirectory,professorDirectory, course, CourseCatalog);
        UserProcessContainer.add("FacultyRankingJPanel", FacultyRankingJPanel);
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
        System.out.println("Switching to faculty Ranking panel");
        layout.next(UserProcessContainer);
        
        
    }//GEN-LAST:event_btnRankingActionPerformed

    private void btnManageStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageStudentActionPerformed
        // TODO add your handling code here:
         FacultyManageStudentJPanel FacultyManageStudentJPanel = new FacultyManageStudentJPanel(UserProcessContainer,  studentDirectory,professorDirectory, course, CourseCatalog);
        UserProcessContainer.add("FacultyManageStudentJPanel", FacultyManageStudentJPanel);
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
        System.out.println("Switching to faculty Ranking panel");
        layout.next(UserProcessContainer);
        
        
    }//GEN-LAST:event_btnManageStudentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageCourses;
    private javax.swing.JButton btnManageStudent;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnRanking;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
