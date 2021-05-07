/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.63
 * Generated at: 2021-05-07 01:36:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jq;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test5_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script src=\"../js/jquery-3.6.0.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t// html()/text() - 해당요소의 값을 가져오는 함수\r\n");
      out.write("\t\t// html() : 해당 요소 중에서 가장 처음 만나는 요소의 값을 가져옴\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar h = $('h2').html();\r\n");
      out.write("\t\talert(\"h : \" + h);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// text() : 해당하는 요소의 전부의 값을 가져옴\r\n");
      out.write("\t\tvar t = $('h2').text();\r\n");
      out.write("\t\talert(\"t : \" + t);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$('h2').html(\"Hello\");\r\n");
      out.write("\t\t$('h2').text(\"안녕하세여\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// div 안에 \"아이티윌\" 출력\r\n");
      out.write("\t\t$('div').text(\"아이티윌\");\r\n");
      out.write("\t\t$('div').html(\"ITWILL\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 태그가 포함된 글자는 그대로 ㅊ출력\r\n");
      out.write("\t\t$('div').text(\"<h3>아이티윌</h3>\");\r\n");
      out.write("\t\t// 태그가 포함된 글자는 태그를 적용후 출력\r\n");
      out.write("\t\t$('div').html(\"<h3>ITWILL</h3>\");\r\n");
      out.write("\t\tvar name = \"홍길동\";\r\n");
      out.write("\t\t$('div').html(\"<h3>이름:\"+name+\"</h3>\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// div - 이름 :홍길동::**\r\n");
      out.write("\t\t// index : 해당 요소의 순서, oldHtml: 해당요소의 이전의 값\r\n");
      out.write("\t\t$('div').html(function(index, oldHtml){\r\n");
      out.write("\t\t\t// alert(index + \"//\" + oldHtml);\r\n");
      out.write("\t\t\treturn oldHtml + \":: **\";\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar table=\"<table border='1'>\";\r\n");
      out.write("\t\t\ttable += \"<tr>\"\r\n");
      out.write("\t\t\ttable += \"<td>\"\r\n");
      out.write("\t\t\ttable += \" hello \"\r\n");
      out.write("\t\t\ttable += \"</td>\"\r\n");
      out.write("\t\t\ttable += \"</tr>\"\r\n");
      out.write("\t\t\ttable += \"</table>\";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$('body').html(table);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// j쿼리 에서 html 호출하면, jquery끝난후에 홈페이지 나타남\r\n");
      out.write("\t\t\t// document ready  끝난 후 그 위의 다큐먼트에 써서 다른 요소 사라지는 것\r\n");
      out.write("\t\t\t\t\tdocument.write(table);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>WebContent/jq/test5.jsp</h1>\r\n");
      out.write("\r\n");
      out.write("<h2>head-01</h2>\r\n");
      out.write("<h2>head-02</h2>\r\n");
      out.write("<h2>head-03</h2>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div>0</div>\r\n");
      out.write("<div>1</div>\r\n");
      out.write("<div>2</div>\r\n");
      out.write("\r\n");
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
