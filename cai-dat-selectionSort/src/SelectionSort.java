import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter list size: ");
        int size = scanner.nextInt();
        double[] list = new double[size];
        System.out.println("enter values: ");
        for (int i = 0; i < list.length; i++) {
            list[i]= scanner.nextDouble();
        }

        System.out.println("your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        selectionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+ "\t");
        }

    }
    static void selectionSort(double[] list){
        for (int i = 0; i < list.length-1; i++) {
            double currentMin = list[i];
            System.out.println(list[i] + "lan "+ i);
            int currentMinIndex = i;
            for (int j = i+ 1; j <list.length ; j++) {
                if (currentMin> list[j]){
                    currentMin= list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
