import javax.swing.*;
import java.awt.event.*;

class VentanaLogIn extends JFrame implements ActionListener{
   
   JPanel panel;
   JLabel etiquetaUsuario, etiquetaContraseña;
   JTextField usuario;
   JPasswordField contraseña;
   JButton ingresar;
         
   public VentanaLogIn(){ //Muestra la ventana para ingresar, los usuarios disponibles y sus respectivas contraseñas son: César - 1234, Luisma - 5678.
      
      setSize(300,300);
      setTitle("Log In");
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      etiquetaUsuario = new JLabel("Usuario: ");
      etiquetaUsuario.setBounds(25, 50, 300, 50);
      etiquetaContraseña = new JLabel("Contraseña: ");
      etiquetaContraseña.setBounds(25, 110, 300, 50);
      usuario = new JTextField(25);
      usuario.setText("");
      usuario.setBounds(100, 50, 175, 50);
      usuario.setEditable(true);
      contraseña = new JPasswordField(25);
      contraseña.setText("");
      contraseña.setBounds(100, 110, 175, 50);
      contraseña.setEditable(true);
      panel = new JPanel();
      panel.setLayout(null);
      
      ingresar = new JButton("Ingresar");
      ingresar.setBounds(105, 175, 90, 50);
      
      panel.add(etiquetaUsuario);
      panel.add(etiquetaContraseña);
      panel.add(usuario);
      panel.add(contraseña);
      panel.add(ingresar);
      
      ingresar.addActionListener(this);
      
      setContentPane(panel);
      setVisible(true);
      setResizable(false);
   }
   
   public void actionPerformed(ActionEvent e){
      
      String ususarioS, contraseñaS;
      boolean flagU = true, flagC = true;
         
      if(e.getSource() == ingresar){
         contraseñaS = new String(contraseña.getPassword());
         if(usuario.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese un usuario.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            usuario.requestFocus();
            flagU = false;
         }
         if(contraseñaS.isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese la contraseña.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            contraseña.requestFocus();
            flagC = false;
         }
         if(flagU == true && flagC == true){
            if(usuario.getText().equals("César") && contraseñaS.equals("1234") || usuario.getText().equals("Luisma") && contraseñaS.equals("5678")){
               setVisible(false); 
               Menu menu = new Menu();
            } else {
               JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.", "Warning", JOptionPane.WARNING_MESSAGE);
               usuario.setText(null);
               contraseña.setText(null);
               usuario.requestFocus();
               contraseña.requestFocus();
            }
         }
      }
   }
}//VentanaLogIn
