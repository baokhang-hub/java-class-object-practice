import java.util.Arrays;

public class Student {
    String name;
    int age;
    double[] scores;

    public Student(String name, int age, double[] scores) {
        this.name = name;
        this.age = age;
        this.scores = scores;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScores(double[] scores) {
        this.scores = scores;
    }

    public void displayInfo() {
        System.out.println("Ten: " + this.name);
        System.out.println("Tuoi: " + this.age);
        System.out.println("Diem: " + Arrays.toString(this.scores));
    }

    public double getAverage() {
        double sum = 0;

        for (int i = 0; i < this.scores.length; i++) {
            sum += this.scores[i];
        }
        return sum / this.scores.length;
    }
}
