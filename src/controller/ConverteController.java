package controller;

import model.Pilha;

public class ConverteController {
	
	private Pilha pilhaInt; 
	
	public ConverteController() {
		pilhaInt = new Pilha(); 
	}

	public String decToBin(int decimal) {

		while (decimal > 0) {
			pilhaInt.push((int) decimal % 2);
			decimal = decimal / 2;
		}

		String hexa = new String();
		while (!pilhaInt.isEmpty()) {
			try {
				hexa = hexa + String.valueOf(pilhaInt.pop());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return hexa;
	}
}
