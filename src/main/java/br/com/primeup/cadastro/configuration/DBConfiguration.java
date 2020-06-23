package br.com.primeup.cadastro.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
//@ConfigurationProperties("spring.datasource")
@SuppressWarnings("unused")
public class DBConfiguration {
	
	private String driverClassName;
	private String url;
	private String username;
	private String password;

	@Profile("dev")
	@Bean
	public String devDataBaseConnection() {
		System.out.println("DB connection for DEV  - H2 ");
		System.out.println(driverClassName);
		System.out.println(url);
		return "DB connection for DEV  - H2 ";
	}
	
	@Profile("hml")
	@Bean
	public String hmlDataBaseConnection() {
		System.out.println("DB connection to RDS_HML - Low Cast Instance ");
		System.out.println(driverClassName);
		System.out.println(url);
		return "DB connection to RDS_HML - Low Cast Instance";
	
	}
	
	@Profile("pro")
	@Bean
	public String prodDataBaseConnection() {
		System.out.println("DB connection to RDS_PRO - Low Cast Instance ");
		System.out.println(driverClassName);
		System.out.println(url);
		return "DB connection to RDS_PRO - Low Cast Instance ";
	
	}

	
}
