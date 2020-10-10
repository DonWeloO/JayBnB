/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;
import javax.swing.SwingConstants;

import org.kordamp.ikonli.entypo.Entypo;
import org.kordamp.ikonli.fontawesome5.FontAwesomeSolid;
import org.kordamp.ikonli.swing.FontIcon;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import RSMaterialComponent.RSButtonIconOne;
import rojeru_san.efectos.ValoresEnum.ICONS;
import RSMaterialComponent.RSButtonIconTwo;

import java.awt.Color;
import java.awt.Font;
import necesario.Global.THEMETOOLTIP;
import RSMaterialComponent.RSButtonShapeIcon;
import RSMaterialComponent.RSButtonShapeIcon.FORMA;
import Vista.MainMenu;
import RSMaterialComponent.RSButtonShape;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import RSMaterialComponent.RSTextFieldTwo;
import newscomponents.RSDateChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import RSMaterialComponent.RSTextFieldOne;
import java.awt.SystemColor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import rojeru_san.complementos.RSCustomPopuMenu;
import RSMaterialComponent.RSComboBox;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

/**
 *
 * @author RavenPC
 */
public class RegistroPropiedad2 extends javax.swing.JPanel {

	private static final String EMAIL_PATTERN = 
		    "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	DocumentFilter filter = new UppercaseDocumentFilter();
	
    /**
     * Creates new form Panel1
     */
    public RegistroPropiedad2() {
    	setBackground(new Color(255, 255, 255));
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBounds(0, 0, 785, 37);
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);

        jLabel1.setBackground(new Color(0, 80, 112));
        jLabel1.setFont(new Font("Dubai", Font.BOLD, 20)); // NOI18N
        jLabel1.setText("Registrar una Propiedad");
        jLabel1.setOpaque(true);
        
        RSButtonShape btnshpAgregarCliente = new RSButtonShape();
        btnshpAgregarCliente.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		JOptionPane.showMessageDialog(null, "EL CLIENTE FUE GUARDADO EXITOSAMENTE", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);      	
        		//MensajeOK mensaje = new MensajeOK("GUARDAR CLIENTE", "EL CLIENTE FUE GUARDADO EXITOSAMENTE");
        		//mensaje.setVisible(true);
            	MainMenu.panelBody.removeAll();
            	MainMenu.panelBody.add(new MenuClientes());
            	MainMenu.panelBody.repaint();
            	MainMenu.panelBody.revalidate();
        	
        	}
        });
        btnshpAgregarCliente.setBounds(298, 569, 211, 63);
        btnshpAgregarCliente.setFont(new Font("Dubai", Font.BOLD, 13));
        btnshpAgregarCliente.setForegroundHover(Color.white);
        btnshpAgregarCliente.backgroundHover = UIManager.getColor("Button.shadow");
        btnshpAgregarCliente.setBackgroundHover(new Color(3, 33, 57));
        btnshpAgregarCliente.setForegroundText(Color.white);
        btnshpAgregarCliente.setForeground(Color.gray);
        btnshpAgregarCliente.setBackground(new Color(0, 51, 102));
        btnshpAgregarCliente.setHorizontalAlignment(SwingConstants.CENTER);
        btnshpAgregarCliente.setText("   GUARDAR");
        btnshpAgregarCliente.setIcon(FontIcon.of(FontAwesomeSolid.SAVE, 40, Color.white));
        btnshpAgregarCliente.setForma(RSButtonShape.FORMA.ROUND);
        
        RSButtonShape btnshpBuscarCliente = new RSButtonShape();
        btnshpBuscarCliente.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
            	MainMenu.panelBody.removeAll();
            	MainMenu.panelBody.add(new MenuClientes());
            	MainMenu.panelBody.repaint();
            	MainMenu.panelBody.revalidate();
        	}
        });
        btnshpBuscarCliente.setBounds(523, 569, 211, 63);
        btnshpBuscarCliente.setFont(new Font("Dubai", Font.BOLD, 13));
        btnshpBuscarCliente.setForegroundHover(new Color(3, 33, 57));
        btnshpBuscarCliente.setBackgroundHover(new Color(128, 128, 128));
        btnshpBuscarCliente.setForegroundText(new Color(3, 33, 57));
        btnshpBuscarCliente.setForeground(new Color(0, 128, 128));
        btnshpBuscarCliente.setBackground(new Color(211, 211, 211));
        btnshpBuscarCliente.setText("   CANCELAR");
        btnshpBuscarCliente.setHorizontalAlignment(SwingConstants.CENTER);
        btnshpBuscarCliente.setIcon(FontIcon.of(Entypo.BLOCK, 40, new Color(0, 51, 102)));
        btnshpBuscarCliente.setForma(RSButtonShape.FORMA.ROUND);
        setLayout(null);
        add(jLabel1);
        add(btnshpAgregarCliente);
        add(btnshpBuscarCliente);
        
        JLabel label_1 = new JLabel("ROL:");
        label_1.setHorizontalAlignment(SwingConstants.RIGHT);
        label_1.setForeground(new Color(3, 33, 57));
        label_1.setFont(new Font("Dubai", Font.BOLD, 16));
        label_1.setBounds(50, 51, 115, 33);
        add(label_1);
        
        JLabel label_2 = new JLabel("Nombre Propiedad:");
        label_2.setHorizontalAlignment(SwingConstants.RIGHT);
        label_2.setForeground(new Color(3, 33, 57));
        label_2.setFont(new Font("Dubai", Font.BOLD, 16));
        label_2.setBounds(6, 84, 159, 33);
        add(label_2);
        
        JLabel label_3 = new JLabel("Direcci\u00F3n:");
        label_3.setHorizontalAlignment(SwingConstants.RIGHT);
        label_3.setForeground(new Color(3, 33, 57));
        label_3.setFont(new Font("Dubai", Font.BOLD, 16));
        label_3.setBounds(50, 120, 115, 33);
        add(label_3);
        
        JLabel label_4 = new JLabel("Comuna:");
        label_4.setHorizontalAlignment(SwingConstants.RIGHT);
        label_4.setForeground(new Color(3, 33, 57));
        label_4.setFont(new Font("Dubai", Font.BOLD, 16));
        label_4.setBounds(50, 159, 115, 33);
        add(label_4);
        
        RSTextFieldOne textFieldOne = new RSTextFieldOne();
        textFieldOne.setPlaceholder("0001");
        textFieldOne.setPhColor(SystemColor.controlDkShadow);
        textFieldOne.setForeground(new Color(25, 25, 112));
        textFieldOne.setFont(new Font("Dubai", Font.BOLD, 16));
        textFieldOne.setBorderColor(new Color(3, 33, 57));
        textFieldOne.setBounds(175, 52, 82, 28);
        add(textFieldOne);
        
        RSTextFieldOne textFieldOne_1 = new RSTextFieldOne();
        textFieldOne_1.setPlaceholder("0001");
        textFieldOne_1.setPhColor(SystemColor.controlDkShadow);
        textFieldOne_1.setForeground(new Color(25, 25, 112));
        textFieldOne_1.setFont(new Font("Dubai", Font.BOLD, 16));
        textFieldOne_1.setBorderColor(new Color(3, 33, 57));
        textFieldOne_1.setBounds(285, 52, 82, 28);
        add(textFieldOne_1);
        
        JLabel label_5 = new JLabel("-");
        label_5.setHorizontalAlignment(SwingConstants.RIGHT);
        label_5.setForeground(new Color(3, 33, 57));
        label_5.setFont(new Font("Dubai", Font.BOLD, 39));
        label_5.setBounds(259, 51, 20, 27);
        add(label_5);
        
        RSTextFieldOne textFieldOne_2 = new RSTextFieldOne();
        textFieldOne_2.setPlaceholder("");
        textFieldOne_2.setPhColor(SystemColor.controlDkShadow);
        textFieldOne_2.setForeground(new Color(25, 25, 112));
        textFieldOne_2.setFont(new Font("Dubai", Font.BOLD, 16));
        textFieldOne_2.setBorderColor(new Color(3, 33, 57));
        textFieldOne_2.setBounds(175, 86, 261, 28);
        add(textFieldOne_2);
        
        RSTextFieldOne textFieldOne_3 = new RSTextFieldOne();
        textFieldOne_3.setPlaceholder("");
        textFieldOne_3.setPhColor(SystemColor.controlDkShadow);
        textFieldOne_3.setForeground(new Color(25, 25, 112));
        textFieldOne_3.setFont(new Font("Dubai", Font.BOLD, 16));
        textFieldOne_3.setBorderColor(new Color(3, 33, 57));
        textFieldOne_3.setBounds(175, 122, 261, 28);
        add(textFieldOne_3);
        
        RSComboBox comboBox = new RSComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"SANTIAGO", "VI\u00D1A DEL MAR"}));
        comboBox.setForeground(new Color(25, 25, 112));
        comboBox.setFont(new Font("Dubai", Font.BOLD, 16));
        comboBox.setConBorde(true);
        comboBox.setColorFondo(Color.WHITE);
        comboBox.setColorBorde(new Color(25, 25, 112));
        comboBox.setColorArrow(new Color(25, 25, 112));
        comboBox.setBounds(175, 159, 200, 32);
        add(comboBox);
        
        RSTextFieldOne textFieldOne_4 = new RSTextFieldOne();
        textFieldOne_4.setPlaceholder("");
        textFieldOne_4.setPhColor(SystemColor.controlDkShadow);
        textFieldOne_4.setForeground(new Color(25, 25, 112));
        textFieldOne_4.setFont(new Font("Dubai", Font.BOLD, 16));
        textFieldOne_4.setBorderColor(new Color(3, 33, 57));
        textFieldOne_4.setBounds(175, 202, 261, 28);
        add(textFieldOne_4);
        
        JLabel label_6 = new JLabel("RUT Propietario:");
        label_6.setHorizontalAlignment(SwingConstants.RIGHT);
        label_6.setForeground(new Color(3, 33, 57));
        label_6.setFont(new Font("Dubai", Font.BOLD, 16));
        label_6.setBounds(50, 239, 115, 33);
        add(label_6);
        
        RSTextFieldOne textFieldOne_5 = new RSTextFieldOne();
        textFieldOne_5.setPlaceholder("");
        textFieldOne_5.setPhColor(SystemColor.controlDkShadow);
        textFieldOne_5.setForeground(new Color(25, 25, 112));
        textFieldOne_5.setFont(new Font("Dubai", Font.BOLD, 16));
        textFieldOne_5.setBorderColor(new Color(3, 33, 57));
        textFieldOne_5.setBounds(175, 241, 135, 28);
        add(textFieldOne_5);
        
        JLabel label_7 = new JLabel("Nombre Propietario:");
        label_7.setHorizontalAlignment(SwingConstants.RIGHT);
        label_7.setForeground(new Color(3, 33, 57));
        label_7.setFont(new Font("Dubai", Font.BOLD, 16));
        label_7.setBounds(6, 200, 159, 33);
        add(label_7);
        
        JLabel label_8 = new JLabel("Aval\u00FAo Fiscal:");
        label_8.setHorizontalAlignment(SwingConstants.RIGHT);
        label_8.setForeground(new Color(3, 33, 57));
        label_8.setFont(new Font("Dubai", Font.BOLD, 16));
        label_8.setBounds(474, 51, 115, 33);
        add(label_8);
        
        RSTextFieldOne textFieldOne_6 = new RSTextFieldOne();
        textFieldOne_6.setPlaceholder("$");
        textFieldOne_6.setPhColor(SystemColor.controlDkShadow);
        textFieldOne_6.setForeground(new Color(25, 25, 112));
        textFieldOne_6.setFont(new Font("Dubai", Font.BOLD, 16));
        textFieldOne_6.setBorderColor(new Color(3, 33, 57));
        textFieldOne_6.setBounds(609, 51, 135, 32);
        add(textFieldOne_6);
        
        JLabel label_9 = new JLabel("Valor de Compra:");
        label_9.setHorizontalAlignment(SwingConstants.RIGHT);
        label_9.setForeground(new Color(3, 33, 57));
        label_9.setFont(new Font("Dubai", Font.BOLD, 16));
        label_9.setBounds(464, 86, 135, 33);
        add(label_9);
        
        RSTextFieldOne textFieldOne_7 = new RSTextFieldOne();
        textFieldOne_7.setPlaceholder("$");
        textFieldOne_7.setPhColor(SystemColor.controlDkShadow);
        textFieldOne_7.setForeground(new Color(25, 25, 112));
        textFieldOne_7.setFont(new Font("Dubai", Font.BOLD, 16));
        textFieldOne_7.setBorderColor(new Color(3, 33, 57));
        textFieldOne_7.setBounds(609, 86, 135, 32);
        add(textFieldOne_7);
        
        JLabel label_10 = new JLabel("Gastos Comunes:");
        label_10.setHorizontalAlignment(SwingConstants.RIGHT);
        label_10.setForeground(new Color(3, 33, 57));
        label_10.setFont(new Font("Dubai", Font.BOLD, 16));
        label_10.setBounds(464, 122, 135, 33);
        add(label_10);
        
        RSTextFieldOne textFieldOne_8 = new RSTextFieldOne();
        textFieldOne_8.setPlaceholder("$");
        textFieldOne_8.setPhColor(SystemColor.controlDkShadow);
        textFieldOne_8.setForeground(new Color(25, 25, 112));
        textFieldOne_8.setFont(new Font("Dubai", Font.BOLD, 16));
        textFieldOne_8.setBorderColor(new Color(3, 33, 57));
        textFieldOne_8.setBounds(609, 122, 135, 32);
        add(textFieldOne_8);
        
        JLabel label_11 = new JLabel("Gastos B\u00E1sicos:");
        label_11.setHorizontalAlignment(SwingConstants.RIGHT);
        label_11.setForeground(new Color(3, 33, 57));
        label_11.setFont(new Font("Dubai", Font.BOLD, 16));
        label_11.setBounds(464, 159, 135, 33);
        add(label_11);
        
        RSTextFieldOne textFieldOne_9 = new RSTextFieldOne();
        textFieldOne_9.setPlaceholder("$");
        textFieldOne_9.setPhColor(SystemColor.controlDkShadow);
        textFieldOne_9.setForeground(new Color(25, 25, 112));
        textFieldOne_9.setFont(new Font("Dubai", Font.BOLD, 16));
        textFieldOne_9.setBorderColor(new Color(3, 33, 57));
        textFieldOne_9.setBounds(609, 159, 135, 32);
        add(textFieldOne_9);
        
        JLabel label_12 = new JLabel("Contribuciones:");
        label_12.setHorizontalAlignment(SwingConstants.RIGHT);
        label_12.setForeground(new Color(3, 33, 57));
        label_12.setFont(new Font("Dubai", Font.BOLD, 16));
        label_12.setBounds(464, 197, 135, 33);
        add(label_12);
        
        RSTextFieldOne textFieldOne_10 = new RSTextFieldOne();
        textFieldOne_10.setPlaceholder("$");
        textFieldOne_10.setPhColor(SystemColor.controlDkShadow);
        textFieldOne_10.setForeground(new Color(25, 25, 112));
        textFieldOne_10.setFont(new Font("Dubai", Font.BOLD, 16));
        textFieldOne_10.setBorderColor(new Color(3, 33, 57));
        textFieldOne_10.setBounds(609, 197, 135, 32);
        add(textFieldOne_10);
        
        JLabel label_13 = new JLabel("Valor Inventario:");
        label_13.setHorizontalAlignment(SwingConstants.RIGHT);
        label_13.setForeground(new Color(3, 33, 57));
        label_13.setFont(new Font("Dubai", Font.BOLD, 16));
        label_13.setBounds(464, 239, 135, 33);
        add(label_13);
        
        RSTextFieldOne textFieldOne_11 = new RSTextFieldOne();
        textFieldOne_11.setPlaceholder("$");
        textFieldOne_11.setPhColor(SystemColor.controlDkShadow);
        textFieldOne_11.setForeground(new Color(25, 25, 112));
        textFieldOne_11.setFont(new Font("Dubai", Font.BOLD, 16));
        textFieldOne_11.setBorderColor(new Color(3, 33, 57));
        textFieldOne_11.setBounds(609, 239, 135, 32);
        add(textFieldOne_11);
        
        JLabel label_14 = new JLabel("Valor Noche:");
        label_14.setHorizontalAlignment(SwingConstants.RIGHT);
        label_14.setForeground(new Color(3, 33, 57));
        label_14.setFont(new Font("Dubai", Font.BOLD, 16));
        label_14.setBounds(464, 279, 135, 33);
        add(label_14);
        
        RSTextFieldOne textFieldOne_12 = new RSTextFieldOne();
        textFieldOne_12.setPlaceholder("$");
        textFieldOne_12.setPhColor(SystemColor.controlDkShadow);
        textFieldOne_12.setForeground(new Color(25, 25, 112));
        textFieldOne_12.setFont(new Font("Dubai", Font.BOLD, 16));
        textFieldOne_12.setBorderColor(new Color(3, 33, 57));
        textFieldOne_12.setBounds(609, 279, 135, 32);
        add(textFieldOne_12);
        
        JLabel label_15 = new JLabel("N\u00B0 de Habitaciones:");
        label_15.setHorizontalAlignment(SwingConstants.RIGHT);
        label_15.setForeground(new Color(3, 33, 57));
        label_15.setFont(new Font("Dubai", Font.BOLD, 16));
        label_15.setBounds(20, 279, 145, 33);
        add(label_15);
        
        RSTextFieldOne textFieldOne_13 = new RSTextFieldOne();
        textFieldOne_13.setPlaceholder("3");
        textFieldOne_13.setPhColor(SystemColor.controlDkShadow);
        textFieldOne_13.setForeground(new Color(25, 25, 112));
        textFieldOne_13.setFont(new Font("Dubai", Font.BOLD, 16));
        textFieldOne_13.setBorderColor(new Color(3, 33, 57));
        textFieldOne_13.setBounds(175, 281, 45, 28);
        add(textFieldOne_13);
        
        JLabel label_16 = new JLabel("Max. Ocupantes:");
        label_16.setHorizontalAlignment(SwingConstants.RIGHT);
        label_16.setForeground(new Color(3, 33, 57));
        label_16.setFont(new Font("Dubai", Font.BOLD, 16));
        label_16.setBounds(269, 280, 145, 33);
        add(label_16);
        
        RSTextFieldOne textFieldOne_14 = new RSTextFieldOne();
        textFieldOne_14.setPlaceholder("3");
        textFieldOne_14.setPhColor(SystemColor.controlDkShadow);
        textFieldOne_14.setForeground(new Color(25, 25, 112));
        textFieldOne_14.setFont(new Font("Dubai", Font.BOLD, 16));
        textFieldOne_14.setBorderColor(new Color(3, 33, 57));
        textFieldOne_14.setBounds(424, 282, 45, 28);
        add(textFieldOne_14);
        
        JLabel label_17 = new JLabel("N\u00B0 de Ba\u00F1os:");
        label_17.setHorizontalAlignment(SwingConstants.RIGHT);
        label_17.setForeground(new Color(3, 33, 57));
        label_17.setFont(new Font("Dubai", Font.BOLD, 16));
        label_17.setBounds(20, 316, 145, 33);
        add(label_17);
        
        RSTextFieldOne textFieldOne_15 = new RSTextFieldOne();
        textFieldOne_15.setPlaceholder("3");
        textFieldOne_15.setPhColor(SystemColor.controlDkShadow);
        textFieldOne_15.setForeground(new Color(25, 25, 112));
        textFieldOne_15.setFont(new Font("Dubai", Font.BOLD, 16));
        textFieldOne_15.setBorderColor(new Color(3, 33, 57));
        textFieldOne_15.setBounds(175, 318, 45, 28);
        add(textFieldOne_15);
        
        JLabel label_18 = new JLabel("N\u00B0 de Bodegas:");
        label_18.setHorizontalAlignment(SwingConstants.RIGHT);
        label_18.setForeground(new Color(3, 33, 57));
        label_18.setFont(new Font("Dubai", Font.BOLD, 16));
        label_18.setBounds(269, 316, 145, 33);
        add(label_18);
        
        RSTextFieldOne textFieldOne_16 = new RSTextFieldOne();
        textFieldOne_16.setPlaceholder("3");
        textFieldOne_16.setPhColor(SystemColor.controlDkShadow);
        textFieldOne_16.setForeground(new Color(25, 25, 112));
        textFieldOne_16.setFont(new Font("Dubai", Font.BOLD, 16));
        textFieldOne_16.setBorderColor(new Color(3, 33, 57));
        textFieldOne_16.setBounds(424, 318, 45, 28);
        add(textFieldOne_16);
        
        JLabel label_19 = new JLabel("N\u00B0 de Estacionamiento:");
        label_19.setHorizontalAlignment(SwingConstants.RIGHT);
        label_19.setForeground(new Color(3, 33, 57));
        label_19.setFont(new Font("Dubai", Font.BOLD, 16));
        label_19.setBounds(240, 360, 174, 33);
        add(label_19);
        
        RSTextFieldOne textFieldOne_17 = new RSTextFieldOne();
        textFieldOne_17.setPlaceholder("3");
        textFieldOne_17.setPhColor(SystemColor.controlDkShadow);
        textFieldOne_17.setForeground(new Color(25, 25, 112));
        textFieldOne_17.setFont(new Font("Dubai", Font.BOLD, 16));
        textFieldOne_17.setBorderColor(new Color(3, 33, 57));
        textFieldOne_17.setBounds(424, 362, 45, 28);
        add(textFieldOne_17);
        
        RSTextFieldOne textFieldOne_18 = new RSTextFieldOne();
        textFieldOne_18.setPlaceholder("3");
        textFieldOne_18.setPhColor(SystemColor.controlDkShadow);
        textFieldOne_18.setForeground(new Color(25, 25, 112));
        textFieldOne_18.setFont(new Font("Dubai", Font.BOLD, 16));
        textFieldOne_18.setBorderColor(new Color(3, 33, 57));
        textFieldOne_18.setBounds(175, 362, 45, 28);
        add(textFieldOne_18);
        
        JLabel label_20 = new JLabel("N\u00B0 de Cocinas:");
        label_20.setHorizontalAlignment(SwingConstants.RIGHT);
        label_20.setForeground(new Color(3, 33, 57));
        label_20.setFont(new Font("Dubai", Font.BOLD, 16));
        label_20.setBounds(20, 360, 145, 33);
        add(label_20);
        
        JLabel label_21 = new JLabel("Metros Cuadrados:");
        label_21.setHorizontalAlignment(SwingConstants.RIGHT);
        label_21.setForeground(new Color(3, 33, 57));
        label_21.setFont(new Font("Dubai", Font.BOLD, 16));
        label_21.setBounds(20, 401, 145, 33);
        add(label_21);
        
        RSTextFieldOne textFieldOne_19 = new RSTextFieldOne();
        textFieldOne_19.setPlaceholder("3");
        textFieldOne_19.setPhColor(SystemColor.controlDkShadow);
        textFieldOne_19.setForeground(new Color(25, 25, 112));
        textFieldOne_19.setFont(new Font("Dubai", Font.BOLD, 16));
        textFieldOne_19.setBorderColor(new Color(3, 33, 57));
        textFieldOne_19.setBounds(175, 403, 45, 28);
        add(textFieldOne_19);
        
        RSComboBox comboBox_1 = new RSComboBox();
        comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"SI", "NO"}));
        comboBox_1.setForeground(new Color(25, 25, 112));
        comboBox_1.setFont(new Font("Dubai", Font.BOLD, 16));
        comboBox_1.setConBorde(true);
        comboBox_1.setColorFondo(Color.WHITE);
        comboBox_1.setColorBorde(new Color(25, 25, 112));
        comboBox_1.setColorArrow(new Color(25, 25, 112));
        comboBox_1.setBounds(424, 401, 66, 32);
        add(comboBox_1);
        
        JLabel label_22 = new JLabel("Jard\u00EDn:");
        label_22.setHorizontalAlignment(SwingConstants.RIGHT);
        label_22.setForeground(new Color(3, 33, 57));
        label_22.setFont(new Font("Dubai", Font.BOLD, 16));
        label_22.setBounds(299, 404, 115, 33);
        add(label_22);
        
        JLabel label_23 = new JLabel("Caracter\u00EDsticas:");
        label_23.setHorizontalAlignment(SwingConstants.RIGHT);
        label_23.setForeground(new Color(3, 33, 57));
        label_23.setFont(new Font("Dubai", Font.BOLD, 16));
        label_23.setBounds(20, 455, 145, 33);
        add(label_23);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportBorder(new LineBorder(new Color(25, 25, 112)));
        scrollPane.setBounds(179, 455, 491, 75);
        add(scrollPane);
        
        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Dubai", Font.BOLD, 14));
        scrollPane.setViewportView(textArea);
    }// </editor-fold>//GEN-END:initComponents
    private javax.swing.JLabel jLabel1;
    
    class UppercaseDocumentFilter extends DocumentFilter {
        public void insertString(DocumentFilter.FilterBypass fb, int offset,
                String text, AttributeSet attr) throws BadLocationException {

            fb.insertString(offset, text.toUpperCase(), attr);
        }

        public void replace(DocumentFilter.FilterBypass fb, int offset, int length,
                String text, AttributeSet attrs) throws BadLocationException {

            fb.replace(offset, length, text.toUpperCase(), attrs);
        }
    }
}
