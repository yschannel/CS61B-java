package demo.ch2.Dog;

public class DogLauncher {
    public static void main(String[] args){
        Dog d = new Dog(20);
        d.makeNoise();

        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog(8);
        dogs[1] = new Dog(40);

        dogs[0].makeNoise();
        dogs[1].makeNoise();


    }
}
