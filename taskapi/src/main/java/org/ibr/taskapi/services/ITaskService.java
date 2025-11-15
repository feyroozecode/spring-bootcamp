package org.ibr.taskapi.services;

import org.ibr.taskapi.models.Task;
import org.ibr.taskapi.models.TaskCreationDTO;

import java.util.List;

public interface ITaskService {
    public Task createTask(TaskCreationDTO task);

    public List<Task> getTasks();

    public Task findByIndex(int index);

    public void setTasks(List<Task> tasks);

    public List<Task> getTasksByName(String query);
}
