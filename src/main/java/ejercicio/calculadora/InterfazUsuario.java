package ejercicio.calculadora;

import javax.swing.JTextField;

public class InterfazUsuario extends javax.swing.JFrame {

    private JTextField display;
    private Calculadora calculadora;
    private float primerNumero;
    private String operador;

    public InterfazUsuario() {
        this.setUndecorated(true);
        initComponents();
        calculadora = new Calculadora();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtDatos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnUno = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnClearEntry = new javax.swing.JButton();
        btnPorciento = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnMultipilicacion = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnCero = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDatos.setBackground(new java.awt.Color(0, 0, 0));
        txtDatos.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtDatos.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 470, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CASIO FX-34R");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 140, 30));

        btnUno.setBackground(new java.awt.Color(204, 204, 204));
        btnUno.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnUno.setForeground(new java.awt.Color(0, 0, 0));
        btnUno.setText("1");
        btnUno.setFocusable(false);
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });
        jPanel2.add(btnUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 90, 60));

        btnBorrar.setBackground(new java.awt.Color(204, 204, 204));
        btnBorrar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(0, 0, 0));
        btnBorrar.setText("<-");
        btnBorrar.setFocusable(false);
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 90, 60));

        btnClear.setBackground(new java.awt.Color(255, 153, 51));
        btnClear.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnClear.setForeground(new java.awt.Color(0, 0, 0));
        btnClear.setText("C");
        btnClear.setFocusable(false);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel2.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 90, 60));

        btnClearEntry.setBackground(new java.awt.Color(255, 153, 51));
        btnClearEntry.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnClearEntry.setForeground(new java.awt.Color(0, 0, 0));
        btnClearEntry.setText("CE");
        btnClearEntry.setFocusable(false);
        btnClearEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearEntryActionPerformed(evt);
            }
        });
        jPanel2.add(btnClearEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 90, 60));

        btnPorciento.setBackground(new java.awt.Color(204, 204, 204));
        btnPorciento.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnPorciento.setForeground(new java.awt.Color(0, 0, 0));
        btnPorciento.setText("%");
        btnPorciento.setFocusable(false);
        jPanel2.add(btnPorciento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 90, 60));

        btnDivision.setBackground(new java.awt.Color(204, 204, 204));
        btnDivision.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnDivision.setForeground(new java.awt.Color(0, 0, 0));
        btnDivision.setText("÷");
        btnDivision.setFocusable(false);
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });
        jPanel2.add(btnDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 90, 60));

        btnMultipilicacion.setBackground(new java.awt.Color(204, 204, 204));
        btnMultipilicacion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnMultipilicacion.setForeground(new java.awt.Color(0, 0, 0));
        btnMultipilicacion.setText("*");
        btnMultipilicacion.setFocusable(false);
        btnMultipilicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultipilicacionActionPerformed(evt);
            }
        });
        jPanel2.add(btnMultipilicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 90, 60));

        jButton15.setBackground(new java.awt.Color(204, 204, 204));
        jButton15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton15.setForeground(new java.awt.Color(0, 0, 0));
        jButton15.setText("9");
        jButton15.setFocusable(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 90, 60));

        btnNueve.setBackground(new java.awt.Color(204, 204, 204));
        btnNueve.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnNueve.setForeground(new java.awt.Color(0, 0, 0));
        btnNueve.setText("8");
        btnNueve.setFocusable(false);
        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });
        jPanel2.add(btnNueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 90, 60));

        btnSiete.setBackground(new java.awt.Color(204, 204, 204));
        btnSiete.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSiete.setForeground(new java.awt.Color(0, 0, 0));
        btnSiete.setText("7");
        btnSiete.setFocusable(false);
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });
        jPanel2.add(btnSiete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 90, 60));

        btnCuatro.setBackground(new java.awt.Color(204, 204, 204));
        btnCuatro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCuatro.setForeground(new java.awt.Color(0, 0, 0));
        btnCuatro.setText("4");
        btnCuatro.setFocusable(false);
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });
        jPanel2.add(btnCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 90, 60));

        btnCinco.setBackground(new java.awt.Color(204, 204, 204));
        btnCinco.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCinco.setForeground(new java.awt.Color(0, 0, 0));
        btnCinco.setText("5");
        btnCinco.setFocusable(false);
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });
        jPanel2.add(btnCinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 90, 60));

        btnSeis.setBackground(new java.awt.Color(204, 204, 204));
        btnSeis.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSeis.setForeground(new java.awt.Color(0, 0, 0));
        btnSeis.setText("6");
        btnSeis.setFocusable(false);
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });
        jPanel2.add(btnSeis, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 90, 60));

        btnResta.setBackground(new java.awt.Color(204, 204, 204));
        btnResta.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnResta.setForeground(new java.awt.Color(0, 0, 0));
        btnResta.setText("-");
        btnResta.setFocusable(false);
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });
        jPanel2.add(btnResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 90, 60));

        btnTres.setBackground(new java.awt.Color(204, 204, 204));
        btnTres.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnTres.setForeground(new java.awt.Color(0, 0, 0));
        btnTres.setText("3");
        btnTres.setFocusable(false);
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });
        jPanel2.add(btnTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 90, 60));

        btnDos.setBackground(new java.awt.Color(204, 204, 204));
        btnDos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnDos.setForeground(new java.awt.Color(0, 0, 0));
        btnDos.setText("2");
        btnDos.setFocusable(false);
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });
        jPanel2.add(btnDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 90, 60));

        btnSuma.setBackground(new java.awt.Color(204, 204, 204));
        btnSuma.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSuma.setForeground(new java.awt.Color(0, 0, 0));
        btnSuma.setText("+");
        btnSuma.setFocusable(false);
        btnSuma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSumaMouseClicked(evt);
            }
        });
        jPanel2.add(btnSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 90, 60));

        btnIgual.setBackground(new java.awt.Color(51, 153, 255));
        btnIgual.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnIgual.setForeground(new java.awt.Color(0, 0, 0));
        btnIgual.setText("=");
        btnIgual.setFocusable(false);
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        jPanel2.add(btnIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 90, 60));

        btnPunto.setBackground(new java.awt.Color(204, 204, 204));
        btnPunto.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnPunto.setForeground(new java.awt.Color(0, 0, 0));
        btnPunto.setText(".");
        btnPunto.setFocusable(false);
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });
        jPanel2.add(btnPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 90, 60));

        btnCero.setBackground(new java.awt.Color(204, 204, 204));
        btnCero.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnCero.setForeground(new java.awt.Color(0, 0, 0));
        btnCero.setText("0");
        btnCero.setFocusable(false);
        btnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeroActionPerformed(evt);
            }
        });
        jPanel2.add(btnCero, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 90, 60));

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        float segundoNumero = Float.parseFloat(txtDatos.getText());
        float resultado = 0;
        switch (operador) {
            case "+":
                resultado = calculadora.sumar(primerNumero, segundoNumero);
                break;
            case "-":
                resultado = calculadora.restar(primerNumero, segundoNumero);
                break;
            case "*":
                resultado = calculadora.multiplicar(primerNumero, segundoNumero);
                break;
            case "÷":
                resultado = calculadora.dividir(primerNumero, segundoNumero);
                break;
        }
        txtDatos.setText(String.valueOf(resultado));
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnSumaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSumaMouseClicked
        primerNumero = Float.parseFloat(txtDatos.getText());
        operador = "+";
        txtDatos.setText("");
    }//GEN-LAST:event_btnSumaMouseClicked

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        primerNumero = Float.parseFloat(txtDatos.getText());
        operador = "-";
        txtDatos.setText("");
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnMultipilicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultipilicacionActionPerformed
        primerNumero = Float.parseFloat(txtDatos.getText());
        operador = "*";
        txtDatos.setText("");
    }//GEN-LAST:event_btnMultipilicacionActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        primerNumero = Float.parseFloat(txtDatos.getText());
        operador = "÷";
        txtDatos.setText("");
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeroActionPerformed
        txtDatos.setText(txtDatos.getText() + "0");
    }//GEN-LAST:event_btnCeroActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        txtDatos.setText(txtDatos.getText() + ".");
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
        txtDatos.setText(txtDatos.getText() + "1");
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
        txtDatos.setText(txtDatos.getText() + "2");
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        txtDatos.setText(txtDatos.getText() + "3");
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
        txtDatos.setText(txtDatos.getText() + "4");
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        txtDatos.setText(txtDatos.getText() + "5");
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        txtDatos.setText(txtDatos.getText() + "6");
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
        txtDatos.setText(txtDatos.getText() + "7");
    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed
        txtDatos.setText(txtDatos.getText() + "8");
    }//GEN-LAST:event_btnNueveActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        txtDatos.setText(txtDatos.getText() + "9");
    }//GEN-LAST:event_jButton15ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtDatos.setText("");
        primerNumero = 0;
        operador = "";
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnClearEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearEntryActionPerformed
        txtDatos.setText("");
    }//GEN-LAST:event_btnClearEntryActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        String currentText = txtDatos.getText();
        if (currentText.length() > 0) {
            // Elimina el último carácter del texto actual
            currentText = currentText.substring(0, currentText.length() - 1);
            txtDatos.setText(currentText);
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazUsuario().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearEntry;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMultipilicacion;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnPorciento;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnSuma;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton15;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtDatos;
    // End of variables declaration//GEN-END:variables
}
