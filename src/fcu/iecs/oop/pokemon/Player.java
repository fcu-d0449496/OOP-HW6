package fcu.iecs.oop.pokemon;

public class Player {
	private String playerName;
	private Pokemon[] Pokemon;
	private int level;
	public Player(String playerName){
		this.playerName=playerName;
		this.level=1;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Pokemon[] getPokemon() {
		return Pokemon;
	}
	public void setPokemons(Pokemon[] pokemon) {
		Pokemon = pokemon;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
}
