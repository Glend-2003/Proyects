package presentation;





import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.security.SecureRandom;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class GuiAdmi extends JFrame {

	private JPanel Menu;
	private JLabel TIT;
	private JLabel Names;
	private JLabel Id;
	private JLabel Age;
	private JLabel Gender;
	private JTextField TNames;
	private JTextField TId;
	private JTextField Tage;
	private JComboBox<?> comboBox;
	public String array[]= {"Ninguno","Masculino","Femenino"};
	private JLabel Province;
	private JLabel Canton;
	private JLabel Calle;
	private JComboBox<?> Tpro;
	private JTextField TCanton;
	private JTextField Tcalle;
	public String DProvince[]= {"Ninguno","Heredia","Alajuela","San Jose","Cartago","Puntarenas","Limon","Guanacaste"};
	private JLabel Username;
	private JTextField TUser;
	private JLabel info;
	private JButton Senn;
	
	
	private  String letter = "abcdefghijklmnopqrstuvwxyz";
    private  String Mayus = letter.toUpperCase();
    private  String Number= "0123456789";
    private  String Data = letter +Mayus + Number;
    private  SecureRandom random = new SecureRandom();
	
	
	
	public GuiAdmi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 303);
		Menu = new JPanel();
		Menu.setBackground(new Color(128, 128, 192));
		Menu.setBorder(new EmptyBorder(5, 5, 5, 5));
        setLocationRelativeTo(null);
		setContentPane(Menu);
		Menu.setLayout(null);
		Menu.add(getTIT());
		Menu.add(getNames());
		Menu.add(getId());
		Menu.add(getAge());
		Menu.add(getGender());
		Menu.add(getTNames());
		Menu.add(getTId());
		Menu.add(getTage());
		Menu.add(getComboBox(array));
		Menu.add(getProvince());
		Menu.add(getCanton());
		Menu.add(getCalle());
		Menu.add(getTpro(DProvince));
		Menu.add(getTCanton());
		Menu.add(getTcalle());
		Menu.add(getUsername());
		Menu.add(getTUser());
		Menu.add(getInfo());
		Menu.add(getSenn());
		setVisible(true);
	}

	public JLabel getTIT() {
		if (TIT == null) {
			TIT = new JLabel("Trabajadores");
			TIT.setForeground(new Color(255, 255, 255));
			TIT.setFont(new Font("Tahoma", Font.PLAIN, 15));
			TIT.setBounds(157, 11, 103, 14);
		}
		return TIT;
	}
	public JLabel getNames() {
		if (Names == null) {
			Names = new JLabel("Nombre");
			Names.setBackground(new Color(0, 0, 0));
			Names.setOpaque(true);
			Names.setForeground(new Color(255, 255, 255));
			Names.setFont(new Font("Tahoma", Font.PLAIN, 13));
			Names.setBounds(10, 46, 89, 14);
		}
		return Names;
	}
	public JLabel getId() {
		if (Id == null) {
			Id = new JLabel("Cedula");
			Id.setBackground(new Color(0, 0, 0));
			Id.setOpaque(true);
			Id.setForeground(new Color(255, 255, 255));
			Id.setFont(new Font("Tahoma", Font.PLAIN, 13));
			Id.setBounds(109, 46, 70, 14);
		}
		return Id;
	}
	public JLabel getAge() {
		if (Age == null) {
			Age = new JLabel("Edad");
			Age.setOpaque(true);
			Age.setBackground(new Color(0,0,0));
			Age.setFont(new Font("Tahoma", Font.PLAIN, 13));
			Age.setForeground(new Color(255, 255, 255));
			Age.setBounds(190, 47, 70, 13);
		}
		return Age;
	}
	public JLabel getGender() {
		if (Gender == null) {
			Gender = new JLabel("Genero");
			Gender.setBackground(new Color(0, 0, 0));
			Gender.setOpaque(true);
			Gender.setFont(new Font("Tahoma", Font.PLAIN, 13));
			Gender.setForeground(new Color(255, 255, 255));
			Gender.setBounds(269, 46, 70, 14);
		}
		return Gender;
	}
	public JTextField getTNames() {
		if (TNames == null) {
			TNames = new JTextField();
			TNames.setBounds(10, 65, 86, 20);
			TNames.setColumns(10);
		}
		return TNames;
	}
	public JTextField getTId() {
		if (TId == null) {
			TId = new JTextField();
			TId.setBounds(107, 65, 77, 20);
			TId.setColumns(10);
		}
		return TId;
	}
	public JTextField getTage() {
		if (Tage == null) {
			Tage = new JTextField();
			Tage.setBounds(190, 65, 77, 20);
			Tage.setColumns(10);
		}
		return Tage;
	}
	
	
	
	public JComboBox<?> getComboBox(String a[]) {
		
		if (comboBox == null) {
			comboBox = new JComboBox(a);
			comboBox.setSelectedIndex(0);
			comboBox.setBounds(269, 64, 70, 22);
		}
		return comboBox;
	}
	public JLabel getProvince() {
		if (Province == null) {
			Province = new JLabel("Provincia");
			Province.setFont(new Font("Tahoma", Font.PLAIN, 13));
			Province.setForeground(new Color(255, 255, 255));
			Province.setBounds(10, 125, 70, 14);
		}
		return Province;
	}
	public JLabel getCanton() {
		if (Canton == null) {
			Canton = new JLabel("Canton");
			Canton.setForeground(new Color(255, 255, 255));
			Canton.setFont(new Font("Tahoma", Font.PLAIN, 13));
			Canton.setBounds(90, 125, 69, 14);
		}
		return Canton;
	}
	public JLabel getCalle() {
		if (Calle == null) {
			Calle = new JLabel("Calle");
			Calle.setForeground(new Color(255, 255, 255));
			Calle.setFont(new Font("Tahoma", Font.PLAIN, 13));
			Calle.setBounds(174, 125, 86, 14);
		}
		return Calle;
	}
	public JComboBox getTpro(String a[]) {
		if (Tpro == null) {
			Tpro = new JComboBox(a);
			Tpro.setSelectedIndex(0);
			Tpro.setBounds(10, 148, 70, 22);
		}
		return Tpro;
	}
	public JTextField getTCanton() {
		if (TCanton == null) {
			TCanton = new JTextField();
			TCanton.setBounds(93, 150, 70, 20);
			TCanton.setColumns(10);
		}
		return TCanton;
	}
	public JTextField getTcalle() {
		if (Tcalle == null) {
			Tcalle = new JTextField();
			Tcalle.setBounds(174, 150, 86, 20);
			Tcalle.setColumns(10);
		}
		return Tcalle;
	}
	public JLabel getUsername() {
		if (Username == null) {
			Username = new JLabel("Usuraio:");
			Username.setForeground(new Color(255, 255, 255));
			Username.setFont(new Font("Tahoma", Font.PLAIN, 13));
			Username.setBounds(10, 192, 70, 14);
		}
		return Username;
	}
	public JTextField getTUser() {
		if (TUser == null) {
			TUser = new JTextField();
			TUser.setBounds(90, 190, 86, 20);
			TUser.setColumns(10);
		}
		return TUser;
	}
	public JLabel getInfo() {
		if (info == null) {
			info = new JLabel("La contraseña será enviada a su correo electrónico");
			info.setForeground(new Color(255, 255, 255));
			info.setBounds(10, 224, 316, 14);
		}
		return info;
	}
	public JButton getSenn() {
		if (Senn == null) {
			Senn = new JButton("Enviar");
			Senn.setBounds(285, 183, 89, 23);
		}
		return Senn;
	}
	
	public String PassWork() {
		StringBuilder sb = new StringBuilder(4);
		for(int i=0;i<4;i++) {
			
			int rand=random.nextInt(Data.length());
			 sb.append(Data.charAt(rand));
			
		}
		
		return sb.toString();
		
	}
	
	
	
	
}
