package pavel.kavaliuk.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SumServlet extends HttpServlet {

    private int firstDigit;
    private int secondDigit;
    private int result;

    public int getFirstDigit() {
        return firstDigit;
    }

    public void setFirstDigit(int firstDigit) {
        this.firstDigit = firstDigit;
    }

    public int getSecondDigit() {
        return secondDigit;
    }

    public void setSecondDigit(int secondDigit) {
        this.secondDigit = secondDigit;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("sum.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        setFirstDigit(Integer.parseInt(req.getParameter("firstDigit")));
        setSecondDigit(Integer.parseInt(req.getParameter("secondDigit")));
        setResult(getFirstDigit() + getSecondDigit());
        req.setAttribute("result", getResult());
        doGet(req, resp);
    }
}
