package Abstraction;

import java.awt.image.PackedColorModel;

interface Robot{
    void work();
    void charge();
}
class TeacherRobot implements Robot {
    @Override
    public void work() {
        System.out.println("Teacher robot is teaching");
    }

    @Override
    public void charge() {
        System.out.println("Teacher robot charging");
    }
}

class DoctorRobot implements Robot {
    @Override
    public void work() {
        System.out.println("Doctor robot id doing surgery");
    }

    @Override
    public void charge() {
        System.out.println("Doctor robot is charging");
    }
}
public class Program111 {
    public static void main(String[] args) {
       accessRobot(new DoctorRobot());
       accessRobot(new TeacherRobot());
    }
     static void accessRobot(Robot robo){
              robo.work();
              robo.charge();
    }
}
