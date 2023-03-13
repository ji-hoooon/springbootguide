package shop.mtcoding.conbasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConbasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConbasicApplication.class, args);
    }

}
//2023-03-08 20:07:14.528  INFO 55021 --- [  restartedMain] s.mtcoding.conbasic.ConbasicApplication  : Starting ConbasicApplication using Java 11.0.16 on jihoonui-MacBookAir.local with PID 55021 (/Users/jihoon/Library/CloudStorage/OneDrive-gc.gachon.ac.kr/2022 fastcampus/fast_lab/conbasic/build/classes/java/main started by jihoon in /Users/jihoon/Library/CloudStorage/OneDrive-gc.gachon.ac.kr/2022 fastcampus/fast_lab/conbasic)
//        2023-03-08 20:07:14.529  INFO 55021 --- [  restartedMain] s.mtcoding.conbasic.ConbasicApplication  : No active profile set, falling back to 1 default profile: "default"
//        2023-03-08 20:07:14.607  INFO 55021 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
//        2023-03-08 20:07:14.608  INFO 55021 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
//        2023-03-08 20:07:15.190  INFO 55021 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http) //임베디드 톰캣
//        2023-03-08 20:07:15.193  INFO 55021 --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
//        2023-03-08 20:07:15.193  INFO 55021 --- [  restartedMain] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.71] //서블릿 엔진 - 톰캣이 서블릿 엔진 - JDK보고 알아서 세팅 - 버전 호환성 //9부터 단일 스레드 지원 - 넌블락킹 - 컨텍스트 스위칭 존재하지않음
//        2023-03-08 20:31:21.804  INFO 55220 --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
//웹 애플리케이션 컨텍스트 : 디스패처 서블릿 생성, 컴포넌트 스캔 [빈을 찾아서 의존성을 주입해준다.]
//컴포넌트 스캔 : 컴포넌트 어노테이션 혹은 컴포넌트 어노테이션을 가진 클래스를 주입시켜준다. -컴포넌트 스캔 하는 범위는 해당 아키텍트 이하만
//        2023-03-08 20:31:21.804  INFO 55220 --- [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 63 ms
//        2023-03-08 20:31:21.826  INFO 55220 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
//        2023-03-08 20:31:21.829  INFO 55220 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
//        2023-03-08 20:31:21.831  INFO 55220 --- [  restartedMain] s.mtcoding.conbasic.ConbasicApplication  : Started ConbasicApplication in 0.232 seconds (JVM running for 661.52)
//        2023-03-08 20:31:21.831  INFO 55220 --- [  restartedMain] .ConditionEvaluationDeltaLoggingListener : Condition evaluation unchanged




//web.xml + context.xml + server.xml 합침 = application.properties
//application.properties에서 프로파일 변경가능 : 파일명 규칙 '-'