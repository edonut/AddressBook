package DIT;

//Classes and support methods for Address Book
//By  Joshua Baker


	public class customerData<java> {

		
		private int ageInt;
		private String streetStr;
		private String cityStr;
		private String stateStr;
		private String lastNameStr;
		private String firstNameStr;
		private String addressStr;
		
		public customerData(String firstName, String lastName, String street, String city, String state, int age) {
			// TODO Auto-generated constructor stub
			firstNameStr = firstName;
			lastNameStr = lastName;
			streetStr = street;
			cityStr = city;
			stateStr = state;
			ageInt = age;
			
		return;

	}



	public customerData<java> setcustomerData(String firstName, String lastName, String street, String city, String state, int age) {
		// TODO Auto-generated constructor stub
		firstNameStr = firstName;
		lastNameStr = lastName;
		streetStr = street;
		cityStr = city;
		stateStr = state;
		addressStr = (street.toUpperCase()+ ' ' + city.toUpperCase() + ' ' + state.toUpperCase());
		ageInt = age;	
		
	return(this);
	}// end customerData constructor
	
	//get Age
	public int getcustomerAge(){
		return(this.ageInt);
	}//end get
	
	//get Name
	public String getcustomerName(){
		return(this.firstNameStr + ' ' + this.lastNameStr);	
	}//end get
	//get Address
	public String getcustomerAddress(){
		return(this.streetStr+ ' ' + this.cityStr+ ' ' + this.stateStr );
	}//end get	
	//get Address
	public String getaddressStr(){
		return(this.addressStr );
	}//end get 

} //end class

