package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorld {

    @RequestMapping({"/","/hello"})
    public String home() {
        return "Hello World!";
    }

    @RequestMapping("/hello/{name}")
    public String helloName(@PathVariable(name = "name") String name) {
        return "Hello "+name+"!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloWorld.class, args);
    }
}