package Lesson15;

import java.util.HashMap;

public class Recept {
   private HashMap<String, Integer> ingridients = new HashMap<>();
    private String name;
    private int time;

    public  Recept(String name , int time){
        this.name = name;
        this.time = time;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public HashMap<String, Integer> getIngridients() {
        return ingridients;
    }

    public void setIngridients(HashMap<String, Integer> ingridients) {
        this.ingridients = ingridients;
    }

    public void addIngridients(String product, Integer weight) {
        if (ingridients.containsKey(product)) {
            int currentWeight = ingridients.get(product);
            ingridients.put(product, weight + currentWeight);

        } else {
            ingridients.put(product, weight);
        }

    }

    public void printAllIngridients() {
        for (String key : ingridients.keySet()) {
            System.out.println(key + " - " + ingridients.get(key));

        }

    }
}
