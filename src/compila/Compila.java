
package compila;

import java.io.*;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;


public class Compila {

    
    public static void main(String[] args) throws NumberFormatException,IOException{
		
		
		//busca el archivo creado
		File fe=new File("datos.txt");
		
		
		String linea, comparacion1, comparacion2, cadena;
		String cadena1[]=new String [13];
                String cadena2[]=new String [4];
                
		BufferedReader entrada;
		BufferedWriter salida;
		
		//instancia el archivo de ingreso
		entrada =new BufferedReader(new FileReader(fe));
		
                
	int cont=0;
        String sa1="", sa2="";
        
        
        
	//cadena del archivo	
	try
	{
		while(entrada.ready())
		{
			linea=entrada.readLine();
			StringTokenizer tokens=new StringTokenizer(linea," ");
			
			while(tokens.hasMoreTokens()!=false)
			{
                            comparacion1=tokens.nextToken();
                            JOptionPane.showMessageDialog(null, "LA CADENA ES\n "+ comparacion1);
                            cadena1[cont]=comparacion1;
                            cont++;
                            
			}
			
		}
	}
    	catch(IOError e)
	{
        	e.printStackTrace();
	}
	entrada.close();
	
        for(int i=0; i<cadena1.length;i++)
        {
            sa1+=cadena1[i]+"\n";
        }
	JOptionPane.showMessageDialog(null, "LA CADENA ES DEL VECTOR DE ARCHIVO ES: \n"+ sa1);
        
        //para cadena de teclado
        cont=0;
        
        cadena=JOptionPane.showInputDialog("Ingrese la cadena");
        try
	{
            StringTokenizer tokens=new StringTokenizer(cadena," ");
            while(tokens.hasMoreTokens()!=false)
            {
                comparacion2=tokens.nextToken();
                JOptionPane.showMessageDialog(null, "LA CADENA ES\n "+ comparacion2);
                cadena2[cont]=comparacion2;
                cont++;
            }
	}
    	catch(IOError e)
	{
        	e.printStackTrace();
	}
        
        for(int i=0; i<cadena2.length;i++)
        {
            sa2+=cadena2[i]+"\n";
        }
	JOptionPane.showMessageDialog(null, "LA CADENA DEL VECTOR 2 ES: \n"+ sa2);
        int aux=0;
        for(int j=0;j<cadena2.length;j++)
        {
            
            if(cadena2[j].equals(cadena1[j]))
            {
               aux++;
            }
              
        }
        if(aux>2)
        {
           JOptionPane.showMessageDialog(null, "la cadena es correcta");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "la cadena es incorrecta");
        }
        
    } 
}
