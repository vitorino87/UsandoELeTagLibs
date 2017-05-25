/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author tiago.lucas
 */
public class Produto {
private int codigo;
private String descricao;
private String unidadeMedida;
private int quantidade;

public int getCodigo(){
    return codigo;
}
public void setCodigo(int codigo){
    this.codigo = codigo;
}
public String getDescricao(){
    return descricao;
}
public void setDescricao(String descricao){
    this.descricao = descricao;
}
public String getUnidadeMedida(){
    return unidadeMedida;
}
public void setUnidadeMedida(String unidadedeMedida){
    this.unidadeMedida = unidadedeMedida;
}
public int getQuantidade(){
    return quantidade;
}
public void setQuantidade(int quantidade){
    this.quantidade = quantidade;
}
}
