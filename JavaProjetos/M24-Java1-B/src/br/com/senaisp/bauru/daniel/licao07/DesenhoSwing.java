package br.com.senaisp.bauru.daniel.licao07;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DesenhoSwing extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public void paint(Graphics g) {
		//cor do preenchimento do desenho
		g.setColor(Color.BLUE);
		//desenhando quadrado na posição x=50, y=50
		g.fillRect(50, 50, 150, 150);
	}
}
