package www.objectClass;

public class car {
	String modelName;
	String transmission;
	int doors;
	int cylinders;
	
	
		
	public void build(String modeal,String transmissionType,int noOfDoors,int noOfCylinders){
		
		modelName = modeal;
		transmission = transmissionType;
		doors = noOfDoors;
		cylinders = noOfCylinders;
	}
	public void carInforamtion(){
		String info = "Name :"+ modelName+ "Transmisson :"+transmission+"Doors :"+doors+"Cylinder:"+cylinders;
		System.out.println("Hear is Information for my Car: "+info);
	}
		
	}
				
	


