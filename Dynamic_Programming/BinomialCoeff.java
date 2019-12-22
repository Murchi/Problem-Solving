import java.io.*;
import java.io.*;


public class BinomialCoeff {


static int findbinolialcoeff(int num,int k) {

int resArray[] = new int[k+1];

resArray[0]=1;

for(int i=1;i<=num;i++) {

	for(int j=Math.min(i,k);j>0;j--) {
		resArray[j]= resArray[j]+resArray[j-1];
	}
}

return resArray[k];

}

public static void main(String args[]) {

	int number =5;
	int k =2;

	System.out.println("Bionmial Coefficient is "+findbinolialcoeff(number,k));
}

}
