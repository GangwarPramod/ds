package com.oopsConcept;

public class Encapsulation {

    private String sname;
    private int rollno;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    private String lastname;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
    public static void main(String[]args){
        Encapsulation en=new Encapsulation();
        en.setSname("rahul");
        en.setLastname("bhasker");
        en.setRollno(12);

        System.out.println(en.getSname());
        System.out.println(en.getLastname());
        System.out.println(en.getRollno());
    }
}
