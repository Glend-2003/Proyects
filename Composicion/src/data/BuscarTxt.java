package data;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


import javax.swing.JOptionPane;

import domain.Location;
import domain.Person;
import domain.Segurity;

public class BuscarTxt{
	FileReader fr;
	File SearchFile;
	BufferedReader br; 
	File fileAddress;
	private Person ps;
	private Segurity seg;
	private Location loc;
	 
	
	public Person SPerson(String address, String Id) {
		
		   String line="";
		   String data[];
		   ps=new Person();
		   
		 
		   try {
		     fileAddress = new File(address);
		     fr = new FileReader (fileAddress);
		     br = new BufferedReader(fr);
		     
		     while((line=br.readLine())!=null){   
		       data = line.split("-");
		       
		       
		       if( data[1].equals(Id)) {
		    	   
		    	   loc=new Location(data[4],data[5],data[6]);
		    	   seg=new Segurity(data[7],data[8],Integer.parseInt(data[9]));
		    	  ps=new Person(data[0],data[1],Integer.parseInt(data[2]),data[3],loc,seg);
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
		   return ps;
	}

	
	
	
	
	
	
public boolean Segurity(String address, String uss,String Pass) {
	
	   String line="";
	   String data[];
	   
	  boolean user=false;
	   try {
	     fileAddress = new File(address);
	     fr = new FileReader (fileAddress);
	     br = new BufferedReader(fr);
	     while((line=br.readLine())!=null){   
	       data = line.split("-");
	       
	       
	       if(data[0].equals(uss)&& data[1].equals(Pass)) {
	    	  user=true;
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
	   return user;
}

public int Worked(String address, String uss,String Pass) {
	
	   String line="";
	   String data[];
	   
	  int user=0;
	   try {
	     fileAddress = new File(address);
	     fr = new FileReader (fileAddress);
	     br = new BufferedReader(fr);
	     while((line=br.readLine())!=null){   
	       data = line.split("-");
	       
	       
	       if(data[0].equals(uss)&& data[1].equals(Pass)&&data[2].equals("2")) {
	    	  user=2;
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
	   return user;
}



}
