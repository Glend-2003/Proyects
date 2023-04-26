package presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class GuiWorked extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu Inicio;
	private JMenu Operation;
	private JMenu About;
	private JMenuItem MIW;
	private JMenuItem Maintenace;
	private JMenuItem Exit;
	private JLabel BusineesTIt;
	private JLabel Welcome;
   private String n;
	
	public GuiWorked(String l) {
		setBackground(new Color(255, 255, 255));
		this.n=l;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBusineesTIt());
		contentPane.add(getWelcome(this.n));
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getInicio());
			menuBar.add(getOperation());
			menuBar.add(getAbout());
		}
		return menuBar;
	}
	public JMenu getInicio() {
		if (Inicio == null) {
			Inicio = new JMenu("Inicio");
			Inicio.add(getMaintenace());
		}
		return Inicio;
	}
	public JMenu getOperation() {
		if (Operation == null) {
			Operation = new JMenu("Operaciones");
			Operation.add(getMIW());
		}
		return Operation;
	}
	public JMenu getAbout() {
		if (About == null) {
			About = new JMenu("Acerca de");
			About.add(getExit());
		}
		return About;
	}
	public JMenuItem getMIW() {
		if (MIW == null) {
			MIW = new JMenuItem("Gestionar Clientes");
		}
		return MIW;
	}
	public JMenuItem getMaintenace() {
		if (Maintenace == null) {
			Maintenace = new JMenuItem("Mantenimiento");
		}
		return Maintenace;
	}
	public JMenuItem getExit() {
		if (Exit == null) {
			Exit = new JMenuItem("Salir");
		}
		return Exit;
	}
	public JLabel getBusineesTIt() {
		if (BusineesTIt == null) {
			BusineesTIt = new JLabel("Master Computer");
			BusineesTIt.setForeground(new Color(255, 255, 255));
			BusineesTIt.setFont(new Font("Times New Roman", Font.PLAIN, 20));
			BusineesTIt.setBounds(142, 11, 148, 25);
		}
		return BusineesTIt;
	}
	public JLabel getWelcome(String user) {
		if (Welcome == null) {
			Welcome = new JLabel("Bienvenido: "+user);
			Welcome.setForeground(new Color(255, 255, 255));
			Welcome.setFont(new Font("Tahoma", Font.PLAIN, 20));
			Welcome.setBounds(85, 60, 281, 25);
		}
		return Welcome;
	}
}
