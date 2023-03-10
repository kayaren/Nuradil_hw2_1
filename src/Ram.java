public final class Ram extends Animal{


    public Ram(int age, String name, Color color) {
        super(age, name, color);
    }




    public void makeVoice(){
        System.out.println("мэээээ");
    }

    public void getInfo(){
        System.out.println("name:" + getName() +
                "\nage:" + getAge() + "\ncolor:" + getColor());
    }

}
