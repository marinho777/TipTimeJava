
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mauitojavakk;

/**
 *
 * @author kali
 */
public class TipTime extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public TipTime() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipSlider = new javax.swing.JSlider();
        txtValor = new javax.swing.JLabel();
        inputValor = new javax.swing.JTextField();
        inputGorjeta = new javax.swing.JTextField();
        txtGorjeta = new javax.swing.JLabel();
        txtValor1 = new javax.swing.JLabel();
        fieldTotal = new javax.swing.JTextField();
        btn30p = new javax.swing.JButton();
        btn15p = new javax.swing.JButton();
        txtTitulo = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fieldGorjeta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(242, 252, 231));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tipSlider.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        tipSlider.setAutoscrolls(true);
        tipSlider.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tipSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tipSliderStateChanged(evt);
            }
        });

        txtValor.setFont(new java.awt.Font("Cantarell", 0, 36)); // NOI18N
        txtValor.setText("Valor");

        inputValor.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        inputValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputValorActionPerformed(evt);
            }
        });

        inputGorjeta.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        inputGorjeta.setBorder(null);
        inputGorjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputGorjetaActionPerformed(evt);
            }
        });

        txtGorjeta.setFont(new java.awt.Font("Cantarell", 0, 36)); // NOI18N
        txtGorjeta.setText("Gorjeta");

        txtValor1.setFont(new java.awt.Font("Cantarell", 0, 36)); // NOI18N
        txtValor1.setText("Total");

        fieldTotal.setEditable(false);
        fieldTotal.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        fieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTotalActionPerformed(evt);
            }
        });

        btn30p.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        btn30p.setText("30%");
        btn30p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn30pActionPerformed(evt);
            }
        });

        btn15p.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        btn15p.setText("15%");
        btn15p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15pActionPerformed(evt);
            }
        });

        txtTitulo.setFont(new java.awt.Font("Lato", 0, 55)); // NOI18N
        txtTitulo.setText("TipTime");

        btnCalcular.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        jLabel1.setText("% de Gorjeta");

        fieldGorjeta.setEditable(false);
        fieldGorjeta.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        fieldGorjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldGorjetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(btn15p, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn30p, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(txtValor)
                        .addGap(35, 35, 35)
                        .addComponent(inputValor, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtValor1)
                        .addGap(35, 35, 35)
                        .addComponent(fieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtGorjeta)
                                .addGap(18, 18, 18)
                                .addComponent(inputGorjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fieldGorjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 262, Short.MAX_VALUE)
                                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tipSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(113, 113, 113))
            .addGroup(layout.createSequentialGroup()
                .addGap(423, 423, 423)
                .addComponent(txtTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor)
                    .addComponent(inputValor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor1)
                    .addComponent(fieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(tipSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGorjeta)
                            .addComponent(inputGorjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldGorjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn15p, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn30p, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputValorActionPerformed

    private void inputGorjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputGorjetaActionPerformed
        
    }//GEN-LAST:event_inputGorjetaActionPerformed

    private void fieldTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldTotalActionPerformed

    private void btn15pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15pActionPerformed
        tipSlider.setValue(15);
        
    }//GEN-LAST:event_btn15pActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        String valortemp = inputValor.getText();
        String gorjetatemp = inputGorjeta.getText();
        int total = 0;
        if(gorjetatemp == ""){
            if(fieldGorjeta.getText() != ""){
                int valor = Integer.parseInt(valortemp);
                String fieldtemp = fieldGorjeta.getText();
                int gorjeta = Integer.parseInt(fieldtemp);
                total = valor + gorjeta;
            }
        }else{
            int valor = Integer.parseInt(valortemp);
            int gorjeta = Integer.parseInt(gorjetatemp);
            total = valor + gorjeta;
        }
        
        String temp = String.valueOf(total);
        fieldTotal.setText(temp);
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void fieldGorjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldGorjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldGorjetaActionPerformed

    private void tipSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tipSliderStateChanged
        int sliderValue = tipSlider.getValue();
        String strValue = inputValor.getText();
        int valorValue = Integer.parseInt(strValue);
        int resultado = (valorValue * sliderValue) / 100;
        String fieldFinal = String.valueOf(resultado);
        String fieldPercent = String.valueOf(sliderValue);
        fieldGorjeta.setText(fieldPercent);
        inputGorjeta.setText(fieldFinal);
    }//GEN-LAST:event_tipSliderStateChanged

    private void btn30pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn30pActionPerformed
        tipSlider.setValue(30);
    }//GEN-LAST:event_btn30pActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       //UIManager.setLookAndFeel(new FlatIntelliJLaf)
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TipTime().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn15p;
    private javax.swing.JButton btn30p;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JTextField fieldGorjeta;
    private javax.swing.JTextField fieldTotal;
    private javax.swing.JTextField inputGorjeta;
    private javax.swing.JTextField inputValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSlider tipSlider;
    private javax.swing.JLabel txtGorjeta;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JLabel txtValor;
    private javax.swing.JLabel txtValor1;
    // End of variables declaration//GEN-END:variables
}
