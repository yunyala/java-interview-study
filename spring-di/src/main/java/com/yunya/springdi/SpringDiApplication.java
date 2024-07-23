package com.yunya.springdi;

//import com.yunya.springdi.constructor.UserService;
import com.yunya.springdi.field.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDiApplication implements CommandLineRunner {

    @Autowired
//    private com.yunya.springdi.constructor.UserService userService;
//    private com.yunya.springdi.setter.UserService userService;
//    private com.yunya.springdi.field.UserService userService;
    private com.yunya.springdi.config.UserService userService;

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringDiApplication.class, args);
        System.out.println("Hello World!");
//        System.out.println(applicationContext.getBean("userService"));
//        UserService userService1 = applicationContext.getBean(UserService.class);
//        userService1.getUser();
    }

    // CommandLineRunner 接口的 run 方法在应用启动后会被调用
    @Override
    public void run(String... args) throws Exception {
        System.out.println("init");
        // 调用UserService的方法
        userService.getUser();
    }
}
