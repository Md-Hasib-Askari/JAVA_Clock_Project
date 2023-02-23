public class Test {
    int arr[] = new int[5];
    public void printt(int arr[]) {
        this.arr = arr;
        for (int x : arr) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[] {
                1, 2, 5
        };
        Test obj = new Test();
        obj.printt(arr);
    }
}
