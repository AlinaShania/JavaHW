package class24;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        words.add("hello");
        words.add("bye");
        words.add("you");
        words.add("ole");


        words.removeIf((String word )->word.endsWith("e"));

     //   for (String word: words){
          //  if (word.endsWith("e")){
         //       words.remove(word);
          //      System.out.println(words);
        //    }
      //  }

       // for (int i=0; i<words.size(); i++){
        //    String word = words.get(i);
          //  if (word.endsWith("e")){
         //      words.remove(i);
             //   i--;
           // }
      //  }
      //  System.out.println(words);

        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()){
            String word = iterator.next();
            if(word.endsWith("e")){
                iterator.remove();
            }
        }
        System.out.println(words);
    }

}
