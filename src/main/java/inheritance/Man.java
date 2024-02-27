package inheritance;

import java.util.Objects;

public class Man {
    private int weight;
    private int height;
    private int salary;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Man(int weight, int height, int salary) {
        this.weight = weight;
        this.height = height;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Man{" +
                "weight=" + weight +
                ", height=" + height +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Man man = (Man) o;
        return weight == man.weight && height == man.height && salary == man.salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, height, salary);
    }
}
