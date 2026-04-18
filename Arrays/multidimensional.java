void main() {

    Scanner in = new Scanner(System.in);

    int[][] arr = new int[3][3];

    System.out.println(arr.length); // number of rows
    // input
    for (int[] arr1 : arr) {
        for (int col = 0; col < arr1.length; col++) {
            arr1[col] = in.nextInt();
        }
    }
    // output
    for (int[] arr1 : arr) {
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
