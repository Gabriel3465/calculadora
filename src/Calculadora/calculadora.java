package Calculadora;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculadora extends JFrame {
	
	
	
	public calculadora() {

		setVisible(true);
		setSize(385, 450);
		setLocationRelativeTo(null);

		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    	setMaximumSize(new Dimension(700, 700));
//    	setMinimumSize(new Dimension(360, 360));
		
		 ImageIcon fondoIcono = new ImageIcon("FondoDeNaranja.png");
		 setIconImage(fondoIcono.getImage());

//		this.add(this.calculos());
		this.add(this.calculos2());


		this.repaint();

	}

	
	public class Estilos {
		public static void aplicarEstilo(JButton boton) {
			boton.setBackground(Color.decode("#333333")); // Color de fondo
			boton.setForeground(Color.WHITE); // Color de letra
			boton.setFont(new Font("Bahnschrift", Font.BOLD, 17)); // Tipo y tamaño de letra
		}
	}
	
	public class Estilos2 {
		public static void aplicarEstilo(JButton boton) {
			boton.setBackground(Color.decode("#EF9A37")); // Color de fondo
			boton.setForeground(Color.WHITE); // Color de letra
			boton.setFont(new Font("Bahnschrift", Font.BOLD, 20)); // Tipo y tamaño de letra
		}
	}
	
	public JPanel calculos2() {
		
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setBackground(Color.decode("#000000"));
		panelPrincipal.setOpaque(true);
		panelPrincipal.setSize(500, 800);
		panelPrincipal.setLocation(0, 0);
		panelPrincipal.setLayout(null);
		
		return panelPrincipal;	
	}

	public JPanel calculos() {

		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setBackground(Color.decode("#000000"));
		panelPrincipal.setOpaque(true);
		panelPrincipal.setSize(500, 800);
		panelPrincipal.setLocation(0, 0);
		panelPrincipal.setLayout(null);

		// RELLENO ////////////// /////////////////////
		JPanel subPanel = new JPanel();
		subPanel.setBackground(Color.decode("#7F7F7F"));
		subPanel.setOpaque(true);
		subPanel.setBounds(100, 110, 260, 50);
		subPanel.setLayout(null);
		panelPrincipal.add(subPanel);

		JTextField operaciones = new JTextField(); // Usa la variable de instancia
		operaciones.setBounds(10, 10, 350, 90);
		operaciones.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		panelPrincipal.add(operaciones);

		// Botones numeros
		// /////////////////////////////////////////////////////////////////////////////////////////
		JButton boton0 = new JButton("0");
		Estilos.aplicarEstilo(boton0);
		boton0.setBounds(10, 350, 80, 50);
		panelPrincipal.add(boton0);

		JButton boton1 = new JButton("1");
		Estilos.aplicarEstilo(boton1);
		boton1.setBounds(10, 290, 80, 50);
		panelPrincipal.add(boton1);

		JButton boton2 = new JButton("2");
		Estilos.aplicarEstilo(boton2);
		boton2.setBounds(100, 290, 80, 50);
		panelPrincipal.add(boton2);

		JButton boton3 = new JButton("3");
		Estilos.aplicarEstilo(boton3);
		boton3.setBounds(190, 290, 80, 50);
		panelPrincipal.add(boton3);

		JButton boton4 = new JButton("4");
		Estilos.aplicarEstilo(boton4);
		boton4.setBounds(10, 230, 80, 50);
		panelPrincipal.add(boton4);

		JButton boton5 = new JButton("5");
		Estilos.aplicarEstilo(boton5);
		boton5.setBounds(100, 230, 80, 50);
		panelPrincipal.add(boton5);

		JButton boton6 = new JButton("6");
		Estilos.aplicarEstilo(boton6);
		boton6.setBounds(190, 230, 80, 50);
		panelPrincipal.add(boton6);

		JButton boton7 = new JButton("7");
		Estilos.aplicarEstilo(boton7);
		boton7.setBounds(10, 170, 80, 50);
		panelPrincipal.add(boton7);

		JButton boton8 = new JButton("8");
		Estilos.aplicarEstilo(boton8);
		boton8.setBounds(100, 170, 80, 50);
		panelPrincipal.add(boton8);

		JButton boton9 = new JButton("9");
		Estilos.aplicarEstilo(boton9);
		boton9.setBounds(190, 170, 80, 50);
		panelPrincipal.add(boton9);

		// Botones operaciones  ///////////////////////////////////////////////////////////////////////////////////////////////////

		JButton botonDivision = new JButton("/");
		botonDivision.setBounds(280, 170, 80, 50);
		Estilos2.aplicarEstilo(botonDivision);
		panelPrincipal.add(botonDivision);

		JButton botonMultiplicacion = new JButton("*");
		Estilos2.aplicarEstilo(botonMultiplicacion);
		botonMultiplicacion.setBounds(280, 230, 80, 50);
		panelPrincipal.add(botonMultiplicacion);

		JButton botonResta = new JButton("-");
		Estilos2.aplicarEstilo(botonResta);
		botonResta.setBounds(280, 290, 80, 50);
		panelPrincipal.add(botonResta);

		JButton botonSuma = new JButton("+");
		Estilos2.aplicarEstilo(botonSuma);
		botonSuma.setBounds(280, 350, 80, 50);
		panelPrincipal.add(botonSuma);

		JButton botonDecimal = new JButton(".");
		Estilos.aplicarEstilo(botonDecimal);
		botonDecimal.setBounds(100, 350, 80, 50);
		panelPrincipal.add(botonDecimal);

		JButton botonIgual = new JButton("=");
		Estilos2.aplicarEstilo(botonIgual);
		botonIgual.setBounds(190, 350, 80, 50);
		panelPrincipal.add(botonIgual);

		JButton botonBorrar = new JButton("CE");
		botonBorrar.setBounds(10, 110, 80, 50);
		botonBorrar.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		panelPrincipal.add(botonBorrar);
		
		
		return panelPrincipal;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new calculadora();
	}

}
