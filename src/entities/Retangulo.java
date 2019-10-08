package entities;

import entities.enums.ColorEnum;

public class Retangulo extends Forma {

	private Double largura;
	private Double altura;

	public Retangulo() {
		super();
	}

	public Retangulo(ColorEnum colorEnum, Double altura, Double largura) {
		super(colorEnum);
		this.altura = altura;
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	@Override
	public Double area() {
		return largura * altura;
	}

}
