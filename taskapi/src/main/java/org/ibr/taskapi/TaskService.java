package org.ibr.taskapi;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class TaskService {

    private List<Task> tasks = new ArrayList<>();

    public Task createTask(Task task) {
        tasks.add(task);   // <-- tasks is null here
        return task;
    }

    // findBYID
    public Task findByIndex(int id) {
        return tasks.get(id);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public List<Task> getTasksByName(String query) {
        return tasks.stream().
                filter(t -> Objects.equals(t.name(), query))
                .map(task -> task)
                .toList();
    }
}
