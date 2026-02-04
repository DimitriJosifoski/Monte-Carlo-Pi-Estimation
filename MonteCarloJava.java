import java.util.Random;

public class MonteCarloJava {

    public static void main(String[] args) {

        int INTERVAL = 1000;
        long totalPoints = (long) INTERVAL * INTERVAL;

        long circlePoints = 0;

        // Java's Random uses a 48-bit Linear Congruential Generator (LCG)
        Random rand = new Random(123); // fixed seed for reproducibility

        for (long i = 0; i < totalPoints; i++) 
        {
            // Generate random x and y in [-1, 1]
            double randX = -1 + 2 * rand.nextDouble();
            double randY = -1 + 2 * rand.nextDouble();

            double distance = randX * randX + randY * randY;

            if (distance <= 1) 
            {
                circlePoints++;
            }
        }

        double piEstimate = 4.0 * circlePoints / totalPoints;

        System.out.println("Final Estimation of Pi = " + piEstimate);
    }
}