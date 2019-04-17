/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import gals.*;
import gals.Token;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.text.DefaultEditorKit;

/**
 *
 * @author Giulio Giovanella
 */
public class View extends javax.swing.JFrame {

    private static File openedFile = null;
    private static String textCache = "";

    private final Shortcut aOpen = new Shortcut("CTRLO");
    private final Shortcut aNew = new Shortcut("CTRLN");
    private final Shortcut aSave = new Shortcut("CTRLS");
    private final Shortcut aAbout = new Shortcut("F1");
    private final Shortcut aCopy = new Shortcut("CTRLC");
    private final Shortcut aCut = new Shortcut("CTRLX");
    private final Shortcut aPaste = new Shortcut("CTRLV");
    private final Shortcut aCompile = new Shortcut("F9");

    public class Shortcut extends AbstractAction {

        private final String buttonPressed;

        public Shortcut(String buttonPressed) {
            this.buttonPressed = buttonPressed;
        }

        @Override
        public void actionPerformed(ActionEvent event) {
            switch (this.buttonPressed) {
                case "CTRLN":
                    jButton_1_novoActionPerformed(event);
                    break;
                case "CTRLO":
                    jButtonAbrirActionPerformed(event);
                    break;
                case "CTRLS":
                    jButtonSalvarActionPerformed(event);
                    break;
                case "CTRLC":
                    jButtonCopiarActionPerformed(event);
                    break;
                case "CTRLV":
                    jButtonColarActionPerformed(event);
                    break;
                case "CRTLX":
                    jButtonRecortarActionPerformed(event);
                    break;
                case "F9":
                    jButtonCompilarActionPerformed(event);
                    break;
                case "F1":
                    jButtonEquipeActionPerformed(event);
                    break;
            }
        }

    }

    public View() {
        this.setMinimumSize(new Dimension(900, 600));
        initComponents();
        NumberedBorder nb = new NumberedBorder();
        jTextAreaTextEditor.setBorder(nb);

//        this.jPanel3 = new TextLineNumber(this.jTextArea2);;
        //set up button icons
//         jButton_1_novo.setIcon(new ImageIcon("1New.png"));
//         jButtonAbrir.setIcon(new ImageIcon("2Open.png"));
//         jButtonSalvar.setIcon(new ImageIcon("3Save.png"));
//         jButtonCopiar.setIcon(new ImageIcon("4Copy.png"));
//         jButtonColar.setIcon(new ImageIcon("5Paste.png"));
//         jButtonRecortar.setIcon(new ImageIcon("6Cut.png"));
//         jButtonCompilar.setIcon(new ImageIcon("7Compile.png"));
//         jButtonEquipe.setIcon(new ImageIcon("8About.png"));
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        //scroll.setHorizontalScrollBar(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jTextAreaMessages.setEditable(false);
        jTextAreaStatusBar.setEditable(false);
//        jTextAreaTextEditor.setBorder(new NumberedBorder());
        setUpShortcutKeys(jPanelMainScreen);
    }

    public void setUpShortcutKeys(JPanel panel) {
        ActionMap actionMap = panel.getActionMap();
        actionMap.put("bAbout", aAbout);
        actionMap.put("bNew", aNew);
        actionMap.put("bOpen", aOpen);
        actionMap.put("bSave", aSave);
        actionMap.put("bCut", aCut);
        actionMap.put("bCopy", aCopy);
        actionMap.put("bPaste", aPaste);
        actionMap.put("bCompile", aCompile);
        panel.setActionMap(actionMap);
        InputMap imap = panel.getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW);
        imap.put(KeyStroke.getKeyStroke("F1"), "bAbout");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK), "bNew");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK), "bOpen");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK), "bSave");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK), "bCut");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK), "bCopy");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_MASK), "bPaste");
        imap.put(KeyStroke.getKeyStroke("F9"), "bCompile");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelMainScreen = new javax.swing.JPanel();
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
        scroll = new javax.swing.JScrollPane();
        jTextAreaTextEditor = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelMainScreen.setMinimumSize(new java.awt.Dimension(900, 600));
        jPanelMainScreen.setPreferredSize(new java.awt.Dimension(900, 600));

        jButton_1_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/1New.png"))); // NOI18N
        jButton_1_novo.setText("novo [ctrl-n]");
        jButton_1_novo.setAutoscrolls(true);
        jButton_1_novo.setFocusCycleRoot(true);
        jButton_1_novo.setHideActionText(true);
        jButton_1_novo.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton_1_novo.setMaximumSize(new java.awt.Dimension(100, 70));
        jButton_1_novo.setMinimumSize(new java.awt.Dimension(111, 70));
        jButton_1_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_1_novoActionPerformed(evt);
            }
        });

        jButtonAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/2Open.png"))); // NOI18N
        jButtonAbrir.setText("abrir [ctrl-o]");
        jButtonAbrir.setAutoscrolls(true);
        jButtonAbrir.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButtonAbrir.setMaximumSize(new java.awt.Dimension(111, 70));
        jButtonAbrir.setMinimumSize(new java.awt.Dimension(111, 70));
        jButtonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirActionPerformed(evt);
            }
        });

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/3Save.png"))); // NOI18N
        jButtonSalvar.setText("salvar [ctrl-s]");
        jButtonSalvar.setAutoscrolls(true);
        jButtonSalvar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButtonSalvar.setMaximumSize(new java.awt.Dimension(117, 70));
        jButtonSalvar.setMinimumSize(new java.awt.Dimension(117, 70));
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/4Copy.png"))); // NOI18N
        jButtonCopiar.setText("copiar [ctrl-c]");
        jButtonCopiar.setAutoscrolls(true);
        jButtonCopiar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButtonCopiar.setMaximumSize(new java.awt.Dimension(117, 70));
        jButtonCopiar.setMinimumSize(new java.awt.Dimension(117, 70));
        jButtonCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopiarActionPerformed(evt);
            }
        });

        jButtonColar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/5Paste.png"))); // NOI18N
        jButtonColar.setText("colar [ctrl-v]");
        jButtonColar.setAutoscrolls(true);
        jButtonColar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButtonColar.setMaximumSize(new java.awt.Dimension(111, 70));
        jButtonColar.setMinimumSize(new java.awt.Dimension(111, 70));
        jButtonColar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonColarActionPerformed(evt);
            }
        });

        jButtonRecortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/6Cut.png"))); // NOI18N
        jButtonRecortar.setText("recortar [ctrl-x]");
        jButtonRecortar.setAutoscrolls(true);
        jButtonRecortar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButtonRecortar.setMaximumSize(new java.awt.Dimension(127, 70));
        jButtonRecortar.setMinimumSize(new java.awt.Dimension(127, 70));
        jButtonRecortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRecortarActionPerformed(evt);
            }
        });

        jButtonCompilar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/7Compile.png"))); // NOI18N
        jButtonCompilar.setText("compilar [F9]");
        jButtonCompilar.setAutoscrolls(true);
        jButtonCompilar.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jButtonCompilar.setMaximumSize(new java.awt.Dimension(115, 70));
        jButtonCompilar.setMinimumSize(new java.awt.Dimension(115, 70));
        jButtonCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCompilarActionPerformed(evt);
            }
        });

        jButtonEquipe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/8About.png"))); // NOI18N
        jButtonEquipe.setText("equipe [F1]");
        jButtonEquipe.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButtonEquipe.setMaximumSize(new java.awt.Dimension(107, 70));
        jButtonEquipe.setMinimumSize(new java.awt.Dimension(107, 70));
        jButtonEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEquipeActionPerformed(evt);
            }
        });

        jTextAreaMessages.setEditable(false);
        jTextAreaMessages.setMinimumSize(new java.awt.Dimension(900, 100));

        jTextAreaStatusBar.setColumns(20);
        jTextAreaStatusBar.setRows(5);
        jTextAreaStatusBar.setMinimumSize(new java.awt.Dimension(900, 30));
        jScrollPane1.setViewportView(jTextAreaStatusBar);

        scroll.setMinimumSize(new java.awt.Dimension(900, 400));

        jTextAreaTextEditor.setColumns(20);
        jTextAreaTextEditor.setRows(5);
        jTextAreaTextEditor.setMargin(new java.awt.Insets(0, 0, 0, 0));
        scroll.setViewportView(jTextAreaTextEditor);

        jPanel2.setMinimumSize(new java.awt.Dimension(900, 70));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelMainScreenLayout = new javax.swing.GroupLayout(jPanelMainScreen);
        jPanelMainScreen.setLayout(jPanelMainScreenLayout);
        jPanelMainScreenLayout.setHorizontalGroup(
            jPanelMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainScreenLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainScreenLayout.createSequentialGroup()
                        .addComponent(jButton_1_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCopiar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonColar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRecortar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCompilar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
            .addGroup(jPanelMainScreenLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanelMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
                    .addComponent(jTextAreaMessages, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );
        jPanelMainScreenLayout.setVerticalGroup(
            jPanelMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainScreenLayout.createSequentialGroup()
                .addGroup(jPanelMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_1_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAbrir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCopiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonColar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRecortar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCompilar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEquipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanelMainScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainScreenLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMainScreenLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextAreaMessages, javax.swing.GroupLayout.PREFERRED_SIZE, 68, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMainScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 919, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMainScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                jTextAreaTextEditor.append(sc.nextLine() + "\n");
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
        jTextAreaMessages.append("Arquivo salvo\n");
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    public void setTokenClass(Token token, List<String> tokenClass){
              if (token.getId() >= 29 && token.getId() <= 48) {
                    //simbolo especial
                    tokenClass.add("Símbolo Especial");
                } else if(token.getId() >= 7 && token.getId() <= 28){
                    //palavra reservada
                    tokenClass.add("Palavra Reservada");
                }else{
                    switch (token.getId()) {
                        case Constants.t_identificador:
                            tokenClass.add("Identificador");
                            break;
                        case Constants.t_constante_inteira:
                            tokenClass.add("Constante Inteira");
                            break;   
                        case Constants.t_constante_real:
                            tokenClass.add("Constante Real");
                            break;   
                        case Constants.t_constante_string:
                            tokenClass.add("Constante String");
                            break;   
                        case Constants.t_constante_caracter:
                            tokenClass.add("Constante Caracter");
                            break;
                        default:
                            //lexema não especificado
                    }
                }
    }
    public Integer setTokenLine(Integer line, List<Integer> tokenLine, String[] textLine, Token token){
         while(true){
                    if(textLine[line].contains(token.getLexeme())){
                        tokenLine.add(line);
                        textLine[line] = textLine[line].replace(token.getLexeme(), "");
                        break;
                    }else{
                        line++;
                    }
                }
         return line;
    }
    private void jButtonCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCompilarActionPerformed
        //Compilar
        Lexico lexico = new Lexico();
        lexico.setInput(jTextAreaTextEditor.getText());
        String[] textLine = jTextAreaTextEditor.getText().split("\n");
        try {
            Integer line = new Integer(0);
            List<Token> tokenList = new LinkedList<>();
            List<Integer> tokenLine = new LinkedList<>();
            List<String> tokenClass = new LinkedList<>();
            Token token = null;
            boolean erro = false;
            while ((token = lexico.nextToken()) != null) {
                
                    tokenList.add(token);
                    setTokenClass(token, tokenClass);
                    line  = setTokenLine(line, tokenLine, textLine, token);
                
            }
            if(!erro){
                for (int i = 0; i < tokenClass.size(); i++) {
                    jTextAreaMessages.append((tokenLine.get(i)+1)+"\t"+tokenClass.get(i)+"\t"+tokenList.get(i).getLexeme()+"\n");
                }
                jTextAreaMessages.append("Programa Combilado com sucesso\n");
            }
        } catch (LexicalError ex) {
            jTextAreaMessages.append("Erro léxico 2");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButtonCompilarActionPerformed

    private void jButtonEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEquipeActionPerformed
        // TODO add your handling code here:
        jTextAreaMessages.append("Equipe: Giulio Giovanella; José Henrique Teixeira; Diogo Warmeling\n");
    }//GEN-LAST:event_jButtonEquipeActionPerformed

    private void jButtonCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopiarActionPerformed
        // TODO add your handling code here:
//        textCache = jTextAreaTextEditor.getSelectedText();
        jTextAreaTextEditor.copy();
    }//GEN-LAST:event_jButtonCopiarActionPerformed

    private void jButtonColarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonColarActionPerformed
        //gamb inserindo o texto no final, e não no cursor
//        jTextAreaTextEditor.append(textCache);
        jTextAreaTextEditor.paste();
    }//GEN-LAST:event_jButtonColarActionPerformed

    private void jButtonRecortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRecortarActionPerformed
//        textCache = jTextAreaTextEditor.getSelectedText();
//        String textOnEditor = jTextAreaTextEditor.getText();
        jTextAreaTextEditor.cut();

    }//GEN-LAST:event_jButtonRecortarActionPerformed

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelMainScreen;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.TextArea jTextAreaMessages;
    private javax.swing.JTextArea jTextAreaStatusBar;
    private javax.swing.JTextArea jTextAreaTextEditor;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables

    private void setStatus() {
        String path = openedFile.getPath();
        String name = openedFile.getName();
        jTextAreaStatusBar.setText("Arquivo corrente: " + name + "\nPasta: " + path);
    }
}
