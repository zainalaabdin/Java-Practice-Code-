import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/hello")
public class LogFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("LogFilter initialized");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("Request received at: " + new java.util.Date());
        System.out.println("Remote IP: " + request.getRemoteAddr());

        chain.doFilter(request, response); 

        System.out.println("Response sent at: " + new java.util.Date());
    }

    public void destroy() {
        System.out.println("LogFilter destroyed");
    }
}
