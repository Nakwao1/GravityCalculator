public class GravityCalculator {
//Nana Kwaku Owusu
    public static void main(String[] arguments) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;

        // The object of the modified code is "The object's position after 10.0 seconds is -490.5m."
        finalPosition = (((gravity * Math.pow(fallingTime, 2))/2) + (initialVelocity * fallingTime) + initialPosition);

        // The object of the initial code is "The object's positionn after 10.0 seconds is 0.0m."
        System.out.println("The object's position after " + fallingTime +
                " seconds is " + finalPosition + " m.");
    }
}

