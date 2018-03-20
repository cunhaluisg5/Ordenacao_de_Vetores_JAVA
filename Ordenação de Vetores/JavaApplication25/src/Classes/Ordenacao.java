/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Luís Gustavo
 */
public class Ordenacao {
    private int tamanho;
    private int []v = inicializa(tamanho);

    public Ordenacao() {
    }

    public Ordenacao(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    public int[] inicializa(int tamanho){
        int i;
        int []v = new int[tamanho];
        Random aleatorio = new Random();
        for(i=0; i<tamanho; i++){
            v[i] = aleatorio.nextInt(10);
        }
        return v;
    }
    
    public void imprimeVetor(int []v){
        System.out.println(Arrays.toString(v));
    }
}
