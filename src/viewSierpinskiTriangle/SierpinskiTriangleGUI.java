package viewSierpinskiTriangle;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class SierpinskiTriangleGUI extends JFrame {

	public SierpinskiTriangleGUI() {
		setTitle("Triángulo de Sierpinski");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setContentPane(new SierpinskiTrianglePanel(requestIterationsNumber()));
		setVisible(true);
	}
	
	public int requestIterationsNumber() {
		return Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el número de iteraciones:"));
	}
}
