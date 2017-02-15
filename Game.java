public class Game {
	
	public static void main(String[] args){
		GameArena game1 = new GameArena(400,400);

		
		
		Rectangle[] rects = new Rectangle[3];
		
		for (int i =0; i < rects.length; i++){
			rects[i] = new Rectangle((30*(i+1)),(30*(i+1)),10,10, "GREEN");
			game1.addRectangle(rects[i]);
		}
		rects[0].setXPosition(10);
		rects[1].setXPosition(30);
		rects[2].setXPosition(50);

		
		
		
	}
	
	
}