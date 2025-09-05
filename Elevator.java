public class Elevator {
    private int currentFloor;
    private int minFloor;
    private int maxFloor;
    private String state; // "idle" or "moving"

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.currentFloor = minFloor; // starts at min
        this.state = "idle";
    }

    public void moveTo(int floor) {
        // check bounds
        if (floor < minFloor || floor > maxFloor) {
            System.out.println("Invalid floor: " + floor + " (allowed: " + minFloor + "-" + maxFloor + ")");
            System.out.println();
            return;
        }

        if (floor == currentFloor) {
            System.out.println("Already at floor " + currentFloor + " [idle]");
            System.out.println();
            return;
        }

        state = "moving";
        System.out.println("Moving from " + currentFloor + " \u2192 " + floor);

        if (floor > currentFloor) {
            for (int f = currentFloor + 1; f <= floor; f++) {
                System.out.println("... passing floor " + f);
            }
        } else {
            for (int f = currentFloor - 1; f >= floor; f--) {
                System.out.println("... passing floor " + f);
            }
        }

        currentFloor = floor;
        state = "idle";
        System.out.println("Elevator arrived at floor " + currentFloor + " [idle]");
        System.out.println();
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public String getState() {
        return state;
    }
}