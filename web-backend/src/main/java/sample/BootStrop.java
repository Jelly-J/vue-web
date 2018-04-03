package sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import sample.webflux.EchoHandler;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@SpringBootApplication
public class BootStrop {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(BootStrop.class);
	}

	/**
	 * 编程模式对外提供服务
	 */
	@Bean
	public RouterFunction<ServerResponse> monoRouterFunction(EchoHandler echoHandler) {
		return route(POST("/echo"), echoHandler::echo)
		.andRoute(GET("/queryPerson/{id}"), echoHandler::queryPerson);
		//
	}

}
