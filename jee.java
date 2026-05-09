class jee{
    public static void main(String [] args){
        int a[]={4,3,2,5,7,6};
        int cut=0;
        int j=a[0];
        int n=6;
        for(int i=1;i<n-1;i++){
            if(a[j]>a[i]){
                cut+=1;
                j=a[i];
            }
        }
        System.out.println(cut);
    }
}
