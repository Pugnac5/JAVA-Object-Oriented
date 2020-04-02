package formasgeometricasheranca;

public class Circulo extends FormaGeometrica {
    private double raio;
    private Ponto centro;

    public Circulo() {
  	super();
        raio=1;
        centro=new Ponto();
    }
    public Circulo (double raio, Ponto centro) {
    	super();
    	this.raio=raio;
        this.centro=centro;
    }
    public Circulo (double raio, Ponto centro,Cor borda,Cor preenchimento)  {
    	super(borda,preenchimento);
    	this.raio=raio;
        this.centro=centro;
    } 
	public void setRaio(double raio) {
    	this.raio=raio;
	}
	public double getRaio() {
		return raio;
	}
	public void setCentro(Ponto centro) {
    	this.centro=centro;
	}
	public Ponto getCentro() {
		return centro;
	}
        @Override
    public double area() {
    	return Math.PI*Math.pow(raio,2);
    }
    public double perimetro() {
    	return Math.PI*2*raio;
    }
    public boolean isIn(Ponto p) {
    	double d;
    	d=centro.distancia(p);
    	if (d<=raio)
    		return true;
        else
        	return false;
    }
	public String toString() {
		String s="Forma: Eu sou um Circulo\n";
		s+=super.toString();
		s+="Caracteristicas Geometricas\n";
		s+="Coordenadas do centro: ("+centro.getX()+","+centro.getY()+")\n";
		s+="Raio: "+raio+"\n";
		s+="Area: " +area()+"\n";
		s+="Perimetro: " +perimetro();
		return s;
	}
}
