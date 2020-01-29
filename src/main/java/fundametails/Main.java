package fundametails;

public class Main {
    public static void main(String[] args){
        MainTask mainTask = new MainTask();
        mainTask.tasks(args);

        OptionalTask2 optionalTask = new OptionalTask2();
        optionalTask.start();
    }
}
