package presentation;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class GuiSC extends JFrame {

	private JPanel contentPane;
	private JScrollPane SCroll;
	private JLabel SEA;
	private JTextField TSearch;
	private JButton BSearch;
	private JTextArea JTA;
	private JButton retu;
	private JRadioButton CA;
	private JRadioButton CP;
	private JButton CCC;

	
	public GuiSC() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 459, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setJTAComment();
        setScroll(JTA);
		setContentPane(contentPane);
		
		
		
		contentPane.setLayout(null);
		contentPane.add(getSCroll());
		contentPane.add(getSEA());
		contentPane.add(getTSearch());
		contentPane.add(getBSearch());
		contentPane.add(getRetu());
		contentPane.add(getCA());
		contentPane.add(getCP());
		contentPane.add(getCCC());
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void setScroll(JTextArea s) {
		SCroll = new JScrollPane(s);
		SCroll.setBounds(28, 41, 222, 164);
		
	}
	
	
	public JScrollPane getSCroll() {
		
		return SCroll;
	}
	
	
	public JLabel getSEA() {
		if (SEA == null) {
			SEA = new JLabel("Buscar");
			SEA.setBackground(new Color(0, 0, 0));
			SEA.setFont(new Font("Tahoma", Font.PLAIN, 13));
			SEA.setOpaque(true);
			SEA.setForeground(new Color(255, 255, 255));
			SEA.setBounds(271, 26, 86, 14);
		}
		return SEA;
	}
	public JTextField getTSearch() {
		if (TSearch == null) {
			TSearch = new JTextField();
			TSearch.setBounds(271, 44, 86, 20);
			TSearch.setColumns(10);
		}
		return TSearch;
	}
	public JButton getBSearch() {
		if (BSearch == null) {
			BSearch = new JButton("Buscar");
			BSearch.setBounds(271, 75, 76, 23);
		}
		return BSearch;
	}
	
	public void setJTAComment() {
		JTA= new JTextArea();
		JTA.setLineWrap(true);
		
	}
	
	public JTextArea getJTAComment() {
		return this.JTA;
	}
	
	
	public JButton getRetu() {
		if (retu == null) {
			retu = new JButton("Volver");
			retu.setBounds(271, 182, 89, 23);
		}
		return retu;
	}
	public JRadioButton getCA() {
		if (CA == null) {
			CA = new JRadioButton("Clientes Activos");
			CA.setBackground(new Color(128, 128, 255));
			CA.setBounds(37, 11, 109, 23);
		}
		return CA;
	}
	public JRadioButton getCP() {
		if (CP == null) {
			CP = new JRadioButton("Citas Pendientes");
			CP.setBackground(new Color(128, 128, 255));
			CP.setBounds(156, 11, 109, 23);
		}
		return CP;
	}
	
	public JButton getCCC() {
		if (CCC == null) {
			CCC = new JButton("Limpiar");
			CCC.setBounds(355, 75, 79, 23);
		}
		return CCC;
	}
	
	public void Clean() {
		
		TSearch.setText("");
		CP.setSelected(false);
		CA.setSelected(false);
		
	}
	
	
	public void Cles() {
		
		JTA.setText("");
		
	}
	
}
