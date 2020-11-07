package rockhomework3LV4;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Student s = new Student("",18);
        System.out.println(s.getAge()+"    "+s.getName());
        fanshe t = new fanshe();
        t.setProperty(s,"age","123");
        System.out.println(s.getAge()+"    "+s.getName());
    }
}
class Student {
    private int age;
    private String name;
    public Student() {
        super();
    }

    public Student(String name,int age) {
        super();
        this.name = name;
        this.age = age;
    }

        public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}
