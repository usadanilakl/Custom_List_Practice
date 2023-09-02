package GroupProject.practice.linkedList;

import java.util.Arrays;

public class CustomArrayList {
    private String[] arr = new String[1];
    public void addElem(String data){
        if(arr.length == 0){
            String arr2[] = new String[1];
            arr2[0] = data;
            arr = arr2;
        }else{
            String arr3[] = new String[arr.length + 1];
            for(int i = 0; i<arr.length; i++){
                arr3[i] = arr[i];
            }
            arr3[arr.length] = data;
            arr = arr3;
        }
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
