package scs;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Addser")
public class Addser extends HttpServlet {
private static final long serialVersionUID = 1L;
       
    
    public Addser() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//PrintWriter out = response.getWriter();
		int a = Integer.parseInt(request.getParameter("txtnum1"));
		int b = Integer.parseInt(request.getParameter("txtnum2"));
		int c=0;
		if(request.getParameter("btnsubmit").equals("+"))
		{
		c= a+b;
		}
		else if(request.getParameter("btnsubmit").equals("-"))
		{
		 c=a-b;	
		}
		else if(request.getParameter("btnsubmit").equals("*"))
		{
		  c=a*b;	
		}
		else if(request.getParameter("btnsubmit").equals("/"))
		{
			c=a/b;
		}
		
		response.sendRedirect("additionexample.jsp?q="+c);
		//out.print(c);
	}

}

