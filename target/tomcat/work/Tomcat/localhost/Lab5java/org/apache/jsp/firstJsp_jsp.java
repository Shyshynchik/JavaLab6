/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-04-21 14:31:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class firstJsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/css/style.css", Long.valueOf(1650551414698L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Title</title>\n");
      out.write("    <style>");
      out.write("* {box-sizing: border-box}\n");
      out.write("\n");
      out.write("/* Add padding to containers */\n");
      out.write(".container {\n");
      out.write("    padding: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Full-width input fields */\n");
      out.write("input[type=text], input[type=password] {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 15px;\n");
      out.write("    margin: 5px 0 22px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: none;\n");
      out.write("    background: #f1f1f1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text]:focus, input[type=password]:focus {\n");
      out.write("    background-color: #ddd;\n");
      out.write("    outline: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Overwrite default styles of hr */\n");
      out.write("hr {\n");
      out.write("    border: 1px solid #f1f1f1;\n");
      out.write("    margin-bottom: 25px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Set a style for the submit/register button */\n");
      out.write(".registerbtn {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    padding: 16px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    width: 100%;\n");
      out.write("    opacity: 0.9;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".registerbtn:hover {\n");
      out.write("    opacity:1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Add a blue text color to links */\n");
      out.write("a {\n");
      out.write("    color: #4CAF50;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Set a grey background color and center the text of the \"sign in\" section */\n");
      out.write(".signin {\n");
      out.write("    background-color: #f1f1f1;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".big {\n");
      out.write("    font-size: 1.2em;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".custom-dropdown {\n");
      out.write("    position: relative;\n");
      out.write("    display: inline-block;\n");
      out.write("    vertical-align: middle;\n");
      out.write("    margin: 10px; /* demo only */\n");
      out.write("}\n");
      out.write("\n");
      out.write(".custom-dropdown select {\n");
      out.write("    cursor:pointer;\n");
      out.write("    background-color: #4CAF60;\n");
      out.write("    color: #fff;\n");
      out.write("    font-size: inherit;\n");
      out.write("    padding: .5em;\n");
      out.write("    padding-right: 2.5em;\n");
      out.write("    border: 0;\n");
      out.write("    margin: 0;\n");
      out.write("    border-radius: 3px;\n");
      out.write("    text-indent: 0.01px;\n");
      out.write("    text-overflow: '';\n");
      out.write("    -webkit-appearance: button; /* hide default arrow in chrome OSX */\n");
      out.write("}\n");
      out.write("\n");
      out.write(".custom-dropdown::before,\n");
      out.write(".custom-dropdown::after {\n");
      out.write("    content: \"\";\n");
      out.write("    position: absolute;\n");
      out.write("    pointer-events: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".custom-dropdown::after { /*  Custom dropdown arrow */\n");
      out.write("    content: \"\\25BC\";\n");
      out.write("    height: 1em;\n");
      out.write("    font-size: .625em;\n");
      out.write("    line-height: 1;\n");
      out.write("    right: 1.2em;\n");
      out.write("    top: 50%;\n");
      out.write("    margin-top: -.5em;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".custom-dropdown::before { /*  Custom dropdown arrow cover */\n");
      out.write("    width: 2em;\n");
      out.write("    right: 0;\n");
      out.write("    top: 0;\n");
      out.write("    bottom: 0;\n");
      out.write("    border-radius: 0 3px 3px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".custom-dropdown select[disabled] {\n");
      out.write("    color: rgba(0,0,0,.3);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".custom-dropdown select[disabled]::after {\n");
      out.write("    color: rgba(0,0,0,.1);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".custom-dropdown::before {\n");
      out.write("    background-color: rgba(0,0,0,.15);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".custom-dropdown::after {\n");
      out.write("    color: rgba(0,0,0,.4);\n");
      out.write("}");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <form action=\"set-data\" method=\"post\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1>Введите данные</h1>\n");
      out.write("            <p>Пожайлуста, зполните следующие данные</p>\n");
      out.write("            <hr>\n");
      out.write("\n");
      out.write("            <label><b>Имя</b></label>\n");
      out.write("            <input type=\"text\" placeholder=\"Введите имя\" name=\"name\" required>\n");
      out.write("\n");
      out.write("            <label><b>Фамилия</b></label>\n");
      out.write("            <input type=\"text\" placeholder=\"Введите фамилию\" name=\"lastName\" required>\n");
      out.write("\n");
      out.write("            <label><b>Отчество</b></label>\n");
      out.write("            <input type=\"text\" placeholder=\"Введите отчество\" name=\"patronymic\" required>\n");
      out.write("\n");
      out.write("            <label><b>Наименование дисциплины</b></label>\n");
      out.write("            <input type=\"text\" placeholder=\"Введите дисциплину\" name=\"subject\" required>\n");
      out.write("\n");
      out.write("            <label><b>Выберите оценку</b></label><br>\n");
      out.write("            <span class=\"custom-dropdown big\">\n");
      out.write("                <select name=\"mark\">\n");
      out.write("                    <option value=\"2\">2</option>\n");
      out.write("                    <option value=\"3\">3</option>\n");
      out.write("                    <option value=\"4\">4</option>\n");
      out.write("                    <option value=\"5\">5</option>\n");
      out.write("                </select>\n");
      out.write("            </span>\n");
      out.write("            <hr>\n");
      out.write("\n");
      out.write("            <button type=\"submit\" class=\"registerbtn\">Отправить</button>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}