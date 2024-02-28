package org.example;

import model.Priority;
import model.Task;
import service.TaskService;
import service.impl.TaskServiceImpl;
import service.impl.ToDoServiceImpl;
import service.impl.UserServiceImpl;

/**
 * @author Viacheslav Korbut
 */
public class App {
/*    public static void main(String[] args) {
*//*        var context = new AnnotationConfigApplicationContext(SpringConfig.class);
        var musicPlayer = context.getBean(MusicPlayer.class);
        musicPlayer.playMusic();
        context.close();*//*
        TaskService taskService = new TaskServiceImpl(new ToDoServiceImpl(new UserServiceImpl()));
        System.out.println(taskService.createTask(new Task("Task #1", Priority.MEDIUM)));
        System.out.println(taskService.createTask(new Task("Task #3", Priority.MEDIUM)));
        System.out.println(taskService.getTaskList());
        System.out.println("Delete: "+taskService.deleteTask("Task #1"));
        Task ta = new Task("Task #3",Priority.HIGH);
        System.out.println("Update: "+taskService.updateTask(ta));
        System.out.println("Read: " + taskService.readTsk("Task #2"));

    }*/
}
