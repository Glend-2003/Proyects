package data;

//Librerias para Escritura y Lectura de Archivos
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileTxt {

//Crea el archivo y la ubicación a escribir
FileWriter file;
//Objeto que escribe en el archivo creado
PrintWriter pw;
//------------------------------------------------------------- 

//Es la ubicación con el archivo a leer
File fileAddress;
//Objeto que permite leer el archivo seleccionado
FileReader fr;
//Objeto que almacena el archivo leido
BufferedReader br;

public FileTxt(){}

public void writeFile(String address, String data)
{
try
{ 
  //Se crea el archivo y se la dan las propiedades de escritura (boolean)
  file = new FileWriter(address,true);
  //Se crea el objeto que tiene la propiedad de escribir en el archivo
  pw = new PrintWriter(file);
  //Imprime el Objeto (String) empleado al arhivo .txt       
  pw.println(data);
  
} catch (IOException ioe) { 
  
  JOptionPane.showMessageDialog(null, ioe.getMessage());
  ioe.printStackTrace();
} finally {
  try {
    file.close();
  } catch (Exception e2) {
    e2.printStackTrace();
  }
} 
}

public String readFile(String address){
	 
String information="";
String line="";
try {
 fileAddress = new File(address);
 
 fr = new FileReader (fileAddress);
 br = new BufferedReader(fr);
 
 
 while((line=br.readLine())!=null){   
   
  // System.out.println(line); 
   information+=line+"\n"; 
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
return information;
}
}

