package com.svalero.pokemon_api_01.lst_pokemons.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.svalero.pokemon_api_01.R;
import com.svalero.pokemon_api_01.entities.Pokemon;
import com.svalero.pokemon_api_01.lst_pokemons.LstPokemonContract;

import java.util.ArrayList;

public class LstPokemonActivity extends AppCompatActivity implements LstPokemonContract.View{
    private LstPokemonAdapter lstPokemonAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lst_pokemon);
    }

    @Override
    public void successLstpokemon(ArrayList<Pokemon> lstPokemon) {
        lstPokemonAdapter.adicionarListaPokemon(lstPokemon);

    }

    @Override
    public void failureLstPokemon(String error) {

    }
}