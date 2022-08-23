import java.util.Scanner;
import java.util.InputMismatchException;

public class juiceshop{
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){
		
		
		//create the choice selection
		int choice;
		
		
		drinks[] juice = new drinks[10];
		juice[0] = new drinks("Apple Juice", 6);
		juice[1] = new drinks("Orange Juice", 5.5);
		juice[2] = new drinks("Mango Juice", 6.5);
		juice[3] = new drinks("Grape Juice", 7);
		juice[4] = new drinks("Peach Juice", 8);
		juice[5] = new drinks("Watermelon Juice", 9);
		juice[6] = new drinks("Strawberry Juice", 7.5);
		juice[7] = new drinks("Avacado Juice", 12);
		juice[8] = new drinks("Pineapple Juice", 8);
		juice[9] = new drinks("Honeydrew Juice", 8.5);
		
		do{
			mainmenu();
			choice = input.nextInt();
			System.out.println("\n");
			switch(choice){
				case 1 : openmenu(juice); break;
				case 2 : madeorder(juice); break;
				case 3 : canceldrinks(juice); break;
				case 4 : madepayment(juice); break;
				default : if(choice !=5){
					System.out.println("Invalid Input, please enter again.");
				}
			}
		}while(choice !=5);	
	}
	
	public static void mainmenu(){
		System.out.println("**********3DIRECT JUICE STORE************");
		System.out.println("-----------------Welcome-----------------");
		System.out.println("=========================================");
		System.out.println("1. Open Juice Menu");
		System.out.println("2. Add Drinks");
		System.out.println("3. Cancel Drinks");
		System.out.println("4. Proceed to Payment");
		System.out.println("5. Cancel Order\n");
		System.out.print("Enter 1-5 to proceed or cancel your order : ");
	}
	
	
	//open menu
	public static void openmenu(drinks[] juice){
		System.out.println("\n\n\n");		
		System.out.println("***********Juice Menu***********");
		System.out.println("================================");
		System.out.printf("%-4s %-15s %-10s", " ", "Juice","Price (RM) \n");
		System.out.println("================================");
		
		for (int i = 0; i < juice.length; i++) {
		System.out.printf("\n%-3d %-20s %.2f",(i+1), juice[i].getdrinkname(), juice[i].getdrinkprice());
		}
		
		System.out.println("\n\n\n");
	}
	
	//made order
	public static void madeorder(drinks[] juice){
		System.out.println("***********Juice Menu***********");
		System.out.println("================================");
		System.out.printf("%-4s %-15s %-10s", " ", "Juice ID","Price (RM) \n");
		System.out.println("================================");
		
		for (int i = 0; i < juice.length; i++) {
		System.out.printf("\n%-3d %-20s %.2f",(i+1), juice[i].getdrinkname(), juice[i].getdrinkprice());
		}
		System.out.println("\n\n");
		System.out.print("Please enter the juice ID(1-10) : ");
		int juiceID = input.nextInt();
		
		System.out.print("\nPlease enter the quantity of juice : ");
		int quantity = input.nextInt();
		
		//throw exception if wrong input type
		try{
			switch(juiceID){
			case 1 : {
				juice[0].drinkquantity += quantity;
				juice[0].drinktotalprice = juice[0].drinkquantity * juice[0].drinkprice;
				juice[0].setdrinkquantity(juice[0].drinkquantity);
				juice[0].setdrinktotalprice(juice[0].drinktotalprice);
			}break;
			case 2 : {
				juice[1].drinkquantity += quantity;
				juice[1].drinktotalprice = juice[1].drinkquantity * juice[1].drinkprice;
				juice[1].setdrinkquantity(juice[1].drinkquantity);
				juice[1].setdrinktotalprice(juice[1].drinktotalprice);
			}break;
			case 3 : {
				juice[2].drinkquantity += quantity;
				juice[2].drinktotalprice = juice[2].drinkquantity * juice[2].drinkprice;
				juice[2].setdrinkquantity(juice[2].drinkquantity);
				juice[2].setdrinktotalprice(juice[2].drinktotalprice);
			}break;
			case 4 : {
				juice[3].drinkquantity += quantity;
				juice[3].drinktotalprice = juice[3].drinkquantity * juice[3].drinkprice;
				juice[3].setdrinkquantity(juice[3].drinkquantity);
				juice[3].setdrinktotalprice(juice[3].drinktotalprice);
			}break;
			case 5 : {
				juice[4].drinkquantity += quantity;
				juice[4].drinktotalprice = juice[4].drinkquantity * juice[4].drinkprice;
				juice[4].setdrinkquantity(juice[4].drinkquantity);
				juice[4].setdrinktotalprice(juice[4].drinktotalprice);
			}break;
			case 6 : {
				juice[5].drinkquantity += quantity;
				juice[5].drinktotalprice = juice[5].drinkquantity * juice[5].drinkprice;
				juice[5].setdrinkquantity(juice[5].drinkquantity);
				juice[5].setdrinktotalprice(juice[5].drinktotalprice);
			}break;
			case 7 : {
				juice[6].drinkquantity += quantity;
				juice[6].drinktotalprice = juice[6].drinkquantity * juice[6].drinkprice;
				juice[6].setdrinkquantity(juice[6].drinkquantity);
				juice[6].setdrinktotalprice(juice[6].drinktotalprice);
			}break;
			case 8 : {
				juice[7].drinkquantity += quantity;
				juice[7].drinktotalprice = juice[7].drinkquantity * juice[7].drinkprice;
				juice[7].setdrinkquantity(juice[7].drinkquantity);
				juice[7].setdrinktotalprice(juice[7].drinktotalprice);
			}break;
			case 9 : {
				juice[8].drinkquantity += quantity;
				juice[8].drinktotalprice = juice[8].drinkquantity * juice[8].drinkprice;
				juice[8].setdrinkquantity(juice[8].drinkquantity);
				juice[8].setdrinktotalprice(juice[8].drinktotalprice);
			}break;
			case 10 : {
				juice[9].drinkquantity += quantity;
				juice[9].drinktotalprice = juice[9].drinkquantity * juice[9].drinkprice;
				juice[9].setdrinkquantity(juice[9].drinkquantity);
				juice[9].setdrinktotalprice(juice[9].drinktotalprice);
			}break;
			default: System.out.println("Invalid Juice ID. Please Try Again.");
		}
		Currentorderlist(juice);
		}catch(InputMismatchException ex){
			System.out.println(ex);
		}
	}
	
	//check order list
	public static void Currentorderlist(drinks[] juice){
		System.out.println("\n\n");
		System.out.println("\t\t***********Your Current Order************");
		System.out.println("----------------------------------------------------------------------------");
		System.out.printf(" %-5s %-12s %-10s %-15s %-20s" ," ", "Juice", "Quantity", "Unit Price", "Total Price (RM)");
		System.out.println("\n----------------------------------------------------------------------------");
		
		for (int i = 0; i < juice.length; i++) {
			
			if (juice[i].getdrinkquantity() > 0) {
				System.out.printf("\n %-2d %-18s %-10s %.2f %17.2f",(i+1), juice[i].getdrinkname(), (int)juice[i].getdrinkquantity(), juice[i].getdrinkprice(), juice[i].getdrinktotalprice());
			}	
		}
		System.out.println("\n");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("\n");
	}
	
	//cancel drinks
	public static void canceldrinks(drinks[] juice){
		System.out.println("\t\t**************Cancel Drinks**************");
		System.out.println("----------------------------------------------------------------------------");
		System.out.printf(" %-5s %-12s %-10s %-15s %-20s" ," ", "Juice", "Quantity", "Unit Price", "Total Price (RM)");
		System.out.println("\n----------------------------------------------------------------------------");
		
		for (int i = 0; i < juice.length; i++) {
			
			if (juice[i].getdrinkquantity() > 0) {
				System.out.printf("\n %-2d %-18s %-10s %.2f %17.2f",(i+1), juice[i].getdrinkname(), (int)juice[i].getdrinkquantity(), juice[i].getdrinkprice(), juice[i].getdrinktotalprice());
			}	
		}
		
		System.out.print("\n\nPlease enter the drink ID you want to cancel(1-10) : ");
		int juiceID = input.nextInt();
		
		System.out.print("\nPlease enter the quantity you want to cancel : ");
		int quantity = input.nextInt();
		
			try{
			switch(juiceID){
			case 1 : {
				if(quantity <= juice[0].drinkquantity){
					juice[0].drinkquantity -= quantity;
					juice[0].drinktotalprice = juice[0].drinkquantity * juice[0].drinkprice;
					juice[0].setdrinkquantity(juice[0].drinkquantity);
					juice[0].setdrinktotalprice(juice[0].drinktotalprice);
				}else{
					juice[0].drinkquantity = 0;
					juice[0].drinktotalprice = juice[0].drinkquantity * juice[0].drinkprice;
					juice[0].setdrinkquantity(juice[0].drinkquantity);
					juice[0].setdrinktotalprice(juice[0].drinktotalprice);
				}
			}break;
			case 2 : {
				if(quantity <= juice[1].drinkquantity){
					juice[1].drinkquantity -= quantity;
					juice[1].drinktotalprice = juice[1].drinkquantity * juice[1].drinkprice;
					juice[1].setdrinkquantity(juice[1].drinkquantity);
					juice[1].setdrinktotalprice(juice[1].drinktotalprice);
				}else{
					juice[1].drinkquantity = 0;
					juice[1].drinktotalprice = juice[1].drinkquantity * juice[1].drinkprice;
					juice[1].setdrinkquantity(juice[1].drinkquantity);
					juice[1].setdrinktotalprice(juice[1].drinktotalprice);
				}
			}break;
			case 3 : {
				if(quantity <= juice[2].drinkquantity){
					juice[2].drinkquantity -= quantity;
					juice[2].drinktotalprice = juice[2].drinkquantity * juice[2].drinkprice;
					juice[2].setdrinkquantity(juice[2].drinkquantity);
					juice[2].setdrinktotalprice(juice[2].drinktotalprice);
				}else{
					juice[2].drinkquantity = 0;
					juice[2].drinktotalprice = juice[2].drinkquantity * juice[2].drinkprice;
					juice[2].setdrinkquantity(juice[2].drinkquantity);
					juice[2].setdrinktotalprice(juice[2].drinktotalprice);
				}
			}break;
			case 4 : {
				if(quantity <= juice[3].drinkquantity){
					juice[3].drinkquantity -= quantity;
					juice[3].drinktotalprice = juice[3].drinkquantity * juice[3].drinkprice;
					juice[3].setdrinkquantity(juice[3].drinkquantity);
					juice[3].setdrinktotalprice(juice[3].drinktotalprice);
				}else{
					juice[3].drinkquantity = 0;
					juice[3].drinktotalprice = juice[3].drinkquantity * juice[3].drinkprice;
					juice[3].setdrinkquantity(juice[3].drinkquantity);
					juice[3].setdrinktotalprice(juice[3].drinktotalprice);
				}
			}break;
			case 5 : {
				if(quantity <= juice[4].drinkquantity){
					juice[4].drinkquantity -= quantity;
					juice[4].drinktotalprice = juice[4].drinkquantity * juice[4].drinkprice;
					juice[4].setdrinkquantity(juice[4].drinkquantity);
					juice[4].setdrinktotalprice(juice[4].drinktotalprice);
				}else{
					juice[4].drinkquantity = 0;
					juice[4].drinktotalprice = juice[4].drinkquantity * juice[4].drinkprice;
					juice[4].setdrinkquantity(juice[4].drinkquantity);
					juice[4].setdrinktotalprice(juice[4].drinktotalprice);
				}
			}break;
			case 6 : {
				if(quantity <= juice[5].drinkquantity){
					juice[5].drinkquantity -= quantity;
					juice[5].drinktotalprice = juice[5].drinkquantity * juice[5].drinkprice;
					juice[5].setdrinkquantity(juice[5].drinkquantity);
					juice[5].setdrinktotalprice(juice[5].drinktotalprice);
				}else{
					juice[5].drinkquantity = 0;
					juice[5].drinktotalprice = juice[5].drinkquantity * juice[5].drinkprice;
					juice[5].setdrinkquantity(juice[5].drinkquantity);
					juice[5].setdrinktotalprice(juice[5].drinktotalprice);
				}
			}break;
			case 7 : {
				if(quantity <= juice[6].drinkquantity){
					juice[6].drinkquantity -= quantity;
					juice[6].drinktotalprice = juice[6].drinkquantity * juice[6].drinkprice;
					juice[6].setdrinkquantity(juice[6].drinkquantity);
					juice[6].setdrinktotalprice(juice[6].drinktotalprice);
				}else{
					juice[6].drinkquantity = 0;
					juice[6].drinktotalprice = juice[6].drinkquantity * juice[6].drinkprice;
					juice[6].setdrinkquantity(juice[6].drinkquantity);
					juice[6].setdrinktotalprice(juice[6].drinktotalprice);
				}
			}break;
			case 8 : {
				if(quantity <= juice[7].drinkquantity){
					juice[7].drinkquantity -= quantity;
					juice[7].drinktotalprice = juice[7].drinkquantity * juice[7].drinkprice;
					juice[7].setdrinkquantity(juice[7].drinkquantity);
					juice[7].setdrinktotalprice(juice[7].drinktotalprice);
				}else{
					juice[7].drinkquantity = 0;
					juice[7].drinktotalprice = juice[7].drinkquantity * juice[7].drinkprice;
					juice[7].setdrinkquantity(juice[7].drinkquantity);
					juice[7].setdrinktotalprice(juice[7].drinktotalprice);
				}
			}break;
			case 9 : {
				if(quantity <= juice[8].drinkquantity){
					juice[8].drinkquantity -= quantity;
					juice[8].drinktotalprice = juice[8].drinkquantity * juice[8].drinkprice;
					juice[8].setdrinkquantity(juice[8].drinkquantity);
					juice[8].setdrinktotalprice(juice[8].drinktotalprice);
				}else{
					juice[8].drinkquantity = 0;
					juice[8].drinktotalprice = juice[8].drinkquantity * juice[8].drinkprice;
					juice[8].setdrinkquantity(juice[8].drinkquantity);
					juice[8].setdrinktotalprice(juice[8].drinktotalprice);
				}
			}break;
			case 10 : {
				if(quantity <= juice[9].drinkquantity){
					juice[9].drinkquantity -= quantity;
					juice[9].drinktotalprice = juice[9].drinkquantity * juice[9].drinkprice;
					juice[9].setdrinkquantity(juice[9].drinkquantity);
					juice[9].setdrinktotalprice(juice[9].drinktotalprice);
				}else{
					juice[9].drinkquantity = 0;
					juice[9].drinktotalprice = juice[9].drinkquantity * juice[9].drinkprice;
					juice[9].setdrinkquantity(juice[9].drinkquantity);
					juice[9].setdrinktotalprice(juice[9].drinktotalprice);
				}
			}break;
			default: System.out.println("Invalid Juice ID. Please Try Again.");
		}
		Currentorderlist(juice);
		}catch(InputMismatchException ex){
			System.out.println(ex);
		}
	}
	
	public static void madepayment(drinks[] juice){
		double finalprice = 0;
		
		System.out.println("\t\t**********3DIRECT JUICE STORE************");
		System.out.println("\t\t=================Receipt=================");
		System.out.println("----------------------------------------------------------------------------");
		System.out.printf(" %-5s %-12s %-10s %-15s %-20s" ," ", "Juice", "Quantity", "Unit Price", "Total Price (RM)");
		System.out.println("\n----------------------------------------------------------------------------");
		
		for (int i = 0; i < juice.length; i++) {
			if (juice[i].getdrinkquantity() > 0) {
				System.out.printf("\n %-2d %-18s %-10s %.2f %17.2f",(i+1), juice[i].getdrinkname(), (int)juice[i].getdrinkquantity(), juice[i].getdrinkprice(), juice[i].getdrinktotalprice());
				
				finalprice += juice[i].getdrinktotalprice();
			}	
		}
		System.out.println("\n");
		System.out.println("----------------------------------------------------------------------------");
		
		System.out.printf("\n\nTotal Amount : RM" + "%.2f",finalprice);
		System.out.print("\nEnter the amount of cash you pay: RM");
		double pay = input.nextDouble();
		double change = pay - finalprice;
		System.out.println("\n");
		
		if(pay >= finalprice){
			System.out.printf("The balance is : RM" + "%.2f",change);
			System.out.println("\nThanks for your order. Looking for your visit again");
			System.out.println("\n");			
		}else{
			System.out.printf("The amount you paid is not enough, please pay again!");
			System.out.println("\n");
			madepayment(juice);
		}
		
	}
	
}