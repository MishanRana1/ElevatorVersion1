public class MyFirstBuilding {
    public static void main(String[] args) {
        Building b = new Building();

        b.showStatus();     // should show: floor 1

        b.requestElevator(5);   // move to 5
        b.showStatus();

        b.requestElevator(2);   // move to 2
        b.showStatus();
    }
}