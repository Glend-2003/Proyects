package data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import domain.Computadora;

public class LogicFilesTxt {
	FileReader fr;
	File SearchFile;
	BufferedReader br;
	File fileAddress;
	private FilesTxt fTxt;
	
	public LogicFilesTxt(FilesTxt fTxt) {
		
		this.fTxt = fTxt;
		
	}
	public Computadora ClasifyComputer(String address, int priceForm) {
		
		   String line="";
		   String data[];
		   Computadora comp = new Computadora();
		   try {
		     fileAddress = new File(address);
		     fr = new FileReader (fileAddress);
		     br = new BufferedReader(fr);
		     while((line=br.readLine())!=null){   
		       
		       data = line.split("-");
		       if(Integer.parseInt(data[3])<=priceForm) {
		    	   comp = new Computadora (data[0],data[1],data[2],Integer.parseInt(data[3]));
		    	   
		    	   fTxt.writeFile("Computadoras Baratas.txt", comp.toString());
		    	   line=null;
		    	   
		       }else {
		    	   comp = new Computadora (data[0],data[1],data[2],Integer.parseInt(data[3]));
		    	   
		    	   fTxt.writeFile("Computadoras Caras.txt", comp.toString());
		    	   line=null;
		       }
	
		     }
		   }
		   catch(Exception e){
		     e.printStackTrace();
		   }finally{
		     try{                    
		       if(fr != null ){   
		         fr.close();     
		       }                  
		     }catch (Exception e2){ 
		       e2.printStackTrace();
		     }
		   }
		   return comp;
	}
}
