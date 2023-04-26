package business;

import java.awt.event.ActionEvent;
import data.FilesTxt;
import data.LogicFilesTxt;
import java.awt.event.ActionListener;
import presentation.GUI;
import domain.Computadora;

public class Controller implements ActionListener {
	
		
	private GUI gui;
	private Computadora comp;
	private LogicFilesTxt LfTxt;
	private FilesTxt fTxt;
	
	public Controller() {
		
		gui = new GUI();
		
		fTxt = new FilesTxt();
	
		LfTxt = new LogicFilesTxt(fTxt);
		
		initializerAction();
	}
	public void initializerAction() {
		
		gui.getBRegister().addActionListener(this); //Agrega el evento para el botón de registro de la interfaz gráfica de usuario
		gui.getBFilter().addActionListener(this);
	}	

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==gui.getBRegister()) {
			
			comp = new Computadora(gui.getTId().getText(),gui.getTBrand().getText(),
					gui.getTModel().getText(),Integer.parseInt(gui.getTPrice().getText()));
			fTxt.writeFile("Computadoras.txt", comp.toString());
			gui.cleanForm();
		}
		if(e.getSource()==gui.getBFilter()){
			
			LfTxt.ClasifyComputer("Computadoras.txt", Integer.parseInt(gui.getTFilter().getText()));
			gui.getTACheapComputers().setText(fTxt.readFile("Computadoras Baratas.txt"));
			gui.getTAExpensiveComputers().setText(fTxt.readFile("Computadoras Caras.txt"));;
			
		}
		
	}

}