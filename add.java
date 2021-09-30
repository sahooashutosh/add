import java.util.Scanner;
import java.util.HashMap;


public class Myclass{
public static void main(String args[]){
/* add two function*/
 Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");

        String str = sc.nextLine();
        int len = str.length();
        int max = 0;
        Map map = new HashMap();
        /*for(int i = 0; i<len ; i++){
            int temp = 0;
            for(int j = 0;j< len;j++){
                if(str[i]==str[j]){
                    temp=temp++;
                }
            }
            if(temp > max){
                max=temp;
            }
        }*/
        for (char c : str) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {
                charCountMap.put(c, 1);
            }
        }
 
        // Printing the charCountMap
        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        //System.out.println(max+"The highest number of letters in the word"+str);
}
}
