/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.63
 * Generated at: 2021-04-09 06:28:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.JSP2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class scopePro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h1>WebContent/JSP2/scopePro.jsp </h1>\r\n");
      out.write("\t\r\n");
      out.write("\t<h2> 전달된 파라미터값을 저장 후 출력 </h2>\r\n");
      out.write("\t");

		String id = request.getParameter("id");
	ㅁㄴ
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t아이디 : ");
      out.print(id );
      out.write("<br>\r\n");
      out.write("\t\r\n");
      out.write("\t");

		// 영역 객체를 사용하려면 해당 영역에 일단 데이터를 저장해야한다
		// 영역 데이터 저장
		// 즉, 해당 영역에 데이터를 저장 -> 해당 영역에서 데이터를 공유해서 사용 가능
		// 영역객체.setAttribute("이름", 값);
		
		// 영역 데이터 사용
		// 영역객체.getAttribute("이름");
		
		// 영역의 크기 A>S>R>P
		
		////////////////////////////////////////////////////////
		
		pageContext.setAttribute("page", "page영역 객체 정보");
		pageContext.setAttribute("page1", "page영역 객체 정보");
		request.setAttribute("req", "request객체 정보(itwill)");
		session.setAttribute("ses", "session객체 정보(itwill)");
		application.setAttribute("app", "application객체 정보(itwill)");
		
		
	
	
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<h2> 영역객체의 값을 출력-> 같은 영역안에 있는 애들끼리 값을 꺼내쓸 수 있다. </h2>\r\n");
      out.write("\tpageContext 내장 객체 공유데이터(속성) : ");
      out.print(pageContext.getAttribute("page") );
      out.write("<br>\r\n");
      out.write("\trequest 내장 객체 공유데이터(속성) : ");
      out.print(request.getAttribute("req") );
      out.write("<br>\r\n");
      out.write("\tsession 내장 객체 공유데이터(속성) : ");
      out.print(session.getAttribute("ses") );
      out.write("<br>\r\n");
      out.write("\tapplication 내장 객체 공유데이터(속성) : ");
      out.print(application.getAttribute("app") );
      out.write("<br>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<hr><hr>\r\n");
      out.write("\t\r\n");
      out.write("\t<h2> 페이지 이동시 사용가능한 데이터 </h2>\r\n");
      out.write("\t\r\n");
      out.write("\t1. a 태그 사용<br>\r\n");
      out.write("\t파라미터 값 전달 가능 + \r\n");
      out.write("\t영역객체 : session, application 정보만 사용 가능\r\n");
      out.write("\t<a href=\"scopePro2.jsp?id=");
      out.print(id);
      out.write("&pw=qwerty\"> scopepro2.jsp 페이지 이동</a> <br>\r\n");
      out.write("\t\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t2. javascript 사용 <br>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t//alert('scopePro2.jsp 페이지로 이동 ');\r\n");
      out.write("\t\t//location.href=\"scopePro2.jsp?id=");
      out.print(id);
      out.write("&pw=1234\";\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t3. JSP 사용 <br>\r\n");
      out.write("\t실행순서 jsp -> js <br>\r\n");
      out.write("\t파라미터 값 전달 가능 + \r\n");
      out.write("\t영역객체 : session, application 정보만 사용 가능 <br>\r\n");
      out.write("\t");

		System.out.println("scopePro.jsp 페이지 실행!");
		//response.sendRedirect("scopePro2.jsp?id="+id+"&pw=1234"); // 특정 페이지로 이동할 수 있는 메소드 
		// 스크립틀릿은 지역변수의 개념을 갖고있기 때문에
		// 변수를 주고싶다면 스크립틀릿 대신 변수사용하듯이 사용하면 됨
		// scopePro2.jsp?id=admin 이런식으로 담겨있는 것임
		// -> 값을 보냈음에도 불구하고 request속성이 null
		
		
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t4. jsp 액션태그 (forward 방식)\r\n");
      out.write("\t<br> 포워딩 방식 이동 : 페이지 이동시 request, response 포함해서 이동하는 방식\r\n");
      out.write("\t<br> \t\t\tA -> B\r\n");
      out.write("\t<br> 페이지 주소 : A\r\n");
      out.write("\t<br> 페이지 화면 : B\r\n");
      out.write("\t<br> ==> 페이지 주소변경X, 페이지 화면 변경O, request, response 가지고 이동\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<br> 파라미터 전달가능\r\n");
      out.write("\t영역객체 : request, session, application 정보만 사용가능 <br>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write('\r');
      out.write('\n');
      out.write('	');
      if (true) {
        _jspx_page_context.forward("scopePro2.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("pw", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("12341234", request.getCharacterEncoding()));
        return;
      }
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t// 주소는 A.nhn으로 하고싶지만, 화면은 B.jsp로 띄우고싶을때 forward 사용\r\n");
      out.write("\t// form --> pro --(forward)--> pro2\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
