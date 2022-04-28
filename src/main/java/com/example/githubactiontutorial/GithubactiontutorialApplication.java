package com.example.githubactiontutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class GithubactiontutorialApplication {

  public static void main(String[] args) {
    SpringApplication.run(GithubactiontutorialApplication.class, args);
  }

  @RestController
  public class TestController {
    @GetMapping("/test/{name}")
    public String test(@PathVariable String name) {
      return "Hello " + name;
    }
  }
}
