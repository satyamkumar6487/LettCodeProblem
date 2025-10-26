public class DuplicateSortedArray {
    public static void main (String [] args){

        int [] arr = { 1,1,2};
int res = removeDuplicate(arr);
System.out.println(res);


    }

    public static  int removeDuplicate(int [] arr){

        int count = 0;
        for (int i = 0 ; i < arr.length; i ++){


            if ( i < arr.length -1  && arr[i] == arr[i+1]){

continue;

            }

            else {

                arr[count] = arr[i];

                count ++;
            }
        }

return count;

    }

}

