package tester;

import shop.MedicalShop;

import java.io.*;
import java.util.Collection;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

import static utils.MedicialUtil.medicalShopMap;
import static utils.MedicialUtil.products;

public class Tester {
    public static void main(String[] args) throws IOException { // Handling Exception
        Map<Integer, MedicalShop> hashMap = medicalShopMap(products()); //Create HashMap
        System.out.println(hashMap);//Print hashMap
        try (Scanner sc = new Scanner(System.in)) {
            //Create a file
            File newFile = new File("Map.txt");
            // Creating Buffered Object
            Stream<MedicalShop> stream = hashMap
                    .values()
                    .stream()
                    .filter(i -> i.getProductId() > 120)
                    .sorted((i, j) -> i.getExpDate().compareTo(j.getExpDate()));
            PrintWriter pw = new PrintWriter(new FileWriter(newFile));
            stream.forEach(pw::println);
            pw.close();
            BufferedWriter br = new BufferedWriter(new FileWriter(newFile));

        }

    }

}
/*BufferedWriter br = new BufferedWriter(new FileWriter(newFile));
            for(Map.Entry<Integer, MedicalShop> newmap : hashMap.entrySet()){
                br.write(newmap.getKey());
                br.newLine();

                ObjectOutputStream
*/

