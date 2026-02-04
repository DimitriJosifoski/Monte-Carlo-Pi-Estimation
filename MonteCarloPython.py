import random

INTERVAL = 10000

circle_points = 0
square_points = 0

random.seed(100)

# Total Random numbers generated is possible x values * possible y values
for i in range(INTERVAL**2):
    # Randomly generated x and y values from a uniform distribution between -1 and 1
    rand_x = random.uniform(-1, 1)
    rand_y = random.uniform(-1, 1)

    # Distance between (x, y) from the origin
    origin_dist = rand_x**2 + rand_y**2

    # Checking if (x, y) lies inside the circle
    if origin_dist <= 1:
        circle_points += 1

    square_points += 1

    # Formula to estimate value of pi
    pi = 4 * circle_points / square_points

print("Final Estimation of Pi=", pi)