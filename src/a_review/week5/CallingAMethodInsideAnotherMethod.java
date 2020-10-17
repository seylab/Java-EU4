package a_review.week5;

public class CallingAMethodInsideAnotherMethod {

	public static void main(String[] args) {
		/**
		 * 
		 * wakeUp() ;
		 * 
		 * prepareTheKids() ;
		 * 		makeBreakfast();
		 * 		feedTheKids;
		 * 		dropTheKidsToSchool();
		 * 
		 * workAndLearn()
			  work()
			  attendClass()
		 * 
		 */
		
//		wakeUp();
		
		prepareTheKids();
		
		
		
	}
	 
	public static void wakeUp() {
		System.out.println("open one eye");
		System.out.println("close it and back to sleep");
		System.out.println("throw the alarm and wake up and drink coffee");
	}
	
	public static void prepareTheKids() {
		
		System.out.println("Prepare the kids method start");
		makeBreakfast();
		feedTheKids();
		dropTheKidsToSchool();
		
		System.out.println("Prepare the kids method end");
		
	}
	
	
	
	//makeBreakfast();
	public static void makeBreakfast() {
		
		System.out.println("make a turkish tea or coffee");
		System.out.println("cereal , egg , milk , toast");
	}
	
//	 * 		feedTheKids;
	public static void feedTheKids() {
		
		System.out.println("feed the kids with love , and nice food");
	}
	
//	 * 		dropTheKidsToSchool();
	public static void dropTheKidsToSchool() {
		
		System.out.println("pop up in the car, drive to school , dropoff");
	}
	
	
	
	
	
	

}
