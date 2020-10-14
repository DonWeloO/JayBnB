/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;
import javax.swing.SwingConstants;

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
import RSMaterialComponent.RSButtonShape;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Vista.MainMenu;
import javax.swing.LayoutStyle.ComponentPlacement;
/**
 *
 * @author RavenPC
 */
public class MenuInventario extends javax.swing.JPanel {

    /**
     * Creates new form Panel1
     */
    public MenuInventario() {
    	setBackground(Color.WHITE);
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
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);

        jLabel1.setBackground(new Color(0, 80, 112));
        jLabel1.setFont(new Font("Dubai", Font.BOLD, 20)); // NOI18N
        jLabel1.setText("Mantenedor de Inventario");
        jLabel1.setOpaque(true);
        
        RSButtonShape btnshpAgregarCliente = new RSButtonShape();
        btnshpAgregarCliente.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
            	MainMenu.panelBody.removeAll();
            	MainMenu.panelBody.add(new RegistroInventario());
            	MainMenu.panelBody.repaint();
            	MainMenu.panelBody.revalidate();
        	}
        });
        btnshpAgregarCliente.setFont(new Font("Dubai", Font.BOLD, 13));
        btnshpAgregarCliente.setForegroundHover(new Color(3, 33, 57));
        btnshpAgregarCliente.backgroundHover = UIManager.getColor("Button.shadow");
        btnshpAgregarCliente.setBackgroundHover(new Color(220, 220, 220));
        btnshpAgregarCliente.setForegroundText(new Color(3, 33, 57));
        btnshpAgregarCliente.setForeground(new Color(0, 51, 102));
        btnshpAgregarCliente.setBackground(Color.WHITE);
        btnshpAgregarCliente.setHorizontalAlignment(SwingConstants.CENTER);
        btnshpAgregarCliente.setText("   AGREGAR ITEM");
        btnshpAgregarCliente.setIcon(FontIcon.of(FontAwesomeSolid.PLUS, 40, new Color(0, 51, 102)));
        btnshpAgregarCliente.setForma(RSButtonShape.FORMA.RECT);
        
        RSButtonShape btnshpBuscarCliente = new RSButtonShape();
        btnshpBuscarCliente.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
            	MainMenu.panelBody.removeAll();
            	MainMenu.panelBody.add(new BuscarInventario());
            	MainMenu.panelBody.repaint();
            	MainMenu.panelBody.revalidate();
        	}
        });
        btnshpBuscarCliente.setFont(new Font("Dubai", Font.BOLD, 13));
        btnshpBuscarCliente.setForegroundHover(new Color(3, 33, 57));
        btnshpBuscarCliente.setBackgroundHover(new Color(220, 220, 220));
        btnshpBuscarCliente.setForegroundText(new Color(3, 33, 57));
        btnshpBuscarCliente.setForeground(new Color(0, 128, 128));
        btnshpBuscarCliente.setBackground(Color.WHITE);
        btnshpBuscarCliente.setText("   BUSCAR ITEMS");
        btnshpBuscarCliente.setHorizontalAlignment(SwingConstants.CENTER);
        btnshpBuscarCliente.setIcon(FontIcon.of(FontAwesomeSolid.SEARCH, 40, new Color(0, 51, 102)));
        btnshpBuscarCliente.setForma(RSButtonShape.FORMA.RECT);
        
        RSButtonShape btnshpListarClientes = new RSButtonShape();
        btnshpListarClientes.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
            	MainMenu.panelBody.removeAll();
            	MainMenu.panelBody.add(new ListarInventario());
            	MainMenu.panelBody.repaint();
            	MainMenu.panelBody.revalidate();
        	}
        });
        btnshpListarClientes.setFont(new Font("Dubai", Font.BOLD, 13));
        btnshpListarClientes.setForegroundHover(new Color(3, 33, 57));
        btnshpListarClientes.setBackgroundHover(new Color(220, 220, 220));
        btnshpListarClientes.setForegroundText(new Color(3, 33, 57));
        btnshpListarClientes.setForeground(new Color(0, 128, 128));
        btnshpListarClientes.setBackground(Color.WHITE);
        btnshpListarClientes.setText("   LISTAR ITEMS");
        btnshpListarClientes.setHorizontalAlignment(SwingConstants.CENTER);
        btnshpListarClientes.setIcon(FontIcon.of(FontAwesomeSolid.LIST, 40, new Color(0, 51, 102)));
        btnshpListarClientes.setForma(RSButtonShape.FORMA.RECT);
        
        RSButtonShape btnAgregarItemProp = new RSButtonShape();
        btnAgregarItemProp.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
            	MainMenu.panelBody.removeAll();
            	MainMenu.panelBody.add(new BuscarDetallePropiedad());
            	MainMenu.panelBody.repaint();
            	MainMenu.panelBody.revalidate();
        	}
        });
        btnAgregarItemProp.setText("   AGREGAR ITEMS A PROPIEDAD");
        btnAgregarItemProp.setHorizontalAlignment(SwingConstants.CENTER);
        btnAgregarItemProp.setForma(RSButtonShape.FORMA.RECT);
        btnAgregarItemProp.setForegroundText(new Color(3, 33, 57));
        btnAgregarItemProp.setForegroundHover(new Color(3, 33, 57));
        btnAgregarItemProp.setForeground(new Color(0, 128, 128));
        btnAgregarItemProp.setFont(new Font("Dubai", Font.BOLD, 13));
        btnAgregarItemProp.backgroundHover = new Color(220, 220, 220);
        btnAgregarItemProp.setBackgroundHover(new Color(220, 220, 220));
        btnAgregarItemProp.setIcon(FontIcon.of(FontAwesomeSolid.HOME, 40, new Color(0, 51, 102)));
        btnAgregarItemProp.setBackground(Color.WHITE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(31)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(btnAgregarItemProp, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(btnshpAgregarCliente, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(btnshpBuscarCliente, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(btnshpListarClientes, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)))
        			.addGap(73))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(btnshpAgregarCliente, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
        				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(btnshpBuscarCliente, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
        					.addComponent(btnshpListarClientes, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(btnAgregarItemProp, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(353, Short.MAX_VALUE))
        );
        this.setLayout(layout);
    }// </editor-fold>//GEN-END:initComponents
    private javax.swing.JLabel jLabel1;
}