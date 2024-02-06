package servlets;



import repository.TaskRepo;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import util.JspHelper;

import java.io.IOException;

@WebServlet("/tasks-list")
public class TasksListServlet extends HttpServlet {

    private TaskRepo taskRepository;

    @Override
    public void init() {
        taskRepository = TaskRepo.getTaskRepository();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(JspHelper.getPath("tasks-list"));
        request.setAttribute("tasks", taskRepository.all());
        requestDispatcher.forward(request, response);
    }
}
