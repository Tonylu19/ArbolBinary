package com.mycompany.arbol_binario;

public class Arbol_Binario<Tipo> {

    private final NodoBinario<Tipo> raiz;

    public Arbol_Binario() {
        raiz = null;
    }

    public void inOrden() {
        if (raiz != null) {
            raiz.inOrden();
        }
    }

    public void postOrden() {
        if (raiz != null) {
            raiz.postOrden();
        }
    }

    public void preOrden() {
        if (raiz != null) {
            raiz.preOrden();
        }
    }

    public static void main(String[] args) {
        Arbol_Binario<Integer> arbol = new Arbol_Binario<>();

        System.out.println("Recorrido InOrden:");
        arbol.inOrden();

        System.out.println("\nRecorrido PostOrden:");
        arbol.postOrden();

        System.out.println("\nRecorrido PreOrden:");
        arbol.preOrden();
    }
}
