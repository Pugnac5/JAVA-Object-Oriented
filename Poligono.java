package formasgeometricasheranca;

public class Poligono extends FormaGeometrica{
	private Ponto[] vertices;
	public Poligono() {
	   	super(); 
		vertices=new Ponto[4];
		vertices[0]=new Ponto(0,0);
		vertices[1]=new Ponto(1,0);
		vertices[2]=new Ponto(0,1);
		vertices[3]=vertices[0];
	}
	public Poligono(Ponto[] vertices) {
	   	super();
		this.vertices=vertices;
	}
	public Poligono(Ponto[] vertices,Cor borda,Cor preenchimento) {
	   	super(borda,preenchimento);
		this.vertices=vertices;
	}
	public void setVertices(Ponto[] vertices) {
		this.vertices=vertices;
	}
	public Ponto[] getVertices() {
		return vertices;
	}
	public  double area() {
	    double area=0;
	    for (int i=0;i<vertices.length-1;i++) {
       		area+=(vertices[i+1].getY()-vertices[i].getY())*(vertices[i+1].getX()+vertices[i].getX())/2;
        }
        area=Math.abs(area);
		return area;
	}
	public  double perimetro() {
	    double perimetro=0;
	    for (int i=0;i<vertices.length-1;i++) {
       		perimetro+=vertices[i+1].distancia(vertices[i]);
        }
  		return perimetro;
	}
	public boolean isIn(Ponto p) {
		int num_vertices=vertices.length-1;
		Triangulo[] tri=new Triangulo[num_vertices];
		double area_tri=0;
		for (int i=0;i<num_vertices;i++) {
			tri[i]=new Triangulo(vertices[i],vertices[i+1],p);
			area_tri+=tri[i].area();
		}
		if(this.area() == area_tri) {
			return true;
		} else {
			return false;
		}
	}
	public String toString() {
		String s="Forma: Eu sou um Poligono\n";
		s+=super.toString();
		s+="Caracteristicas Geometricas\n";
	    for (int i=0;i<vertices.length-1;i++) {
			s+="Coordenadas do Vertice "+(i+1)+": ("+vertices[i].getX()+","+vertices[i].getY()+")\n";
		}
		s+="Area:" +area()+"\n";
		s+="Perimetro:" +perimetro()+"\n";
		return s;
	}
}