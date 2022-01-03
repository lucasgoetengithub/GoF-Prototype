package com.estudo.gof;

public class PrototypeImpl implements Prototype {
	public Ovelha duplicar(Ovelha ovelha) {
		return (Ovelha) ovelha.clone();
	}
}
