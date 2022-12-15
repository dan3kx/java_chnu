package lab0;

public class Main {

    public static int intTask(int a, int b)// a довжина більшого вектора, b довжина меншого вектора
    {
        return a/b; // к-сть відрізків які влізають
    }

    static boolean boolTask(int a, int b) // a - ціле число, b - ціле число
    {
        return (a >=0 || b<-2);
    }

    static int[] ifTask(int a, int b, int c) // a, b, c - цілi числa
    {
        int positive = 0;
        int negative = 0;
        int[] array = {a, b, c};
        for(int i=0; i<3; i++) {
            if (array[i] > 0) {
                positive++;
            } else {
                negative++;
            }
        }
        //int[] result={positive, negative};
        return new int[]{positive, negative};
    }

    static int caseTask(int operation, int a, int b) // a - оцінка
    {
        if(b!=0){
            return switch (operation) {
                case 1 -> a + b;
                case 2 -> a - b;
                case 3 -> a * b;
                case 4 -> a / b;
                default -> 0;
            };
        }
        return 0;
    }

    static double[] forTask(double a) // a - kg
    {
        double[] price=new double[10];
        for(int i=0; i<10; i++){
            price[i] = ((i+1)*a)/10;
        }
        return price;
    }

    static int whileTask(int a)
    {
        int step = 1;
        while(a/2>=2){
            a/=2;
            step++;
        }
        return step;
    }

    static int[] arrayTask(int a){ // a - розмір масива
        int[] array = new int[a];
        array[0]=1;
        array[1]=1;
        for(int i=2; i<a; i++){
            array[i]=array[i-1]+array[i-2];
        }
        return array;
    }

    static int[][] matrixTask(int a, int b, int d, int m[]){// a - к-ть рядків, b - к-ть стовбців, м- перший стовбець
        int[][] array = new int[a][b];
        array[0]=m;
        for(int i=1; i<a; i++){
            for(int j=0; j<b; j++){
                array[i][j]=array[i-1][j]+d;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(intTask(12, 2));
        System.out.println(boolTask(0, -3));
        int[] mass=ifTask(-1, 5, 6);
        for (int i:mass){
            System.out.print(i+" ");
        }
       System.out.println();
        System.out.println(caseTask(1, 2, 3));
        double[] mas=forTask(5);
        for (double i:mas){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(whileTask(16));

        //arrayTask
        int[] array = arrayTask(5);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Martix:");

        // matrixTask
        int taskMatrix[]={1,2,3};
        int[][] matrix = matrixTask(3, 3, 2, taskMatrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}