/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.Iterator;
import static lab6.ArrayList.CAPACITY;

/**
 *
 * @author saum
 */
public class Lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Iterator<Integer> data = list.iterator();
        //add to the first position in the queue
        for (int i = 0; i < CAPACITY; i++) {
            list.add(0, i + 1);
        }
        //iterate over list
        while (data.hasNext()) {
            System.out.println(data.next());
        }

        //remove function to reduce list, and print out remaining elements
        for (int i = 0; i < CAPACITY - 1; i++) {
            System.out.println("\nRemoving first element...");
            list.remove(0);
            data = list.iterator();
            for (int x = 0; x < list.size(); x++) {
                System.out.println("Index - " + x + " Element - " + data.next());
                if (list.size() == 1) {
                    System.out.println("\nRemoving last element...");
                    list.remove(0);
                }
            }
        }

        //add numbers in proper order
        for (int i = 0; i < CAPACITY; i++) {
            list.add(0, CAPACITY - i);
        }

        //output proper order
        data = list.iterator();
        System.out.println("");
        while (data.hasNext()) {
            System.out.println(data.next());
        }
    }
}
