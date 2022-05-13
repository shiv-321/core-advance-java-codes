package com.javapracticeshiv;

class MyEmployee {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

    public class Ch_9_access_modifier {
    public static void main(String[] args) {
        MyEmployee subina = new MyEmployee();
//        subina.id = 45;
//        subina.name = "Subina Shrestha"; // throws an errors due to private access modifier
//        System.out.println(subina.id);
//        System.out.println(subina.name);

        subina.setId(45);
        subina.setName("Subina Shrestha");

        int id = subina.getId();
        String name = subina.getName();

        System.out.println(id);
        System.out.println(name);

        System.out.println(subina.getId());
        System.out.println(subina.getName());


    }
}
