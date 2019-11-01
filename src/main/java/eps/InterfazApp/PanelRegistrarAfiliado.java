package eps.InterfazApp;

import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import eps.negocio.TipoDeDocumento;

/**
 * Dialogo para agregar un nuevo socio al club.
 */

public class PanelRegistrarAfiliado 
{
	   public PanelRegistrarAfiliado(InterfazEPSAndesAdministrador interfaz)
	   {
		      JTextField nombre = new JTextField(15);
		      JTextField correo = new JTextField(15);
		      JTextField numDocumento = new JTextField(15);
		      JTextField fechaNacimiento = new JTextField(15);
		      
		      String[] tipoDeDocumento = {"CEDULAEXTRANJERIA", "CEDULACIUDADANIA", "REGISTROCIVIL", "TARJETAIDENTIDAD"};
		      JComboBox tipoDoc = new JComboBox<String>(tipoDeDocumento);
		      
		      GridLayout layout = new GridLayout(6,2);

		      JPanel myPanel = new JPanel();
		      myPanel.setLayout(layout);
		      myPanel.add(new JLabel("Nombre:"));
		      myPanel.add(nombre);
		      myPanel.add(new JLabel("Correo:"));
		      myPanel.add(correo);
		      myPanel.add(new JLabel("Tipo de documento:"));
		      myPanel.add(tipoDoc);
		      myPanel.add(new JLabel("Número de documento:"));
		      myPanel.add(numDocumento);
		      myPanel.add(new JLabel("La fecha se debe ingresar en el formato:"));
		      myPanel.add(new JLabel("   DD/MM/YYYY"));
		      myPanel.add(new JLabel("Fecha de nacimiento: "));
		      myPanel.add(fechaNacimiento);
		     

		      int result = JOptionPane.showConfirmDialog(null, myPanel, "Registrar un afiliado"
		      		+ "", JOptionPane.OK_CANCEL_OPTION);
		      TipoDeDocumento esp = TipoDeDocumento.valueOf(tipoDoc.getSelectedItem().toString());
		      if (result == JOptionPane.OK_OPTION)
		      {
		    	  interfaz.registrarAfiliadoDatos(nombre.getText(), correo.getText(), numDocumento.getText(), fechaNacimiento.getText(), esp);
		      }
		   }
		}