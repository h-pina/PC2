//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package formas_V1;

public class Triangulo extends Bidimensional {
    
    //campos
    
    private double base;
    private double altura;
    
    //construtor
    
    public Triangulo(double base, double altura){
        super("Triangulo"); //inicializa tipo como "Triangulo"
        this.base = base;
        this.altura = altura;
    }
 
    //getters e setters
    
    public double getBase(){
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {    
        this.altura = altura;
    }

    //metodos
    
    @Override
    public double obterArea() {
        double area = (this.base * this.altura) / 2;
        return area;
    }
    
    
}
