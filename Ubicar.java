import javax.swing.*;
import java.awt.event.*;

class Ubicar extends JFrame implements ActionListener{ //Esta clase la usamos como un método para buscar en la agenda a aquel que se desea buscar, modificar o eliminar.
   //
   ManejoDatos mpA = new ManejoDatos();
   
   Buscar busqueda = new Buscar();
   Modificar modificar = new Modificar();
   Eliminar eliminar = new Eliminar();
   public String ubica;
   
   JPanel panel;
   JLabel indicaciones, etiquetaNombre;
   JTextField ubicar;
   JButton buscar, salir;
   
   public boolean flagBuscar, flagModificar, flagEliminar;
   
   public Ubicar(){
      
      setSize(300, 200);
      setTitle("Ubicar");
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      panel = new JPanel();
      panel.setLayout(null);
      indicaciones = new JLabel("Ingrese el nombre de la persona a buscar.");
      indicaciones.setBounds(30, 5, 300, 50);
      etiquetaNombre = new JLabel("Nombre: ");
      etiquetaNombre.setBounds(25, 50, 300, 50);
      ubicar = new JTextField(50);
      ubicar.setBounds(80, 50, 190, 50);
      //ubica = ubicar.getText();
      
      
      buscar = new JButton("Buscar");
      buscar.setBounds(50, 110, 95, 50);
      salir = new JButton("Salir");
      salir.setBounds(155, 110, 95, 50);
      
      panel.add(indicaciones);
      panel.add(etiquetaNombre);
      panel.add(ubicar);
      panel.add(buscar);
      panel.add(salir);
      
      buscar.addActionListener(this);
      salir.addActionListener(this);
      
      setContentPane(panel);
      setVisible(true);
      setResizable(false);
      
      
   }
   
   public void setBuscar(boolean f){
      flagBuscar = f;
   }
   
   public void setModificar(boolean f){
      flagModificar = f;
   }
   
   public void setEliminar(boolean f){
      flagEliminar = f;
   }
   
   public void actionPerformed(ActionEvent e){
      if(e.getSource() == buscar){
         

         if(flagBuscar == true){
            ubica = ubicar.getText();
            setVisible(false);
            int hola = mpA.buscarNombres(ubica);
            busqueda.mostrar(hola);
            flagBuscar = false;
         } else if(flagModificar == true){
            ubica = ubicar.getText();
            setVisible(false);
            int hola = mpA.buscarNombres(ubica);
            modificar.mostrar(hola);;
            flagModificar = false;
         } else if(flagEliminar == true){
            ubica = ubicar.getText();
            setVisible(false);
            int hola = mpA.buscarNombres(ubica);
            eliminar.mostrar(hola);
            flagEliminar = false;
         }
      }
      
      if(e.getSource() == salir){
         setVisible(false);
         Menu menu = new Menu();
      }
   }
}//Ubicar
