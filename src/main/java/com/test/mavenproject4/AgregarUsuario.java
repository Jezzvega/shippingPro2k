/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.test.mavenproject4;

import static com.test.mavenproject4.AgregarVehiculo.JSON;
import java.io.IOException;
import javax.swing.JOptionPane;
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
public class AgregarUsuario extends javax.swing.JFrame {

    private final OkHttpClient client = new OkHttpClient();
    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    Usuario user;
    
    public AgregarUsuario() {
        initComponents();
    }
    
    public AgregarUsuario(Usuario user) {
        initComponents();
        this.user = user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        usuarioNombreTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        usuarioCorreoTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usuarioPassTxt = new javax.swing.JTextField();
        usuarioRolCBox = new javax.swing.JComboBox<>();
        guardarUsarioBtn = new javax.swing.JButton();
        errorLb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        jLabel1.setText("Agregar Usuario");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INFORMACION GENERAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N

        jLabel2.setText("Nombre:");

        usuarioNombreTxt.setToolTipText("");

        jLabel3.setText("Correo:");

        usuarioCorreoTxt.setToolTipText("");

        jLabel5.setText("Rol:");

        jLabel4.setText("Contraseña:");

        usuarioPassTxt.setToolTipText("");

        usuarioRolCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione un Rol>", "Administrador", "Almacen", "Recepcion" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usuarioPassTxt)
                    .addComponent(usuarioNombreTxt)
                    .addComponent(usuarioCorreoTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(usuarioRolCBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuarioNombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuarioCorreoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuarioPassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuarioRolCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        guardarUsarioBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        guardarUsarioBtn.setText("Guardar Usuario");
        guardarUsarioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarUsarioBtnActionPerformed(evt);
            }
        });

        errorLb.setForeground(new java.awt.Color(255, 0, 51));
        errorLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorLb.setText("    ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(errorLb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(guardarUsarioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(errorLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(guardarUsarioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void guardarUsarioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarUsarioBtnActionPerformed

        String nombre = usuarioNombreTxt.getText();
        String mail = usuarioCorreoTxt.getText();
        String pass = usuarioPassTxt.getText();
        
        if(nombre.isBlank()){
            errorLb.setText("Introduzca el Nombre del Usuario.");
            return;
        }
        
        if(mail.isBlank()){
            errorLb.setText("Introduzca el Correo del Usuario.");
            return;
        }
        
        if(pass.isBlank()){
            errorLb.setText("Introduzca la Cotraseña del Usuario.");
            return;
        }
        
        if(usuarioRolCBox.getSelectedIndex() == 0){
            errorLb.setText("Debe seleccionar un Rol");
            return;
        }
        
        String rol = usuarioRolCBox.getSelectedItem().toString();
        
        String json = "{\n" +
                        "    \"nombre\": \"" + nombre + "\",\n" +
                        "    \"correo\": \"" + mail + "\",\n" +
                        "    \"pass\": \""+ pass +"\",\n" +
                        "    \"role\": \""+ rol +"\"\n" +
                        "}";
        
        RequestBody body = RequestBody.create(JSON, json);
        
        Request request = new Request.Builder()
            .url("https://t-express-rest.herokuapp.com/auth/registro")
            .header("auth-token", user.getToken())
            .post(body)
            .build();
        
        client.newCall(request).enqueue(new Callback(){
            @Override
            public void onFailure(Call call, IOException ioe) {
                System.out.println(ioe.getMessage());
            }

            @Override
            public void onResponse(Call call, Response res) throws IOException {
                
                Object[] options = {"OK"};
                
                if(!res.isSuccessful()){
                    
                    JOptionPane.showOptionDialog(
                                null,
                                res.body().string(), 
                                "Ha ocurrido un problema",
                                JOptionPane.OK_OPTION,
                                JOptionPane.ERROR_MESSAGE,
                                null, options, options[0]
                            );
                    
                    return;
                }
                
                int dialogRes = JOptionPane.showOptionDialog(
                                null,
                                res.body().string(), 
                                "Usuario Agregado",
                                JOptionPane.OK_OPTION,
                                JOptionPane.INFORMATION_MESSAGE,
                                null, options, options[0]
                        );
                
                if(dialogRes == JOptionPane.OK_OPTION){
                    cerrarVentana();
                }
                
            }
            
        });

    }//GEN-LAST:event_guardarUsarioBtnActionPerformed

    private void cerrarVentana(){
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
            java.util.logging.Logger.getLogger(AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorLb;
    private javax.swing.JButton guardarUsarioBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField usuarioCorreoTxt;
    private javax.swing.JTextField usuarioNombreTxt;
    private javax.swing.JTextField usuarioPassTxt;
    private javax.swing.JComboBox<String> usuarioRolCBox;
    // End of variables declaration//GEN-END:variables
}
