package task2;

public class Vehicle {

    Vehicle(String dr_cl, String wh_cl){
        Door door = new Door();
        Wheel wheel = new Wheel();
        door.door_color = dr_cl;
        wheel.wheel_color = wh_cl;
        System.out.println("Door color: " + door.getDoor_color());
        System.out.println("Wheel color: " + wheel.getWheel_color());
    }

    private class Wheel{
        String wheel_color;

        public String getWheel_color() {
            return wheel_color;
        }

    }

    private class  Door{
        String door_color;

        public String getDoor_color() {
            return door_color;
        }

    }


}
