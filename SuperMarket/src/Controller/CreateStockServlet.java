package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Stock;
import Service.IStockService;
import Service.StockService;

/**
 * Servlet implementation class CreateStock
 */
@WebServlet("/createstock")
public class CreateStockServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public CreateStockServlet() {
		super();
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("View/CreateStock.jsp").forward(request, response);

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String category = request.getParameter("category");
		String codeNo = request.getParameter("codeNo");
		String quantity = request.getParameter("quantity");
		String price = request.getParameter("price");
		String description = request.getParameter("description");

		Stock s = new Stock();
		s.setStockName(name);
		s.setCategory(category);
		s.setCodeNo(codeNo);
		s.setQuantity(Integer.parseInt(quantity));
		s.setPrice(Integer.parseInt(price));
		s.setDescription(description);
		s.setUserID(10);

		IStockService iStockService = new StockService();
		s = iStockService.createStock(s);
		request.getRequestDispatcher("/View/Home.jsp").forward(request, response);

	}

}
