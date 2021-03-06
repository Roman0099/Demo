package review;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAscendingOrder {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(1,4,4,5,2,3,1));
        System.out.println(sortList(list));
    }
    public static ArrayList<Integer>sortList(ArrayList<Integer>list){
        for(int i=0; i<list.size(); i++){
            for(int j=0; j<list.size(); j++){
                if(list.get(i)<list.get(j)){
                    int temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
        return list;

    }
}
