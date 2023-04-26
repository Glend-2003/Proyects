package presentation;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;


@SuppressWarnings("serial")
public class GuiLogin extends JFrame {

	private JPanel Menu;
	private JLabel User;
	private JTextField Tuser;
	private JLabel Pass;
	private JPasswordField Passt;
	private JButton Join;
	private JLabel Por;
	private JButton Regist;
	private JLabel SOLEM;
	private JButton Solit;

	
	public GuiLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Menu = new JPanel();
		Menu.setBackground(new Color(128, 128, 255));
		Menu.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(Menu);
		Menu.setLayout(null);
		
		JLabel Titulo = new JLabel("Bienvenidos a Masters");
		Titulo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Titulo.setBounds(141, 10, 170, 14);
		Menu.add(Titulo);
		Menu.add(getUser());
		Menu.add(getTuser());
		Menu.add(getPass());
		Menu.add(getPasst());
		Menu.add(getJoin());
		Menu.add(getPor());
		Menu.add(getRegist());
		Menu.add(getSOLEM());
		Menu.add(getSolit());
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public JLabel getUser() {
		if (User == null) {
			User = new JLabel("Usuario:");
			User.setFont(new Font("Tahoma", Font.PLAIN, 13));
			User.setBounds(90, 65, 69, 14);
		}
		return User;
	}
	public JTextField getTuser() {
		if (Tuser == null) {
			Tuser = new JTextField();
			Tuser.setBounds(184, 63, 86, 20);
			Tuser.setColumns(10);
		}
		return Tuser;
	}
	public JLabel getPass() {
		if (Pass == null) {
			Pass = new JLabel("Contraseña:");
			Pass.setFont(new Font("Tahoma", Font.PLAIN, 13));
			Pass.setBounds(90, 126, 86, 14);
		}
		return Pass;
	}
	public JPasswordField getPasst() {
		if (Passt == null) {
			Passt = new JPasswordField();
			Passt.setBounds(184, 124, 86, 20);
		}
		return Passt;
	}
	public JButton getJoin() {
		if (Join == null) {
			Join = new JButton("Ingresar");
			Join.setBounds(147, 170, 89, 23);
		}
		return Join;
	}
	public JLabel getPor() {
		if (Por == null) {
			Por = new JLabel("No tienes cuenta?");
			Por.setBounds(289, 191, 119, 14);
		}
		return Por;
	}
	public JButton getRegist() {
		if (Regist == null) {
			Regist = new JButton("Registrar");
			Regist.setBounds(289, 214, 89, 23);
		}
		return Regist;
	}
	public JLabel getSOLEM() {
		if (SOLEM == null) {
			SOLEM = new JLabel("Solicitar Empleo");
			SOLEM.setFont(new Font("Tahoma", Font.PLAIN, 13));
			SOLEM.setForeground(new Color(0, 0, 0));
			SOLEM.setBounds(10, 191, 119, 14);
		}
		return SOLEM;
	}
	public JButton getSolit() {
		if (Solit == null) {
			Solit = new JButton("Solicitar");
			Solit.setBounds(10, 214, 89, 23);
		}
		return Solit;
	}
}
