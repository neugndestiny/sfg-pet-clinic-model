package warakorn.framework.sfgpetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"warakorn.springframework.sfgpetclinic","warakorn.framework.sfgpetclinic"})
public class SfgpetclinicApplication {

    public static void main(String[] args) {
        SpringApplication.run(SfgpetclinicApplication.class, args);
    }
}
