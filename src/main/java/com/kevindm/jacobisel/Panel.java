package com.kevindm.jacobisel;
import java.io.File;
import java.util.Formatter;
import java.awt.Desktop;

import javax.swing.JOptionPane;

public class Panel extends javax.swing.JFrame {

    public Panel() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        justName = new javax.swing.JLabel();
        copyright = new javax.swing.JLabel();
        principal_container = new javax.swing.JPanel();
        input_container = new javax.swing.JPanel();
        system_matrix_label = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        ma_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        system_matrix = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        system_ampliated_matrix = new javax.swing.JTextArea();
        justify_button = new javax.swing.JButton();
        output_container = new javax.swing.JPanel();
        iterations_label = new javax.swing.JLabel();
        iterations = new javax.swing.JLabel();
        solution_label = new javax.swing.JLabel();
        solution_container = new javax.swing.JScrollPane();
        solution = new javax.swing.JTextArea();
        settings_container = new javax.swing.JPanel();
        stop_criteria_slider = new javax.swing.JSlider();
        stop_criteria = new javax.swing.JLabel();
        stop_criteria_value = new javax.swing.JTextField();
        button_solve = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        save_as_label = new javax.swing.JLabel();
        save_as_txt_button = new javax.swing.JLabel();
        save_as_doc_button = new javax.swing.JLabel();
        save_as_pdf_button = new javax.swing.JLabel();
        save_as_email_button = new javax.swing.JLabel();
        save_as_img_button = new javax.swing.JLabel();
        restart_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        justName.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        justName.setForeground(new java.awt.Color(102, 102, 102));
        justName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        justName.setText("Proyecto 2: Metodo de Jacobi");

        copyright.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        copyright.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kevindm/jacobisel/resources/images/KoshkaLogo45x45.png"))); // NOI18N
        copyright.setText("By KevinDM");

        system_matrix_label.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        system_matrix_label.setText("Matriz del sistema");

        separator.setForeground(new java.awt.Color(0, 0, 0));
        separator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        ma_label.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ma_label.setText("M.A");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        system_matrix.setColumns(20);
        system_matrix.setRows(5);
        jScrollPane1.setViewportView(system_matrix);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        system_ampliated_matrix.setColumns(20);
        system_ampliated_matrix.setRows(5);
        jScrollPane2.setViewportView(system_ampliated_matrix);

        justify_button.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        justify_button.setText("Justificar");
        justify_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                justify_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout input_containerLayout = new javax.swing.GroupLayout(input_container);
        input_container.setLayout(input_containerLayout);
        input_containerLayout.setHorizontalGroup(
            input_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, input_containerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(input_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(justify_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(input_containerLayout.createSequentialGroup()
                        .addGroup(input_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(system_matrix_label, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(input_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ma_label, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(10, 10, 10))
        );
        input_containerLayout.setVerticalGroup(
            input_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(input_containerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(input_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(system_matrix_label)
                    .addComponent(ma_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(input_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(separator)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(justify_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        iterations_label.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        iterations_label.setText("Iteraciones totales:");

        iterations.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        iterations.setText("0");

        solution_label.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        solution_label.setText("Solucion");

        solution_container.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        solution.setColumns(20);
        solution.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        solution.setRows(5);
        solution_container.setViewportView(solution);

        javax.swing.GroupLayout output_containerLayout = new javax.swing.GroupLayout(output_container);
        output_container.setLayout(output_containerLayout);
        output_containerLayout.setHorizontalGroup(
            output_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(output_containerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(output_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(solution_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(output_containerLayout.createSequentialGroup()
                        .addComponent(iterations_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iterations, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addComponent(solution_container, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        output_containerLayout.setVerticalGroup(
            output_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(output_containerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(output_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iterations_label)
                    .addComponent(iterations))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(solution_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(solution_container, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        stop_criteria_slider.setMaximum(1);
        stop_criteria_slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                stop_criteria_sliderStateChanged(evt);
            }
        });

        stop_criteria.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        stop_criteria.setText("Criterio de detencion");

        stop_criteria_value.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        stop_criteria_value.setText("0.00001");
        stop_criteria_value.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stop_criteria_valueKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout settings_containerLayout = new javax.swing.GroupLayout(settings_container);
        settings_container.setLayout(settings_containerLayout);
        settings_containerLayout.setHorizontalGroup(
            settings_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settings_containerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stop_criteria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stop_criteria_slider, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stop_criteria_value)
                .addContainerGap())
        );
        settings_containerLayout.setVerticalGroup(
            settings_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settings_containerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(settings_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settings_containerLayout.createSequentialGroup()
                        .addComponent(stop_criteria_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(stop_criteria_slider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stop_criteria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        button_solve.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        button_solve.setText("Resolver");
        button_solve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_solveActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        save_as_label.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        save_as_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        save_as_label.setText("GUARDAR SOLUCION COMO:");

        save_as_txt_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kevindm/jacobisel/resources/images/saveAsText.png"))); // NOI18N
        save_as_txt_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                save_as_txt_buttonMouseClicked(evt);
            }
        });

        save_as_doc_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kevindm/jacobisel/resources/images/saveAsDOCX.png"))); // NOI18N
        save_as_doc_button.setText("2");
        save_as_doc_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                save_as_doc_buttonMouseClicked(evt);
            }
        });

        save_as_pdf_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kevindm/jacobisel/resources/images/saveAsPDF.png"))); // NOI18N
        save_as_pdf_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                save_as_pdf_buttonMouseClicked(evt);
            }
        });

        save_as_email_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kevindm/jacobisel/resources/images/saveAsEmail.png"))); // NOI18N
        save_as_email_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                save_as_email_buttonMouseClicked(evt);
            }
        });

        save_as_img_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kevindm/jacobisel/resources/images/saveAsJPG.png"))); // NOI18N
        save_as_img_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                save_as_img_buttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout principal_containerLayout = new javax.swing.GroupLayout(principal_container);
        principal_container.setLayout(principal_containerLayout);
        principal_containerLayout.setHorizontalGroup(
            principal_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principal_containerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(principal_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(settings_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principal_containerLayout.createSequentialGroup()
                        .addComponent(input_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(output_container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(save_as_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principal_containerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(save_as_txt_button, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(save_as_doc_button, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(save_as_pdf_button, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(save_as_email_button, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(save_as_img_button, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)))
                .addGap(93, 93, 93))
            .addGroup(principal_containerLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(button_solve, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        principal_containerLayout.setVerticalGroup(
            principal_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principal_containerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(principal_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(input_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(output_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(settings_container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_solve, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(save_as_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(principal_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(save_as_txt_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(save_as_doc_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(save_as_pdf_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(save_as_email_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(save_as_img_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        restart_button.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        restart_button.setText("Reiniciar");
        restart_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restart_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(principal_container, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(justName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 184, Short.MAX_VALUE)
                        .addComponent(restart_button)
                        .addGap(52, 52, 52)
                        .addComponent(copyright)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(justName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(principal_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(copyright)
                    .addComponent(restart_button))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void restart_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restart_buttonActionPerformed
        reset();
        JOptionPane.showMessageDialog(null, "El boton de reiniciar tiene bugs!!!!");
    }//GEN-LAST:event_restart_buttonActionPerformed

    private void justify_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_justify_buttonActionPerformed
        JOptionPane.showMessageDialog(null, "No implementado aun");
        //System.out.println(Functions.justifyMatrix(system_matrix.getText()));
    }//GEN-LAST:event_justify_buttonActionPerformed

    private void save_as_txt_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_as_txt_buttonMouseClicked
        
        String filename = JOptionPane.showInputDialog("Escriba el nombre del archivo");
        File file = new File(filename+".txt");
        
        try{
            Formatter f = new Formatter(filename+".txt");
            f.format(solution.getText()+"By KevinDM 2022...");
            
            // PREGUNTAR SI QUIERE ABRIR EL ARCHIVO GUARDADO, PRIMERAMENTE COMPROBANDO SI EL ARCHIVO FUE CREADO:
            if (filename != null) {
	            String[] buttons = {"Si", "Quizas mas tarde"};
			    int option = JOptionPane.showOptionDialog(null, 
					"Se ha guardado la solucion correctamente como "+filename+"\nDesea abrir el archivo?", 
					"Archivo guardado", 
					JOptionPane.DEFAULT_OPTION, 
					JOptionPane.QUESTION_MESSAGE, null, 
					buttons, buttons[0]);
	                if(option == 1) {
	                    // POS NADA XD
	                } 
	                else if(option == 0) {
	                    // ABRIR EL ARCHIVO
	                    try{   
	                        File fil = new File(file.getPath());   
	                        if(!Desktop.isDesktopSupported()){    
	                            System.out.println("not supported");  
	                            //return;  
	                        }  
	                        Desktop desktop = Desktop.getDesktop();  
	                        if(fil.exists()){    
	                            desktop.open(fil);
	                        }        
	                    }catch(Exception e){  
	                        e.printStackTrace();  
	                    }
	                }
	        }

            f.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al guardar el archivo");
            System.out.println(e);
        }
          
        

    }//GEN-LAST:event_save_as_txt_buttonMouseClicked

    private void stop_criteria_sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_stop_criteria_sliderStateChanged
        stop_criteria_value.setText(""+stop_criteria_slider.getValue());
    }//GEN-LAST:event_stop_criteria_sliderStateChanged

    private void stop_criteria_valueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stop_criteria_valueKeyTyped
        //stop_criteria_slider.setValue(Integer.parseInt(stop_criteria_value.getText()));
    }//GEN-LAST:event_stop_criteria_valueKeyTyped

    private void save_as_doc_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_as_doc_buttonMouseClicked
        JOptionPane.showMessageDialog(null, "No implementado aun");
    }//GEN-LAST:event_save_as_doc_buttonMouseClicked

    private void save_as_pdf_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_as_pdf_buttonMouseClicked
        JOptionPane.showMessageDialog(null, "No implementado aun");
    }//GEN-LAST:event_save_as_pdf_buttonMouseClicked

    private void save_as_email_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_as_email_buttonMouseClicked
        JOptionPane.showMessageDialog(null, "No implementado aun");
    }//GEN-LAST:event_save_as_email_buttonMouseClicked

    private void save_as_img_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save_as_img_buttonMouseClicked
        JOptionPane.showMessageDialog(null, "No implementado aun");
    }//GEN-LAST:event_save_as_img_buttonMouseClicked

    private void button_solveActionPerformed(java.awt.event.ActionEvent evt) {
        // CHEQUEAR SI LOS CAMPOS ESTAN CUBIERTOS
        if (system_matrix.getText().isEmpty() && system_ampliated_matrix.getText().isEmpty() && stop_criteria_value.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Rellene todos los campos antes de realizar la operacion");
        }else if (system_matrix.getText().isEmpty() && system_ampliated_matrix.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ambas matrices estan en blanco!");
        }else if (system_ampliated_matrix.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "La matriz ampliada esta en blanco!");
        }else if (system_matrix.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "La matriz del sistema esta en blanco!");
        }else{
            solution.setText(Functions.jacobi(Functions.getAmpliatedMatrix(system_ampliated_matrix.getText()), Double.parseDouble(stop_criteria_value.getText()), system_matrix.getText()));
            iterations.setText(""+Functions.iterator);
            Functions.iterator -= Functions.iterator;       
        }
    }

    public void reset(){
        system_matrix.setText("");
        system_ampliated_matrix.setText("");
        stop_criteria_value.setText("0.00001");
        solution.setText("");
        iterations.setText("0");
    }


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_solve;
    private javax.swing.JLabel copyright;
    private javax.swing.JPanel input_container;
    private javax.swing.JLabel iterations;
    private javax.swing.JLabel iterations_label;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel justName;
    private javax.swing.JButton justify_button;
    private javax.swing.JLabel ma_label;
    private javax.swing.JPanel output_container;
    private javax.swing.JPanel principal_container;
    private javax.swing.JButton restart_button;
    private javax.swing.JLabel save_as_doc_button;
    private javax.swing.JLabel save_as_email_button;
    private javax.swing.JLabel save_as_img_button;
    private javax.swing.JLabel save_as_label;
    private javax.swing.JLabel save_as_pdf_button;
    private javax.swing.JLabel save_as_txt_button;
    private javax.swing.JSeparator separator;
    private javax.swing.JPanel settings_container;
    private javax.swing.JTextArea solution;
    private javax.swing.JScrollPane solution_container;
    private javax.swing.JLabel solution_label;
    private javax.swing.JLabel stop_criteria;
    private javax.swing.JSlider stop_criteria_slider;
    private javax.swing.JTextField stop_criteria_value;
    private javax.swing.JTextArea system_ampliated_matrix;
    public static javax.swing.JTextArea system_matrix;
    private javax.swing.JLabel system_matrix_label;
    // End of variables declaration//GEN-END:variables
}
