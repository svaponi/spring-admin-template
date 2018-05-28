package io.github.svaponi;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class SpringBootAdminApplication {
    public static void main(final String[] args) {
        SpringApplication.run(SpringBootAdminApplication.class, args);
    }
}
