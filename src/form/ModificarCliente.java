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

/**
 *
 * @author RavenPC
 */
public class ModificarCliente extends javax.swing.JPanel {

	private static final String EMAIL_PATTERN = 
		    "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	DocumentFilter filter = new UppercaseDocumentFilter();
	
    /**
     * Creates new form Panel1
     */
    public ModificarCliente() {
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
        jLabel1.setText("Modificar un nuevo cliente");
        jLabel1.setOpaque(true);
        
        RSButtonShape btnshpAgregarCliente = new RSButtonShape();
        btnshpAgregarCliente.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		JOptionPane.showMessageDialog(null, "LOS DATOS DEL CLIENTE FUERON ACTUALIZADOS EXITOSAMENTE", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);      	
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
        btnshpAgregarCliente.setText("   ACTUALIZAR");
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
        
        JLabel lblRUT = new JLabel("RUT:");
        lblRUT.setForeground(new Color(3, 33,  57));
        lblRUT.setBounds(77, 92, 119, 33);
        lblRUT.setHorizontalAlignment(SwingConstants.RIGHT);
        lblRUT.setFont(new Font("Dubai", Font.BOLD, 20));
        
        JLabel lblNombre = new JLabel("Nombre Completo:");
        lblNombre.setForeground(new Color(3, 33,  57));
        lblNombre.setBounds(10, 139, 186, 33);
        lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNombre.setFont(new Font("Dubai", Font.BOLD, 20));
        setLayout(null);
        add(jLabel1);
        add(btnshpAgregarCliente);
        add(btnshpBuscarCliente);
        add(lblRUT);
        add(lblNombre);
        
        JLabel lblApellidoPaterno = new JLabel("Apellido Paterno:");
        lblApellidoPaterno.setForeground(new Color(3, 33,  57));
        lblApellidoPaterno.setHorizontalAlignment(SwingConstants.RIGHT);
        lblApellidoPaterno.setFont(new Font("Dubai", Font.BOLD, 20));
        lblApellidoPaterno.setBounds(20, 192, 186, 33);
        add(lblApellidoPaterno);
        
        JLabel lblApellidoAterno = new JLabel("Apellido Materno:");
        lblApellidoAterno.setForeground(new Color(3, 33,  57));
        lblApellidoAterno.setHorizontalAlignment(SwingConstants.RIGHT);
        lblApellidoAterno.setFont(new Font("Dubai", Font.BOLD, 20));
        lblApellidoAterno.setBounds(10, 245, 186, 33);
        add(lblApellidoAterno);
        
        JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento:");
        lblFechaDeNacimiento.setForeground(new Color(3, 33,  57));
        lblFechaDeNacimiento.setHorizontalAlignment(SwingConstants.RIGHT);
        lblFechaDeNacimiento.setFont(new Font("Dubai", Font.BOLD, 20));
        lblFechaDeNacimiento.setBounds(20, 304, 186, 33);
        add(lblFechaDeNacimiento);
        
        RSDateChooser dateChooser = new RSDateChooser();
        dateChooser.setBgColor(new Color(3, 33, 57));
        dateChooser.setBackground(new Color(3, 33, 57));
        dateChooser.setFormatDate("dd/MM/yyyy");
        dateChooser.setBounds(226, 295, 166, 42);
        add(dateChooser);
        
        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setForeground(new Color(3, 33,  57));
        lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
        lblEmail.setFont(new Font("Dubai", Font.BOLD, 20));
        lblEmail.setBounds(10, 351, 186, 33);
        add(lblEmail);
        
        JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
        lblDireccin.setForeground(new Color(3, 33,  57));
        lblDireccin.setHorizontalAlignment(SwingConstants.RIGHT);
        lblDireccin.setFont(new Font("Dubai", Font.BOLD, 20));
        lblDireccin.setBounds(10, 404, 186, 33);
        add(lblDireccin);
        
        JLabel lblTelfono = new JLabel("Tel\u00E9fono:");
        lblTelfono.setForeground(new Color(3, 33,  57));
        lblTelfono.setHorizontalAlignment(SwingConstants.RIGHT);
        lblTelfono.setFont(new Font("Dubai", Font.BOLD, 20));
        lblTelfono.setBounds(10, 457, 186, 33);
        add(lblTelfono);
        
        RSTextFieldOne txtRUT = new RSTextFieldOne();
        txtRUT.setBorderColor(new Color(3, 33,  57));
        txtRUT.setFont(new Font("Dubai", Font.BOLD, 20));
        txtRUT.setPlaceholder("15625100-3");
        txtRUT.setPhColor(new Color(105, 105, 105));
        txtRUT.setForeground(new Color(25, 25, 112));
        txtRUT.setBounds(226, 89, 140, 42);
        ((AbstractDocument) txtRUT.getDocument()).setDocumentFilter(filter);
        add(txtRUT);
        
        RSTextFieldOne txtNombre = new RSTextFieldOne();
        txtNombre.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyTyped(KeyEvent evt) {
        		char c=evt.getKeyChar();
        	    if(!(Character.isAlphabetic(c) ||  (c==KeyEvent.VK_BACK_SPACE) ||  c==KeyEvent.VK_DELETE || c==KeyEvent.VK_SPACE)) {
        	    	getToolkit().beep();
        	        evt.consume();	
        	    }

        	}
        });
        txtNombre.setPlaceholder("");
        txtNombre.setPhColor(SystemColor.controlDkShadow);
        txtNombre.setForeground(new Color(25, 25, 112));
        txtNombre.setFont(new Font("Dubai", Font.BOLD, 20));
        txtNombre.setBorderColor(new Color(3, 33,  57));
        txtNombre.setBounds(226, 139, 278, 42);
        ((AbstractDocument) txtNombre.getDocument()).setDocumentFilter(filter);
        add(txtNombre);
        
        RSTextFieldOne txtApePaterno = new RSTextFieldOne();
        txtApePaterno.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyTyped(KeyEvent evt) {
        		char c=evt.getKeyChar();
        	    if(!(Character.isAlphabetic(c) ||  (c==KeyEvent.VK_BACK_SPACE) ||  c==KeyEvent.VK_DELETE || c==KeyEvent.VK_SPACE)) {
        	    	getToolkit().beep();
        	        evt.consume();	
        	    }

        	}
        });
        txtApePaterno.setPlaceholder("");
        txtApePaterno.setPhColor(SystemColor.controlDkShadow);
        txtApePaterno.setForeground(new Color(25, 25, 112));
        txtApePaterno.setFont(new Font("Dubai", Font.BOLD, 20));
        txtApePaterno.setBorderColor(new Color(3, 33,  57));
        txtApePaterno.setBounds(226, 188, 278, 42);
        ((AbstractDocument) txtApePaterno.getDocument()).setDocumentFilter(filter);
        add(txtApePaterno);
        
        RSTextFieldOne txtApeMaterno = new RSTextFieldOne();
        txtApeMaterno.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyTyped(KeyEvent evt) {
        		char c=evt.getKeyChar();
        	    if(!(Character.isAlphabetic(c) ||  (c==KeyEvent.VK_BACK_SPACE) ||  c==KeyEvent.VK_DELETE || c==KeyEvent.VK_SPACE)) {
        	    	getToolkit().beep();
        	        evt.consume();	
        	    }

        	}
        });
        txtApeMaterno.setPlaceholder("");
        txtApeMaterno.setPhColor(SystemColor.controlDkShadow);
        txtApeMaterno.setForeground(new Color(25, 25, 112));
        txtApeMaterno.setFont(new Font("Dubai", Font.BOLD, 20));
        txtApeMaterno.setBorderColor(new Color(3, 33,  57));
        txtApeMaterno.setBounds(226, 241, 278, 42);
        ((AbstractDocument) txtApeMaterno.getDocument()).setDocumentFilter(filter);
        add(txtApeMaterno);
        
        RSTextFieldOne txtEmail = new RSTextFieldOne();
        txtEmail.addFocusListener(new FocusAdapter() {
        	@Override
        	public void focusLost(FocusEvent arg0) {
        		if(!txtEmail.getText().equals("")) {
            		if (!txtEmail.getText().matches(EMAIL_PATTERN)) {
            			JOptionPane.showMessageDialog(null, "DEBE INGRESAR UN EMAIL VALIDO");
            		}
        		}

        	}
        });
        txtEmail.setPlaceholder("EMAIL@EMAIL.COM");
        txtEmail.setPhColor(SystemColor.controlDkShadow);
        txtEmail.setForeground(new Color(25, 25, 112));
        txtEmail.setFont(new Font("Dubai", Font.BOLD, 20));
        txtEmail.setBorderColor(new Color(3, 33,  57));
        txtEmail.setBounds(226, 348, 278, 42);
        ((AbstractDocument) txtEmail.getDocument()).setDocumentFilter(filter);
        add(txtEmail);
        
        RSTextFieldOne txtDir = new RSTextFieldOne();
        txtDir.setPlaceholder("");
        txtDir.setPhColor(SystemColor.controlDkShadow);
        txtDir.setForeground(new Color(25, 25, 112));
        txtDir.setFont(new Font("Dubai", Font.BOLD, 20));
        txtDir.setBorderColor(new Color(3, 33, 57));
        txtDir.setBounds(226, 400, 278, 42);
        add(txtDir);
        
        RSTextFieldOne txtTelefono = new RSTextFieldOne();
        txtTelefono.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
              char c = e.getKeyChar();
              if (!((c >= '0') && (c <= '9') ||
                 (c == KeyEvent.VK_BACK_SPACE) ||
                 (c == KeyEvent.VK_DELETE))) {
                getToolkit().beep();
                e.consume();
              }
              boolean max = txtTelefono.getText().length() >= 9;
              if ( max ){
                  e.consume();
              }   
            }
          });
        txtTelefono.setPlaceholder("988776655");
        txtTelefono.setPhColor(SystemColor.controlDkShadow);
        txtTelefono.setForeground(new Color(25, 25, 112));
        txtTelefono.setFont(new Font("Dubai", Font.BOLD, 20));
        txtTelefono.setBorderColor(new Color(3, 33, 57));
        txtTelefono.setBounds(226, 453, 140, 42);
        add(txtTelefono);
        
        JLabel lblId = new JLabel("ID:");
        lblId.setHorizontalAlignment(SwingConstants.RIGHT);
        lblId.setForeground(new Color(3, 33, 57));
        lblId.setFont(new Font("Dubai", Font.BOLD, 20));
        lblId.setBounds(77, 48, 119, 33);
        add(lblId);
        
        JLabel lblID = new JLabel("000000001");
        lblID.setHorizontalAlignment(SwingConstants.LEFT);
        lblID.setForeground(new Color(3, 33, 57));
        lblID.setFont(new Font("Dubai", Font.BOLD, 20));
        lblID.setBounds(226, 48, 119, 33);
        add(lblID);
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
