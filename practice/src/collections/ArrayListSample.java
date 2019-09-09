package collections;

import java.util.Comparator;

public class ArrayListSample {
private int age;
private String name;

    public ArrayListSample(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static Comparator<ArrayListSample> comparebyname = new Comparator<ArrayListSample>() {
        public int compare(ArrayListSample obj1, ArrayListSample obj2) {
            return obj1.name.compareTo(obj2.name);
        }
    };

        public static Comparator<ArrayListSample> compareage = new Comparator<ArrayListSample>() {
            public int compare(ArrayListSample obj1, ArrayListSample obj2) {
                return obj1.age > obj2.age ? 1 : obj1.age < obj2.age ? -1 : 0;
            }
        };
    }


