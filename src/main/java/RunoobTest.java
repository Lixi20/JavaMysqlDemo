import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class RunoobTest {
    public static  void main(String[] args) {
        ArrayList<String> boy = new ArrayList<String>();
        boy.add("张三");
        boy.add("李四");
        boy.add("王五");
        boy.add("老刘");
        boy.add("老大");
        boy.add("老二");
        boy.add("老九");
        System.out.println(boy);

        Iterator<String> it = boy.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
//        for (String s : boy) {
//            System.out.println(s);
//
//            Collections.shuffle(boy);
//        }

        }
    }}
