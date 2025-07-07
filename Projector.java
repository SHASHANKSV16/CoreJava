class Projector{
	static	boolean power ;
    static  int maxVolume = 10;
	static  int minVolume;
	static  int currVolume;
	
public static void power(){

		if(power){
		power = false;
		System.out.println("the projector is turned off");
		
		}else{
		power = true;
		System.out.println("the projector is turned on");
		
		}
		}
public static void increaseVol(){
		
		if(power){
			
		if(currVolume < maxVolume){
		currVolume = currVolume +1;
		System.out.println("the projector volume is " + currVolume);
		}else{
		System.out.println("max volume reached " + maxVolume);
		}
		}else{
		System.out.println("turn on projector");
		}

}

public static void decreaseVol(){
	if(power){
		
	if(currVolume > minVolume){
		currVolume = currVolume - 1;
		System.out.println("the projector volume is " + currVolume);
	}else{
		System.out.println("minimum volume reached " + minVolume);
		}
		
	}else{
		System.out.println("turn on projector");
		}
}


}