package Ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AgregarAlumno extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JLabel lblApellido;
	private JLabel lblCdigo;
	private JLabel lblDni;
	private JLabel lblDisponible;
	private JButton btnNewButton;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtCodigo;
	private JTextField txtDNI;
	private JComboBox cmbDisponible;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AgregarAlumno dialog = new AgregarAlumno();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AgregarAlumno() {
		setBounds(100, 100, 484, 337);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblNewLabel = new JLabel("Nombre");
			lblNewLabel.setBounds(29, 23, 53, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			lblApellido = new JLabel("Apellido");
			lblApellido.setBounds(29, 55, 53, 14);
			contentPanel.add(lblApellido);
		}
		{
			lblCdigo = new JLabel("Código");
			lblCdigo.setBounds(29, 91, 53, 14);
			contentPanel.add(lblCdigo);
		}
		{
			lblDni = new JLabel("DNI");
			lblDni.setBounds(231, 23, 53, 14);
			contentPanel.add(lblDni);
		}
		{
			lblDisponible = new JLabel("Disponible");
			lblDisponible.setBounds(231, 55, 53, 14);
			contentPanel.add(lblDisponible);
		}
		{
			btnNewButton = new JButton("Registrar");
			btnNewButton.setBounds(294, 87, 89, 23);
			contentPanel.add(btnNewButton);
		}
		{
			txtNombre = new JTextField();
			txtNombre.setBounds(92, 20, 86, 20);
			contentPanel.add(txtNombre);
			txtNombre.setColumns(10);
		}
		{
			txtApellido = new JTextField();
			txtApellido.setColumns(10);
			txtApellido.setBounds(92, 52, 86, 20);
			contentPanel.add(txtApellido);
		}
		{
			txtCodigo = new JTextField();
			txtCodigo.setColumns(10);
			txtCodigo.setBounds(92, 88, 86, 20);
			contentPanel.add(txtCodigo);
		}
		{
			txtDNI = new JTextField();
			txtDNI.setColumns(10);
			txtDNI.setBounds(294, 20, 86, 20);
			contentPanel.add(txtDNI);
		}
		{
			cmbDisponible = new JComboBox();
			cmbDisponible.setBounds(294, 51, 86, 22);
			contentPanel.add(cmbDisponible);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(27, 133, 373, 117);
			contentPanel.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
	}
}
