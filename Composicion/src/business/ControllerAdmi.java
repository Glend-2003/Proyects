package business;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import data.FileTxt;
import domain.Location;
import domain.Person;
import domain.Segurity;
import presentation.GuiAdmi;

public class ControllerAdmi implements ActionListener {

	private GuiAdmi GuiA;
	private Segurity seg;
	private Location Loc;
	private Person Ps;
	private FileTxt txt;
	
	public  ControllerAdmi() {
		
		GuiA=new GuiAdmi();
		seg= new Segurity();
		Loc=new Location();
		Ps= new Person();
		txt= new FileTxt();
		
		InitializerAction();
	}
	
	public void InitializerAction() {
		GuiA.getSenn().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==GuiA.getSenn()) {
			Join();
			
			
		}
		
		
	}
	
	 
	public void Join() {
		String User=GuiA.getTUser().getText();	
		String Password=GuiA.PassWork();
		JOptionPane.showMessageDialog(null, "La Solicitud ha sido enviada con exito, Bienvenido a Master Computer "+User);
		seg=new Segurity(User,Password,2);
		txt.writeFile("ContTrabajadores.txt", seg.ToString());
		JOptionPane.showMessageDialog(null, "Hola Usuario: "+User+", la solicitud ha sido aceptada, su contraseña es: "+Password+", favor confirmar que todo este en orden.");
		Loc= new Location(GuiA.getTpro(null).getSelectedItem().toString(),GuiA.getTCanton().getText(),GuiA.getTcalle().getText());
		Ps= new Person(GuiA.getTNames().getText(),GuiA.getTId().getText(),Integer.parseInt(GuiA.getTage().getText()),GuiA.getComboBox(null).getSelectedItem().toString(),Loc,seg);
		txt.writeFile("Trabajadores.txt", Ps.ToString());
		
		new ControllerLogin();
		GuiA.dispose();
		
		
		
		
		
	}
	
	
	
	
	

}
