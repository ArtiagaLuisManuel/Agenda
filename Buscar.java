import javax.swing.*;
import java.awt.event.*;

class Buscar extends JFrame implements ActionListener{ //Aquí se busca a alguien dentro de la agenda.
      
   JLabel indicaciones, etiquetaNombre, etiquetaCorreo, etiquetaTelefono, etiquetaCumpleaños;
   JTextField nombre, correo, telefono, cumple;
   JPanel panel;
   JButton salir;
   
   public static ManejoDatos mpA = new ManejoDatos();
   
   public Buscar(){
      
      setSize(450,395);
      setTitle("Buscar");
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
          
      indicaciones = new JLabel(""); //Aquí si quieres puedes hacer que aparezca el nombre completo de la persona que se busque, si no pues quítalo jaja
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
      //nombre.setText(mpA.retorno1());
      nombre.setBounds(175, 50, 175, 50);
      nombre.setEditable(false);
      correo = new JTextField(50);
      //correo.setText(mpA.retorno2());
      correo.setBounds(175, 110, 175, 50);
      correo.setEditable(false);
      telefono = new JTextField(10);
      //telefono.setText(mpA.retorno3());
      telefono.setBounds(175, 170, 175, 50);
      telefono.setEditable(false);
      cumple = new JTextField(50);
      //cumple.setText(mpA.retorno4());
      cumple.setBounds(175, 230, 175, 50);
      cumple.setEditable(false);
      panel = new JPanel();
      panel.setLayout(null);
      
      salir = new JButton("Salir");
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
      setVisible(false);
      setResizable(false); 
   }
   
   public void mostrar(int aux){
      nombre.setText(mpA.retorno1(aux));
      correo.setText(mpA.retorno2(aux));
      telefono.setText(mpA.retorno3(aux));
      cumple.setText(mpA.retorno4(aux));
      setVisible(true);
   }
   
   public void actionPerformed(ActionEvent e){
      if(e.getSource() == salir){
         setVisible(false);
         Menu menu = new Menu();
      }
   }
}//buscar
