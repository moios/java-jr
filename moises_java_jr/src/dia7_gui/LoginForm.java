package dia7_gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginForm {
	
	public LoginForm() {
		JFrame ventana = new JFrame();
		ventana.setTitle("Formulario de Login");
		ventana.setSize(400, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setResizable(false);
		ventana.setLayout(new GridLayout(3,1));
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,2));
		JLabel usuario = new JLabel();
		usuario.setText("Usuario: ");
		JTextField tUsuario = new JTextField();
		JLabel contrasenha = new JLabel();
		contrasenha.setText("Contraseña:  ");
		JTextField tContrasenha = new JTextField();
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(3,1));
		JButton bIngresar = new JButton("Acceder");
		Color bg = new Color(237,14,67); 
		bIngresar.setBackground(bg);
		
		bIngresar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String user = tUsuario.getText();
				String pass = tContrasenha.getText();
				String mensaje;
				int tipo;
				if(user.equals("admin") && pass.equals("12345")) {
					mensaje = "Acceso correcto";
					tipo = 1;
				}else {
					mensaje = "Acceso incorrecto";
					tipo = 0;
				}
				JOptionPane.showMessageDialog(ventana, mensaje, "Mensaje", tipo);
			}
		});
		
		panel.add(usuario);
		panel.add(tUsuario);
		panel.add(contrasenha);
		panel.add(tContrasenha);
		panel2.add(bIngresar);
		ventana.add(panel);
		ventana.add(panel2);
		Container c = new Container();
		ventana.setVisible(true);
	}
	
	public static void main(String[] args) {
		new LoginForm();
	}
}
