package business;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

import data.FileTxt;
import domain.date;
import presentation.GuiClient;

public class ControllerClient implements ActionListener {

	private GuiClient GuiC;
	private String nn;
	private  LocalDateTime hora;
	private FileTxt txt;
	private date fh;
	
	public ControllerClient(String a) {
		nn=a;
		GuiC= new GuiClient(nn);
		hora = LocalDateTime.now();
		txt=new FileTxt();
		fh=new date();
		
		InitializerAction();
	}
	
	public void InitializerAction() {
		
		GuiC.getAdg().addActionListener(this);
		GuiC.getReturn().addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
	 if(e.getSource()==GuiC.getReturn()) {
		 
		 new ControllerLogin();
		 GuiC.dispose();
		 
	 }
	 if(e.getSource()==GuiC.getAdg()) {
		 
		 addag();
		 
	 }
	 
	 
	 
	 
	}
	
	 
	
	public void addag() {
		
		int quest=JOptionPane.showConfirmDialog(null, "Seguro que quieres agendar la cita?","Comfirmar",JOptionPane.YES_NO_OPTION);
		
		if(quest==JOptionPane.YES_OPTION) {
		String horaFinal = hora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		String day=GuiC.getTday().getText();
		String Month=GuiC.getMT(null).getSelectedItem().toString();
		String Hours=GuiC.getHours(null).getSelectedItem().toString();
		
		fh=new date(day,Month,Hours,horaFinal);
		
		JOptionPane.showMessageDialog(null, "Cita Agendada para la fecha "+day+"/"+Month+"/"+Hours);
		txt.writeFile("Citas.txt", fh.ToString());
		GuiC.cls();
		}else
		{
			
		}
	}
	
	

}
