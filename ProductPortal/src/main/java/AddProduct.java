import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import samples.model.Product;
@WebServlet("/AddProduct")
public class AddProduct extends HttpServlet {
private static final long serialVersionUID = 1L;
public AddProduct() {
super();
}
protected void doGet(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {
response.getWriter().append("Served at:").append(request.getContextPath());
}
@SuppressWarnings("unchecked")
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int id = Integer.parseInt(request.getParameter("id"));
	String name = request.getParameter("name");
	Float price = Float.parseFloat( request.getParameter("price"));
	int quantity = Integer.parseInt(request.getParameter("quantity"));
	Product product = new Product(id,name,price,quantity);
	HttpSession ss = request.getSession();
	request.getSession(true);
	Object obj = ss.getAttribute("obj");
	List<Product> listOfObj;
	if (obj == null) {
	listOfObj = new ArrayList<Product>();
	listOfObj.add(product);
	ss.setAttribute("obj", listOfObj);
	} else {
	listOfObj = (List<Product>) ss.getAttribute("obj");
	listOfObj.add(product);
	ss.setAttribute("obj", listOfObj);
	}
	response.sendRedirect("display.jsp");
	}
	}		
