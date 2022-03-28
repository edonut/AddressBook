package DIT;

public class addressBook_Main {
	
	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) {
			
			//to do 
			//implement command line arguments for input and output
			customerData array[] = new customerData[] {new customerData("Dave","Smith","123 main st.","seattle","wa", 43), new customerData("Alice","Smith","123 Main St.","Seattle","WA", 45), new customerData("Bob","Williams","234 2nd Ave.","Tacoma","WA",26), new customerData("Carol","Johnson","234 2nd Ave","Seattle","WA",67), new customerData("Eve","Smith","234 2nd Ave.","Tacoma","WA",25), new customerData("Frank","Jones","234 2nd Ave.","Tacoma","FL",23), new customerData("George","Brown","345 3rd Blvd., Apt. 200","Seattle","WA",18), new customerData("Helen","Brown","345 3rd Blvd. Apt. 200","Seattle","WA",18), new customerData("Ian","Smith","123 main st ","Seattle","Wa",18), new customerData("Jane","Smith","123 Main St.","Seattle","WA",13)};
			houseHold array2[] = new houseHold[] {new houseHold(" ", 1),new houseHold(" ", 1),new houseHold(" ", 1), new houseHold(" ", 1), new houseHold(" ", 1), new houseHold(" ", 1), new houseHold(" ", 1), new houseHold(" ", 1), new houseHold(" ", 1)};
					
									
			//Output #1
			System.out.println("Number of occupants in Household, Household Adresss");
			int count=0;
			int count2=0;
			//for length of array count household members
			//pick all elements one by one
			for (int i=0; i < array.length-1; i++) {		
				//checked if the picked element is already printed
				int j;
				for ( j=0; j < array.length-1; j++) {
					if (array[i].addressStr==array[j].addressStr)  
						array2[i].AddressStr = array[i].addressStr;
						array2[i].occupantsInt++;
						count++;
						//break;	
						
					}
					if (i == j )
						count2++;
						array2[i].occupantsInt++;									
			}//end for
			System.out.println("Count = "+ count + ' ' + count2);
			for (int i = 0; i < array2.length; i++) {
				System.out.println(array2[i].occupantsInt);
				System.out.println(array2[i].AddressStr);
			}//end for
						
			
			//Output #2
			System.out.println('\n' + "Customers in Household older then 18");
			
			System.out.println("First and Last Name, Address, Age");
			
			//for the length of the array output customers older then 18
			for (int i = 0; i < array.length ; i++) {
				if (array[i].ageInt > 18) {
					System.out.println(array[i].getcustomerName() +" " + array[i].getcustomerAddress() + " " + array[i].ageInt);
				}//end if
			}//end for
			

		} //main

	}//End Class