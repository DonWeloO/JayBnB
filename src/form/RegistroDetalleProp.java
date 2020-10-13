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

import Controlador.ConectInventario;
import Controlador.ConectPropiedades;
import Modelo.DetallePropiedad;
import Modelo.Inventario;
import Modelo.TipoInventario;

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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import RSMaterialComponent.RSTableMetroCustom;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import RSMaterialComponent.RSTableMetroCustom.SELECTION_ROWS;

/**
 *
 * @author RavenPC
 */
public class RegistroDetalleProp extends javax.swing.JPanel {

	private static final String EMAIL_PATTERN = 
		    "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	DocumentFilter filter = new UppercaseDocumentFilter();
    RSTableMetroCustom tblInveActual = new RSTableMetroCustom();
    RSTableMetroCustom tblItems = new RSTableMetroCustom();
    JLabel lblRolProp = new JLabel("");
    JLabel lblNomProp = new JLabel("");
    int idprop;
	
    /**
     * Creates new form Panel1
     */
    public RegistroDetalleProp(String rol) {
    	setBackground(new Color(255, 255, 255));
        initComponents();
        llenarTablaItems();
        llenarTablaActual(rol);
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
        jLabel1.setText("Agregar Inventario a una Propiedad");
        jLabel1.setOpaque(true);
        
        RSButtonShape btnshpAgregarCliente = new RSButtonShape();
        btnshpAgregarCliente.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		tablatoDB();
        		JOptionPane.showMessageDialog(null, "E� Inventario se actualiz� exitosamente", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);      	
        		//MensajeOK mensaje = new MensajeOK("GUARDAR CLIENTE", "EL CLIENTE FUE GUARDADO EXITOSAMENTE");
        		//mensaje.setVisible(true);
            	MainMenu.panelBody.removeAll();
            	MainMenu.panelBody.add(new MenuInventario());
            	MainMenu.panelBody.repaint();
            	MainMenu.panelBody.revalidate();
            	
        	
        	}
        });
        btnshpAgregarCliente.setBounds(307, 552, 211, 63);
        btnshpAgregarCliente.setFont(new Font("Dubai", Font.BOLD, 13));
        btnshpAgregarCliente.setForegroundHover(Color.white);
        btnshpAgregarCliente.backgroundHover = UIManager.getColor("Button.shadow");
        btnshpAgregarCliente.setBackgroundHover(new Color(3, 33, 57));
        btnshpAgregarCliente.setForegroundText(Color.white);
        btnshpAgregarCliente.setForeground(Color.gray);
        btnshpAgregarCliente.setBackground(new Color(0, 51, 102));
        btnshpAgregarCliente.setHorizontalAlignment(SwingConstants.CENTER);
        btnshpAgregarCliente.setText("   GUARDAR INVENTARIO");
        btnshpAgregarCliente.setIcon(FontIcon.of(FontAwesomeSolid.SAVE, 40, Color.white));
        btnshpAgregarCliente.setForma(RSButtonShape.FORMA.ROUND);
        
        RSButtonShape btnshpBuscarCliente = new RSButtonShape();
        btnshpBuscarCliente.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
            	MainMenu.panelBody.removeAll();
            	MainMenu.panelBody.add(new MenuInventario());
            	MainMenu.panelBody.repaint();
            	MainMenu.panelBody.revalidate();
        	}
        });
        btnshpBuscarCliente.setBounds(529, 552, 211, 63);
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
        
        JLabel lblRUT = new JLabel("ROL:");
        lblRUT.setForeground(new Color(3, 33,  57));
        lblRUT.setBounds(12, 63, 79, 33);
        lblRUT.setHorizontalAlignment(SwingConstants.RIGHT);
        lblRUT.setFont(new Font("Dubai", Font.BOLD, 20));
        setLayout(null);
        add(jLabel1);
        add(btnshpAgregarCliente);
        add(btnshpBuscarCliente);
        add(lblRUT);
        
        RSButtonShape btnAgregaItem = new RSButtonShape();
        btnAgregaItem.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
                TableModel model1 = tblItems.getModel();

                int[] indexs = tblItems.getSelectedRows();

                Object[] row = new Object[3];

                DefaultTableModel model2 = (DefaultTableModel) tblInveActual.getModel();

                for(int i = 0; i < indexs.length; i++)
                {
                    row[0] = model1.getValueAt(indexs[i], 0);

                    row[1] = model1.getValueAt(indexs[i], 1);

                    row[2] = 1;



                    model2.addRow(row);
                }
                tblInveActual.setModel(model2);
        	}
        });
        btnAgregaItem.setHorizontalAlignment(SwingConstants.CENTER);
        btnAgregaItem.setForma(RSButtonShape.FORMA.ROUND);
        btnAgregaItem.setForegroundText(Color.WHITE);
        btnAgregaItem.setForegroundHover(Color.WHITE);
        btnAgregaItem.setForeground(Color.GRAY);
        btnAgregaItem.setFont(new Font("Dubai", Font.BOLD, 13));
        btnAgregaItem.backgroundHover = SystemColor.controlShadow;
        btnAgregaItem.setBackgroundHover(SystemColor.controlShadow);
        btnAgregaItem.setBackground(new Color(0, 51, 102));
        btnAgregaItem.setBounds(297, 228, 55, 37);
        btnAgregaItem.setIcon(FontIcon.of(FontAwesomeSolid.ARROW_RIGHT, 20, Color.white));
        add(btnAgregaItem);
        
        RSButtonShape btnQuitaItem = new RSButtonShape();
        btnQuitaItem.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		   DefaultTableModel model = (DefaultTableModel)tblInveActual.getModel();
        		   int[] rows = tblInveActual.getSelectedRows();
        		   for(int i=0;i<rows.length;i++){
        		     model.removeRow(rows[i]-i);
        		   }
        		   tblInveActual.setModel(model);
        	}
        });
        btnQuitaItem.setHorizontalAlignment(SwingConstants.CENTER);
        btnQuitaItem.setForma(RSButtonShape.FORMA.ROUND);
        btnQuitaItem.setForegroundText(Color.WHITE);
        btnQuitaItem.setForegroundHover(Color.WHITE);
        btnQuitaItem.setForeground(Color.GRAY);
        btnQuitaItem.setFont(new Font("Dubai", Font.BOLD, 13));
        btnQuitaItem.backgroundHover = SystemColor.controlShadow;
        btnQuitaItem.setBackgroundHover(SystemColor.controlShadow);
        btnQuitaItem.setBackground(new Color(0, 51, 102));
        btnQuitaItem.setBounds(297, 283, 55, 37);
        btnQuitaItem.setIcon(FontIcon.of(FontAwesomeSolid.ARROW_LEFT, 20, Color.white));
        add(btnQuitaItem);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(47, 181, 231, 318);
        add(scrollPane);
        tblItems.setColorSecondary(new Color(220, 220, 220));
        tblItems.setColorSecundaryText(new Color(25, 25, 112));
        tblItems.setColorPrimaryText(new Color(25, 25, 112));
        tblItems.setModelSelection(SELECTION_ROWS.MULTIPLE_INTERVAL_SELECTION);
        tblItems.setShowVerticalLines(true);
        tblItems.setShowHorizontalLines(true);
        tblItems.setBackgoundHover(new Color(25, 25, 112));
        

        tblItems.setBackgoundHead(new Color(0, 128, 128));
        tblItems.setModel(new DefaultTableModel(
        	new Object[][] {
        		{"", null},
        	},
        	new String[] {
        		"ID", "ITEMS"
        	}
        ));
        scrollPane.setViewportView(tblItems);
        
        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(377, 181, 363, 318);
        add(scrollPane_1);
        tblInveActual.setShowVerticalLines(true);
        tblInveActual.setShowHorizontalLines(true);
        tblInveActual.setEffectHover(true);
        tblInveActual.setColorSecondary(new Color(220, 220, 220));
        tblInveActual.setBackgoundHover(new Color(25, 25, 112));
        tblInveActual.setModelSelection(SELECTION_ROWS.MULTIPLE_INTERVAL_SELECTION);
        tblInveActual.setBackgoundHead(new Color(0, 128, 128));
        tblInveActual.setColorPrimaryText(new Color(25, 25, 112));
        

        tblInveActual.setModel(new DefaultTableModel(
        	new Object[][] {
        		{null, null, null},
        	},
        	new String[] {
        		"ID", "ITEMS", "CANTIDAD"
        	}
        ));
        scrollPane_1.setViewportView(tblInveActual);
        
        JLabel lblItemsDisponibles = new JLabel("Items Disponibles");
        lblItemsDisponibles.setHorizontalAlignment(SwingConstants.CENTER);
        lblItemsDisponibles.setForeground(new Color(0, 128, 128));
        lblItemsDisponibles.setFont(new Font("Dubai", Font.BOLD, 20));
        lblItemsDisponibles.setBounds(47, 142, 189, 33);
        add(lblItemsDisponibles);
        
        JLabel lblInventarioActual = new JLabel("Inventario Actual");
        lblInventarioActual.setHorizontalAlignment(SwingConstants.CENTER);
        lblInventarioActual.setForeground(new Color(0, 128, 128));
        lblInventarioActual.setFont(new Font("Dubai", Font.BOLD, 20));
        lblInventarioActual.setBounds(349, 141, 363, 33);
        add(lblInventarioActual);
        


        lblRolProp.setHorizontalAlignment(SwingConstants.LEFT);
        lblRolProp.setForeground(new Color(3, 33, 57));
        lblRolProp.setFont(new Font("Dubai", Font.BOLD, 20));
        lblRolProp.setBounds(101, 63, 135, 33);
        lblRolProp.setText("00001-00001");
        add(lblRolProp);
        
        JLabel lblNombreDeLa = new JLabel("Nombre de la Propiedad:");
        lblNombreDeLa.setHorizontalAlignment(SwingConstants.LEFT);
        lblNombreDeLa.setForeground(new Color(3, 33, 57));
        lblNombreDeLa.setFont(new Font("Dubai", Font.BOLD, 20));
        lblNombreDeLa.setBounds(47, 97, 224, 33);
        add(lblNombreDeLa);
        

        lblNomProp.setHorizontalAlignment(SwingConstants.LEFT);
        lblNomProp.setForeground(new Color(3, 33, 57));
        lblNomProp.setFont(new Font("Dubai", Font.BOLD, 20));
        lblNomProp.setBounds(281, 97, 459, 33);
        lblNomProp.setText("PROPIEDAD EJEMPLO");
        add(lblNomProp);
        
    }// </editor-fold>//GEN-END:initComponents
    

    private void llenarTablaItems() {
		// TODO Auto-generated method stub
    	ArrayList<Inventario> lista_inv = new ArrayList<Inventario>();
    	ConectInventario cinv = new ConectInventario();
    	lista_inv = cinv.listarInventarios();    	
    	
		String[] col = {"ID", "ITEM"};
		DefaultTableModel tableModel = new DefaultTableModel(col, 0);
		
		for (Inventario inv : lista_inv) {
			
			tableModel.addRow( new Object[]{inv.getId_iventario(), inv.getNombre()});
		}
		
		tblItems.setModel(tableModel);
		
	}
    
    private void llenarTablaActual(String rol) {
		// TODO Auto-generated method stub
		
		ConectPropiedades cprop = new ConectPropiedades();
		ArrayList<DetallePropiedad> lista_dp = new ArrayList<DetallePropiedad>();
		lista_dp = cprop.detallePropiedad(rol);
		lblRolProp.setText(lista_dp.get(0).getRol());
		lblNomProp.setText(lista_dp.get(0).getNombre_prop());
		
		idprop = lista_dp.get(0).getId_propiedad();
		
		String[] col = {"ID", "ITEM","CANTIDAD"};
		DefaultTableModel tableModel = new DefaultTableModel(col, 0);
		
		
		for (DetallePropiedad dp : lista_dp) {
			
			tableModel.addRow( new Object[]{dp.getId_inven(), dp.getNombre_inv(), dp.getCantidad()});
		}
		
		tblInveActual.setModel(tableModel);
		
	}
    
    
    public void tablatoDB() {
    	ArrayList<DetallePropiedad> lista_db = new ArrayList<DetallePropiedad>();

        TableModel model1 = tblInveActual.getModel();

        int filas = tblInveActual.getRowCount();
        System.out.println("Cantidad de lineas: "+filas);

        Object[] row = new Object[3];

        for(int i = 0; i < filas; i++)
        {
        	DetallePropiedad dp = new DetallePropiedad();
        	
            row[0] = model1.getValueAt(i, 0); //ID_inventario
            int id_inv = ((Integer) row[0]).intValue();
            System.out.println("ID INV = "+id_inv);

            row[1] = idprop; //ID_Prop
            int id_pro = ((Integer) row[1]).intValue();
            System.out.println("ID PROP = "+id_pro);

            row[2] = model1.getValueAt(i, 2); //Cantidad_
            try {
                int cant = ((Integer) row[2]).intValue();
                System.out.println("CANTI = "+cant);	
                dp.setCantidad(cant);
			} catch (Exception e) {
				// TODO: handle exception
	            String cant = ((String) row[2]).toString();
	            System.out.println("CANTI = "+cant);
	            dp.setCantidad(Integer.parseInt(cant));
			}

            
            dp.setId_inven(id_inv);
            dp.setId_propiedad(id_pro);

            dp.setRol(lblRolProp.getText());
            lista_db.add(dp);

        }        
        
        ConectPropiedades cprop = new ConectPropiedades();
        
        //Limpiar Detalle de propiedad
        cprop.limpiarrDetallePropiedad(lblRolProp.getText());
        
        // Guardar Cada uno de los Items de la Propiedad
        boolean resultado;
        for (DetallePropiedad dprop : lista_db) {
        	resultado = cprop.actualizarDetallePropiedad(dprop);
    		if (resultado) {
    			System.out.println("LA PROPIEDAD FUE GUARDADA EXITOSAMENTE");
    			
			}else {
				JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR");
			}
        	
		}
        
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
