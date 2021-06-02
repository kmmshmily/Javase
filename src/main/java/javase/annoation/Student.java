package javase.annoation;

/**
 * @program: book-java-for-demo
 * @description: 学生
 * @author: kmmshmily--cuiyong
 * @date: 2021-05-27 18:07
 **/

public class Student extends Person{
    private String score;
    public  String hobby;

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    private String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Student(){}
    public Student(String score, String hobby) {
        this.score = score;
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Student{" +
                "score='" + score + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
