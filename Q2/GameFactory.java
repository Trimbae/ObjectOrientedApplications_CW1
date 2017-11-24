public class GameFactory{

	public GameInterface createGame(String gameType) throws Exception{

		if(gameType.equals('c')){
			return new CardGame();
		}
		else if (gameType.equals('d')){
			return new DieGame();
		}
		else{
			return null;
		}

	}
}