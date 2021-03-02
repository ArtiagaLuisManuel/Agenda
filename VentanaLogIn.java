import javax.swing.*;
import java.awt.event.*;

class VentanaLogIn extends JFrame implements ActionListener{
   
   JPanel panel;
   JLabel etiquetaUsuario, etiquetaContrase�a;
   JTextField usuario;
   JPasswordField contrase�a;
   JButton ingresar;
         
   public VentanaLogIn(){ //Muestra la ventana para ingresar, los usuarios disponibles y sus respectivas contrase�as son: C�sar - 1234, Luisma - 5678.
      
      setSize(300,300);
      setTitle("Log In");
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      etiquetaUsuario = new JLabel("Usuario: ");
      etiquetaUsuario.setBounds(25, 50, 300, 50);
      etiquetaContrase�a = new JLabel("Contrase�a: ");
      etiquetaContrase�a.setBounds(25, 110, 300, 50);
      usuario = new JTextField(25);
      usuario.setText("");
      usuario.setBounds(100, 50, 175, 50);
      usuario.setEditable(true);
      contrase�a = new JPasswordField(25);
      contrase�a.setText("");
      contrase�a.setBounds(100, 110, 175, 50);
      contrase�a.setEditable(true);
      panel = new JPanel();
      panel.setLayout(null);
      
      ingresar = new JButton("Ingresar");
      ingresar.setBounds(105, 175, 90, 50);
      
      panel.add(etiquetaUsuario);
      panel.add(etiquetaContrase�a);
      panel.add(usuario);
      panel.add(contrase�a);
      panel.add(ingresar);
      
      ingresar.addActionListener(this);
      
      setContentPane(panel);
      setVisible(true);
      setResizable(false);
   }
   
   public void actionPerformed(ActionEvent e){
      
      String ususarioS, contrase�aS;
      boolean flagU = true, flagC = true;
         
      if(e.getSource() == ingresar){
         contrase�aS = new String(contrase�a.getPassword());
         if(usuario.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese un usuario.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            usuario.requestFocus();
            flagU = false;
         }
         if(contrase�aS.isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese la contrase�a.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            contrase�a.requestFocus();
            flagC = false;
         }
         if(flagU == true && flagC == true){
            if(usuario.getText().equals("C�sar") && contrase�aS.equals("1234") || usuario.getText().equals("Luisma") && contrase�aS.equals("5678")){
               setVisible(false); 
               Menu menu = new Menu();
            } else {
               JOptionPane.showMessageDialog(null, "Usuario o contrase�a incorrectos.", "Warning", JOptionPane.WARNING_MESSAGE);
               usuario.setText(null);
               contrase�a.setText(null);
               usuario.requestFocus();
               contrase�a.requestFocus();
            }
         }
      }
   }
}//VentanaLogIn
