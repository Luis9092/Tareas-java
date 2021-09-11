package vista;

import java.awt.event.KeyEvent;
import Vista.Crear;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Vista.Mostrar_Historial;

/**
 * @author Luis Fernando Paxel
 */
public class Calc extends javax.swing.JFrame {

    Crear escribir;
    double resultado;
    private boolean inicio = true;
    public String operando;
    public float uno, dos;

    public Calc() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        visor = new javax.swing.JTextField();
        btnMAS = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btnMENOS = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btnPOR = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btnDIV = new javax.swing.JButton();
        btnIGUAL = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        lblpas = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        menu_historial = new javax.swing.JMenuItem();
        menu_nuevo = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCULADORA");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        visor.setBackground(new java.awt.Color(153, 153, 153));
        visor.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        visor.setForeground(new java.awt.Color(255, 255, 255));
        visor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        visor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 4, true));
        visor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                visorMousePressed(evt);
            }
        });
        visor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                visorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                visorKeyReleased(evt);
            }
        });

        btnMAS.setBackground(new java.awt.Color(255, 153, 0));
        btnMAS.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        btnMAS.setForeground(new java.awt.Color(255, 255, 255));
        btnMAS.setText("+");
        btnMAS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnMAS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMASMouseClicked(evt);
            }
        });
        btnMAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMASActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(204, 204, 204));
        btn3.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn3MouseClicked(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(204, 204, 204));
        btn2.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn2MouseClicked(evt);
            }
        });
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        btn2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btn2KeyTyped(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(204, 204, 204));
        btn1.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn1MousePressed(evt);
            }
        });
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        btn1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn1KeyPressed(evt);
            }
        });

        btnMENOS.setBackground(new java.awt.Color(255, 153, 0));
        btnMENOS.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        btnMENOS.setForeground(new java.awt.Color(255, 255, 255));
        btnMENOS.setText("-");
        btnMENOS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnMENOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMENOSActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(204, 204, 204));
        btn6.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn6MouseClicked(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(204, 204, 204));
        btn5.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn5MouseClicked(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(204, 204, 204));
        btn4.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn4MouseClicked(evt);
            }
        });

        btnPOR.setBackground(new java.awt.Color(255, 153, 0));
        btnPOR.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        btnPOR.setForeground(new java.awt.Color(255, 255, 255));
        btnPOR.setText("*");
        btnPOR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnPOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPORActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(204, 204, 204));
        btn9.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn9MouseClicked(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(204, 204, 204));
        btn8.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn8MouseClicked(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(204, 204, 204));
        btn7.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");
        btn7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn7MouseClicked(evt);
            }
        });

        btnDIV.setBackground(new java.awt.Color(255, 153, 0));
        btnDIV.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        btnDIV.setForeground(new java.awt.Color(255, 255, 255));
        btnDIV.setText("/");
        btnDIV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnDIV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDIVActionPerformed(evt);
            }
        });

        btnIGUAL.setBackground(new java.awt.Color(0, 204, 255));
        btnIGUAL.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        btnIGUAL.setForeground(new java.awt.Color(255, 255, 255));
        btnIGUAL.setText("=");
        btnIGUAL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btnIGUAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIGUALActionPerformed(evt);
            }
        });
        btnIGUAL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnIGUALKeyPressed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(0, 204, 255));
        jButton15.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText(".");
        jButton15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton15MouseClicked(evt);
            }
        });
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(204, 204, 204));
        btn0.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");
        btn0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        btn0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn0MouseClicked(evt);
            }
        });

        lblpas.setBackground(new java.awt.Color(255, 255, 255));
        lblpas.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblpas.setForeground(new java.awt.Color(153, 153, 153));
        lblpas.setText("0");

        jButton2.setBackground(new java.awt.Color(0, 204, 255));
        jButton2.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("C");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblpas, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnPOR, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btnIGUAL, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btnDIV, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(btnMAS, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(btnMENOS, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(visor, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(visor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblpas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMAS, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMENOS, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPOR, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIGUAL, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDIV, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 102));
        jMenuBar1.setForeground(new java.awt.Color(255, 204, 0));

        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Opciones");

        menu_historial.setText("Historial");
        menu_historial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_historialMouseClicked(evt);
            }
        });
        menu_historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_historialActionPerformed(evt);
            }
        });
        jMenu2.add(menu_historial);

        menu_nuevo.setText("Nuevo");
        menu_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_nuevoActionPerformed(evt);
            }
        });
        jMenu2.add(menu_nuevo);

        jMenuBar1.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setText("Ayuda");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void visorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visorMousePressed
        // TODO add your handling code here:


    }//GEN-LAST:event_visorMousePressed

    private void btn1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_btn1MousePressed

    public void Limpiar() {
        visor.setText("0");
        this.lblpas.setText("0");
    }
    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
        // TODO add your handling code here:
        if (inicio == true) {
            visor.setText("0");
            visor.setText("1");
            getToolkit().beep();
            inicio = false;
            getToolkit().beep();

        } else {
            visor.setText(visor.getText() + "1");
            getToolkit().beep();
        }
    }//GEN-LAST:event_btn1MouseClicked

    private void btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseClicked
        // TODO add your handling code here:
        if (inicio == true) {
            visor.setText("0");
            visor.setText("2");
            inicio = false;
            getToolkit().beep();
//this.lblpas.setText(this.lblpas.getText()+visor.getText());

        } else {
            visor.setText(visor.getText() + "2");
            getToolkit().beep();

        }
        
   //     this.lblpas.setText(this.lblpas.getText()+visor.getText().substring(1, visor.getText().length()-1));
    }//GEN-LAST:event_btn2MouseClicked

    private void btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseClicked
        if (inicio == true) {
            visor.setText("0");
            visor.setText("3");
            inicio = false;
            getToolkit().beep();

        } else {
            visor.setText(visor.getText() + "3");
            getToolkit().beep();

        }
    }//GEN-LAST:event_btn3MouseClicked

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        /*
        if(inicio==true){
 
  visor.setText("0");
visor.setText("1");
inicio=false;
        
}else{
visor.setText(visor.getText()+"1");
}*/
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        /*
        if(inicio==true){
 
  visor.setText("0");
visor.setText("2");
inicio=false;
        
}else{
visor.setText(visor.getText()+"2");
         */
        // TODO add your handling code here:
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseClicked
        if (inicio == true) {
            visor.setText("0");
            visor.setText("4");
            inicio = false;
            getToolkit().beep();

        } else {
            visor.setText(visor.getText() + "4");
            getToolkit().beep();

        }
    }//GEN-LAST:event_btn4MouseClicked

    private void btn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseClicked
        if (inicio == true) {
            visor.setText("0");
            visor.setText("5");
            inicio = false;
            getToolkit().beep();

        } else {
            visor.setText(visor.getText() + "5");
            getToolkit().beep();

}    }//GEN-LAST:event_btn5MouseClicked

    private void btn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MouseClicked
        if (inicio == true) {
            visor.setText("0");
            visor.setText("6");
            inicio = false;
            getToolkit().beep();

        } else {
            visor.setText(visor.getText() + "6");
            getToolkit().beep();

}    }//GEN-LAST:event_btn6MouseClicked

    private void btn7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7MouseClicked
        if (inicio == true) {
            visor.setText("0");
            visor.setText("7");
            inicio = false;
            getToolkit().beep();

        } else {
            visor.setText(visor.getText() + "7");
            getToolkit().beep();

}    }//GEN-LAST:event_btn7MouseClicked

    private void btn8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8MouseClicked
        if (inicio == true) {
            visor.setText("0");
            visor.setText("8");
            inicio = false;
            getToolkit().beep();

        } else {
            visor.setText(visor.getText() + "8");
            getToolkit().beep();

}    }//GEN-LAST:event_btn8MouseClicked

    private void btn9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9MouseClicked
        if (inicio == true) {
            visor.setText("0");
            visor.setText("9");
            inicio = false;
            getToolkit().beep();

        } else {
            visor.setText(visor.getText() + "9");
            getToolkit().beep();

}    }//GEN-LAST:event_btn9MouseClicked

    private void btn0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0MouseClicked
        if (inicio == true) {
            visor.setText("0");
            visor.setText("0");
            inicio = false;
            getToolkit().beep();

        } else {
            visor.setText(visor.getText() + "0");
            getToolkit().beep();

}    }//GEN-LAST:event_btn0MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Limpiar2();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseClicked
        // TODO add your handling code here:
        if (visor.getText().contains(".")) {
            getToolkit().beep();

        } else {
            visor.setText(visor.getText() + ".");
            inicio = false;
            getToolkit().beep();

        }

    }//GEN-LAST:event_jButton15MouseClicked

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed


    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        Ayuda ayuda = new Ayuda();
        ayuda.show();
        getToolkit().beep();

    }//GEN-LAST:event_jMenu3MouseClicked

    private void btnMASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMASActionPerformed
        // TODO add your handling code here:}
        uno = Float.parseFloat(visor.getText());
        String ver = String.valueOf(uno);
        String ver2 = String.valueOf(dos);

        operando = "+";
        visor.setText("");
        this.lblpas.setText((ver + "+"));
        getToolkit().beep();

    }//GEN-LAST:event_btnMASActionPerformed

    private void btnIGUALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIGUALActionPerformed

        try {
            calcular();
           
            this.lblpas.setText(String.valueOf(this.uno+this.operando+this.dos)+" ="+visor.getText());

        } catch (IOException ex) {
            Logger.getLogger(Calc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnIGUALActionPerformed

    private void btnMENOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMENOSActionPerformed
        uno = Float.parseFloat(visor.getText());
        operando = "-";
        visor.setText("");
        getToolkit().beep();

    }//GEN-LAST:event_btnMENOSActionPerformed

    private void btnPORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPORActionPerformed
        uno = Float.parseFloat(visor.getText());
        operando = "*";
        visor.setText("");
        getToolkit().beep();

    }//GEN-LAST:event_btnPORActionPerformed

    private void btnDIVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDIVActionPerformed
        uno = Float.parseFloat(visor.getText());
        operando = "/";
        visor.setText("");
        getToolkit().beep();

    }//GEN-LAST:event_btnDIVActionPerformed

    private void btn2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_btn2KeyTyped

    private void btnMASMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMASMouseClicked

    }//GEN-LAST:event_btnMASMouseClicked

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void btn1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1KeyPressed

    private void visorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_visorKeyPressed

        // char tecla=evt.getKeyChar();

    }//GEN-LAST:event_visorKeyPressed

    private void btnIGUALKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIGUALKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnIGUALKeyPressed


    private void visorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_visorKeyReleased
        char tecla = evt.getKeyChar();
        char enter = KeyEvent.VK_ENTER;
        switch (tecla) {
            case KeyEvent.VK_MINUS:
                visor.setText(visor.getText().substring(0, visor.getText().length() - 1));
                btnMENOS.doClick();
                break;
            case '+':
                visor.setText(visor.getText().substring(0, visor.getText().length() - 1));
                btnMAS.doClick();
                break;
            case '*':
                visor.setText(visor.getText().substring(0, visor.getText().length() - 1));
                btnPOR.doClick();
                break;
            //else if(tecla==(KeyEvent.VK_SHIFT + KeyEvent.VK_0))
            case '/':
                visor.setText(visor.getText().substring(0, visor.getText().length() - 1));
                btnDIV.doClick();
                break;

            case KeyEvent.VK_ENTER:
                btnIGUAL.doClick();
                break;
            default:
                break;
        }

    }//GEN-LAST:event_visorKeyReleased

    private void menu_historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_historialActionPerformed
//        Float resultado = Float.parseFloat(visor.getText());
        escribir = new Crear(1, 0, 0, "", 0, 0);
    
        Mostrar_Historial ver44 = new Mostrar_Historial();
        ver44.show();

    }//GEN-LAST:event_menu_historialActionPerformed

    private void menu_historialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_historialMouseClicked

    }//GEN-LAST:event_menu_historialMouseClicked

    private void menu_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_nuevoActionPerformed
        escribir = new Crear(1, 0, 0, "", 0, 0);
        try {
            escribir.Guardar();
        } catch (IOException ex) {
            Logger.getLogger(Calc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menu_nuevoActionPerformed
    private void pantallaKeyPressed(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:

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
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc().setVisible(true);
            }
        });
    }

    public void Limpiar2() {
        /*
        visor.setText("");
        String valor = visor.getText();

        if (valor.equals("")) {
            uno = 0;

        } else {

            uno = Float.parseFloat(visor.getText());
            visor.setText("");
        }
         */
        visor.setText("");
        this.lblpas.setText("");
    }

    public void calcular() throws IOException {
        int contador = 0;
        dos = Float.parseFloat(visor.getText());
        switch (operando) {

            case "+":
                contador = contador + 1;
                this.visor.setText(Float.toString(this.uno + this.dos));
                Float resultado = Float.parseFloat(visor.getText());
             //   this.lblpas.setText(Float.toString(this.uno + this.dos));
                escribir = new Crear(0, this.uno, this.dos, operando, resultado, contador);
                escribir.Guardar();
                break;
            case "-":
                this.visor.setText(Float.toString(this.uno - this.dos));
                this.lblpas.setText(Float.toString(this.uno - this.dos));

                Float resultado2 = Float.parseFloat(visor.getText());

                escribir = new Crear(0, this.uno, this.dos, operando, resultado2, contador);
                escribir.Guardar();
                break;
            case "*":

                this.visor.setText(Float.toString(this.uno * this.dos));
                this.lblpas.setText(Float.toString(this.uno * this.dos));

                Float resultado3 = Float.parseFloat(visor.getText());

                escribir = new Crear(0, this.uno, this.dos, operando, resultado3, contador);
                escribir.Guardar();

                this.lblpas.setText(Float.toString(this.uno * this.dos));
                break;
            case "/":
                this.visor.setText(Float.toString(this.uno / this.dos));
                this.lblpas.setText(Float.toString(this.uno / this.dos));
                Float resultado4 = Float.parseFloat(visor.getText());

                escribir = new Crear(0, this.uno, this.dos, operando, resultado4, contador);
                escribir.Guardar();

                break;
            default:
              
        }
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnDIV;
    private javax.swing.JButton btnIGUAL;
    private javax.swing.JButton btnMAS;
    private javax.swing.JButton btnMENOS;
    private javax.swing.JButton btnPOR;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblpas;
    private javax.swing.JMenuItem menu_historial;
    private javax.swing.JMenuItem menu_nuevo;
    private javax.swing.JTextField visor;
    // End of variables declaration//GEN-END:variables
}
