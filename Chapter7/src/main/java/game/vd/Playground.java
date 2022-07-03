package game.vd;

import java.util.Arrays;

public class Playground {
    public static void main(String[] args) {
        Room clinic = new Room();
        clinic.name = "Clinic";
        clinic.size = 120000;

        Player theDoc = new Player();
        theDoc.name = "testName";

        GameObject[] testArray = new GameObject[5];
        testArray[0] = clinic;
        testArray[1] = theDoc;

        System.out.println(Arrays.toString(testArray));
    }
}
