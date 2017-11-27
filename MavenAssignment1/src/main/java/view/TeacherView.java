
package view;

import java.awt.event.WindowEvent;
import model.Question;
import model.Quiz;
import java.io.*;
/**
 *
 * @author Fahad Zia
 */
public class TeacherView extends javax.swing.JFrame {
    private static final long serialVersionUID = 4950491128935286005L;

    Quiz q;

    public TeacherView() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        questionFrame = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        mcqButton = new javax.swing.JButton();
        tfButton = new javax.swing.JButton();
        numButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        doneButton = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        addedQsLabel = new javax.swing.JLabel();
        unsuccessfulLabel = new javax.swing.JLabel();
        mcqFrame = new javax.swing.JFrame();
        jLabel6 = new javax.swing.JLabel();
        mcqPromptField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        o1Field = new javax.swing.JTextField();
        o2Field = new javax.swing.JTextField();
        o3Field = new javax.swing.JTextField();
        o4Field = new javax.swing.JTextField();
        mcqCorrectField = new javax.swing.JTextField();
        mcqAddButton = new javax.swing.JButton();
        tfFrame = new javax.swing.JFrame();
        jLabel12 = new javax.swing.JLabel();
        tfPromptField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfCorrectField = new javax.swing.JTextField();
        tfAddButton = new javax.swing.JButton();
        numFrame = new javax.swing.JFrame();
        jLabel14 = new javax.swing.JLabel();
        numPromptField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        numCorrectField = new javax.swing.JTextField();
        numAddButton = new javax.swing.JButton();
        addedDialog = new javax.swing.JDialog();
        jLabel16 = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        maxScoreField = new javax.swing.JTextField();

        questionFrame.setSize(500,500);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Add Question");

        mcqButton.setText("MCQ");
        mcqButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcqButtonActionPerformed(evt);
            }
        });

        tfButton.setText("True False");
        tfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfButtonActionPerformed(evt);
            }
        });

        numButton.setText("Numerical");
        numButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Select Question Type:");

        doneButton.setText("Done!");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        jLabel17.setText("Must add 5 Qs");

        jLabel18.setText("Current:");

        javax.swing.GroupLayout questionFrameLayout = new javax.swing.GroupLayout(questionFrame.getContentPane());
        questionFrame.getContentPane().setLayout(questionFrameLayout);
        questionFrameLayout.setHorizontalGroup(
            questionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, questionFrameLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(questionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(tfButton)
                    .addComponent(mcqButton)
                    .addComponent(jLabel4)
                    .addComponent(numButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(questionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(questionFrameLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addedQsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
            .addGroup(questionFrameLayout.createSequentialGroup()
                .addGroup(questionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(questionFrameLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(doneButton))
                    .addGroup(questionFrameLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(unsuccessfulLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        questionFrameLayout.setVerticalGroup(
            questionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionFrameLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(questionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(questionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(addedQsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18)))
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(mcqButton)
                .addGap(18, 18, 18)
                .addComponent(tfButton)
                .addGap(18, 18, 18)
                .addComponent(numButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(unsuccessfulLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(doneButton)
                .addGap(28, 28, 28))
        );

        mcqFrame.setSize(500,500);

        jLabel6.setText("Prompt:");

        mcqPromptField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcqPromptFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("Option 1:");

        jLabel8.setText("Option 2:");

        jLabel9.setText("Option 3:");

        jLabel10.setText("Option 4:");

        jLabel11.setText("Correct (a, b, c, or d):");

        o1Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o1FieldActionPerformed(evt);
            }
        });

        o2Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o2FieldActionPerformed(evt);
            }
        });

        o4Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o4FieldActionPerformed(evt);
            }
        });

        mcqAddButton.setText("Add MCQ!");
        mcqAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcqAddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mcqFrameLayout = new javax.swing.GroupLayout(mcqFrame.getContentPane());
        mcqFrame.getContentPane().setLayout(mcqFrameLayout);
        mcqFrameLayout.setHorizontalGroup(
            mcqFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mcqFrameLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(mcqFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mcqFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mcqFrameLayout.createSequentialGroup()
                            .addGroup(mcqFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11))
                            .addGap(33, 33, 33)
                            .addGroup(mcqFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(o2Field)
                                .addComponent(o3Field)
                                .addComponent(o4Field)
                                .addComponent(mcqCorrectField)
                                .addComponent(o1Field)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mcqFrameLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mcqAddButton)
                            .addGap(120, 120, 120)))
                    .addGroup(mcqFrameLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(103, 103, 103)
                        .addComponent(mcqPromptField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );
        mcqFrameLayout.setVerticalGroup(
            mcqFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mcqFrameLayout.createSequentialGroup()
                .addGroup(mcqFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mcqFrameLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel6))
                    .addGroup(mcqFrameLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(mcqPromptField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(mcqFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(o1Field, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mcqFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(o2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mcqFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(o3Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mcqFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(o4Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mcqFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(mcqCorrectField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mcqAddButton)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        tfFrame.setSize(500,500);

        jLabel12.setText("Prompt:");

        jLabel13.setText("Correct (T or F):");

        tfCorrectField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCorrectFieldActionPerformed(evt);
            }
        });

        tfAddButton.setText("Add TF");
        tfAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tfFrameLayout = new javax.swing.GroupLayout(tfFrame.getContentPane());
        tfFrame.getContentPane().setLayout(tfFrameLayout);
        tfFrameLayout.setHorizontalGroup(
            tfFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tfFrameLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(tfFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(tfFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfAddButton)
                    .addGroup(tfFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfPromptField, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                        .addComponent(tfCorrectField)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        tfFrameLayout.setVerticalGroup(
            tfFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tfFrameLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(tfFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPromptField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(tfFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(tfCorrectField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(tfAddButton)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        numFrame.setSize(500,500);

        jLabel14.setText("Prompt:");

        numPromptField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numPromptFieldActionPerformed(evt);
            }
        });

        jLabel15.setText("Correct:");

        numAddButton.setText("Add Numerical");
        numAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numAddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout numFrameLayout = new javax.swing.GroupLayout(numFrame.getContentPane());
        numFrame.getContentPane().setLayout(numFrameLayout);
        numFrameLayout.setHorizontalGroup(
            numFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(numFrameLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(numFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(numFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numAddButton)
                    .addGroup(numFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(numPromptField, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                        .addComponent(numCorrectField)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        numFrameLayout.setVerticalGroup(
            numFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(numFrameLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(numFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(numPromptField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(numFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(numCorrectField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(numAddButton)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        addedDialog.setSize(243, 200);

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel16.setText("Success!");

        okButton.setText("Ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addedDialogLayout = new javax.swing.GroupLayout(addedDialog.getContentPane());
        addedDialog.getContentPane().setLayout(addedDialogLayout);
        addedDialogLayout.setHorizontalGroup(
            addedDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addedDialogLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(addedDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(okButton))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        addedDialogLayout.setVerticalGroup(
            addedDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addedDialogLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(okButton)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Teacher");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("New Quiz");

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Quiz Name:");

        logoutButton.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        logoutButton.setText("Log Out");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        jLabel19.setText("Max Score:");

        maxScoreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxScoreFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(342, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nextButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(maxScoreField))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(logoutButton))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(maxScoreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nextButton)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void mcqPromptFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcqPromptFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mcqPromptFieldActionPerformed

    private void o1FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o1FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o1FieldActionPerformed

    private void o2FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o2FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o2FieldActionPerformed

    private void o4FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o4FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o4FieldActionPerformed

    private void tfCorrectFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorrectFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorrectFieldActionPerformed

    private void numPromptFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numPromptFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numPromptFieldActionPerformed

    private void mcqButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcqButtonActionPerformed
        mcqFrame.setVisible(true);
    }//GEN-LAST:event_mcqButtonActionPerformed

    private void tfButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfButtonActionPerformed
        tfFrame.setVisible(true);
    }//GEN-LAST:event_tfButtonActionPerformed

    private void numButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numButtonActionPerformed
        numFrame.setVisible(true);
    }//GEN-LAST:event_numButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        q = new Quiz(nameField.getText(), Integer.parseInt(maxScoreField.getText()));
        questionFrame.setVisible(true);
        addedQsLabel.setText((Integer.toString(q.questions.size())));
    }//GEN-LAST:event_nextButtonActionPerformed

    private void mcqAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcqAddButtonActionPerformed
        String prompt, correct;
        String options[]={"","","",""};
        prompt=mcqPromptField.getText();
        options[0]=o1Field.getText();
        options[1]=o2Field.getText();
        options[2]=o3Field.getText();
        options[3]=o4Field.getText();
        correct=mcqCorrectField.getText();
        Question a=new Question(prompt, options, correct);
        q.addQuestion(a);
        addedQsLabel.setText((Integer.toString(q.questions.size())));        
        addedDialog.setVisible(true);
        mcqFrame.dispatchEvent(new WindowEvent(mcqFrame, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_mcqAddButtonActionPerformed

    private void tfAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAddButtonActionPerformed
        String prompt, correct;
        prompt=tfPromptField.getText();
        correct=tfCorrectField.getText();
        Question a=new Question(prompt, correct, "tf");
        q.addQuestion(a);
        addedQsLabel.setText((Integer.toString(q.questions.size())));        
        addedDialog.setVisible(true);
        tfFrame.dispatchEvent(new WindowEvent(tfFrame, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_tfAddButtonActionPerformed

    private void numAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numAddButtonActionPerformed
        String prompt, correct;
        prompt=numPromptField.getText();
        correct=numCorrectField.getText();
        Question a=new Question(prompt, correct, "num");
        q.addQuestion(a);
        addedQsLabel.setText((Integer.toString(q.questions.size())));
        addedDialog.setVisible(true);
        numFrame.dispatchEvent(new WindowEvent(numFrame, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_numAddButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        addedDialog.setVisible(false);
    }//GEN-LAST:event_okButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        if(q.questions.size()==5){
            addedDialog.setVisible(true);
            questionFrame.dispatchEvent(new WindowEvent(questionFrame, WindowEvent.WINDOW_CLOSING));
            try {
                FileOutputStream fileOut = new FileOutputStream("Quiz2.ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                    out.writeObject(q);
                out.close();
                fileOut.close();
                System.out.printf("Serialized data is saved in Quiz2.ser");
            }
            catch(IOException i) {
                i.printStackTrace();
            }
        }
        else{
            unsuccessfulLabel.setText("Enter 5 Questions");
        }
        
    }//GEN-LAST:event_doneButtonActionPerformed

    private void maxScoreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxScoreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxScoreFieldActionPerformed
     

    /**
     * @param args the command line arguments
     */
    public void startTeacherView() {
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
            java.util.logging.Logger.getLogger(TeacherView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog addedDialog;
    private javax.swing.JLabel addedQsLabel;
    private javax.swing.JButton doneButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTextField maxScoreField;
    private javax.swing.JButton mcqAddButton;
    private javax.swing.JButton mcqButton;
    private javax.swing.JTextField mcqCorrectField;
    private javax.swing.JFrame mcqFrame;
    private javax.swing.JTextField mcqPromptField;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton numAddButton;
    private javax.swing.JButton numButton;
    private javax.swing.JTextField numCorrectField;
    private javax.swing.JFrame numFrame;
    private javax.swing.JTextField numPromptField;
    private javax.swing.JTextField o1Field;
    private javax.swing.JTextField o2Field;
    private javax.swing.JTextField o3Field;
    private javax.swing.JTextField o4Field;
    private javax.swing.JButton okButton;
    private javax.swing.JFrame questionFrame;
    private javax.swing.JButton tfAddButton;
    private javax.swing.JButton tfButton;
    private javax.swing.JTextField tfCorrectField;
    private javax.swing.JFrame tfFrame;
    private javax.swing.JTextField tfPromptField;
    private javax.swing.JLabel unsuccessfulLabel;
    // End of variables declaration//GEN-END:variables
}
