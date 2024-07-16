package view;

import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import java.awt.Dimension;
import javax.swing.JPasswordField;



public class InitialPanel extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
    private int x = 0;
    private Timer timer;
    int xs[];
    int ys[];
    private JPasswordField codeForm;
    
    public void reRenderForm() {
    	
    }
	
	public InitialPanel() {
		setBackground(new Color(255, 255, 255));
		setBounds(0, 0, 600, 600);
		
		timer = new Timer(25, this); // Configura o timer para chamar actionPerformed a cada 30 milissegundos
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBounds(147, 124, 305, 352);
		add(panel);
		
		JLabel formLabel = new JLabel(" Wellcome, type you acess code to get in!");
		formLabel.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 14));
		formLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		codeForm = new JPasswordField();
		codeForm.setHorizontalAlignment(SwingConstants.CENTER);
		codeForm.setMinimumSize(new Dimension(170, 30));
		codeForm.setMaximumSize(new Dimension(170, 30));
		codeForm.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		codeForm.setBackground(Color.LIGHT_GRAY);
		codeForm.setColumns(10);
		
		JButton buttonForm = new JButton("Enter");
		buttonForm.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 16));
		buttonForm.setForeground(Color.WHITE);
		buttonForm.setBackground(new Color(58, 126, 126));
		buttonForm.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(109, 188, 188)));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(102)
							.addComponent(buttonForm, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(76)
							.addComponent(codeForm, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(formLabel, GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(49)
					.addComponent(formLabel)
					.addGap(63)
					.addComponent(codeForm, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(76)
					.addComponent(buttonForm, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(78))
		);
		panel.setLayout(gl_panel);
        timer.start(); // Inicia o timer
        
        xs = new int[]{0, getWidth(), getWidth(), 0};
        ys = new int[]{0, 0, 25,60};
	}
	
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphic = (Graphics2D) g;

        // Define a cor e desenha um círculo que se move horizontalmente
        graphic.setColor(new Color(0.23f, 0.49f, 0.49f, 0.5f));
        ys[2] = 25;
        ys[3] = 60;
        graphic.fillPolygon(xs, ys, 4);
        graphic.setColor(new Color(0.23f, 0.49f, 0.49f, 0.4f));
        ys[2] = 50;
        ys[3] = 120;
        graphic.fillPolygon(xs, ys, 4);
        graphic.setColor(new Color(0.23f, 0.49f, 0.49f, 0.2f));
        ys[2] = 75;
        ys[3] = 180;
        graphic.fillPolygon(xs, ys, 4);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        xs[1] = getWidth();
        xs[2] = getWidth();
    	x += 5; // Move o círculo 5 pixels para a direita
        if (x > getWidth()) {
            x = -50; // Reseta a posição quando o círculo sai da tela
        }
        repaint(); // Solicita uma repintura do painel
    }
}
