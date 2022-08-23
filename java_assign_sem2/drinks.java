public class drinks{
	
	String drinkname;
	double drinkprice;
	int drinkquantity;
	double drinktotalprice;
	
	//constructor
	public drinks(){
		drinkname = "";
		drinkprice = 0.0;
		drinkquantity = 0;
		drinktotalprice = 0.0;
	}
	
	public drinks(String drinkname, double drinkprice){
		this.drinkname = drinkname;
		this.drinkprice = drinkprice;
	}
	
	public drinks(String drinkname, double drinkprice, int drinkquantity, double drinktotalprice){
		this.drinkname = drinkname;
		this.drinkprice = drinkprice;
		this.drinkquantity = drinkquantity;
		this.drinktotalprice = drinktotalprice;
	}
	
	//accessor
	public String getdrinkname(){
		return this.drinkname;
	}
	
	public double getdrinkprice(){
		return this.drinkprice;
	}
	
	public int getdrinkquantity(){
		return this.drinkquantity;
	}
	
	public double getdrinktotalprice(){
		return this.drinktotalprice;
	}
	
	//mutator
	public void setdrinkname(String drinkname){
		this.drinkname = drinkname;
	}
	
	public void setdrinkprice(double drinkprice){
		this.drinkprice = drinkprice;
	}
	
	public void setdrinkquantity(int drinkquantity){
		this.drinkquantity = drinkquantity;
	}
	
	public void setdrinktotalprice(double drinktotalprice){
		this.drinktotalprice = drinktotalprice;
	}
	
	/*
	public static void main(String[] args){
		drinks drink1 = new drinks("orange juice", 12.5, 2, 25);
		System.out.println(drink1.drinkname);
		healthydrinks drink2 = new healthydrinks("applejuice", 15);
	}
	*/

}

//super class that extends
class healthydrinks extends drinks{
	healthydrinks(String drinkname, double drinkprice){
		super(drinkname, drinkprice);
		System.out.println("You call a superclass, and this drink is a healthy drinks - " + drinkname);
	}
}