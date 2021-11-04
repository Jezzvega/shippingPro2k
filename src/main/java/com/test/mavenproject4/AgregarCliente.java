/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.test.mavenproject4;

import com.teamdev.jxbrowser.browser.Browser;
import com.teamdev.jxbrowser.dom.InputElement;
import com.teamdev.jxbrowser.dom.event.EventType;
import com.teamdev.jxbrowser.engine.Engine;
import com.teamdev.jxbrowser.engine.EngineOptions;
import com.teamdev.jxbrowser.engine.Language;
import com.teamdev.jxbrowser.engine.RenderingMode;
import com.teamdev.jxbrowser.navigation.event.LoadFinished;
import com.teamdev.jxbrowser.view.swing.BrowserView;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
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
public class AgregarCliente extends javax.swing.JFrame {

    private final OkHttpClient client = new OkHttpClient();
    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    
    Engine engine;
    Browser browser;
    Double lat = 0.00, lng = 0.00;
    Usuario user;
    
    /**
     * Creates new form AgregarCliente
     */
    public AgregarCliente() {
        initComponents();
    }
    
    public AgregarCliente(Usuario user) {
        this.user = user;
        initComponents();
        loadMap();
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
        clientIdTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        clientNombreTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        clientTelTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        clientDetaTxt = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        clientUbicProvCmb = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        clientUbicDescTxt = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        latLngTxt = new javax.swing.JLabel();
        mapFrame = new javax.swing.JPanel();
        guardarClienteBtn = new javax.swing.JButton();
        errLb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        jLabel1.setText("Agregar Cliente");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INFORMACION GENERAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N

        jLabel2.setText("Cédula / RUC:");

        clientIdTxt.setToolTipText("");

        jLabel3.setText("Nombre:");

        clientNombreTxt.setToolTipText("");

        jLabel4.setText("Teléfono:");

        clientTelTxt.setToolTipText("");

        jLabel5.setText("Detalles del Negocio:");

        clientDetaTxt.setColumns(20);
        clientDetaTxt.setLineWrap(true);
        clientDetaTxt.setRows(5);
        jScrollPane1.setViewportView(clientDetaTxt);

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
                    .addComponent(clientTelTxt)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clientIdTxt)
                    .addComponent(clientNombreTxt, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientNombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientTelTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "UBICACIÓN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N

        jLabel6.setText("Provincia:");

        clientUbicProvCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Elija una Provincia>", "Bocas del Toro", "Chiriquí", "Coclé", "Colón", "Darién", "Herrera", "Los Santos", "Panamá", "Panamá Oeste", "Veraguas" }));

        jLabel7.setText("Descripción:");
        jLabel7.setToolTipText("");

        clientUbicDescTxt.setColumns(20);
        clientUbicDescTxt.setLineWrap(true);
        clientUbicDescTxt.setRows(5);
        jScrollPane2.setViewportView(clientUbicDescTxt);

        jLabel8.setText("Coordenadas:");

        latLngTxt.setText("Lat: 0, Long: 0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(clientUbicProvCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(12, 12, 12)
                        .addComponent(latLngTxt)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(clientUbicProvCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(latLngTxt))
                .addContainerGap())
        );

        mapFrame.setLayout(new java.awt.BorderLayout());

        guardarClienteBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        guardarClienteBtn.setText("Guardar");
        guardarClienteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarClienteBtnActionPerformed(evt);
            }
        });

        errLb.setForeground(new java.awt.Color(255, 0, 51));
        errLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errLb.setText("    ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(guardarClienteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(errLb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mapFrame, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(errLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guardarClienteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(mapFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        engine.close();
    }//GEN-LAST:event_formWindowClosed

    private void guardarClienteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarClienteBtnActionPerformed
        
        String id = clientIdTxt.getText();
        String nomb = clientNombreTxt.getText();
        String tel = clientTelTxt.getText();
        String deta = clientDetaTxt.getText();
        String ubic_desc = clientUbicDescTxt.getText();
        
        errLb.setText(" ");
        
        if(id.isBlank()){
            errLb.setText("Introduzca la Cédula/RUC.");
            return;
        }
        
        if(nomb.isBlank()){
            errLb.setText("Introduzca el Nombre.");
            return;
        }
        
        if(tel.isBlank()){
            errLb.setText("Introduzca el Teléfono.");
            return;
        }
        
        if(deta.length() > 120){
            errLb.setText("Detalles solo permite 120 carácteres.");
            return;
        }
        
        if(clientUbicProvCmb.getSelectedIndex() == 0){
            errLb.setText("Seleccione una Provincia.");
            return;
        }
        
        if(ubic_desc.isBlank()){
            errLb.setText("Introduzca la descripcion de la Ubicación.");
            return;
        }
        
        if(lat == 0.00 && lng == 0.00){
            errLb.setText("Seleccione una Ubicación en el Mapa.");
            return;
        }
        
        guardarClienteBtn.setEnabled(false);
        
        String ubic_prov = clientUbicProvCmb.getSelectedItem().toString();
        
        String json = "{\n" +
                        "    \"id\": \"" + id + "\",\n" +
                        "    \"nomb\": \"" + nomb + "\",\n" +
                        "    \"tel\": \"" + tel + "\",\n" +
                        "    \"det\": \"" + deta + "\",\n" +
                        "    \"ubic_prov\": \"" + ubic_prov + "\",\n" +
                        "    \"ubic_desc\": \"" + ubic_desc + "\",\n" +
                        "    \"ubic_lat\": " + lat + ",\n" +
                        "    \"ubic_lng\": " + lng + "\n" +
                        "}";
        
        RequestBody body = RequestBody.create(JSON, json);
        
        Request request = new Request.Builder()
            .url("https://t-express-rest.herokuapp.com/clientes/agregar")
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
                    
                    guardarClienteBtn.setEnabled(true);
                    return;
                }
                
                guardarClienteBtn.setEnabled(true);
                
                int dialogRes = JOptionPane.showOptionDialog(
                                null,
                                "El cliente ha sido agregado correctamente!", 
                                "Cliente Agregado",
                                JOptionPane.OK_OPTION,
                                JOptionPane.INFORMATION_MESSAGE,
                                null, options, options[0]
                        );
                
                if(dialogRes == JOptionPane.OK_OPTION){
                    cerrarVentana();
                }
                
            }
            
        });
        
    }//GEN-LAST:event_guardarClienteBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarCliente().setVisible(true);
            }
        });
    }
    
    private void loadMap(){

        // Initialize Chromium.
        engine = Engine.newInstance(
                EngineOptions.newBuilder(RenderingMode.HARDWARE_ACCELERATED)
                    .licenseKey("1BNDHFSC1G0RULMEA2WZAIDA2YDJNHC3HPQZXB7C7OA1YO0RURCAFTRTMMOOSEBR2VXFLL")
                    .language(Language.SPANISH_LATIN_AMERICA)
                    .disableTouchMenu()
                    .build()
        );

        // Create a Browser instance.
        browser = engine.newBrowser();
        
        browser.settings().hideScrollbars();
        
        BrowserView view = BrowserView.newInstance(browser);
        
        mapFrame.add(view);
        // Load the required web page.
        
        browser.navigation().loadUrl(getClass().getResource("/index.html").getPath().replaceFirst("^/", ""));
        
        browser.navigation().on(LoadFinished.class, event -> {
        
            browser.mainFrame().ifPresent(frame -> {
                frame.document().ifPresent(document -> {
                    document.documentElement().ifPresent(DocElement -> {

                        DocElement.addEventListener(EventType.MOUSE_UP, e -> {

                            DocElement.findElementById("lat").ifPresent(element -> 
                                lat = Double.parseDouble(((InputElement) element).value())
                            );

                            DocElement.findElementById("lng").ifPresent(element -> 
                                lng = Double.parseDouble(((InputElement) element).value())
                            );

                            latLngTxt.setText(String.format("Lat: %f, Long: %f", lat,lng));

                        }, false);

                    });
                });
            });
        
        });
    }
    
    public void cerrarVentana(){
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea clientDetaTxt;
    private javax.swing.JTextField clientIdTxt;
    private javax.swing.JTextField clientNombreTxt;
    private javax.swing.JTextField clientTelTxt;
    private javax.swing.JTextArea clientUbicDescTxt;
    private javax.swing.JComboBox<String> clientUbicProvCmb;
    private javax.swing.JLabel errLb;
    private javax.swing.JButton guardarClienteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel latLngTxt;
    private javax.swing.JPanel mapFrame;
    // End of variables declaration//GEN-END:variables
}
