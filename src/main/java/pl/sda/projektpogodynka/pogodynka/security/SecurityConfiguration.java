//package pl.sda.projektpogodynka.pogodynka.security;
//
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Order;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@EnableWebSecurity
//public class SecurityConfiguration {
//
//    @Configuration
//    public static class LogedUserSecurityConfiguration extends WebSecurityConfigurerAdapter {
//        @Override
//        protected void configure(HttpSecurity httpSecurity) throws Exception {
//            httpSecurity.antMatcher("/api/guest/**").authorizeRequests()
//                    .anyRequest().authenticated()
//                    .and().httpBasic().and().csrf().disable();
//        }
//    }
//
//    @Configuration
//    @Order(1)
//    public static class GuestSecurityConfiguration extends WebSecurityConfigurerAdapter {
//        @Override
//        protected void configure(HttpSecurity httpSecurity) throws Exception {
//            httpSecurity.antMatcher("/api/pogodynka/**")
//                    .authorizeRequests()
//                    .antMatchers(LoginController.LOGIN_PATH).permitAll()
//                    .anyRequest().authenticated()
//                    .and().formLogin().loginPage(LoginController.LOGIN_PATH).loginProcessingUrl(LoginController.LOGIN_PATH);
//        }
//    }
//}
