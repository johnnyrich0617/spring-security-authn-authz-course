/**
 * 
 */
package com.pluralsight.security.configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

/**
 * @author richa
 *
 */
@Configuration
@Order(2)
public class BasicSecurityConfiguration extends WebSecurityConfigurerAdapter {

	/**
	 * 
	 */
	public BasicSecurityConfiguration() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param disableDefaults
	 */
	public BasicSecurityConfiguration(boolean disableDefaults) {
		super(disableDefaults);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().anyRequest().
		authenticated().and().
		httpBasic().and().
		logout();
	}

}
