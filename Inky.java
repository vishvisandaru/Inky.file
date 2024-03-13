public class Inky{
	public Inky(String x){
	System.out.println(x);
	}
	public Inky(String pinky,String blinky,String rinky){
	System.out.println(blinky+"_"+pinky);
	System.out.println(pinky+"_"+rinky);
	System.out.println(blinky+"_"+pinky+"_"+rinky);
	}
	public static void main(String args[]){
	String pinky="Donky";
	Inky ponky=new Inky(pinky);
	String blinky="pinky";
	String rinky="monky";

	Inky ponky2=new Inky(pinky,blinky,rinky);
	}
}