package chinesevocabulary;

import java.util.*;

public class Characters {

    private HashMap<String, String> words;

    public Characters() {
        words = new HashMap<String, String>();
        System.out.println("");

        words.put("你好", "hello");
        words.put("再见", "good bye");
        words.put("猫", "cat");
        words.put("狗", "dog");
        words.put("爱", "love");
        words.put("微笑", "smile");
        words.put("谢谢你", "thank you");
        words.put("智慧", "wisdom");
        words.put("野心", "ambition");
        words.put("唱歌", "sing");
        words.put("左", "left");
        words.put("右", "right");
        words.put("国", "country");
        words.put("生", "live");
        words.put("家", "family");
        words.put("喝", "drink");
        words.put("食", "eat");
        words.put("球", "ball");
        words.put("慢", "slow");
        words.put("亮", "bright");
        words.put("皮", "skin");
        words.put("跑", "run");

    }

    public HashMap<String, String> getWords() {
        return words;

    }

    public String getWord(String key) {
        return words.get(key);
    }

    public void printWords() {
        System.out.println("");
        int i = 0;
        for (String entry : words.keySet()) {
            String value = words.get(entry);
            System.out.println(i + " " + entry + " means " + value);
            i++;
        }
    }

}
