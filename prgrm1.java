class prgrm1{ 
    public static void main(String [] args){
        int arr[]={1,2,3,4,5};
        int max=0,min=arr[0];
        for(int i:arr){
            if(max<i){
                max=i;
            }
            if(min>i){
                min=i;
            }
        }
        System.out.println("max:"+max);
        System.out.println("min:"+min);
        System.out.println(arr.length);
    }
}