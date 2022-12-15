package lab0;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class test {
    @Test(dataProvider = "intProvider")
    public void intTest(int p, int p1, int p2){
            assertEquals(new Main().intTask(p, p1), p2);
    }
    @DataProvider
    public Object[][] intProvider(){
        return(new Object[][]{{12, 6, 2}, {5, 6, 0}});
    }

    @Test(dataProvider = "boolProvider")
    public void boolTest(int p, int p1, boolean p2){
        assertEquals(new Main().boolTask(p, p1), p2);
    }
    @DataProvider
    public Object[][] boolProvider(){
        return(new Object[][]{{0, 10, true}, {5, 6, true}});
    }

    @Test(dataProvider = "ifProvider")
    public void ifTest(int p, int p1, int p2, int p3[]){
        assertEquals(new Main().ifTask(p, p1, p2), p3);
    }
    @DataProvider
    public Object[][] ifProvider(){
        int result1[] = {2, 1};
        int result2[] = {0, 3};
        return(new Object[][]{{12, 13, -5, result1}, {0, -5, -4, result2}});
    }

    @Test(dataProvider = "caseProvider")
    public void caseTest(int p, int p1, int p2, int p3){
        assertEquals(new Main().caseTask(p, p1, p2), p3);
    }
    @DataProvider
    public Object[][] caseProvider(){
        return(new Object[][]{{1, 2, 3, 5}, {2, 10, 8, 2}});
    }

    @Test(dataProvider = "whileProvider")
    public void whileTest(int a, int b){
        assertEquals(new Main().whileTask(a), b);
    }
    @DataProvider
    public Object[][] whileProvider(){
        return(new Object[][]{{16, 4}, {8, 3}});
    }

    @Test(dataProvider = "arrayProvider")
    public void arrayTest(int a, int p1[]){
        assertEquals(new Main().arrayTask(a), p1);
    }
    @DataProvider
    public Object[][] arrayProvider(){
        return(new Object[][]{{5, 1, 1, 2, 3, 5}, {3, 1, 1, 2}});
    }

    @Test(dataProvider = "matrixProvider")
    public void matrixTest(int a, int b, int d, int m[], int p1[][]){
        assertEquals(new Main().matrixTask(a, b, d, m), p1);
    }
    @DataProvider
    public Object[][] matrixProvider(){
        int[] input1 ={1, 2, 3};
        int[][] result1={
                {1, 2, 3},
                {3, 4, 5},
                {5, 6, 7}};
        int[] input2 ={5, 8};
        int[][] result2={{5, 8}, {16, 19}};
        return(new Object[][]{{3, 3, 2, input1, result1}, {2, 2, 11, input2, result2}});
    }

}
