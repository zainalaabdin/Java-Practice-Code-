import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(urlPatterns = {"/first", "/second"})
public class MultiFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
        System.out.println("MultiFilter initialized");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("MultiFilter - Request intercepted for: " + ((HttpServletRequest) request).getRequestURI());
        chain.doFilter(request, response);
        System.out.println("MultiFilter - Response sent for: " + ((HttpServletRequest) request).getRequestURI());
    }

    public void destroy() {
        System.out.println("MultiFilter destroyed");
    }
}
