import java.util.*;

public class AarogyaHospital{

String name, gender, city, address, date, guardianName, guardianAddress,status;
int id, age;
long aadharNumber;
String contactNumber;
String gaurdianNumber;
int count;
boolean recovered;
private Object list;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getGuardianName() {
	return guardianName;
}
public void setGuardianName(String guardianName) {
	this.guardianName = guardianName;
}
public String getGuardianAddress() {
	return guardianAddress;
}
public void setGuardianAddress(String guardianAddress) {
	this.guardianAddress = guardianAddress;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public long getAadharNumber() {
	return aadharNumber;
}
public void setAadharNumber(long aadharNumber) {
	this.aadharNumber = aadharNumber;
}
public String  getContactNumber() {
	return contactNumber;
}
public void setContactNumber(String contactNumber2) {
	this.contactNumber = contactNumber2;
}
public String getGaurdianNumber() {
	return gaurdianNumber;
}
public void setGaurdianNumber(String gaurdianNumber2) {
	this.gaurdianNumber = gaurdianNumber2;
}
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
	
	   
public ArrayList<AarogyaHospital> input(ArrayList<AarogyaHospital> list,AarogyaHospital newpatient1 ){
	        
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the id");
 newpatient1.setId(sc.nextInt());
   
   System.out.println("Enter the patient name: ");
   newpatient1.setName(sc.next());
   
  
   
   System.out.println("Enter the patient gender: ");
   newpatient1.setGender(sc.next());
   
   boolean valid1 = false;
   sc.nextLine();
   String  aadharNumber;
   do{
   System.out.println("Enter the patient Aadhar Number: ");
    aadharNumber = sc.nextLine();
 
		 String strPattern = "[0-9]{12}$";
		 
		     
		if(aadharNumber.matches(strPattern)){
			 valid1 = true;
			 break;
		}
   else{
      System.out.println(" Please enter a valid 12-digit Aadhar number ");
   }
   }
   while(!valid1);
  newpatient1.setAadharNumber(Long.parseLong(aadharNumber));
  
  
   boolean valid2 = false;
   int age;
   do{	
	  System.out.println("Enter the patient age: ");
    age = sc.nextInt();
   
if (age >= 1 && age <= 100) {
		 
		 valid2 = true;
		 break;
}    
else {
 System.out.println("Enter the age between 1 & 100 ");
	 }
	}
	while(!valid2);
   newpatient1.setAge(age);
   
	boolean valid = false;
	sc.nextLine();
	String  contactNumber;
		do{
	  System.out.println("Enter the patient mobile number: ");
         contactNumber = sc.nextLine();
 
		 String strPattern = "(0/91)?[7-9][0-9]{9}";
		
		if(contactNumber.matches(strPattern)){
			 valid = true;
			 break;
		}
   else{
      System.out.println(" Please enter a valid 10-digit mobilenumber ");
   }
		}
   while(!valid);
		newpatient1.setContactNumber(contactNumber);
		
   
   
   System.out.println("Enter the patient city: ");
   newpatient1.setCity(sc.next());
   System.out.println("Enter the patient Address: ");
   newpatient1.setAddress(sc.next());
   
   System.out.println("Enter status ");
   newpatient1.setStatus(sc.next());
   System.out.println("Enter the guardian Name: ");
   newpatient1.setGuardianName(sc.nextLine());
   sc.next();
   System.out.println("Enter the guardian Address: ");
   newpatient1.setGuardianAddress(sc.next());
	boolean valid3 = false;
	
	sc.nextLine();
	String gaurdianNumber ;
	do{
  System.out.println("Enter the guardian contact number: ");
 gaurdianNumber = sc.nextLine();

	 String strPattern = "(0/91)?[7-9][0-9]{9}";
	
	if(gaurdianNumber.matches(strPattern)){
		 valid3 = true;
		 break;
	}
else{
  System.out.println(" Please enter a valid 10-digit mobilenumber ");
}
	}
while(!valid3);
	 newpatient1.setGaurdianNumber(gaurdianNumber);
	
   System.out.println();
   
   list.add(newpatient1);
   return list;
	
} 

	static long choices(Scanner sc){

System.out.println();
        System.out.println("==========>Welcome To AROGYA HOSPITALS<========");
		System.out.println("Press 1 for adding new member");
		System.out.println("Press 2 to view list of all available members");
		System.out.println("Press 3 to search member by ID");
		System.out.println("Press 4 to search member from a particular city");
		System.out.println("Press 5 to search member from a particular age group");
		System.out.println("Press 6 to mark recovery of a member");
		System.out.println("Press 7 to delete data of a member");
		System.out.println("Press 0 to exit");
		System.out.println();

      
 
 System.out.println("Choose any option: ");
	    long option=sc.nextLong();
 System.out.println();
	    return option;
	}
static void displaydetails(AarogyaHospital p)
{
System.out.println("Patient id: "+p.getId());
System.out.println("Patient Name: "+p.getName());
System.out.println("Patient Gender: "+p.getGender());
System.out.println("Patient Age: "+p.getAge());
System.out.println("Patient City: "+p.getCity());
System.out.println("Patient Contact Number: "+p.getContactNumber());
System.out.println("Patient Aadhar Number: "+p.getAadharNumber());
System.out.println("Patient address: "+p.getAddress());

System.out.println("status: "+p.getStatus());
System.out.println("Guardian name: "+p.getGuardianName());
System.out.println("Guradian address: "+p.getGuardianAddress());
System.out.println("Guradian contact number: "+p.getGaurdianNumber());
System.out.println();

}

	public static void main(String args[]){
		
		
ArrayList<AarogyaHospital> list=new ArrayList<AarogyaHospital>();
AarogyaHospital h = new AarogyaHospital();
Scanner sc=new Scanner(System.in);
Iterator<AarogyaHospital> i=list.iterator();

		while(true){
			long option=choices(sc);

			if(option==1){
   
				AarogyaHospital newpatient1 = new AarogyaHospital();
				
			ArrayList<AarogyaHospital> al=newpatient1.input(list, newpatient1);
				
			  list.add(al.get(0));
   	        }

	      else if(option==2){
          int count=0;
         i = list.iterator();
          while(i.hasNext())
            {
        	  AarogyaHospital p = (AarogyaHospital)i.next();
              displaydetails(p);
              count++;
              System.out.println("*");
            }
          if(count==0)
          {
            System.out.println("no data found");
          }

	       	}
		
	          else if(option==3){
               int count=0;
               System.out.println("enter search id");
               int sid=sc.nextInt();
               i=list.iterator();
               while(i.hasNext())
            {
            	   AarogyaHospital p = i.next();
              if(p.id==sid)
              {
              displaydetails(p);
                count++;
              System.out.println("*");
            }
	                }
               if(count==0)
          {
            System.out.println("no data found with "+sid);
          }
             }
			
			
	           else if(option==4){
               int count=0;
                System.out.println("enter city");
               String scity=sc.next();
               i=list.iterator();
               while(i.hasNext())
            {
              AarogyaHospital p = i.next();
              if(p.city.equals(scity))
              {
              displaydetails(p);
                count++;
              System.out.println("*");   
            }
	                }
               if(count==0)
          {
            System.out.println("no data found with "+scity);
          }
	               }
			
	          else if(option==5){
              int count=0;
              System.out.println("enter start age");
               int sage=sc.nextInt();
              System.out.println("enter end age");
               int eage=sc.nextInt();
               i=list.iterator();
               while(i.hasNext())
            {
              AarogyaHospital p = i.next();
              if(p.age>=sage&&p.age<=eage)
              {
              displaydetails(p);
                count++;
              System.out.println("*");
                
            }
	                }
              if(count==0)
          {
            System.out.println("no data found in this age group");
          }
	       }
	             
	             else if(option==6){
	            System.out.println("Enter the patient id: ");
               int id = sc.nextInt();
              int count = 0;
               i = list.iterator();
               while(i.hasNext())
                 {
                   AarogyaHospital p = i.next();
                 
                     if(p.id==id)
                     {
                       System.out.println("Patient "+p.id+" is recovered");
                       count++;
                     }
                  
                 }
              if(count==0)
              {
                System.out.println("Patient information is wrong");
              }
                    
	              }
	              
	              else if(option==7){
             
             System.out.println("Enter the patient id: ");
               int id = sc.nextInt();
               i = list.iterator();
               while(i.hasNext())
                 {
                   AarogyaHospital p = i.next();
                   
                   if(p.id == id)
                   {
                     i.remove();
                     
                     System.out.println("Successfully deleted");
                   }
                     
                   
                   
                 }
               System.out.println();


	              }
			
	              else if(option==0){
	             break;
	             }
            else
           {
             System.out.println("try again with correct option");
             System.out.println();
           }
		}
	}
}

