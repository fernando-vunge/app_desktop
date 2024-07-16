package view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JMenu;

public class App extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel rootPane;
	private JMenuBar menuBar;
	private JPanel cardPanel;
	private InitialPanel panel; 

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				App frame = new App();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}

		});
	}

	/**
	 * Create the frame.
	 */
	private void init() {
		rootPane = new JPanel();
		menuBar = new JMenuBar();
		cardPanel = new JPanel(new CardLayout());
		panel = new InitialPanel();
	}
	
	@SuppressWarnings("unused")
	private void initMenus() {
		//TODO
	}
	
	public App() {
		setBackground(new Color(51, 102, 102));
		
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				menuBar.setBounds(0, 0, getWidth(), 35);
				cardPanel.setBounds(0, 36, getWidth(), getHeight() - menuBar.getHeight());
				panel.setBounds(0, 0, cardPanel.getWidth(), cardPanel.getHeight());
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		setTitle("devoo::java::AppDesktop");
		
		init();
		
		
		rootPane.setLayout(null);
		
		menuBar.setBounds(0, 0, getWidth(), 35);
		
		cardPanel.setLayout(null);
		cardPanel.setBounds(0, 35, getWidth(), getHeight() - menuBar.getHeight());
		cardPanel.add(panel);
		
		panel.setBounds(0, 0, 584, 525);
		
		setContentPane(rootPane);
		
		rootPane.add(menuBar);
		
		JMenu menuFile = new JMenu("File");
		JMenu menuEdit = new JMenu("Edit");
		menuBar.add(menuFile);
		menuBar.add(menuEdit);
		
		rootPane.add(cardPanel);
		
		
	}
}
