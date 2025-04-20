package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import Entidad.Arreglo_Alumno;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblDni;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblDisponible;
	private JTextField txtNom;
	private JTextField txtApell;
	private JTextField txtCod;
	private JTextField txtDNI;
	private JComboBox cmboxDispo;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V1 frame = new V1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public V1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Codigo");
			lblNewLabel.setBounds(20, 61, 46, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblDni = new JLabel("DNI");
			lblDni.setBounds(239, 11, 46, 14);
			contentPane.add(lblDni);
		}
		{
			lblNombre = new JLabel("Nombre");
			lblNombre.setBounds(20, 11, 46, 14);
			contentPane.add(lblNombre);
		}
		{
			lblApellido = new JLabel("Apellido");
			lblApellido.setBounds(20, 36, 46, 14);
			contentPane.add(lblApellido);
		}
		{
			lblDisponible = new JLabel("Disponible");
			lblDisponible.setBounds(233, 36, 70, 14);
			contentPane.add(lblDisponible);
		}
		{
			txtNom = new JTextField();
			txtNom.setBounds(74, 8, 86, 20);
			contentPane.add(txtNom);
			txtNom.setColumns(10);
		}
		{
			txtApell = new JTextField();
			txtApell.setColumns(10);
			txtApell.setBounds(74, 33, 86, 20);
			contentPane.add(txtApell);
		}
		{
			txtCod = new JTextField();
			txtCod.setColumns(10);
			txtCod.setBounds(74, 58, 86, 20);
			contentPane.add(txtCod);
		}
		{
			txtDNI = new JTextField();
			txtDNI.setColumns(10);
			txtDNI.setBounds(293, 8, 86, 20);
			contentPane.add(txtDNI);
		}
		{
			cmboxDispo = new JComboBox();
			cmboxDispo.setBounds(293, 36, 86, 22);
			contentPane.add(cmboxDispo);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(20, 124, 388, 126);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
		{
			btnNewButton = new JButton("Registrar");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(293, 69, 89, 23);
			contentPane.add(btnNewButton);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	Arreglo_Alumno aa = new Arreglo_Alumno();
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		
		
	}
	void Imprimir(String s)
	{
		txtS.append(s + "\n");
	}
	void Listado()
	{
		Imprimir("Codigo\tDNI\tNombre\tApellido\tDisponible");
		for (int i = 0; i < aa.Tamaño(); i++) 
		{
			String linea =
					aa.Obtener(i).getCod() + "\t" +
					aa.Obtener(i).getDni() + "\t" +
					aa.Obtener(i).getNombre() + "\t" +
					aa.Obtener(i).getApellido() + "\t";
			Imprimir(linea);
		}
	}
}
