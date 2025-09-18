package labs.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;



public class App {
    public static void main(String[] args) {
        Hospital h1 = new Hospital("H1", 10);
        Hospital h2 = new Hospital("H2", 20);
        Hospital h3 = new Hospital("H3", 30);

        HospitalList hospitalList = new HospitalList(List.of(h1, h2, h3));

        for (Hospital hospital : hospitalList) {
            System.out.println(hospital);
        }

    }
}


