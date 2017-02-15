public class Spaceship {
	
	private int xPosition;
	private int yPosition;
	private Rectangle[] rects = new Rectangle[5];
	
	public Spaceship(int xPosition, int yPosition) {
				
		/*
		rects[0] = new Rectangle(175,205,10,30, "GREEN");
		rects[1] = new Rectangle(180,200,20,10, "GREEN");
		rects[2] = new Rectangle(190,195,15,30, "GREEN");
		rects[3] = new Rectangle(200,200,10,10, "GREEN");
		rects[4] = new Rectangle(205,205,10,30, "GREEN");
		*/
		rects[0] = new Rectangle((xPosition-25),(xPosition+5),10,30, "GREEN");
		rects[1] = new Rectangle((xPosition-20),(xPosition  ),20,10, "GREEN");
		rects[2] = new Rectangle((xPosition-10),(xPosition-5),15,30, "GREEN");
		rects[3] = new Rectangle((xPosition   ),(xPosition  ),10,10, "GREEN");
		rects[4] = new Rectangle((xPosition+5 ),(xPosition+5),10,30, "GREEN");
	}
	
	public void addTo(GameArena game) {
		for (int i =0; i < rects.length; i++){
			game.addRectangle(rects[i]);
		}
	}
	
	
	public void move(int xAmount, int yAmount) {
		for (int i=0; i < rects.length; i++) {
			rects[i].setXPosition( rects[i].getXPosition() + xAmount ) ;
			rects[i].setYPosition( rects[i].getYPosition() + yAmount ) ;
		}
	}
	
}