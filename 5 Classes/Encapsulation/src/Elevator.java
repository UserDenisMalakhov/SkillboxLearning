public class Elevator {

    private int currentFloor = 1;
    public int minFloor;
    public int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
    }

    public  void  moveUp() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void move(int floor) {

        if (floor > maxFloor || floor < minFloor || floor == 0) {
            System.out.println("Несуществующий этаж!");
            return;
        }

        if (currentFloor != floor) {
            while (currentFloor < floor) {
                moveUp();
                System.out.println("Этаж: " + currentFloor);
            }
        }

        if (currentFloor != floor) {
            while (currentFloor > floor) {
                moveDown();
                System.out.println("Этаж: " + currentFloor);
            }
        }
    }
}