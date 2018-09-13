public class Person
{
	public Person(){
		this.age = 18;
	}
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
    private String name;
    private int age;
   // public int sex;
    public void study(){
        System.out.println("Studying...");
    }

    public void showAge(){
        System.out.println(this.age);
    }
    public void addAge(int i){
        age = age + i;
    }

    public void setAge(int i){
        if(i < 0 || i > 130){
            System.out.println("wrong age!");
            return;
        }
        age = i;
    }
    public int getAge(){
        return this.age;
    }
    public static void main(String[] args){
        Person h = new Person("Tom", 22);
        h.study();
        h.addAge(4);
        h.showAge();
        h.setAge(18);
        h.showAge();
    }

}
