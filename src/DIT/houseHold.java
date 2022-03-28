package DIT;

public class houseHold {
	public String AddressStr;
	public int occupantsInt;
	
	public houseHold (String address, int count) {
		this.AddressStr = address;
		this.occupantsInt = count;			
	}//
	
	public String getAddressStr() {
		return this.AddressStr;
	}
	public void setAddressStr(String address) {
		this.AddressStr= address;
	}	
	public int getoccupantsInt() {
		return this.occupantsInt;
	}
	public houseHold setoccupantsInt(int step) {
		this.occupantsInt = (this.occupantsInt + step);
		return null;
	}
}
