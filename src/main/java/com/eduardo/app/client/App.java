package com.eduardo.app.client;

import com.eduardo.app.dto.response.TranslateDtoResponse;
import com.eduardo.app.rmi.ITraductor;
import com.eduardo.app.util.Mapper;
import com.fasterxml.jackson.core.type.TypeReference;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Objects;
import java.util.Optional;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class App extends javax.swing.JFrame {

    private Client clientRmi;

    public App() {
        initComponents();
        setBackground(new Color(0, 0, 0, 1));
        clientRmi = new Client("127.0.0.1", 8000);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        background = new com.eduardo.app.client.component.PanelRounded();
        header = new com.eduardo.app.client.component.PanelRounded();
        jLabelMin = new javax.swing.JLabel();
        jLabelMax = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        panelRounded1 = new com.eduardo.app.client.component.PanelRounded();
        jLabelInicio = new javax.swing.JLabel();
        jLabelFinal = new javax.swing.JLabel();
        jComboBoxInicio = new javax.swing.JComboBox<>();
        jComboBoxFinal = new javax.swing.JComboBox<>();
        jLabelTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaTexto = new javax.swing.JTextArea();
        jLabelIngreseTexto = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaTextoTraducido = new javax.swing.JTextArea();
        jLabelTextTraducido = new javax.swing.JLabel();
        jButtonTraducir = new javax.swing.JButton();
        jLabelLoading = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setMinimumSize(new java.awt.Dimension(765, 558));

        header.setBackground(new java.awt.Color(236, 236, 236));
        header.setPreferredSize(new java.awt.Dimension(700, 40));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 7);
        flowLayout1.setAlignOnBaseline(true);
        header.setLayout(flowLayout1);

        jLabelMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/min.png"))); // NOI18N
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });
        header.add(jLabelMin);

        jLabelMax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/max.png"))); // NOI18N
        jLabelMax.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMaxMouseClicked(evt);
            }
        });
        header.add(jLabelMax);

        jLabelClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });
        header.add(jLabelClose);

        panelRounded1.setBackground(new java.awt.Color(255, 255, 255));
        panelRounded1.setLayout(new java.awt.GridLayout(2, 2, 2, 2));

        jLabelInicio.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 12)); // NOI18N
        jLabelInicio.setForeground(new java.awt.Color(153, 153, 153));
        jLabelInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInicio.setText("INICIO");
        panelRounded1.add(jLabelInicio);

        jLabelFinal.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 0, 12)); // NOI18N
        jLabelFinal.setForeground(new java.awt.Color(153, 153, 153));
        jLabelFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFinal.setText("FINAL");
        panelRounded1.add(jLabelFinal);

        jComboBoxInicio.setForeground(new java.awt.Color(153, 153, 153));
        jComboBoxInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Spanish", "English", "Arabic", "Hindi", "Portuguese", "Russian", "Italian", "French", "Korean" }));
        panelRounded1.add(jComboBoxInicio);

        jComboBoxFinal.setForeground(new java.awt.Color(153, 153, 153));
        jComboBoxFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English", "Spanish", "Arabic", "Hindi", "Portuguese", "Russian", "Italian", "French", "Korean" }));
        panelRounded1.add(jComboBoxFinal);

        jLabelTitle.setFont(new java.awt.Font("JetBrains Mono NL ExtraBold", 2, 18)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(153, 153, 153));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("TRADUCTOR");

        jTextAreaTexto.setColumns(20);
        jTextAreaTexto.setForeground(new java.awt.Color(153, 153, 153));
        jTextAreaTexto.setRows(5);
        jScrollPane1.setViewportView(jTextAreaTexto);

        jLabelIngreseTexto.setFont(new java.awt.Font("JetBrains Mono NL ExtraBold", 0, 12)); // NOI18N
        jLabelIngreseTexto.setForeground(new java.awt.Color(153, 153, 153));
        jLabelIngreseTexto.setText("INGRESE UN TEXTO");

        jTextAreaTextoTraducido.setEditable(false);
        jTextAreaTextoTraducido.setColumns(20);
        jTextAreaTextoTraducido.setFont(new java.awt.Font("JetBrains Mono", 0, 12)); // NOI18N
        jTextAreaTextoTraducido.setForeground(new java.awt.Color(153, 153, 153));
        jTextAreaTextoTraducido.setRows(5);
        jScrollPane2.setViewportView(jTextAreaTextoTraducido);

        jLabelTextTraducido.setFont(new java.awt.Font("JetBrains Mono NL ExtraBold", 0, 12)); // NOI18N
        jLabelTextTraducido.setForeground(new java.awt.Color(153, 153, 153));
        jLabelTextTraducido.setText("TEXTO TRADUCIDO");

        jButtonTraducir.setBackground(new java.awt.Color(61, 154, 255));
        jButtonTraducir.setFont(new java.awt.Font("JetBrains Mono NL ExtraBold", 0, 12)); // NOI18N
        jButtonTraducir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTraducir.setText("TRADUCIR");
        jButtonTraducir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonTraducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTraducirActionPerformed(evt);
            }
        });

        jLabelLoading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(panelRounded1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabelIngreseTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabelTextTraducido, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabelLoading, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jButtonTraducir, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(panelRounded1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIngreseTexto)
                    .addComponent(jLabelTextTraducido))
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addGap(10, 10, 10)
                .addComponent(jLabelLoading, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButtonTraducir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMaxMouseClicked
        if (getExtendedState() != App.MAXIMIZED_BOTH) {
            setExtendedState(App.MAXIMIZED_BOTH);
        } else {
            setExtendedState(App.NORMAL);
        }
    }//GEN-LAST:event_jLabelMaxMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        setExtendedState(App.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jButtonTraducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTraducirActionPerformed
        try {
            startLoading();
            if (jTextAreaTexto.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Ingrese algo de texto para traducir !!!");
                jLabelLoading.setIcon(null);
                return;
            }
            String text = jTextAreaTexto.getText().trim();
            String languageStart = String.valueOf(jComboBoxInicio.getSelectedItem());
            String languageEnd = String.valueOf(jComboBoxFinal.getSelectedItem());
            Optional<Remote> boxTraductor = clientRmi.getInstance("traductor");
            if (boxTraductor.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error Get Instance Server !!!");
                jLabelLoading.setIcon(null);
                return;
            }
            ITraductor iTraductor = (ITraductor) boxTraductor.get();
            String body = iTraductor.translate(languageStart, languageEnd, text);
            if (Objects.isNull(body)) {
                JOptionPane.showMessageDialog(null, "Error Request Instance Server !!!");
                jLabelLoading.setIcon(null);
                return;
            }
            Optional<TranslateDtoResponse> boxMapper = Mapper.toObject(body, new TypeReference<TranslateDtoResponse>() {
            });
            if (boxMapper.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error Mapper Instance !!!");
                jLabelLoading.setIcon(null);
                return;
            }
            TranslateDtoResponse translateDtoResponse = boxMapper.get();
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    cancelLoading();
                    jTextAreaTextoTraducido.setText(translateDtoResponse.getChoices().get(0).getText().trim());
                    timer.cancel();
                }
            }, 3000);
        } catch (RemoteException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonTraducirActionPerformed

    public void startLoading() {
        jLabelLoading.setIcon(new ImageIcon(getClass().getResource("/image/loading.gif")));
    }

    public void cancelLoading() {
        if (Objects.isNull(jLabelLoading.getIcon())) {
            return;
        }
        jLabelLoading.setIcon(null);
    }

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
            UIManager.put("Button.arc", 10);
        } catch (Exception ex) {
            System.err.println("FlatLaf failed load");
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                App app = new App();
                app.moveFrame();
                app.setVisible(true);
            }
        });
    }

    private int x, y;

    public void moveFrame() {
        header.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getY();
            }
        });
        header.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                setLocation(e.getXOnScreen() - x, e.getYOnScreen() - y);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.eduardo.app.client.component.PanelRounded background;
    private com.eduardo.app.client.component.PanelRounded header;
    private javax.swing.JButton jButtonTraducir;
    private javax.swing.JComboBox<String> jComboBoxFinal;
    private javax.swing.JComboBox<String> jComboBoxInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelFinal;
    private javax.swing.JLabel jLabelIngreseTexto;
    private javax.swing.JLabel jLabelInicio;
    private javax.swing.JLabel jLabelLoading;
    private javax.swing.JLabel jLabelMax;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelTextTraducido;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaTexto;
    private javax.swing.JTextArea jTextAreaTextoTraducido;
    private com.eduardo.app.client.component.PanelRounded panelRounded1;
    // End of variables declaration//GEN-END:variables
}
