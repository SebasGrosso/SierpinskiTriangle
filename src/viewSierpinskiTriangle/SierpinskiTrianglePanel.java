package viewSierpinskiTriangle;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class SierpinskiTrianglePanel extends JPanel {

	private int iterations;

	public SierpinskiTrianglePanel(int iterations) {
		this.iterations = iterations;
	}

	@Override
	protected void paintComponent(Graphics g) {
		drawSierpinskiTriangle(g, 400, 400, 350, iterations);
	}

	private void drawSierpinskiTriangle(Graphics g, int x, int y, int sizeTriangle, int iterations) {
		if (iterations == 0) {
			int[] pointsX = { x, x - sizeTriangle, x + sizeTriangle };
			int[] pointsY = { y - sizeTriangle, y + sizeTriangle, y + sizeTriangle };
			g.setColor(Color.MAGENTA);
//			g.drawPolygon(pointsX, pointsY, 3);
			g.fillPolygon(pointsX, pointsY, 3);
		} else {
			int halfsizeTriangle = sizeTriangle / 2;
			drawSierpinskiTriangle(g, x, y - halfsizeTriangle, halfsizeTriangle, iterations - 1);
			drawSierpinskiTriangle(g, x - halfsizeTriangle, y + halfsizeTriangle, halfsizeTriangle, iterations - 1);
			drawSierpinskiTriangle(g, x + halfsizeTriangle, y + halfsizeTriangle, halfsizeTriangle, iterations - 1);
		}
	}
}