package Tests;

public class Car {
    private String color;
    private Integer age;
    private String model;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car(String color, Integer age, String model) {
        this.color = color;
        this.age = age;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", model='" + model + '\'' +
                '}';
    }
}
