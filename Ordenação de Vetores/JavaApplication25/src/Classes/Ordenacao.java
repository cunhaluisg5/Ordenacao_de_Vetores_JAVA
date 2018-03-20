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
    private int []v;

    public Ordenacao() {
    }

    public Ordenacao(int tamanho, int[] v) {
        this.tamanho = tamanho;
        this.v = v;
    }


    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int[] getV() {
        return v;
    }

    public void setV(int[] v) {
        this.v = v;
    }
    
    
    public void inicializa(int tamanho){
        int i;
        v = new int[tamanho];
        Random aleatorio = new Random();
        for(i=0; i<tamanho; i++){
            v[i] = aleatorio.nextInt(10);
        }
    }
    
    public void imprimeVetor(int []v){
        System.out.println(Arrays.toString(v));
    }
}
