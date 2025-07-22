public class PatternMaker{
    public static void printNumberTriangle(int rows) {
        int[] lis = new int[rows];

        for (int i = 1; i <= rows; i++) {
            lis[i - 1] = i;


            for (int j = 0; j < i; j++) {
                System.out.print(lis[j] + " ");
            }
            System.out.println();
        }
    }
    public static void printMultiplicationTable(int number, int limit){
        for (int i =1; i<=limit;i++){
            
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void main(String[] args) {
        printNumberTriangle(5);
        System.out.println();
        printMultiplicationTable(7, 10);
    }
}