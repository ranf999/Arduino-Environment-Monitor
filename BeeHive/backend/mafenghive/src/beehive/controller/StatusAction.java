package beehive.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beehive.bean.*;
import beehive.dao.*;

public class StatusAction extends HttpServlet {
	private SwitchDao switchDao = new SwitchDao();
	public StatusAction() {
		super();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		Switch status = null;
		status = getStatus(request);
		request.getSession().setAttribute("status", status);
		request.setAttribute("status", status);
		request.getRequestDispatcher("./switch_page.jsp").forward(request, response);		
	}
	
	private Switch getStatus(HttpServletRequest request) 
	{
		int id=1;
		Switch status = null;
		//User user = (User) request.getSession().getAttribute("user");
		status = switchDao.getStatus(id);
		return status;
	}
}
