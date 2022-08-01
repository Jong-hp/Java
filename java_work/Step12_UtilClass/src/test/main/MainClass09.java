package test.main;

import java.util.HashMap;
import java.util.Scanner;

public class MainClass09 {
   public static void main(String[] args) {
      HashMap<String, String> dic=new HashMap<>();
      dic.put("house", "집");
      dic.put("phone", "전화기");
      dic.put("car", "자동차");
      dic.put("pencil", "연필");
      dic.put("eraser", "지우게");
      
      /*
       *  검색할 단어를 입력하세요:house
       *  house 의 뜻은 집입니다.
       *  
       *  검색할 단어를 입력하세요:gura
       *  gura 는 목록에 없습니다.
       */
      
      Scanner scan=new Scanner(System.in);
      System.out.print("검색할 단어를 입력하세요:");
      String word=scan.nextLine();
      String mean=dic.get(word);
      
      if(mean == null) {
         System.out.println(word+" 는 목록에 없습니다.");
      }else {
         System.out.println(word+" 의 뜻은 "+mean+"입니다.");
      }
      
      //만일 HashMap 객체가 입력한 word 를 key 값으로 가지고 있다면 
      if(dic.containsKey(word)) {
         System.out.println(word+" 의 뜻은 "+mean+"입니다.");
      }else {
         System.out.println(word+" 는 목록에 없습니다.");
      }

   }
}

