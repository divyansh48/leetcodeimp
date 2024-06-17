import java.util.Arrays;

public class boattosavepeople2 {
    public static void main(String[] args) {
        int[] people = {3,5,3,4};
        int limit = 5;
                    int boats = 0;
                    Arrays.sort(people);
                    int i=0,j=people.length-1;
                    while(i<=j){
                        if((people[j]+people[i])<=limit){
                            i++;
                        }
                        j--;
                        boats++;
                    }
        System.out.println(boats);


    }
}
