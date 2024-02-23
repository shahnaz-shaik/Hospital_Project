/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-02-23 12:09:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.entity.Doctor;
import com.dao.DoctorDao;
import com.entity.Appointment;
import java.util.List;
import com.db.DBConnect;
import com.dao.AppointmentDAO;

public final class patient_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/admin/../component/allcss.jsp", Long.valueOf(1708494518489L));
    _jspx_dependants.put("/admin/navbar.jsp", Long.valueOf(1708494517884L));
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Patient details</title>\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\"\r\n");
      out.write("\tintegrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css\"\r\n");
      out.write("\tintegrity=\"sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA==\"\r\n");
      out.write("\tcrossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("\tintegrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\"\r\n");
      out.write("\tcrossorigin=\"anonymous\"></script>");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body {\r\n");
      out.write("    background-image: url('https://github.com/opprDev/medical-image-downloader/blob/master/assets/banner_1280x640.png?raw=true'); /* Change 'path/to/your/image.jpg' to the actual path of your image */\r\n");
      out.write("    background-size: cover; /* Cover the entire background */\r\n");
      out.write("    background-position: center; /* Center the background image */\r\n");
      out.write("    background-repeat: repeat;\r\n");
      out.write("   /* Do not repeat the background image */\r\n");
      out.write("  }\r\n");
      out.write(".paint-card {\r\n");
      out.write("\tbox-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-transparent\">\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"index.jsp\"><i\r\n");
      out.write("\t\t\tclass=\"fas fa-clinic-medical\"></i> Hospital</a>\r\n");
      out.write("\t\t<button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\"\r\n");
      out.write("\t\t\tdata-bs-target=\"#navbarSupportedContent\"\r\n");
      out.write("\t\t\taria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("\t\t\taria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("\t\t\t<ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link active\" href=\"index.jsp\">HOME</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link active\" href=\"doctor.jsp\">DOCTOR</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link active\" href=\"view_doctor.jsp\">VIEW DOCTOR</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link active\" href=\"patient.jsp\">PATIENT</a></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<form class=\"d-flex\">\r\n");
      out.write("\t\t\t\t<div class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-light dropdown-toggle\" type=\"button\"\r\n");
      out.write("\t\t\t\t\t\tid=\"dropdownMenuButton1\" data-bs-toggle=\"dropdown\"\r\n");
      out.write("\t\t\t\t\t\taria-expanded=\"false\">Admin</button>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton1\">\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"../adminLogout\">Logout</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t<div class=\"card paint-card\">\r\n");
      out.write("\t\t\t<div class=\"card-body\">\r\n");
      out.write("\t\t\t\t<p class=\"fs-3 text-center\">Patient Details</p>\r\n");
      out.write("\t\t\t\t<table class=\"table\">\r\n");
      out.write("\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th scope=\"col\">Patient Name</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th scope=\"col\">Gender</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th scope=\"col\">Age</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th scope=\"col\">Appointment</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th scope=\"col\">Email</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th scope=\"col\">Mob No</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th scope=\"col\">Diseases</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th scope=\"col\">Doctor Name</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th scope=\"col\">Address</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th scope=\"col\">Status</th>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t");

						AppointmentDAO dao = new AppointmentDAO(DBConnect.getConn());
						DoctorDao dao2 = new DoctorDao(DBConnect.getConn());
						List<Appointment> list = dao.getAllAppointment();
						for (Appointment ap : list) {
							Doctor d = dao2.getDoctorById(ap.getDoctorId());
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th>");
      out.print(ap.getFirstName()+" "+ap.getLastName());
      out.write("</th>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(ap.getGender());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(ap.getAge());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(ap.getAppoinDate());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(ap.getEmail());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(ap.getPhNo());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(ap.getDiseases());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print( d.getFirstName() + " " + d.getLastName() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(ap.getAddress());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(ap.getStatus());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t");

						}
						
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write(" \t\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
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
