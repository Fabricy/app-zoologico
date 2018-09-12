package com.fabricy.zoologico.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.fabricy.zoologico.model.Especie;

import java.util.ArrayList;
import java.util.List;

public class EspecieDAO {
    public static void inserir(Context contexto, Especie especie){
        Conexao conn new Conexao(contexto);
        SQLiteDatabase banco = conn.getWritableDatabase();
        banco.execSQL("INSERT INTO especie ( nome ) VALUES " +
        " ('" + especie.getNome() +"') ");


    }
    public static List<Especie> getEspecies(Context contexto){
        List<Especie>listaDeEspecies = new ArrayList<>();
        Conexao conn = new Conexao(contexto);
        SQLiteDatabase banco = conn.getReadableDatabase();
        Cursor tabela = banco.rawQuery("SELECT * FROM Especie", null);
    }
}
