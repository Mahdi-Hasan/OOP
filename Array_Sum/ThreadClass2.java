package Array_Sum;

class ThreadClass2 extends Thread {
    public void run()
    {
        int arr3[]=new int[]{11,12,13,14,15};
        int arr4[]=new int[]{16,17,18,19,20};
        int arr6[]=new int[5];
        for (int i=0;i<=4;i++){
            arr6[i]=arr3[i]+arr4[i];
            System.out.println(" arr6[] "+arr6[i]);
            try {
                Thread.sleep(100);
            }catch (Exception e){
            }
        }
    }

}
