
package Vista;

import Modelo.Avion;
import Modelo.Helicoptero;
import Modelo.Moto;
import Modelo.automovil;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis Fernando Paxel
 */
public class frm_uno extends javax.swing.JFrame {

    DefaultTableModel avion;
    DefaultTableModel autos, motos, heli;
    ArrayList<Moto> lista = new ArrayList<Moto>();
    ArrayList<automovil> lista1 = new ArrayList<automovil>();
    ArrayList<Avion> lista2 = new ArrayList<Avion>();
    ArrayList<Helicoptero> lista3 = new ArrayList<Helicoptero>();

    fondopanel fondo1 = new fondopanel();

    public frm_uno() {
        this.setContentPane(fondo1);
        initComponents();
        setLocationRelativeTo(null);
/*
        autos = new DefaultTableModel();
        String encabezado[] = {"Tipo", "Placas", "Marca", "Modelo", "Llantas", "Capacidad", "Color", "No Puerta", "Velocidad", "Asientos"};
        autos.setColumnIdentifiers(encabezado);
        Tabla_movil.setModel(autos);

        motos = new DefaultTableModel();
        String encabezado1[] = {"Tipo", "Placas", "Marca", "Modelo", "Llantas", "Capacidad", "Color", "No Puerta", "Velocidad", "Asientos"};
        motos.setColumnIdentifiers(encabezado1);
        Tab_moto.setModel(motos);

        avion = new DefaultTableModel();
        String encabezado3[] = {"Tipo", "Placas", "Marca", "Modelo", "Llantas", "Capacidad", "Color", "No Puerta", "Velocidad", "Asientos"};
        avion.setColumnIdentifiers(encabezado3);
        Tabla_av.setModel(avion);

        heli = new DefaultTableModel();
        String encabezado4[] = {"Tipo", "Placas", "Marca", "Modelo", "Llantas", "Capacidad", "Color", "No Puerta", "Velocidad", "Asientos"};
        heli.setColumnIdentifiers(encabezado4);
        Tabla_h.setModel(heli);
*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Textplaca = new javax.swing.JTextField();
        Combotip = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Textmarca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Tabla_avion = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_av = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla_h = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tab_moto = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        Tabla_movil = new javax.swing.JTable();
        Combomodelo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        Comollanta = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        Combocapa = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        Comocolor = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        Comopuerta = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        Textvel = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Comboas = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Bienvenido al sistema");

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Placas: ");

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Tipo: ");

        Textplaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Textplaca.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 255, 255), new java.awt.Color(255, 255, 0), new java.awt.Color(0, 255, 0)));

        Combotip.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Combotip.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Avion", "Helicoptero", "Moto", "Automovil" }));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cliente.png"))); // NOI18N
        jButton1.setText("Aceptar");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel4.setText("Marca: ");

        Textmarca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Textmarca.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 255, 255), new java.awt.Color(255, 255, 0), new java.awt.Color(0, 255, 0)));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel5.setText("Modelo: ");

        Tabla_avion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 0), new java.awt.Color(255, 255, 0)));

        Tabla_av.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(Tabla_av);

        Tabla_avion.addTab("Avion", jScrollPane2);

        Tabla_h.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), java.awt.Color.cyan, new java.awt.Color(255, 255, 0), new java.awt.Color(0, 204, 0)));
        Tabla_h.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(Tabla_h);

        Tabla_avion.addTab("Helicoptero", jScrollPane3);

        Tab_moto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tab_moto);

        Tabla_avion.addTab("Moto", jScrollPane1);

        Tabla_movil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(Tabla_movil);

        Tabla_avion.addTab("Automovil", jScrollPane5);

        Combomodelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2002", "2003", "2004", "2005", "2006", "2007", "2008" }));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel6.setText("Llantas");

        Comollanta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "6", "8" }));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel7.setText("Capacidad: ");

        Combocapa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "16", "32", "100", "2" }));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel8.setText("Color: ");

        Comocolor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Azul", "Blanco", "Negro", "Rojo", "Azul", "Gris" }));

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel9.setText("No. Puertas");

        Comopuerta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "0", "2", "6", "1" }));

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel10.setText("Velocidad: ");

        Textvel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Textvel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 255, 255), new java.awt.Color(255, 255, 0), new java.awt.Color(0, 255, 0)));

        jLabel11.setText("Asientos: ");

        Comboas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "6", "120", "75" }));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        jButton2.setText("Salir");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Comopuerta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Comocolor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Comollanta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Combomodelo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Combocapa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(95, 95, 95)
                                .addComponent(Combotip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Textmarca, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Textplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(6, 6, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(68, 68, 68)
                                .addComponent(Comboas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(36, 36, 36)
                                .addComponent(Textvel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(146, 146, 146))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(217, 217, 217))
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tabla_avion)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Combotip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10)
                    .addComponent(Textvel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(Comboas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Textplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(Textmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Combomodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Comollanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Combocapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Comocolor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Comopuerta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(Tabla_avion, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String s = Combotip.getSelectedItem().toString();
        /*
   switch(s){
       case "Avion":
       String datos[] = new String[11];
        datos[0] = Combotip.getSelectedItem().toString();
        datos[1] = Textplaca.getText();
        datos[2] = Textmarca.getText();
        datos[3] = Combomodelo.getSelectedItem().toString();
        datos[4] = Comollanta.getSelectedItem().toString();
        datos[5] = Combocapa.getSelectedItem().toString();
        datos[6] = Comocolor.getSelectedItem().toString();
        datos[7] = Comopuerta.getSelectedItem().toString();
        datos[8] = Textvel.getText();
       datos[9] = Comboas.getSelectedItem().toString();
        avion.addRow(datos);
        break;
        
       case "Helicoptero":
          String datos1[] = new String[11];
        datos1[0] = Combotip.getSelectedItem().toString();
        datos1[1] = Textplaca.getText();
        datos1[2] = Textmarca.getText();
        datos1[3] = Combomodelo.getSelectedItem().toString();
        datos1[4] = Comollanta.getSelectedItem().toString();
        datos1[5] = Combocapa.getSelectedItem().toString();
        datos1[6] = Comocolor.getSelectedItem().toString();
        datos1[7] = Comopuerta.getSelectedItem().toString();
        datos1[8] = Textvel.getText();
        datos1[9] = Comboas.getSelectedItem().toString();
        heli.addRow(datos1);
        break;
        
         case "Moto":
          String datos2[] = new String[11];
        datos2[0] = Combotip.getSelectedItem().toString();
        datos2[1] = Textplaca.getText();
        datos2[2] = Textmarca.getText();
        datos2[3] = Combomodelo.getSelectedItem().toString();
        datos2[4] = Comollanta.getSelectedItem().toString();
        datos2[5] = Combocapa.getSelectedItem().toString();
        datos2[6] = Comocolor.getSelectedItem().toString();
        datos2[7] = Comopuerta.getSelectedItem().toString();
        datos2[8] = Textvel.getText();
        datos2[9] = Comboas.getSelectedItem().toString();
        motos.addRow(datos2);
        break;
        
         case "Automovil":
          String datos3[] = new String[11];
        datos3[0] = Combotip.getSelectedItem().toString();
        datos3[1] = Textplaca.getText();
        datos3[2] = Textmarca.getText();
        datos3[3] = Combomodelo.getSelectedItem().toString();
        datos3[4] = Comollanta.getSelectedItem().toString();
        datos3[5] = Combocapa.getSelectedItem().toString();
        datos3[6] = Comocolor.getSelectedItem().toString();
        datos3[7] = Comopuerta.getSelectedItem().toString();
        datos3[8] = Textvel.getText();
        datos3[9] = Comboas.getSelectedItem().toString();
        autos.addRow(datos3);
        break;
    }
         */
        String Modelo = Combomodelo.getSelectedItem().toString();
        String Llantas = Comollanta.getSelectedItem().toString();
        int llan = Integer.parseInt(Llantas);
        String Color = Comocolor.getSelectedItem().toString();
        String Capas = Combocapa.getSelectedItem().toString();
        int Capas1 = Integer.parseInt(Capas);

        String Puertas = Comopuerta.getSelectedItem().toString();
        int Puertas2 = Integer.parseInt(Puertas);

        String Acientos = Comboas.getSelectedItem().toString();
        int Acientos2 = Integer.parseInt(Acientos);

        switch (s) {
            case "Moto":

                Moto moto = new Moto(s, Textplaca.getText(), Textmarca.getText(), Modelo, llan, Capas1, Color, Puertas2, Textvel.getText(), Acientos2);
                lista.add(moto);
                mostrar();
                break;

            case "Automovil":

                automovil auto = new automovil(s, Textplaca.getText(), Textmarca.getText(), Modelo, llan, Capas1, Color, Puertas2, Textvel.getText(), Acientos2);
                lista1.add(auto);
                mostrar2();
                break;

            case "Avion":

                Avion av = new Avion(s, Textplaca.getText(), Textmarca.getText(), Modelo, llan, Capas, Color, Puertas2, Textvel.getText(), Acientos2);
                lista2.add(av);
                mostrar3();
                break;

            case "Helicoptero":

                Helicoptero he = new Helicoptero(s, Textplaca.getText(), Textmarca.getText(), Modelo, llan, Capas, Color, Puertas2, Acientos2);
                lista3.add(he);
                mostrar4();
                break;

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void mostrar() {

        String ma[][] = new String[lista.size()][10];

        int me[][] = new int[lista.size()][10];

        for (int i = 0; i < lista.size(); i++) {
            String mar = String.valueOf(me[i][4] = lista.get(i).getLlantas());
            String Capacidad = String.valueOf(me[i][5] = lista.get(i).getCapacidad());
            String Puertas = String.valueOf(me[i][7] = lista.get(i).getPuerta());
            String Asientos = String.valueOf(me[i][9] = lista.get(i).getAsientos());

            ma[i][0] = lista.get(i).getTipo();
            ma[i][1] = lista.get(i).getPlacas();
            ma[i][2] = lista.get(i).getMarca();
            ma[i][3] = lista.get(i).getModelo();
            ma[i][4] = mar;
            ma[i][5] = Capacidad;
            ma[i][6] = lista.get(i).getColor();
            ma[i][7] = Puertas;
            ma[i][8] = lista.get(i).getVelocidad();
            ma[i][9] = Asientos;

            Tab_moto.setModel(new javax.swing.table.DefaultTableModel(
                    ma,
                    new String[]{
                        "Tipo", "Placas", "Marca", "Modelo", "Llantas", "Capacidad", "Color", "No. Puerta", "Velocidad", "Asientos"
                    }
            ));
        }
    }

    public void mostrar2() {

        String ma[][] = new String[lista1.size()][10];

        int me[][] = new int[lista1.size()][10];

        for (int i = 0; i < lista1.size(); i++) {
            String mar = String.valueOf(me[i][4] = lista1.get(i).getLlantas());
            String Capacidad = String.valueOf(me[i][5] = lista1.get(i).getCapacidad());
            String Puertas = String.valueOf(me[i][7] = lista1.get(i).getPuerta());
            String Asientos = String.valueOf(me[i][9] = lista1.get(i).getAsientos());

            ma[i][0] = lista1.get(i).getTipo();
            ma[i][1] = lista1.get(i).getPlacas();
            ma[i][2] = lista1.get(i).getMarca();
            ma[i][3] = lista1.get(i).getModelo();
            ma[i][4] = mar;
            ma[i][5] = Capacidad;
            ma[i][6] = lista1.get(i).getColor();
            ma[i][7] = Puertas;
            ma[i][8] = lista1.get(i).getVelocidad();
            ma[i][9] = Asientos;

            Tabla_movil.setModel(new javax.swing.table.DefaultTableModel(
                    ma,
                    new String[]{
                        "Tipo", "Placas", "Marca", "Modelo", "Llantas", "Capacidad", "Color", "No. Puerta", "Velocidad", "Asientos"
                    }
            ));
        }
    }

    public void mostrar3() {

        String ma[][] = new String[lista2.size()][10];

        int me[][] = new int[lista2.size()][10];

        for (int i = 0; i < lista2.size(); i++) {
            String mar = String.valueOf(me[i][4] = lista2.get(i).getLlantas());
            String Puertas = String.valueOf(me[i][7] = lista2.get(i).getPuerta());
            String Asientos = String.valueOf(me[i][9] = lista2.get(i).getAsientos());

            ma[i][0] = lista2.get(i).getTipo_avion();
            ma[i][1] = lista2.get(i).getPlacas();
            ma[i][2] = lista2.get(i).getMarca();
            ma[i][3] = lista2.get(i).getModelo();
            ma[i][4] = mar;
            ma[i][5] = lista2.get(i).getCapacidad();
            ma[i][6] = lista2.get(i).getColor();
            ma[i][7] = Puertas;
            ma[i][8] = lista2.get(i).getVelocidad();
            ma[i][9] = Asientos;

            Tabla_av.setModel(new javax.swing.table.DefaultTableModel(
                    ma,
                    new String[]{
                        "Tipo", "Placas", "Marca", "Modelo", "Llantas", "Capacidad", "Color", "No. Puerta", "Velocidad", "Asientos"
                    }
            ));
        }
    }

    public void mostrar4() {

        String ma[][] = new String[lista3.size()][10];

        int me[][] = new int[lista3.size()][10];

        for (int i = 0; i < lista3.size(); i++) {
            String mar = String.valueOf(me[i][4] = lista3.get(i).getLlantas());
            String Puertas = String.valueOf(me[i][7] = lista3.get(i).getPuerta());
            String Asientos = String.valueOf(me[i][9] = lista3.get(i).getAsientos());

            ma[i][0] = lista3.get(i).getTipo_avion();
            ma[i][1] = lista3.get(i).getPlacas();
            ma[i][2] = lista3.get(i).getMarca();
            ma[i][3] = lista3.get(i).getModelo();
            ma[i][4] = mar;
            ma[i][5] = lista3.get(i).getCapacidad_tripulante();
            ma[i][6] = lista3.get(i).getColor();
            ma[i][7] = Puertas;
            ma[i][8] = "Normal";
            ma[i][9] = Asientos;

            Tabla_h.setModel(new javax.swing.table.DefaultTableModel(
                    ma,
                    new String[]{
                        "Tipo", "Placas", "Marca", "Modelo", "Llantas", "Capacidad", "Color", "No. Puerta", "Velocidad", "Asientos"
                    }
            ));
        }
    }

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
            java.util.logging.Logger.getLogger(frm_uno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_uno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_uno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_uno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_uno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Comboas;
    private javax.swing.JComboBox<String> Combocapa;
    private javax.swing.JComboBox<String> Combomodelo;
    private javax.swing.JComboBox<String> Combotip;
    private javax.swing.JComboBox<String> Comocolor;
    private javax.swing.JComboBox<String> Comollanta;
    private javax.swing.JComboBox<String> Comopuerta;
    private javax.swing.JTable Tab_moto;
    private javax.swing.JTable Tabla_av;
    private javax.swing.JTabbedPane Tabla_avion;
    private javax.swing.JTable Tabla_h;
    private javax.swing.JTable Tabla_movil;
    private javax.swing.JTextField Textmarca;
    private javax.swing.JTextField Textplaca;
    private javax.swing.JTextField Textvel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
class fondopanel extends JPanel {

        private Image imagen;

        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/Textura22.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
