package ordenanumero;
/*Importacion de la libreria Random, el cual se utiliza en la clase I_CuboMagico*/

import java.util.Random;
/*Declaracion de la clase I_CuboMagico*/

public class I_CuboMagico extends javax.swing.JFrame {

    private String posiciones;
    private int numeros = 1;
    private String[][] arreglo = new String[4][4];

    public I_CuboMagico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        btn_00 = new javax.swing.JButton();
        btn_01 = new javax.swing.JButton();
        btn_02 = new javax.swing.JButton();
        btn_03 = new javax.swing.JButton();
        btn_10 = new javax.swing.JButton();
        btn_11 = new javax.swing.JButton();
        btn_20 = new javax.swing.JButton();
        btn_21 = new javax.swing.JButton();
        btn_12 = new javax.swing.JButton();
        btn_13 = new javax.swing.JButton();
        btn_23 = new javax.swing.JButton();
        btn_30 = new javax.swing.JButton();
        btn_31 = new javax.swing.JButton();
        btn_33 = new javax.swing.JButton();
        btn_22 = new javax.swing.JButton();
        btn_32 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setOpaque(false);

        btn_00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_00ActionPerformed(evt);
            }
        });

        btn_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_01ActionPerformed(evt);
            }
        });

        btn_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_02ActionPerformed(evt);
            }
        });

        btn_03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_03ActionPerformed(evt);
            }
        });

        btn_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_10ActionPerformed(evt);
            }
        });

        btn_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_11ActionPerformed(evt);
            }
        });

        btn_20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_20ActionPerformed(evt);
            }
        });

        btn_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_21ActionPerformed(evt);
            }
        });

        btn_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_12ActionPerformed(evt);
            }
        });

        btn_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_13ActionPerformed(evt);
            }
        });

        btn_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_23ActionPerformed(evt);
            }
        });

        btn_30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_30ActionPerformed(evt);
            }
        });

        btn_31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_31ActionPerformed(evt);
            }
        });

        btn_33.setText(" ");
        btn_33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_33ActionPerformed(evt);
            }
        });

        btn_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_22ActionPerformed(evt);
            }
        });

        btn_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_32ActionPerformed(evt);
            }
        });

        jButton1.setText("Aleatorio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("posicion");
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_00, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_01, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_12, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_03, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                        .addComponent(jButton2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_13, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_20, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_21, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_22, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_23, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_30, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_31, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_32, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_33, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_01, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_00, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_03, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_02, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_11, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_13, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_12, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_21, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_20, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_23, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_22, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_30, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_31, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_32, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_33, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fond_.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jLabel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_01ActionPerformed
        posicionVacia();
        if (posiciones.equals("01")) {//no cambia
        } else {
            cambia(0, 1);
        }
    }//GEN-LAST:event_btn_01ActionPerformed

    private void btn_03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_03ActionPerformed
        posicionVacia();
        if (posiciones.equals("03")) {//no cambia
        } else {
            cambia(0, 3);
        }
    }//GEN-LAST:event_btn_03ActionPerformed

    private void btn_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_11ActionPerformed
        posicionVacia();
        if (posiciones.equals("11")) {//no cambia
        } else {
            cambia(1, 1);
        }
    }//GEN-LAST:event_btn_11ActionPerformed

    private void btn_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_10ActionPerformed
        posicionVacia();
        if (posiciones.equals("10")) {//no cambia
        } else {
            cambia(1, 0);
        }
    }//GEN-LAST:event_btn_10ActionPerformed

    private void btn_20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_20ActionPerformed
        posicionVacia();
        if (posiciones.equals("20")) {//no cambia
        } else {
            cambia(2, 0);
        }
    }//GEN-LAST:event_btn_20ActionPerformed

    private void btn_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_21ActionPerformed
        posicionVacia();
        if (posiciones.equals("21")) {//no cambia
        } else {
            cambia(2, 1);
        }
    }//GEN-LAST:event_btn_21ActionPerformed

    private void btn_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_12ActionPerformed
        posicionVacia();
        if (posiciones.equals("12")) {//no cambia
        } else {
            cambia(1, 2);
        }
    }//GEN-LAST:event_btn_12ActionPerformed

    private void btn_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_13ActionPerformed
        posicionVacia();
        if (posiciones.equals("13")) {//no cambia
        } else {
            cambia(1, 3);
        }
    }//GEN-LAST:event_btn_13ActionPerformed

    private void btn_23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_23ActionPerformed
        posicionVacia();
        if (posiciones.equals("23")) {//no cambia
        } else {
            cambia(2, 3);
        }
    }//GEN-LAST:event_btn_23ActionPerformed

    private void btn_30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_30ActionPerformed
        posicionVacia();
        if (posiciones.equals("30")) {//no cambia
        } else {
            cambia(3, 0);
        }
    }//GEN-LAST:event_btn_30ActionPerformed

    private void btn_31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_31ActionPerformed
        posicionVacia();
        if (posiciones.equals("31")) {//no cambia
        } else {
            cambia(3, 1);
        }
    }//GEN-LAST:event_btn_31ActionPerformed

    private void btn_33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_33ActionPerformed
        posicionVacia();
        if (posiciones.equals("33")) {//no cambia
        } else {
            cambia(3, 3);
        }
    }//GEN-LAST:event_btn_33ActionPerformed

    private void btn_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_22ActionPerformed
        posicionVacia();
        if (posiciones.equals("22")) {//no cambia
        } else {
            cambia(2, 2);
        }
    }//GEN-LAST:event_btn_22ActionPerformed

    private void btn_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_32ActionPerformed
        posicionVacia();
        if (posiciones.equals("32")) {//no cambia
        } else {
            cambia(3, 2);
        }
    }//GEN-LAST:event_btn_32ActionPerformed

    private void btn_00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_00ActionPerformed
        posicionVacia();
        if (posiciones.equals("00")) {//no cambia
        } else {
            cambia(0, 0);
        }
    }//GEN-LAST:event_btn_00ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        aleatorio();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        posicionVacia();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_02ActionPerformed
        posicionVacia();
        if (posiciones.equals("02")) {//no cambia
        } else {
            cambia(0, 2);
        }
    }//GEN-LAST:event_btn_02ActionPerformed
    public void aleatorio() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                double a = Math.random() * arreglo.length;
                int auxA = (int) a;
                double b = Math.random() * arreglo.length;
                int auxB = (int) a;

                String aux = arreglo[i][j];
                arreglo[i][j] = arreglo[auxA][auxB];
                arreglo[auxA][auxB] = aux;

            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == arreglo.length - 1 & i == arreglo.length - 1) {//[4][4]
                    estableceNumeros(i, j);
                } else {
                    estableceNumeros(i, j);
                    numeros++;
                }
            }
        }

    }

    public void estableceNumeros(int pos1, int pos2) {
        switch (pos1) {
            case 0:
                if (pos2 == 0) {//[0][0]
                    btn_00.setText(arreglo[0][0]);
                }
                if (pos2 == 1) {//[0][1]
                    btn_01.setText((String) arreglo[0][1]);
                }
                if (pos2 == 2) {//[0][2]
                    btn_02.setText((String) arreglo[0][2]);
                }
                if (pos2 == 3) {//[0][3]
                    btn_03.setText((String) arreglo[0][3]);
                }
                break;
            case 1:
                if (pos2 == 0) {//[1][0]
                    btn_10.setText((String) arreglo[1][0]);
                }
                if (pos2 == 1) {//[1][1]
                    btn_11.setText((String) arreglo[1][1]);
                }
                if (pos2 == 2) {//[1][2]
                    btn_12.setText((String) arreglo[1][2]);
                }
                if (pos2 == 3) {//[1][3]
                    btn_13.setText((String) arreglo[1][3]);
                }
                break;
            case 2:
                if (pos2 == 0) {//[2][0]
                    btn_20.setText((String) arreglo[2][0]);
                }
                if (pos2 == 1) {//[2][1]
                    btn_21.setText((String) arreglo[2][1]);
                }
                if (pos2 == 2) {//[2][2]
                    btn_22.setText((String) arreglo[2][2]);
                }
                if (pos2 == 3) {//[2][3]
                    btn_23.setText((String) arreglo[2][3]);
                }
                break;
            case 3:
                if (pos2 == 0) {//[3][0]
                    btn_30.setText((String) arreglo[3][0]);
                }
                if (pos2 == 1) {//[3][1]
                    btn_31.setText((String) arreglo[3][1]);
                }
                if (pos2 == 2) {//[3][2]
                    btn_32.setText((String) arreglo[3][2]);
                }
                if (pos2 == 3) {//[3][3]
                    btn_33.setText((String) arreglo[3][3]);
                }
                break;
        }
    }

    /*El metodo generaNumeros() genera numeros que van del 1 al 15 y los guarda en el arrreglo */
    public void generaNumeros() {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == arreglo.length - 1 & i == arreglo.length - 1) {//si la posicion es [4][4],no guarda nada en el arreglo(deja un espacio vacio)
                    estableceNumeros(i, j);
                } else {
                    arreglo[i][j] = "" + numeros;
                    estableceNumeros(i, j);
                    numeros++;
                }
            }
        }
    }

    /*Declaracion del metodo posicionVacia, el cual guarda la posicion en la que se encuentra vacio*/
    public void posicionVacia() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (arreglo[i][j] == null) {
                    System.out.println("[" + i + "]" + "[" + j + "]");
                    posiciones = "" + i + "" + j;
                }
            }
        }
    }

    /*El metodo mover (...), cambia el texto del boton oprimido al boton vacio y en el arreglo tambien*/
    public void mover(String a, String b) {
        int pos1A = Integer.parseInt(a.charAt(0) + "");
        int pos2A = Integer.parseInt(a.charAt(1) + "");

        int pos1B = Integer.parseInt(b.charAt(0) + "");
        int pos2B = Integer.parseInt(b.charAt(1) + "");
        String aux = getTextoBtn(pos1B, pos2B);
        setTextoBtn(pos1B, pos2B, getTextoBtn(pos1A, pos2A));
        setTextoBtn(pos1A, pos2A, aux);
        
        String auxA = arreglo[pos1B][pos2B];
        arreglo[pos1B][pos2B] = arreglo[pos1A][pos2A];
        arreglo[pos1A][pos2A] = auxA;

    }

    /*Declaracion del metodo cambia(...), cambia la posicion de los numeros, dependiendo de la posicion inicial*/
    public void cambia(int pos1, int pos2) {
        /*
         [0][0] [0][1] [0][2] [0][3]
         [1][0] [1][1] [1][2] [1][3]
         [2][0] [2][1] [2][2] [2][3]
         [3][0] [3][1] [3][2] [3][3]
         */
        switch (pos1) {
            case 0:
                if (pos2 == 0) {/*[0][0] presiona boton
                    ------------------------------------------*/
                    if (posiciones.equals("10")) {//[1][0] posicion vacia
                        mover("00", "10");//mover a la posicion vacia
                    }
                    if (posiciones.equals("01")) {//[0][1] posicion vacia
                        mover("00", "01");//mover a la posicion vacia
                    }
                    /*---------------------------------------------*/
                }
                if (pos2 == 1) {//[0][1] presiona boton                    
                    if (posiciones.equals("00")) {//[0][0] posicion vacia                        
                        mover("01", "00");//mover a la posicion vacia
                    }
                    if (posiciones.equals("02")) {//[0][2] posicion vacia                        
                        mover("01", "02");//mover a la posicion vacia
                    }
                    if (posiciones.equals("11")) {//[1][1] posicion vacia
                        mover("01", "11");//mover a la posicion vacia
                    }
                }
                if (pos2 == 2) {//[0][2] presiona boton
                    if (posiciones.equals("01")) {//[0][0] posicion vacia                        
                        mover("02", "01");//mover a la posicion vacia
                    }
                    if (posiciones.equals("03")) {//[0][2] posicion vacia                        
                        mover("02", "03");//mover a la posicion vacia
                    }
                    if (posiciones.equals("12")) {//[1][1] posicion vacia
                        mover("02", "12");//mover a la posicion vacia
                    }

                }
                if (pos2 == 3) {//[0][3] presiona boton                    
                    if (posiciones.equals("02")) {//[0][2] posicion vacia                        
                        mover("03", "02");//mover a la posicion vacia
                    }
                    if (posiciones.equals("13")) {//[1][1] posicion vacia
                        mover("03", "13");//mover a la posicion vacia
                    }
                }
                break;
            case 1:
                if (pos2 == 0) {//[1][0] presiona boton                    
                    if (posiciones.equals("00")) {//[0][2] posicion vacia                        
                        mover("10", "00");//mover a la posicion vacia
                    }
                    if (posiciones.equals("11")) {//[1][1] posicion vacia
                        mover("10", "11");//mover a la posicion vacia
                    }
                    if (posiciones.equals("20")) {//[1][1] posicion vacia
                        mover("10", "20");//mover a la posicion vacia
                    }
                }
                if (pos2 == 1) {//[1][1] presiona boton                    
                    if (posiciones.equals("10")) {//[0][2] posicion vacia                        
                        mover("11", "10");//mover a la posicion vacia
                    }
                    if (posiciones.equals("01")) {//[1][1] posicion vacia
                        mover("11", "01");//mover a la posicion vacia
                    }
                    if (posiciones.equals("12")) {//[1][1] posicion vacia
                        mover("11", "12");//mover a la posicion vacia
                    }
                    if (posiciones.equals("21")) {//[1][1] posicion vacia
                        mover("11", "21");//mover a la posicion vacia
                    }
                }
                if (pos2 == 2) {//[1][2] presiona boton                    
                    if (posiciones.equals("02")) {//[0][2] posicion vacia                        
                        mover("12", "02");//mover a la posicion vacia
                    }
                    if (posiciones.equals("22")) {//[1][1] posicion vacia
                        mover("12", "22");//mover a la posicion vacia
                    }
                    if (posiciones.equals("11")) {//[1][1] posicion vacia
                        mover("12", "11");//mover a la posicion vacia
                    }
                    if (posiciones.equals("13")) {//[1][1] posicion vacia
                        mover("12", "13");//mover a la posicion vacia
                    }
                }
                if (pos2 == 3) {//[1][3] presiona boton                    
                    if (posiciones.equals("12")) {//[0][2] posicion vacia                        
                        mover("13", "12");//mover a la posicion vacia
                    }
                    if (posiciones.equals("03")) {//[1][1] posicion vacia
                        mover("13", "03");//mover a la posicion vacia
                    }
                    if (posiciones.equals("23")) {//[1][1] posicion vacia
                        mover("13", "23");//mover a la posicion vacia
                    }
                }                
                
                break;
            case 2:                
                if (pos2 == 0) {//[2][0] presiona boton                    
                    if (posiciones.equals("10")) {//[1][0] posicion vacia                        
                        mover("20", "10");//mover a la posicion vacia
                    }
                    if (posiciones.equals("21")) {//[2][1] posicion vacia
                        mover("20", "21");//mover a la posicion vacia
                    }
                    if (posiciones.equals("30")) {//[3][0] posicion vacia
                        mover("20", "30");//mover a la posicion vacia
                    }
                }
                if (pos2 == 1) {//[2][1] presiona boton                    
                    if (posiciones.equals("20")) {//[2][0] posicion vacia                        
                        mover("21", "20");//mover a la posicion vacia
                    }
                    if (posiciones.equals("22")) {//[1][1] posicion vacia
                        mover("21", "22");//mover a la posicion vacia
                    }
                    if (posiciones.equals("11")) {//[1][1] posicion vacia
                        mover("21", "11");//mover a la posicion vacia
                    }
                    if (posiciones.equals("31")) {//[1][1] posicion vacia
                        mover("21", "31");//mover a la posicion vacia
                    }
                }
                if (pos2 == 2) {//[2][2] presiona boton                    
                    if (posiciones.equals("21")) {//[0][2] posicion vacia                        
                        mover("22", "21");//mover a la posicion vacia
                    }
                    if (posiciones.equals("12")) {//[1][1] posicion vacia
                        mover("22", "12");//mover a la posicion vacia
                    }
                    if (posiciones.equals("23")) {//[1][1] posicion vacia
                        mover("22", "23");//mover a la posicion vacia
                    }
                    if (posiciones.equals("32")) {//[1][1] posicion vacia
                        mover("22", "32");//mover a la posicion vacia
                    }
                }
                if (pos2 == 3) {//[2][3] presiona boton                    
                    if (posiciones.equals("22")) {//[0][2] posicion vacia                        
                        mover("23", "22");//mover a la posicion vacia
                    }
                    if (posiciones.equals("13")) {//[1][1] posicion vacia
                        mover("23", "13");//mover a la posicion vacia
                    }
                    if (posiciones.equals("33")) {//[1][1] posicion vacia
                        mover("23", "33");//mover a la posicion vacia
                    }
                }
                
                break;
            case 3:                
                if (pos2 == 0) {//[3][0] presiona boton                    
                    if (posiciones.equals("20")) {//[0][2] posicion vacia                        
                        mover("30", "20");//mover a la posicion vacia
                    }
                    if (posiciones.equals("31")) {//[1][1] posicion vacia
                        mover("30", "31");//mover a la posicion vacia
                    }
                }
                if (pos2 == 1) {//[3][1] presiona boton                    
                    if (posiciones.equals("30")) {//[0][2] posicion vacia                        
                        mover("31", "30");//mover a la posicion vacia
                    }
                    if (posiciones.equals("21")) {//[1][1] posicion vacia
                        mover("31", "21");//mover a la posicion vacia
                    }
                    if (posiciones.equals("32")) {//[1][1] posicion vacia
                        mover("31", "32");//mover a la posicion vacia
                    }
                }
                if (pos2 == 2) {//[3][2] presiona boton                    
                    if (posiciones.equals("31")) {//[0][2] posicion vacia                        
                        mover("32", "31");//mover a la posicion vacia
                    }
                    if (posiciones.equals("22")) {//[1][1] posicion vacia
                        mover("32", "22");//mover a la posicion vacia
                    }
                    if (posiciones.equals("33")) {//[1][1] posicion vacia
                        mover("32", "33");//mover a la posicion vacia
                    }
                }
                if (pos2 == 3) {//[3][3] presiona boton                    
                    if (posiciones.equals("32")) {//[0][2] posicion vacia                        
                        mover("33", "32");//mover a la posicion vacia
                    }
                    if (posiciones.equals("23")) {//[1][1] posicion vacia
                        mover("33", "23");//mover a la posicion vacia
                    }
                }
                break;
        }

    }

    /*El metodo setTextoBtn(...) cambia el texto deacurdo a la posicion asignada*/
    public void setTextoBtn(int pos1, int pos2, String texto) {
        switch (pos1) {
            case 0:
                if (pos2 == 0) {//[0][0]
                    btn_00.setText(texto);
                }
                if (pos2 == 1) {//[0][1]
                    btn_01.setText(texto);
                }
                if (pos2 == 2) {//[0][2]
                    btn_02.setText(texto);
                }
                if (pos2 == 3) {//[0][3]
                    btn_03.setText(texto);
                }
                break;
            case 1:
                if (pos2 == 0) {//[1][0] presiona boton                                         
                    btn_10.setText(texto);
                }
                if (pos2 == 1) {//[1][1] presiona boton                    
                    btn_11.setText(texto);
                }
                if (pos2 == 2) {//[1][2]
                    btn_12.setText(texto);
                }
                if (pos2 == 3) {//[1][3]
                    btn_13.setText(texto);
                }
                break;
            case 2:
                if (pos2 == 0) {//[2][0] presiona boton                                         
                    btn_20.setText(texto);
                }
                if (pos2 == 1) {//[2][1] presiona boton                    
                    btn_21.setText(texto);
                }
                if (pos2 == 2) {//[2][2]
                    btn_22.setText(texto);
                }
                if (pos2 == 3) {//[2][3]
                    btn_23.setText(texto);
                }
                break;
            case 3:
                if (pos2 == 0) {//[3][0] presiona boton                                         
                    btn_30.setText(texto);
                }
                if (pos2 == 1) {//[3][1] presiona boton                    
                    btn_31.setText(texto);
                }
                if (pos2 == 2) {//[3][2]
                    btn_32.setText(texto);
                }
                if (pos2 == 3) {//[3][3]
                    btn_33.setText(texto);
                }
                break;
        }
    }

    /*El metodo getTextoBtn(...) cobtiene el texto deacurdo a la posicion asignada*/
    public String getTextoBtn(int pos1, int pos2) {
        switch (pos1) {
            case 0:
                if (pos2 == 0) {//[0][0]
                    return btn_00.getText();
                }
                if (pos2 == 1) {//[0][1]
                    return btn_01.getText();
                }
                if (pos2 == 2) {//[0][2]
                    return btn_02.getText();
                }
                if (pos2 == 3) {//[0][3]
                    return btn_03.getText();
                }
                break;
            case 1:
                if (pos2 == 0) {//[1][0] presiona boton                                         
                    return btn_10.getText();
                }
                if (pos2 == 1) {//[1][1] presiona boton                    
                    return btn_11.getText();
                }
                if (pos2 == 2) {//[1][2]
                    return btn_12.getText();
                }
                if (pos2 == 3) {//[1][3]
                    return btn_13.getText();
                }
                break;
            case 2:
                if (pos2 == 0) {//[2][0] presiona boton                                         
                    return btn_20.getText();
                }
                if (pos2 == 1) {//[2][1] presiona boton                    
                    return btn_21.getText();
                }
                if (pos2 == 2) {//[2][2]
                    return btn_22.getText();
                }
                if (pos2 == 3) {//[2][3]
                    return btn_23.getText();
                }
                break;
            case 3:
                if (pos2 == 0) {//[3][0] presiona boton                                         
                    return btn_30.getText();
                }
                if (pos2 == 1) {//[3][1] presiona boton                    
                    return btn_31.getText();
                }
                if (pos2 == 2) {//[3][2]
                    return btn_32.getText();
                }
                if (pos2 == 3) {//[3][3]
                    return btn_33.getText();
                }
                break;
        }
        return "";
    }

    public static void main(String args[]) {
        I_CuboMagico a = new I_CuboMagico();
        a.setVisible(true);
        a.generaNumeros();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_00;
    private javax.swing.JButton btn_01;
    private javax.swing.JButton btn_02;
    private javax.swing.JButton btn_03;
    private javax.swing.JButton btn_10;
    private javax.swing.JButton btn_11;
    private javax.swing.JButton btn_12;
    private javax.swing.JButton btn_13;
    private javax.swing.JButton btn_20;
    private javax.swing.JButton btn_21;
    private javax.swing.JButton btn_22;
    private javax.swing.JButton btn_23;
    private javax.swing.JButton btn_30;
    private javax.swing.JButton btn_31;
    private javax.swing.JButton btn_32;
    private javax.swing.JButton btn_33;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}