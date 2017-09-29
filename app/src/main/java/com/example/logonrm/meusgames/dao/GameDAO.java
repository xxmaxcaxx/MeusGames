package com.example.logonrm.meusgames.dao;

import com.activeandroid.query.Select;
import java.util.List;
import com.example.logonrm.meusgames.model.Game;
import com.example.logonrm.meusgames.model.Genero;

/**
 * Created by logonrm on 29/09/2017.
 */

public class GameDAO {
    public List<Game> findAll(){
        return new Select()
                .from(Game.class)
                .orderBy("titulo ASC")
                .execute();
    }
}
