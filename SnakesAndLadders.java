public class SnakesAndLadders {
	public static final int IS_LADDER=0;
	public static final int IS_SNAKE=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println("Let the Game Begin !!");
		int pos =0;
		int CheckChance = (int) (Math.floor(Math.random()*10)%3);
			
			switch(CheckChance) {
				case  IS_LADDER :
					pos = pos+roll;
					break;
				case IS_SNAKE :
					pos = pos-roll;
					break;
				default:
					pos=pos;	
					
			}
		}
	}
