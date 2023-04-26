package business;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import data.FileTxt;
import domain.Location;
import domain.Person;
import domain.Segurity;
import presentation.GuiRegist;

public class ControllerRegist implements ActionListener {

	private GuiRegist GuiR;
	private Segurity seg;
	private Person ps;
	private Location loc;
	private FileTxt txt;
	

	public ControllerRegist() {
		
		GuiR= new GuiRegist();
		seg= new Segurity();
		ps= new Person();
		loc= new Location();
		txt= new FileTxt();
		
		
		InitializerAction();
	}
	
	public void InitializerAction() {
		GuiR.getRegist().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==GuiR.getRegist()) {
			
			join();
			
		}
		
	}
	
	public void join() {
		
		String User=GuiR.getTuser().getText();
		String Password=new String(GuiR.getTPass().getPassword());
		boolean validar=GuiR.Validation();
		
		if(validar==true ) {
			
			seg= new Segurity(User,Password,0);
			
			txt.writeFile("ContraClient.txt", seg.ToString());
			
			loc=new Location(GuiR.getTProvince(null).getSelectedItem().toString(),GuiR.getTCanton().getText(),GuiR.getTstreet().getText());
			
			ps= new Person(GuiR.getTNam().getText(),GuiR.getTid().getText(),Integer.parseInt(GuiR.getTAge().getText()),GuiR.getComboBox(null).getSelectedItem().toString(),loc,seg);
			
			txt.writeFile("Client.txt", ps.ToString());
			
			new ControllerLogin();
			GuiR.dispose();
			
		}else {
			
			JOptionPane.showMessageDialog(null, "La contraseña no coincide, intente de nuevo","Ha ocurrido un error",1);
			GuiR.cls();
		}
		
		
	}
	
	
	
	
	
		}
		
		
		
	
	


