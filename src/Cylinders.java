import java.util.Arrays;

public class Cylinders {

    private Cylinder[] cylinders;

    public Cylinder[] getCylindres() {
        return cylinders;
    }

    public Cylinders() {
        this.cylinders = new Cylinder[0];
    }

    public void addCylinder(Cylinder cylinder) {
        Cylinder[] temp = Arrays.copyOf(cylinders, cylinders.length + 1);
        temp[cylinders.length] = cylinder;
        cylinders = temp;
    }

    public double getAverageCylinderVolume() {
        double volume = 0;
        for (int i = 0; i < cylinders.length; i++) {
            volume += cylinders[i].getVolume();
        }
        return volume / cylinders.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(cylinders) + "\n";
    }
}
