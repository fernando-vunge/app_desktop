package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class App extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel rootPane;

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
	public App() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		setTitle("devoo::java::AppDesktop");
		rootPane = new InitialPanel(this.getWidth(),  this.getHeight());
		rootPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(rootPane);
		
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				((InitialPanel)rootPane).resizePanel(getBounds());
			}
		});
	}

}
