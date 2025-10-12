package abs_One;

class Car extends Engine {
    // Engine
    // Gear box
    // Keys

    // Tesla is-A Car
    // Tesla - drive function


    @Override
    void openCar() {
        System.out.println("Open Car with keys");
    }

    @Override
    void partGearBox() {
        System.out.println("Part of Gear box");
    }

    @Override
    void stop() {
        System.out.println("Stop the car");
    }

    @Override
    void start() {
        System.out.println("Start the car");
    }
}
