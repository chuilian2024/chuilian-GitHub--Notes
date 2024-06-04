package org.example.javaideamysql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.example.javaideamysql.dao")
public class JavaIdeaMysqlApplication {
    public static void main(String[] args) {
        SpringApplication.run(JavaIdeaMysqlApplication.class, args);
        System.out.println("""
        (✿♥‿♥)  系统启动成功 愿人间对您赐予怜悯 系统启动成功！！ (✿♥‿♥)
               _               _   _   _                \s
         ___  | |__    _   _  (_) | | (_)   __ _   _ __\s
        / __| | '_ \\  | | | | | | | | | |  / _` | | '_ \\\s
       | (__  | | | | | |_| | | | | | | | | (_| | | | | |
        \\___| |_| |_|  \\__,_| |_| |_| |_|  \\__,_| |_| |_|
        我见众生皆草木 唯独见你是青山！""");
    }
}
/*
 * Mybatis-3.0.3
 * Springboot-3.2.5
 * Vue2.7.16  JDK-21
 * Mysql-8.4.0
 * Element-UI
 */