package Ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Entidad.CalcularNotas;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AgregarNotas extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JLabel lblNotaSegundobimestre;
	private JLabel lblNotaTercerBimestre;
	private JLabel lblNotaCuartobimestre;
	private JTextField txtPrimerBim;
	private JTextField txtSegundoBim;
	private JTextField txtTercerBim;
	private JTextField txtCuartoBim;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JComboBox comboBox;
	private JLabel lblCruso;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_1;
	private JTextField txtCodAlum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AgregarNotas dialog = new AgregarNotas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AgregarNotas() {
		setTitle("Registro de Notas");
		setBounds(100, 100, 633, 465);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblNewLabel = new JLabel("Nota Primer Bimestre");
			lblNewLabel.setBounds(20, 16, 128, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			lblNotaSegundobimestre = new JLabel("Nota Segundo Bimestre");
			lblNotaSegundobimestre.setBounds(20, 47, 138, 14);
			contentPanel.add(lblNotaSegundobimestre);
		}
		{
			lblNotaTercerBimestre = new JLabel("Nota Tercer Bimestre");
			lblNotaTercerBimestre.setBounds(20, 79, 128, 14);
			contentPanel.add(lblNotaTercerBimestre);
		}
		{
			lblNotaCuartobimestre = new JLabel("Nota Cuarto Bimestre");
			lblNotaCuartobimestre.setBounds(20, 114, 128, 14);
			contentPanel.add(lblNotaCuartobimestre);
		}
		{
			txtPrimerBim = new JTextField();
			txtPrimerBim.setBounds(158, 13, 86, 20);
			contentPanel.add(txtPrimerBim);
			txtPrimerBim.setColumns(10);
		}
		{
			txtSegundoBim = new JTextField();
			txtSegundoBim.setColumns(10);
			txtSegundoBim.setBounds(158, 44, 86, 20);
			contentPanel.add(txtSegundoBim);
		}
		{
			txtTercerBim = new JTextField();
			txtTercerBim.setColumns(10);
			txtTercerBim.setBounds(158, 76, 86, 20);
			contentPanel.add(txtTercerBim);
		}
		{
			txtCuartoBim = new JTextField();
			txtCuartoBim.setColumns(10);
			txtCuartoBim.setBounds(158, 111, 86, 20);
			contentPanel.add(txtCuartoBim);
		}
		{
			btnNewButton = new JButton("Calcular y Registrar");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(349, 124, 161, 36);
			contentPanel.add(btnNewButton);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(20, 179, 572, 236);
			contentPanel.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
		{
			comboBox = new JComboBox();
			comboBox.setBounds(400, 12, 128, 22);
			contentPanel.add(comboBox);
		}
		{
			lblCruso = new JLabel("Selecionar Curso");
			lblCruso.setBounds(284, 16, 128, 14);
			contentPanel.add(lblCruso);
		}
		{
			btnNewButton_1 = new JButton("Modificar");
			btnNewButton_1.setBounds(503, 43, 89, 23);
			contentPanel.add(btnNewButton_1);
		}
		{
			lblNewLabel_1 = new JLabel("Ingresar Codigo de Alumno");
			lblNewLabel_1.setBounds(10, 151, 161, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			txtCodAlum = new JTextField();
			txtCodAlum.setColumns(10);
			txtCodAlum.setBounds(168, 148, 86, 20);
			contentPanel.add(txtCodAlum);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		try {
		    int n1 = Integer.parseInt(txtPrimerBim.getText().trim());
		    int n2 = Integer.parseInt(txtSegundoBim.getText().trim());
		    int n3 = Integer.parseInt(txtTercerBim.getText().trim());

		    String textoN4 = txtCuartoBim.getText().trim();

		    double resultado;
		    CalcularNotas objPromedio;

		    if (textoN4.isEmpty()) {
		      
		        objPromedio = new CalcularNotas(n1, n2, n3);
		        resultado = objPromedio.calcularPromedio(n1, n2, n3);
		    } else {
		        int n4 = Integer.parseInt(textoN4);
		        objPromedio = new CalcularNotas(n1, n2, n3, n4);
		        resultado = objPromedio.calcularPromedio(n1, n2, n3, n4);
		    }

		    txtS.append("Nota1\tNota2\tNota3\tNota4\tPromedio\tCodigo del Alumno");
		    txtS.append(""+resultado);
		    
		    

		} catch (NumberFormatException ex) {
		    JOptionPane.showMessageDialog(null, "Por favor, ingresa números válidos en todos los campos.");
		}
	}
}
