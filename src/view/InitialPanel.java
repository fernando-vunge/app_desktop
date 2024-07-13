package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;


public class InitialPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	public  JPanel loginPanel;
	public JPanel asidePanel;
	private JTextField inpt_nome;
	private JPasswordField inpt_senha;

	/**
	 * Create the panel.
	 */
	
	public void resizePanel(Rectangle d) {
		setBounds(0, 0, d.width, d.height);
		loginPanel.setBounds(0, 0, 353, d.height);
		asidePanel.setBounds(loginPanel.getWidth() + 1, 0, this.getWidth() - loginPanel.getWidth(), d.height);
	}
	
	public InitialPanel(int width, int height) {
		setLayout(null);
		setBounds(0, 0, 600, 600);
		
		loginPanel = new JPanel();
		loginPanel.setBackground(Color.WHITE);
		loginPanel.setBounds(0, 0, 353, this.getHeight());
		
		asidePanel = new JPanel();
		asidePanel.setBackground(SystemColor.desktop);
		asidePanel.setBounds(loginPanel.getWidth() + 1, 0, this.getWidth() - loginPanel.getWidth(), this.getHeight());
		
		
		
		JLabel lbl_loginTitulo = new JLabel("Bem vindo administrador, insira seu dados para entrar");
		lbl_loginTitulo.setForeground(Color.DARK_GRAY);
		lbl_loginTitulo.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 12));
		lbl_loginTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lbl_loginNome = new JLabel("NOME");
		lbl_loginNome.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 10));
		lbl_loginNome.setHorizontalAlignment(SwingConstants.CENTER);
		
		inpt_nome = new JTextField();
		inpt_nome.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		inpt_nome.setToolTipText("Insira seu nome de adminisrtador");
		inpt_nome.setHorizontalAlignment(SwingConstants.CENTER);
		inpt_nome.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 14));
		inpt_nome.setColumns(10);
		
		JLabel lbl_loginSenha = new JLabel("SENHA");
		lbl_loginSenha.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_loginSenha.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 10));
		
		inpt_senha = new JPasswordField();
		inpt_senha.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		inpt_senha.setHorizontalAlignment(SwingConstants.CENTER);
		inpt_senha.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 14));
		inpt_senha.setEchoChar('#');
		
		JButton btn_login = new JButton("Login");
		btn_login.setBorder(null);
		btn_login.setBackground(SystemColor.desktop);
		btn_login.setForeground(Color.WHITE);
		
		JButton btnNewButton_1 = new JButton("New button");
		GroupLayout gl_loginPanel = new GroupLayout(loginPanel);
		gl_loginPanel.setHorizontalGroup(
			gl_loginPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_loginPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lbl_loginTitulo, GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE))
				.addGroup(gl_loginPanel.createSequentialGroup()
					.addGap(29)
					.addComponent(btnNewButton_1)
					.addContainerGap(226, Short.MAX_VALUE))
				.addGroup(gl_loginPanel.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_loginPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lbl_loginSenha, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbl_loginNome, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(inpt_senha, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
						.addComponent(inpt_nome, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn_login, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(167, Short.MAX_VALUE))
		);
		gl_loginPanel.setVerticalGroup(
			gl_loginPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_loginPanel.createSequentialGroup()
					.addGap(32)
					.addComponent(lbl_loginTitulo)
					.addGap(67)
					.addComponent(lbl_loginNome, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(inpt_nome, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(40)
					.addComponent(lbl_loginSenha, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(inpt_senha, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(82)
					.addComponent(btn_login, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(54)
					.addComponent(btnNewButton_1)
					.addGap(33))
		);
		loginPanel.setLayout(gl_loginPanel);
		
		add(loginPanel);
		add(asidePanel);

	}
}
