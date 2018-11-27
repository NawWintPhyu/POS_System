package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DTO.StockInquiryDTO;
import DTO.StockResponseDTO;
import Model.Stock;
import Service.IStockService;
import Service.StockService;

/**
 * Servlet implementation class UpdateStockServlet
 */
@WebServlet("/updatestock")
public class UpdateStockServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public UpdateStockServlet() {
        super();
    }

    StockResponseDTO stockResponseDTO;
    IStockService iStockService=new StockService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int stockID=Integer.parseInt(request.getParameter("id"));
		//IStockService iStockService=new StockService();
		StockInquiryDTO stockInquiryDTO=new StockInquiryDTO();
		stockInquiryDTO.setStockID(stockID);
		stockResponseDTO=iStockService.inquireStock(stockInquiryDTO);
		request.setAttribute("stockList", stockResponseDTO.getStockList().get(0));
		request.getRequestDispatcher("/View/UpdateStock.jsp").forward(request, response);

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Stock stock=stockResponseDTO.getStockList().get(0);
		stock.setStockName(request.getParameter("name"));
		stock.setCodeNo(request.getParameter("codeNo"));
		stock.setCategory(request.getParameter("category"));
		stock.setQuantity(Integer.parseInt(request.getParameter("quantity")));
		stock.setPrice(Long.parseLong(request.getParameter("price")));
		stock.setDescription(request.getParameter("description"));
		stock=iStockService.updateStock(stock);
		request.getRequestDispatcher("/View/UpdateStock.jsp").forward(request, response);
		
	}

}
