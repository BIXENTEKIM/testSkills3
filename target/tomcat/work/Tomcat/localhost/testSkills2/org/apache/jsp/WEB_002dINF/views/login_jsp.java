/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-04-26 17:22:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <style>\n");
      out.write("        body {font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("\n");
      out.write("        /* Full-width input fields */\n");
      out.write("        input[type=text], input[type=password] {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 12px 20px;\n");
      out.write("            margin: 8px 0;\n");
      out.write("            display: inline-block;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Set a style for all buttons */\n");
      out.write("        button {\n");
      out.write("            background-color: #4CAF50;\n");
      out.write("            color: white;\n");
      out.write("            padding: 14px 20px;\n");
      out.write("            margin: 8px 0;\n");
      out.write("            border: none;\n");
      out.write("            cursor: pointer;\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button:hover {\n");
      out.write("            opacity: 0.8;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Extra styles for the cancel button */\n");
      out.write("        .cancelbtn {\n");
      out.write("            width: auto;\n");
      out.write("            padding: 10px 18px;\n");
      out.write("            background-color: #f44336;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Center the image and position the close button */\n");
      out.write("        .imgcontainer {\n");
      out.write("            text-align: center;\n");
      out.write("            margin: 24px 0 12px 0;\n");
      out.write("            position: relative;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        img.avatar {\n");
      out.write("            width: 40%;\n");
      out.write("            border-radius: 50%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container {\n");
      out.write("            padding: 16px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        span.psw {\n");
      out.write("            float: right;\n");
      out.write("            padding-top: 16px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* The Modal (background) */\n");
      out.write("        .modal {\n");
      out.write("            display: none; /* Hidden by default */\n");
      out.write("            position: fixed; /* Stay in place */\n");
      out.write("            z-index: 1; /* Sit on top */\n");
      out.write("            left: 0;\n");
      out.write("            top: 0;\n");
      out.write("            width: 100%; /* Full width */\n");
      out.write("            height: 100%; /* Full height */\n");
      out.write("            overflow: auto; /* Enable scroll if needed */\n");
      out.write("            background-color: rgb(0,0,0); /* Fallback color */\n");
      out.write("            background-color: rgba(0,0,0,0.4); /* Black w/ opacity */\n");
      out.write("            padding-top: 60px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Modal Content/Box */\n");
      out.write("        .modal-content {\n");
      out.write("            background-color: #fefefe;\n");
      out.write("            margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */\n");
      out.write("            border: 1px solid #888;\n");
      out.write("            width: 80%; /* Could be more or less, depending on screen size */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* The Close Button (x) */\n");
      out.write("        .close {\n");
      out.write("            position: absolute;\n");
      out.write("            right: 25px;\n");
      out.write("            top: 0;\n");
      out.write("            color: #000;\n");
      out.write("            font-size: 35px;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .close:hover,\n");
      out.write("        .close:focus {\n");
      out.write("            color: red;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Add Zoom Animation */\n");
      out.write("        .animate {\n");
      out.write("            -webkit-animation: animatezoom 0.6s;\n");
      out.write("            animation: animatezoom 0.6s\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        @-webkit-keyframes animatezoom {\n");
      out.write("            from {-webkit-transform: scale(0)}\n");
      out.write("            to {-webkit-transform: scale(1)}\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        @keyframes animatezoom {\n");
      out.write("            from {transform: scale(0)}\n");
      out.write("            to {transform: scale(1)}\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Change styles for span and cancel button on extra small screens */\n");
      out.write("        @media screen and (max-width: 300px) {\n");
      out.write("            span.psw {\n");
      out.write("                display: block;\n");
      out.write("                float: none;\n");
      out.write("            }\n");
      out.write("            .cancelbtn {\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            .error {\n");
      out.write("                color: #ff0000;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h2>Modal Login Form</h2>\n");
      out.write("<div class=\"warning\">\n");
      out.write("    <h2 >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${error}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h2>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<button onclick=\"document.getElementById('id01').style.display='block'\" style=\"width:auto;\">Login</button>\n");
      out.write("\n");
      out.write("<div id=\"id01\" class=\"modal\">\n");
      out.write("\n");
      out.write("    <form class=\"modal-content animate\" action=\"customers\" method=\"post\">\n");
      out.write("        <div class=\"imgcontainer\">\n");
      out.write("            <span onclick=\"document.getElementById('id01').style.display='none'\" class=\"close\" title=\"Close Modal\">&times;</span>\n");
      out.write("            <img src=\"WEB-INF/views/img_avatar2.png\" alt=\"Avatar\" class=\"avatar\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <label for=\"uname\"><b>Username</b></label>\n");
      out.write("            <input type=\"text\" placeholder=\"Enter Username\" name=\"user\" required>\n");
      out.write("\n");
      out.write("            <label for=\"psw\"><b>Password</b></label>\n");
      out.write("            <input type=\"password\" placeholder=\"Enter Password\" name=\"password\" required>\n");
      out.write("\n");
      out.write("            <button type=\"submit\">Login</button>\n");
      out.write("            <label>\n");
      out.write("                <input type=\"checkbox\" checked=\"checked\" name=\"remember\"> Remember me\n");
      out.write("            </label>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container\" style=\"background-color:#f1f1f1\">\n");
      out.write("            <button type=\"button\" onclick=\"document.getElementById('id01').style.display='none'\" class=\"cancelbtn\">Cancel</button>\n");
      out.write("            <span class=\"psw\">Forgot <a href=\"#\">password?</a></span>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    // Get the modal\n");
      out.write("    var modal = document.getElementById('id01');\n");
      out.write("\n");
      out.write("    // When the user clicks anywhere outside of the modal, close it\n");
      out.write("    window.onclick = function(event) {\n");
      out.write("        if (event.target == modal) {\n");
      out.write("            modal.style.display = \"none\";\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
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
