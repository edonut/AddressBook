package DIT;

//Classes and support methods for Address Book
//By  Joshua Baker


	public class customerData<java> {

		
		public int ageInt;
		public String streetStr;
		public String cityStr;
		public String stateStr;
		public String lastNameStr;
		public String firstNameStr;
		public String addressStr;
		
		public customerData(String firstName, String lastName, String street, String city, String state, int age) {
			// TODO Auto-generated constructor stub
			firstNameStr = firstName;
			lastNameStr = lastName;
			streetStr = street;
			cityStr = city;
			stateStr = state;
			ageInt = age;
			addressStr = (street.toUpperCase()+' '+city.toUpperCase()+' '+state.toUpperCase());
			
		return;

	}


	//get Name
	public String getcustomerName(){
		return(this.firstNameStr + ' ' + this.lastNameStr);	
	}//end get
	//get Address
	public String getcustomerAddress(){
		return(this.streetStr+ ' ' + this.cityStr+ ' ' + this.stateStr );
	}//end get	
	//get Address






} //end class

