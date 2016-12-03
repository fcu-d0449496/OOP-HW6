package fcu.iecs.oop.pokemon;

import java.util.Random;

public class GYM {
	public static Player fight(Player player1,Player player2){
		Random ran = new Random();
		int i,player1_win=0,player2_win=0;
		for(i=0;i<3;i++){
			if(player1.getPokemon()[i].getType()==PokemonType.FIRE&&player2.getPokemon()[i].getType()==PokemonType.GRASS||player1.getPokemon()[i].getType()==PokemonType.GRASS&&player2.getPokemon()[i].getType()==PokemonType.WATER||player1.getPokemon()[i].getType()==PokemonType.WATER&&player2.getPokemon()[i].getType()==PokemonType.FIRE)
				player1_win++;
			else if(player1.getPokemon()[i].getType()==player2.getPokemon()[i].getType()){
				if(player1.getPokemon()[i].getCp()>player2.getPokemon()[i].getCp())
					player1_win++;
				else if(player1.getPokemon()[i].getCp()==player2.getPokemon()[i].getCp()){
					if(ran.nextInt(2)+1==1)
						player1_win++;
					else
						player2_win++;
				}
				else
					player2_win++;
			}
			else
				player2_win++;
			if(player1_win==2||player2_win==2)
				break;
		}
		if(player1_win==2){
			player1.setLevel(player1.getLevel()+1);
			System.out.println("Winner is "+player1.getPlayerName()+", and his/her level becomes "+player1.getLevel()+".");
			return player1;
		}
		 if(player2_win==2){
			 player2.setLevel(player2.getLevel()+1);
			System.out.println("Winner is "+player2.getPlayerName()+", and his/her level becomes "+player2.getLevel()+".");
			return player2;
		 }
		return player2;
	}
}
