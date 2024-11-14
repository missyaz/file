package vip.file.core.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description
 * @Date 2024/11/14 16:39
 * @Author Leo
 */
@Configuration
public class Knife4jConfiguration {

    @Bean
    public OpenAPI customOpenApi(){
        Contact contact = new Contact();
        contact.setName("Leo");
        contact.setEmail("leo@qq.com");
        contact.setUrl("http://doc.xiaominfo.com");
        return new OpenAPI()
                .info(new Info()
                        .title("文件服务")
                        .description("文件服务接口文档")
                        .version("1.0")
                        .contact(contact)
                );
    }
}
