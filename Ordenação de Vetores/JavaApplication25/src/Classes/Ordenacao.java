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
    
    public void selectionSort() {
	for (int i = 0; i < v.length; i++) {
		int posicaoMenor = i;
		for (int j = (i + 1); j < v.length; j++) {
			if (v[j] < v[posicaoMenor]) {
				posicaoMenor = j;
			}
		}
		if (v[i] != v[posicaoMenor]) {
			int temp = v[i];
			v[i] = v[posicaoMenor];
			v[posicaoMenor] = temp;
		}
	}
}
}
