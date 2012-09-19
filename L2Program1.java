import java.util.Scanner;

public class L2Program1 {
    public static void main(String[] args) {
        int userInt;
        int max, min, total;
        float average;
        int i, j; //counters
        
        for (max = 0, min = 1000, total = 0, i = 0, j = 0; i < 7; i++) {
            while (inData >> strInput) {
                stringstream(strInput) >> userInt;
                
                outData << userInt << " ";
                j++;
                
                //Checking for maximum.
                if (userInt > max) max = userInt;
                
                //Checking for minimum.
                if (userInt < min) min = userInt;
                
                //Totaling up line.
                total = total + userInt;
                
                //Average of the line.
                average = total / 7;
                if ((j % 7) == 0) {
                    average = 0;
                    max = 0;
                    min = 1000;
                    total = 0;
                }
            }
        }
    }
}