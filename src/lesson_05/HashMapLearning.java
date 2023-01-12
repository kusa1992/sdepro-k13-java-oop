package lesson_05;

import java.util.HashMap;
import java.util.Map;

public class HashMapLearning {

    public static void main(String[] args) {
        // Raw types: bo Integer, String
        // Hashmap khong chap nhan 2 keys trung nhau, values duoc trung
        Map<Integer, String> emergencyList = new HashMap<>();
        emergencyList.put(113, "Canh sat");
        emergencyList.put(114, "Cuu hoa");
        emergencyList.put(115, "Cap cuu");
        emergencyList.put(116, "Others");
        emergencyList.put(117, "Others");

        System.out.println(emergencyList.get(113));
        System.out.println(emergencyList.get(117));

        // In tat ca values
        for (int key : emergencyList.keySet()) {
            System.out.println(emergencyList.get(key));
        }

        // Search key or value
        System.out.println("Has 113 key: " + emergencyList.containsKey(113));
        System.out.println("Has 118 key: " + emergencyList.containsKey(118));
        System.out.println("Has value: " + emergencyList.containsValue("Canh sat"));
        System.out.println("Has value: " + emergencyList.containsValue("Benh vien"));

        // Update
        emergencyList.replace(116, "116");
        System.out.println(emergencyList.get(116));

        emergencyList.replace(116, "116", "Something else!");
        System.out.println(emergencyList.get(116));
        emergencyList.remove(114);
    }
}
