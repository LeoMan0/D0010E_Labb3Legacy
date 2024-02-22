package labb3.modell;

public enum Väderstreck {


	// This class is cosmetic, and it only use is to be able to use the
	// words NORR etc instead of 0,1,2, and 3, but I digress
	NORR(0), ÖSTER(1), SÖDER(2), VÄSTER(3);
	// TODO: Lägg till en konstruktor som tar ett heltal och sparar det i
	// en dold heltalsvariabel (en instansvariabel). Skriv en instansmetod
	// index() som returnerar heltalsvariabeln. Ändra de fyra väderstrecken
	// så att
	//
	// NORR.index() returnerar 0,
	// ÖSTER.index() returnerar 1,
	// SÖDER.index() returnerar 2 och
	// VÄSTER.index() returnerar 3.

	private final int index;

	Väderstreck(int index){
		this.index=index;
	}

	public int index() {
		return this.index;
	}

}




