package hello.world.kotlin.example;

import hello.world.kotlin.example.service.HelloWorldService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;

import javax.inject.Inject;

@Controller("/hello")
public class HelloController {

    @Inject
    private HelloWorldService helloWorldService;

    @Get
    public String helloWorld(@QueryValue("name") String name) {

        return "hello world " + helloWorldService.someServiceMethod(name) + "\n";
    }
}
