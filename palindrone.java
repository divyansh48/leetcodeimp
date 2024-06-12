import java.util.ArrayList;

public class palindrone {
    public static void main(String[] args) {
        int x = 10;
        int y = x;
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 0 ;





        if(x > 0){
            while(y>0){

                int rem = y % 10 ;
                y = y/10;
                ans.add(rem);

            }

            int i = 0;
            int j = ans.size()-1;
            int mid = i + (j - i)/2;
            while(i<j){
                for (int k = i; k <=j; k++) {
                    if (ans.get(k) == ans.get(j)) {
                        i++;
                        j--;
                    }
                }
            }
            if(i == mid+1){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }

        }
        else{
            System.out.println("false");
        }
    }
}
