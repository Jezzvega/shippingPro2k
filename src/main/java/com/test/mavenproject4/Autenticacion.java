/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.test.mavenproject4;

import com.google.gson.Gson;
import static com.test.mavenproject4.AuthHttpClient.JSON;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 *
 * @author jezzvega
 */
public class Autenticacion extends javax.swing.JFrame {

    private final OkHttpClient client = new OkHttpClient();
    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    public static Usuario usuario;

    public Autenticacion() {
        initComponents();
        URL iconURL = getClass().getResource("/ShippingPro2kiconr.png");
            // iconURL is null when not found
    ImageIcon icon = new ImageIcon(iconURL);
    this.setIconImage(icon.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        errorTxt = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mailTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        passTxt = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        accederBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pBar = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de Sesión-Shipping Pro 2k");
        setBackground(Color.WHITE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setName(""); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        errorTxt.setForeground(new java.awt.Color(255, 0, 0));
        errorTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorTxt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(errorTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 283, 230, 30));

        jLabel6.setText("Desarrollado por STFU - Copyright  © 2021, T-Express. All rights reserved ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, -1));
        getContentPane().add(mailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 265, -1));

        jLabel2.setText("Correo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, -1, -1));

        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, -1, -1));

        passTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passTxtKeyReleased(evt);
            }
        });
        getContentPane().add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 265, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 31, 280, 110));

        accederBtn.setText("Acceder");
        accederBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accederBtnActionPerformed(evt);
            }
        });
        jPanel1.add(accederBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 325, 144, 38));

        jLabel7.setText("Versión 1.0 (64 Bits)");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 11, -1, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Iniciar Sesión");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 147, -1, -1));
        jPanel1.add(pBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 350, -1));
        pBar.setIndeterminate(true);
        pBar.setVisible(false);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 440, 400));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ShippingPro2kcorta.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 400));

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void accederBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accederBtnActionPerformed

        try {

            login(mailTxt.getText(), passTxt.getText());

        } catch (Exception ex) {
            Logger.getLogger(Autenticacion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_accederBtnActionPerformed

    private void passTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passTxtKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {

                login(mailTxt.getText(), passTxt.getText());

            } catch (Exception ex) {
                Logger.getLogger(Autenticacion.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_passTxtKeyReleased

    public void login(String mail, String pass) throws Exception {

        errorTxt.setText(null);

        jPanel1.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        accederBtn.setEnabled(false);
        pBar.setVisible(true);

        String json = "{\"correo\": \"" + mail + "\",\"pass\": \"" + pass + "\"}";

        RequestBody body = RequestBody.create(JSON, json);

        Request request = new Request.Builder()
                .url("https://t-express-rest.herokuapp.com/auth/login")
                .post(body)
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException ioe) {
            }

            @Override
            public void onResponse(Call call, Response res) throws IOException {

                if (!res.isSuccessful()) {
                    errorTxt.setText(res.body().string());
                    accederBtn.setEnabled(true);
                    pBar.setVisible(false);
                    jPanel1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                    return;
                }

                usuario = new Gson().fromJson(res.body().string(), Usuario.class);

                switch (usuario.getRole()) {
                    case "Recepcion" -> {
                        Recepcion rec = new Recepcion(usuario);
                        rec.setVisible(true);
                    }

                    case "Administrador" -> {
                        VistaAdministrador adminView = new VistaAdministrador(usuario);
                        adminView.setVisible(true);
                    }

                    case "Almacen" -> {
                        Asignacion asignacion = new Asignacion(usuario);
                        asignacion.setVisible(true);
                    }
                }

                cerrarVentana();
            }

        });

    }

    private void cerrarVentana() {
        this.dispose();
    }

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
            java.util.logging.Logger.getLogger(Autenticacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Autenticacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Autenticacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Autenticacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Autenticacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accederBtn;
    private javax.swing.JLabel errorTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField mailTxt;
    private javax.swing.JProgressBar pBar;
    private javax.swing.JPasswordField passTxt;
    // End of variables declaration//GEN-END:variables
}
