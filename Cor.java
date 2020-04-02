package formasgeometricasheranca;

public class Cor {
	// Atributos
	private int cor;

	// Construtores
	public Cor () {
		cor=0;
	}
	public Cor (int alpha,int red,int green,int blue) {
		cor=(alpha<<24)|(red<<16)|(green<<8)|blue;
	}
	// M�todos de acesso/Modifica��o
	public void setCor (int alpha,int red,int green,int blue) {
		cor=(alpha<<24)|(red<<16)|(green<<8)|blue;
	}
	public int getAlpha() {
		return (cor&0xFF000000)>>24;
	}
	public int getRed() {
		return (cor&0x00FF0000)>>16;
	}
	public int getGreen() {
		return (cor&0x0000FF00)>>8;
	}
	public int getBlue() {
		return (cor&0x000000FF);
	}
}
 
 
 
 
 
 