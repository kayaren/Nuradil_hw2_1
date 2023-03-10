public class Cow extends Animal{


    public Cow(int age, String name, Color color) {
        super(age, name, color);
    }

    public final void makeVoice(){
        System.out.println("муууу");
    }
    public  void makeVoice(String voice){
        System.out.println(voice);
    }
    public void getInfo(){
        System.out.println("name:" + getName() +
                "\nage:" + getAge() + "\ncolor:" + getColor());
    }
}
