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

@WebServlet("/delete-task")
public class DeleteTaskServlet extends HttpServlet {

    private TaskRepo taskRepository;

    @Override
    public void init()  {
        taskRepository = new TaskRepo();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int taskId = Integer.parseInt(request.getParameter("id"));
        if (taskRepository.delete(taskId)) {
            response.sendRedirect("/tasks-list");
        } else {
            request.setAttribute("message", "Task with ID " + taskId + " not found!");
            request.setAttribute("url", request.getContextPath() + "/delete-task?id=" + taskId);
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher(JspHelper.getPath("error"));
            requestDispatcher.forward(request, response);
        }
    }
}
