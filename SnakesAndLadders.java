public class SnakesAndLadders {
	public static final int IS_LADDER=0;
	public static final int IS_SNAKE=1;	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println("Let the Game Begin !!");
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
					int PosNew = pos+roll;
					if (PosNew>100) {
						pos=pos;
					}
					else {
						pos=PosNew;
					}
					break;
				case IS_SNAKE :
					pos = pos-roll;
					if (pos>=0) {
						pos=pos;
					}
					else {
						pos=0;
					}
					break;
				default:
					pos=pos;	
					
			}
			
		}while(pos!=100);
		}
	}
