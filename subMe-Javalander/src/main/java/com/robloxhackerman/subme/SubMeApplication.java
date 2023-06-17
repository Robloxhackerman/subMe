package com.robloxhackerman.subme;

import com.robloxhackerman.subme.entity.EnumRole;
import com.robloxhackerman.subme.entity.Role;
import com.robloxhackerman.subme.entity.User;
import com.robloxhackerman.subme.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Set;

@SpringBootApplication
public class SubMeApplication implements WebMvcConfigurer {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    UserRepository userRepository;

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    public static void main(String[] args) {
        SpringApplication.run(SubMeApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurer() {

            @Override
            public void addCorsMappings(CorsRegistry corsRegistry) {
                corsRegistry.addMapping("/**")
                        .allowedOrigins("http://localhost:4200");
            }
        };
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/**")
                .addResourceLocations("classpath:/static/");
    }
/*
    @Bean
    CommandLineRunner init() {
        try{
            return args -> {

                User userEntity = User.builder()
                        .userEmail("pepe@pepe.com")
                        .userName("Pepe")
                        .userPassword(passwordEncoder.encode("nikito7u7"))
                        .roles(Set.of(Role.builder()
                                .name(EnumRole.valueOf(EnumRole.ADMIN.name()))
                                .build()))
                        .build();

                userRepository.save(userEntity);
            };

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }*/
}
