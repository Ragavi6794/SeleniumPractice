package org.constructor;

public class ConSuper extends SuperClass {
  String shop="POORVIKA";
	ConSuper(){   
		
		super("OPPO",20000); //super() method
		this.showroom();
		// this(2023, 6);     //always call first
		System.out.println("\n Child Class Default constructor \n");
	//	super.mobilePhone(); //call parent class method throuh constructor
	}
	ConSuper(int model,int cap){
		System.out.println("\n Child Parameter cons" +model +cap);
		super.mobilePhone();
	}
	ConSuper(String customer){
		this(2023,6); 
		System.out.println("\n Customer:" +customer );
//		System.out.println("Model: " +super.mobile); //not assign for instance var get null
//		System.out.println("Price: " +super.price);//get 0
		System.out.println("Shop: " +this.shop);
		System.out.println("Location: " +super.locate);
	}
	private void showroom() {
		System.out.println("Welcome Our Poorvika");
	}
	public static void main(String[] args) {
		ConSuper su=new ConSuper();
		ConSuper su1=new ConSuper("Ragavi");
		
		
	}

}
