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

@WebServlet("/edit-task")
public class UpdateTaskServlet extends HttpServlet {

    private TaskRepo taskRepository;
    private Task task;

    @Override
    public void init() {
        taskRepository = new TaskRepo();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            task = taskRepository.read(id);
            if (task == null) {
                response.setStatus(HttpServletResponse.SC_NOT_FOUND);
                request.setAttribute("message", "Task with ID " + id + " not found!");
                request.setAttribute("url", "/edit-task");
                request.getRequestDispatcher(JspHelper.getPath("error")).forward(request, response);
            } else {
                request.setAttribute("task", task);
                request.getRequestDispatcher(JspHelper.getPath("edit-task")).forward(request, response);
            }
        } catch (NumberFormatException e) {
            request.setAttribute("message", "You must enter the task id!");
            request.setAttribute("url", "/edit-task");
            request.getRequestDispatcher(JspHelper.getPath("error")).forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        task.setTitle(request.getParameter("title"));
        task.setPriority(Priority.valueOf(request.getParameter("priority")));
        taskRepository.update(task, task.getId());
        response.sendRedirect("/tasks-list");
    }
}