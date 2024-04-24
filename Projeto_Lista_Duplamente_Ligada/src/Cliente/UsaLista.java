/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cliente;

/**
 *
 * @author renan.mssouza
 */
import Lista.Lista;
import Modelo.Pessoa;
public class UsaLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Lista lista = new Lista();
    lista.inserir(new Pessoa ("Gerson",59));
    lista.inserir(new Pessoa ("caio",9));
    lista.inserir(new Pessoa ("vini",54));
    lista.inserir(new Pessoa ("lele",23));
    
    lista.Exibir();
    }
    
}
