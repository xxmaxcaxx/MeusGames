package com.example.logonrm.meusgames.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by logonrm on 29/09/2017.
 */

@Table(name="genero")
public class Genero extends Model {

    @Column(name = "descricao")
    private String descricao;

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
}
