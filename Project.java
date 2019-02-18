package p1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Project 
{
	public static ArrayList<String> al1=new ArrayList<String>();
	public static ArrayList<Integer> al2=new ArrayList<Integer>();
	public static ArrayList<Integer> al3=new ArrayList<Integer>();
	public static void main(String[] args)
	{
		userData();
	}
	public static void userData()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the user name:");
		String s=scn.nextLine();
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65 && s.charAt(i)<=90||s.charAt(i)>=97 && s.charAt(i)<=122)
			{
				temp+=s.charAt(i);
			}
			else
			{
				System.out.println("You entered wrong user name.ReEnter the user name:");
				userData();
				break;
			}
		}
		PhoneData();
	}
	public static void PhoneData()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the phone number:");
		String n=scn.nextLine();
		String t="";
		for(int i=0;i<n.length();i++)
		{
			if(n.charAt(i)>=47 && n.charAt(i)<=55)
			{
				t+=n.charAt(i);
			}
			else
			{
				System.out.println("You entered wrong phone number:");
				PhoneData();
				break;
			}
		}
		welcome();
		
	}
	public static void welcome()
	{
		try
		{
			Scanner scn=new Scanner(System.in);
			System.out.println("1:Electronics");
			System.out.println("2:Fashion");
			System.out.println("3:Books");
			System.out.println("-------------------------------------------------------------------------------------------------");
			System.out.println("Enter your choice:");
			int c=scn.nextInt();
			switch(c)
			{
		
				case 1:electronics();
					break;
				case 2:fashion();
					break;
				case 3:books();
					break;
				default:System.out.println("Enter only 1,2 and 3:");
					welcome();
					break;
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter only numbers:");
			welcome();
		}
	}
	public static void electronics()
	{
		try
		{
			Scanner scan=new Scanner(System.in);
			ArrayList al=new ArrayList();
			al.add("1:Mobile(Rs.10000)");
			al.add("2:Laptop(Rs.30000)");
			al.add("3:HeadPhone(Rs.800)");
			al.add("4:Speakers(Rs.1500)");
			al.add("5:Pendrive(Rs.300)");
			al.add("6:HardDisk(Rs.3000)");
			al.add("7:Main menu");
			System.out.println(al);
			System.out.println("-------------------------------------------------------------------------------------------------");
			System.out.println("Enter your choice:");
			int c=scan.nextInt();
			switch(c)
			{
				case 1:mobile();
					break;
				case 2:laptop();
					break;
				case 3:headPhone();
					break;
				case 4:speakers();
					break;
				case 5:penDrive();
					break;
				case 6:hardDisk();
					break;
				case 7:welcome();
					break;
				default:System.out.println("Your selected wrong option.Please ReEnter:");
					electronics();
					break;
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter only numbers:");
			electronics();
		}
			
	}
	public static void mobile()
	{
		Scanner scn=new Scanner(System.in);
		String a="mobile";
		System.out.println("Enter the number of Mobiles you want");
		int s=scn.nextInt();
		int sum=0;
		for(int i=0;i<s;i++)
		{
			sum+=10000;
			
		}
		System.out.println("Total amount="+sum);
		System.out.println("-------------------------------------------------------------------------------------------------");
		exit(a,s,sum);
	}
	public static void laptop()
	{
		Scanner scn=new Scanner(System.in);
		String a="Laptop";
		System.out.println("Enter the number of Laptop you want");
		int s=scn.nextInt();
		int sum=0;
		for(int i=0;i<s;i++)
		{
			sum+=30000;
		}
		System.out.println("Total amount="+sum);
		System.out.println("-------------------------------------------------------------------------------------------------");
		exit(a,s,sum);
	}
	public static void headPhone()
	{
		Scanner scn=new Scanner(System.in);
		String a="headphones";
		System.out.println("Enter the number of headPhone you want");
		int s=scn.nextInt();
		int sum=0;
		for(int i=0;i<s;i++)
		{
			sum+=800;
		}
		System.out.println(sum);
		System.out.println("-------------------------------------------------------------------------------------------------");
		exit(a,s,sum);
	}
	public static void speakers()
	{
		Scanner scn=new Scanner(System.in);
		String a="speakers";
		System.out.println("Enter the number of speakers you want");
		int s=scn.nextInt();
		int sum=0;
		for(int i=0;i<s;i++)
		{
			sum+=1500;
		}
		System.out.println("Total amount="+sum);
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("Do you want to continue y/n:");
		exit(a,s,sum);
	}
	public static void penDrive()
	{
		Scanner scn=new Scanner(System.in);
		String a="pendrive";
		System.out.println("Enter the number of penDrive you want");
		int s=scn.nextInt();
		int sum=0;
		for(int i=0;i<s;i++)
		{
			sum+=300;
		}
		System.out.println("Total amount="+sum);
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("Do you want to continue y/n:");
		exit(a,s,sum);
	}
	public static void hardDisk()
	{
		Scanner scn=new Scanner(System.in);
		String a="hardDisk";
		System.out.println("Enter the number of hardDisk you want");
		int s=scn.nextInt();
		int sum=0;
		for(int i=0;i<s;i++)
		{
			sum+=3000;
		}
		System.out.println("Total amount="+sum);
		System.out.println("-------------------------------------------------------------------------------------------------");
		exit(a,s,sum);
	}
	public static void fashion()
	{
		try
		{
			Scanner scn=new Scanner(System.in);
			ArrayList al=new ArrayList();
			al.add("1:Mens");
			al.add("2:Womens");
			al.add("3:Kids");
			al.add("4:Main Menu");
			System.out.println(al);
			System.out.println("-------------------------------------------------------------------------------------------------");
			System.out.println("Enter your choice:");
			int c=scn.nextInt();
			switch(c)
			{
				case 1:mens();
					break;
				case 2:womens();
					break;
				case 3:kids();
					break;
				case 4:welcome();
					break;
				default:System.out.println("Your selected wrong option.Please ReEnter:");
					fashion();
					break;
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter only numbers:");
			fashion();
		}
	}
	public static void mens()
	{
		try
		{
			Scanner scn=new Scanner(System.in);
			ArrayList al=new ArrayList();
			al.add("1:Shirt(Rs.500)");
			al.add("2:Pant(Rs.800)");
			al.add("3:Bleazor(Rs.2000)");
			al.add("4:Menu");
			System.out.println(al);
			System.out.println("-------------------------------------------------------------------------------------------------");
			System.out.println("Enter your choice:");
			int c=scn.nextInt();
			switch(c)
			{
				case 1:shirt();
					break;
				case 2:pant();
					break;
				case 3:bleazor();
					break;
				case 4:fashion();
					break;
				default:System.out.println("Your selected wrong option.Please ReEnter:");
					mens();
					break;
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter only numbers:");
			mens();
		}
	}
	public static void shirt()
	{
		Scanner scn=new Scanner(System.in);
		String a="shirt";
		System.out.println("Enter the number of shirt you want");
		int s=scn.nextInt();
		int sum=0;
		for(int i=0;i<s;i++)
		{
			sum+=500;
		}
		System.out.println("Total amount="+sum);
		System.out.println("-------------------------------------------------------------------------------------------------");
		exit(a,s,sum);
	}
	public static void pant()
	{
		Scanner scn=new Scanner(System.in);
		String a="pants";
		System.out.println("Enter the number of pant you want");
		int s=scn.nextInt();
		int sum=0;
		for(int i=0;i<s;i++)
		{
			sum+=800;
		}
		System.out.println("Total amount="+sum);
		System.out.println("-------------------------------------------------------------------------------------------------");
		exit(a,s,sum);
	}
	public static void bleazor()
	{
		Scanner scn=new Scanner(System.in);
		String a="Bleazor";
		System.out.println("Enter the number of bleasor you want");
		int s=scn.nextInt();
		int sum=0;
		for(int i=0;i<s;i++)
		{
			sum+=2000;
		}
		System.out.println("Total amount="+sum);
		System.out.println("-------------------------------------------------------------------------------------------------");
		exit(a,s,sum);
	}
	public static void womens()
	{
		try
		{	
			Scanner scn=new Scanner(System.in);
			ArrayList al=new ArrayList();
			al.add("1:Sarees(Rs.2500)");
			al.add("2:Kurtas(Rs.1000)");
			al.add("3:tops(Rs.800)");
			al.add("4:Menu");
			System.out.println(al);
			System.out.println("-------------------------------------------------------------------------------------------------");
			System.out.println("Enter your choice:");
			int c=scn.nextInt();
			switch(c)
			{
				case 1:saree();
					break;
				case 2:kurta();
					break;
				case 3:tops();
					break;
				case 4:fashion();
					break;
				default:System.out.println("Your selected wrong option.Please ReEnter:");
					womens();
					break;
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter only numbers:");
			womens();
		}
	}
	public static void saree()
	{
		Scanner scn=new Scanner(System.in);
		String a="sarees";
		System.out.println("Enter the number of sarees you want");
		int s=scn.nextInt();
		int sum=0;
		for(int i=0;i<s;i++)
		{
			sum+=2500;
		}
		System.out.println("Total amount="+sum);
		System.out.println("-------------------------------------------------------------------------------------------------");
		exit(a,s,sum);
	}
	public static void kurta()
	{
		Scanner scn=new Scanner(System.in);
		String a="kurta";
		System.out.println("Enter the number of kurtas you want");
		int s=scn.nextInt();
		int sum=0;
		for(int i=0;i<s;i++)
		{
			sum+=1000;
		}
		System.out.println("Total amount="+sum);
		System.out.println("-------------------------------------------------------------------------------------------------");
		exit(a,s,sum);
	}
	public static void tops()
	{
		Scanner scn=new Scanner(System.in);
		String a="tops";
		System.out.println("Enter the number of tops you want");
		int s=scn.nextInt();
		int sum=0;
		for(int i=0;i<s;i++)
		{
			sum+=800;
		}
		System.out.println("Total amount="+sum);
		System.out.println("-------------------------------------------------------------------------------------------------");
		exit(a,s,sum);
	}
	public static void kids()
	{
		try
		{
			Scanner scn=new Scanner(System.in);
			ArrayList al=new ArrayList();
			al.add("1:Frock(Rs.1500)");
			al.add("2:Tops(Rs.800)");
			al.add("3:Zeens(Rs.800)");
			al.add("4:Menu");
			System.out.println(al);
			System.out.println("-------------------------------------------------------------------------------------------------");
			System.out.println("Enter your choice:");
			int c=scn.nextInt();
			switch(c)
			{
				case 1:frock();
					break;
				case 2:tops();
					break;
				case 3:zeens();
					break;
				case 4:fashion();
					break;
				default:System.out.println("Your selected wrong option.Please ReEnter:");
					kids();
					break;
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter only numbers:");
			kids();
		}
	}
	public static void frock()
	{
		Scanner scn=new Scanner(System.in);
		String a="frock";
		System.out.println("Enter the number of frocks you want");
		int s=scn.nextInt();
		int sum=0;
		for(int i=0;i<s;i++)
		{
			sum+=1500;
		}
		System.out.println("Total amount="+sum);
		System.out.println("-------------------------------------------------------------------------------------------------");
		exit(a,s,sum);
	}
	public static void zeens()
	{
		Scanner scn=new Scanner(System.in);
		String a="Zeens";
		System.out.println("Enter the number of zeens you want");
		int s=scn.nextInt();
		int sum=0;
		for(int i=0;i<s;i++)
		{
			sum+=800;
		}
		System.out.println("Total amount="+sum);
		System.out.println("-------------------------------------------------------------------------------------------------");
		exit(a,s,sum);
	}
	
	public static void books()
	{
		try
		{
			Scanner scn=new Scanner(System.in);
			ArrayList al=new ArrayList();
			al.add("1:Novels");
			al.add("2:Mythology");
			al.add("3:LoveStory");
			al.add("4:Main Menu");
			System.out.println(al);
			System.out.println("-------------------------------------------------------------------------------------------------");
			System.out.println("Enter your choice:");
			int c=scn.nextInt();
			switch(c)
			{
				case 1:novels();
					break;
				case 2:mythology();
					break;
				case 3:loveStory();
					break;
				case 4:welcome();
					break;
				default:System.out.println("Your selected wrong option.Please ReEnter:");
					books();
					break;
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter only numbers:");
			books();
		}
	}
	public static void novels()
	{
		try
		{
			Scanner scn=new Scanner(System.in);
			ArrayList al=new ArrayList();
			al.add("1:The one from the star(Rs.88)");
			al.add("2:Everyone has a Story(Rs.95)");
			al.add("3:Menu");
			System.out.println(al);
			System.out.println("-------------------------------------------------------------------------------------------------");
			System.out.println("Enter your choice:");
			int c=scn.nextInt();
			switch(c)
			{
				case 1:star();
					break;
				case 2:story();
					break;
				case 3:books();
					break;
				default:System.out.println("Your selected wrong option.Please ReEnter:");
					novels();
					break;
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter only numbers:");
			novels();
		}
	}
	public static void star()
	{
		Scanner scn=new Scanner(System.in);
		String a="The one from the star";
		System.out.println("Enter how many books you want");
		int s=scn.nextInt();
		int sum=0;
		for(int i=0;i<s;i++)
		{
			sum+=88;
		}
		System.out.println("Total amount="+sum);
		System.out.println("-------------------------------------------------------------------------------------------------");
		exit(a,s,sum);
	}
	public static void story()
	{
		Scanner scn=new Scanner(System.in);
		String a="Everyone has a Story";
		System.out.println("Enter how many books you want");
		int s=scn.nextInt();
		int sum=0;
		for(int i=0;i<s;i++)
		{
			sum+=95;
		}
		System.out.println("Total amount="+sum);
		System.out.println("-------------------------------------------------------------------------------------------------");
		exit(a,s,sum);
	}
	public static void mythology()
	{
		try
		{
			Scanner scn=new Scanner(System.in);
			ArrayList al=new ArrayList();
			al.add("1:Sita:Warrior of Mithila(Rs.160)");
			al.add("2:The Oath of Vayuputras(Rs.180)");
			al.add("3:Menu");
			System.out.println(al);
			System.out.println("-------------------------------------------------------------------------------------------------");
			System.out.println("Enter your choice:");
			int c=scn.nextInt();
			switch(c)
			{
				case 1:sita();
					break;
				case 2:vayuputra();
					break;
				case 3:books();
					break;
				default:System.out.println("Your selected wrong option.Please ReEnter:");
					mythology();
					break;
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter only numbers:");
			mythology();
		}
	}
	public static void sita()
	{
		Scanner scn=new Scanner(System.in);
		String a="Sita:Warrior of Mithila";
		System.out.println("Enter how many books you want");
		int s=scn.nextInt();
		int sum=0;
		for(int i=0;i<s;i++)
		{
			sum+=160;
		}
		System.out.println("Total amount="+sum);
		System.out.println("-------------------------------------------------------------------------------------------------");
		exit(a,s,sum);
	}
	public static void vayuputra()
	{
		Scanner scn=new Scanner(System.in);
		String a="The Oath of Vayuputras";
		System.out.println("Enter how many books you want");
		int s=scn.nextInt();
		int sum=0;
		for(int i=0;i<s;i++)
		{
			sum+=180;
		}
		System.out.println("Total amount="+sum);
		System.out.println("-------------------------------------------------------------------------------------------------");
		exit(a,s,sum);
	}
	public static void loveStory()
	{
		try
		{
			Scanner scn=new Scanner(System.in);
			ArrayList al=new ArrayList();
			al.add("1:Love Story by Erich Segal(Rs.161)");
			al.add("2:You are the Best Friend(Rs.80)");
			al.add("3:Menu");
			System.out.println(al);
			System.out.println("-------------------------------------------------------------------------------------------------");
			System.out.println("Enter your choice:");
			int c=scn.nextInt();
			switch(c)
			{
				case 1:love();
					break;
				case 2:friend();
					break;
				case 3:books();
					break;
				default:System.out.println("Your selected wrong option.Please ReEnter:");
					loveStory();
					break;
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter only numbers:");
			loveStory();
		}
	}
	public static void love()
	{
		Scanner scn=new Scanner(System.in);
		String a="Love Story by Erich Segal";
		System.out.println("Enter how many books you want");
		int s=scn.nextInt();
		int sum=0;
		for(int i=0;i<s;i++)
		{
			sum+=161;
		}
		System.out.println("Total amount="+sum);
		System.out.println("-------------------------------------------------------------------------------------------------");
		exit(a,s,sum);
	}
	public static void friend()
	{
		Scanner scn=new Scanner(System.in);
		String a="You are the Best Friend";
		System.out.println("Enter how many books you want");
		int s=scn.nextInt();
		int sum=0;
		for(int i=0;i<s;i++)
		{
			sum+=80;
		}
		System.out.println("Total amount="+sum);
		System.out.println("-------------------------------------------------------------------------------------------------");
		exit(a,s,sum);
	}
	public static void exit(String a,int s,int sum)
	{
		Scanner scn=new Scanner(System.in);
		String item=a;
		int qty=s;
		int total=sum;
		al1.add(item);
		al2.add(qty);
		al3.add(total);
		
		System.out.println("Do you want to continue y/n:");
		String n=scn.next();
		if(n.equalsIgnoreCase("y"))
		{
			welcome();
				
		}
		else
		{
			int totalPrice=0;
			System.out.println("slno.\titem\t\t\t\t\tQty\t\t\tTotal");
			System.out.println("-----\t-----\t\t\t\t\t-----\t\t\t-------");
			for(int i=0;i<al1.size();i++)
			{
				System.out.println((i+1)+"\t"+al1.get(i)+"\t\t\t\t\t"+al2.get(i)+"\t\t\t"+al3.get(i));
				totalPrice+=al3.get(i);
			}
			System.out.println("-------------------------------------------------------------------------------------------------");
			System.out.println("Total=\t\t\t\t\t"+totalPrice);
			System.out.println("*************************************Thanks for visiting*******************************************");
	
		}
	}
	
}

