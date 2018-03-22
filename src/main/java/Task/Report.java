package Task;

import java.util.List;

public class Report {

    private final List<Task> tasks;

    public Report(List<Task> tasks) {
        this.tasks = tasks;
    }

    public int getUnitsOfWork() {
        return 10;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return "Report{" +
                "tasks=" + tasks +
                '}';
    }
}
