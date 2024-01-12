package servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Task;
import repository.TaskRepo;
import util.JspHelper;

import java.io.IOException;

@WebServlet("/read-task")
public class ReadTaskServlet extends HttpServlet {
    private TaskRepo taskRepo;

    @Override
    public void init() throws ServletException {
        taskRepo = new TaskRepo();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int taskId = Integer.parseInt(req.getParameter("id"));
        Task task = taskRepo.read(taskId);
        if (task != null) {
            req.setAttribute("task", task);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher(JspHelper.getPath("read-task"));
            requestDispatcher.forward(req, resp);
        } else {
            req.setAttribute("url", "/read-task");
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher(JspHelper.getPath("error-page"));
            requestDispatcher.forward(req, resp);
        }
    }
}
