public class Building {
    private Elevator elevator;

    // creates a building with one elevator
    public Building() {
        this.elevator = new Elevator(1, 10);
    }

    public void requestElevator(int floor) {
        System.out.println("Request: go to floor " + floor);
        elevator.moveTo(floor);
    }

    public void showStatus() {
        System.out.println("Elevator is at floor " + elevator.getCurrentFloor()
                + " [" + elevator.getState() + "]");
        System.out.println();
    }
}