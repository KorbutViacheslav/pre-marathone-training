package start;

import configuration.ApplicationSpringConfig;
import model.Priority;
import model.Task;
import model.ToDo;
import model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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

        var userService = new UserServiceImpl();
        var toDoService = new ToDoServiceImpl(userService);
        var taskService = new TaskServiceImpl(toDoService);
        User mark = new User("Mark","Twen","tewn@gmail","12345");
        User george = new User("Gerge","Martin","martin@gmail","54321");
        User tom = new User("Tom","Jerry","jerry@gmail","11111");

        userService.addUser(mark);
        userService.addUser(george);
        userService.addUser(tom);

        ToDo toDo1 = new ToDo("1 to do",mark);
        ToDo toDo2 = new ToDo("2 to do",mark);
        ToDo toDo3 = new ToDo("3 to do",george);
        ToDo toDo4 = new ToDo("4 to do",tom);
        toDoService.addToDo(toDo3);
        toDoService.addToDo(toDo1);
        toDoService.addToDo(toDo2);
        toDoService.addToDo(toDo4);

        taskService.createTask(new Task("Task1",Priority.HIGH),toDo1);
        taskService.createTask(new Task("Task2",Priority.HIGH),toDo2);
        taskService.createTask(new Task("Task3",Priority.HIGH),toDo3);
        taskService.createTask(new Task("Task4",Priority.HIGH),toDo4);

        userService.getAllUsers().forEach(System.out::println);
        System.out.println("AFTER");
        toDoService.deleteTodo("2 to do");
        userService.getAllUsers().forEach(System.out::println);

        context.close();
    }

}
