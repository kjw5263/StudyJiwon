/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.63
 * Generated at: 2021-06-10 01:25:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.goods;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.admin.goods.db.GoodsDTO;

public final class goods_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1620865431905L));
    _jspx_dependants.put("jar:file:/D:/workspace_jsp2/jsp/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Model2JSP2/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.admin.goods.db.GoodsDTO");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforTokens_0026_005fvar_005fitems_005fdelims;

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
    _005fjspx_005ftagPool_005fc_005fforTokens_0026_005fvar_005fitems_005fdelims = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforTokens_0026_005fvar_005fitems_005fdelims.release();
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction isBasket() {\r\n");
      out.write("\t\tif(document.gfr.amount.value == \"\"){\r\n");
      out.write("\t\t\talert(\" 구매 수량을 입력하세요. \");\r\n");
      out.write("\t\t\tdocument.gfr.amount.focus();\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(document.gfr.size.value==\"\"){\r\n");
      out.write("\t\t\talert(\" 크기를 선택해주세요. \");\r\n");
      out.write("\t\t\tdocument.gfr.size.focus();\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(document.gfr.color.value==\"\"){\r\n");
      out.write("\t\t\talert(\" 색상을 선택해주세요. \");\r\n");
      out.write("\t\t\tdocument.gfr.color.focus();\r\n");
      out.write("\t\t\treturn; \r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar result = confirm(\"장바구니에 저장하시겠습니까?\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(result){\r\n");
      out.write("\t\t\tdocument.gfr.action = \"./BasketAdd.ba\";\r\n");
      out.write("\t\t\tdocument.gfr.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h1>WebContent/goods/goods_detail.jsp</h1>\r\n");
      out.write("\t\r\n");
      out.write("\t<h2> 상품 상세 페이지 </h2>\r\n");
      out.write("\t\r\n");
      out.write("\t");

		// 이전 페이지 -> detailAction.java에서 저장한 attr 값 가져오기
		GoodsDTO dto = (GoodsDTO)request.getAttribute("goods");
	
	
	
      out.write("\r\n");
      out.write("\t<form action=\"\" method=\"post\" name=\"gfr\">\r\n");
      out.write("\t<!-- 다음 페이지로 전달하는 값\r\n");
      out.write("\t\tnum, amount, size, color\r\n");
      out.write("\t -->\r\n");
      out.write("\t<input type=\"hidden\" name=\"num\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.num }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t<table border=\"1\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td width=\"500\"><img src=\"./upload/");
      out.print(dto.getImage().split(",")[0]);
      out.write("\" height=\"400\" width=\"400\"></td>\r\n");
      out.write("\t\t\t<td width=\"500\">\r\n");
      out.write("\t\t\t상품명 : ");
      out.print(dto.getName() );
      out.write("<br>\r\n");
      out.write("\t\t\t판매가 : ");
      out.print(dto.getPrice() );
      out.write("원<br>\r\n");
      out.write("\t\t\t구매수량 : <input type=\"number\" name=\"amount\" value=\"1\"><br>\r\n");
      out.write("\t\t\t남은수량 : ");
      out.print(dto.getAmount() );
      out.write("<br>\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t옵션-크기 : \r\n");
      out.write("\t\t\t<select name=\"size\">\r\n");
      out.write("\t\t\t\t<option value=\"\">크기를 선택하세요.</option>\t<!-- JSTL 사용하기!! -> 라이브러리 사용필요 -->\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforTokens_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</select> <br>\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t옵션-색상 : \r\n");
      out.write("\t\t\t<select name=\"color\">\r\n");
      out.write("\t\t\t\t<option value=\"\">색상을 선택하세요.</option>\t<!-- JSTL 사용하기!! -> 라이브러리 사용필요 -->\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforTokens_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</select><br>\r\n");
      out.write("\t\t\t<hr>\r\n");
      out.write("\t\t\t<a href=\"javascript:isBasket();\">장바구니 담기</a> <!--a태그에서 js실행하기  -->\r\n");
      out.write("\t\t\t<a href=\"javascript:isBuy();\">주문하기</a>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"2\" height=\"700\">\r\n");
      out.write("\t\t\t<h3> 제품 상세 이미지 </h3>\r\n");
      out.write("\t\t\t\t<img src=\"./upload/");
      out.print(dto.getImage().split(",")[1] );
      out.write("\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t<h2>QnA/리뷰</h2>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t</form>\r\n");
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

  private boolean _jspx_meth_c_005fforTokens_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forTokens
    org.apache.taglibs.standard.tag.rt.core.ForTokensTag _jspx_th_c_005fforTokens_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForTokensTag) _005fjspx_005ftagPool_005fc_005fforTokens_0026_005fvar_005fitems_005fdelims.get(org.apache.taglibs.standard.tag.rt.core.ForTokensTag.class);
    boolean _jspx_th_c_005fforTokens_005f0_reused = false;
    try {
      _jspx_th_c_005fforTokens_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforTokens_005f0.setParent(null);
      // /goods/goods_detail.jsp(71,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforTokens_005f0.setVar("size");
      // /goods/goods_detail.jsp(71,4) name = items type = javax.el.ValueExpression reqTime = true required = true fragment = false deferredValue = true expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_c_005fforTokens_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/goods/goods_detail.jsp(71,4) '${goods.size }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${goods.size }",java.lang.String.class)).getValue(_jspx_page_context.getELContext()));
      // /goods/goods_detail.jsp(71,4) name = delims type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforTokens_005f0.setDelims(",");
      int[] _jspx_push_body_count_c_005fforTokens_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforTokens_005f0 = _jspx_th_c_005fforTokens_005f0.doStartTag();
        if (_jspx_eval_c_005fforTokens_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write(" <!-- el 표현식은 영역 객체를 바로 불러오기 때문에 attr의 goods를 가져옴 -->\r\n");
            out.write("\t\t\t\t\t<option value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${size }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${size }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</option>\r\n");
            out.write("\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforTokens_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforTokens_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforTokens_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforTokens_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforTokens_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforTokens_0026_005fvar_005fitems_005fdelims.reuse(_jspx_th_c_005fforTokens_005f0);
      _jspx_th_c_005fforTokens_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforTokens_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforTokens_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforTokens_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forTokens
    org.apache.taglibs.standard.tag.rt.core.ForTokensTag _jspx_th_c_005fforTokens_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForTokensTag) _005fjspx_005ftagPool_005fc_005fforTokens_0026_005fvar_005fitems_005fdelims.get(org.apache.taglibs.standard.tag.rt.core.ForTokensTag.class);
    boolean _jspx_th_c_005fforTokens_005f1_reused = false;
    try {
      _jspx_th_c_005fforTokens_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforTokens_005f1.setParent(null);
      // /goods/goods_detail.jsp(79,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforTokens_005f1.setVar("color");
      // /goods/goods_detail.jsp(79,4) name = items type = javax.el.ValueExpression reqTime = true required = true fragment = false deferredValue = true expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_c_005fforTokens_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/goods/goods_detail.jsp(79,4) '${goods.color }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${goods.color }",java.lang.String.class)).getValue(_jspx_page_context.getELContext()));
      // /goods/goods_detail.jsp(79,4) name = delims type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforTokens_005f1.setDelims(",");
      int[] _jspx_push_body_count_c_005fforTokens_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforTokens_005f1 = _jspx_th_c_005fforTokens_005f1.doStartTag();
        if (_jspx_eval_c_005fforTokens_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write(" <!-- el 표현식은 영역 객체를 바로 불러오기 때문에 attr의 goods를 가져옴 -->\r\n");
            out.write("\t\t\t\t\t<option value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${color }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${color }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</option>\r\n");
            out.write("\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforTokens_005f1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforTokens_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforTokens_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforTokens_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforTokens_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforTokens_0026_005fvar_005fitems_005fdelims.reuse(_jspx_th_c_005fforTokens_005f1);
      _jspx_th_c_005fforTokens_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforTokens_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fforTokens_005f1_reused);
    }
    return false;
  }
}
