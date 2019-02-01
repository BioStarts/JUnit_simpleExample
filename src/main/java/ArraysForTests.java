public class ArraysForTests {
    /*1. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
    Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов,
    идущих после последней четверки. Входной массив должен содержать хотя бы одну четверку,
    иначе в методе необходимо выбросить RuntimeException. Написать набор тестов для этого метода
    (по 3-4 варианта входных данных). Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
2. Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной четверки или единицы,
то метод вернет false; Написать набор тестов для этого метода (по 3-4 варианта входных данных).*/

    /*public static void main(String[] args) {
        int[] ex = {1, 2,4, 3, 5,4, 6};
        newArr(ex);
    }*/

    public int[] newArr(int[] Arr) {
        boolean q = false;
        int k = 0;
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] == 4) {
                q = true;
                k = i;
            }
        }
        if (q == false) {
            throw new RuntimeException("В массиве нет 4");
        } else {

            int[] z = new int[Arr.length - (k + 1)];
            for (int i = 0; i < Arr.length - (k + 1); i++) {
                z[i] = Arr[k + 1 + i];
                System.out.println(z[i]);
            }
            return z;
        }
    }

    public static void main(String[] args) {
        ArraysForTests  lol = new ArraysForTests();
        int[] olo = {2,3,4,4};
        lol.newArrOnlyOneAndFour(olo);
    }

    public boolean newArrOnlyOneAndFour(int[] Arr) {
        boolean q = false;
        boolean w = false;
        boolean z = true;
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] == 4) {
                q = true;
            }else if (Arr[i] == 1) {
                w = true;
            } else {
                z = false;
            }
        }
        if ((q == true) & (w == true) & (z == true)) {
            return true;
        } else {
            return false;
        }
    }
}



