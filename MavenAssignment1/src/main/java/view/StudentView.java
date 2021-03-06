
package view;

import controller.QuizResult;
import model.Quiz;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Fahad Zia
 */
public class StudentView extends javax.swing.JFrame {
    private static final long serialVersionUID = 4950491128935286005L;

    Quiz q;
    QuizResult r;
    int correct;
    int i; //For for loop

    public StudentView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mcqFrame = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        mcqPromptLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        o2Label = new javax.swing.JLabel();
        o1Label = new javax.swing.JLabel();
        o4Label = new javax.swing.JLabel();
        o3Label = new javax.swing.JLabel();
        mcqAnswer = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        mcqNext = new javax.swing.JButton();
        tfFrame = new javax.swing.JFrame();
        jLabel8 = new javax.swing.JLabel();
        tfPromptLabel = new javax.swing.JLabel();
        tfAnswer = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        tfNext = new javax.swing.JButton();
        numFrame = new javax.swing.JFrame();
        jLabel10 = new javax.swing.JLabel();
        numPromptLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        numAnswer = new javax.swing.JTextField();
        numNext = new javax.swing.JButton();
        addedDialog = new javax.swing.JDialog();
        jLabel16 = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        finishDialog = new javax.swing.JDialog();
        finishButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        showButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        resultLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();

        mcqFrame.setSize(500,500);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Question:");

        jLabel3.setText("a:");

        jLabel4.setText("b:");

        jLabel5.setText("c:");

        jLabel6.setText("d:");

        mcqAnswer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "a", "b", "c", "d" }));

        jLabel7.setText("Answer:");

        mcqNext.setText("Next");
        mcqNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcqNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mcqFrameLayout = new javax.swing.GroupLayout(mcqFrame.getContentPane());
        mcqFrame.getContentPane().setLayout(mcqFrameLayout);
        mcqFrameLayout.setHorizontalGroup(
            mcqFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mcqFrameLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(mcqFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mcqPromptLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(mcqFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(mcqFrameLayout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addGroup(mcqFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(mcqFrameLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(mcqNext))
                                .addGroup(mcqFrameLayout.createSequentialGroup()
                                    .addComponent(mcqAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mcqFrameLayout.createSequentialGroup()
                            .addGroup(mcqFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(mcqFrameLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(o1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(49, 49, 49)
                                    .addComponent(jLabel5))
                                .addGroup(mcqFrameLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(o2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(48, 48, 48)
                                    .addComponent(jLabel6)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(mcqFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(o3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(o4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        mcqFrameLayout.setVerticalGroup(
            mcqFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mcqFrameLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mcqPromptLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mcqFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mcqFrameLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(mcqFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(38, 38, 38)
                        .addGroup(mcqFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)))
                    .addGroup(mcqFrameLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(mcqFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(o1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(o3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(mcqFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(o2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(o4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(mcqFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mcqFrameLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mcqNext)
                        .addContainerGap())
                    .addGroup(mcqFrameLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(mcqFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(mcqAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(29, Short.MAX_VALUE))))
        );

        tfFrame.setSize(500,500);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Question:");

        tfAnswer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "True", "False" }));

        jLabel9.setText("Answer:");

        tfNext.setText("Next");
        tfNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tfFrameLayout = new javax.swing.GroupLayout(tfFrame.getContentPane());
        tfFrame.getContentPane().setLayout(tfFrameLayout);
        tfFrameLayout.setHorizontalGroup(
            tfFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tfFrameLayout.createSequentialGroup()
                .addGroup(tfFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tfFrameLayout.createSequentialGroup()
                        .addGroup(tfFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tfFrameLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(tfFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPromptLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))
                            .addGroup(tfFrameLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(tfAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 64, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tfFrameLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tfNext)))
                .addContainerGap())
        );
        tfFrameLayout.setVerticalGroup(
            tfFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tfFrameLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPromptLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(tfFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(tfNext)
                .addContainerGap())
        );

        numFrame.setSize(500,500);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Question:");

        jLabel11.setText("Answer:");

        numAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numAnswerActionPerformed(evt);
            }
        });

        numNext.setText("Next");
        numNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout numFrameLayout = new javax.swing.GroupLayout(numFrame.getContentPane());
        numFrame.getContentPane().setLayout(numFrameLayout);
        numFrameLayout.setHorizontalGroup(
            numFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(numFrameLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(numFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(numPromptLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, numFrameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(numNext)
                .addContainerGap())
        );
        numFrameLayout.setVerticalGroup(
            numFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(numFrameLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(numPromptLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(numAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(numNext)
                .addContainerGap())
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

        finishDialog.setSize(240,200);

        finishButton.setText("Finish!");
        finishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout finishDialogLayout = new javax.swing.GroupLayout(finishDialog.getContentPane());
        finishDialog.getContentPane().setLayout(finishDialogLayout);
        finishDialogLayout.setHorizontalGroup(
            finishDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(finishDialogLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(finishButton)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        finishDialogLayout.setVerticalGroup(
            finishDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(finishDialogLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(finishButton)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Student");

        showButton.setText("Attempt Quiz!");
        showButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showButtonActionPerformed(evt);
            }
        });

        logoutButton.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        logoutButton.setText("Log Out");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        jLabel12.setText("Result:");

        saveButton.setText("Save!");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(showButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                                .addComponent(logoutButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(resultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(saveButton))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showButton)
                    .addComponent(logoutButton))
                .addGap(33, 33, 33)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(saveButton)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showButtonActionPerformed
        q = null;
        try {
         FileInputStream fileIn = new FileInputStream("Quiz2.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         q = (Quiz) in.readObject();
         in.close();
         fileIn.close();
      }catch(IOException i) {
         i.printStackTrace();
         return;
      }catch(ClassNotFoundException c) {
         System.out.println("Quiz not found");
         c.printStackTrace();
         return;
      }
       showButton.setVisible(false);
                     
       if(q.questions.get(0).type.equals("mcq")){
          mcqFrame.setVisible(true);
          tfFrame.setVisible(false);
          numFrame.setVisible(false);
          mcqPromptLabel.setText(q.questions.get(0).prompt);
          o1Label.setText(q.questions.get(0).options[0]);
          o2Label.setText(q.questions.get(0).options[1]);
          o3Label.setText(q.questions.get(0).options[2]);
          o4Label.setText(q.questions.get(0).options[3]);
       }
       else if(q.questions.get(0).type.equals("tf")){
            tfFrame.setVisible(true);
            mcqFrame.setVisible(false);
            numFrame.setVisible(false);
            tfPromptLabel.setText(q.questions.get(0).prompt);
       }
       else{
          numFrame.setVisible(true);
          tfFrame.setVisible(false);
          mcqFrame.setVisible(false);
          numPromptLabel.setText(q.questions.get(0).prompt);               
       }
       
       r=new QuizResult(q);
       correct=0;
       i=0;
    }//GEN-LAST:event_showButtonActionPerformed

    private void populateMCQ(){
        mcqFrame.setVisible(true);
        tfFrame.dispose();
        numFrame.dispose();
        mcqPromptLabel.setText(q.questions.get(i).prompt);
        o1Label.setText(q.questions.get(i).options[0]);
        o2Label.setText(q.questions.get(i).options[1]);
        o3Label.setText(q.questions.get(i).options[2]);
        o4Label.setText(q.questions.get(i).options[3]);
       }
    
    private void populateTF(){
        tfFrame.setVisible(true);
        mcqFrame.dispose();
        numFrame.dispose();
        tfPromptLabel.setText(q.questions.get(i).prompt);           
    }
    
    private void populateNum(){
        numFrame.setVisible(true);
        tfFrame.dispose();
        mcqFrame.dispose();
        numPromptLabel.setText(q.questions.get(i).prompt);                   
    }
    
    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void numAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numAnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numAnswerActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        addedDialog.setVisible(true);

    }//GEN-LAST:event_saveButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        addedDialog.setVisible(false);
    }//GEN-LAST:event_okButtonActionPerformed

    private void mcqNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcqNextActionPerformed
        if(q.questions.get(i).checkAns((String)mcqAnswer.getEditor().getItem()))
            correct++;
        i++;
        if(i<5){        
            if(q.questions.get(i).type.equals("mcq"))
                populateMCQ();
            else if(q.questions.get(i).type.equals("tf"))
                populateTF();
            else
                populateNum();
        }
        else{
            mcqFrame.dispose();tfFrame.dispose();numFrame.dispose();
            finishDialog.setVisible(true);
        }
    }//GEN-LAST:event_mcqNextActionPerformed

    private void finishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishButtonActionPerformed
        finishDialog.setVisible(false);
        showScore();
    }//GEN-LAST:event_finishButtonActionPerformed

    private void tfNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNextActionPerformed
        if(q.questions.get(i).checkAns((String)mcqAnswer.getEditor().getItem()))
            correct++;
            i++;
        if(i<5){        
            if(q.questions.get(i).type.equals("mcq"))
                populateMCQ();
            else if(q.questions.get(i).type.equals("tf"))
                populateTF();
            else
                populateNum();
        }
        else{
            mcqFrame.dispose();tfFrame.dispose();numFrame.dispose();
            finishDialog.setVisible(true);
            showScore();
        }
    }//GEN-LAST:event_tfNextActionPerformed


    private void showScore(){    
        //resultLabel.setText(Integer.toString((int) r.getPercentage((int) r.getScore(correct))));
        resultLabel.setText(Integer.toString(correct*100/5));
    }
        
    private void numNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numNextActionPerformed
        if(q.questions.get(i).checkAns((String)mcqAnswer.getEditor().getItem()))
            correct++;
        i++;
        if(i<5){        
            if(q.questions.get(i).type.equals("mcq"))
                populateMCQ();
            else if(q.questions.get(i).type.equals("tf"))
                populateTF();
            else
                populateNum();
        }
        else{
            mcqFrame.dispose();tfFrame.dispose();numFrame.dispose();
            finishDialog.setVisible(true);
        }

    }//GEN-LAST:event_numNextActionPerformed

    /**
     * @param args the command line arguments
     */
    public void startStudentView() {
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
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog addedDialog;
    private javax.swing.JButton finishButton;
    private javax.swing.JDialog finishDialog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton logoutButton;
    private javax.swing.JComboBox<String> mcqAnswer;
    private javax.swing.JFrame mcqFrame;
    private javax.swing.JButton mcqNext;
    private javax.swing.JLabel mcqPromptLabel;
    private javax.swing.JTextField numAnswer;
    private javax.swing.JFrame numFrame;
    private javax.swing.JButton numNext;
    private javax.swing.JLabel numPromptLabel;
    private javax.swing.JLabel o1Label;
    private javax.swing.JLabel o2Label;
    private javax.swing.JLabel o3Label;
    private javax.swing.JLabel o4Label;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton showButton;
    private javax.swing.JComboBox<String> tfAnswer;
    private javax.swing.JFrame tfFrame;
    private javax.swing.JButton tfNext;
    private javax.swing.JLabel tfPromptLabel;
    // End of variables declaration//GEN-END:variables
}
