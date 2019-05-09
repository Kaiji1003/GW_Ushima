package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UseBeanServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//インスタンス化
		EmpBean bean = new EmpBean();

		//setNameでnameに値を入力
		bean.setName("KnowledgeTaro");

		//setAgeでageに値を入力
		bean.setAge(20);

		//key:emp value:bean を設定
		//(リクエストオブジェクトにぶち込んでる)
		request.setAttribute("emp", bean);

		//RequestDispatcherを用いて、遷移先を指定
		RequestDispatcher rd = request.getRequestDispatcher("/useBean.jsp");

		//RequestDispatcherを用いて、ぶっ飛ばす
		rd.forward(request, response);
	}


}
