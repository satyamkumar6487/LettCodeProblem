public class RemoveElement {


    public static void main (String [] args){

//        int arr [] = { 3, 2,2,3};

       int arr[] =  {0,1,2,2,3,0,4,2};
        int val = 2 ;

//        int val = 3 ;

        int result = removelemnt(arr , val);
        System.out.println(result);


    }

    public static int removelemnt(int [] arr , int val){
        int count = 0;
        for (int i = 0 ; i <arr.length; i ++){

            if (arr[i] != val){
                arr[count] = arr[i];
                count++;
            }
        }
return  count;
    }
}
