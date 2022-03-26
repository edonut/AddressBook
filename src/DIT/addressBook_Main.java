package DIT;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class addressBook_Main {
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
			
			//to do 
			//implement command line arguments for input and output

			
			// createArray of Customer Data
			//Fill it with the test Data Slow and bad method but by passes reading form a file and parsing a string
			@SuppressWarnings("rawtypes")
			customerData array[] = new customerData[] {new customerData("Dave","Smith","123 main st.","seattle","wa", 43), new customerData("Alice","Smith","123 Main St.","Seattle","WA", 45), new customerData("Bob","Williams","234 2nd Ave.","Tacoma","WA",26), new customerData("Carol","Johnson","234 2nd Ave","Seattle","WA",67), new customerData("Eve","Smith","234 2nd Ave.","Tacoma","WA",25), new customerData("Frank","Jones","234 2nd Ave.","Tacoma","FL",23), new customerData("George","Brown","345 3rd Blvd., Apt. 200","Seattle","WA",18), new customerData("Helen","Brown","345 3rd Blvd. Apt. 200","Seattle","WA",18), new customerData("Ian","Smith","123 main st ","Seattle","Wa",18), new customerData("Jane","Smith","123 Main St.","Seattle","WA",13)};
			customerData newArray[] = array;	
						
			//Output #1
			System.out.println("Number of occupants in Household, Household Adresss");
			
			//for length of array count household members
			newArray = (customerData[]) Arrays.stream(array).distinct().toArray();
			//traverse array and create List
			
						
			for (int i = 0; i < array.length ; i++) {
			
				System.out.println("Number"  + ' ' + array[i].getcustomerAddress());
					
			}//end for 
			
			//Output #2
			System.out.println('\n' + "Customers in Household older then 18");
			
			System.out.println("First and Last Name, Address, Age");
			
			//for the length of the array output customers older then 18
			for (int i = 0; i < array.length ; i++) {
				if (array[i].getcustomerAge() > 18) {
					System.out.println(array[i].getcustomerName() +" " + array[i].getcustomerAddress() + " " + array[i].getcustomerAge());
				}//end if
			}//end for
			

		} //main

	}//End Class