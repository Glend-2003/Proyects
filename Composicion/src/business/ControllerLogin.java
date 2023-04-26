package business;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import data.BuscarTxt;
import presentation.GuiLogin;

public class ControllerLogin implements ActionListener {

	private GuiLogin GuiL;
	private BuscarTxt bbt;
	
	public ControllerLogin() {
		
		GuiL=new GuiLogin();
		bbt=new BuscarTxt();
		
		InitializerAction();
		
	}
	
	public void InitializerAction() {
		
		GuiL.getRegist().addActionListener(this);
		GuiL.getJoin().addActionListener(this);
		GuiL.getSolit().addActionListener(this);
	}
	 
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==GuiL.getRegist()) {
			
			new ControllerRegist();
			GuiL.dispose();
		}
		if(e.getSource()==GuiL.getJoin()) {
			Join();
		}
		if(e.getSource()==GuiL.getSolit()) {
			
			new ControllerAdmi();
			GuiL.dispose();
			
		}
		
		
	}

	 
	public void Join() {
		String User=GuiL.getTuser().getText();
		String n=new String(GuiL.getPasst().getPassword());
		boolean Validar=bbt.Segurity("ContraClient.txt", User, n);
		int Valu=bbt.Worked("ContraClient.txt", User, n);
		if(Validar==true && Valu==0) {
			JOptionPane.showMessageDialog(null, "Bienvenido "+User,"Inicio Completado",1);
			new ControllerClient(User);
			GuiL.dispose();
			
		}
		
		boolean work=bbt.Segurity("ContTrabajadores.txt", User, n);
		int Val=bbt.Worked("ContTrabajadores.txt", User, n);
		
		if(work==true && Val==2) {
			JOptionPane.showMessageDialog(null, "Bienvenido Desing."+User,"Inicio Completado",1);
			new ControllerWorked(User);
			GuiL.dispose();
			
			
		}
		
		
		
		
	}
	
	
	
}
