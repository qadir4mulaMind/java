package oops;

import java.util.ArrayList;

class Arraylist{ // User Defined Datatype
    int[] arr = new int[10];
    int idx = 0;
    int capacity = 10;
    int size = 0;

    public Arraylist(int capacity) {
        arr = new int[capacity];
    }

    void add(int ele){
        if(idx == arr.length) setCapacityIncrease();
        arr[idx++] = ele;
        size++;
    }

    void setCapacityIncrease(){
        int[] arr2 = new int[arr.length * 2];
        for(int i = 0; i < arr.length; i++) { // copy paste
            arr2[i] = arr[i];
        }
        arr = arr2;
    }

    int capacity(){
        return arr.length;
    }
    int get(int index){
        return arr[index];
    }

    void display(){
        for(int i = 0; i < size; i++) System.out.print(arr[i] + " ");
    }

    void set(int index, int val){
        arr[index] = val;
    }

    void removeFromEnd(){
        idx--;
        size--;
    }
}
public class OwnArrayList {
    public static void main(String[] args) {
        Arraylist arr = new Arraylist(3);
        System.out.println(arr.capacity());
        System.out.println(arr.size);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr.size);
        arr.display();
        System.out.println();
        System.out.println(arr.get(1));
        // arr.add(40); --> index out of bound
        arr.add(40);
        arr.display();
        arr.add(50);
        arr.add(60);
        arr.add(70);
        arr.add(80);
        arr.add(90);
        arr.display();
    }
}