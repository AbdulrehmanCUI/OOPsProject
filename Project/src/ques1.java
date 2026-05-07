abstract class Animali{
    abstract void sound();
}

class Human extends Animali{
    void sound(){
        System.out.println("");
    }
}
class Abdulrehman extends Human{
    public static void pilot(){
        System.out.println("10:06");
    }

}
class Abd extends Animali{
    @Override
    void sound() {
        System.out.println("bark bhao bhao");
    }
}

