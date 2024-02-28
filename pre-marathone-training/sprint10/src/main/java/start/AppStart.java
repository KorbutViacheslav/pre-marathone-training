package start;

import configuration.ApplicationSpringConfig;
import model.Priority;
import model.Task;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.TaskService;
import service.impl.TaskServiceImpl;
import service.impl.ToDoServiceImpl;
import service.impl.UserServiceImpl;

/**
 * Author: Viacheslav Korbut
 * Date: 21.02.2024
 */
public class AppStart {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ApplicationSpringConfig.class);

/*        TaskService taskService = new TaskServiceImpl(new ToDoServiceImpl(new UserServiceImpl()));
        System.out.println(taskService.createTask(new Task("Task #1", Priority.MEDIUM)));
        System.out.println(taskService.createTask(new Task("Task #3", Priority.MEDIUM)));
        System.out.println(taskService.getTaskList());
        System.out.println("Delete: "+taskService.deleteTask("Task #1"));
        Task ta = new Task("Task #3",Priority.HIGH);
        System.out.println("Update: "+taskService.updateTask(ta));
        System.out.println("Read: " + taskService.readTsk("Task #2"));*/
        ToDoServiceImpl toDoService = new ToDoServiceImpl(new UserServiceImpl());


        context.close();
    }

}
