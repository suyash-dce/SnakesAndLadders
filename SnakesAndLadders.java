public class SnakesAndLadders {
<<<<<<< HEAD
	public static final int IS_LADDER=0;
<<<<<<< HEAD
	public static final int IS_SNAKE=1;
=======

	public static final int IS_LADDER=0;
	public static final int IS_SNAKE=1;
	
>>>>>>> UC-7-Player2Compete
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Let the Game Begin !!");
<<<<<<< HEAD
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
=======
	public static final int IS_SNAKE=1;	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println("Let the Game Begin !!");
>>>>>>> UC-5-ExactWinPosition
		//Variables
		int i =0;
		int pos =0;
=======
		//variables
		int[] pos = new int[] {0,0};		
		int i =0;
>>>>>>> UC-7-Player2Compete
		//Computation
		do {
			
			i = i+1;
<<<<<<< HEAD
			int roll = (int) (Math.floor((Math.random()*6))+1);
			
			int CheckChance = (int) (Math.floor(Math.random()*10)%3);
			
			switch(CheckChance) {
				case  IS_LADDER :
<<<<<<< HEAD
					int pos = pos+roll;
=======
					int PosNew = pos+roll;
					if (PosNew>100) {
						pos=pos;
					}
					else {
						pos=PosNew;
					}
>>>>>>> UC-5-ExactWinPosition
					break;
				case IS_SNAKE :
					pos = pos-roll;
					if (pos>=0) {
						pos=pos;
					}
					else {
						pos=0;
					}
<<<<<<< HEAD
>>>>>>> UC-4-PlayerWins
=======
>>>>>>> UC-5-ExactWinPosition
					break;
				default:
					pos=pos;	
					
			}
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> UC-3-CheckMovement
=======
		}while(pos<100)
>>>>>>> UC-4-PlayerWins
=======
			
		}while(pos!=100);
>>>>>>> UC-5-ExactWinPosition
=======
			for (int j=0;j<=1;j++) {
				
			
					int roll = (int) (Math.floor((Math.random()*6))+1);
					
					int CheckChance = (int) (Math.floor(Math.random()*10)%3);
					
					switch(CheckChance) {
						case  IS_LADDER :
							int posNew = pos[j]+roll;
							if (posNew>100) {
								pos[j]=pos[j];
							}
							else {
								pos[j]=posNew;
							}
							break;
						case IS_SNAKE :
							pos[j] = pos[j]-roll;
							if (pos[j]>=0) {
								pos[j]=pos[j];
							}
							else {
								pos[j]=0;
							}
							break;
						default:
							pos[j]=pos[j];	
							
					}
					System.out.println("Chance of Player "+(j+1)+" with ChanceNo: "+i);
					System.out.println("Current Poition: "+pos[j]);

					if (CheckChance == IS_LADDER) {
						j=j-1;
					}
					
			}	
			if (pos[0]==100 || pos[1]==100)
				break;
					
		}while(pos[0]!=100 || pos[1]!=100);
		//System.out.println("\n\nChances took to Complete the Game: "+i);
		if(pos[0]==100) {
			System.out.println("Player 1 WINS !!");
>>>>>>> UC-7-Player2Compete
		}
		else {
			System.out.println("Player 2 WINS !!");
		}

	}

}
