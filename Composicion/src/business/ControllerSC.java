package business;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import data.BuscarTxt;
import data.FileTxt;
import domain.Person;
import presentation.GuiSC;

public class ControllerSC implements ActionListener{

	private GuiSC GuiSc;
	private String a;
	private FileTxt txt;
	private BuscarTxt bbt;
	private Person ps;
	
	
	public ControllerSC(String h) {
		this.a=h;
		GuiSc=new GuiSC();
		txt=new FileTxt();
		bbt=new BuscarTxt();
		ps= new Person();
		InitializerAction();
	}
	
	public void InitializerAction() {
		GuiSc.getBSearch().addActionListener(this);
		GuiSc.getRetu().addActionListener(this);
		GuiSc.getCCC().addActionListener(this);
	}
	
	
	public void actionPerformed(ActionEvent e) {
	
		
		if(e.getSource()==GuiSc.getRetu()) {
			
			new ControllerWorked(a);
			GuiSc.dispose();
			
			
		}
		if(e.getSource()==GuiSc.getBSearch()) {
			
			 selected();
		}
		if(e.getSource()==GuiSc.getCCC()) {
			GuiSc.Cles();
			
		}
		
		
	}
	
	
	public void selected() {
		
		if(GuiSc.getCA().isSelected()) {
			
			GuiSc.getJTAComment().setText(txt.readFile("Client.txt"));
			GuiSc.Clean();
		}else
			if(GuiSc.getCP().isSelected()) {
				GuiSc.getJTAComment().setText(txt.readFile("Citas.txt"));
				
				GuiSc.Clean();
				
			}else {
				
				String Search=GuiSc.getTSearch().getText();
				ps=bbt.SPerson("Client.txt", Search);
				GuiSc.getJTAComment().setText(ps.ToStringSecond());
				
				GuiSc.Clean();
				
				
			}
		
		
		
	}
	
	
	

}
