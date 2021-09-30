public class Myclass{
public static void main(String args[]){
/* add two function*/
 Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");

        String str = sc.nextLine();
        int len = str.length();
        int max = 0;
        for(int i = 0; i<len ; i++){
            int temp = 0;
            for(int j = 0;j< len;j++){
                if(str[i]==str[j]){
                    temp=temp++;
                }
            }
            if(temp > max){
                max=temp;
            }
        }
        System.out.println(max+"The hisgest number of letters in the word"+str);
}
}
