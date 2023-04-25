package tester;

import shop.MedicalShop;

import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

import static utils.MedicialUtil.medicalShopMap;
import static utils.MedicialUtil.products;

public class Tester {
    public static void main(String[] args) throws IOException { // Handling Exception
        Map<Integer, MedicalShop> hashMap = medicalShopMap(products()); //Create HashMap
        System.out.println(hashMap);//Print hashMap
        try {
            //Creating Stream for map to filter out data
            Stream<MedicalShop> stream = hashMap
                    .values()
                    .stream()
                    .filter(i -> i.getProductId() > 120)
                    .sorted((i, j) -> i.getExpDate().compareTo(j.getExpDate()));
            ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("Object.ser")); // FileOutputStream will make file 'Object.ser' if not exists
            obj.writeObject(hashMap); // Actual Serialization happens here
        } catch (IOException e) {

        }
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter File to restore Object");
            ObjectInputStream os = new ObjectInputStream(new FileInputStream(sc.next()));
            Object one = os.readObject();
            //TypeCasting Object into
            Map<Integer, MedicalShop> hash = (Map<Integer, MedicalShop>) one;
            for (Map.Entry<Integer, MedicalShop> map : hash.entrySet()) {
                System.out.println(map.getKey() + " " + map.getValue()); //Printing keys and Values
            }
            System.out.println("End of Code...");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

