
import javax.swing.ImageIcon;
 import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author COCHY
 */
public class ventana extends javax.swing.JFrame {
     

    PiedraPapelTijera juego = new PiedraPapelTijera();

    /**
     * Creates new form ventana
     */
    public ventana() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        PanelJugada = new javax.swing.JPanel();
        RBPiedra = new javax.swing.JRadioButton();
        RBPapel = new javax.swing.JRadioButton();
        RBTijera = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLJugador = new javax.swing.JLabel();
        jLMaquina = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JButton();
        BtnJugar = new javax.swing.JButton();
        fotoJugador = new javax.swing.JLabel();
        fotoMaquina = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PanelJugada.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        buttonGroup1.add(RBPiedra);
        RBPiedra.setText("Piedra");

        buttonGroup1.add(RBPapel);
        RBPapel.setText("Papel");

        buttonGroup1.add(RBTijera);
        RBTijera.setText("Tijera");

        javax.swing.GroupLayout PanelJugadaLayout = new javax.swing.GroupLayout(PanelJugada);
        PanelJugada.setLayout(PanelJugadaLayout);
        PanelJugadaLayout.setHorizontalGroup(
            PanelJugadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelJugadaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RBPiedra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RBPapel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RBTijera)
                .addGap(12, 12, 12))
        );
        PanelJugadaLayout.setVerticalGroup(
            PanelJugadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelJugadaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PanelJugadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBPapel)
                    .addComponent(RBTijera)
                    .addComponent(RBPiedra))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Marcador"));

        jLabel1.setText("Jugador:");

        jLabel2.setText("Maquina:");

        jLJugador.setText("0");
        jLJugador.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLMaquina.setText("0");
        jLMaquina.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jLJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnJugar.setText("Jugar");
        BtnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnJugarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelJugada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fotoJugador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnJugar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fotoMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnSalir)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PanelJugada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(BtnJugar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fotoJugador, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(fotoMaquina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(91, 91, 91)
                .addComponent(BtnSalir)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnJugarActionPerformed
        /*---------------------------------------------EL USUARIO ELIGE PIEDRA-------------------------------------------------------------------------------------------------*/
        
        if (RBPiedra.isSelected()) {
            ImageIcon icono = new ImageIcon(getClass().getResource("piedra.png"));
            fotoJugador.setIcon(icono);
            int eleccionMaquina = juego.turnoMaquina();
            switch (eleccionMaquina) {
                case 0:
                    ImageIcon piedra = new ImageIcon(getClass().getResource("piedra.png"));
                    fotoMaquina.setIcon(piedra);
                    
                    JOptionPane.showMessageDialog(null,juego.jugadas(0, eleccionMaquina));
                    break;
                case 1:
                    ImageIcon papel = new ImageIcon(getClass().getResource("papel.png"));
                    fotoMaquina.setIcon(papel);
                    
                    JOptionPane.showMessageDialog(null, juego.jugadas(0, eleccionMaquina));
                    juego.contadorDeVictorias("gana la maquina");
                    jLMaquina.setText(String.valueOf(juego.getGanaComputer()));

                    break;
                case 2:
                    ImageIcon tijera = new ImageIcon(getClass().getResource("tijera.png"));
                    fotoMaquina.setIcon(tijera);
                    
                    JOptionPane.showMessageDialog(null, juego.jugadas(0, eleccionMaquina));
                    juego.contadorDeVictorias("gana el jugador");
                    jLJugador.setText(String.valueOf(juego.getGanaPlayer()));
                    break;

            }
        }

        /*-----------------------------------EL USUARIO ELIGE PAPEL----------------------------------------------------------------------------------------------------*/
        if (RBPapel.isSelected()) {
            ImageIcon icono = new ImageIcon(getClass().getResource("papel.png"));
            fotoJugador.setIcon(icono);
            int eleccionMaquina = juego.turnoMaquina();
            switch (eleccionMaquina) {
                case 0:
                    ImageIcon piedra = new ImageIcon(getClass().getResource("piedra.png"));
                    fotoMaquina.setIcon(piedra);
                    
                    JOptionPane.showMessageDialog(null, juego.jugadas(1, eleccionMaquina));
                    juego.contadorDeVictorias("gana el jugador");
                    jLJugador.setText(String.valueOf(juego.getGanaPlayer()));
                    break;
                case 1:
                    ImageIcon papel = new ImageIcon(getClass().getResource("papel.png"));
                    fotoMaquina.setIcon(papel);
                    
                    JOptionPane.showMessageDialog(null, juego.jugadas(1, eleccionMaquina));
                    break;
                case 2:
                    ImageIcon tijera = new ImageIcon(getClass().getResource("tijera.png"));
                    fotoMaquina.setIcon(tijera);
                    juego.jugadas(1, eleccionMaquina);
                    JOptionPane.showMessageDialog(null, juego.jugadas(1, eleccionMaquina));
                    juego.contadorDeVictorias("gana la maquina");

                    jLMaquina.setText(String.valueOf(juego.getGanaComputer()));
                    break;

            }
        }

        /*------------------------------------------------EL USUARIO ELIGE TIJERA--------------------------------------------------------------------------------------*/
        if (RBTijera.isSelected()) {
            ImageIcon icono = new ImageIcon(getClass().getResource("tijera.png"));
            fotoJugador.setIcon(icono);
            int eleccionMaquina = juego.turnoMaquina();
            switch (eleccionMaquina) {
                case 0:
                    ImageIcon piedra = new ImageIcon(getClass().getResource("piedra.png"));
                    fotoMaquina.setIcon(piedra);
                   
                    JOptionPane.showMessageDialog(null,  juego.jugadas(1, eleccionMaquina));
                    juego.contadorDeVictorias("gana la maquina");

                    jLMaquina.setText(String.valueOf(juego.getGanaComputer()));
                    break;
                case 1:
                    ImageIcon papel = new ImageIcon(getClass().getResource("papel.png"));
                    fotoMaquina.setIcon(papel);
                    
                     JOptionPane.showMessageDialog(null, juego.jugadas(1, eleccionMaquina));
                    juego.contadorDeVictorias("gana el jugador");
                    jLJugador.setText(String.valueOf(juego.getGanaPlayer()));
                    break;
                case 2:
                    ImageIcon tijera = new ImageIcon(getClass().getResource("tijera.png"));
                    fotoMaquina.setIcon(tijera);
                    juego.jugadas(1, eleccionMaquina);
                    JOptionPane.showMessageDialog(null, juego.jugadas(1, eleccionMaquina));
                     
                    break;

            }
        }

    }//GEN-LAST:event_BtnJugarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnJugar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JPanel PanelJugada;
    private javax.swing.JRadioButton RBPapel;
    private javax.swing.JRadioButton RBPiedra;
    private javax.swing.JRadioButton RBTijera;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel fotoJugador;
    private javax.swing.JLabel fotoMaquina;
    private javax.swing.JLabel jLJugador;
    private javax.swing.JLabel jLMaquina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
