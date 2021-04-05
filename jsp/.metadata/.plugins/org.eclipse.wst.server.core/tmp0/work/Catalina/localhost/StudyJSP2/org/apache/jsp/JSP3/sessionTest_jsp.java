/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.63
 * Generated at: 2021-04-01 02:36:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.JSP3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sessionTest_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<h1>WebContent/JSP3/sessionTest.jsp </h1>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- p.270 -->\r\n");
      out.write("\t");

		// http 프로토콜 사용하여 통신시
		// 페이지 요청(request), 요청에 대한 응답(response)를 완료하고 나면
		// 서버와 클라이언트의 연결은 종료/.
		// ==> 서버와 클라이언트의 상태를 연결하기 위해 세션과 쿠키 사용
			
		
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<h2> 세션(Session) 객체  : 웹 서버의 컨테이너 정보(상태)를 유지하기 위한 정보<br>\r\n");
      out.write("\t(웹서버 컨테이너 : 세션의 생성, 수정, 삭제까지 관할 해주는 것) <br>\r\n");
      out.write("\t쉽게 말하면, 웹 서버 상태 유지하기 위한 정보 <br>\r\n");
      out.write("\t- 웹 브라우저당 한 개씩 부여된다. <br>\r\n");
      out.write("\t- 서버쪽에서 관리 => 보안상 안전\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t</h2>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t- 세션 정보 저장 <br>\r\n");
      out.write("\t\tsession.setAttribute(\"키값\", \"세션데이터값\"); <br>\r\n");
      out.write("\t- 세션 정보 사용 <br>\r\n");
      out.write("\t\tsession.getAttribute(\"키값\"); <br>\r\n");
      out.write("\t- 세션 정보 삭제(속성 삭제) <br>\r\n");
      out.write("\t\tsession.remobeAttribute(\"세션값\"); <br>\r\n");
      out.write("\t- 세션 정보 초기화 <br>\r\n");
      out.write("\t\tsession.invalidate(); <br>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<hr><hr>\r\n");
      out.write("\t<!-- \r\n");
      out.write("\t\t세션값이 있을 때는 세션값을 출력,\r\n");
      out.write("\t\t세션값이 없을 때는 \"세션값 없음!\" 출력\r\n");
      out.write("\t -->\r\n");
      out.write("\t\r\n");
      out.write("\t<h2> 세션값 : ");
      out.print(session.getAttribute("id") );
      out.write("</h2>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t");

		String id = (String)session.getAttribute("id");
		if(id == null){
			id = " 세션값 없오! ! ";
		} 
	
	
      out.write("\r\n");
      out.write("\t<h2> 세션값 : ");
      out.print(id );
      out.write("</h2>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<input type=\"button\" value=\"세션값 생성(저장)\" \r\n");
      out.write("\t\tonclick=\"location.href='sessionSet.jsp'\"> <br>\r\n");
      out.write("\t\r\n");
      out.write("\t<input type=\"button\" value=\"세션값 삭제\" \r\n");
      out.write("\t\tonclick=\"location.href='sessionDel.jsp'\"> <br>\r\n");
      out.write("\t\r\n");
      out.write("\t<input type=\"button\" value=\"세션값 초기화\"\r\n");
      out.write("\t\tonclick=\"location.href='sessionInv.jsp'\"><br>\r\n");
      out.write("\t\r\n");
      out.write("\t");

		if(session.getAttribute("id") == null){
			
      out.write("\r\n");
      out.write("\t\t\t\t<h2> 세션값 : 세션값 없음 ! </h2>\r\n");
      out.write("\t\t\t");

		} else {
			
      out.write("\r\n");
      out.write("\t\t\t\t<h2> 세션값 : ");
      out.print(session.getAttribute("id") );
      out.write(" </h2>\r\n");
      out.write("\t\t");

		}
		
	
	
      out.write("\r\n");
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