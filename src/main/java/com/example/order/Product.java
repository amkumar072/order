package com.example.order;


import java.util.ArrayList;
import java.util.List;

public abstract class Product {

    public List<String> listOfitems = new ArrayList<>();

    void GetSlip() {
        listOfitems.add("A packing slip for shipping");
    }

    void AgentCommission() {
        listOfitems.add("Commission payment to the agent");
    }

    void Email() {
        listOfitems.add("Email sent");
    }

    void PrintResult() {
        listOfitems.forEach(item -> {
            System.out.println(item);
        });
    }
}

class Book extends Product {

    Book() {
        GetSlip();
        DuplicateSlip();
        AgentCommission();

        PrintResult();
    }

    void DuplicateSlip() {
        listOfitems.add("Duplicate packing slip for the royalty department");
    }
}

class Video extends Product {

    String videoName = "Learning to Ski";

    Video(String name) {

        GetSlip();
        if (name.equalsIgnoreCase(videoName)) {
            listOfitems.add("Added a free “First Aid” video to the packing slip");
        }
        PrintResult();
    }
}


class ActiveMemberShip extends Product {

    ActiveMemberShip() {
        listOfitems.add("Activate Membership");
        Email();

        PrintResult();
    }

}


class UpgradeMemberShip extends Product {

    UpgradeMemberShip() {
        listOfitems.add("Upgrade Membership");
        Email();

        PrintResult();
    }

}

