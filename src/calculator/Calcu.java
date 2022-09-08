package calculator;

import java.util.ArrayList;
import javax.swing.JButton;

public class Calcu extends javax.swing.JFrame {

    double first, second;
    String opp, ans, oldop;
    double res;
    ArrayList<Double> number = new ArrayList<>();

    public Calcu() {
        initComponents();
    }

    public void enable() {
        jTextPane1.setEnabled(true);

        btn_one.setEnabled(true);
        btn_two.setEnabled(true);
        btn_three.setEnabled(true);
        btn_four.setEnabled(true);
        btn_five.setEnabled(true);
        btn_six.setEnabled(true);
        btn_seven.setEnabled(true);
        btn_eight.setEnabled(true);
        btn_nine.setEnabled(true);
        btn_zero.setEnabled(true);
        btn_sub.setEnabled(true);
        btn_plus.setEnabled(true);
        btn_div.setEnabled(true);
        btn_mul.setEnabled(true);
        btn_dot.setEnabled(true);
        btn_equal.setEnabled(true);
        clear.setEnabled(true);
        delete.setEnabled(true);
    }

    public void disable() {
        jTextPane1.setEnabled(false);

        //on.setEnabled(true);
        btn_one.setEnabled(false);
        btn_two.setEnabled(false);
        btn_three.setEnabled(false);
        btn_four.setEnabled(false);
        btn_five.setEnabled(false);
        btn_six.setEnabled(false);
        btn_seven.setEnabled(false);
        btn_eight.setEnabled(false);
        btn_nine.setEnabled(false);
        btn_zero.setEnabled(false);
        btn_sub.setEnabled(false);
        btn_plus.setEnabled(false);
        btn_div.setEnabled(false);
        btn_mul.setEnabled(false);
        btn_dot.setEnabled(false);
        btn_equal.setEnabled(false);
        clear.setEnabled(false);
        delete.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jOptionPane1 = new javax.swing.JOptionPane();
        jColorChooser1 = new javax.swing.JColorChooser();
        jToggleButton1 = new javax.swing.JToggleButton();
        Display = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        btn_zero = new javax.swing.JButton();
        btn_dot = new javax.swing.JButton();
        on = new javax.swing.JButton();
        btn_seven = new javax.swing.JButton();
        btn_nine = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        btn_eight = new javax.swing.JButton();
        btn_six = new javax.swing.JButton();
        btn_mul = new javax.swing.JButton();
        btn_div = new javax.swing.JButton();
        btn_five = new javax.swing.JButton();
        btn_four = new javax.swing.JButton();
        btn_three = new javax.swing.JButton();
        btn_sub = new javax.swing.JButton();
        btn_two = new javax.swing.JButton();
        btn_one = new javax.swing.JButton();
        btn_plus = new javax.swing.JButton();
        off = new javax.swing.JButton();
        btn_equal = new javax.swing.JButton();
        show = new javax.swing.JLabel();

        label1.setText("label1");

        jScrollPane1.setViewportView(jTextPane1);

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(186, 223, 227));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Display.setBackground(new java.awt.Color(254, 254, 254));
        Display.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        Display.setDisabledTextColor(new java.awt.Color(219, 219, 219));
        Display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(255, 0, 51));
        clear.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        clear.setForeground(new java.awt.Color(51, 51, 51));
        clear.setText("C");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        btn_zero.setBackground(new java.awt.Color(186, 223, 227));
        btn_zero.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_zero.setForeground(new java.awt.Color(51, 51, 51));
        btn_zero.setText("0");
        btn_zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_zeroActionPerformed(evt);
            }
        });

        btn_dot.setBackground(new java.awt.Color(186, 223, 227));
        btn_dot.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_dot.setForeground(new java.awt.Color(51, 51, 51));
        btn_dot.setText(".");
        btn_dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dotActionPerformed(evt);
            }
        });

        on.setBackground(new java.awt.Color(186, 223, 227));
        on.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        on.setForeground(new java.awt.Color(51, 51, 51));
        on.setText("ON");
        on.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onActionPerformed(evt);
            }
        });

        btn_seven.setBackground(new java.awt.Color(186, 223, 227));
        btn_seven.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_seven.setForeground(new java.awt.Color(51, 51, 51));
        btn_seven.setText("7");
        btn_seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sevenActionPerformed(evt);
            }
        });

        btn_nine.setBackground(new java.awt.Color(186, 223, 227));
        btn_nine.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_nine.setForeground(new java.awt.Color(51, 51, 51));
        btn_nine.setText("9");
        btn_nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nineActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(186, 223, 227));
        delete.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        delete.setForeground(new java.awt.Color(51, 51, 51));
        delete.setText("← ");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        btn_eight.setBackground(new java.awt.Color(186, 223, 227));
        btn_eight.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_eight.setForeground(new java.awt.Color(51, 51, 51));
        btn_eight.setText("8");
        btn_eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eightActionPerformed(evt);
            }
        });

        btn_six.setBackground(new java.awt.Color(186, 223, 227));
        btn_six.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_six.setForeground(new java.awt.Color(51, 51, 51));
        btn_six.setText("6");
        btn_six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sixActionPerformed(evt);
            }
        });

        btn_mul.setBackground(new java.awt.Color(186, 223, 227));
        btn_mul.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_mul.setForeground(new java.awt.Color(51, 51, 51));
        btn_mul.setText("x");
        btn_mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mulActionPerformed(evt);
            }
        });

        btn_div.setBackground(new java.awt.Color(186, 223, 227));
        btn_div.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_div.setForeground(new java.awt.Color(51, 51, 51));
        btn_div.setText("/");
        btn_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divActionPerformed(evt);
            }
        });

        btn_five.setBackground(new java.awt.Color(186, 223, 227));
        btn_five.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_five.setForeground(new java.awt.Color(51, 51, 51));
        btn_five.setText("5");
        btn_five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fiveActionPerformed(evt);
            }
        });

        btn_four.setBackground(new java.awt.Color(186, 223, 227));
        btn_four.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_four.setForeground(new java.awt.Color(51, 51, 51));
        btn_four.setText("4");
        btn_four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fourActionPerformed(evt);
            }
        });

        btn_three.setBackground(new java.awt.Color(186, 223, 227));
        btn_three.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_three.setForeground(new java.awt.Color(51, 51, 51));
        btn_three.setText("3");
        btn_three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_threeActionPerformed(evt);
            }
        });

        btn_sub.setBackground(new java.awt.Color(186, 223, 227));
        btn_sub.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_sub.setForeground(new java.awt.Color(51, 51, 51));
        btn_sub.setText("-");
        btn_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subActionPerformed(evt);
            }
        });

        btn_two.setBackground(new java.awt.Color(186, 223, 227));
        btn_two.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_two.setForeground(new java.awt.Color(51, 51, 51));
        btn_two.setText("2");
        btn_two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_twoActionPerformed(evt);
            }
        });

        btn_one.setBackground(new java.awt.Color(186, 223, 227));
        btn_one.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_one.setForeground(new java.awt.Color(51, 51, 51));
        btn_one.setText("1");
        btn_one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oneActionPerformed(evt);
            }
        });

        btn_plus.setBackground(new java.awt.Color(186, 223, 227));
        btn_plus.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_plus.setForeground(new java.awt.Color(51, 51, 51));
        btn_plus.setText("+");
        btn_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_plusActionPerformed(evt);
            }
        });

        off.setBackground(new java.awt.Color(186, 223, 227));
        off.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        off.setForeground(new java.awt.Color(51, 51, 51));
        off.setText("OFF");
        off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offActionPerformed(evt);
            }
        });

        btn_equal.setBackground(new java.awt.Color(186, 223, 227));
        btn_equal.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btn_equal.setForeground(new java.awt.Color(51, 51, 51));
        btn_equal.setText("=");
        btn_equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equalActionPerformed(evt);
            }
        });

        show.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(on, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(off, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_seven, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eight, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_nine, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_one, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btn_two, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btn_zero, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_three, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_dot, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btn_equal, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_four, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_five, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_six, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_mul, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_div, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Display, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                    .addComponent(show, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_seven, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_nine, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_eight, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(on)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(off))
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_four, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_six, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_five, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mul, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_div, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_one, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_three, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_two, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_zero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_dot, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_equal, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sevenActionPerformed
        String get = Display.getText();
        Display.setText(get + "7");
    }//GEN-LAST:event_btn_sevenActionPerformed

    private void btn_nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nineActionPerformed
        String get = Display.getText();
        Display.setText(get + "9");
    }//GEN-LAST:event_btn_nineActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

        StringBuffer erese = new StringBuffer(Display.getText());
        erese.reverse();

        erese.deleteCharAt(0);
        erese.reverse();

        String x = new String(erese);
        Display.setText(x);
    }//GEN-LAST:event_deleteActionPerformed

    private void btn_eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eightActionPerformed
        String get = Display.getText();
        Display.setText(get + "8");
    }//GEN-LAST:event_btn_eightActionPerformed

    private void btn_sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sixActionPerformed
        String get = Display.getText();
        Display.setText(get + "6");
    }//GEN-LAST:event_btn_sixActionPerformed

    private void btn_mulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mulActionPerformed

        first = Double.parseDouble(Display.getText());
        Display.setText("");
        opp = "*";
    }//GEN-LAST:event_btn_mulActionPerformed

    private void btn_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divActionPerformed

        first = Double.parseDouble(Display.getText());
        Display.setText("");
        opp = "/";
    }//GEN-LAST:event_btn_divActionPerformed

    private void btn_fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fiveActionPerformed
        String get = Display.getText();
        Display.setText(get + "5");
    }//GEN-LAST:event_btn_fiveActionPerformed

    private void btn_fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fourActionPerformed
        String get = Display.getText();
        Display.setText(get + "4");
    }//GEN-LAST:event_btn_fourActionPerformed

    private void btn_threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_threeActionPerformed
        String get = Display.getText();
        Display.setText(get + "3");
    }//GEN-LAST:event_btn_threeActionPerformed

    private void btn_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subActionPerformed
//        String get = Display.getText();
//        Display.setText(get + "-");
        first = Double.parseDouble(Display.getText());
        Display.setText("");
        opp = "-";
    }//GEN-LAST:event_btn_subActionPerformed

    private void btn_twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_twoActionPerformed
        String get = Display.getText();
        Display.setText(get + "2");
    }//GEN-LAST:event_btn_twoActionPerformed

    private void btn_oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oneActionPerformed
        String get = Display.getText();
        Display.setText(get + "1");
    }//GEN-LAST:event_btn_oneActionPerformed

    private void btn_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_plusActionPerformed

        first = Double.parseDouble(Display.getText());
        Display.setText("");
        opp = "+";
    }//GEN-LAST:event_btn_plusActionPerformed

    private void btn_zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_zeroActionPerformed
        String get = Display.getText();
        Display.setText(get + "0");
    }//GEN-LAST:event_btn_zeroActionPerformed

    private void btn_dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dotActionPerformed
        String d_point = Display.getText();

        boolean x = d_point.contains(".");

        if (x)
            Display.setText(Display.getText());
        else
            Display.setText(Display.getText() + ".");
    }//GEN-LAST:event_btn_dotActionPerformed

    private void DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayActionPerformed

    }//GEN-LAST:event_DisplayActionPerformed

    private void btn_equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equalActionPerformed

        second = Double.parseDouble(Display.getText());

        switch (opp) {
            case "+":

                //while( == true)
                res = first + second;

                ans = String.format("%.4f", res);
                Display.setText(ans);
                break;

            case "-":
                res = first - second;

                ans = String.format("%.4f", res);
                Display.setText(ans);
                break;

            case "*":
                res = first * second;

                ans = String.format("%.4f", res);
                Display.setText(ans);
                break;

            case "/":

                res = first / second;

                ans = String.format("%.4f", res);
                Display.setText(ans);
                break;

        }


    }//GEN-LAST:event_btn_equalActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        Display.setText("0");
    }//GEN-LAST:event_clearActionPerformed

    private void offActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offActionPerformed
        disable();  ///call dis method
        Display.setText("");
    }//GEN-LAST:event_offActionPerformed

    private void onActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onActionPerformed
        enable(); //call enable method
        Display.setText("0");
    }//GEN-LAST:event_onActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calcu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Display;
    private javax.swing.JButton btn_div;
    private javax.swing.JButton btn_dot;
    private javax.swing.JButton btn_eight;
    private javax.swing.JButton btn_equal;
    private javax.swing.JButton btn_five;
    private javax.swing.JButton btn_four;
    private javax.swing.JButton btn_mul;
    private javax.swing.JButton btn_nine;
    private javax.swing.JButton btn_one;
    private javax.swing.JButton btn_plus;
    private javax.swing.JButton btn_seven;
    private javax.swing.JButton btn_six;
    private javax.swing.JButton btn_sub;
    private javax.swing.JButton btn_three;
    private javax.swing.JButton btn_two;
    private javax.swing.JButton btn_zero;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private java.awt.Label label1;
    private javax.swing.JButton off;
    private javax.swing.JButton on;
    private javax.swing.JLabel show;
    // End of variables declaration//GEN-END:variables
}
