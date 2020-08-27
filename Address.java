
package javaapplication3;

public class Address {
    
	private int HouseNumber;
	private String Street;
	private int ApartmentNumber;
	private String City;
	private String State;
	private String PostalCode;
	public Address(){
	}
	public Address(int ApartmentNumber){
		this.ApartmentNumber = ApartmentNumber;
	}

	
	public Address (int HouseNumber, String Street, int ApartmentNumber, String City, String State, String PostalCode)
	{
		this.HouseNumber = HouseNumber;
		this.Street = Street;
		this.ApartmentNumber = ApartmentNumber;
		this.City = City;
		this.State = State;
		this.PostalCode = PostalCode;	
	}

	
	public void display()
	{
		System.out.println("The street name is: "+Street);
	           System.out.println("The address is: "+ApartmentNumber + ","+HouseNumber + ","+City +","+PostalCode+","+State);
        }
                    
	
	public static void main(String[] args) {
		Address X = new Address(11, "Bijoy soroni", 5, "Dhaka", "Bangladesh", "1200");
		X.display();
	}

}