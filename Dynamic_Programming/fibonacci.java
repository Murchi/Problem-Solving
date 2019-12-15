import java.io.*;
import java.util.*;


class Fibo {


static long findFib(int n) {
if(n==1 || n==2) {
return 1;
}

else {

int memorize[] = new int[n+1];
memorize[1]=1;
memorize[2]=1;

for(int i=3;i<n+1;i++)
{
memorize[i]=memorize[i-1]+memorize[i-2];

}

return memorize[n];
}


}

public static void main(String args[]){

long result = Fibo.findFib(10);
System.out.println(result);

}

}
