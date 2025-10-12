package interface_ex;

public class Car implements Engine{


    @Override
    public void startEngine() {
        System.out.println("Engine is starting");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine is stopping");
    }

    void drive(){
        startEngine();
        stopEngine();
    }
}
