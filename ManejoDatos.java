import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JOptionPane;


public class ManejoDatos{

   static ArrayList<Datos> ArrDat = new ArrayList<Datos>();
   public static int x, z=100;
   public int aux;
   private Datos objDatos;
   public static boolean info=false;
   
  public ManejoDatos(){
  }
   
  public void agregar (String nom, String correo, String tel, String cumple ){
      objDatos = new Datos();
      objDatos.setCorreo(correo);
      objDatos.setTelefono(tel);
      objDatos.setNombre(nom);
      objDatos.setCumple(cumple);
      ArrDat.add(objDatos);      //Agrega el objeto
  }
  
  public static void main(String args[]){
  
  }
   
  public static String[] array = ArrDat.toArray(new String[z]);
  public void mostrar(){
     Iterator<Datos> itrDatos = ArrDat.iterator();
     int c=0;
     while(itrDatos.hasNext()){
         Datos datos = itrDatos.next();
         //System.out.println (datos.getNombre()+ " " + datos.getTelefono() + " " + datos.getCorreo() + " "+ datos.getCumple());
         array[c]=datos.getNombre();
         c++;
         array[c]=datos.getTelefono();
         c++;   
         array[c]=datos.getCorreo();
         c++;  
         array[c]=datos.getCumple();
         c++;
        //System.out.println (array[0]+ " "+array[4]+ " "+array [8]+ " "+c);
     }
  }
  public int buscarNombres(String un){
      info=false;
      
      for(x=0; x<=80; x++){ 
       // System.out.println (" inicin "+ un +" segunda "+ array[x]); 
         if(un.equals(array[x])){ 
            info=true;
            setAux(x);
           // System.out.println (aux+" posicion"); 
            x=80;
         }   
      }
      if(info==false){
         JOptionPane.showMessageDialog(null, "No existe este nombre", "Redirigiendo al primer contacto", JOptionPane.WARNING_MESSAGE);  
      }
      return aux;
  }//buscar nombre
  
  public void  setAux(int aux){
         this.aux=aux;
  }
  
  public int getAux(){
   return aux;
  }

  
  public String retorno1(int aux){
       //System.out.println(array[aux]+" "+aux);
       return array[aux]; 
  }  
  public String retorno2(int aux){
       return array[aux+1];  
  }

  public String retorno3(int aux){
       return array[aux+2];  
  }
  
  public String retorno4(int aux){
       return array[aux+3];  
  }
  
  public void modNom(String modiNom){
        array[aux]=modiNom;
  }
  public void modCor(String modiCor){
        array[aux+1]=modiCor;
  }
  public void modTel(String modiTel){
        array[aux+2]=modiTel;
  }
   public void modCum(String modiCum){
        array[aux+3]=modiCum;
  }

   public void eliminacion(String eli){
      int control=0;
      for (int y=0; y<=80; y++){
         if(eli.equals(array[y])){
            control=1;
           // System.out.println ("igual "+array[y]);
         } 
         if(control==1){
                //        System.out.println (array[y]+"cambia a"+array[y+4]);
            array[y]=" ";
            array[y]=array[y+4];
         }
      }
   }
 
}//class