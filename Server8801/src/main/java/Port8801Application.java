import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author nhsoft.ll
 */
@EnableAutoConfiguration
@RestController
public class Port8801Application {
    public static void main(String[] args) {
        SpringApplication.run(Port8801Application.class, args);
    }

    @GetMapping()
    public String hello(HttpServletRequest request) {
        System.out.println(request.getHeader("xjava"));
        return "hello,8801";
    }
}
