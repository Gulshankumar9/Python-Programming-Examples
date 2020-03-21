import java.util.*;
import java.io.*;
class bankacc{
	private double bal;
	bankacc(double bal){
		this.bal=bal;

	}
	void contact(double r ) throws IOException {
		BufferedReader br =new BufferedReader( new InputStreamReader(System.in));
		System.out.println("enter the password for accessing the bank account :");
		String pass=br.readLine();
		if(pass.equals("jahnavi honey 123")){
			interest in =new interest(r);
			in.calinterest();

		}
		else
			System.out.println("sorry your are not authorised to access this account :");
		return;

	}
	private class interest{
		private double rate;
		interest(double rate){
			this.rate=rate;

		}
		void calinterest(){
			double interest=bal*rate/100;
			bal+=interest;
			System.out.println("calculated interest is :"+bal);


		}
	}
}

class main{
	public static void main (String []df ) throws IOException{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount of choice :");
		int amt=sc.nextInt();
		System.out.println("enter the rate of interest on principal amount:");
		int ra=sc.nextInt();

		bankacc bc=new bankacc(amt);
		bc.contact(ra);


	}
}