package com.joinsun.perseus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.BackgroundPreinitializer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Created by ZJX on 2018/2/5.
 */
@SpringBootApplication
@ServletComponentScan
public class Application {

    public static void main(final String[] args) throws Exception {
        SpringApplication springApplication = new SpringApplication(Application.class);
        springApplication.addListeners(new BackgroundPreinitializer());
        springApplication.run(args);
    }
    /**
     * 用于配制多数据库.
     */
//    @Bean
//    public DatabaseIdProvider databaseIdProvider() {
//        return new DatabaseIdProvider() {
//            @Override
//            public void setProperties(Properties p) {
//
//            }
//
//            @Override
//            public String getDatabaseId(DataSource dataSource) throws SQLException {
//                ResourceBundle resourceApplication = ResourceBundle.getBundle("application", Locale.US);
//                return resourceApplication.getString("database");
//            }
//        };
//    }


//    @Bean
//    public TomcatEmbeddedServletContainerFactory tomcatFactory() {
//        return new TomcatEmbeddedServletContainerFactory() {
//
//            @Override
//            protected TomcatEmbeddedServletContainer getTomcatEmbeddedServletContainer(Tomcat tomcat) {
//                tomcat.enableNaming();
//                TomcatEmbeddedServletContainer container = super.getTomcatEmbeddedServletContainer(tomcat);
//                Container context = container.getTomcat().getHost().findChild("");
//                ClassUtils.overrideThreadContextClassLoader(context.getClass().getClassLoader());
//                return container;
//            }
//
//            @Override
//            protected void postProcessContext(Context context) {
//                ResourceBundle resourceApplication = ResourceBundle.getBundle("application", Locale.US);
//                ContextResource resource = new ContextResource();
//                resource.setName("jdbc/AmiliDataSource");
//                resource.setAuth("Container");
//                resource.setType(DataSource.class.getName());
//                resource.setProperty("driverClassName", resourceApplication.getString("driverClassName"));
//                resource.setProperty("url", resourceApplication.getString("url"));
//                resource.setProperty("username", resourceApplication.getString("username"));
//                resource.setProperty("password", resourceApplication.getString("password"));
//                context.getNamingResources().addResource(resource);
//            }
//        };
//}
}
