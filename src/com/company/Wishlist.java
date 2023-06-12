package com.company;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Wishlist {

    Scanner scanner = new Scanner(System.in);


    String name;
    String shortDescription;
    double price;
    String URLAddress;
    int priority;

    public Wishlist(){}

    public Wishlist(String name, String shortDescription, double price, String URLAddress, int priority) {
        this.name = name;
        this.shortDescription = shortDescription;
        this.price = price;
        this.URLAddress = URLAddress;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getShortDescription() {
        return shortDescription;
    }
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getURLAddress() {
        return URLAddress;
    }
    public void setURLAddress(String URLAddress) {
        this.URLAddress = URLAddress;
    }

    public int getPriority() {
        return priority;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wishlist wishlist = (Wishlist) o;
        return Double.compare(wishlist.price, price) == 0 &&
                priority == wishlist.priority &&
                name.equals(wishlist.name) &&
                shortDescription.equals(wishlist.shortDescription) &&
                URLAddress.equals(wishlist.URLAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, shortDescription, price, URLAddress, priority);
    }

    public void sortByPriceDescending(){
        System.out.println("Введите что бы вы хотели купить (введите END для выхода):");
        String input = scanner.nextLine();
        String[] parse = input.split(", ");
        String name = parse[0];
        String shortDescription = parse[1];
        String price = parse[2];
        String URLAddress = parse[3];
        String priority = parse[4];
    }
    public void sortByPriceAscending(){

    }
    public void sortByPriorityFromMostImportant(){

    }
    public void sortByPriorityFromLowPriority(){

    }

}
