public class AlienData {

    public static void main(String[] a)
    {
        Alien obj = new Alien();
        Alien obj1 = new Alien(24, "Prath");
        //obj.setAge(24);
        //obj.setName("Prath");

        System.out.println("Default Alien: " + obj.getName() + " : " + obj.getAge());
        System.out.println("Parameterized Alien: " + obj1.getName() + " : " + obj1.getAge());


    }
    
}

class Alien{

    private int age;
    private String name;

    public Alien(){

        age = 20;
        name = "Rahul";

    }

    public Alien(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }


    public int getAge()
    {
        return age;
    }


    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }


}
