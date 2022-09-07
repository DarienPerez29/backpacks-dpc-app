
package backpacks.interfaces;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JOptionPane;
import java.awt.Toolkit;

import backpacks.tools.randomDataGenerator;
import backpacks.elements.Data;
import backpacks.tools.FileActions;
import backpacks.managers.DataListManager;


/**
 *
 * @author dapec
 */
public class MainView extends javax.swing.JFrame {
    public FileActions file;
    
    public MainView() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.file = new FileActions();
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/graphResources/BackpackDPC_icon.png")));
        this.setTitle("BackpacksDPC");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sizeGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        fillBtn = new javax.swing.JButton();
        LeftBackground = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        clearBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        printBtn = new javax.swing.JButton();
        sizeLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        brandLabel = new javax.swing.JLabel();
        brandComboBox = new javax.swing.JComboBox<>();
        colorField = new javax.swing.JTextField();
        modelField = new javax.swing.JTextField();
        zipperSpinner = new javax.swing.JSpinner();
        modelLabel = new javax.swing.JLabel();
        priceSpinner = new javax.swing.JSpinner();
        colorLabel = new javax.swing.JLabel();
        descLabel = new javax.swing.JLabel();
        gRadioBtn = new javax.swing.JRadioButton();
        xchRadioBtn = new javax.swing.JRadioButton();
        mRadioBtn = new javax.swing.JRadioButton();
        chRadioBtn = new javax.swing.JRadioButton();
        zipperLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descField = new javax.swing.JTextArea();
        minBtn = new javax.swing.JLabel();
        closeBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fillBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphResources/FillBtn.png"))); // NOI18N
        fillBtn.setBorder(null);
        fillBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fillBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fillBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                fillBtnMouseReleased(evt);
            }
        });
        fillBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillBtnActionPerformed(evt);
            }
        });
        jPanel2.add(fillBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 520, 288, 41));

        LeftBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphResources/FullBackground.png"))); // NOI18N
        jPanel2.add(LeftBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 390, 610));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphResources/BackpacksDPC_logo.png"))); // NOI18N
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 313, 50));

        clearBtn.setBackground(new java.awt.Color(255, 255, 255));
        clearBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphResources/ClearBtn.png"))); // NOI18N
        clearBtn.setBorder(null);
        clearBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clearBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                clearBtnMouseReleased(evt);
            }
        });
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        jPanel1.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 523, -1, -1));

        saveBtn.setBackground(new java.awt.Color(255, 255, 255));
        saveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphResources/SaveBtn.png"))); // NOI18N
        saveBtn.setBorder(null);
        saveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                saveBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                saveBtnMouseReleased(evt);
            }
        });
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        jPanel1.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 470, 384, -1));

        printBtn.setBackground(new java.awt.Color(255, 255, 255));
        printBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphResources/PrintBtn.png"))); // NOI18N
        printBtn.setBorder(null);
        printBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        printBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                printBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                printBtnMouseReleased(evt);
            }
        });
        printBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBtnActionPerformed(evt);
            }
        });
        jPanel1.add(printBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 523, -1, -1));

        sizeLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        sizeLabel.setForeground(new java.awt.Color(102, 102, 102));
        sizeLabel.setText("Tamaño");
        jPanel1.add(sizeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, -1, -1));

        priceLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(102, 102, 102));
        priceLabel.setText("Precio");
        jPanel1.add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 190, -1, -1));

        brandLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        brandLabel.setForeground(new java.awt.Color(102, 102, 102));
        brandLabel.setText("Marca");
        jPanel1.add(brandLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        brandComboBox.setBackground(new java.awt.Color(255, 255, 255));
        brandComboBox.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        brandComboBox.setForeground(new java.awt.Color(51, 51, 51));
        brandComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar marca", "Chuxian", "Vagabond", "Nike", "China", "PRI" }));
        brandComboBox.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true), javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3)));
        jPanel1.add(brandComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 200, 31));

        colorField.setBackground(new java.awt.Color(255, 255, 255));
        colorField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        colorField.setForeground(new java.awt.Color(51, 51, 51));
        colorField.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true), javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3)));
        jPanel1.add(colorField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 200, 31));

        modelField.setBackground(new java.awt.Color(255, 255, 255));
        modelField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        modelField.setForeground(new java.awt.Color(51, 51, 51));
        modelField.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true), javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3)));
        jPanel1.add(modelField, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, 200, 31));

        zipperSpinner.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        zipperSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        zipperSpinner.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true), javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3)));
        jPanel1.add(zipperSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 200, 30));

        modelLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        modelLabel.setForeground(new java.awt.Color(102, 102, 102));
        modelLabel.setText("Modelo");
        jPanel1.add(modelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, -1, -1));

        priceSpinner.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        priceSpinner.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 10000.0d, 100.0d));
        priceSpinner.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true), javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3)));
        jPanel1.add(priceSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 210, 200, 30));

        colorLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        colorLabel.setForeground(new java.awt.Color(102, 102, 102));
        colorLabel.setText("Color");
        jPanel1.add(colorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

        descLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        descLabel.setForeground(new java.awt.Color(102, 102, 102));
        descLabel.setText("Descripción");
        jPanel1.add(descLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, -1, -1));

        gRadioBtn.setBackground(new java.awt.Color(255, 255, 255));
        sizeGroup.add(gRadioBtn);
        gRadioBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        gRadioBtn.setForeground(new java.awt.Color(102, 102, 102));
        gRadioBtn.setText("G");
        gRadioBtn.setBorder(null);
        jPanel1.add(gRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(885, 287, -1, -1));

        xchRadioBtn.setBackground(new java.awt.Color(255, 255, 255));
        sizeGroup.add(xchRadioBtn);
        xchRadioBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        xchRadioBtn.setForeground(new java.awt.Color(102, 102, 102));
        xchRadioBtn.setText("XCH");
        xchRadioBtn.setBorder(null);
        jPanel1.add(xchRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 287, -1, -1));

        mRadioBtn.setBackground(new java.awt.Color(255, 255, 255));
        sizeGroup.add(mRadioBtn);
        mRadioBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        mRadioBtn.setForeground(new java.awt.Color(102, 102, 102));
        mRadioBtn.setText("M");
        mRadioBtn.setBorder(null);
        jPanel1.add(mRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 287, -1, -1));

        chRadioBtn.setBackground(new java.awt.Color(255, 255, 255));
        sizeGroup.add(chRadioBtn);
        chRadioBtn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        chRadioBtn.setForeground(new java.awt.Color(102, 102, 102));
        chRadioBtn.setText("CH");
        chRadioBtn.setBorder(null);
        jPanel1.add(chRadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(776, 287, -1, -1));

        zipperLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        zipperLabel.setForeground(new java.awt.Color(102, 102, 102));
        zipperLabel.setText("No. Cierres");
        jPanel1.add(zipperLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, -1, -1));

        descField.setColumns(20);
        descField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        descField.setRows(5);
        descField.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        jScrollPane1.setViewportView(descField);
        descField.setLineWrap(true);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 440, 70));

        minBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphResources/minBtn.png"))); // NOI18N
        minBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                minBtnMousePressed(evt);
            }
        });
        jPanel1.add(minBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(923, 0, -1, -1));

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphResources/closeBtn.png"))); // NOI18N
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closeBtnMousePressed(evt);
            }
        });
        jPanel1.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(962, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //CÓDIGO PARA ARRASTRAR LA VENTANA
    int mouseX, mouseY;
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int xPosition = evt.getXOnScreen();
        int yPosition = evt.getYOnScreen();
        
        this.setLocation(xPosition-mouseX,yPosition-mouseY);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed
    //fin de código para arrastrar la ventana
    
    
    
    //============== CÓDIGO PARA BOTONES DE VENTANA ==========================
    
    //Código para el botón de cerrar
    private void closeBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMousePressed
        dispose();
    }//GEN-LAST:event_closeBtnMousePressed

    private void closeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseEntered
        closeBtn.setIcon(new ImageIcon(getClass().getResource("/graphResources/closeBtn_Pressed.png")));
    }//GEN-LAST:event_closeBtnMouseEntered

    private void closeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseExited
        closeBtn.setIcon(new ImageIcon(getClass().getResource("/graphResources/closeBtn.png")));
    }//GEN-LAST:event_closeBtnMouseExited
    //fin de código para el botón de cerrar
    
    //Código para el botón de minimizar
    private void minBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minBtnMousePressed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minBtnMousePressed

    private void minBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minBtnMouseEntered
        minBtn.setIcon(new ImageIcon(getClass().getResource("/graphResources/minBtn_Pressed.png")));
    }//GEN-LAST:event_minBtnMouseEntered

    private void minBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minBtnMouseExited
        minBtn.setIcon(new ImageIcon(getClass().getResource("/graphResources/minBtn.png")));
    }//GEN-LAST:event_minBtnMouseExited
    //fin de código para el botón de minimizar
    
    
    //============== BOTONES PRINCIPALES ==========================
    
    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        this.saveData();
    }//GEN-LAST:event_saveBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        this.clearFields();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void printBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBtnActionPerformed
        this.printData();
    }//GEN-LAST:event_printBtnActionPerformed

    private void fillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillBtnActionPerformed
        this.fillFields();        
    }//GEN-LAST:event_fillBtnActionPerformed

    //============= ANIMACIONES DE BOTONES PRINCIPALES =============
    
    private void fillBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fillBtnMousePressed
        fillBtn.setIcon(new ImageIcon(getClass().getResource("/graphResources/fillBtn_pressed.png")));
    }//GEN-LAST:event_fillBtnMousePressed

    private void fillBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fillBtnMouseReleased
        fillBtn.setIcon(new ImageIcon(getClass().getResource("/graphResources/fillBtn.png")));
    }//GEN-LAST:event_fillBtnMouseReleased

    private void saveBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMousePressed
        saveBtn.setIcon(new ImageIcon(getClass().getResource("/graphResources/saveBtn_pressed.png")));
    }//GEN-LAST:event_saveBtnMousePressed

    private void saveBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseReleased
        saveBtn.setIcon(new ImageIcon(getClass().getResource("/graphResources/saveBtn.png")));
    }//GEN-LAST:event_saveBtnMouseReleased

    private void clearBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMousePressed
        clearBtn.setIcon(new ImageIcon(getClass().getResource("/graphResources/clearBtn_pressed.png")));
    }//GEN-LAST:event_clearBtnMousePressed

    private void clearBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseReleased
        clearBtn.setIcon(new ImageIcon(getClass().getResource("/graphResources/clearBtn.png")));
    }//GEN-LAST:event_clearBtnMouseReleased

    private void printBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printBtnMousePressed
        printBtn.setIcon(new ImageIcon(getClass().getResource("/graphResources/printBtn_pressed.png")));
    }//GEN-LAST:event_printBtnMousePressed

    private void printBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printBtnMouseReleased
        printBtn.setIcon(new ImageIcon(getClass().getResource("/graphResources/printBtn.png")));
    }//GEN-LAST:event_printBtnMouseReleased
    
        
    
    //============== CÓDIGO PRINCIPAL ==========================
    
    public void saveData(){
        if(file.getPathFile().equals("")){
            checkPath();
            if(!file.getPathFile().equals("")){
                saveData();
            }//end if
        }//end if sin ruta
        else{            
            String brand = this.brandComboBox.getSelectedItem().toString();
            String model = this.modelField.getText();
            String color = this.colorField.getText();
            Double price = (Double)this.priceSpinner.getValue();
            int zippers = (int)this.zipperSpinner.getValue();
            String desc = this.descField.getText();
            String size = "";
            if(xchRadioBtn.isSelected()){
                size = "Extra chica";
            }//end if extra chica
            else if(chRadioBtn.isSelected()){
                size = "Chica";
            }//end else if chica
            else if(mRadioBtn.isSelected()){
                size = "Mediana";
            }//end else if mediana
            else if(gRadioBtn.isSelected()){
                size = "Grande";
            }//end else if grande
            
            
            if(brand.equals("Seleccionar marca") || model.equals("") || color.equals("") 
                    || price <= 0.0 || zippers <= 0 || size.equals("") || desc.equals(""))
            {
                JOptionPane.showMessageDialog(this, "Verifica que los campos esten llenados correctamente",
                        "Error con los campos", JOptionPane.WARNING_MESSAGE);
            }//end if campos vacíos
            else{
                Data inSaveData = new Data(brand, model, color, price, zippers, size, desc);
                try{
                    file.fillFile(inSaveData.toStringCsv() + "\n");
                    JOptionPane.showMessageDialog(this, "Datos registrados exitosamente", "Datos registrados", JOptionPane.INFORMATION_MESSAGE);
                    clearFields();
                }//end try
                catch(Exception e){
                    JOptionPane.showMessageDialog(this, "Error al insertar en el archivo", "Error de inserción", JOptionPane.ERROR_MESSAGE);
                    System.out.println(e);
                }//end catch
            }//end else campos llenos
                        
        }//end else con ruta
        
    }//end saveData
    
    public void printData(){
        if(file.getPathFile().equals("")){
            checkPath();
            if(!file.getPathFile().equals("")){
                printData();
            }//end if
        }//end if sin ruta
        else{
            DataListManager list  = new DataListManager();
            try{
                list.fillListWithFile(file.getPathFile());
                JOptionPane.showMessageDialog(this, "REGISTROS DISPONIBLES:\n" + list.getPrintedList(), "Impresión de archivo", JOptionPane.INFORMATION_MESSAGE);
            }//end try
            catch(Exception e){
                JOptionPane.showMessageDialog(this, "Se ha producido un error en la impresión del archivo", "Error de impresión", JOptionPane.WARNING_MESSAGE);
                System.out.println(e);
            }//end catch
            
        }//end else con ruta
        
    }//end printData
    
    public void clearFields(){
        brandComboBox.setSelectedIndex(0);
        modelField.setText("");
        colorField.setText("");
        priceSpinner.setValue(0.0);
        zipperSpinner.setValue(0);
        sizeGroup.clearSelection();
        descField.setText("");
    }//end clearFields
    
    public void fillFields(){
        randomDataGenerator randData = new randomDataGenerator();
        randData.generateRandomValues();
        
        JRadioButton[] radioBtns = {xchRadioBtn, chRadioBtn, mRadioBtn, gRadioBtn};
        
        brandComboBox.setSelectedIndex(randData.getRandBrand());
        modelField.setText(randData.getRandModel());
        colorField.setText(randData.getRandColor());
        priceSpinner.setValue(randData.getRandPrice());
        zipperSpinner.setValue(randData.getRandZippers());
        sizeGroup.setSelected(radioBtns[randData.getRandIndexSize()].getModel(), true);
        descField.setText(randData.getRandDesc());
    }//end fillFields
    
    public void checkPath(){
        int op = JOptionPane.showConfirmDialog(this, "No hay un archivo seleccionado para los datos.\n"
                + "¿Deseas seleccionar un archivo?", "Sin archivo seleccionado", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        
        if(op == 0){
            file.selectPathFile();
        }//end if
        else{
            JOptionPane.showMessageDialog(this, "Selecciona un archivo para leer o guardar tus datos...",
                    "Es necesario un arcihvo", JOptionPane.WARNING_MESSAGE);
        }//end else
        
    }//end checkRoute
  
    
    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LeftBackground;
    private javax.swing.JLabel Logo;
    private javax.swing.JComboBox<String> brandComboBox;
    private javax.swing.JLabel brandLabel;
    private javax.swing.JRadioButton chRadioBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JTextField colorField;
    private javax.swing.JLabel colorLabel;
    private javax.swing.JTextArea descField;
    private javax.swing.JLabel descLabel;
    private javax.swing.JButton fillBtn;
    private javax.swing.JRadioButton gRadioBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton mRadioBtn;
    private javax.swing.JLabel minBtn;
    private javax.swing.JTextField modelField;
    private javax.swing.JLabel modelLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JSpinner priceSpinner;
    private javax.swing.JButton printBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.ButtonGroup sizeGroup;
    private javax.swing.JLabel sizeLabel;
    private javax.swing.JRadioButton xchRadioBtn;
    private javax.swing.JLabel zipperLabel;
    private javax.swing.JSpinner zipperSpinner;
    // End of variables declaration//GEN-END:variables
}
