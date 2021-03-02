

import javax.swing.*;
import java.awt.event.*;

public class Agenda{
   public static void main(String args[]){
      VentanaLogIn logIn = new VentanaLogIn();     
   }//main
}//agenda-class




class Menu extends JFrame implements ActionListener{ //Muestra el menú.
      
   JPanel panel;
   JLabel menu;
   JButton alta, buscar, modificar, borrar;
      
   public Menu(){
      
      setSize(300,450);
      setTitle("Menu");
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      panel = new JPanel();
      panel.setLayout(null);
      menu = new JLabel("- M E N U -");
      menu.setBounds(125, 50, 300, 50);
      
      alta = new JButton("Dar de alta.");
      alta.setBounds(50, 100, 200, 50);
      buscar = new JButton("Buscar.");
      buscar.setBounds(50, 160, 200, 50);
      modificar = new JButton("Modificar.");
      modificar.setBounds(50, 220, 200, 50);
      borrar = new JButton("Borrar.");
      borrar.setBounds(50, 280, 200, 50);
      
      panel.add(menu);
      panel.add(alta);
      panel.add(buscar);
      panel.add(modificar);
      panel.add(borrar);
      
      alta.addActionListener(this);
      buscar.addActionListener(this);
      modificar.addActionListener(this);
      borrar.addActionListener(this);
      
      setContentPane(panel);
      setVisible(true);
      setResizable(false);
   }
   
   public void actionPerformed(ActionEvent e){
      if(e.getSource() == alta){
         setVisible(false);
         Alta altaPanel = new Alta();
      }
      
      if(e.getSource() == buscar || e.getSource() == modificar || e.getSource() == borrar){
         setVisible(false);
         Ubicar ubicar = new Ubicar();
         if(e.getSource() == buscar)
            ubicar.setBuscar(true);
         else if(e.getSource() == modificar)
            ubicar.setModificar(true);
         else if(e.getSource() == borrar)
            ubicar.setEliminar(true);
      }
   }
}//Menu





