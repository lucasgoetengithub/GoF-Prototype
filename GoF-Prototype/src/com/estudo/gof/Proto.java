package com.estudo.gof;

public class Proto {
	public static void main(String[] args) {
		executar();
	}

	public static void executar() {
		Ovelha original = new Ovelha("Dolly");
		Ovelha clone = new PrototypeImpl().duplicar(original);
	}
}
