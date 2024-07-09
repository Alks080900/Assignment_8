package Assignment_8_Problem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {


        public static void main(String[] args) {
            List<Marketing> marketingList = new ArrayList<>();

            marketingList.add(new Marketing("Alexander Oblego", "Nivea", 1500.0));
            marketingList.add(new Marketing("John Doe", "Verizon", 900.0));
            marketingList.add(new Marketing("Bob Marley", "Grammarly", 900.0));
            marketingList.remove(new Marketing("Bob Marley", "Grammarly", 900.0));

            System.out.println("Size of the marketing list: " + marketingList.size());

            System.out.println("Contents of the marketing list:");
            for (Marketing marketing : marketingList) {
                System.out.println(marketing);
            }


            Collections.sort(marketingList, (o1, o2) -> Double.compare(o1.getSalesAmount(), o2.getSalesAmount()));

            System.out.println("Contents of the marketing list sorted by salesAmount:");
            for (Marketing marketing : marketingList) {
                System.out.println(marketing);
            }

            List<Marketing> highSalesList = Marketing.listMoreThan1000(marketingList);

            System.out.println("Contents of the high sales list sorted by employeeName:");
            for (Marketing marketing : highSalesList) {
                System.out.println(marketing);
            }
        }
    }


