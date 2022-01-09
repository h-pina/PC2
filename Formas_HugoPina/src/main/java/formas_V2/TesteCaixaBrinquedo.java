//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package formas_V2;

public class TesteCaixaBrinquedo {
    public static void main(String[] args) {
        CaixaDeBrinquedo cdb = new CaixaDeBrinquedo();
        
        Circulo circ = new Circulo(10.05);
        Esfera esf = new Esfera(20.20);
        
        Quadrado quad = new Quadrado(10);
        Cubo cub = new Cubo(60.10);
        
        Triangulo trig = new Triangulo(50, 19.8);
        Tetraedro tet = new Tetraedro(2.7);
        
        cdb.inserirForma(circ);
        cdb.inserirForma(esf);
        cdb.inserirForma(quad);
        cdb.inserirForma(cub);
        cdb.inserirForma(trig);
        cdb.inserirForma(tet);
        
        cdb.processarAllFormas();
    }
}
