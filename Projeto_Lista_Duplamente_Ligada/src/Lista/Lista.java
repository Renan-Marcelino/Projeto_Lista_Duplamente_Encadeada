/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista;

/**
 *
 * @author renan.mssouza
 */
import Modelo.Pessoa;

public class Lista {
    
    private Celula inicio, atual, aux;
    
    public boolean isListaVazia() {
        return inicio == null;
    }
    
    public void inserir(Object objeto) {
        if (isListaVazia()) {
            inicio = new Celula(null, null, objeto);
            aux = inicio;
        } else {
            atual = new Celula(aux, null, objeto);
            aux.setProx(atual);
            aux = atual;
        }
    }
    
    public void Exibir() {
        Celula c = inicio;
        while (c != null) {
            System.out.println(c.getDados());
            c = c.getProx();
        }
    }
    
    public Celula pesquisar(int id, Celula p) {
        Pessoa pessoa;
        while (p != null) {
            pessoa = (Pessoa) p.getDados();
            if (id == pessoa.getId()) {
                return p;
            }
            p = p.getProx();
        }        
        
        return null;
    }
    
    public boolean remover(int id) {
        Celula p = pesquisar(id, inicio);
        if (p != null) {
            if (p == inicio) {
                inicio = p.getProx();
                p.setProx(null);
                inicio.setAnt(null);
            } else if (p == atual) {
                atual = p.getAnt();
                aux = atual;
                atual.setProx(null);
                p.setAnt(null);
            } else {
                p.getAnt().setProx(p.getProx());
                p.getProx().setAnt(p.getAnt());
            }
            return true;
        }
        
        return false;
    }
}
