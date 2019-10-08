package entities;

import entities.enums.ColorEnum;

public abstract class Forma {

	private ColorEnum colorEnum;

	public Forma() {
		super();
	}

	public Forma(ColorEnum colorEnum) {
		super();
		this.colorEnum = colorEnum;
	}

	public ColorEnum getColorEnum() {
		return colorEnum;
	}

	public void setColorEnum(ColorEnum colorEnum) {
		this.colorEnum = colorEnum;
	}

	public abstract Double area();

}
