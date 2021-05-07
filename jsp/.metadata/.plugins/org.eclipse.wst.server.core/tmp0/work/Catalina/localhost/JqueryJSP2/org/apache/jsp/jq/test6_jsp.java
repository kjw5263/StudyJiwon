/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.63
 * Generated at: 2021-05-07 02:44:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jq;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test6_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t// append() : 특정 요소의 가장 마지막에 추가, prepend() : 특정요소 가장 처음에 추가\r\n");
      out.write("\t\t$('body').append(\"<h2>마지막에 추가 </h2>\");\r\n");
      out.write("\t\t$('body').prepend(\"<h2>처음에 추가 </h2>\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// div - \"내용\" => \"내용0\", \"내용1\", \"내용2\"\r\n");
      out.write("\t\t// 요소의 값을 변경\r\n");
      out.write("\t\t$('div').append(function(index){\r\n");
      out.write("\t\t\treturn index;\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// html() 사용하여 위의 동작과 동일하게 처리\r\n");
      out.write("\t\t$('div').html(function(idx, ohtml){\r\n");
      out.write("\t\t\treturn ohtml+idx;\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// table 태그에 행을 추가\r\n");
      out.write("\t\t// tr에다가 append 하면 열이 추가가 되어버리므로\r\n");
      out.write("\t\t// table에다 append 해야 행이 추가됨 \r\n");
      out.write("\t\t//$('table').append(\"<tr><td>홍길동</td><td>부산</td></tr>\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//////////////////////////////////////////////////////\r\n");
      out.write("\t\tvar data = [\r\n");
      out.write("\t\t\t{name:\"홍길동\", region:\"부산\"},\r\n");
      out.write("\t\t\t{name:\"김길동\", region:\"서울\"},\r\n");
      out.write("\t\t\t{name:\"박길동\", region:\"제주\"}\r\n");
      out.write("\t\t];\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// div 태그 안에 \"이름:000, 지역:000 \" 형태로 출력\r\n");
      out.write("\t\t// data 배열을 사용해서 출력\r\n");
      out.write("\t\t$('div').append(function(idx){\r\n");
      out.write("\t\t\t//console.log(data[idx]);\r\n");
      out.write("\t\t\tvar item = data[idx];\r\n");
      out.write("\t\t\t//alert(item.name + \"//\" + item.region);\r\n");
      out.write("\t\t\t//alert(data[idx].name);\r\n");
      out.write("\t\t\t//return data[idx];\r\n");
      out.write("\t\t\treturn item.name + \"//\" + item.region;\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// 배열의 정보를 각각의 테이블에 추가\r\n");
      out.write("\t\t// 반복문\r\n");
      out.write("\t\t// each() / $.each() : 선택한 여러개의 요소에 순차적으로 접근하는 메소드\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// $.echo(function() {});\r\n");
      out.write("\t\t// 배열에 접근해서 배열의 요소를 순차적으로 접근\r\n");
      out.write("\t\t$.each(data,function(idx, item) {\r\n");
      out.write("\t\t\tconsole.log(idx + \"//\" + item);\r\n");
      out.write("\t\t\tconsole.log(item);\r\n");
      out.write("\t\t\tconsole.log(item.name + \"//\" + item.region);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$('table').append(function() {\r\n");
      out.write("\t\t\t\treturn \"<tr><td>\"+item.name+\"</td><td>\"+item.region+\"</td></tr>\";\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(data).each(function(idx, item){\r\n");
      out.write("\t\t\t$('table').append(function() {\r\n");
      out.write("\t\t\t\treturn \"<tr><td>\"+item.name+\"</td><td>\"+item.region+\"</td></tr>\";\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h1>WebCOntent/jq/test6.jsp</h1>\r\n");
      out.write("\t<div>내용</div>\r\n");
      out.write("\t<div>내용</div>\r\n");
      out.write("\t<div>내용</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t\r\n");
      out.write("\t<table border=\"1\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>이름</td>\r\n");
      out.write("\t\t\t<td>지역</td>\r\n");
      out.write("\t\t</tr>\t\t\r\n");
      out.write("\t</table>\r\n");
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
