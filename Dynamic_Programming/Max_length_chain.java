
/* Ref : GeeksForGeeks : You are given N pairs of numbers. In every pair, the first number is always smaller than the second number. A pair (c, d) can follow another pair (a, b) if b < c. Chain of pairs can be formed in this fashion. Your task is to complete the function maxChainLen which returns an integer denoting the longest chain which can be formed from a given set of p */

public class Max_length_chain {

int a =0;
int b =0;


Max_length_chain(int a , int b) {

this.a = a;
this.b = b;
}


public static int maxChainLength(Max_length_chain arr[],int n) {

	int len[] = new int[n];
	for(int i=0;i<n;i++) {
	len[i]=1;
	}

	for(int i=1;i<n;i++) {

	for(int j=0;j<i;j++) {
	
		if(arr[i].a > arr[j].b && len[i] < len[j]+1) {

			len[i]= len[j]+1;
		}
	}
}

	int max =0;
	
	for(int k=0;k<n;k++) 
	{

		if(max<len[k]) 
		max = len[k];
	}

	return max;




}

public static void main(String args[]) {

Max_length_chain []arr = new Max_length_chain[] {new Max_length_chain(5,24),new Max_length_chain(15,25), new Max_length_chain(27,40), new Max_length_chain(50,60)};

System.out.println("Max Chain Length "+maxChainLength(arr,arr.length));  

}

}
