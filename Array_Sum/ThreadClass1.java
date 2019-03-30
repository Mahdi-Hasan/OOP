package Array_Sum;

class ThreadClass1 extends  Thread {
    public void run() {
        int arr1[] = new int[]{1, 2, 3, 4, 5};
        int arr2[] = new int[]{6, 7, 8, 9, 10};
        int arr5[] = new int[5];
        for (int i = 0; i <= 4; i++) {
            arr5[i] = arr1[i] + arr2[i];
            System.out.print("arr5[] " + arr5[i]);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }
}