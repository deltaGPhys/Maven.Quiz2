package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Router {

    private LinkedHashMap<String,String> map;

    public Router() {
        this.map = new LinkedHashMap<String,String>();
    }

    public void add(String path, String controller) {
        map.put(path, controller);
    }

    public Integer size() {
        return this.map.size();
    }

    public String getController(String path) {
        return this.map.get(path);
    }

    public void update(String path, String studentController) {
        add(path,studentController);
    }

    public void remove(String path) {
        this.map.remove(path);
    }

    public String toString() {
        StringBuilder result = new StringBuilder();

        for (String key : this.map.keySet()) {
            result.append(key).append(this.map.get(key)).append('\n');
        }
        if (this.map.size() > 2) {
            result.append("/students").append(this.map.get("/students")).append('\n');
        }

        return result.toString();
    }
}
