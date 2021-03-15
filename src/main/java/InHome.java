public class InHome {
    public static void main(String[] args) {
        // 6 не смог сделать
        // 7 не смог сделать
    minmax();
    ne_smoq_sdelat_i_poetomu_vzal_is_ineta();
    multiply2();
    Plus3();
    Switch();
    }


    private static void minmax() {
        int[] arr = {3, 5, 0, 2, 119, 4, 5};
        int a = arr[0];
        int b = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > a) {
                a = arr[i];
            }
            if (arr[i] < b) {
                b = arr[i];
            }
        }
        System.out.println("max:"+a);
        System.out.println("min:"+b);
    }

    private static void ne_smoq_sdelat_i_poetomu_vzal_is_ineta() {
        int[][] arr = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i - 1] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    private static void multiply2() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i]+ " ");

        }
        System.out.println();
    }
    private static void Plus3() {
        int[] arr = new int[8];
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = c;
            c += 3;
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }

    private static void Switch() {
        int[] rand = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < rand.length; i++) {
            if (rand[i] == 0) {
                rand[i] += 1;
            } else {
                rand[i] = 0;
            }
            System.out.print(rand[i]+ " ");
        }
    }
}

