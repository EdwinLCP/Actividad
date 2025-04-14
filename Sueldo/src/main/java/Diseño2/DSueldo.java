package Diseño2;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.DefaultListCellRenderer;

public class DSueldo extends javax.swing.JFrame {
    
    private DefaultListCellRenderer listRenderer;
    private double tarifaHoraria, sueldoBasico, bonificacion, sueldoBruto, descuento, sueldoNeto;
    private int horasTrabajadas, numHijos, categoria;

    public DSueldo() {
        initComponents();
        formulario();
        inicializarElementos();
    }
    
    private void formulario(){
        this.setTitle("Cálculo del Sueldo");
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        this.getContentPane().setBackground( new Color(255,255,255));
        this.panelCalcular.setBackground( new Color(255,255,255));
        this.panelDatos.setBackground( new Color(255,255,255));
        this.setSize(new Dimension (430, 260));        
    }
     
     
    private void inicializarElementos(){
        listRenderer = new DefaultListCellRenderer();

        listRenderer.setHorizontalAlignment(DefaultListCellRenderer.CENTER);
        cboCategoria.setRenderer(listRenderer);
        this.cboCategoria.addItem("Seleccione");
        this.cboCategoria.addItem("A");
        this.cboCategoria.addItem("B");          
        this.cboCategoria.requestFocus();
    }
    
    void ingresarDatos(){
        categoria = cboCategoria.getSelectedIndex();
        horasTrabajadas = Integer.parseInt(txtHoras.getText());
        numHijos = Integer.parseInt(txtHijos.getText());
    
    }
   
    
    
    // Calcula la pensión actual
    void calcularTarifaHoraria() {
        switch (categoria) {
        case 1:
            tarifaHoraria = 45.0;
            break;
        case 2:
            tarifaHoraria = 37.5;
            break;
        }
    }
    

    void calcularSueldoBasico(){
        sueldoBasico = horasTrabajadas * tarifaHoraria;    
    }
    
    void calcularBonificacion(){
        if (numHijos <= 3) {
            bonificacion = numHijos * 40.5;
        } else {
            bonificacion = numHijos * 35.0;
        }    
    }
    
    void calcularSueldoBruto(){
        sueldoBruto = sueldoBasico + bonificacion;    
    }
    
    void calcularDescuento(){
        if (sueldoBruto >= 3500) {
            descuento = sueldoBruto * 0.135;            
        } else{
            descuento = sueldoBruto * 0.10;
        }
        // Redondear a 2 decimales
    descuento = Math.round(descuento * 100.0) / 100.0;
    }
    
    
    void calcularSueldoNeto(){
        sueldoNeto = sueldoBruto - descuento;
    }
    
    
    void mostrarResultados(){
        txtSalida.setText("");
        imprimir(" Sueldo Básico: S/." + sueldoBasico);
        imprimir(" Bonificacion: S/." + bonificacion);
        imprimir(" Sueldo Bruto: S/." + sueldoBruto);
        imprimir(" Descuento: S/." + descuento);
        imprimir(" Sueldo Neto: S/." + sueldoNeto);        
    }
    
    
    void imprimir(String cad){
        txtSalida.append(cad + "\n");
    }

    
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCalcular = new javax.swing.JPanel();
        btnProcesar = new javax.swing.JButton();
        bntNuevo = new javax.swing.JButton();
        btnSalida = new javax.swing.JButton();
        panelDatos = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        cboCategoria = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        txtHoras = new javax.swing.JTextField();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        txtHijos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnProcesar.setBackground(new java.awt.Color(0, 0, 255));
        btnProcesar.setForeground(new java.awt.Color(255, 255, 255));
        btnProcesar.setMnemonic('P');
        btnProcesar.setText("Procesar");
        btnProcesar.setToolTipText("Procesesa los detalles de tu sueldo");
        btnProcesar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        bntNuevo.setBackground(new java.awt.Color(0, 0, 255));
        bntNuevo.setForeground(new java.awt.Color(255, 255, 255));
        bntNuevo.setMnemonic('N');
        bntNuevo.setText("Nuevo");
        bntNuevo.setToolTipText("Procesa un nuevo sueldo");
        bntNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        bntNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNuevoActionPerformed(evt);
            }
        });

        btnSalida.setBackground(new java.awt.Color(255, 0, 51));
        btnSalida.setForeground(new java.awt.Color(255, 255, 255));
        btnSalida.setMnemonic('S');
        btnSalida.setText("Salir");
        btnSalida.setToolTipText("Salir del programa");
        btnSalida.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        btnSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCalcularLayout = new javax.swing.GroupLayout(panelCalcular);
        panelCalcular.setLayout(panelCalcularLayout);
        panelCalcularLayout.setHorizontalGroup(
            panelCalcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCalcularLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelCalcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnProcesar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bntNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panelCalcularLayout.setVerticalGroup(
            panelCalcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCalcularLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(btnProcesar)
                .addGap(18, 18, 18)
                .addComponent(bntNuevo)
                .addGap(53, 53, 53)
                .addComponent(btnSalida)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel21.setForeground(new java.awt.Color(51, 51, 255));
        jLabel21.setText("Categoría:");

        cboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCategoriaActionPerformed(evt);
            }
        });

        jLabel22.setForeground(new java.awt.Color(51, 51, 255));
        jLabel22.setText("Horas Trabajadas:");

        txtHoras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHorasKeyTyped(evt);
            }
        });

        txtSalida.setColumns(20);
        txtSalida.setRows(5);
        jScrollPane11.setViewportView(txtSalida);

        jLabel23.setForeground(new java.awt.Color(51, 51, 255));
        jLabel23.setText("Número de hijos:");

        txtHijos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHijosKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHoras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHijos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(jScrollPane11)
                        .addContainerGap())))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtHijos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCalcular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        // TODO add your handling code here:
        ingresarDatos();
        calcularTarifaHoraria();
        calcularSueldoBasico();
        calcularBonificacion();
        calcularSueldoBruto();
        calcularDescuento();
        calcularSueldoNeto();
        mostrarResultados();

    }//GEN-LAST:event_btnProcesarActionPerformed

    private void bntNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNuevoActionPerformed
        // TODO add your handling code here:
        this.txtHoras.setText("");
        this.txtSalida.setText("");
        this.txtHijos.setText("");
        this.cboCategoria.setSelectedIndex(0);
        this.cboCategoria.requestFocus();
    }//GEN-LAST:event_bntNuevoActionPerformed

    private void btnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalidaActionPerformed

    private void cboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCategoriaActionPerformed

    private void txtHorasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHorasKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = key >= 48.00 && key <= 57.00;
        if(!numeros){
            evt.consume();
        }
    }//GEN-LAST:event_txtHorasKeyTyped

    private void txtHijosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHijosKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = key >= 48.00 && key <= 57.00;
        if(!numeros){
            evt.consume();
        }
    }//GEN-LAST:event_txtHijosKeyTyped

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
            java.util.logging.Logger.getLogger(DSueldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DSueldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DSueldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DSueldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DSueldo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntNuevo;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JButton btnSalida;
    private javax.swing.JComboBox<String> cboCategoria;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JPanel panelCalcular;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JTextField txtHijos;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextArea txtSalida;
    // End of variables declaration//GEN-END:variables
}
