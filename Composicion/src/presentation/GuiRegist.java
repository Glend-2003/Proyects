package presentation;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Label;
import javax.swing.JPasswordField;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class GuiRegist extends JFrame {

	private JPanel Menu;
	private JLabel Acc;
	private JLabel Namess;
	private JLabel Id;
	private JTextField TNam;
	private JTextField Tid;
	private JLabel Age;
	private JTextField TAge;
	private JLabel Gender;
	private JComboBox comboBox;
	public String Type[]={"Ninguno","Masculino","Femenino"};
	private JLabel Province;
	private JLabel Canton;
	private JComboBox TProvince;
	public String DProvince[]= {"Ninguno","Heredia","Alajuela","San Jose","Cartago","Puntarenas","Limon","Guanacaste"};
	private JTextField TCanton;
	private JLabel Street;
	private JTextField Tstreet;
	private JLabel User;
	private JTextField Tuser;
	private JLabel Pass;
	private JPasswordField TPass;
	private JLabel ConfirmPasss;
	private JPasswordField passwordField;
	private JPasswordField Confirm;
	private JButton Regist;
	
	public GuiRegist() {
		 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 300);
		Menu = new JPanel();
		Menu.setBackground(new Color(128, 128, 255));
		Menu.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(Menu);
		Menu.setLayout(null);
		Menu.add(getAcc());
		Menu.add(getNamess());
		Menu.add(getId());
		Menu.add(getTNam());
		Menu.add(getTid());
		Menu.add(getAge());
		Menu.add(getTAge());
		Menu.add(getGender());
		Menu.add(getComboBox(Type));
		Menu.add(getProvince());
		Menu.add(getCanton());
		Menu.add(getTProvince(DProvince));
		Menu.add(getTCanton());
		Menu.add(getStreet());
		Menu.add(getTstreet());
		Menu.add(getUser());
		Menu.add(getTuser());
		Menu.add(getPass());
		Menu.add(getTPass());
		Menu.add(getConfirmPasss());
		Menu.add(getConfirm());
		Menu.add(getRegist());
	
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public JLabel getAcc() {
		if (Acc == null) {
			Acc = new JLabel("Nuevo Usuario");
			Acc.setForeground(new Color(255, 255, 255));
			Acc.setFont(new Font("Tahoma", Font.PLAIN, 15));
			Acc.setBounds(218, 11, 129, 14);
		}
		return Acc;
	}
	public JLabel getNamess() {
		if (Namess == null) {
			Namess = new JLabel("Nombre");
			Namess.setFont(new Font("Tahoma", Font.PLAIN, 13));
			Namess.setBackground(Color.BLACK);
			Namess.setOpaque(true);
			Namess.setForeground(new Color(255, 255, 255));
			Namess.setBounds(10, 37, 79, 14);
		}
		return Namess;
	}
	public JLabel getId() {
		if (Id == null) {
			Id = new JLabel("Cedula");
			Id.setFont(new Font("Tahoma", Font.PLAIN, 13));
			Id.setBackground(Color.BLACK);
			Id.setOpaque(true);
			Id.setForeground(new Color(255, 255, 255));
			Id.setBounds(106, 37, 86, 14);
		}
		return Id;
	}
	public JTextField getTNam() {
		if (TNam == null) {
			TNam = new JTextField();
			TNam.setBounds(10, 60, 86, 20);
			TNam.setColumns(10);
		}
		return TNam;
	}
	public JTextField getTid() {
		if (Tid == null) {
			Tid = new JTextField();
			Tid.setBounds(106, 60, 86, 20);
			Tid.setColumns(10);
		}
		return Tid;
	}
	public JLabel getAge() {
		if (Age == null) {
			Age = new JLabel("Edad");
			Age.setFont(new Font("Tahoma", Font.PLAIN, 13));
			Age.setBackground(Color.BLACK);
			Age.setOpaque(true);
			Age.setForeground(new Color(255, 255, 255));
			Age.setBounds(202, 37, 86, 14);
		}
		return Age;
	}
	public JTextField getTAge() {
		if (TAge == null) {
			TAge = new JTextField();
			TAge.setBounds(202, 60, 86, 20);
			TAge.setColumns(10);
		}
		return TAge;
	}
	public JLabel getGender() {
		if (Gender == null) {
			Gender = new JLabel("Genero");
			Gender.setFont(new Font("Tahoma", Font.PLAIN, 13));
			Gender.setBackground(Color.BLACK);
			Gender.setOpaque(true);
			Gender.setForeground(new Color(255, 255, 255));
			Gender.setBounds(301, 37, 71, 14);
		}
		return Gender;
	}
	public JComboBox getComboBox(String a[]) {
		if (comboBox == null) {
			comboBox = new JComboBox(a);
			comboBox.setSelectedIndex(0);
			comboBox.setBounds(298, 59, 90, 22);
		}
		return comboBox;
	}
	public JLabel getProvince() {
		if (Province == null) {
			Province = new JLabel("Provincia");
			Province.setForeground(new Color(255, 255, 255));
			Province.setOpaque(true);
			Province.setBackground(Color.BLACK);
			Province.setFont(new Font("Tahoma", Font.PLAIN, 13));
			Province.setBounds(10, 108, 79, 14);
		}
		return Province;
	}
	public JLabel getCanton() {
		if (Canton == null) {
			Canton = new JLabel("Canton");
			Canton.setForeground(new Color(255, 255, 255));
			Canton.setOpaque(true);
			Canton.setBackground(Color.BLACK);
			Canton.setFont(new Font("Tahoma", Font.PLAIN, 13));
			Canton.setBounds(106, 109, 86, 14);
		}
		return Canton;
	}
	public JComboBox getTProvince(String a[]) {
		if (TProvince == null) {
			TProvince = new JComboBox(a);
			TProvince.setSelectedIndex(0);
			TProvince.setBounds(10, 126, 79, 22);
		}
		return TProvince;
	}

	public JTextField getTCanton() {
		if (TCanton == null) {
			TCanton = new JTextField();
			TCanton.setBounds(106, 129, 86, 20);
			TCanton.setColumns(10);
		}
		return TCanton;
	}
	public JLabel getStreet() {
		if (Street == null) {
			Street = new JLabel("Calle");
			Street.setForeground(new Color(255, 255, 255));
			Street.setOpaque(true);
			Street.setBackground(Color.BLACK);
			Street.setFont(new Font("Tahoma", Font.PLAIN, 13));
			Street.setBounds(202, 109, 86, 14);
		}
		return Street;
	}
	public JTextField getTstreet() {
		if (Tstreet == null) {
			Tstreet = new JTextField();
			Tstreet.setBounds(202, 129, 86, 20);
			Tstreet.setColumns(10);
		}
		return Tstreet;
	}
	public JLabel getUser() {
		if (User == null) {
			User = new JLabel("Usuario:");
			User.setForeground(new Color(255, 255, 255));
			User.setFont(new Font("Tahoma", Font.PLAIN, 13));
			User.setBounds(301, 108, 71, 14);
		}
		return User;
	}
	public JTextField getTuser() {
		if (Tuser == null) {
			Tuser = new JTextField();
			Tuser.setBounds(402, 106, 86, 20);
			Tuser.setColumns(10);
		}
		return Tuser;
	}
	public JLabel getPass() {
		if (Pass == null) {
			Pass = new JLabel("Contraseña: ");
			Pass.setForeground(new Color(255, 255, 255));
			Pass.setFont(new Font("Tahoma", Font.PLAIN, 13));
			Pass.setBounds(301, 153, 86, 14);
		}
		return Pass;
	}
	public JPasswordField getTPass() {
		if (TPass == null) {
			TPass = new JPasswordField();
			TPass.setBounds(402, 151, 86, 20);
		}
		return TPass;
	}
	public JLabel getConfirmPasss() {
		if (ConfirmPasss == null) {
			ConfirmPasss = new JLabel("Confir Cont:");
			ConfirmPasss.setForeground(new Color(255, 255, 255));
			ConfirmPasss.setBackground(new Color(255, 255, 255));
			ConfirmPasss.setFont(new Font("Tahoma", Font.PLAIN, 13));
			ConfirmPasss.setBounds(301, 194, 71, 14);
		}
		return ConfirmPasss;
	}
	
	public JPasswordField getConfirm() {
		if (Confirm == null) {
			Confirm = new JPasswordField();
			Confirm.setBounds(402, 192, 86, 20);
		}
		return Confirm;
	}
	public JButton getRegist() {
		if (Regist == null) {
			Regist = new JButton("Registrar");
			Regist.setBounds(156, 172, 89, 23);
		}
		return Regist;
	}
	
	
	public boolean Validation() {
		
		boolean validar=false;
		String pass= new String(getTPass().getPassword());
		String Confirm=new String(getConfirm().getPassword());
		
		if(pass.equals(Confirm)) {
			
			validar=true;
			
		}
		return validar;
	}
	
	public void clean() {
		
		TNam.setText("");
		Tid.setText("");
		TAge.setText("");
		TCanton.setText("");
		Tstreet.setText("");
		comboBox.setSelectedIndex(0);
		TProvince.setSelectedIndex(0);
		Tuser.setText("");
		TPass.setText("");
		Confirm.setText("");
		
		
	}
	public void cls() {
		
		Tuser.setText("");
		TPass.setText("");
		Confirm.setText("");
	}
	
	
}
