package main.java.br.edu.ifba.saj.ads.poo.atividade_pratica;

public abstract class Human extends Entity{
    private String name;
    private int age;

    public Human(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
     
}
