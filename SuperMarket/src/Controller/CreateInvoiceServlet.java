package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DTO.StockInquiryDTO;
import DTO.StockResponseDTO;
import Model.InvoiceItem;
import Model.Stock;
import Service.IStockService;
import Service.StockService;

@WebServlet("/createinvoice")
public class CreateInvoiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CreateInvoiceServlet() {
		super();

	}

	List<Stock> stockList;
	List<InvoiceItem> invoiceItemList;
	Stock stock=new Stock();
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		stockList = new ArrayList<>();
		invoiceItemList = new ArrayList<>();
//		if (request.getParameter("save") != null) {
//			invoiceItemList=request.getParameter("invoice");
//		}
		request.getRequestDispatcher("/View/CreateInvoice.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String codeNo = request.getParameter("codeNo");
		StockInquiryDTO stockInquiryDTO = new StockInquiryDTO();
		stockInquiryDTO.setCodeNo(codeNo);
		StockResponseDTO stockResponseDTO = new StockResponseDTO();
		IStockService iStockService = new StockService();
		stockResponseDTO = iStockService.inquireStock(stockInquiryDTO);
		stock=null;
		if(!stockResponseDTO.getStockList().isEmpty()){
			stock = stockResponseDTO.getStockList().get(0);
		}
		
		InvoiceItem invoiceItem = new InvoiceItem();
		if (stock!=null) {
			stockList.add(stock);
			invoiceItem.setStockId(stock.getStockID());
			invoiceItem.setStockName(stock.getStockName());
			invoiceItem.setCodeNo(stock.getCodeNo());
			invoiceItem.setQuantity(stock.getQuantity());
			invoiceItem.setUnitCost(stock.getPrice());
			invoiceItem.setPrice(stock.getQuantity() * stock.getPrice());
			invoiceItem.setDescription(stock.getDescription());
		}
//		invoiceItemList.add(invoiceItem);
//		request.setAttribute("invoice", invoiceItemList);
		
		request.setAttribute("stockList", stockList);
		request.getRequestDispatcher("/View/CreateInvoice.jsp").forward(request, response);
	}

}
