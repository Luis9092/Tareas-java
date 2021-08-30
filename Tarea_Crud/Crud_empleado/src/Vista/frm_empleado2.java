package Vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.Conexion;
import modelo.Empleado;

/**
 *
 * @author Luis Fernando Paxel
 */
public class frm_empleado2 extends javax.swing.JFrame {

    Conexion cn;
    fondopanel fondos = new fondopanel();
    Empleado obj_empleado;

    public frm_empleado2() {
        this.setContentPane(fondos);
        initComponents();
        obj_empleado = new Empleado();

        setLocationRelativeTo(null);
        combo();
        Table_empleados.setModel(obj_empleado.Leer());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        lblcodigo = new javax.swing.JLabel();
        lblnombres = new javax.swing.JLabel();
        lblapellidos = new javax.swing.JLabel();
        lbltel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();
        Combopuesto = new javax.swing.JComboBox<>();
        textnombres = new javax.swing.JTextField();
        textapellidos = new javax.swing.JTextField();
        texttelefono = new javax.swing.JTextField();
        textdireccion = new javax.swing.JTextField();
        textcodigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_empleados = new javax.swing.JTable();
        btnAceptar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lbl_num = new javax.swing.JLabel();
        choss = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Formulario Empleados");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Id: ");

        lbl_id.setForeground(new java.awt.Color(0, 0, 0));
        lbl_id.setText("0");

        lblcodigo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblcodigo.setForeground(new java.awt.Color(0, 0, 0));
        lblcodigo.setText("Codigo");

        lblnombres.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblnombres.setForeground(new java.awt.Color(0, 0, 0));
        lblnombres.setText("Nombres");

        lblapellidos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblapellidos.setForeground(new java.awt.Color(0, 0, 0));
        lblapellidos.setText("Apellidos");

        lbltel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbltel.setForeground(new java.awt.Color(0, 0, 0));
        lbltel.setText("Telefono");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Dirección");

        lblfecha.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblfecha.setForeground(new java.awt.Color(0, 0, 0));
        lblfecha.setText("Fecha Nacimiento");

        Combopuesto.setForeground(new java.awt.Color(0, 0, 0));
        Combopuesto.setToolTipText("");
        Combopuesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CombopuestoMouseClicked(evt);
            }
        });
        Combopuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CombopuestoActionPerformed(evt);
            }
        });
        Combopuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CombopuestoKeyReleased(evt);
            }
        });

        textnombres.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 13)); // NOI18N
        textnombres.setForeground(new java.awt.Color(0, 0, 0));
        textnombres.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 0), new java.awt.Color(102, 255, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(0, 255, 204)));
        textnombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textnombresKeyReleased(evt);
            }
        });

        textapellidos.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 13)); // NOI18N
        textapellidos.setForeground(new java.awt.Color(0, 0, 0));
        textapellidos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 0), new java.awt.Color(102, 255, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(0, 255, 204)));
        textapellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textapellidosKeyReleased(evt);
            }
        });

        texttelefono.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 13)); // NOI18N
        texttelefono.setForeground(new java.awt.Color(0, 0, 0));
        texttelefono.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 0), new java.awt.Color(102, 255, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(0, 255, 204)));
        texttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                texttelefonoKeyTyped(evt);
            }
        });

        textdireccion.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 13)); // NOI18N
        textdireccion.setForeground(new java.awt.Color(0, 0, 0));
        textdireccion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 0), new java.awt.Color(102, 255, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(0, 255, 204)));

        textcodigo.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 13)); // NOI18N
        textcodigo.setForeground(new java.awt.Color(0, 0, 0));
        textcodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textcodigo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 0), new java.awt.Color(102, 255, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(0, 255, 204)));
        textcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textcodigoActionPerformed(evt);
            }
        });
        textcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textcodigoKeyReleased(evt);
            }
        });

        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        Table_empleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Table_empleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_empleadosMouseClicked(evt);
            }
        });
        Table_empleados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Table_empleadosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(Table_empleados);

        btnAceptar.setForeground(new java.awt.Color(0, 0, 0));
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar2.png"))); // NOI18N
        btnAceptar.setText("Registrar");
        btnAceptar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAceptar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnActualizar.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar2.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar2.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lbl_num.setText("0");

        choss.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 102), new java.awt.Color(0, 255, 0), new java.awt.Color(0, 0, 153), new java.awt.Color(0, 204, 153)));
        choss.setDateFormatString("y/MM/d");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159)
                        .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbltel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(texttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(textnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(textapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbl_num, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(100, 100, 100)
                                            .addComponent(textcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(113, 113, 113)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(90, 90, 90)
                                    .addComponent(textdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(choss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 39, Short.MAX_VALUE)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Combopuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_id)
                            .addComponent(lbl_num))))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblcodigo))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Combopuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblnombres))
                    .addComponent(textnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblapellidos))
                    .addComponent(textapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(lbltel))
                    .addComponent(texttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblfecha))
                    .addComponent(choss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textcodigoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        limpiar();
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:                ComboPuestos.getSelectedItem().toString();
        String Fecha;
        java.util.Date fe = new java.util.Date();
        SimpleDateFormat ss = new SimpleDateFormat("yyyy-MM-dd");
        Fecha= ss.format(choss.getDate());
        
        String s = "ddd";
        int puesto = Combopuesto.getSelectedIndex();
        String PU = Integer.toString(puesto);
        lbl_num.getText();
        obj_empleado = new Empleado(0, textcodigo.getText(), textnombres.getText(), textapellidos.getText(), textdireccion.getText(), texttelefono.getText(), Fecha, lbl_num.getText());
        obj_empleado.agregar();
        Table_empleados.setModel(obj_empleado.Leer());
        limpiar();
    }//GEN-LAST:event_btnAceptarActionPerformed
    public void seleccion() {
        int fila = Table_empleados.getSelectedRow();
        int puesto = Combopuesto.getSelectedIndex() + 1;
        String PU = Integer.toString(puesto);

        lbl_id.setText(Table_empleados.getValueAt(fila, 0).toString());
        textcodigo.setText(Table_empleados.getValueAt(fila, 1).toString());
        textnombres.setText(Table_empleados.getValueAt(fila, 2).toString());
        textapellidos.setText(Table_empleados.getValueAt(fila, 3).toString());
        textdireccion.setText(Table_empleados.getValueAt(fila, 4).toString());
        texttelefono.setText(Table_empleados.getValueAt(fila, 5).toString());
        //textfn.setText(Table_empleados.getValueAt(fila, 6).toString());
        choss.setToolTipText(Table_empleados.getValueAt(fila, 6).toString());
String fech =String.valueOf(Table_empleados.getValueAt(Table_empleados.getSelectedRow(),6));
SimpleDateFormat xy =  new SimpleDateFormat("yyy-MM-dd");
java.util.Date fecha2;
try{
    fecha2=(java.util.Date) xy.parse(fech);
    choss.setDate(fecha2);
}catch(Exception ex){
    
}

//int rr =Combopuesto.getSelectedIndex();
        //lbl_num.setText(String.valueOf(rr));
//Combopuesto.setSelectedIndex(rr);

        // Textpuesto.setText(Table_empleados.getValueAt(fila, 7).toString());
    }
    private void Table_empleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_empleadosMouseClicked
        // TODO add your handling code here:
        seleccion();
    }//GEN-LAST:event_Table_empleadosMouseClicked

    private void Table_empleadosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Table_empleadosKeyReleased
        // TODO add your handling code here:
        seleccion();
    }//GEN-LAST:event_Table_empleadosKeyReleased

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
           int opcion= JOptionPane.showConfirmDialog(null, "Desea Modificar el registro","Actualizar",JOptionPane.YES_OPTION);
        if (opcion==0){
        int puesto = Combopuesto.getSelectedIndex();
        String PU = Integer.toString(puesto);
        String Fecha;
        java.util.Date fe = new java.util.Date();
        SimpleDateFormat ss = new SimpleDateFormat("yyyy-MM-dd");
        Fecha= ss.format(choss.getDate());
        
        obj_empleado = new Empleado();
        obj_empleado.setId(Integer.valueOf(lbl_id.getText()));

        obj_empleado = new Empleado(Integer.valueOf(lbl_id.getText()), textcodigo.getText(), textnombres.getText(), textapellidos.getText(), textdireccion.getText(), texttelefono.getText(), Fecha, lbl_num.getText());
        obj_empleado.modificar();
        Table_empleados.setModel(obj_empleado.Leer());
        limpiar();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void CombopuestoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CombopuestoKeyReleased
        // TODO add your handling code here:
        //    Combopuesto.setToolTipText("ss");
    }//GEN-LAST:event_CombopuestoKeyReleased

    private void CombopuestoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CombopuestoMouseClicked
        // TODO add your handling code here:
        //  Combopuesto.setToolTipText("ss");
    }//GEN-LAST:event_CombopuestoMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
            int opcion= JOptionPane.showConfirmDialog(null, "Desea Eliminar el Registro","Eliminar",JOptionPane.YES_OPTION);
        if (opcion==0){
    
        obj_empleado = new Empleado();
        obj_empleado.setId(Integer.valueOf(lbl_id.getText()));
        obj_empleado.eliminar();
        Table_empleados.setModel(obj_empleado.Leer());
        limpiar();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void CombopuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CombopuestoActionPerformed
        try {
       
            PreparedStatement parametro;
             Combopuesto.setSelectedItem("");
            String query = "select idpuestos from puestos where puesto='" + this.Combopuesto.getSelectedItem() + "'";
            cn = new Conexion();
            cn.abrirCon();
            String gg;
         ResultSet consulta = cn.conexiondb.createStatement().executeQuery(query);
         while(consulta.next()){ 
         gg= consulta.getString("idpuestos");
            this.lbl_num.setText(gg);
        }
            } catch (HeadlessException | SQLException ex) {
            System.out.println("-- Error --" + ex.getMessage());
        }
    }//GEN-LAST:event_CombopuestoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void texttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texttelefonoKeyTyped
        // TODO add your handling code here:     
        if (texttelefono.getText().length() == 8) {
            evt.consume();
            lbltel.setForeground(Color.BLACK);
            lbltel.setText("Telefono");
        } else {
            lbltel.setForeground(Color.red);
            lbltel.setText("Error!!");
            Toolkit.getDefaultToolkit().beep();

        }
    }//GEN-LAST:event_texttelefonoKeyTyped

    private void textcodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textcodigoKeyReleased
        if (textcodigo.getText().matches("[C]{1}[0-9]{3}")) {
            lblcodigo.setForeground(Color.black);
            lblcodigo.setText("Codigo");
        } else {
            lblcodigo.setForeground(Color.red);
            lblcodigo.setText("Error..");
        }
    }//GEN-LAST:event_textcodigoKeyReleased

    private void textnombresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textnombresKeyReleased
        // TODO add your handling code here:
        if (textnombres.getText().matches("[A-Z]{1}[a-z]{2,9}([ ][A-Z]{1}[a-z]{2,9})?")) {
            lblnombres.setForeground(Color.black);
            lblnombres.setText("Nombres");
        } else {
            lblnombres.setForeground(Color.red);
            lblnombres.setText("Error..");
        }
    }//GEN-LAST:event_textnombresKeyReleased

    private void textapellidosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textapellidosKeyReleased
        // TODO add your handling code here:
        if (textapellidos.getText().matches("[A-Z]{1}[a-z]{3,11}[ ][A-Z]{1}[a-z]{3,11}")) {
            lblapellidos.setForeground(Color.black);
            lblapellidos.setText("Apellidos");
        } else {
            lblapellidos.setForeground(Color.red);
            lblapellidos.setText("Error!!");
        }
    }//GEN-LAST:event_textapellidosKeyReleased

    public void limpiar() {
        textcodigo.setText("");
        textapellidos.setText("");
        textnombres.setText("");
        texttelefono.setText("");
        textdireccion.setText("");
        Combopuesto.setSelectedIndex(0);
        lbl_num.setText("");

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
            java.util.logging.Logger.getLogger(frm_empleado2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_empleado2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_empleado2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_empleado2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_empleado2().setVisible(true);
            }
        });
    }

    public void combo() {
        JFrame contenedor = new JFrame();
        //         JComboBox Combopuesto = new JComboBox();
        try {
            //    contenedor.add(Combopuesto);
            //    contenedor.setVisible(true);
            cn = new Conexion();
            cn.abrirCon();
            String query;
            int i = 0;
            query = "select idpuestos,puesto from puestos;";
            Combopuesto.addItem("Select");
            ResultSet consulta = cn.conexiondb.createStatement().executeQuery(query);
            while (consulta.next()) {
                Combopuesto.addItem(consulta.getString("puesto"));
            }
            //   contenedor.pack();
            cn.cerrarCon();
        } catch (SQLException ex) {
            System.out.println("Error " + ex.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combopuesto;
    private javax.swing.JTable Table_empleados;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private com.toedter.calendar.JDateChooser choss;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_num;
    private javax.swing.JLabel lblapellidos;
    private javax.swing.JLabel lblcodigo;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblnombres;
    private javax.swing.JLabel lbltel;
    private javax.swing.JTextField textapellidos;
    private javax.swing.JTextField textcodigo;
    private javax.swing.JTextField textdireccion;
    private javax.swing.JTextField textnombres;
    private javax.swing.JTextField texttelefono;
    // End of variables declaration//GEN-END:variables
class fondopanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/Textura22.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
