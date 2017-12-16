package mdsadabwasimcom.workout;


public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts = {
      new Workout("The Limb Loosener" , "5 Handstand push-ups\n10 1-legged squats\n15 pullups"),
      new Workout("Core Agony", "100 Pull-ups\n100 Sit-ups\n100 Squats"),
      new Workout("Strength and length" , "500meter run\n21 * 1.5 pood kettleball swing\n21 * pull_ups"),
    new Workout("Physical Strength", "30 Push-ups\n5 minutes Plank\n30 squats")
    };

    public Workout(String name, String description) {
        this.name= name;
        this.description=description;

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
 public String toString(){
     return this.name;
 }
}
