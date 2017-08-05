package learnFinal;

public class Class2 extends Class1{
	
	public Class2(){
		super();
	}

	public void m1(){
		txt = "DEF";
	}

	public void m2(){

	}
	
	public void m3(){
		super.m2();
		System.out.println(txt);
	}
	
	

}
