//program to sort strings

import java.util.*;

class StringSort{

public static void main(String args[]){
int i=0;
Scanner sc = new Scanner(System.in);

String[] stlist=new String[4];

for (i=0; i<=3; i++){
int z=i+1;

System.out.println("Enter string "+ z +" : ");
stlist[i]=sc.nextLine();
}

Arrays.sort(stlist, Collections.reverseOrder());

System.out.println("\n\nSorted array in descending order:");

for (i=0; i<=3; i++){

System.out.println(stlist[i]);
}

Arrays.sort(stlist);

System.out.println("\n\nSorted array in ascending order:");

for (i=0; i<=3; i++){

System.out.println(stlist[i]);
}



}

}
