package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mainRun {
    public static void main(String args[]){
        List<ArrayListSample> person = new ArrayList<ArrayListSample>();
        person.add(new ArrayListSample(2,"Lakshu"));
        person.add(new ArrayListSample(1,"Akshai"));
        person.add(new ArrayListSample(25,"Abhi"));
        person.add(new ArrayListSample(22,"Abu"));

        Collections.sort(person, ArrayListSample.compareage);
        System.out.println("sorted by age");
        for(ArrayListSample single : person){
            System.out.println(single.getAge());

        }
        System.out.println("Sorted by name");
        Collections.sort(person, ArrayListSample.comparebyname);
        for(ArrayListSample singlee : person)
        {
            System.out.println(singlee.getName());
        }


    }
}
