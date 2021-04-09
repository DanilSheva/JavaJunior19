package Lesson8;

public class Dog {
    private int age;
    private String name;
    private String poroda;



    public void setName(String name){
        this.name = name;


    }
    public void setAge(int age){
        this.age= age;


    }
    public void setPoroda(String poroda){
        this.poroda=poroda;

    }

    public void printAbout(){
        System.out.println(" Меня зовут " + name + ", мне " + age + " лет, и я " + poroda + " породы ");
    }
}
