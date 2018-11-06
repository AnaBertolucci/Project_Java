package Project;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Cadastro extends JFrame {
	JLabel lblNome = new JLabel("Nome:");
	JTextField txtNome = new JTextField();
    JButton btnCadastrar = new JButton("Cadastrar");
    
	public Cadastro() {
		super("Cadastro de Cliente");

		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		lblNome.setBounds(20, 20, 100, 30);
		paine.add(lblNome);

		txtNome.setBounds(140, 20, 100, 30);
		paine.add(txtNome);
		
		btnCadastrar.setBounds(70, 50, 130, 40 );
		btnCadastrar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//copiado
				System.out.println("Nome:" + txtNome.getText());
				}
		});
		paine.add(btnCadastrar);

		this.setVisible(true);
		this.setSize(400, 450);
		
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String args[]) {
		Cadastro cad = new Cadastro();

	}

}
