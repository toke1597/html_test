import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Exam01")
public class Exam01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter(); //출력스트림 객체생성
		
		String led = request.getParameter("opened"); 
        	//html로 받아온 데이터led
		System.out.println("opened");
			//콘솔창에 출력
		//JSON data 아두이노로 전송
		// \:escape code
		if(led.equals("1")) {
			out.print("{\"opened\":\"1\"}");
		}else if(led.equals("0")) {
			out.print("{\"opened\":\"0\"}");
		}
	}
}