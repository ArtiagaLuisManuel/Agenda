import javax.swing.*;
import java.awt.event.*;

class Modificar extends JFrame implements ActionListener{ //Aquí se modifica a alguien dentro de la agenda.
      
   JLabel indicaciones, etiquetaNombre, etiquetaCorreo, etiquetaTelefono, etiquetaCumpleaños;
   JTextField nombre, correo, telefono, cumple;
   JPanel panel;
   JButton salir;
   public ManejoDatos mpA = new ManejoDatos();
   public String modifNom, modifCor, modifCum, modifTel;
   
   public Modificar(){
      
      setSize(450,395);
      setTitle("Modificar");
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      indicaciones = new JLabel("Haga las modificaciones que desee.");
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
      nombre.setEditable(true);
      correo = new JTextField(50);
      //correo.setText(mpA.retorno2());
      correo.setBounds(175, 110, 175, 50);
      correo.setEditable(true);
      telefono = new JTextField(10);
      //telefono.setText(mpA.retorno3());
      telefono.setBounds(175, 170, 175, 50);
      telefono.setEditable(true);
      cumple = new JTextField(50);
      //cumple.setText(mpA.retorno4());
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
         modifNom = nombre.getText();
         modifCor = correo.getText();
         modifCum = cumple.getText();
         modifTel = telefono.getText();
         setVisible(false);
         mpA.modNom(modifNom);
         mpA.modCor(modifCor);
         mpA.modCum(modifCum);
         mpA.modTel(modifTel);
         Menu menu = new Menu();
      }
   }
}//modificar
