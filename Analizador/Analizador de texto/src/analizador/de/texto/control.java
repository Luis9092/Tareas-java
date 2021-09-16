/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizador.de.texto;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.util.StringTokenizer;
import static javafx.beans.binding.Bindings.or;
import static javafx.scene.paint.Color.color;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;

/**
 *
 * @author Luis Fernando Paxel
 */
public class control extends javax.swing.JFrame {

    fondopanel fondo1 = new fondopanel();
    private String mayuscula = "", minuscula = "", letras = "", letras2 = "";
    private int No_mayus = 0, No_minus = 0, No_letras = 0, total, obtener;
    private String cf, Letrae, Letrai, Letrao, Letrau, pares33;
    char[] frase, convertir;
    String palabra;

    JFileChooser seleccionar = new JFileChooser();
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;

    public control() {
        this.setContentPane(fondo1);

        initComponents();

        setLocationRelativeTo(null);
        Area_texto.setLineWrap(true);
        Area_texto.setWrapStyleWord(true);

        Area_murcielago.setLineWrap(true);
        Area_murcielago.setWrapStyleWord(true);

    }
public String abrirFichero(File fichero) {
        String documento = "";
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fichero), StandardCharsets.UTF_8));
            //entrada = new FileInputStream(fichero); Comento esto y uso el BufferedReader para indicarle el UTF

            int ascci;

            while ((ascci = in.read()) != -1) {
                char c = (char) ascci;
                documento += c;
            }

            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return documento;
    }
    public String Abrir_archivo(File archivo) {
        String documento = "";
        try {
          BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(archivo), StandardCharsets.UTF_8));
        
            int cod;
            while ((cod = in.read()) != -1) {
                char caracter = (char) cod;
                documento += caracter;
            }
            in.close();
        } catch (Exception ex) {
        }
        return documento;
    }

    public String Guardar_archivo(File archivo, String documento) {
        String alerta = "";
        try {
            salida = new FileOutputStream(archivo);
            byte[] bite = documento.getBytes();
            salida.write(bite);
            alerta = "Archivo Guardado";
        } catch (Exception ex) {

        }
        return alerta;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Area_texto = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        Btnprocesar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Area1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        Area2 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Area_murcielago = new javax.swing.JTextArea();
        llbl_encontrar = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Opcion_archivo = new javax.swing.JMenu();
        Abrir = new javax.swing.JMenuItem();
        Guardar = new javax.swing.JMenuItem();
        Gcomo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        copiar = new javax.swing.JMenuItem();
        cortar = new javax.swing.JMenuItem();
        pegar = new javax.swing.JMenuItem();
        buscar = new javax.swing.JMenuItem();
        reemplazar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setOpaque(false);

        Area_texto.setColumns(10);
        Area_texto.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        Area_texto.setRows(5);
        Area_texto.setWrapStyleWord(true);
        Area_texto.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        Area_texto.setMaximumSize(new java.awt.Dimension(50000, 50000));
        Area_texto.setVerifyInputWhenFocusTarget(false);
        Area_texto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Area_textoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(Area_texto);
        Area_texto.getAccessibleContext().setAccessibleParent(null);

        jLabel1.setBackground(new java.awt.Color(255, 153, 0));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 3, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingrese un texto o abra un archivo");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jLabel1.setOpaque(true);

        Btnprocesar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Btnprocesar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar2.png"))); // NOI18N
        Btnprocesar.setText("Procesar");
        Btnprocesar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Btnprocesar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btnprocesar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Btnprocesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnprocesarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar.png"))); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 0));
        jScrollPane2.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N

        Area1.setEditable(false);
        Area1.setBackground(new java.awt.Color(0, 102, 204));
        Area1.setColumns(20);
        Area1.setFont(new java.awt.Font("Yu Gothic UI", 1, 15)); // NOI18N
        Area1.setForeground(new java.awt.Color(255, 255, 255));
        Area1.setRows(5);
        jScrollPane2.setViewportView(Area1);

        jScrollPane3.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane3.setForeground(new java.awt.Color(255, 255, 0));
        jScrollPane3.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N

        Area2.setEditable(false);
        Area2.setBackground(new java.awt.Color(0, 102, 204));
        Area2.setColumns(20);
        Area2.setFont(new java.awt.Font("Yu Gothic", 1, 15)); // NOI18N
        Area2.setForeground(new java.awt.Color(255, 255, 255));
        Area2.setRows(5);
        jScrollPane3.setViewportView(Area2);

        jLabel2.setBackground(new java.awt.Color(255, 102, 0));
        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Traducción  a Lenguaje Murcielago");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jLabel2.setOpaque(true);

        Area_murcielago.setEditable(false);
        Area_murcielago.setColumns(20);
        Area_murcielago.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        Area_murcielago.setRows(5);
        Area_murcielago.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jScrollPane4.setViewportView(Area_murcielago);

        llbl_encontrar.setFont(new java.awt.Font("Yu Gothic", 3, 14)); // NOI18N
        llbl_encontrar.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(Btnprocesar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(llbl_encontrar, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(llbl_encontrar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btnprocesar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setSelectionModel(null);

        Opcion_archivo.setText("Archivo");
        Opcion_archivo.setRequestFocusEnabled(false);
        Opcion_archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion_archivoActionPerformed(evt);
            }
        });

        Abrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Abrir.setText("Abrir");
        Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirActionPerformed(evt);
            }
        });
        Opcion_archivo.add(Abrir);

        Guardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        Guardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                GuardarKeyReleased(evt);
            }
        });
        Opcion_archivo.add(Guardar);

        Gcomo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        Gcomo.setText("Guardar como");
        Gcomo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GcomoActionPerformed(evt);
            }
        });
        Opcion_archivo.add(Gcomo);

        jMenuBar1.add(Opcion_archivo);

        jMenu2.setText("Editar");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        copiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        copiar.setText("Copiar");
        copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiarActionPerformed(evt);
            }
        });
        jMenu2.add(copiar);

        cortar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cortar.setText("Cortar");
        cortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cortarActionPerformed(evt);
            }
        });
        jMenu2.add(cortar);

        pegar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        pegar.setText("Pegar");
        pegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pegarActionPerformed(evt);
            }
        });
        jMenu2.add(pegar);

        buscar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        jMenu2.add(buscar);

        reemplazar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        reemplazar.setText("Reemplazar");
        reemplazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reemplazarActionPerformed(evt);
            }
        });
        jMenu2.add(reemplazar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Opcion_archivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion_archivoActionPerformed


    }//GEN-LAST:event_Opcion_archivoActionPerformed

    private void GcomoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GcomoActionPerformed
        //Guardar ver4 = new Guardar();
        //ver4.setVisible(true);
        /*
        if (seleccionar.showDialog(null, "Guardar") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            if (archivo.getName().endsWith("txt")) {
                String documento = Area_texto.getText();
                String alerta = Guardar_archivo(archivo, documento);
                if (alerta != null) {
                    JOptionPane.showMessageDialog(null, alerta);
                } else {
                    JOptionPane.showMessageDialog(null, "Archivo No compatible");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Guardar Documeto :v");
            }

        }
         */
        //Obtenemos la direccion del archivo luego se inserta con el mismo nombre y direccion donde se encuentra el archivo para sobreescribirlo
        try {
            String nombre = "";
            JFileChooser file = new JFileChooser();
            file.showSaveDialog(this);
            File guarda = file.getSelectedFile();

            if (guarda != null) {
                FileWriter save = new FileWriter(guarda + ".txt");
                save.write(Area_texto.getText());
                save.close();
                JOptionPane.showMessageDialog(null,
                        "El archivo se a guardado Exitosamente",
                        "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Su archivo no se ha guardado",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_GcomoActionPerformed

    private void Area_textoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Area_textoKeyReleased

    }//GEN-LAST:event_Area_textoKeyReleased

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
        // Guardar ver88 = new Guardar();
        //  ver88.show(); 
        if (archivo != null) {
            try {
                String ruta = archivo.getAbsolutePath();
                Area_murcielago.setText(ruta);

                String nombre = "";
                //   JFileChooser file = new JFileChooser();
                //  file.showSaveDialog(this);
                //   File guarda = file.getSelectedFile();

                if (ruta != null) {
                    FileWriter save = new FileWriter(ruta);
                    save.write(Area_texto.getText());
                    save.close();
                    JOptionPane.showMessageDialog(null,
                            "El archivo se a guardado Exitosamente",
                            "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null,
                        "Su archivo no se ha guardado",
                        "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            try {
                JFileChooser file = new JFileChooser();
                file.showSaveDialog(this);
                File guarda = file.getSelectedFile();

                if (guarda != null) {
                    FileWriter save = new FileWriter(guarda + ".txt");
                    save.write(Area_texto.getText());
                    save.close();
                    JOptionPane.showMessageDialog(null,
                            "El archivo se a guardado Exitosamente",
                            "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null,
                        "Su archivo no se ha guardado",
                        "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void BtnprocesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnprocesarActionPerformed

        control1();
        control2();
        //    traducido();
        control4();

    }//GEN-LAST:event_BtnprocesarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Area_texto.setText("");
        Area1.setText("");
        Area2.setText("");
        Area_murcielago.setText("");
        this.llbl_encontrar.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirActionPerformed
        // TODO add your handling code here:

        if (seleccionar.showDialog(null, "Abrir") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("txt")) {
                    String documento = Abrir_archivo(archivo);
                    Area_texto.setText(documento);
                } else {
                    JOptionPane.showMessageDialog(null, "Archivo No compatible");
                }
            }

        }

    }//GEN-LAST:event_AbrirActionPerformed

    private void copiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiarActionPerformed
        // TODO add your handling code here:
        Area_texto.copy();
    }//GEN-LAST:event_copiarActionPerformed

    private void GuardarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GuardarKeyReleased
        // TODO add your handling code here:
        /*
         char tecla = evt.getKeyChar();
     char enter = KeyEvent.VK_ENTER;

       if (tecla == KeyEvent.VK_CONTROL + 'a') {
               
       

         if (seleccionar.showDialog(null, "Abrir") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("txt")) {
                    String documento = Abrir_archivo(archivo);
                    Area_texto.setText(documento);
                } else {
                    JOptionPane.showMessageDialog(null, "Archivo No compatible");
                }
            }

        }
}
         */
    }//GEN-LAST:event_GuardarKeyReleased

    private void cortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cortarActionPerformed
        Area_texto.cut();
    }//GEN-LAST:event_cortarActionPerformed

    private void pegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pegarActionPerformed
        Area_texto.paste();
    }//GEN-LAST:event_pegarActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        int r = 0;
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        String Entrada = Area_texto.getText();
        StringTokenizer palabras = new StringTokenizer(Entrada);
        int Nopal = palabras.countTokens();
        int i = 0;
        int posicion = 0;
        String[] vect = Entrada.split(" ");

        String entradaUsuario = JOptionPane.showInputDialog("Introduzca Palabra: ");
        String gg = entradaUsuario;
        String dos = entradaUsuario;
        for (int a = 0; a < vect.length; a++) {
            for (int aa = 0; aa < vect.length; aa++) {
                if (vect[aa].equals(gg)) {
                    i++;
                    llbl_encontrar.setText(+i + " Resultados de: " + gg);
                    //         JOptionPane.showMessageDialog(null,+i + " Resultados de: " + gg );
                } else if (i == 0) {
                    llbl_encontrar.setText("Palabra No encontrada!!");
                    //         JOptionPane.showMessageDialog(null,"Palabra No encontrada!!");

                }

            }
            i = 0;
        }

        String finalString = Entrada
                .replace(gg, dos.toUpperCase());
        Area_texto.setText(finalString);
    }//GEN-LAST:event_buscarActionPerformed

    private void reemplazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reemplazarActionPerformed
        String buscar = JOptionPane.showInputDialog("Buscar: ");
        String reemplazar = JOptionPane.showInputDialog("Reemplazar: ");
        String Entrada = Area_texto.getText();
        String buscar2 = buscar;
        String reemplazar2 = reemplazar;
        String finalString = Entrada
                .replace(buscar2, reemplazar2);
        Area_texto.setText(finalString);


    }//GEN-LAST:event_reemplazarActionPerformed
    public void control4() {

        String Entrada = Area_texto.getText();
        String ff = Entrada.toUpperCase();
        //     String doss = Entrada.replace("a", "1");
        //     Area_murcielago.setText(doss);

        String finalString = ff
                .replace("M", "0")
                .replace("U", "1")
                .replace("R", "2")
                .replace("C", "3")
                .replace("I", "4")
                .replace("E", "5")
                .replace("L", "6")
                .replace("A", "7")
                .replace("G", "8")
                .replace("O", "9");
        /* 
                .replace("0", "M")
                .replace("1", "U")
                .replace("2", "R")
                .replace("3", "C")
                .replace("4", "I")
                .replace("5", "E")
                .replace("6", "L")
                .replace("7", "A")
                .replace("8", "G")
                .replace("9", "O");
         */
        Area_murcielago.setText(finalString.toLowerCase());
//76 07269n s5 69 3h409 1n n5829

    }

    public void control1() {
        String Entrada = Area_texto.getText();

        int obtener = Area_texto.getText().length();
        String Longitud = String.valueOf(obtener);

        char lastChar = Entrada.charAt(Entrada.length() - 1);
        char[] caracteres = Entrada.toCharArray();

        for (int i = 0; i < 1; i++) {
            if (Character.isLetter(Entrada.charAt(i))) {
                letras = Entrada.charAt(i) + "";
            }
        }
        for (int ii = 0; ii < Entrada.length(); ii++) {
            if (Character.isLetter(Entrada.charAt(ii))) {
                No_letras++;
                letras2 = Entrada.charAt(ii) + "";
                //     letras.substring(0);

            }
            total = obtener / 2;

        }
        char enmedio = caracteres[total];
        String doss = Character.toString(enmedio);
        StringTokenizer palabras = new StringTokenizer(Entrada);
        int Nopal = palabras.countTokens();
        int Final = Nopal - 1;
        int pala = (Nopal / 2);
        String Ultima = Character.toString(lastChar);

        String[] vect = Entrada.split(" ");

        Area1.setText("1) Longitud del texto: " + Longitud + "\n2) Numero de palabras: "
                + Nopal + "\n3) Primera Letra del texto: " + letras
                + "\n4) Ultima Letra del texto: " + Ultima + "\n5) Letra enmedio: " + doss + "\n6) Primera Palabra: " + vect[0]
                + "\n7) Palabra enmedio: " + vect[pala] + "\n8) Ultima Palabra: " + vect[Final]);

    }

    public void control2() {
        String Entrada = Area_texto.getText();
        StringTokenizer palabras = new StringTokenizer(Entrada);
        int Nopal = palabras.countTokens();
        int imp = 0, par = 0;
        char[] array;
        RepeticionA();
        RepeticionE();
        RepeticionI();
        RepeticionO();
        Repeticionu();
        String[] vect = Entrada.split(" ");

        //  int r= vect [1].length();
        array = Entrada.toCharArray();
        //   caracter= array[a];
        for (int aa = 0; aa < Nopal; aa++) {
            //.append
            // Area2.setText(String.valueOf( vect[aa]));
            int cont = (String.valueOf(vect[aa]).length() % 2);
            if (cont != 0) {
                imp++;
            } else {
                par++;
            }
        }
//Area2.setText("Cantidad Impar: "+imp+"\n Cantidad Par: "+par);
        Area2.setText("9) Repeticiones de 'A','a','á': " + cf + "\n10) Repeticiones de 'E','e','é': " + Letrae
                + "\n11) Repeticiones de 'I','i','í': " + Letrai
                + "\n12) Repeticiones de 'o','O','ó': " + Letrao + "\n13) Repeticiones de 'u','U','ú': " + Letrau
                + "\n14) Palabras Con caracteres Par: " + par + "\n15) Palabras Con caracteres Impar: " + imp);

    }

    public String inicio() {
        palabra = Area_texto.getText().toLowerCase().trim();
        return palabra;
    }

    public void control3() {
        palabra = Area_texto.getText();
        obtener = Area_texto.getText().length();
        String Longitud = String.valueOf(obtener);
        char[] mur = new char[10];

        //   
        mur[0] = 'M';
        mur[1] = 'U';
        mur[2] = 'R';
        mur[3] = 'C';
        mur[4] = 'I';
        mur[5] = 'E';
        mur[6] = 'L';
        mur[7] = 'A';
        mur[8] = 'G';
        mur[9] = '0';
        frase = palabra.toCharArray();
        convertir = new char[obtener];
        for (int aa = 0; aa < obtener; aa++) {
            if (frase[aa] == '0') {
                convertir[aa] = mur[0];

            } else if (frase[aa] == '1') {
                convertir[aa] = mur[1];
            } else if (frase[aa] == '2') {
                convertir[aa] = mur[2];
            } else if (frase[aa] == '3') {
                convertir[aa] = mur[3];
            } else if (frase[aa] == '4') {
                convertir[aa] = mur[4];
            } else if (frase[aa] == '5') {
                convertir[aa] = mur[5];
            } else if (frase[aa] == '6') {
                convertir[aa] = mur[6];
            } else if (frase[aa] == '7') {
                convertir[aa] = mur[7];
            } else if (frase[aa] == '8') {
                convertir[aa] = mur[8];
            } else if (frase[aa] == '9') {
                convertir[aa] = mur[9];
                ///ceros
            } else if (frase[aa] == mur[0]) {
                convertir[aa] = '0';
            } else if (frase[aa] == mur[1]) {
                convertir[aa] = '1';
            } else if (frase[aa] == mur[2]) {
                convertir[aa] = '2';
            } else if (frase[aa] == mur[3]) {
                convertir[aa] = '3';
            } else if (frase[aa] == mur[4]) {
                convertir[aa] = '4';
            } else if (frase[aa] == mur[5]) {
                convertir[aa] = '5';
            } else if (frase[aa] == mur[6]) {
                convertir[aa] = '6';
            } else if (frase[aa] == mur[7]) {
                convertir[aa] = '7';
            } else if (frase[aa] == mur[8]) {
                convertir[aa] = '9';
            } else {
                convertir[aa] = frase[aa];
            }

        }
        for (int i = 0; i < obtener; i++) {
            Area_murcielago.setText(convertir[i] + "");
        }
    }

    public void traducido() {
        for (int i = 0; i < obtener; i++) {
            Area_murcielago.setText(convertir[i] + "");

        }

    }

    public void RepeticionA() {
        String Entrada = Area_texto.getText();
        char[] array;
        int contador = 0;
        array = Entrada.toCharArray();
        for (int a = 0; a < array.length; a++) {
            //   caracter= array[a];
            for (int aa = 0; aa < array.length; aa++) {
                if (array[aa] == 'a') {
                    contador++;
                }
                if (array[aa] == 'A') {
                    contador++;
                }
                if (array[aa] == 'á') {
                    contador++;
                }

            }
            cf = Integer.toString(contador);
            contador = 0;
        }

    }

    public void RepeticionE() {
        String Entrada = Area_texto.getText();
        char[] array;
        int contador = 0;
        array = Entrada.toCharArray();
        for (int a = 0; a < array.length; a++) {
            //   caracter= array[a];
            for (int aa = 0; aa < array.length; aa++) {
                if (array[aa] == 'e') {
                    contador++;
                }
                if (array[aa] == 'E') {
                    contador++;
                }
                if (array[aa] == 'é') {
                    contador++;
                }

            }
            Letrae = Integer.toString(contador);
            contador = 0;
        }
    }

    public void RepeticionI() {
        String Entrada = Area_texto.getText();
        char[] array;
        int contador = 0;
        array = Entrada.toCharArray();
        for (int a = 0; a < array.length; a++) {
            //   caracter= array[a];
            for (int aa = 0; aa < array.length; aa++) {
                if (array[aa] == 'i') {
                    contador++;
                }
                if (array[aa] == 'I') {
                    contador++;
                }
                if (array[aa] == 'í') {
                    contador++;
                }

            }
            Letrai = Integer.toString(contador);
            contador = 0;
        }
    }

    public void RepeticionO() {
        String Entrada = Area_texto.getText();
        char[] array;
        int contador = 0;
        array = Entrada.toCharArray();
        for (int a = 0; a < array.length; a++) {
            //   caracter= array[a];
            for (int aa = 0; aa < array.length; aa++) {
                if (array[aa] == 'o') {
                    contador++;
                }
                if (array[aa] == 'O') {
                    contador++;
                }
                if (array[aa] == 'ó') {
                    contador++;
                }

            }
            Letrao = Integer.toString(contador);
            contador = 0;
        }
    }

    public void Repeticionu() {
        String Entrada = Area_texto.getText();
        char[] array;
        int contador = 0;
        array = Entrada.toCharArray();
        for (int a = 0; a < array.length; a++) {
            //   caracter= array[a];
            for (int aa = 0; aa < array.length; aa++) {
                if (array[aa] == 'u') {
                    contador++;
                }
                if (array[aa] == 'U') {
                    contador++;
                }
                if (array[aa] == 'ú') {
                    contador++;
                }

            }
            Letrau = Integer.toString(contador);
            contador = 0;
        }
    }

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
            java.util.logging.Logger.getLogger(control.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(control.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(control.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(control.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new control().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Abrir;
    private javax.swing.JTextArea Area1;
    private javax.swing.JTextArea Area2;
    private javax.swing.JTextArea Area_murcielago;
    private javax.swing.JTextArea Area_texto;
    private javax.swing.JButton Btnprocesar;
    private javax.swing.JMenuItem Gcomo;
    private javax.swing.JMenuItem Guardar;
    private javax.swing.JMenu Opcion_archivo;
    private javax.swing.JMenuItem buscar;
    private javax.swing.JMenuItem copiar;
    private javax.swing.JMenuItem cortar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel llbl_encontrar;
    private javax.swing.JMenuItem pegar;
    private javax.swing.JMenuItem reemplazar;
    // End of variables declaration//GEN-END:variables
class fondopanel extends JPanel {

        private Image imagen;

        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/Textura13.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
