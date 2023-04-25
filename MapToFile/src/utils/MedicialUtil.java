package utils;

import shop.MedicalShop;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

import static shop.Category.*;

public class MedicialUtil {
    public static ArrayList<MedicalShop> products(){
        ArrayList<MedicalShop> list = new ArrayList<>();
        list.add(new MedicalShop(100,"ZeroDolP",LocalDate.parse("2024-12-04"),TABLET));
        list.add(new MedicalShop(199,"Crosin",LocalDate.parse("2024-01-15"),TABLET));
        list.add(new MedicalShop(145,"CoughEr",LocalDate.parse("2026-01-04"),SERUM));
        list.add(new MedicalShop(178,"Sesna",LocalDate.parse("2012-11-04"),CAPSULE));
        list.add(new MedicalShop(131,"ZeroDolP",LocalDate.parse("2030-02-15"),CAPSULE));
        list.add(new MedicalShop(172,"DOLO",LocalDate.parse("2025-09-05"),TABLET));
        list.add(new MedicalShop(148,"ZeroDolP",LocalDate.parse("2015-01-14"),CAPSULE));
        list.add(new MedicalShop(174,"Orange",LocalDate.parse("2024-12-20"),POWDER));
        list.add(new MedicalShop(114,"COldSerum",LocalDate.parse("2020-06-19"),SERUM));
        list.add(new MedicalShop(200,"Lemon",LocalDate.parse("2026-12-04"),POWDER));
//        list.forEach(i-> System.out.println("List Data: " +i));
        return list;
    }

    public static Map<Integer , MedicalShop> medicalShopMap(List<MedicalShop> tempProduct){
        Map<Integer,MedicalShop> map = new HashMap<>();
        for(MedicalShop temp : tempProduct) {
            map.put(temp.getProductId(), temp);
//            System.out.println( map.put(temp.getProductId(), temp); //Printing null
        }

        System.out.println(map.size());
        return map;
    }
}
