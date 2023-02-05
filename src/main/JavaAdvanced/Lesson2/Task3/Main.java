package main.JavaAdvanced.Lesson2.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException{
        HashMap<String,String> map = new HashMap<>();
        map.put("Київ","Петрови");
        map.put("Лондон","Абрамовичі");
        map.put("Львів","Іванови");

        getValue(map);
    }

    public static void getValue(HashMap<String,String> map) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть місто");
        String key = reader.readLine();

        if (map.get(key) == null){
            throw new IOException("Такого міста не існує");
        }

        System.out.println("У місті " + key + " живуть " + map.get(key));
    }
}
