/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-02-14 15:59:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.db.DBConnect;
import java.sql.Connection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/component/allcss.jsp", Long.valueOf(1707840117169L));
    _jspx_dependants.put("/component/footer.jsp", Long.valueOf(1707840117171L));
    _jspx_dependants.put("/component/navbar.jsp", Long.valueOf(1707840117172L));
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Index Page</title>\n");
      out.write("<link\n");
      out.write("\thref=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\n");
      out.write("\trel=\"stylesheet\"\n");
      out.write("\tintegrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\"\n");
      out.write("\tcrossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css\"\n");
      out.write("\tintegrity=\"sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA==\"\n");
      out.write("\tcrossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("\tintegrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\"\n");
      out.write("\tcrossorigin=\"anonymous\"></script>");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".paint-card {\n");
      out.write("\tbox-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write(" ");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-info\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"index.jsp\"><i class=\"fa-solid fa-hospital\"></i>HOSPITAL</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("      <ul class=\"navbar-nav ms-auto mb-2 mb-lg-0\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link active\" aria-current=\"page\" href=\"admin_login.jsp\"><i class=\"fa-solid fa-right-to-bracket\"></i>ADMIN</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link active\" aria-current=\"page\" href=\"doctor_login.jsp\">DOCTOR</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">APPOINTMENTS</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link active\" aria-current=\"page\" href=\"user_login.jsp\">USER</a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        <!-- <li class=\"nav-item dropdown\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("            Dropdown\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">Action</a></li>\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">Another action</a></li>\n");
      out.write("            <li><hr class=\"dropdown-divider\"></li>\n");
      out.write("            <li><a class=\"dropdown-item\" href=\"#\">Something else here</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li> -->\n");
      out.write("       \n");
      out.write("      </ul>\n");
      out.write("     \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write(" \n");
      out.write(" <div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-bs-ride=\"carousel\">\n");
      out.write("  <div class=\"carousel-indicators\">\n");
      out.write("    <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\" aria-label=\"Slide 1\"></button>\n");
      out.write("    <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\n");
      out.write("    <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"carousel-inner\">\n");
      out.write("    <div class=\"carousel-item active\">\n");
      out.write("      <img src=\"img/hos2.jpg\" class=\"d-block w-100\" alt=\"...\" height=\"500px\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"img/hos3.jpg\" class=\"d-block w-100\" alt=\"...\" height=\"500px\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"img/hos4.jpg\" class=\"d-block w-100\" alt=\"...\" height=\"500px\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide=\"prev\">\n");
      out.write("    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"visually-hidden\">Previous</span>\n");
      out.write("  </button>\n");
      out.write("  <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide=\"next\">\n");
      out.write("    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"visually-hidden\">Next</span>\n");
      out.write("  </button>\n");
      out.write("</div>\n");
      out.write("<div class=\"container p-3\">\n");
      out.write("\t\t<p class=\"text-center fs-2 \">Key Features of our Hospital</p>\n");
      out.write("\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-md-8 p-5\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t<div class=\"card paint-card\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"fs-5\">100% Safety</p>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.\n");
      out.write("\t\t\t\t\t\t\t\t\tVoluptatem, inventore</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t\t\t<div class=\"card paint-card\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"fs-5\">Clean Environment</p>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.\n");
      out.write("\t\t\t\t\t\t\t\t\tVoluptatem, inventore</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 mt-2\">\n");
      out.write("\t\t\t\t\t\t<div class=\"card paint-card\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"fs-5\">Friendly Doctors</p>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.\n");
      out.write("\t\t\t\t\t\t\t\t\tVoluptatem, inventore</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 mt-2\">\n");
      out.write("\t\t\t\t\t\t<div class=\"card paint-card\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"fs-5\">Medical Research</p>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.\n");
      out.write("\t\t\t\t\t\t\t\t\tVoluptatem, inventore</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t<img alt=\"\" src=\"img/hos7.jpg\" height=\"345px\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\t\n");
      out.write("\t\n");
      out.write("\t<hr>\n");
      out.write("\n");
      out.write("\t<div class=\"container p-2\">\n");
      out.write("\t\t<p class=\"text-center fs-2 \">Our Team</p>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t\t\t<div class=\"card paint-card\">\n");
      out.write("\t\t\t\t\t<div class=\"card-body text-center\">\n");
      out.write("\t\t\t\t\t\t<img src=\"img/doc4.jpg\" width=\"250px\" height=\"300px\">\n");
      out.write("\t\t\t\t\t\t<p class=\"fw-bold fs-5\">Samuani Simi</p>\n");
      out.write("\t\t\t\t\t\t<p class=\"fs-7\">(CEO & Chairman)</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t\t\t<div class=\"card paint-card\">\n");
      out.write("\t\t\t\t\t<div class=\"card-body text-center\">\n");
      out.write("\t\t\t\t\t\t<img src=\"img/doc1.jpg\" width=\"250px\" height=\"300px\">\n");
      out.write("\t\t\t\t\t\t<p class=\"fw-bold fs-5\">Dr.Siva Kumar</p>\n");
      out.write("\t\t\t\t\t\t<p class=\"fs-7\">(Chief Doctor)</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t\t\t<div class=\"card paint-card\">\n");
      out.write("\t\t\t\t\t<div class=\"card-body text-center\">\n");
      out.write("\t\t\t\t\t\t<img src=\"img/doc2.jpg\" width=\"250px\" height=\"300px\">\n");
      out.write("\t\t\t\t\t\t<p class=\"fw-bold fs-5\">Dr. Niuise Paule</p>\n");
      out.write("\t\t\t\t\t\t<p class=\"fs-7\">(Chief Doctor)</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t\t\t<div class=\"card paint-card\">\n");
      out.write("\t\t\t\t\t<div class=\"card-body text-center\">\n");
      out.write("\t\t\t\t\t\t<img src=\"img/doc3.jpg\" width=\"250px\" height=\"300px\">\n");
      out.write("\t\t\t\t\t\t<p class=\"fw-bold fs-5\">Dr. Mathue Samuel</p>\n");
      out.write("\t\t\t\t\t\t<p class=\"fs-7\">(Chief Doctor)</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("<div class=\"container-fluid p-1 bg-info text-center text-white\">\n");
      out.write("\t<p>@copyright hospital.com</p>\n");
      out.write("</div>");
      out.write("\n");
      out.write("\t\n");
      out.write("</body>\n");
      out.write("</html>");
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
