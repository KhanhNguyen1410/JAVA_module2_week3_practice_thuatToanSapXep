public class SelectSort {
    public static void selectSort(double[] list){
        for (int i = 0; i < list.length; i++) {
            double min = list[i];
            int currentMinIndex = i;
            for (int j = i+1; j < list.length; j++) {
                if (min > list[j]){
                    min = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i]= min;
            }
        }
    }

    public static void main(String[] args) {
        double[] list = {3,4,5,2,1};
        selectSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+ " ");
        }
    }
}
