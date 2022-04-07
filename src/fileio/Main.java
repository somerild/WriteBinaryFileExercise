package fileio;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        //vars
        int[] productNum = {110, 520, 178, 172};
        int[] productQty = {20, 8, 52, 150};
        String[] productName = {"Hammer", "Lawn Mower", "Monkey Wrench", "Screwdriver"};
        double[] productCost = {12.99, 79.52, 6.95, 5.99};

        String destinationPath = "C:\\Users\\leram\\Java\\WriteBinaryFileExercise\\src\\fileio\\products.dat";
        File fOut = new File(destinationPath);
        DataOutputStream output = new DataOutputStream( new BufferedOutputStream( new FileOutputStream( fOut ) ) );

        for(int i = 0; i < 4; i++)
        {
            output.writeInt( productNum[i] );
            output.writeUTF(productName[i] );
            output.writeInt( productQty[i] );
            output.writeDouble( productCost[i] );
        }
        output.close();
    }
}
