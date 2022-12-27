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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
/*@Bean 
RouteLocator staticRoutes (RouteLocatorBuilder builder)
{
return builder.routes().route(r->r.path("/ADHERENT/adherent/**")
	    .filters
	    (f->f.circuitBreaker(c->c.setFallbackUri("forward:/defaultadherent")))
		.uri("http://localhost:8067/ADHERENT/adherent")
				
)		
		.build();	
}
*/

}
