import javax.swing.*;
import java.awt.event.*;

class Alta extends JFrame implements ActionListener{ //Para dar de alta.
   
   JLabel indicaciones, etiquetaNombre, etiquetaCorreo, etiquetaTelefono, etiquetaCumpleaños;
   JTextField nombre, correo, telefono, cumple;
   JPanel panel;
   JButton salir;
   ManejoDatos mpA = new ManejoDatos();
   
   Datos dat [] = new Datos[20];
 
   public Alta(){
      
      setSize(450,395);
      setTitle("Dar de alta");
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      indicaciones = new JLabel("Ingrese los siguientes datos.");
      indicaciones.setBounds(135, 5, 300, 50);
      etiquetaNombre = new JLabel("Nombre: ");
      etiquetaNombre.setBounds(25, 50, 300, 50);
      etiquetaCorreo = new JLabel("Email: ");
      etiquetaCorreo.setBounds(25, 110, 300, 50);
      etiquetaTelefono = new JLabel("Numero de telefono: ");
      etiquetaTelefono.setBounds(25, 170, 300, 50);
      etiquetaCumpleaños = new JLabel("Fecha de cumpleaños: ");
      etiquetaCumpleaños.setBounds(25, 230, 300, 50);
      nombre = new JTextField(50);
      nombre.setText("");
      nombre.setBounds(175, 50, 175, 50);
      nombre.setEditable(true);
      correo = new JTextField(50);
      correo.setText("");
      correo.setBounds(175, 110, 175, 50);
      correo.setEditable(true);
      telefono = new JTextField(10);
      telefono.setText("");
      telefono.setBounds(175, 170, 175, 50);
      telefono.setEditable(true);
      cumple = new JTextField(50);
      cumple.setText("");
      cumple.setBounds(175, 230, 175, 50);
      cumple.setEditable(true);
      panel = new JPanel();
      panel.setLayout(null);
      
      salir = new JButton("Guardar y salir");
      salir.setBounds(105, 295, 240, 50);
      
      panel.add(indicaciones);
      panel.add(etiquetaNombre);
      panel.add(etiquetaCorreo);
      panel.add(etiquetaTelefono);
      panel.add(etiquetaCumpleaños);
      panel.add(nombre);
      panel.add(correo);
      panel.add(telefono);
      panel.add(cumple);
      panel.add(salir);
      
      salir.addActionListener(this);
      
      setContentPane(panel);
      setVisible(true);
      setResizable(false); 
      
   }
   
   public void actionPerformed(ActionEvent e){
      if(e.getSource() == salir){      
          if ((nombre.getText()==null) || (nombre.getText().isEmpty())){
             JOptionPane.showMessageDialog(null, "Ingresa un nombre","AVISO", JOptionPane.INFORMATION_MESSAGE);
             nombre.requestFocus();
          }
          else
             if((telefono.getText()==null) || (telefono.getText().isEmpty())){
                JOptionPane.showMessageDialog(null, "Ingresa un numero telefonico","AVISO", JOptionPane.INFORMATION_MESSAGE);
                telefono.requestFocus();
             }else{
                  mpA.agregar(nombre.getText(), correo.getText(), telefono.getText(), cumple.getText());
                  setVisible(false);
                  mpA.mostrar();
                  Menu menu = new Menu();
             }        
      }
   }
}//Alta
