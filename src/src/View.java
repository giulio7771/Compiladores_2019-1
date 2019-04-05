/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author giulio
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    private static File openedFile = null;

    public View() {
        initComponents();
        //how to set up butto icons
        // Icon icone = new ImageIcon("imgs\\1-novo.png");
        // jButton_1_novo.setIcon(icone);

        jTextAreaMessages.setEditable(false);
        jTextAreaMessages.setEnabled(false);
        jTextAreaStatusBar.setEditable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMainScreen = new javax.swing.JPanel();
        jTextAreaTextEditor = new java.awt.TextArea();
        jButton_1_novo = new javax.swing.JButton();
        jButtonAbrir = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCopiar = new javax.swing.JButton();
        jButtonColar = new javax.swing.JButton();
        jButtonRecortar = new javax.swing.JButton();
        jButtonCompilar = new javax.swing.JButton();
        jButtonEquipe = new javax.swing.JButton();
        jTextAreaMessages = new java.awt.TextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaStatusBar = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_1_novo.setText("novo [ctrl-n]");
        jButton_1_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_1_novoActionPerformed(evt);
            }
        });

        jButtonAbrir.setText("abrir [ctrl-o]");
        jButtonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("salvar [ctrl-s]");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCopiar.setText("copiar [ctrl-c]");

        jButtonColar.setText("colar [ctrl-v]");

        jButtonRecortar.setText("recortar [ctrl-x]");

        jButtonCompilar.setText("compilar [F9]");

        jButtonEquipe.setText("equipe [F1]");

        jTextAreaStatusBar.setColumns(20);
        jTextAreaStatusBar.setRows(5);
        jScrollPane1.setViewportView(jTextAreaStatusBar);

        javax.swing.GroupLayout jPanelMainScreenLayout = new javax.swing.GroupLayout(jPanelMainScreen);
        jPanelMainScreen.setLayout(jPanelMainScreenLayout);
        jPanelMainScreenLayout.setHorizontalGroup(
            jPanelMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jTextAreaTextEditor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextAreaMessages, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelMainScreenLayout.createSequentialGroup()
                        .addComponent(jButton_1_novo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAbrir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCopiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonColar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRecortar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCompilar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEquipe)
                        .addGap(0, 80, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelMainScreenLayout.setVerticalGroup(
            jPanelMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCompilar, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(jButtonRecortar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonColar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCopiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_1_novo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAbrir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEquipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextAreaTextEditor, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextAreaMessages, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMainScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMainScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_1_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_1_novoActionPerformed
        jTextAreaMessages.setText("");
        jTextAreaStatusBar.setText("");
        jTextAreaTextEditor.setText("");
        openedFile = null;
    }//GEN-LAST:event_jButton_1_novoActionPerformed

    private void jButtonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirActionPerformed
        jTextAreaTextEditor.setText("");
        JFileChooser jfc = new JFileChooser();
        if (jfc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
            File file = jfc.getSelectedFile();
            Scanner sc = null;
            try {
                sc = new Scanner(file);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
            //gamb para apresentar número da linha
            int lineNumber = 1;
            while (sc.hasNextLine()) {
                jTextAreaTextEditor.append((lineNumber++) + "|   " + sc.nextLine() + "\n");
            }
            //set status bar
            openedFile = file;
            setStatus();
        }
    }//GEN-LAST:event_jButtonAbrirActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        if (openedFile != null) {
            try {
                //salvar no arquivo aberto
                FileWriter fr = new FileWriter(openedFile.getAbsolutePath());
                PrintWriter pw = new PrintWriter(fr);
                pw.printf(jTextAreaTextEditor.getText());
                System.out.println("Saved on: " + openedFile.getPath());
                System.out.println("Value:\n" + jTextAreaTextEditor.getText());
                pw.close();
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            //salvar em um arquivo novo
            JFileChooser jfc = new JFileChooser();
            if (jfc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                File file = jfc.getSelectedFile();
                openedFile = file;
                try {
                    FileWriter fr = new FileWriter(file.getAbsolutePath());
                    PrintWriter pw = new PrintWriter(fr);
                    pw.printf(jTextAreaTextEditor.getText());
                    jTextAreaMessages.setText("");
                    pw.close();
                    setStatus();
                } catch (IOException ex) {
                    Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbrir;
    private javax.swing.JButton jButtonColar;
    private javax.swing.JButton jButtonCompilar;
    private javax.swing.JButton jButtonCopiar;
    private javax.swing.JButton jButtonEquipe;
    private javax.swing.JButton jButtonRecortar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButton_1_novo;
    private javax.swing.JPanel jPanelMainScreen;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.TextArea jTextAreaMessages;
    private javax.swing.JTextArea jTextAreaStatusBar;
    private java.awt.TextArea jTextAreaTextEditor;
    // End of variables declaration//GEN-END:variables

    private void setStatus() {
        String path = openedFile.getPath();
        String name = openedFile.getName();
        jTextAreaStatusBar.setText("Arquivo corrente: " + name + "\nPasta: " + path);
    }
}
