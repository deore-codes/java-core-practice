import java.util.Scanner;
import java.util.Random;
class Stone_Paper_Sizzer
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		int pc=rn.nextInt(3);
		
		System.out.println(" : : MENU : : ");
		System.out.println("0.Paper ");
		System.out.println("1.Stone ");
		System.out.println("2.Sizzer");

		System.out.println("User please enter your choice ");
		int user=sc.nextInt();

		System.out.println("PC INPUT :  " + pc);
		System.out.println("USER INPUT : " + user);
		System.out.println();

		if(pc==0 && user==0)
		{
			System.out.println("!!!!!!!!   BHAI MATCH DRAW HO GAYA  !!!!!!!!");
		}
		else if(pc==0 && user==1)
		{
			System.out.println("PC Won the Game: : : :  :  : : : :");
		}
		else if(pc==0 && user==2)
		{
			System.out.println("User Won the GAme: : : : : :");
		}
		else if(pc==1 && user==0)
		{
			System.out.println("User Won the game: : : : : :");
		}
		else if(pc==1 && user==1)
		{
			System.out.println("BHAI MATCH DRAW HO GAYA: : : : : :");
		}
		else if(pc==1 && user==2)
		{
			System.out.println("User Won the game: : : : : :");
		}
		else if(pc==2 && user==0)
		{
			System.out.println("PC Won the game: : : : : :");
		}
		else if(pc==2 && user==1)
		{
			System.out.println("User Won the game: : : : : :");
		}
		else if(pc==2 && user==2)
		{
			System.out.println("BHAI MATCH DRAW HO GAYA: : : : : :");
		}
		else
		{
			System.out.println("You want to play AGAIN..............!!!!!!!! ");
		}
	}
}

/*
==============================================
OUTPUT:
: : MENU : :
0.Paper
1.Stone
2.Sizzer
User please enter your choice
0
PC INPUT :  2
USER INPUT : 0

PC Won the game: : : : : :

C:\Users\JARVIS\Desktop\javakappa\Array class work>java Stone_Paper_Sizzer.java
 : : MENU : :
0.Paper
1.Stone
2.Sizzer
User please enter your choice
1
PC INPUT :  1
USER INPUT : 1

BHAI MATCH DRAW HO GAYA: : : : : :

*/
	