public class MarsRover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the plateau size
        int plateauWidth = scanner.nextInt();
        int plateauHeight = scanner.nextInt();

        // Loop through the rovers
        while (scanner.hasNext()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            char direction = scanner.next().charAt(0);
            String instructions = scanner.next();

            // Create a new rover and move it
            Rover rover = new Rover(x, y, direction);
            rover.move(instructions);

            // Print the final position of the rover
            System.out.println(rover.getPosition());
        }
    }
}