package Applicant;

public class Applicant {
    String name;
    int age;
    int score;

    public Applicant(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    void possibility_of_free_education() {
        if (score>59 && age>15){
            System.out.println(name+", у вас есть возможность получить бесплатное высшее образование");
        }
        else if (age<16){
            System.out.println(name+", для получения высшего образования нужно сначала закончить школу");
        }
        else {
            System.out.println(name+", для получения высшего образования нужно набрать минимум 60 баллов");
        }
    }}


