public class Game {
	
	public static void main(String[] args){
		GameArena game1 = new GameArena(400,400);
		
		Spaceship ship1 = new Spaceship(200,200);
		ship1.addTo(game1);
		
		
		while (true){
			game1.pause();		
			
			
			if (game1.upPressed()) {
				ship1.move(0,-2);
			}
			if (game1.downPressed()) {
				ship1.move(0,2);
			}
			if (game1.leftPressed()) {
				ship1.move(-2,0);
			}
			if (game1.rightPressed()) {
				ship1.move(2,0);
			}
		}
		
		
	}
	
	
}