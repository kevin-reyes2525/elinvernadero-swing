package invernadero;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class VerPlanta extends JFrame {
	
	
	
	public JPanel panel;
	public JLabel Anis;
	public JLabel Manzanilla;
	public JLabel Menta;
	public JLabel Boldo;
	public JLabel Hinojo;
	public JLabel Romero;
	public JLabel Tomillo;
	public JLabel Eneldo;
	public JLabel Oregano;
	public JLabel Cilantro;
	public JLabel Achiote;
	public JLabel Cereza;
	public JLabel Limon;
	public JLabel Guayaba;
	public JLabel Ponsigue;
	public JTextField IngresarPlanta;
	public JLabel PlantaIntroducida;
	public JLabel Hierbas;
	public JLabel Plantas2;
	public JLabel Matas;
	public JLabel Arbustos;
	
	public VerPlanta() {
		this.setTitle("Plantas");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		IniciarPlantas();
		this.setLocationRelativeTo(null);

	}
	public void IniciarPlantas(){
		ColocarPlantas();
		ColocarCosas();
		TodasLasPlantas();
		PlantaNueva();
		ColocarPlanta();
		Boton2();
		Boton3();
	}
	public void ColocarPlantas(){
	panel = new JPanel();
	panel.setLayout(null);
	this.getContentPane().add(panel);
	}
	public void ColocarCosas() {
	JLabel plantas = new JLabel();
	plantas.setText("INVERNADERO");
	plantas.setBounds(270,60,1000,700);
	plantas.setForeground(Color.RED);
	plantas.setFont(new Font("arial",1,30));
	panel.add(plantas);
	}
	public void TodasLasPlantas() {

		JButton boton1 = new JButton();
		boton1.setText("Lista de las Plantas");
		boton1.setBounds(50, 20, 200, 40);
		Anis = new JLabel(); 
		Anis.setBounds(50, 10, 100, 200);
		Menta = new JLabel(); 
		Menta.setBounds(50, 25, 100, 200);
		Hinojo = new JLabel(); 
		Hinojo.setBounds(50, 40, 100, 200);
		Boldo = new JLabel();
		Boldo.setBounds(50, 55, 100, 200);
		Romero = new JLabel();
		Romero.setBounds(50, 70, 100, 200);
		Cereza = new JLabel();
		Cereza.setBounds(50, 85, 100, 200);
		Achiote = new JLabel();
		Achiote.setBounds(50, 100, 100, 200);
		Limon = new JLabel();
		Limon.setBounds(140, 10, 100, 200);
		Manzanilla = new JLabel();
		Manzanilla.setBounds(140, 25, 100, 200);
		Guayaba = new JLabel();
		Guayaba.setBounds(140, 40, 100, 200);
		Oregano = new JLabel();
		Oregano.setBounds(140, 55, 100, 200);
		Ponsigue = new JLabel();
		Ponsigue.setBounds(140, 70, 100, 200);
		Eneldo = new JLabel();
		Eneldo.setBounds(140, 85, 100, 200);
		Tomillo = new JLabel();
		Tomillo.setBounds(140, 100, 100, 200);
		Cilantro = new JLabel();
		Cilantro.setBounds(140, 115, 100, 200);
		panel.add(Cereza); //1 s
		panel.add(Cilantro); //2  s
		panel.add(Hinojo); //3 s
		panel.add(Tomillo); //4 s
		panel.add(Anis); //5 s
		panel.add(Achiote); //6 s
		panel.add(Oregano); //7 s
		panel.add(Romero); //8
		panel.add(Limon); //9 s
		panel.add(Guayaba); //10 s
		panel.add(Menta); //11s
		panel.add(Eneldo); //12 s
		panel.add(Ponsigue); //13 s
		panel.add(Manzanilla); //14 s
		panel.add(Boldo); //15 s
		panel.add(boton1);
		JLabel PlantaNuevaRepetida = new JLabel();
		PlantaNuevaRepetida.setBounds(100, 215, 100, 200);
		panel.add(PlantaNuevaRepetida);
		
		ActionListener Boton01 = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				Hinojo.setText("Hinojo"); //1
				Anis.setText("Anis"); //2
				Romero.setText("Romero"); //3
				Guayaba.setText("Guayaba"); //4
				Boldo.setText("Boldo"); //5
				Tomillo.setText("Tomillo"); //6
				Cereza.setText("Cereza"); //7
				Ponsigue.setText("Ponsigue"); //8
				Limon.setText("Limon"); //9
				Manzanilla.setText("Manzanilla"); //10
				Oregano.setText("Oregano"); //11
				Achiote.setText("Achiote"); //12
				Eneldo.setText("Eneldo"); //13
				Menta.setText("Menta"); //14
				Cilantro.setText("Cilantro"); //15
				PlantaNuevaRepetida.setText(""+IngresarPlanta.getText());
				
				
				
			}
			
		};	
		boton1.addActionListener(Boton01);
	}
	public void PlantaNueva() {
		JLabel	PlantaN = new JLabel();
		PlantaN.setBounds(100, 250, 100, 30);
		PlantaN.setText("Ingrese la planta");
		panel.add(PlantaN);
	}		
	public void Boton2() {
		JButton Boton02 = new JButton();
		Boton02.setBounds(50, 400, 200, 40);
		Boton02.setText("Mostrar Planta");
		PlantaIntroducida = new JLabel();
		PlantaIntroducida.setBounds(50, 200, 250, 30);
		panel.add(PlantaIntroducida);
		panel.add(Boton02);
		JLabel PlantaRepetida2 = new JLabel();
		PlantaRepetida2.setBounds(100, 215, 100, 200);
		panel.add(PlantaRepetida2);
		
		
		
		ActionListener AgregarPlanta = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				PlantaIntroducida.setText(""+IngresarPlanta.getText());
				PlantaRepetida2.setText(""+IngresarPlanta.getText());
				
			}
			
		};
		Boton02.addActionListener(AgregarPlanta);
	}
	public void ColocarPlanta() {
		IngresarPlanta = new JTextField();
		IngresarPlanta.setBounds(50, 350, 200, 40);
		panel.add(IngresarPlanta);
		
	}
	public void Boton3() {
		JButton Boton03 = new JButton();
		Boton03.setBounds(250, 20, 200, 40);
		Boton03.setText("Caracteristicas de las plantas");
		panel.add(Boton03);
		Hierbas= new JLabel();
		Hierbas.setBounds(250, 95, 100, 45);
		panel.add(Hierbas);
		Plantas2 = new JLabel();
		Plantas2.setBounds(250,110, 100, 40);
		panel.add(Plantas2);
		Matas = new JLabel();
		Matas.setBounds(250,125, 100, 40);
		Arbustos = new JLabel();
		Arbustos.setBounds(250,140,100,40);
		panel.add(Arbustos);
		panel.add(Matas);
		JLabel Caracteristicas = new JLabel();
		Caracteristicas.setBounds(250,80, 100, 40);
		panel.add(Caracteristicas);
		
		ActionListener ComparacionPlantas = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Caracteristicas.setText("Caracteristicas:");
				Hierbas.setText("Aportan Nitrogeno");
				Matas.setText("Mejoro la tierra del suelo");
				Arbustos.setText("Soy medicinal");
				
				
				
			}
			
		};
		Boton03.addActionListener(ComparacionPlantas);
	}
	

}
