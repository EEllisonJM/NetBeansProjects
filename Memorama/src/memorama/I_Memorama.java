package memorama;
/*Importacion de las librerias utilizadas en la clase I_Memorama*/

import java.util.Random;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*Declaracion de la clase I_Memorama que extiende(hereda)a la clase JFrame*/
public class I_Memorama extends javax.swing.JFrame {

    int puntuacion = 0;
    int auxCartaClic;
    int as[] = creaNumeroCartas(24);
    int clic = 0;
    int pos = 0;

    public I_Memorama() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        arre0 = new javax.swing.JLabel();
        arre1 = new javax.swing.JLabel();
        arre2 = new javax.swing.JLabel();
        arre3 = new javax.swing.JLabel();
        arre4 = new javax.swing.JLabel();
        arre5 = new javax.swing.JLabel();
        arre6 = new javax.swing.JLabel();
        arre7 = new javax.swing.JLabel();
        arre8 = new javax.swing.JLabel();
        arre9 = new javax.swing.JLabel();
        arre10 = new javax.swing.JLabel();
        arre11 = new javax.swing.JLabel();
        arre12 = new javax.swing.JLabel();
        arre13 = new javax.swing.JLabel();
        arre14 = new javax.swing.JLabel();
        arre15 = new javax.swing.JLabel();
        arre16 = new javax.swing.JLabel();
        arre17 = new javax.swing.JLabel();
        arre18 = new javax.swing.JLabel();
        arre19 = new javax.swing.JLabel();
        arre20 = new javax.swing.JLabel();
        arre21 = new javax.swing.JLabel();
        arre22 = new javax.swing.JLabel();
        arre23 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setOpaque(false);

        arre0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND.gif"))); // NOI18N
        arre0.setDisabledIcon(null);
        arre0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arre0MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                arre0MouseExited(evt);
            }
        });

        arre1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND.gif"))); // NOI18N
        arre1.setDisabledIcon(null);
        arre1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arre1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                arre1MouseExited(evt);
            }
        });

        arre2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND.gif"))); // NOI18N
        arre2.setDisabledIcon(null);
        arre2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arre2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                arre2MouseExited(evt);
            }
        });

        arre3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND.gif"))); // NOI18N
        arre3.setDisabledIcon(null);
        arre3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arre3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                arre3MouseExited(evt);
            }
        });

        arre4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND.gif"))); // NOI18N
        arre4.setDisabledIcon(null);
        arre4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arre4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                arre4MouseExited(evt);
            }
        });

        arre5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND.gif"))); // NOI18N
        arre5.setDisabledIcon(null);
        arre5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arre5MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                arre5MouseExited(evt);
            }
        });

        arre6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND.gif"))); // NOI18N
        arre6.setDisabledIcon(null);
        arre6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arre6MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                arre6MouseExited(evt);
            }
        });

        arre7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND.gif"))); // NOI18N
        arre7.setDisabledIcon(null);
        arre7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arre7MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                arre7MouseExited(evt);
            }
        });

        arre8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND.gif"))); // NOI18N
        arre8.setDisabledIcon(null);
        arre8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arre8MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                arre8MouseExited(evt);
            }
        });

        arre9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND.gif"))); // NOI18N
        arre9.setDisabledIcon(null);
        arre9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arre9MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                arre9MouseExited(evt);
            }
        });

        arre10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND.gif"))); // NOI18N
        arre10.setDisabledIcon(null);
        arre10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arre10MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                arre10MouseExited(evt);
            }
        });

        arre11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND.gif"))); // NOI18N
        arre11.setDisabledIcon(null);
        arre11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arre11MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                arre11MouseExited(evt);
            }
        });

        arre12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND.gif"))); // NOI18N
        arre12.setDisabledIcon(null);
        arre12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arre12MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                arre12MouseExited(evt);
            }
        });

        arre13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND.gif"))); // NOI18N
        arre13.setDisabledIcon(null);
        arre13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arre13MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                arre13MouseExited(evt);
            }
        });

        arre14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND.gif"))); // NOI18N
        arre14.setDisabledIcon(null);
        arre14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arre14MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                arre14MouseExited(evt);
            }
        });

        arre15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND.gif"))); // NOI18N
        arre15.setDisabledIcon(null);
        arre15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arre15MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                arre15MouseExited(evt);
            }
        });

        arre16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND.gif"))); // NOI18N
        arre16.setDisabledIcon(null);
        arre16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arre16MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                arre16MouseExited(evt);
            }
        });

        arre17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND.gif"))); // NOI18N
        arre17.setDisabledIcon(null);
        arre17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arre17MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                arre17MouseExited(evt);
            }
        });

        arre18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND.gif"))); // NOI18N
        arre18.setDisabledIcon(null);
        arre18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arre18MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                arre18MouseExited(evt);
            }
        });

        arre19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND.gif"))); // NOI18N
        arre19.setDisabledIcon(null);
        arre19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arre19MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                arre19MouseExited(evt);
            }
        });

        arre20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND.gif"))); // NOI18N
        arre20.setDisabledIcon(null);
        arre20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arre20MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                arre20MouseExited(evt);
            }
        });

        arre21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND.gif"))); // NOI18N
        arre21.setDisabledIcon(null);
        arre21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arre21MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                arre21MouseExited(evt);
            }
        });

        arre22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND.gif"))); // NOI18N
        arre22.setDisabledIcon(null);
        arre22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arre22MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                arre22MouseExited(evt);
            }
        });

        arre23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND.gif"))); // NOI18N
        arre23.setDisabledIcon(null);
        arre23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arre23MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                arre23MouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setText("MEMORAMA");

        jButton1.setText("NUEVO JUEGO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Puntos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(arre16)
                                .addGap(18, 18, 18)
                                .addComponent(arre17))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(arre0)
                                    .addComponent(arre8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(arre9)
                                    .addComponent(arre1))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(arre10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(arre11)
                                .addGap(22, 22, 22)
                                .addComponent(arre12)
                                .addGap(18, 18, 18)
                                .addComponent(arre13)
                                .addGap(18, 18, 18)
                                .addComponent(arre14)
                                .addGap(18, 18, 18)
                                .addComponent(arre15))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(arre18)
                                .addGap(18, 18, 18)
                                .addComponent(arre19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(arre20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(arre21)
                                .addGap(18, 18, 18)
                                .addComponent(arre22)
                                .addGap(18, 18, 18)
                                .addComponent(arre23))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(arre2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(arre3)
                                        .addGap(18, 18, 18)
                                        .addComponent(arre4)
                                        .addGap(18, 18, 18)
                                        .addComponent(arre5)))
                                .addGap(18, 18, 18)
                                .addComponent(arre6)
                                .addGap(18, 18, 18)
                                .addComponent(arre7))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(45, 45, 45)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(arre1)
                    .addComponent(arre0)
                    .addComponent(arre2)
                    .addComponent(arre3)
                    .addComponent(arre4)
                    .addComponent(arre5)
                    .addComponent(arre6)
                    .addComponent(arre7))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(arre8)
                    .addComponent(arre9)
                    .addComponent(arre10)
                    .addComponent(arre11)
                    .addComponent(arre12)
                    .addComponent(arre13)
                    .addComponent(arre14)
                    .addComponent(arre15))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(arre16)
                            .addComponent(arre17)
                            .addComponent(arre23))
                        .addContainerGap(64, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(arre18)
                            .addComponent(arre22)
                            .addComponent(arre19)
                            .addComponent(arre21)
                            .addComponent(arre20))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FONDO_1.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jLabel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        as = creaNumeroCartas(24);
        puntuacion = 0;
        inicio();
    }//GEN-LAST:event_jButton1ActionPerformed
    public void inicio() {
        arre0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
        arre1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
        arre2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
        arre3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
        arre4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
        arre5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
        arre6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
        arre7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
        arre8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
        arre9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
        arre10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18
        arre11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
        arre12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
        arre13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
        arre14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
        arre15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
        arre16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
        arre17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
        arre18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
        arre19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
        arre20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
        arre21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
        arre22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
        arre23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
    }
    private void arre0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre0MouseExited
        if (clic >= 2) {//dos clic  o mas clics          
            if (esIgual(as[0], as[pos]) == true) {/*Si la carta 1 y la carta 2 son iguales agregarle 10 puntos*/

                if (auxCartaClic == 0) {//System.out.println("no voltear");
                    reestablece(0, pos);
                } else {
                    puntuacion += 10;
                }
            } else {/*las dos cartas no son iguales*/

                puntuacion += -5;
                reestablece(0, pos);
            }
            clic = 0;
        }
    }//GEN-LAST:event_arre0MouseExited

    private void arre1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre1MouseExited
        if (clic >= 2) {//dos clic
            //establecer(1);
            if (esIgual(as[1], as[pos]) == true) {/*Si la carta 1 y la carta 2 son iguales agregarle 10 puntos*/

                if (auxCartaClic == 1) {//System.out.println("no voltear");
                    reestablece(1, pos);
                } else {
                    puntuacion += 10;
                }
            } else {
                puntuacion += -5;
                reestablece(1, pos);
            }
            clic = 0;
        }
    }//GEN-LAST:event_arre1MouseExited

    private void arre2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre2MouseExited
        if (clic >= 2) {//dos clic
            //establecer(2);
            if (esIgual(as[2], as[pos]) == true) {/*Si la carta 1 y la carta 2 son iguales agregarle 10 puntos*/
                if (auxCartaClic == 2) {//System.out.println("no voltear");
                    reestablece(2, pos);
                } else {
                    puntuacion += 10;
                }
            } else {
                puntuacion += -5;
                reestablece(2, pos);
            }
            clic = 0;
        }
    }//GEN-LAST:event_arre2MouseExited

    private void arre3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre3MouseExited
        if (clic >= 2) {//dos clic
            //establecer(3);
            if (esIgual(as[3], as[pos]) == true) {/*Si la carta 1 y la carta 2 son iguales agregarle 10 puntos*/
                if (auxCartaClic == 3) {//System.out.println("no voltear");
                    reestablece(3, pos);
                } else {
                    puntuacion += 10;
                }
            } else {
                puntuacion += -5;
                reestablece(3, pos);
            }
            clic = 0;
        }

    }//GEN-LAST:event_arre3MouseExited

    private void arre4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre4MouseExited
        if (clic >= 2) {//dos clic
            //establecer(4);
            if (esIgual(as[4], as[pos]) == true) {/*Si la carta 1 y la carta 2 son iguales agregarle 10 puntos*/
                if (auxCartaClic == 4) {//System.out.println("no voltear");
                    reestablece(4, pos);
                } else {
                    puntuacion += 10;
                }
            } else {
                puntuacion += -5;
                reestablece(4, pos);
            }
            clic = 0;
        }
    }//GEN-LAST:event_arre4MouseExited

    private void arre5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre5MouseExited
        if (clic >= 2) {//dos clic
            //establecer(5);
            if (esIgual(as[5], as[pos]) == true) {/*Si la carta 1 y la carta 2 son iguales agregarle 10 puntos*/
                if (auxCartaClic == 5) {//System.out.println("no voltear");
                    reestablece(5, pos);
                } else {
                    puntuacion += 10;
                }
            } else {
                puntuacion += -5;
                reestablece(5, pos);
            }
            clic = 0;
        }
    }//GEN-LAST:event_arre5MouseExited

    private void arre6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre6MouseExited
        if (clic >= 2) {//dos clic
            //establecer(6);
            if (esIgual(as[6], as[pos]) == true) {/*Si la carta 1 y la carta 2 son iguales agregarle 10 puntos*/
                if (auxCartaClic == 6) {//System.out.println("no voltear");
                    reestablece(6, pos);
                } else {
                    puntuacion += 10;
                }
            } else {
                puntuacion += -5;
                reestablece(6, pos);
            }
            clic = 0;
        }
    }//GEN-LAST:event_arre6MouseExited

    private void arre7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre7MouseExited
        if (clic >= 2) {//dos clic
            //establecer(7);
            if (esIgual(as[7], as[pos]) == true) {/*Si la carta 1 y la carta 2 son iguales agregarle 10 puntos*/
                if (auxCartaClic == 7) {//System.out.println("no voltear");
                    reestablece(7, pos);
                } else {
                    puntuacion += 10;
                }
            } else {
                puntuacion += -5;
                reestablece(7, pos);
            }
            clic = 0;
        }
    }//GEN-LAST:event_arre7MouseExited

    private void arre8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre8MouseExited
        if (clic >= 2) {//dos clic            
            //establecer(8);
            if (esIgual(as[8], as[pos]) == true) {/*Si la carta 1 y la carta 2 son iguales agregarle 10 puntos*/
                if (auxCartaClic == 8) {//System.out.println("no voltear");
                    reestablece(8, pos);
                } else {
                    puntuacion += 10;
                }
                puntuacion += 10;
            } else {
                puntuacion += -5;
                reestablece(8, pos);
            }
            clic = 0;
        }
    }//GEN-LAST:event_arre8MouseExited

    private void arre9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre9MouseExited
        if (clic >= 2) {//dos clic
            //establecer(9);
            if (esIgual(as[9], as[pos]) == true) {/*Si la carta 1 y la carta 2 son iguales agregarle 10 puntos*/
                if (auxCartaClic == 9) {//System.out.println("no voltear");
                    reestablece(9, pos);
                } else {
                    puntuacion += 10;
                }
            } else {
                puntuacion += -5;
                reestablece(9, pos);
            }
            clic = 0;
        }
    }//GEN-LAST:event_arre9MouseExited

    private void arre10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre10MouseExited
        if (clic >= 2) {//dos clic
            //establecer(10);
            if (esIgual(as[10], as[pos]) == true) {/*Si la carta 1 y la carta 2 son iguales agregarle 10 puntos*/
                if (auxCartaClic == 10) {//System.out.println("no voltear");
                    reestablece(10, pos);
                } else {
                    puntuacion += 10;
                }
            } else {
                puntuacion += -5;
                reestablece(10, pos);
            }
            clic = 0;
        }
    }//GEN-LAST:event_arre10MouseExited

    private void arre11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre11MouseExited
        if (clic >= 2) {//dos clic
            //establecer(11);
            if (esIgual(as[11], as[pos]) == true) {/*Si la carta 1 y la carta 2 son iguales agregarle 10 puntos*/
                if (auxCartaClic == 11) {//System.out.println("no voltear");
                    reestablece(11, pos);
                } else {
                    puntuacion += 10;
                }
            } else {
                puntuacion += -5;
                reestablece(11, pos);
            }
            clic = 0;
        }
    }//GEN-LAST:event_arre11MouseExited

    private void arre0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre0MouseClicked
        clic++;
        if (clic == 1) {//un clic
            pos = 0;
            establecer(0);
            auxCartaClic = 0;
        }
        if (clic == 2) {//dos clic
            establecer(0);
        }
    }//GEN-LAST:event_arre0MouseClicked

    private void arre1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre1MouseClicked
        clic++;
        if (clic == 1) {//un clic
            pos = 1;
            establecer(1);
            auxCartaClic = 1;
        }
        if (clic == 2) {//dos clic
            establecer(1);
        }
    }//GEN-LAST:event_arre1MouseClicked

    public void establecer(int numero) {
        String aux;
        String ruta;
        switch (numero) {
            case 0:
                aux = as[0] + "";
                ruta = "/images/P" + aux + ".png";
                arre0.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta))); // NOI18N                
                break;
            case 1:
                aux = as[1] + "";
                ruta = "/images/P" + aux + ".png";
                arre1.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta))); // NOI18N                
                break;
            case 2:
                aux = as[2] + "";
                ruta = "/images/P" + aux + ".png";
                arre2.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta))); // NOI18N                 
                break;
            case 3:
                aux = as[3] + "";
                ruta = "/images/P" + aux + ".png";
                arre3.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta))); // NOI18N
                break;
            case 4:
                aux = as[4] + "";
                ruta = "/images/P" + aux + ".png";
                arre4.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta))); // NOI18N                
                break;
            case 5:
                aux = as[5] + "";
                ruta = "/images/P" + aux + ".png";
                arre5.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta))); // NOI18N                            
                break;
            case 6:
                aux = as[6] + "";
                ruta = "/images/P" + aux + ".png";
                arre6.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta))); // NOI18N                            
                break;
            case 7:
                aux = as[7] + "";
                ruta = "/images/P" + aux + ".png";
                arre7.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta))); // NOI18N            
                break;
            case 8:
                aux = as[8] + "";
                ruta = "/images/P" + aux + ".png";
                arre8.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta))); // NOI18N            
                break;
            case 9:
                aux = as[9] + "";
                ruta = "/images/P" + aux + ".png";
                arre9.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta))); // NOI19N            
                break;
            case 10:
                aux = as[10] + "";
                ruta = "/images/P" + aux + ".png";
                arre10.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta))); // NOI19N            
                break;
            case 11:
                aux = as[11] + "";
                ruta = "/images/P" + aux + ".png";
                arre11.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta))); // NOI111N            
                break;
            case 12:
                aux = as[12] + "";
                ruta = "/images/P" + aux + ".png";
                arre12.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta))); // NOI121N            
                break;
            case 13:
                aux = as[13] + "";
                ruta = "/images/P" + aux + ".png";
                arre13.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta))); // NOI131N            
                break;
            case 14:
                aux = as[14] + "";
                ruta = "/images/P" + aux + ".png";
                arre14.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta))); // NOI141N            
                break;
            case 15:
                aux = as[15] + "";
                ruta = "/images/P" + aux + ".png";
                arre15.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta))); // NOI151N            
                break;
            case 16:
                aux = as[16] + "";
                ruta = "/images/P" + aux + ".png";
                arre16.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta))); // NOI161N            
                break;
            case 17:
                aux = as[17] + "";
                ruta = "/images/P" + aux + ".png";
                arre17.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta))); // NOI171N            
                break;
            case 18:
                aux = as[18] + "";
                ruta = "/images/P" + aux + ".png";
                arre18.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta))); // NOI181N            
                break;
            case 19:
                aux = as[19] + "";
                ruta = "/images/P" + aux + ".png";
                arre19.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta))); // NOI191N            
                break;
            case 20:
                aux = as[20] + "";
                ruta = "/images/P" + aux + ".png";
                arre20.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta))); // NOI201N            
                break;
            case 21:
                aux = as[21] + "";
                ruta = "/images/P" + aux + ".png";
                arre21.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta))); // NOI211N            
                break;
            case 22:
                aux = as[22] + "";
                ruta = "/images/P" + aux + ".png";
                arre22.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta))); // NOI222N            
                break;
            case 23:
                aux = as[23] + "";
                ruta = "/images/P" + aux + ".png";
                arre23.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta))); // NOI232N            
                break;
        }
    }
    private void arre2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre2MouseClicked
        clic++;
        if (clic == 1) {//un clic
            pos = 2;
            establecer(2);
            auxCartaClic = 2;
        }
        if (clic == 2) {//dos clic
            establecer(2);
        }
    }//GEN-LAST:event_arre2MouseClicked

    private void arre3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre3MouseClicked
        clic++;
        if (clic == 1) {//un clic
            pos = 3;
            establecer(3);
            auxCartaClic = 3;
        }
        if (clic == 2) {//dos clic
            establecer(3);
        }
    }//GEN-LAST:event_arre3MouseClicked

    private void arre4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre4MouseClicked
        clic++;
        if (clic == 1) {//un clic
            pos = 4;
            establecer(4);
            auxCartaClic = 4;
        }
        if (clic == 2) {//dos clic
            establecer(4);
        }
    }//GEN-LAST:event_arre4MouseClicked

    private void arre5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre5MouseClicked
        clic++;
        if (clic == 1) {//un clic
            pos = 5;
            establecer(5);
            auxCartaClic = 5;
        }
        if (clic == 2) {//dos clic
            establecer(5);
        }
    }//GEN-LAST:event_arre5MouseClicked

    private void arre6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre6MouseClicked
        clic++;
        if (clic == 1) {//un clic
            pos = 6;
            establecer(6);
            auxCartaClic = 6;
        }
        if (clic == 2) {//dos clic
            establecer(6);
        }
    }//GEN-LAST:event_arre6MouseClicked

    private void arre7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre7MouseClicked
        clic++;
        if (clic == 1) {//un clic
            pos = 7;
            establecer(7);
            auxCartaClic = 7;
        }
        if (clic == 2) {//dos clic
            establecer(7);
        }
    }//GEN-LAST:event_arre7MouseClicked

    private void arre8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre8MouseClicked
        clic++;
        if (clic == 1) {//un clic
            pos = 8;
            establecer(8);
            auxCartaClic = 8;
        }
        if (clic == 2) {//dos clic
            establecer(8);
        }
    }//GEN-LAST:event_arre8MouseClicked

    private void arre9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre9MouseClicked
        clic++;
        if (clic == 1) {//un clic
            pos = 9;
            establecer(9);
            auxCartaClic = 9;
        }
        if (clic == 2) {//dos clic
            establecer(9);
        }
    }//GEN-LAST:event_arre9MouseClicked

    private void arre10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre10MouseClicked
        clic++;
        if (clic == 1) {//un clic
            pos = 10;
            establecer(10);
            auxCartaClic = 10;
        }
        if (clic == 2) {//dos clic            
            establecer(10);
        }
    }//GEN-LAST:event_arre10MouseClicked

    private void arre11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre11MouseClicked
        clic++;
        if (clic == 1) {//un clic
            pos = 11;
            establecer(11);
            auxCartaClic = 11;
        }
        if (clic == 2) {//dos clic
            establecer(11);
        }
    }//GEN-LAST:event_arre11MouseClicked

    private void arre12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre12MouseClicked
        clic++;
        if (clic == 1) {//un clic
            pos = 12;
            establecer(12);
            auxCartaClic = 12;
        }
        if (clic == 2) {//dos clic
            establecer(12);
        }
    }//GEN-LAST:event_arre12MouseClicked

    private void arre12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre12MouseExited
        if (clic >= 2) {//dos clic
            //establecer(12);
            if (esIgual(as[12], as[pos]) == true) {/*Si la carta 1 y la carta 2 son iguales agregarle 10 puntos*/
                if (auxCartaClic == 12) {//System.out.println("no voltear");
                    reestablece(12, pos);
                } else {
                    puntuacion += 10;
                }
            } else {
                puntuacion += -5;
                reestablece(12, pos);
            }
            clic = 0;
        }
    }//GEN-LAST:event_arre12MouseExited

    private void arre13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre13MouseClicked
        clic++;
        if (clic == 1) {//un clic
            pos = 13;
            establecer(13);
            auxCartaClic = 13;
        }
        if (clic == 2) {//dos clic
            establecer(13);
        }
    }//GEN-LAST:event_arre13MouseClicked

    private void arre13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre13MouseExited
        if (clic >= 2) {//dos clic
            //establecer(13)
            if (esIgual(as[13], as[pos]) == true) {/*Si la carta 1 y la carta 2 son iguales agregarle 10 puntos*/
                if (auxCartaClic == 13) {//System.out.println("no voltear");
                    reestablece(13, pos);
                } else {
                    puntuacion += 10;
                }
            } else {
                puntuacion += -5;
                reestablece(13, pos);
            }
            clic = 0;
        }
    }//GEN-LAST:event_arre13MouseExited

    private void arre14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre14MouseClicked
        clic++;
        if (clic == 1) {//un clic
            pos = 14;
            establecer(14);
            auxCartaClic = 14;
        }
        if (clic == 2) {//dos clic
            establecer(14);
        }
    }//GEN-LAST:event_arre14MouseClicked

    private void arre14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre14MouseExited
        if (clic >= 2) {//dos clic
            //establecer(14);
            if (esIgual(as[14], as[pos]) == true) {/*Si la carta 1 y la carta 2 son iguales agregarle 10 puntos*/
                if (auxCartaClic == 14) {//System.out.println("no voltear");
                    reestablece(14, pos);
                } else {
                    puntuacion += 10;
                }
            } else {
                puntuacion += -5;
                reestablece(14, pos);
            }
            clic = 0;
        }
    }//GEN-LAST:event_arre14MouseExited

    private void arre15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre15MouseClicked
        clic++;
        if (clic == 1) {//un clic
            pos = 15;
            establecer(15);
            auxCartaClic = 15;
        }
        if (clic == 2) {//dos clic
            establecer(15);
        }
    }//GEN-LAST:event_arre15MouseClicked

    private void arre15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre15MouseExited
        if (clic >= 2) {//dos clic
            //establecer(15);
            if (esIgual(as[15], as[pos]) == true) {/*Si la carta 1 y la carta 2 son iguales agregarle 10 puntos*/
                if (auxCartaClic == 15) {//System.out.println("no voltear");
                    reestablece(15, pos);
                } else {
                    puntuacion += 10;
                }
            } else {
                puntuacion += -5;
                reestablece(15, pos);
            }
            clic = 0;
        }
    }//GEN-LAST:event_arre15MouseExited

    private void arre16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre16MouseClicked
        clic++;
        if (clic == 1) {//un clic
            pos = 16;
            establecer(16);
            auxCartaClic = 16;
        }
        if (clic == 2) {//dos clic
            establecer(16);
        }
    }//GEN-LAST:event_arre16MouseClicked

    private void arre16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre16MouseExited
        if (clic >= 2) {//dos clic
            //establecer(16);
            if (esIgual(as[16], as[pos]) == true) {/*Si la carta 1 y la carta 2 son iguales agregarle 10 puntos*/
                if (auxCartaClic == 16) {//System.out.println("no voltear");
                    reestablece(16, pos);
                } else {
                    puntuacion += 10;
                }
            } else {
                puntuacion += -5;
                reestablece(16, pos);
            }
            clic = 0;
        }
    }//GEN-LAST:event_arre16MouseExited

    private void arre17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre17MouseClicked
        clic++;
        if (clic == 1) {//un clic
            pos = 17;
            establecer(17);
            auxCartaClic = 17;
        }
        if (clic == 2) {//dos clic
            establecer(17);
        }
    }//GEN-LAST:event_arre17MouseClicked

    private void arre17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre17MouseExited
        if (clic >= 2) {//dos clic
            //establecer(17);
            if (esIgual(as[17], as[pos]) == true) {/*Si la carta 1 y la carta 2 son iguales agregarle 10 puntos*/
                if (auxCartaClic == 17) {//System.out.println("no voltear");
                    reestablece(17, pos);
                } else {
                    puntuacion += 10;
                }
            } else {
                puntuacion += -5;
                reestablece(17, pos);
            }
            clic = 0;
        }
    }//GEN-LAST:event_arre17MouseExited

    private void arre18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre18MouseClicked
        clic++;
        if (clic == 1) {//un clic
            pos = 18;
            establecer(18);
            auxCartaClic = 18;
        }
        if (clic == 2) {//dos clic
            establecer(18);
        }
    }//GEN-LAST:event_arre18MouseClicked

    private void arre18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre18MouseExited
        if (clic >= 2) {//dos clic
            //establecer(18);

            if (esIgual(as[18], as[pos]) == true) {/*Si la carta 1 y la carta 2 son iguales agregarle 10 puntos*/
                if (auxCartaClic == 18) {//System.out.println("no voltear");
                    reestablece(18, pos);
                } else {
                    puntuacion += 10;
                }
            } else {
                puntuacion += -5;
                reestablece(18, pos);
            }
            clic = 0;
        }
    }//GEN-LAST:event_arre18MouseExited

    private void arre19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre19MouseClicked
        clic++;
        if (clic == 1) {//un clic
            pos = 19;
            establecer(19);
            auxCartaClic = 19;
        }
        if (clic == 2) {//dos clic
            establecer(19);
        }
    }//GEN-LAST:event_arre19MouseClicked

    private void arre19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre19MouseExited
        if (clic >= 2) {//dos clic
            //establecer(19);
            if (esIgual(as[19], as[pos]) == true) {/*Si la carta 1 y la carta 2 son iguales agregarle 10 puntos*/
                if (auxCartaClic == 19) {//System.out.println("no voltear");
                    reestablece(19, pos);
                } else {
                    puntuacion += 10;
                }
            } else {
                puntuacion += -5;
                reestablece(19, pos);
            }
            clic = 0;
        }
    }//GEN-LAST:event_arre19MouseExited

    private void arre20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre20MouseClicked
        clic++;
        if (clic == 1) {//un clic
            pos = 20;
            establecer(20);
            auxCartaClic = 20;
        }
        if (clic == 2) {//dos clic
            establecer(20);
        }
    }//GEN-LAST:event_arre20MouseClicked

    private void arre20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre20MouseExited
        if (clic >= 2) {//dos clic
            //establecer(20);
            if (esIgual(as[20], as[pos]) == true) {/*Si la carta 1 y la carta 2 son iguales agregarle 10 puntos*/
                if (auxCartaClic == 20) {//System.out.println("no voltear");
                    reestablece(20, pos);
                } else {
                    puntuacion += 10;
                }
            } else {
                puntuacion += -5;
                reestablece(20, pos);
            }
            clic = 0;
        }
    }//GEN-LAST:event_arre20MouseExited

    private void arre21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre21MouseClicked
        clic++;
        if (clic == 1) {//un clic
            pos = 21;
            establecer(21);
            auxCartaClic = 21;
        }
        if (clic == 2) {//dos clic
            establecer(21);
        }
    }//GEN-LAST:event_arre21MouseClicked

    private void arre21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre21MouseExited
        if (clic >= 2) {//dos clic
            //establecer(21);
            if (esIgual(as[21], as[pos]) == true) {/*Si la carta 1 y la carta 2 son iguales agregarle 10 puntos*/
                if (auxCartaClic == 21) {//System.out.println("no voltear");
                    reestablece(21, pos);
                } else {
                    puntuacion += 10;
                }
            } else {
                puntuacion += -5;
                reestablece(21, pos);
            }
            clic = 0;
        }
    }//GEN-LAST:event_arre21MouseExited

    private void arre22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre22MouseClicked
        clic++;
        if (clic == 1) {//un clic
            pos = 22;
            establecer(22);
            auxCartaClic = 22;
        }
        if (clic == 2) {//dos clic
            establecer(22);
        }
    }//GEN-LAST:event_arre22MouseClicked

    private void arre22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre22MouseExited
        if (clic >= 2) {//dos clic
            //establecer(22);
            if (esIgual(as[22], as[pos]) == true) {/*Si la carta 1 y la carta 2 son iguales agregarle 10 puntos*/
                if (auxCartaClic == 22) {//System.out.println("no voltear");
                    reestablece(22, pos);
                } else {
                    puntuacion += 10;
                }
            } else {/*Si la carta 1 y la carta 2 NO son iguales restarle 5 puntos*/

                puntuacion += -5;
                reestablece(22, pos);
            }
            clic = 0;
        }
    }//GEN-LAST:event_arre22MouseExited

    private void arre23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre23MouseClicked
        clic++;
        if (clic == 1) {//un clic
            pos = 23;
            establecer(23);
            auxCartaClic = 23;
        }
        if (clic == 2) {//dos clic
            establecer(23);
        }
    }//GEN-LAST:event_arre23MouseClicked

    private void arre23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arre23MouseExited
        if (clic >= 2) {//dos clic
            //establecer(23);
            if (esIgual(as[23], as[pos]) == true) {/*Si la carta 1 y la carta 2 son iguales agregarle 10 puntos*/
                if (auxCartaClic == 23) {//System.out.println("no voltear");
                    reestablece(23, pos);
                } else {
                    puntuacion += 10;
                }
            } else {
                puntuacion += -5;
                reestablece(23, pos);
            }
            clic = 0;
        }
    }//GEN-LAST:event_arre23MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(null, "Puntos: " + puntuacion);
    }//GEN-LAST:event_jButton2ActionPerformed
    public void reestablece(int a, int b) {/*reestalbece las dos cartas que no son iguales*/

        for (int i = 0; i < 2; i++) {
            switch (a) {
                case 0:
                    arre0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
                    break;
                case 1:
                    arre1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
                    break;
                case 2:
                    arre2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
                    break;
                case 3:
                    arre3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
                    break;
                case 4:
                    arre4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
                    break;
                case 5:
                    arre5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
                    break;
                case 6:
                    arre6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
                    break;
                case 7:
                    arre7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
                    break;
                case 8:
                    arre8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
                    break;
                case 9:
                    arre9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
                    break;
                case 10:
                    arre10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
                    break;
                case 11:
                    arre11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
                    break;
                case 12:
                    arre12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
                    break;
                case 13:
                    arre13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
                    break;
                case 14:
                    arre14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
                    break;
                case 15:
                    arre15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
                    break;
                case 16:
                    arre16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
                    break;
                case 17:
                    arre17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
                    break;
                case 18:
                    arre18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
                    break;
                case 19:
                    arre19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
                    break;
                case 20:
                    arre20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
                    break;
                case 21:
                    arre21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
                    break;
                case 22:
                    arre22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
                    break;
                case 23:
                    arre23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PFOND_1.jpg"))); // NOI18N
                    break;
            }
            a = b;
        }
    }

    public boolean esIgual(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    public int[] creaNumeroCartas(int tamaño) {/*crea un arreglo del total de numero de cartas que se han de jugar*/

        int[] numeros = new int[tamaño];
        double au1 = 0;
        double au2 = 0;
        int aux = 0;
        int cont = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (i == numeros.length / 2) {
                cont = 0;
            }
            numeros[i] = cont + 1;
            cont++;
        }
        for (int i = 0; i < numeros.length; i++) {
            au1 = Math.random() * numeros.length;
            int auxau1 = (int) au1;

            au2 = Math.random() * numeros.length;
            int auxau2 = (int) au2;

            aux = numeros[auxau1];
            numeros[auxau1] = numeros[auxau2];
            numeros[auxau2] = aux;
        }
        return numeros;
    }

    public static void main(String args[]) {
        I_Memorama a = new I_Memorama();
        a.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arre0;
    private javax.swing.JLabel arre1;
    private javax.swing.JLabel arre10;
    private javax.swing.JLabel arre11;
    private javax.swing.JLabel arre12;
    private javax.swing.JLabel arre13;
    private javax.swing.JLabel arre14;
    private javax.swing.JLabel arre15;
    private javax.swing.JLabel arre16;
    private javax.swing.JLabel arre17;
    private javax.swing.JLabel arre18;
    private javax.swing.JLabel arre19;
    private javax.swing.JLabel arre2;
    private javax.swing.JLabel arre20;
    private javax.swing.JLabel arre21;
    private javax.swing.JLabel arre22;
    private javax.swing.JLabel arre23;
    private javax.swing.JLabel arre3;
    private javax.swing.JLabel arre4;
    private javax.swing.JLabel arre5;
    private javax.swing.JLabel arre6;
    private javax.swing.JLabel arre7;
    private javax.swing.JLabel arre8;
    private javax.swing.JLabel arre9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
