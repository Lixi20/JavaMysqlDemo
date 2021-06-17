package model;

/**
 * student类，字段包括id,name,age,score
 * 实现无参构造，带参构造，toString方法，以及get，set方法
 */
public class Student {
    private int id;
    private String name;
    private int age;
    private double score;

    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Student(String name, int age, double score) {
        super();
        this.name = name;
        this.age = age;
        this.score = score;
    }
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age
                + ", score=" + score + "]";
    }

}