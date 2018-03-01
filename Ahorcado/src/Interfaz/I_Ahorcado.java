package Interfaz;
/*Importacion de las librerias utilizadas en la clase I_Ahorcado*/

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/*Autor:[EEllisonJM]*/
/*Declaracion de la clase I_Ahorcado que extiende(hereda) a la clase JFrame*/

public class I_Ahorcado extends javax.swing.JFrame {//Inicio de la implementacion de la clase I_Ahorcado
    /*Declaracion de variables(Atributos) a la clase I_Ahorcado*/

    ArrayList<String> listaPalabras = new <String>ArrayList();/*Declaracion del ArrayList de tipo String a listaPalabras*/

    String[] listaPalabraSecreta = {
        "Hurricane","Wildfires","Thunder","Tornado","Hailstorm",
    "Lightning"};/*Declaramos una lista de palabras secretas a encntrar*/
    
        //"Lisa", "Homero", "Marzo", "Wendy", "Momia", "Helado", "Alex", "Martinez"};/*Declaramos una lista de palabras secretas a encntrar*/

    String palabraSecreta;/*Declaracion del atributo palabraSecreta en el cual se almacenara algun String de la listaPalabraSecreta*/

    String txtOculto = "";/*Declaracion del atributo txtOculto el cual sera el texto aculto a mostrar en la interfaz*/

    int contador = 0;/*Declaracion de un contador, el cual indicara el numero de errores que cometa el usuario*/

    /*Declaracion del constructor de la clase I_Ahorcado*/

    public I_Ahorcado() {        
        initComponents();
        jPanel2.setBackground(new Color(100, 120, 100, 100));
       //txtEscondido.setBackground(new Color(100, 120, 100, 100));
    }
    /*Declaracion del metodo cargarDeterminado() el cual a de cargar a la lista los datos cargados anteriormente en listaPalabraSecreta*/

    public void cargarDeterminado() {
        for (int i = 0; i < listaPalabraSecreta.length; i++) {
            listaPalabras.add(listaPalabraSecreta[i]);/*Se agrega a la lista*/

        }
        palabraSecreta = listaPalabras.get((int) Math.random() * listaPalabras.size()/*8*/);/*Escogemos una de las 8 palabras secretas aleatoriamente y las guardamos en un String*/
        txtEscondido.setEditable(false);
    }
    /*Declaracion del metodo inicioPalabraEscondida()- Muestra la primera Letra de la palabra secreta en la interfaz*/

    public void inicioPalabraEscondida() {
        char[] auxTxtOculto = new char[palabraSecreta.length()];
        /*Creamos espacios con (guiones bajos)*/
        for (int i = 0; i < palabraSecreta.length(); i++) {//5
            if (i == 0) {/*Si i es igual a cero*/

                auxTxtOculto[i] = palabraSecreta.charAt(i);/*Ingresamos el Inicio de la palabra en la primera posicion*/

            } else {
                auxTxtOculto[i] = '_';/*ingresamos guion bajo en cada posicion*/

            }
        }
        /*Separamos con espacios vacios a los guiones bajos*/
        for (int i = 0; i < auxTxtOculto.length; i++) {
            if (i == auxTxtOculto.length - 1) {/*Si i es igual al tamaño del auxTxtOculro-1*/

                txtOculto += auxTxtOculto[i];/*Concatenamos con el auxTxtOculto en l posicion i*/

            } else {
                txtOculto += auxTxtOculto[i] + " ";/*Concatenamos los guiones bajos con espacios vacios para separarlo*/

            }
        }
        txtEscondido.setText(txtOculto);/*Cambiamos el texto txtEscondido en la interfaz con el nuevo txtOculto*/

    }
    /*Declaracion del metodo existeEnPalabra(JTextField p) - Devuelve true en caso de que la letra ingresada se encuentre dentro de la palabra secreta*/

    public boolean letraExisteEnPalabra(JTextField p) {
        for (int i = 1; i < palabraSecreta.length(); i++) {/*Iniciamos en 1 porque la primera letra es visible*/

            if (p.getText().charAt(0) == palabraSecreta.charAt(i)) {/*Si la letra ingresada es igual a alguno de las letras que se encuentra en palabraSecreta*/

                return true;/*regresamos true(verdadero)*/

            }
        }
        return false;/*De no coincidir con alguna letra regresamos false (falso)*/

    }
    /*Declaracion del metodo repiteEnPalabra(...) el cual nos devuelve las veces que se repite la letra en la palabra secreta*/

    public int repiteLetraEnPalabra(JTextField p) {
        int conta = 0;/*Declaramos un contador, el cual nos ira indicando las veces que se repite la letra en la palabra secreta*/

        if (letraExisteEnPalabra(p) == true) {/*Si la letra existe en palabra igual a verdadero (true)*/

            for (int i = 1; i < palabraSecreta.length(); i++) {/*Inicia en 1 porque ya sabemos la primera letra*/

                if (p.getText().charAt(0) == palabraSecreta.charAt(i)) {/*Si la letra ingresada es igual a alguno de las letras que se encuentra en palabraSecreta*/

                    conta++;/*Aumentamos el conta*/

                }
            }
        }
        return conta;/*Regresa el contador el cual nos indica el numero de veces que se repite la letra en la palabra*/

    }
    /*Declaracion del metodo posicionesExisteLetra, el cual nos devuelve un arreglo con las posiciones de las letras que se encuentran dentro de la palabra secreta*/

    public String[] posicionesExisteLetra(JTextField p) {
        String a[] = new String[repiteLetraEnPalabra(p)];/*Guardamos en un arreglo las veces que se repite la letra en la palabra secreta*/

        int conta = 0;/*Declaramos un contador, el cual nos servira para guardar las posiciones en las que se encuentra la letra dentro del arreglo*/

        if (letraExisteEnPalabra(p) == true) {/*Si la letra ingresada existe en la palabra secreta*/

            for (int i = 1; i < palabraSecreta.length(); i++) {/*Inicia en 1 porque ya sabemos la primera letra*/

                if (p.getText().charAt(0) == palabraSecreta.charAt(i)) {/*Si la letra ingresada es igual a alguno de las letras que se encuentra en palabraSecreta*/

                    a[conta] = i + "";/*Guardamos las posiciones en las que se encuentra la letra en el arreglo*/

                    conta++;/*aumentamos el contador +1*/

                }
            }
        }
        return a;/*Regresamos el arreglo con las posiciones de las letras que se encuentra dentro de la palabra secreta*/

    }
    /*Declaracion del metodo reemplazaTexto, el cual reemplaza el txtEscodido de la interfaz*/

    public void reemplazaTexto(int posicion) {
        String auxTxtOculto = "";/*Declaracion del un auxiliar txtOculto*/

        for (int i = 0; i < txtOculto.length(); i++) {
            if (i == (posicion * 2)) {/*Si i es igual a (posicion x 2)*/

                auxTxtOculto += palabraSecreta.charAt(posicion);/*concatenamos con la palabra secreta en la posicion posicion */

            } else {
                auxTxtOculto += txtOculto.charAt(i);/*Concatenamos con el txtOculto en la posicion i*/

            }
        }
        txtOculto = auxTxtOculto;/*txtOculto igual a auxTxtOculto*/

        txtEscondido.setText(auxTxtOculto);/*cambiamos el txtEscondido en la interfaz*/

        ganador();/*declaramos el metodo ganador*/

    }
    /*Declaracion del metodo ganador, el cual nos muestra un cuadro de dialogo diciendo que el usuario ha ganado*/

    public void ganador() {
        String auxTxtEscondido = txtEscondido.getText().replaceAll(" ", "");/*Quitamos espacios en blanco y juntamos las letras para formar la palabra* y la guardamos en un auxiliar*/

        if (palabraSecreta.equals(auxTxtEscondido)) {/*Si palabraSecreta es igual a auxTxtEscondido*/

            JOptionPane.showMessageDialog(null, "you win!!!"/*message*/,
                    palabraSecreta/*title*/, -1/*messageType*/,
                    new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/PollitoBuscador.gif")).getImage())/*icon*/);
            reiniciar();/*Una vez que gana se reinicia el juego*/

        }
    }
    /*Declaracion del metodo error el cual ira cambiando la imagen de fondo dependiento del numero de errores cometidos por el usuario*/

    public void error(int e) {
        switch (e) {
            case 1:
                jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AHO_2.jpg"))); // NOI18N
                break;
            case 2:
                jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AHO_3.jpg"))); // NOI18N
                break;
            case 3:
                jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AHO_4.jpg"))); // NOI18N
                break;
            case 4:
                jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AHO_5.jpg"))); // NOI18N
                break;
            case 5:
                jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AHO_6.jpg"))); // NOI18N
                JOptionPane.showMessageDialog(null, "GAME OVER\nSuerte pa la proxima");
                reiniciar();
                break;
        }
    }
    /*Declaracion del metodo auxReemplazaTexto(...) el cual reemplaza con un nuevo texto dependiendo de la letra ingresada*/

    public void auxReemplazaTexto(JTextField p) {
        if (letraExisteEnPalabra(p) == true) {
            String a[] = posicionesExisteLetra(p);
            for (int i = 0; i < a.length; i++) {
                reemplazaTexto(Integer.parseInt(a[i]));
            }
        } else {
            contador++;
            error(contador);
        }
    }
    /*Declaracion del metodo reinciar el cual reinicia un juego completamente nuevo*/

    public void reiniciar() {

        palabraSecreta = listaPalabras.get((int) (Math.random() * listaPalabras.size()/*8*/));/*Iniciamos con una nueva palabra secreta de las 8 posibles que se encuentran dentro de la listaPalabraSecreta*/

        txtOculto = "";/*El txtOculto se deja vacio*/

        contador = 0;/*El contador se inicializa en 0*/

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AHO_1.jpg")));/*Cambiamos la imagen de fondoa la imagen 1*/

        inicioPalabraEscondida();/*Mostramos el inicio de la nueva palabra secreta*/

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jButtonIngresar = new javax.swing.JButton();
        jLabelEncuentra = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtEscondido = new javax.swing.JTextField();
        jButtonReiniciar = new javax.swing.JButton();
        txtIngresar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setOpaque(false);

        jButtonIngresar.setText("INSERT");
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });

        jLabelEncuentra.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabelEncuentra.setText("FOUND");

        txtEscondido.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txtEscondido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEscondidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEscondido, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtEscondido, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButtonReiniciar.setText("RESTART");
        jButtonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReiniciarActionPerformed(evt);
            }
        });

        txtIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtIngresarMouseEntered(evt);
            }
        });
        txtIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngresarActionPerformed(evt);
            }
        });

        jButton1.setText("WORDS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ADD");
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
                .addContainerGap(368, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelEncuentra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonIngresar)
                            .addComponent(jButtonReiniciar))
                        .addGap(24, 24, 24))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(315, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelEncuentra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonIngresar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonReiniciar)
                .addGap(20, 20, 20))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AHO_1.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jLabelFondo, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed
        auxReemplazaTexto(txtIngresar);
        txtIngresar.setText("");
    }//GEN-LAST:event_jButtonIngresarActionPerformed

    private void txtEscondidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEscondidoActionPerformed

    }//GEN-LAST:event_txtEscondidoActionPerformed

    private void jButtonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReiniciarActionPerformed
        reiniciar();
    }//GEN-LAST:event_jButtonReiniciarActionPerformed

    private void txtIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIngresarActionPerformed
        if (evt.getSource() == txtIngresar) {
            auxReemplazaTexto(txtIngresar);
            txtIngresar.setText("");

        }
    }//GEN-LAST:event_txtIngresarActionPerformed

    private void txtIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIngresarMouseEntered
        /*mouse cerca*/
    }//GEN-LAST:event_txtIngresarMouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String asd;
        int contador = 0;
        do {
            if (contador > 0) {
                JOptionPane.showMessageDialog(null, "Palabra existe en la lista");
            }
            asd = JOptionPane.showInputDialog(null, "Ingresa palabra");

            contador++;

        } while (existe(asd) == true);
        listaPalabras.add(asd);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String as = "";
        for (int i = 0; i < listaPalabras.size(); i++) {
            as += (i + 1 + "       " + listaPalabras.get(i) + "\n");
        }
        JOptionPane.showMessageDialog(null, as);
    }//GEN-LAST:event_jButton1ActionPerformed

    public boolean existe(String a) {
        for (int i = 0; i < listaPalabras.size(); i++) {
            if (listaPalabras.get(i).equals(a)) {
                return true;
            }
        }
        return false;

    }

    public static void main(String args[]) {
        I_Ahorcado a = new I_Ahorcado();
        a.setVisible(true);
        a.cargarDeterminado();
        a.inicioPalabraEscondida();

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JButton jButtonReiniciar;
    private javax.swing.JLabel jLabelEncuentra;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtEscondido;
    private javax.swing.JTextField txtIngresar;
    // End of variables declaration//GEN-END:variables
}//Fin de la implementacion de la clase I_Ahorcado
