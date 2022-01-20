//package loja;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FrotaCarros implements Serializable {
    private final static String[] cor;
    private final static String[] marca;
    private List<Carro> carros;
 static {
 cor = new String[6];
 cor[0] = "preto";
 cor[1] = "branco";
 cor[2] = "verde";
 cor[3] = "vermelho";
 cor[4] = "azul";
 cor[5] = "laranja";
 marca = new String[6];
 marca[0] = "Ford";
 marca[1] = "BMW";
 marca[2] = "Volvo";
 marca[3] = "Audi";
 marca[4] = "Renault";
 marca[5] = "Volkswagen";
 }

    public List<Carro> getCarros() {
        carros = new ArrayList<Carro>();
        popularCarros(carros);
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    public void popularCarros(List<Carro> list) {
        for (int i = 0; i < 15; i++) {
            list.add(new Carro(getMarca(), getCor()));
        }
    }

    private String getMarca() {
        return marca[(int) (Math.random() * 3)];
    }

    private String getCor() {
        return cor[(int) (Math.random() * 3)];
    }
}