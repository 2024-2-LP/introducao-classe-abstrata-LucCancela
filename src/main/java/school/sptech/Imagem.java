package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem{
    private List<Figura> figuras;

    public void adicionar(Figura figura){
        this.figuras.add(figura);
    }

    public Double calcularSomaDasAreas(){
        Double somaTotal = 0.0;
        for (Figura figura : figuras) {
            somaTotal += figura.calcularArea();
        }
        return somaTotal;
    }

    public List<Figura> buscarPorAreaMaiorQue20(){
        List<Figura> resultado = new ArrayList<>();

        for (Figura figura : figuras) {
            if(figura.calcularArea() > 20){
                resultado.add(figura);
            }
        }

        return resultado;
    }

    public List<Figura> buscarQuadrados(){
        List<Figura> resultado = new ArrayList<>();
        for (Figura figura : figuras) {
            if(figura instanceof Quadrado){
                resultado.add(figura);
            }
        }
        return resultado;
    }

}
