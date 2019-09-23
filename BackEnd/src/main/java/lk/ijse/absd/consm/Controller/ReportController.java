package lk.ijse.absd.consm.Controller;

import lk.ijse.absd.consm.reportManager.DBFacade;
import net.sf.jasperreports.engine.JasperRunManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/report")
public class ReportController {

    @Autowired
    private DataSource dataSource;

    @RequestMapping("/bugetreport/costreport")
    public void genarateBudgetReport(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("application/pdf");
//
//        String fromCode = request.getParameter("fromcord");
//        String toCode = request.getParameter("tocord");
//        String fromDate = request.getParameter("Fromdate");
//        String toDate = request.getParameter("Todate");
        try {
//            HttpSession session = request.getSession();
//            Connection c = dataSource.getConnection();
//            System.out.println(c);
            Connection c = new DBFacade().connect();
            System.out.println(c);
            ServletOutputStream outStream = response.getOutputStream();
            Map<String, Object> params = new HashMap<String, Object>();
            String fromCodeShow = "";
            String toCodeShow = "";
//
//            params.put("fromcord", fromCode);
//            params.put("tocord", toCode);
//            params.put("FromDate", fromDate);
//            params.put("ToDate", toDate);
//            params.put("CompanyName", companyName);
//            params.put("fromCodeShow", fromCodeShow);
//            params.put("toCodeShow", toCodeShow);
//            params.put("userName", user.getUsername());
            params.put("REPORT_CONNECTION", c);

//            URL url = this.getClass().getClassLoader().getResource("reports/locationSummary");
//            String path = url.toURI().toString();//getPath() + "/";
//            params.put("SUBREPORT_DIR", path);
//
//            URL urllogo = this.getClass().getClassLoader().getResource("reports/Images/logo.jpg");
//            String logopath = urllogo.toURI().toString();//getPath() + "/";
//            params.put("LogoPath", logopath);

            InputStream areportstream1 = this.getClass().getClassLoader().getResourceAsStream("reports/Budget.jasper");
            JasperRunManager.runReportToPdfStream(areportstream1, outStream,params,c);

            c.close();
            c = null;
            params = null;
            outStream.flush();
            outStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
