package entities;

import entities.enums.ColorEnum;

public class Circulo extends Forma {
	private Double raio;

	public Circulo() {
		super();
	}

	public Circulo(ColorEnum colorEnum, Double raio) {
		super(colorEnum);
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public Double area() {
		return Math.PI * Math.pow(raio, 2);
	}

}
