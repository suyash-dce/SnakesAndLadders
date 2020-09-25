public class SnakesAndLadders {
	public static final int IS_LADDER=0;
	public static final int IS_SNAKE=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println("Let the Game Begin !!");
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
		//Variables
		int pos=0;
=======
		int roll = (int) (Math.floor((Math.random()*6))+1);
>>>>>>> UC-2-DiceRoll
=======
		int pos =0;
		int CheckChance = (int) (Math.floor(Math.random()*10)%3);
			
			switch(CheckChance) {
				case  IS_LADDER :
					pos = pos+roll;
					break;
				case IS_SNAKE :
					pos = pos-roll;
=======
		//Variables
		int i =0;
		int pos =0;
		//Computation
		do {
			
			i = i+1;
			int roll = (int) (Math.floor((Math.random()*6))+1);
			
			int CheckChance = (int) (Math.floor(Math.random()*10)%3);
			
			switch(CheckChance) {
				case  IS_LADDER :
					int pos = pos+roll;
					break;
				case IS_SNAKE :
					pos = pos-roll;
					if (pos>=0) {
						pos=pos;
					}
					else {
						pos=0;
					}
>>>>>>> UC-4-PlayerWins
					break;
				default:
					pos=pos;	
					
			}
<<<<<<< HEAD
>>>>>>> UC-3-CheckMovement
=======
		}while(pos<100)
>>>>>>> UC-4-PlayerWins
		}
	}
