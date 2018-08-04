
//Interface Training 
abstract public class Training {
	
	//Parameterised Constructor
	Training(String name,int fees) {
		this.fees=fees;
		subject=name;
	}
	
	//Instance Variable
	private int id;
	private String subject;
	public int fees;
	
	abstract public void disp();
	
}

//Public Traing Class extends Training
public class PublicTraining extends Training {

	//Parameterised Constructor
	 public PublicTraining(String name,int fees, int participants) {
		super(name,fees);
		this.name=name;
		this.participants=participants;
		
	}
	
	private String name;
	private int participants;
	private int cost;
	
	
	//Method getOrderValue for returning cost
	public int getOrderValue() {
		this.cost=participants*fees;
		return cost;
	}
	
	//Display Method  for displaying course
	public void disp() {
		System.out.println("Training cost for "+name+" course is "+getOrderValue());
	}
}

//Class Corporate Training inherits Training
public class CorporateTraining extends Training {
	
	//Parameterised Constructor
	public CorporateTraining(String name,int fees, int days){
		 super(name,fees);
		this.name=name;
		this.days=days;
		
	} 
	
	private int days;
	private int cost;
	private String name;
	
	//Method getOrderValue for returning cost
	public int getOrderValue() {
		this.cost=days*fees;
		return cost;
	}
	
	//Display Method  for displaying course
	public void disp() {
		System.out.println("Training cost for "+name+" course is "+getOrderValue());
	}

}


public class TrainingTest {
 
	public static void main(String args[]) {
		Training publicTraining=new PublicTraining("Java",5000,50); 		//Passing values to Class Public Training
		publicTraining.disp();
		
		Training corporateTraining=new CorporateTraining("Big Data",35000,4);	//Passing values to Class Corporate Training
		corporateTraining.disp();
		
	}
}

