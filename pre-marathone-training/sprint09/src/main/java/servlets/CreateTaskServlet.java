package servlets;

import model.Priority;
import model.Task;
import repository.TaskRepo;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import util.JspHelper;

import java.io.IOException;

@WebServlet(value = "/create-task")
public class CreateTaskServlet extends HttpServlet {

    private TaskRepo taskRepository;

    @Override
    public void init() {
        taskRepository = new TaskRepo();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher(JspHelper.getPath("/create-task")).forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String title = request.getParameter("title");
        String priority = request.getParameter("priority");

        Priority taskPriority = Priority.valueOf(priority);
        Task newTask = new Task(title, taskPriority);

        boolean created = taskRepository.create(newTask);

        if (created) {
            response.sendRedirect(request.getContextPath() + "/tasks-list");
        } else {
            response.sendRedirect(request.getContextPath() + "/create-task?error=taskExists");
        }
    }

}