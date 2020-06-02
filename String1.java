import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String : ");
		 String n=sc.nextLine();
		char ch;
		int sd=0,lc=0,dig=0,uc=0,cc=0,vowl=0,cons=0;
		for(int i=0;i<n.length();i++)
		{
			ch=n.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				uc++;
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
					vowl++;
				else
					cons++;
			}else if(ch>='a'&&ch<='z')
			{
				lc++;
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					vowl++;
				else
					cons++;
			}else if(ch>='0'&&ch<='9')
				dig++;
			else
				sd++;
		}
		System.out.println("\n UpperCase="+uc+"\n LowerCase = "+lc+"\n Vowel ="+vowl+"\n Consonant="+cons+"\n Digit="+dig+"\n SpecialDigit="+sd);
	}
}
