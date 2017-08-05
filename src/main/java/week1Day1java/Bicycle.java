package week1Day1java;

public class Bicycle {
	
	int wheels = 2;
	
	public void applyBrake(){
		System.out.println("I applied Brake");
	}
	
	public boolean isPuncture(boolean bWheelsflat){
		boolean bStatus;
		if(bWheelsflat == true){
			bStatus = true;			
		}else {
			bStatus = false;
		}
		return bStatus;
	}
	
	/*public void findMyStatus(){
		
		System.out.println(bStatus);
		applyBrake();
	}*/
	
	public boolean isMyColorRed(String brandName){
		if(brandName.equals("BSA")){
			return true;
		}else if(brandName.equals("Hercules")){
			return false;
		}
		return false;
	}

}










