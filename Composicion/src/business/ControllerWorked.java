package business;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import presentation.GuiWorked;

public class ControllerWorked implements ActionListener {

	private GuiWorked GuiW;
	private String a;
	public ControllerWorked(String s) {
		a=s;
		GuiW= new GuiWorked(a);
		InitializerAction();
	}
	
	public void InitializerAction() {
		
		GuiW.getExit().addActionListener(this);
		GuiW.getMIW().addActionListener(this);
		GuiW.getMaintenace().addActionListener(this);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==GuiW.getMIW()) {
			
			new ControllerSC(this.a);
			GuiW.dispose();
			
		}
		if(e.getSource()==GuiW.getMaintenace()) {
			
			JOptionPane.showMessageDialog(null, "La Pagina se encuentra en mantenimiento","Mantenimiento en curso",1 );
			
		}
		
		
		if(e.getSource()==GuiW.getExit()) {
			
			new ControllerLogin();
			GuiW.dispose();
			
		}
		
	}

}
