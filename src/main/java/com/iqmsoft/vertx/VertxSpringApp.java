package com.iqmsoft.vertx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.iqmsoft.vertx.verticles.ArticleVerticle;
import com.iqmsoft.vertx.verticles.ServerVerticle;

import io.vertx.core.Vertx;

import javax.annotation.PostConstruct;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = { "com.iqmsoft.vertx" })
public class VertxSpringApp {

    @Autowired
    private ServerVerticle serverVerticle;

    @Autowired
    private ArticleVerticle serviceVerticle;

    public static void main(String[] args) {
        SpringApplication.run(VertxSpringApp.class, args);
    }

    @PostConstruct
    public void deployVerticle() {
        final Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(serverVerticle);
        vertx.deployVerticle(serviceVerticle);
    }
}