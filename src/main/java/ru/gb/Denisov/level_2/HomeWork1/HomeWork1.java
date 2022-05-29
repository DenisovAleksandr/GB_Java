package ru.gb.Denisov.level_2.HomeWork1;

public class HomeWork1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Human human = new Human();
        Robot robot = new Robot();
        RunningTrack runningTrack1 = new RunningTrack(9);
        RunningTrack runningTrack2 = new RunningTrack(11);
        RunningTrack runningTrack3 = new RunningTrack(14);
        Wall wall1 = new Wall(1);
        Wall wall2 = new Wall(2);
        Wall wall3 = new Wall(5);

        Obstacles obstacles[] = {runningTrack1, runningTrack2, wall1, wall2};

        Team[] team = {cat, robot, human};
        for (Team teams:team) {
            int i = 0;
            do {
                moves(teams , obstacles[i]);
                i++;
            }
            while (teams.getComplete()&&i<obstacles.length);
            if(i==obstacles.length&& teams.getComplete()) {
                System.out.print("Congratulations! Obstacle course completed!");
            }
            System.out.println();
        }

    }

    static void moves(Team team, Obstacles obstacles) {
        if (obstacles instanceof Wall) {
            team.jump(obstacles);
        } else {
            team.run(obstacles);
        }
    }
}


