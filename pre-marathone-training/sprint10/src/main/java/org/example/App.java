package org.example;

import model.Priority;
import model.Task;
import org.example.training.MusicPlayer;
import org.example.training.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.TaskService;
import service.impl.TaskServiceImpl;

import java.util.List;

/**
 * @author Viacheslav Korbut
 */
public class App {
    public static void main(String[] args) {
/*        var context = new AnnotationConfigApplicationContext(SpringConfig.class);
        var musicPlayer = context.getBean(MusicPlayer.class);
        musicPlayer.playMusic();
        context.close();*/
        TaskService taskService = new TaskServiceImpl();
        System.out.println(taskService.createTask(new Task("Task #1", Priority.MEDIUM)));
        System.out.println(taskService.createTask(new Task("Task #3", Priority.MEDIUM)));
        System.out.println(taskService.getTaskList());
        System.out.println("Delete: "+taskService.deleteTask(1));
        Task ta = new Task("Task #3",Priority.HIGH);
        System.out.println("Update: "+taskService.updateTask(ta));
        System.out.println("Read: " + taskService.readTsk(5));

    }
}
