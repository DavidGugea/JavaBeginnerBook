public class CloningArrays {
    public static void main(String[] args) {
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] targetArray = sourceArray.clone();
        sourceArray[0] = 10;
        System.out.println(targetArray[0]);
    }
}
