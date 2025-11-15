package org.ibr.taskapi.services;

import org.ibr.taskapi.models.Task;
import org.ibr.taskapi.models.TaskCreationDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class TaskService implements ITaskService {

    private List<Task> tasks = new ArrayList<>();

    @Override
    public Task createTask(TaskCreationDTO taskDTO) {
         Task task = new Task(taskDTO.getTitle(), taskDTO.getDescription());
         tasks.add(task);
         return task;
    }

    // findBYID
    @Override
    public Task findByIndex(int id) {
        return tasks.get(id);
    }

    @Override
    public List<Task> getTasks() {
        return tasks;
    }

    @Override
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
