package Frame;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JButton;

public class JFrameUhr extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameUhr frame = new JFrameUhr();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrameUhr() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		// Menüzeile (JMenuBar) erzeugen und in das Fenster (JFrame) einfügen
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		// Menü (konfig) erzeugen und in die Menüzeile (JMenuBar) einfügen
		JMenu konfig = new JMenu("Einstellungen");
		menuBar.add(konfig);

		// Menüeinträge (BackgroundColorItem) erzeugen und dem Menü (JMenu)
		// "Konfiguration" hinzufügen
		JMenuItem BackgroundColorItem = new JMenuItem("Hintergrundfarbe");
		BackgroundColorItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hintergrundfarbe auswaehlen");
			}
		});
		konfig.add(BackgroundColorItem);

		// Menüeinträge (writingColorItem) erzeugen und dem Menü (JMenu)
		// "Schriftfarbe" hinzufügen
		JMenuItem writingColorItem = new JMenuItem("Schriftfarbe");
		writingColorItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Schriftfarbe auswaehlen");
			}
		});
		konfig.add(writingColorItem);

		// Menüeinträge (writingSize) erzeugen und dem Menü (JMenu)
		// "Schriftfarbe" hinzufügen
		JMenuItem writingSize = new JMenuItem("Schriftgroesse");
		writingSize.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Schriftgroesse auswaehlen");
			}
		});
		konfig.add(writingSize);
		getContentPane().setLayout(null);

		JButton startButton = new JButton("START");
		JButton stoppButton = new JButton("STOPP");
		
		startButton.setBounds(10, 206, 202, 23);
		getContentPane().add(startButton);
		startButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				startButton.setText("Go!");
				stoppButton.setText("STOPP");
			}
		});

		
		stoppButton.setBounds(229, 206, 195, 23);
		getContentPane().add(stoppButton);
		stoppButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				stoppButton.setText("finish!");
				startButton.setText("START"); 
			}
		});
	}
}
