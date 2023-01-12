package com;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.keycloak.KeycloakSecurityContext;

@SpringBootApplication
public class ProjetlibrairiegatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetlibrairiegatewayApplication.class, args);
	}
@Bean 
DiscoveryClientRouteDefinitionLocator dynamicRoutes(ReactiveDiscoveryClient rdc,DiscoveryLocatorProperties dlp) 
{
return new DiscoveryClientRouteDefinitionLocator(rdc,dlp);
}
@Bean
public RouteLocator routes(RouteLocatorBuilder builder) {
	
	return builder.routes()
        .route(r -> r.path("/ADHERENT/**")
            .filters(f -> f.filter(keycloakSecurityContextClientFilter()))
                .authorizeExchange()
                    .hasAuthority("manager")
            .uri("http://localhost:8067/ADHERENT"))
        .build();
}
	
/*@Bean
SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) throws Exception {
  http
          .authorizeExchange()
           .pathMatchers("http://localhost:8067/ADHERENT").hasAuthority("manager")
            .anyExchange().authenticated()
            .and()
          .oauth2ResourceServer()
            .jwt();
  return http.build();
}*/
	
}
