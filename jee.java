class jee{
    public static void main(String [] args){
        int a[]={4,3,2,5,7,6};
        int cut=0;
        int j=0;
        int n=6;
        for(int i=0;i<n-1;i++){
            if(a[j]>a[i+1]){
                cut+=1;
                j++;
            }
        }
        System.out.println(cut);
    }
}
