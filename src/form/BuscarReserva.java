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
import javax.swing.JScrollPane;
import RSMaterialComponent.RSTableMetroCustom;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RavenPC
 */
public class BuscarReserva extends javax.swing.JPanel {

	private static final String EMAIL_PATTERN = 
		    "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	DocumentFilter filter = new UppercaseDocumentFilter();
	
    /**
     * Creates new form Panel1
     */
    public BuscarReserva() {
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
        jLabel1.setText("Anular una Reserva");
        jLabel1.setOpaque(true);
        
        RSButtonShape btnshpAgregarCliente = new RSButtonShape();
        btnshpAgregarCliente.setEnabled(false);
        btnshpAgregarCliente.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		JOptionPane.showMessageDialog(null, "�ESTAS SEGURO DE ANULAR LA RESERVA?", "ADVERTENCIA", JOptionPane.YES_NO_OPTION);      	
        		//MensajeOK mensaje = new MensajeOK("GUARDAR CLIENTE", "EL CLIENTE FUE GUARDADO EXITOSAMENTE");
        		//mensaje.setVisible(true);
            	MainMenu.panelBody.removeAll();
            	MainMenu.panelBody.add(new ModificarCliente());
            	MainMenu.panelBody.repaint();
            	MainMenu.panelBody.revalidate();
        	
        	}
        });
        btnshpAgregarCliente.setBounds(281, 531, 211, 63);
        btnshpAgregarCliente.setFont(new Font("Dubai", Font.BOLD, 13));
        btnshpAgregarCliente.setForegroundHover(Color.white);
        btnshpAgregarCliente.backgroundHover = new Color(192, 192, 192);
        btnshpAgregarCliente.setBackgroundHover(new Color(3, 33, 57));
        btnshpAgregarCliente.setForegroundText(Color.white);
        btnshpAgregarCliente.setForeground(Color.gray);
        btnshpAgregarCliente.setBackground(new Color(178, 34, 34));
        btnshpAgregarCliente.setHorizontalAlignment(SwingConstants.CENTER);
        btnshpAgregarCliente.setText("   ANULAR RESERVA");
        btnshpAgregarCliente.setIcon(FontIcon.of(Entypo.BLOCK, 40, Color.white));
        btnshpAgregarCliente.setForma(RSButtonShape.FORMA.ROUND);
        
        RSButtonShape btnshpVolverCliente = new RSButtonShape();
        btnshpVolverCliente.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
            	MainMenu.panelBody.removeAll();
            	MainMenu.panelBody.add(new MenuClientes());
            	MainMenu.panelBody.repaint();
            	MainMenu.panelBody.revalidate();
        	}
        });
        btnshpVolverCliente.setBounds(521, 531, 211, 63);
        btnshpVolverCliente.setFont(new Font("Dubai", Font.BOLD, 13));
        btnshpVolverCliente.setForegroundHover(new Color(3, 33, 57));
        btnshpVolverCliente.setBackgroundHover(new Color(128, 128, 128));
        btnshpVolverCliente.setForegroundText(new Color(3, 33, 57));
        btnshpVolverCliente.setForeground(new Color(0, 128, 128));
        btnshpVolverCliente.setBackground(new Color(220, 220, 220));
        btnshpVolverCliente.setText("   VOLVER");
        btnshpVolverCliente.setHorizontalAlignment(SwingConstants.CENTER);
        btnshpVolverCliente.setIcon(FontIcon.of(Entypo.BACK, 40, new Color(0, 51, 102)));
        btnshpVolverCliente.setForma(RSButtonShape.FORMA.ROUND);
        
        JLabel lblRUT = new JLabel("N\u00B0 de Reserva:");
        lblRUT.setForeground(new Color(3, 33,  57));
        lblRUT.setBounds(66, 62, 168, 33);
        lblRUT.setHorizontalAlignment(SwingConstants.RIGHT);
        lblRUT.setFont(new Font("Dubai", Font.BOLD, 20));
        setLayout(null);
        add(jLabel1);
        add(btnshpAgregarCliente);
        add(btnshpVolverCliente);
        add(lblRUT);
        
        RSTextFieldOne txtRUT = new RSTextFieldOne();
        txtRUT.setBorderColor(new Color(3, 33,  57));
        txtRUT.setFont(new Font("Dubai", Font.BOLD, 20));
        txtRUT.setPlaceholder("0000001");
        txtRUT.setPhColor(new Color(105, 105, 105));
        txtRUT.setForeground(new Color(25, 25, 112));
        txtRUT.setBounds(256, 58, 140, 42);
        ((AbstractDocument) txtRUT.getDocument()).setDocumentFilter(filter);
        add(txtRUT);
        
        RSButtonShape btnshpBuscar = new RSButtonShape();
        btnshpBuscar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnshpBuscar.setText("   BUSCAR");
        btnshpBuscar.setHorizontalAlignment(SwingConstants.CENTER);
        btnshpBuscar.setForma(RSButtonShape.FORMA.ROUND);
        btnshpBuscar.setForegroundText(Color.WHITE);
        btnshpBuscar.setForegroundHover(Color.WHITE);
        btnshpBuscar.setForeground(Color.GRAY);
        btnshpBuscar.setFont(new Font("Dubai", Font.BOLD, 13));
        btnshpBuscar.backgroundHover = SystemColor.controlShadow;
        btnshpBuscar.setBackgroundHover(SystemColor.controlShadow);
        btnshpBuscar.setBackground(new Color(0, 51, 102));
        btnshpBuscar.setIcon(FontIcon.of(FontAwesomeSolid.SEARCH, 24, Color.white));
        btnshpBuscar.setBounds(424, 57, 140, 42);
        add(btnshpBuscar);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 122, 753, 370);
        add(scrollPane);
        
        RSTableMetroCustom tblCliente = new RSTableMetroCustom();
        tblCliente.setFont(new Font("Dubai", Font.BOLD, 12));
        tblCliente.setFontHead(new Font("Dubai", Font.BOLD, 14));
        tblCliente.setColorSecundaryText(new Color(0, 0, 128));
        tblCliente.setBackgoundHover(new Color(47, 79, 79));
        tblCliente.setBackgoundHead(new Color(0, 128, 128));
        tblCliente.setColorPrimaryText(new Color(25, 25, 112));
        tblCliente.setShowVerticalLines(true);
        tblCliente.setModel(new DefaultTableModel(
        	new Object[][] {
        		{null, null, null, null},
        	},
        	new String[] {
        		"ID RESERVA", "PROPIEDAD", "RUT CLIENTE", "NOMBRE CLIENTE"
        	}
        ));
        tblCliente.getColumnModel().getColumn(1).setPreferredWidth(129);
        tblCliente.getColumnModel().getColumn(2).setPreferredWidth(88);
        tblCliente.getColumnModel().getColumn(3).setPreferredWidth(189);
        scrollPane.setViewportView(tblCliente);
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