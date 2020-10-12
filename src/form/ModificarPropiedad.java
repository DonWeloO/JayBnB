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

import Controlador.ConectPropiedades;
import Modelo.Propiedad;

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
import java.util.ArrayList;

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
public class ModificarPropiedad extends javax.swing.JPanel {

	private static final String EMAIL_PATTERN = 
		    "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	DocumentFilter filter = new UppercaseDocumentFilter();
	Propiedad prop = new Propiedad();
	
    /**
     * Creates new form Panel1
     */
    public ModificarPropiedad(String rol) {
    	setBackground(new Color(255, 255, 255));
        initComponents(rol);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(String rol) {
    	Propiedad modiprop = new Propiedad();
    	
    	modiprop = traerPropiedad(rol);
    	
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBounds(0, 0, 785, 37);
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);

        jLabel1.setBackground(new Color(0, 80, 112));
        jLabel1.setFont(new Font("Dubai", Font.BOLD, 20)); // NOI18N
        jLabel1.setText("Modificar la Propiedad ROL: "+modiprop.getRol_propie());
        jLabel1.setOpaque(true);
        
        RSButtonShape btnGuardar = new RSButtonShape();

        btnGuardar.setBounds(298, 569, 211, 63);
        btnGuardar.setFont(new Font("Dubai", Font.BOLD, 13));
        btnGuardar.setForegroundHover(Color.white);
        btnGuardar.backgroundHover = UIManager.getColor("Button.shadow");
        btnGuardar.setBackgroundHover(new Color(3, 33, 57));
        btnGuardar.setForegroundText(Color.white);
        btnGuardar.setForeground(Color.gray);
        btnGuardar.setBackground(new Color(0, 51, 102));
        btnGuardar.setHorizontalAlignment(SwingConstants.CENTER);
        btnGuardar.setText("   GUARDAR");
        btnGuardar.setIcon(FontIcon.of(FontAwesomeSolid.SAVE, 40, Color.white));
        btnGuardar.setForma(RSButtonShape.FORMA.ROUND);
        
        RSButtonShape btnSalir = new RSButtonShape();
        btnSalir.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
            	MainMenu.panelBody.removeAll();
            	MainMenu.panelBody.add(new BuscarPropiedad());
            	MainMenu.panelBody.repaint();
            	MainMenu.panelBody.revalidate();
        	}
        });
        btnSalir.setBounds(523, 569, 211, 63);
        btnSalir.setFont(new Font("Dubai", Font.BOLD, 13));
        btnSalir.setForegroundHover(new Color(3, 33, 57));
        btnSalir.setBackgroundHover(new Color(128, 128, 128));
        btnSalir.setForegroundText(new Color(3, 33, 57));
        btnSalir.setForeground(new Color(0, 128, 128));
        btnSalir.setBackground(new Color(211, 211, 211));
        btnSalir.setText("   CANCELAR");
        btnSalir.setHorizontalAlignment(SwingConstants.CENTER);
        btnSalir.setIcon(FontIcon.of(Entypo.BLOCK, 40, new Color(0, 51, 102)));
        btnSalir.setForma(RSButtonShape.FORMA.ROUND);
        setLayout(null);
        add(jLabel1);
        add(btnGuardar);
        add(btnSalir);
        
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
        
        RSTextFieldOne txtROL = new RSTextFieldOne();
        txtROL.setPlaceholder("0001");
        txtROL.setPhColor(SystemColor.controlDkShadow);
        txtROL.setForeground(new Color(25, 25, 112));
        txtROL.setFont(new Font("Dubai", Font.BOLD, 16));
        txtROL.setBorderColor(new Color(3, 33, 57));
        txtROL.setBounds(175, 52, 145, 28);
        txtROL.setEnabled(false);
        txtROL.setText(modiprop.getRol_propie());
        add(txtROL);
        
        RSTextFieldOne txtNomPropiedad = new RSTextFieldOne();
        txtNomPropiedad.setPlaceholder("");
        txtNomPropiedad.setPhColor(SystemColor.controlDkShadow);
        txtNomPropiedad.setForeground(new Color(25, 25, 112));
        txtNomPropiedad.setFont(new Font("Dubai", Font.BOLD, 16));
        txtNomPropiedad.setBorderColor(new Color(3, 33, 57));
        txtNomPropiedad.setBounds(175, 86, 261, 28);
        txtNomPropiedad.setText(modiprop.getNom_propiedad());
        add(txtNomPropiedad);
        
        RSTextFieldOne txtDirec = new RSTextFieldOne();
        txtDirec.setPlaceholder("");
        txtDirec.setPhColor(SystemColor.controlDkShadow);
        txtDirec.setForeground(new Color(25, 25, 112));
        txtDirec.setFont(new Font("Dubai", Font.BOLD, 16));
        txtDirec.setBorderColor(new Color(3, 33, 57));
        txtDirec.setBounds(175, 122, 261, 28);
        txtDirec.setText(modiprop.getDireccion());
        add(txtDirec);
        
        RSComboBox cmbComuna = new RSComboBox();
        cmbComuna.setModel(new DefaultComboBoxModel(new String[] {"SANTIAGO", "VI\u00D1A DEL MAR"}));
        cmbComuna.setForeground(new Color(25, 25, 112));
        cmbComuna.setFont(new Font("Dubai", Font.BOLD, 16));
        cmbComuna.setConBorde(true);
        cmbComuna.setColorFondo(Color.WHITE);
        cmbComuna.setColorBorde(new Color(25, 25, 112));
        cmbComuna.setColorArrow(new Color(25, 25, 112));
        cmbComuna.setBounds(175, 159, 200, 32);
        add(cmbComuna);
        
        RSTextFieldOne txtNomDueno = new RSTextFieldOne();
        txtNomDueno.setPlaceholder("");
        txtNomDueno.setPhColor(SystemColor.controlDkShadow);
        txtNomDueno.setForeground(new Color(25, 25, 112));
        txtNomDueno.setFont(new Font("Dubai", Font.BOLD, 16));
        txtNomDueno.setBorderColor(new Color(3, 33, 57));
        txtNomDueno.setBounds(175, 202, 261, 28);
        txtNomDueno.setText(modiprop.getNom_propietario());
        add(txtNomDueno);
        
        JLabel label_6 = new JLabel("RUT Propietario:");
        label_6.setHorizontalAlignment(SwingConstants.RIGHT);
        label_6.setForeground(new Color(3, 33, 57));
        label_6.setFont(new Font("Dubai", Font.BOLD, 16));
        label_6.setBounds(50, 239, 115, 33);
        add(label_6);
        
        RSTextFieldOne txtRutDueno = new RSTextFieldOne();
        txtRutDueno.setPlaceholder("");
        txtRutDueno.setPhColor(SystemColor.controlDkShadow);
        txtRutDueno.setForeground(new Color(25, 25, 112));
        txtRutDueno.setFont(new Font("Dubai", Font.BOLD, 16));
        txtRutDueno.setBorderColor(new Color(3, 33, 57));
        txtRutDueno.setBounds(175, 241, 135, 28);
        txtNomDueno.setText(modiprop.getRun_propie());
        add(txtRutDueno);
        
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
        
        RSTextFieldOne txtEvaFiscal = new RSTextFieldOne();
        txtEvaFiscal.setPlaceholder("$");
        txtEvaFiscal.setPhColor(SystemColor.controlDkShadow);
        txtEvaFiscal.setForeground(new Color(25, 25, 112));
        txtEvaFiscal.setFont(new Font("Dubai", Font.BOLD, 16));
        txtEvaFiscal.setBorderColor(new Color(3, 33, 57));
        txtEvaFiscal.setBounds(609, 51, 135, 32);
        txtEvaFiscal.setText(String.valueOf(modiprop.getAvaluo_fiscal()));
        add(txtEvaFiscal);
        
        JLabel label_9 = new JLabel("Valor de Compra:");
        label_9.setHorizontalAlignment(SwingConstants.RIGHT);
        label_9.setForeground(new Color(3, 33, 57));
        label_9.setFont(new Font("Dubai", Font.BOLD, 16));
        label_9.setBounds(464, 86, 135, 33);
        add(label_9);
        
        RSTextFieldOne txtValorCompra = new RSTextFieldOne();
        txtValorCompra.setPlaceholder("$");
        txtValorCompra.setPhColor(SystemColor.controlDkShadow);
        txtValorCompra.setForeground(new Color(25, 25, 112));
        txtValorCompra.setFont(new Font("Dubai", Font.BOLD, 16));
        txtValorCompra.setBorderColor(new Color(3, 33, 57));
        txtValorCompra.setBounds(609, 86, 135, 32);
        txtValorCompra.setText(String.valueOf(modiprop.getValor_compra()));
        add(txtValorCompra);
        
        JLabel label_10 = new JLabel("Gastos Comunes:");
        label_10.setHorizontalAlignment(SwingConstants.RIGHT);
        label_10.setForeground(new Color(3, 33, 57));
        label_10.setFont(new Font("Dubai", Font.BOLD, 16));
        label_10.setBounds(464, 122, 135, 33);
        add(label_10);
        
        RSTextFieldOne txtGastoComun = new RSTextFieldOne();
        txtGastoComun.setPlaceholder("$");
        txtGastoComun.setPhColor(SystemColor.controlDkShadow);
        txtGastoComun.setForeground(new Color(25, 25, 112));
        txtGastoComun.setFont(new Font("Dubai", Font.BOLD, 16));
        txtGastoComun.setBorderColor(new Color(3, 33, 57));
        txtGastoComun.setBounds(609, 122, 135, 32);
        txtGastoComun.setText(String.valueOf(modiprop.getValor_gastoc()));
        add(txtGastoComun);
        
        JLabel label_11 = new JLabel("Gastos B\u00E1sicos:");
        label_11.setHorizontalAlignment(SwingConstants.RIGHT);
        label_11.setForeground(new Color(3, 33, 57));
        label_11.setFont(new Font("Dubai", Font.BOLD, 16));
        label_11.setBounds(464, 159, 135, 33);
        add(label_11);
        
        RSTextFieldOne txtGastoBasico = new RSTextFieldOne();
        txtGastoBasico.setPlaceholder("$");
        txtGastoBasico.setPhColor(SystemColor.controlDkShadow);
        txtGastoBasico.setForeground(new Color(25, 25, 112));
        txtGastoBasico.setFont(new Font("Dubai", Font.BOLD, 16));
        txtGastoBasico.setBorderColor(new Color(3, 33, 57));
        txtGastoBasico.setBounds(609, 159, 135, 32);
        txtGastoBasico.setText(String.valueOf(modiprop.getValor_gastobasic()));
        add(txtGastoBasico);
        
        JLabel label_12 = new JLabel("Contribuciones:");
        label_12.setHorizontalAlignment(SwingConstants.RIGHT);
        label_12.setForeground(new Color(3, 33, 57));
        label_12.setFont(new Font("Dubai", Font.BOLD, 16));
        label_12.setBounds(464, 197, 135, 33);
        add(label_12);
        
        RSTextFieldOne txtContribu = new RSTextFieldOne();
        txtContribu.setPlaceholder("$");
        txtContribu.setPhColor(SystemColor.controlDkShadow);
        txtContribu.setForeground(new Color(25, 25, 112));
        txtContribu.setFont(new Font("Dubai", Font.BOLD, 16));
        txtContribu.setBorderColor(new Color(3, 33, 57));
        txtContribu.setBounds(609, 197, 135, 32);
        txtContribu.setText(String.valueOf(modiprop.getPago_contri()));
        add(txtContribu);
        
        JLabel label_13 = new JLabel("Valor Inventario:");
        label_13.setHorizontalAlignment(SwingConstants.RIGHT);
        label_13.setForeground(new Color(3, 33, 57));
        label_13.setFont(new Font("Dubai", Font.BOLD, 16));
        label_13.setBounds(464, 239, 135, 33);
        add(label_13);
        
        RSTextFieldOne txtValorInvent = new RSTextFieldOne();
        txtValorInvent.setPlaceholder("$");
        txtValorInvent.setPhColor(SystemColor.controlDkShadow);
        txtValorInvent.setForeground(new Color(25, 25, 112));
        txtValorInvent.setFont(new Font("Dubai", Font.BOLD, 16));
        txtValorInvent.setBorderColor(new Color(3, 33, 57));
        txtValorInvent.setBounds(609, 239, 135, 32);
        txtValorInvent.setText(String.valueOf(modiprop.getInven_valori()));
        add(txtValorInvent);
        
        JLabel label_14 = new JLabel("Valor Noche:");
        label_14.setHorizontalAlignment(SwingConstants.RIGHT);
        label_14.setForeground(new Color(3, 33, 57));
        label_14.setFont(new Font("Dubai", Font.BOLD, 16));
        label_14.setBounds(464, 279, 135, 33);
        add(label_14);
        
        RSTextFieldOne txtValorNoche = new RSTextFieldOne();
        txtValorNoche.setPlaceholder("$");
        txtValorNoche.setPhColor(SystemColor.controlDkShadow);
        txtValorNoche.setForeground(new Color(25, 25, 112));
        txtValorNoche.setFont(new Font("Dubai", Font.BOLD, 16));
        txtValorNoche.setBorderColor(new Color(3, 33, 57));
        txtValorNoche.setBounds(609, 279, 135, 32);
        txtValorNoche.setText(String.valueOf(modiprop.getValor_noche()));
        add(txtValorNoche);
        
        JLabel label_15 = new JLabel("N\u00B0 de Habitaciones:");
        label_15.setHorizontalAlignment(SwingConstants.RIGHT);
        label_15.setForeground(new Color(3, 33, 57));
        label_15.setFont(new Font("Dubai", Font.BOLD, 16));
        label_15.setBounds(20, 279, 145, 33);
        add(label_15);
        
        RSTextFieldOne txtNumHabita = new RSTextFieldOne();
        txtNumHabita.setPlaceholder("3");
        txtNumHabita.setPhColor(SystemColor.controlDkShadow);
        txtNumHabita.setForeground(new Color(25, 25, 112));
        txtNumHabita.setFont(new Font("Dubai", Font.BOLD, 16));
        txtNumHabita.setBorderColor(new Color(3, 33, 57));
        txtNumHabita.setBounds(175, 281, 45, 28);
        txtNumHabita.setText(String.valueOf(modiprop.getNum_habita()));
        add(txtNumHabita);
        
        JLabel label_16 = new JLabel("Max. Ocupantes:");
        label_16.setHorizontalAlignment(SwingConstants.RIGHT);
        label_16.setForeground(new Color(3, 33, 57));
        label_16.setFont(new Font("Dubai", Font.BOLD, 16));
        label_16.setBounds(269, 280, 145, 33);
        add(label_16);
        
        RSTextFieldOne txtMaxOcupa = new RSTextFieldOne();
        txtMaxOcupa.setPlaceholder("3");
        txtMaxOcupa.setPhColor(SystemColor.controlDkShadow);
        txtMaxOcupa.setForeground(new Color(25, 25, 112));
        txtMaxOcupa.setFont(new Font("Dubai", Font.BOLD, 16));
        txtMaxOcupa.setBorderColor(new Color(3, 33, 57));
        txtMaxOcupa.setBounds(424, 282, 45, 28);
        txtMaxOcupa.setText(String.valueOf(modiprop.getCant_max_ocu()));
        add(txtMaxOcupa);
        
        JLabel label_17 = new JLabel("N\u00B0 de Ba\u00F1os:");
        label_17.setHorizontalAlignment(SwingConstants.RIGHT);
        label_17.setForeground(new Color(3, 33, 57));
        label_17.setFont(new Font("Dubai", Font.BOLD, 16));
        label_17.setBounds(20, 316, 145, 33);
        add(label_17);
        
        RSTextFieldOne txtNumBano = new RSTextFieldOne();
        txtNumBano.setPlaceholder("3");
        txtNumBano.setPhColor(SystemColor.controlDkShadow);
        txtNumBano.setForeground(new Color(25, 25, 112));
        txtNumBano.setFont(new Font("Dubai", Font.BOLD, 16));
        txtNumBano.setBorderColor(new Color(3, 33, 57));
        txtNumBano.setBounds(175, 318, 45, 28);
        txtNumBano.setText(String.valueOf(modiprop.getNum_banno()));
        add(txtNumBano);
        
        JLabel label_18 = new JLabel("N\u00B0 de Bodegas:");
        label_18.setHorizontalAlignment(SwingConstants.RIGHT);
        label_18.setForeground(new Color(3, 33, 57));
        label_18.setFont(new Font("Dubai", Font.BOLD, 16));
        label_18.setBounds(269, 316, 145, 33);
        add(label_18);
        
        RSTextFieldOne txtNumBodega = new RSTextFieldOne();
        txtNumBodega.setPlaceholder("3");
        txtNumBodega.setPhColor(SystemColor.controlDkShadow);
        txtNumBodega.setForeground(new Color(25, 25, 112));
        txtNumBodega.setFont(new Font("Dubai", Font.BOLD, 16));
        txtNumBodega.setBorderColor(new Color(3, 33, 57));
        txtNumBodega.setBounds(424, 318, 45, 28);
        txtNumBodega.setText(String.valueOf(modiprop.getNum_bodega()));
        add(txtNumBodega);
        
        JLabel label_19 = new JLabel("N\u00B0 de Estacionamiento:");
        label_19.setHorizontalAlignment(SwingConstants.RIGHT);
        label_19.setForeground(new Color(3, 33, 57));
        label_19.setFont(new Font("Dubai", Font.BOLD, 16));
        label_19.setBounds(240, 360, 174, 33);
        add(label_19);
        
        RSTextFieldOne txtNumEstacio = new RSTextFieldOne();
        txtNumEstacio.setPlaceholder("3");
        txtNumEstacio.setPhColor(SystemColor.controlDkShadow);
        txtNumEstacio.setForeground(new Color(25, 25, 112));
        txtNumEstacio.setFont(new Font("Dubai", Font.BOLD, 16));
        txtNumEstacio.setBorderColor(new Color(3, 33, 57));
        txtNumEstacio.setBounds(424, 362, 45, 28);
        txtNumEstacio.setText(String.valueOf(modiprop.getNum_estaci()));
        add(txtNumEstacio);
        
        RSTextFieldOne txtNumCocina = new RSTextFieldOne();
        txtNumCocina.setPlaceholder("3");
        txtNumCocina.setPhColor(SystemColor.controlDkShadow);
        txtNumCocina.setForeground(new Color(25, 25, 112));
        txtNumCocina.setFont(new Font("Dubai", Font.BOLD, 16));
        txtNumCocina.setBorderColor(new Color(3, 33, 57));
        txtNumCocina.setBounds(175, 362, 45, 28);
        txtNumCocina.setText(String.valueOf(modiprop.getNum_cocina()));
        add(txtNumCocina);
        
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
        
        RSTextFieldOne txtMetros = new RSTextFieldOne();
        txtMetros.setPlaceholder("3");
        txtMetros.setPhColor(SystemColor.controlDkShadow);
        txtMetros.setForeground(new Color(25, 25, 112));
        txtMetros.setFont(new Font("Dubai", Font.BOLD, 16));
        txtMetros.setBorderColor(new Color(3, 33, 57));
        txtMetros.setBounds(175, 403, 45, 28);
        txtMetros.setText(String.valueOf(modiprop.getMetros()));
        add(txtMetros);
        
        RSComboBox cmbJardin = new RSComboBox();
        cmbJardin.setModel(new DefaultComboBoxModel(new String[] {"SI", "NO"}));
        cmbJardin.setForeground(new Color(25, 25, 112));
        cmbJardin.setFont(new Font("Dubai", Font.BOLD, 16));
        cmbJardin.setConBorde(true);
        cmbJardin.setColorFondo(Color.WHITE);
        cmbJardin.setColorBorde(new Color(25, 25, 112));
        cmbJardin.setColorArrow(new Color(25, 25, 112));
        cmbJardin.setBounds(424, 401, 66, 32);
        add(cmbJardin);
        
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
        
        JTextArea txtCaracteris = new JTextArea();
        txtCaracteris.setFont(new Font("Dubai", Font.BOLD, 14));
        txtCaracteris.setText(modiprop.getCaracteris());
        scrollPane.setViewportView(txtCaracteris);
        
        
        btnGuardar.addActionListener(new ActionListener() {
        	
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		JOptionPane.showMessageDialog(null, "Falta completar este m�dulo");
        		/*
        		ConectPropiedades cprop = new ConectPropiedades();
        		ArrayList<Propiedad> lista = new ArrayList<Propiedad>();
        		lista = cprop.listarPropiedades();
        		System.out.println("Cantidad de registros en lista = "+lista.size());
        		
        		Propiedad prop = new Propiedad();
        		prop.setRol_propie(txtROL.getText());
        		prop.setNom_propiedad(txtNomPropiedad.getText());
        		prop.setAvaluo_fiscal(Integer.parseInt(txtEvaFiscal.getText()));
        		prop.setValor_compra(Integer.parseInt(txtValorCompra.getText()));
        		prop.setDireccion(txtDirec.getText());
        		prop.setNom_propietario(txtNomDueno.getText());
        		prop.setRun_propie(txtRutDueno.getText());
        		prop.setPago_contri(Integer.parseInt(txtContribu.getText()));
        		prop.setValor_gastoc(Integer.parseInt(txtGastoComun.getText()));
        		prop.setValor_gastobasic(Integer.parseInt(txtGastoBasico.getText()));
        		prop.setNum_habita(Integer.parseInt(txtNumHabita.getText()));
        		prop.setCant_max_ocu(Integer.parseInt(txtMaxOcupa.getText()));
        		prop.setNum_banno(Integer.parseInt(txtNumBano.getText()));
        		prop.setNum_bodega(Integer.parseInt(txtNumBodega.getText()));
        		prop.setNum_estaci(Integer.parseInt(txtNumEstacio.getText()));
        		prop.setNum_cocina(Integer.parseInt(txtNumCocina.getText()));
        		
        		if (cmbJardin.getSelectedIndex() == 0) {
					System.out.println("SI");
					prop.setJardin('S');
				}else {
					System.out.println("NO");
					prop.setJardin('N');
				}
        		prop.setMetros(Integer.parseInt(txtMetros.getText()));
        		prop.setInven_valori(Integer.parseInt(txtValorInvent.getText()));
        		prop.setValor_noche(Integer.parseInt(txtValorNoche.getText()));
        		prop.setCaracteris(txtCaracteris.getText());
        		prop.setId_estado_pro(1);
        		prop.setId_comuna(1);
        		
        		boolean respuesta = cprop.registrarPropiedad(prop);
        		if (respuesta) {
        			JOptionPane.showMessageDialog(null, "LA PROPIEDAD FUE GUARDADA EXITOSAMENTE", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
				}else {
					txtROL.requestFocus();
				}
        		*/
        		      	
        		//MensajeOK mensaje = new MensajeOK("GUARDAR CLIENTE", "EL CLIENTE FUE GUARDADO EXITOSAMENTE");
        		//mensaje.setVisible(true);
        		/*
            	MainMenu.panelBody.removeAll();
            	MainMenu.panelBody.add(new MenuPropiedades());
            	MainMenu.panelBody.repaint();
            	MainMenu.panelBody.revalidate();
            	*/
        	
        	}
        });
        
    }// </editor-fold>//GEN-END:initComponents
    
    public Propiedad traerPropiedad(String rol) {
		ConectPropiedades cprop = new ConectPropiedades();
    	prop = cprop.buscarPropiedad(rol);	
    	
    	return prop;
	}
    
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
