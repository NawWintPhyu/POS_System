package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import DTO.StockInquiryDTO;
import DTO.StockResponseDTO;
import Model.Stock;
import Service.IStockService;
import Service.StockService;

@WebServlet("/searchstock")
public class SearchStockServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SearchStockServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/View/SearchStock.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String stockName = request.getParameter("stockName");
		String codeNo = request.getParameter("codeNo");
		String minPrice = request.getParameter("min");
		String maxPrice = request.getParameter("max");
		String userName = request.getParameter("userName");

		StockInquiryDTO stockInquiryDTO = new StockInquiryDTO();

			if (!stockName.equals("")) {
				stockInquiryDTO.setStockName(stockName);
			}
			if (!codeNo.equals("")) {
				stockInquiryDTO.setCodeNo(codeNo);
			}
			if (!minPrice.equals("")) {
				stockInquiryDTO.setMinPrice(Long.parseLong(minPrice));
			}
			if (!maxPrice.equals("")) {
				stockInquiryDTO.setMaxPrice(Long.parseLong(maxPrice));
			}
			if (!userName.equals("")) {
				stockInquiryDTO.setUserName(userName);
			}
			StockResponseDTO stockResponseDTO = new StockResponseDTO();
			IStockService iStockService = new StockService();
			stockResponseDTO = iStockService.inquireStock(stockInquiryDTO);
			
			List<Stock> stockList=stockResponseDTO.getStockList();
			
			request.setAttribute("stockList", stockList);
			request.getRequestDispatcher("/View/SearchStock.jsp").forward(request, response);
	}

}
