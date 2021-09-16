package view;

import javax.swing.JOptionPane;

import controller.ConverteController;

public class Principal {

	public static void main(String[] args) {
		int decimal = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um decimal"));

		ConverteController converteController = new ConverteController();
		System.out.println(converteController.decToBin(decimal)); 
	}
}
