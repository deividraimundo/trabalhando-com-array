
public class ImprimindoArray {
    public void imprimeArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void imprimeArray2(int[] array){
        //enhanced-for
        for (int x : array){
            System.out.println(x);
        }
    }
}
