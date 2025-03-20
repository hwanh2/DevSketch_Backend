package hwanhee.DevSketch_Backend.config;

import io.swagger.v3.oas.models.OpenAPI;
import org.springdoc.core.models.GroupedOpenApi;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi allApis() {
        return GroupedOpenApi.builder()
                .group("all") // 전체 API 그룹
                .pathsToMatch("/**") // 모든 API 포함
                .build();
    }

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("DevSketch API 문서")
                        .version("v2.0")
                        .description("Spring Boot 기반 API 문서입니다.")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }
}
