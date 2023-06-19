
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
public class juego extends javax.swing.JFrame {

    Jugada juego = new Jugada();
        
       

    public juego() {
        initComponents();
        this.setLocationRelativeTo(null);
     
        
        // PONEMOS LAS IMAGENES POR DEFECTO
        ImageIcon jugador = new ImageIcon(getClass().getResource("jugador.png"));
        JLfotoJugador.setIcon(jugador);
        ImageIcon computadora = new ImageIcon(getClass().getResource("computadora.png"));
        JLfotoComputadora.setIcon(computadora);
        this.getContentPane().setBackground(Color.pink);
        PanelFondo.setBackground(Color.white);
        jPanel1.setBackground(Color.white);
        jPanel2.setBackground(Color.white);
        BtnJugar.setBackground(Color.pink);
        BtnJugar.setBackground(Color.pink);
        BtnSalir.setBackground(Color.pink);
  
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        PanelFondo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        RBPiedra = new javax.swing.JRadioButton();
        RBPapel = new javax.swing.JRadioButton();
        RBTijera = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JLjugador1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JLjugador2 = new javax.swing.JLabel();
        BtnJugar = new javax.swing.JButton();
        JLfotoJugador = new javax.swing.JLabel();
        JLfotoComputadora = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setUndecorated(true);

        PanelFondo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 204, 204))); // NOI18N

        buttonGroup1.add(RBPiedra);
        RBPiedra.setText("Piedra");

        buttonGroup1.add(RBPapel);
        RBPapel.setText("Papel");

        buttonGroup1.add(RBTijera);
        RBTijera.setText("Tijera");
        RBTijera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBTijeraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RBPiedra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RBPapel)
                .addGap(12, 12, 12)
                .addComponent(RBTijera)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBPapel)
                    .addComponent(RBTijera)
                    .addComponent(RBPiedra))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Marcador", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 204, 204))); // NOI18N

        jLabel1.setText("Jugador 1:");

        JLjugador1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Jugador 2:");

        JLjugador2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLjugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLjugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(JLjugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLjugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        BtnJugar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnJugar.setText("Jugar");
        BtnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnJugarActionPerformed(evt);
            }
        });

        BtnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelFondoLayout = new javax.swing.GroupLayout(PanelFondo);
        PanelFondo.setLayout(PanelFondoLayout);
        PanelFondoLayout.setHorizontalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnJugar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondoLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(JLfotoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLfotoComputadora, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        PanelFondoLayout.setVerticalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelFondoLayout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelFondoLayout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(BtnJugar)))
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLfotoComputadora, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLfotoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(BtnSalir)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnJugarActionPerformed
        if (RBPiedra.isSelected()) {

            //ASIGNAMOS IMAGEN DE PIEDRA EN EL LABEL
            ImageIcon piedraJugador = new ImageIcon(getClass().getResource("piedra.png"));
            JLfotoJugador.setIcon(piedraJugador);

            int jugadaMaquina = juego.jugadaMaquina(); // 0 1 2

            switch (jugadaMaquina) {
                case 0:
                    ImageIcon piedraComputadora = new ImageIcon(getClass().getResource("piedra.png"));
                    JLfotoComputadora.setIcon(piedraComputadora);

                    JOptionPane.showMessageDialog(null, juego.jugadas(0, jugadaMaquina));

                    break;
                case 1:
                    ImageIcon papelComputadora = new ImageIcon(getClass().getResource("papel.png"));
                    JLfotoComputadora.setIcon(papelComputadora);

                    JOptionPane.showMessageDialog(null, juego.jugadas(0, jugadaMaquina));

                    // aca le suma al acumulador de la maquina 1
                    juego.setContMaquina();

                    // le ponemos al marcador el resultado de la maquina
                    JLjugador2.setText(String.valueOf(juego.getContMaquina()));

                    break;

                case 2:
                    ImageIcon tijeraComputadora = new ImageIcon(getClass().getResource("tijera.png"));
                    JLfotoComputadora.setIcon(tijeraComputadora);

                    JOptionPane.showMessageDialog(null, juego.jugadas(0, jugadaMaquina));

                    // aca le suma al acumulador del jugador 1
                    juego.setContJugador();

                    // le ponemos al marcador el resultado del jugador
                    JLjugador1.setText(String.valueOf(juego.getContJugador()));

                    break;

            }

        }

        if (RBPapel.isSelected()) {
            //ASIGNAMOS IMAGEN DE PAPEL EN EL LABEL
            ImageIcon papelJugador = new ImageIcon(getClass().getResource("papel.png"));
            JLfotoJugador.setIcon(papelJugador);

            int jugadaMaquina = juego.jugadaMaquina(); // 0 1 2

            switch (jugadaMaquina) {
                case 0:
                    ImageIcon piedraComputadora = new ImageIcon(getClass().getResource("piedra.png"));
                    JLfotoComputadora.setIcon(piedraComputadora);
                    JOptionPane.showMessageDialog(null, juego.jugadas(1, jugadaMaquina));
                    // aca le suma al acumulador del jugador 1
                    juego.setContJugador();

                    // le ponemos al marcador el resultado del jugador
                    JLjugador1.setText(String.valueOf(juego.getContJugador()));

                    break;
                case 1:
                    ImageIcon papelComputadora = new ImageIcon(getClass().getResource("papel.png"));
                    JLfotoComputadora.setIcon(papelComputadora);

                    JOptionPane.showMessageDialog(null, juego.jugadas(1, jugadaMaquina));

                    break;

                case 2:
                    ImageIcon tijeraComputadora = new ImageIcon(getClass().getResource("tijera.png"));
                    JLfotoComputadora.setIcon(tijeraComputadora);

                    JOptionPane.showMessageDialog(null, juego.jugadas(1, jugadaMaquina));
                    // aca le suma al acumulador de la maquina 
                    juego.setContMaquina();

                    // le ponemos al marcador el resultado de la maquina
                    JLjugador2.setText(String.valueOf(juego.getContMaquina()));

                    break;

            }

        }

        if (RBTijera.isSelected()) {
            //ASIGNAMOS IMAGEN DE TIJERA EN EL LABEL
            ImageIcon tijeraJugador = new ImageIcon(getClass().getResource("tijera.png"));
            JLfotoJugador.setIcon(tijeraJugador);

            int jugadaMaquina = juego.jugadaMaquina(); // 0 1 2

            switch (jugadaMaquina) {
                case 0:
                    ImageIcon piedraComputadora = new ImageIcon(getClass().getResource("piedra.png"));
                    JLfotoComputadora.setIcon(piedraComputadora);
                    JOptionPane.showMessageDialog(null, juego.jugadas(2, jugadaMaquina));
                    // aca le suma al acumulador de la maquina 
                    juego.setContMaquina();

                    // le ponemos al marcador el resultado de la maquina
                    JLjugador2.setText(String.valueOf(juego.getContMaquina()));

                    break;
                case 1:
                    ImageIcon papelComputadora = new ImageIcon(getClass().getResource("papel.png"));
                    JLfotoComputadora.setIcon(papelComputadora);

                    JOptionPane.showMessageDialog(null, juego.jugadas(2, jugadaMaquina));
                    // aca le suma al acumulador del jugador 1
                    juego.setContJugador();

                    // le ponemos al marcador el resultado del jugador
                    JLjugador1.setText(String.valueOf(juego.getContJugador()));
                    break;

                case 2:
                    ImageIcon tijeraComputadora = new ImageIcon(getClass().getResource("tijera.png"));
                    JLfotoComputadora.setIcon(tijeraComputadora);

                    JOptionPane.showMessageDialog(null, juego.jugadas(2, jugadaMaquina));

                    break;

            }

        }


    }//GEN-LAST:event_BtnJugarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void RBTijeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBTijeraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBTijeraActionPerformed

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
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnJugar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel JLfotoComputadora;
    private javax.swing.JLabel JLfotoJugador;
    private javax.swing.JLabel JLjugador1;
    private javax.swing.JLabel JLjugador2;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JRadioButton RBPapel;
    private javax.swing.JRadioButton RBPiedra;
    private javax.swing.JRadioButton RBTijera;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
