package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Lessons;
import utils.DBUtils;
import utils.MyUtils;

@WebServlet(urlPatterns = { "/editLessons" })
public class EditLessonsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public EditLessonsServlet() {
        super();
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection conn = MyUtils.getStoredConnection(request);

        String numStr = (String) request.getParameter("num");

        int num = 0;
        try {
            num = (int) Float.parseFloat(numStr);
        } catch (Exception e) {
        }
         Lessons lessons = null;

        String errorString = null;

        try {
            lessons = DBUtils.findLessons(conn, num);
        } catch (SQLException e) {
            e.printStackTrace();
            errorString = e.getMessage();
        }

        if (errorString != null && lessons== null) {
            response.sendRedirect(request.getServletPath() + "/lessonsList");
            return;
        }

        request.setAttribute("errorString", errorString);
        request.setAttribute("lessons", lessons);

        RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/views/editLessonsView.jsp");
        dispatcher.forward(request, response);

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection conn = MyUtils.getStoredConnection(request);

        String numStr = (String) request.getParameter("num");
        String p_11 = (String) request.getParameter("p_11");
        String p_12 = (String) request.getParameter("p_12");
        String p_13 = (String) request.getParameter("p_13");
        String p_14 = (String) request.getParameter("p_14");
        String r_11 = (String) request.getParameter("r_11");
        String r_12 = (String) request.getParameter("r_12");
        String k_11 = (String) request.getParameter("k_11");
        String k_12 = (String) request.getParameter("k_12");
        String k_13 = (String) request.getParameter("k_13");
        String e_11 = (String) request.getParameter("e_11");
        String f_11 = (String) request.getParameter("f_11");
        String d_11 = (String) request.getParameter("d_11");
        String a_11 = (String) request.getParameter("a_11");
        String o_11 = (String) request.getParameter("o_11");
        String ar_11 = (String) request.getParameter("ar_11");
        int num = 0;
        try {
            num = (int) Float.parseFloat(numStr);
        } catch (Exception e) {
        }
        Lessons lessons = new Lessons(num, p_11, p_12, p_13, p_14, r_11, r_12, k_11, k_12, k_13, e_11, f_11, d_11, a_11, o_11, ar_11);

        String errorString = null;

        try {
            DBUtils.updateLessons(conn, lessons);
        } catch (SQLException e) {
            e.printStackTrace();
            errorString = e.getMessage();
        }

        request.setAttribute("errorString", errorString);
        request.setAttribute("lessons", lessons);


        if (errorString != null) {
            RequestDispatcher dispatcher = request.getServletContext()
                    .getRequestDispatcher("/WEB-INF/views/editLessonsView.jsp");
            dispatcher.forward(request, response);
        }

        else {
            response.sendRedirect(request.getContextPath() + "/lessonsList");
        }
    }

}