/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.63
 * Generated at: 2021-06-11 00:55:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.basket;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.admin.goods.db.GoodsDTO;
import com.basket.db.BasketDTO;
import java.util.ArrayList;
import java.util.List;

public final class goods_005fbasket_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.basket.db.BasketDTO");
    _jspx_imports_classes.add("com.admin.goods.db.GoodsDTO");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write(" <h1>WebContent/basket/goods_basket_list.jsp </h1>\r\n");
      out.write(" ");

 	
 	// 전달된 정보를 저장
 	// request 영역 정보 받기 
 	List basketList = (List)request.getAttribute("basketList");
 	List goodsList = (List)request.getAttribute("goodsList");
 	
 	
 	// 장바구니 정보 출력 
 	// (장바구니 번호, 상품이미지, 상품명, 상품옵션, 사이즈, 색상, 구매 수량, 가격, 제거)
 	
 
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" \t<h2> 장바구니 목록 </h2>\r\n");
      out.write(" \t<table border=\"1\">\r\n");
      out.write(" \t\t<tr>\r\n");
      out.write(" \t\t\t<td>번호</td>\r\n");
      out.write(" \t\t\t<td>이미지</td>\r\n");
      out.write(" \t\t\t<td>이름</td>\r\n");
      out.write(" \t\t\t<td>크기</td>\r\n");
      out.write(" \t\t\t<td>색상</td>\r\n");
      out.write(" \t\t\t<td>구매수량</td>\r\n");
      out.write(" \t\t\t<td>가격</td>\r\n");
      out.write(" \t\t\t<td>제거</td>\r\n");
      out.write(" \t\t</tr>\r\n");
      out.write(" \t\t\r\n");
      out.write(" \t\t");
for(int i=0; i<basketList.size(); i++){
 			BasketDTO bkDTO = (BasketDTO)basketList.get(i); 
 			GoodsDTO gDTO = (GoodsDTO) goodsList.get(i);
 			
      out.write("\r\n");
      out.write(" \t\t\t\r\n");
      out.write(" \t\t\t<tr>\r\n");
      out.write(" \t\t\t\t<td>");
      out.print(bkDTO.getB_num() );
      out.write("</td>\r\n");
      out.write("\t \t\t\t<td><img src=\"./upload/");
      out.print(gDTO.getImage().split(",")[0] );
      out.write("\" width=\"50\" height=\"50\"></td>\r\n");
      out.write("\t \t\t\t<td>");
      out.print(gDTO.getName() );
      out.write("</td>\r\n");
      out.write("\t \t\t\t<td>");
      out.print(bkDTO.getB_g_size() );
      out.write("</td>\r\n");
      out.write("\t \t\t\t<td>");
      out.print(bkDTO.getB_g_color() );
      out.write("</td>\r\n");
      out.write("\t \t\t\t<td>");
      out.print(bkDTO.getB_g_amount() );
      out.write("</td>\r\n");
      out.write("\t \t\t\t<td>");
      out.print(gDTO.getPrice() );
      out.write("</td>\r\n");
      out.write("\t \t\t\t<td><a href=\"./BasketDelete.ba?b_num=");
      out.print(bkDTO.getB_num() );
      out.write("\">제거</a></td>\r\n");
      out.write(" \t\t\t</tr>\r\n");
      out.write(" \t\t\r\n");
      out.write(" \t\t");
 } 
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<a href=\"./OrderStart.or\">[구매하기]</a>\r\n");
      out.write("\t<a href=\"./GoodsList.go\">[계속 쇼핑하기]</a>\r\n");
      out.write(" \r\n");
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