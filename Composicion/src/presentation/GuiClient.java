package presentation;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.File;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class GuiClient extends JFrame {

	private JPanel Menu;
	private JLabel m;
	private JLabel Cite;
	private JLabel Day;
	private JTextField Tday;
	private JLabel Month;
	public String TMonth[]= {"Ninguno","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
	private JComboBox<?> MT;
	private JLabel Hora;
	private JComboBox<?> Hours;
	public String H[]= {"Ninguno","8:00 am","10:30 am","12:00 md","1:00 pm","3:00pm","5:00 pm"};
	private JButton adg;
	private JButton Return;
	private String N;
	private JLabel si;
	private JLabel con;
	private JLabel Marca;
	
	public GuiClient(String l) {
		this.N=l;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Menu = new JPanel();
		Menu.setBackground(new Color(128, 128, 255));
		Menu.setBorder(new EmptyBorder(5, 5, 5, 5));
		  String imagePath ="C:/Users/USUARIO/Downloads/pppp.png";
		  
		  
		ImageIcon greenIcon = new ImageIcon(imagePath);
		setContentPane(Menu);
		Menu.setLayout(null);
		Menu.add(getM());
		Menu.add(getCite());
		Menu.add(getDay());
		Menu.add(getTday());
		Menu.add(getMonth());
		Menu.add(getMT(TMonth));
		Menu.add(getHora());
		Menu.add(getHours(H));
		Menu.add(getAdg());
		Menu.add(getReturn());
		Menu.add(getSi(this.N));
		Menu.add(getCon());
		Menu.add(getMarca(greenIcon));
	
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public JLabel getM() {
		if (m == null) {
			m = new JLabel("Master Computer");
			m.setFont(new Font("Tahoma", Font.PLAIN, 15));
			m.setForeground(new Color(255, 255, 255));
			m.setBounds(146, 11, 126, 14);
		}
		return m;
	}
	public JLabel getCite() {
		if (Cite == null) {
			Cite = new JLabel("Agendar Cita");
			Cite.setForeground(new Color(255, 255, 255));
			Cite.setFont(new Font("Tahoma", Font.PLAIN, 13));
			Cite.setBounds(156, 36, 91, 23);
		}
		return Cite;
	}
	public JLabel getDay() {
		if (Day == null) {
			Day = new JLabel("Dia");
			Day.setOpaque(true);
			Day.setBackground(Color.BLACK);
			Day.setFont(new Font("Tahoma", Font.PLAIN, 13));
			Day.setForeground(new Color(255, 255, 255));
			Day.setBounds(33, 66, 79, 14);
		}
		return Day;
	}
	public JTextField getTday() {
		if (Tday == null) {
			Tday = new JTextField();
			Tday.setBounds(33, 92, 86, 20);
			Tday.setColumns(10);
		}
		return Tday;
	}
	public JLabel getMonth() {
		if (Month == null) {
			Month = new JLabel("Mes");
			Month.setOpaque(true);
			Month.setBackground(Color.BLACK);
			Month.setForeground(new Color(255, 255, 255));
			Month.setFont(new Font("Tahoma", Font.PLAIN, 13));
			Month.setBounds(130, 66, 79, 14);
		}
		return Month;
	}
	public JComboBox getMT(String a[]) {
		if (MT == null) {
			MT = new JComboBox(a);
			MT.setSelectedIndex(0);
			MT.setBounds(129, 91, 80, 22);
		}
		return MT;
	}
	public JLabel getHora() {
		if (Hora == null) {
			Hora = new JLabel("Hora");
			Hora.setOpaque(true);
			Hora.setBackground(Color.BLACK);
			Hora.setForeground(new Color(255, 255, 255));
			Hora.setFont(new Font("Tahoma", Font.PLAIN, 13));
			Hora.setBounds(226, 67, 79, 14);
		}
		return Hora;
	}
	public JComboBox getHours(String a[]) {
		if (Hours == null) {
			Hours = new JComboBox(a);
			Hours.setSelectedIndex(0);
			Hours.setBounds(217, 91, 79, 22);
		}
		return Hours;
	}
	public JButton getAdg() {
		if (adg == null) {
			adg = new JButton("Agendar");
			adg.setBounds(33, 124, 89, 23);
		}
		return adg;
	}
	public JButton getReturn() {
		if (Return == null) {
			Return = new JButton("Volver");
			Return.setBounds(216, 124, 89, 23);
		}
		return Return;
	}
	public JLabel getSi(String f) {
		if (si == null) {
			si = new JLabel("");
			si.setText(f);
			si.setForeground(new Color(255, 255, 255));
			si.setFont(new Font("Tahoma", Font.PLAIN, 12));
			si.setBounds(330, 25, 91, 14);
		}
		return si;
	} 
	public JLabel getCon() {
		if (con == null) {
			con = new JLabel("Conectado");
			con.setForeground(new Color(255, 255, 255));
			con.setFont(new Font("Tahoma", Font.PLAIN, 12));
			con.setBounds(327, 12, 73, 14);
		}
		return con;
	}
	public JLabel getMarca(ImageIcon i) {
		if (Marca == null) {
			Marca = new JLabel(i);
			Marca.setBounds(380, 28, 10, 10);
		}
		return Marca;
	}
	
	public void cls() {
		Tday.setText("");
		MT.setSelectedIndex(0);
		Hours.setSelectedIndex(0);
	}
	
	
	
}
