package presentation;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GUI extends JFrame{
	
	//labels
	private JLabel lId;
	private JLabel lBrand;
	private JLabel lModel;
	private JLabel lPrice;
	private JLabel lcheap;
	private JLabel lexp;
	
	//TextFields
	private JTextField tId;
	private JTextField tBrand;
	private JTextField tModel;
	private JTextField tPrice;
	private JTextField tFilter;
	
	//Campo de texto, para textos extensos
	private JTextArea taCheapComputers;
	private JTextArea taExpenseiveComputers;
	
	//Scroll para el area de texto
	private JScrollPane spCommentscheap;
	private JScrollPane spCommentsExpensive;
	
	//Botones
	private JButton bRegister;
	private JButton bFilter;
	
	//Constructor
	public GUI() {
		
		//Configurar las etiquetas
		setLId("ID");
		setLBrand("Marca");
		setLModel("Modelo");
		setLPrice("Precio");
		setLExpensive("Computadoras caras");
		setLCheap("Computadoras baratas");
		
		
		//Configurar los compos de texto
		setTId();
		setTBrand();
		setTModel();
		setTPrice();
		setTFilter();

		//Configurar area de texto
		setTACheapComputers();
		setTAExpensiveComputers();
		
		//Configurar scroll
		
		setSPComments1(taCheapComputers);
		setSPComments2(taExpenseiveComputers);
		
		
		//Configurar botones
		setBRegister("Registrar");
		setBFilter("Filtrar");
		
		
		//Agregar los componentes a la ventana(JFrame)
		add(lId);
		add(lBrand);
		add(lModel);
		add(lPrice);
		add(lcheap);
		add(lexp);
		
		add(tId);
		add(tBrand);
		add(tModel);
		add(tPrice);
		add(tFilter);
		
		add(spCommentscheap);
		add(spCommentsExpensive);
		
		add(bRegister);
		add(bFilter);
		
		initializer();
	
	}

	public void initializer() {
		setTitle("Control de Vehiculos");
		setLayout(null); 
		setSize(650,400); 
		setVisible(true); 
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Borrar de memoria luego de darle click a la X de la ventana 
		//getContentPane().setBackground(Color.darkGray);
	}
	//Setters and Getters of Labels
	public void setLCheap(String name) {
		lcheap = new JLabel();
		lcheap.setText(name);
		lcheap.setBounds(125, 20, 150, 20);
	}
	public JLabel getLCheap() {
		return this.lcheap;
	}
	
	public void setLExpensive(String name) {
		lexp = new JLabel();
		lexp.setText(name);
		lexp.setBounds(350, 20, 150, 20);
	}
	public void setLId(String name) {
		
		lId = new JLabel();
		lId.setText(name);
		lId.setBounds(10, 10, 100, 20);	
	}
	public JLabel getLId() {		
		return this.lId;
	}
	
	public void setLBrand(String name) {
		lBrand = new JLabel();
		lBrand.setText(name);
		lBrand.setBounds(10, 50, 100, 20);	
	}
	public JLabel getLBrand() {
		return this.lBrand;
	}
	
	public void setLModel(String name) {
		lModel = new JLabel();
		lModel.setText(name);
		lModel.setBounds(10, 90, 100, 20);
	}
	public JLabel getLModel(){
		return this.lModel;
	}
	
	public void setLPrice(String name) {
		lPrice = new JLabel();
		lPrice.setText(name);
		lPrice.setBounds(10,130,100,20);
	}
	public JLabel getLPrice() {
		return this.lPrice;
	}

	//Metodos para configurar los campos de texto
	
	private void setTFilter() {
		tFilter = new JTextField();
		tFilter.setBounds(140,335,100,20);
	}
	public JTextField getTFilter() {
		return this.tFilter;
	}
	
	public void setTId() {
		tId = new JTextField();
		tId.setBounds(10,30,100,20);
	}
	public JTextField getTId(){
		return this.tId;
	}
	
	public void setTBrand() {
		tBrand = new JTextField();
		tBrand.setBounds(10,70,100,20);
	}
	public JTextField getTBrand() {
		return this.tBrand;
	}
	
	public void setTModel() {
		tModel = new JTextField();
		tModel.setBounds(10,110,100,20);
	}
	public JTextField getTModel() {
		return this.tModel;
	}
	
	public void setTPrice() {
		tPrice = new JTextField();
		tPrice.setBounds(10,150,100,20);
	}
	public JTextField getTPrice() {
		return this.tPrice;
	}
	
	//Para configurar Areas de texto
	public void setTACheapComputers() {
		taCheapComputers = new JTextArea();
		taCheapComputers.setLineWrap(true);
	}
	public JTextArea getTACheapComputers() {
		return this.taCheapComputers;
	}
	
	public void setTAExpensiveComputers() {
		taExpenseiveComputers = new JTextArea();
		taExpenseiveComputers.setLineWrap(true);	
	}
	public JTextArea getTAExpensiveComputers() {
		return this.taExpenseiveComputers;
	}
	
	//configurar scrolls
	public void setSPComments1(JTextArea taComments) {
		spCommentscheap = new JScrollPane(taComments);
		spCommentscheap.setBounds(125,40,200,150);
	}
	public JScrollPane getSPComments1() {
		return this.spCommentscheap;
	}
	public void setSPComments2(JTextArea taComments) {
		spCommentsExpensive = new JScrollPane(taComments);
		spCommentsExpensive.setBounds(350,40,200,150);
	}
	public JScrollPane getSPComments2() {
		return this.spCommentsExpensive;
	}
	
	//Para configurar botones
	public void setBRegister(String name) {
			
		bRegister = new JButton();
		bRegister.setText(name); 
		bRegister.setBounds(490,310,100,20);
	}
	public JButton getBRegister() {
		return this.bRegister;
	}
	
	public void setBFilter(String name) {
		bFilter = new JButton();
		bFilter.setText(name);
		bFilter.setBounds(140,310,100,20);
	}
	public JButton getBFilter() {
		return this.bFilter;
	}
	
	public void cleanForm() {
		tId.setText("");
		tBrand.setText("");
		tModel.setText("");
		tPrice.setText("");	
	}
	
	//Metodo para mostrar un mensaje emergente en la pantalla con el mensaje especificado
	public void showMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
}