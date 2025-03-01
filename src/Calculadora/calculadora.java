package Calculadora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.sql.ResultSet;
import java.util.Iterator;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculadora extends JFrame {

	public calculadora() {

		setSize(385,500);
		setLocationRelativeTo(null);

		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    	setMaximumSize(new Dimension(700, 700));
//    	setMinimumSize(new Dimension(360, 360));

		ImageIcon fondoIcono = new ImageIcon("FondoDeNaranja.png");
		setIconImage(fondoIcono.getImage());

//		this.add(this.calculos());
//		this.add(this.calculos2());
		this.add(calculoInteres());
		

		this.repaint();
		setVisible(true);

	}
	
	public JPanel calculoInteres() {

		// PANEL PRINCIPAL///////////////////////////////////////////////////////////////////
		JPanel panelPrincipal1 = new JPanel();

		panelPrincipal1.setBackground(Color.decode("#7F7F7F"));
		panelPrincipal1.setOpaque(true);
		panelPrincipal1.setLayout(new BorderLayout());

		// Panel para mostrar operaciones///////////////////////
		JLabel operaciones = new JLabel("Interes");
		operaciones.setBackground(Color.white);
		operaciones.setOpaque(true);
		operaciones.setFont(new Font("Bahnschrift", Font.BOLD, 40));
		operaciones.setHorizontalAlignment(JLabel.LEFT);
		panelPrincipal1.add(operaciones, BorderLayout.NORTH);

		// panel que contiene los dos paneles de botones"SOLO SE USA PARA QUE CONTENGA PANELES"
		JPanel centro = new JPanel();
		centro.setOpaque(true);
		centro.setBackground(Color.decode("#33ffa2"));
		centro.setLayout(new BorderLayout());
		panelPrincipal1.add(centro, BorderLayout.CENTER);
		
		JPanel panelSur = new JPanel();
		panelSur.setOpaque(true);
		panelSur.setBackground(Color.decode("#EF9A37"));
		panelSur.setLayout(new BorderLayout());
		panelPrincipal1.add(panelSur, BorderLayout.SOUTH);

		// panel de la parte del centro////////////////////////////
		
		
		JLabel calculo6 = new JLabel("calculo de interes");
		calculo6.setBackground(Color.white);
		calculo6.setOpaque(true);
		calculo6.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		calculo6.setHorizontalAlignment(JLabel.LEFT);
		centro.add(calculo6, BorderLayout.NORTH);
		
		JPanel botones = new JPanel();
		botones.setLayout(new GridLayout(1, 2,20,20));
		botones.setBorder(BorderFactory.createEmptyBorder(1, 100, 60, 100));
		centro.add(botones, BorderLayout.SOUTH);
		
		String[] numerosBoton = { "Calcular", "Cancelar",};

		for (String numeroTexto : numerosBoton) {
			JButton boton = new JButton(numeroTexto);
			boton.setBackground(Color.decode("#333333")); // Color de fondo
			boton.setForeground(Color.WHITE); 
			boton.setFont(new Font("Bahnschrift", Font.BOLD, 9));
			botones.add(boton);
		}
		
		JPanel botones2 = new JPanel();
		botones2.setLayout(new GridLayout(3, 1,20,20));
		botones2.setBorder(BorderFactory.createEmptyBorder(50, 50, 40, 5));
		centro.add(botones2, BorderLayout.WEST);

		String[] numerosBoton2 = { "Capital", "Interes", "Taza de iteres"};

		for (String numeroTexto : numerosBoton2) {
			JLabel boton = new JLabel(numeroTexto);
			boton.setOpaque(true);
			boton.setBackground(Color.LIGHT_GRAY); 
			botones2.add(boton);
		}
		
		JPanel botones3 = new JPanel();
		botones3.setLayout(new GridLayout(3, 1, 20, 20));
		botones3.setBorder(BorderFactory.createEmptyBorder(50, 5, 40, 50));
		centro.add(botones3, BorderLayout.CENTER);

		String[] numerosBoton3 = { "1500", "2", "0.1"};

		for (String numeroTexto : numerosBoton3) {
			JLabel boton = new JLabel(numeroTexto);
			boton.setOpaque(true);
			boton.setBackground(Color.LIGHT_GRAY);
			botones3.add(boton);
		}
		

		// panel de la parte inferior/////////////////////////////////////////
		JPanel botonesSuperior = new JPanel();
		botonesSuperior.setLayout(new GridLayout(2, 1,20,20));		
		botonesSuperior.setBorder(BorderFactory.createEmptyBorder(30, 20, 50, 20));
		panelSur.add(botonesSuperior, BorderLayout.WEST);

		String[] operacionesBoton2 = { "Interes", "Monto",};

		for (String operacionTexto : operacionesBoton2) {
			JLabel boton2 = new JLabel(operacionTexto);
			boton2.setOpaque(true);
			boton2.setBackground(Color.LIGHT_GRAY); 
			botonesSuperior.add(boton2);
		}
		
		JPanel panel7 = new JPanel();
		panel7.setLayout(new GridLayout(2, 1, 20, 20));
		panel7.setBorder(BorderFactory.createEmptyBorder(30, 20, 50,20));
		panelSur.add(panel7, BorderLayout.CENTER);

		String[] numerosBoton4 = { "343.0000000000003", "792.9000000000000002"};

		for (String numeroTexto : numerosBoton4) {
			JLabel boton = new JLabel(numeroTexto);
			boton.setOpaque(true);
			boton.setBackground(Color.LIGHT_GRAY); 
			panel7.add(boton);
		}

		return panelPrincipal1;
	}

	public JPanel calculos2() {

		// PANEL PRINCIPAL///////////////////////////////////////////////////////////////////
		JPanel panelPrincipal1 = new JPanel();

		panelPrincipal1.setBackground(Color.decode("#7F7F7F"));
		panelPrincipal1.setOpaque(true);
		panelPrincipal1.setLayout(new BorderLayout());

		// Panel para mostrar operaciones///////////////////////
		JLabel operaciones = new JLabel("89.00");
		operaciones.setBackground(Color.white);
		operaciones.setOpaque(true);
		operaciones.setFont(new Font("Bahnschrift", Font.BOLD, 40));
		operaciones.setHorizontalAlignment(JLabel.RIGHT);
		panelPrincipal1.add(operaciones, BorderLayout.NORTH);

		// panel que contiene los dos paneles de botones"SOLO SE USA PARA QUE CONTENGA PANELES"
		JPanel centro = new JPanel();
		centro.setBackground(Color.decode("#33ffa2"));
		centro.setOpaque(true);
		centro.setLayout(new BorderLayout());
		panelPrincipal1.add(centro, BorderLayout.CENTER);

		// panel que tiene los numeros y "." , "=" ////////////////////////////
		JPanel botones = new JPanel();
		botones.setLayout(new GridLayout(4, 3));
		centro.add(botones, BorderLayout.CENTER);

		String[] numerosBoton = { "7", "8", "9", "4", "5", "6", "1", "2", "3", ".", "0", "=" };

		for (String numeroTexto : numerosBoton) {
			JButton boton = new JButton(numeroTexto);

			if (numeroTexto.equals("=") || numeroTexto.equals(".")) {
				Estilos2.aplicarEstilo(boton);
			} else {
				Estilos.aplicarEstilo(boton);
			}
			botones.add(boton);
		}

		// botones que tiene las operaciones prinecipales// //////////////////////////////
		JPanel botonesOperaciones = new JPanel();
		botonesOperaciones.setLayout(new GridLayout(4, 1));
		centro.add(botonesOperaciones, BorderLayout.EAST);

		String[] operacionesBoton1 = { "/", "*", "-", "+" };

		for (String operacionTexto : operacionesBoton1) {
			JButton boton1 = new JButton(operacionTexto);
			Estilos2.aplicarEstilo(boton1);
			botonesOperaciones.add(boton1);
		}

		// Botones que estan en la parte superior/////////////////////////////////////////
		JPanel botonesSuperior = new JPanel();
		botonesSuperior.setLayout(new GridLayout(1, 4));
		centro.add(botonesSuperior, BorderLayout.NORTH);

		String[] operacionesBoton2 = { "CE", "%", "M+", "M-" };

		for (String operacionTexto : operacionesBoton2) {
			JButton boton2 = new JButton(operacionTexto);

			if (operacionTexto.equals("CE")) {
				Estilos3.aplicarEstilo(boton2);
			} else {
				Estilos2.aplicarEstilo(boton2);
			}

			botonesSuperior.add(boton2);
		}

		return panelPrincipal1;
	}

	// Estilo para botonoes normales(gris)////////////////////////
	public class Estilos {
		public static void aplicarEstilo(JButton boton) {
			boton.setBackground(Color.decode("#333333")); // Color de fondo
			boton.setForeground(Color.WHITE); // Color de letra
			boton.setFont(new Font("Bahnschrift", Font.BOLD, 20)); // Tipo y tamaño de letra
		}
	}

	// estilo para bonotes que rasalte(Naranja)///////////////////////////
	public class Estilos2 {
		public static void aplicarEstilo(JButton boton) {
			boton.setBackground(Color.decode("#EF9A37")); // Color de fondo
			boton.setForeground(Color.WHITE); // Color de letra
			boton.setFont(new Font("Bahnschrift", Font.BOLD, 25)); // Tipo y tamaño de letra
		}
	}

	// Estilo para botones especiales(Rojo)///////////////////7
	public class Estilos3 {
		public static void aplicarEstilo(JButton boton) {
			boton.setBackground(Color.decode("#fc3f16")); // Color de fondo
			boton.setForeground(Color.WHITE); // Color de letra
			boton.setFont(new Font("Bahnschrift", Font.BOLD, 25));
		}
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

		// Botones operaciones
		// ///////////////////////////////////////////////////////////////////////////////////////////////////

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
