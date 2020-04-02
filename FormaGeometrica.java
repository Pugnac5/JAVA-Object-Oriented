package formasgeometricasheranca;

public class FormaGeometrica {
	private Cor preenchimento;
	private Cor borda;
	public FormaGeometrica() {
		preenchimento=new Cor(255,255,255,255);
		borda=new Cor();    	
	}
	public FormaGeometrica(Cor borda,Cor preenchimento) {
		this.preenchimento=preenchimento;
		this.borda=borda;
	}
	public void setCorPreenchimento(Cor preenchimento) {
		this.preenchimento=preenchimento;
	}
	public Cor getCorPreenchimento() {
		return preenchimento;
	}
	public void setCorBorda(Cor borda) {
		this.borda=borda;
	}
	public Cor getCorBorda() {
		return borda;
	}
	public  double area() {
		return 0;
	}
	public  double perimetro(){
		return 0;
	}
	public  boolean isIn(Ponto p){
		return false;
	}
    public String toString() {
		String s="";
		s+="Cor da Borda (a,r,g,b): ("+borda.getAlpha()+","+borda.getRed()+","+borda.getGreen()+","+borda.getBlue()+")\n";
		s+="Cor de Preenchimento: ("+preenchimento.getAlpha()+","+preenchimento.getRed()+","+preenchimento.getGreen()+","+preenchimento.getBlue()+")\n";
		return s;
	}
}