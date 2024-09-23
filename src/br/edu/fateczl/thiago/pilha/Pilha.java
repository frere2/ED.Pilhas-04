package br.edu.fateczl.thiago.pilha;

public class Pilha<T> {
    No<T> topo;

    public Pilha() {
        topo = null;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    public void push(T valor) {
        No<T> elemento = new No<>();
        elemento.dado = valor;
        elemento.proximo = topo;
        topo = elemento;
    }

    public T pop() throws Exception {
        if (isEmpty())
            throw new Exception("Pilha Vazia");

        T valor = topo.dado;
        topo = topo.proximo;
        return valor;
    }

    public T top() throws Exception {
        if (isEmpty())
            throw new Exception("Pilha Vazia");

        T valor = topo.dado;
        return valor;
    }

    public int size() {
        int cont = 0;
        if (!isEmpty()) {
            No<T> aux = topo;
            while (aux != null) {
                cont++;
                aux = aux.proximo;
            }
        }
        return cont;
    }
}
