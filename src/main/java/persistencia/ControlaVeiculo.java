/*
    Essa classe vai manipular os objetos, armazenando eles em algum lugar (vai controlar os objetos).
    Vamos usar o ArrayList para, mas também pode ser usado banco de dados para isso.

 */
package persistencia;

import java.util.ArrayList;
import negocio.Veiculo;

/**
 *
 * @author jorge
 */
public class ControlaVeiculo {
    
private    ArrayList<Veiculo> veiculos = new ArrayList<>();

public boolean Salvar (Veiculo v){
   if(v != null){ // Vai Verificar se v é diferente de nulo.
       veiculos.add(v);
       return true;
   }else{
       return false;
   }
}
// Para ver todos os veiculos cadastrodo  vamos usar o metodo a segir:

public ArrayList<Veiculo> RetornaTodos (){
    return veiculos; // Ele apenas retorna os veiculos que foram cadastrdos em veiculos.
    
    
}
    
    
    
}
