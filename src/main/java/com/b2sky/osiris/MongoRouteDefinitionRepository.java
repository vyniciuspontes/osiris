package com.b2sky.osiris;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.cloud.gateway.route.RouteDefinitionRepository;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Configuration
public class MongoRouteDefinitionRepository implements RouteDefinitionRepository {

    @Autowired
    private MongoReactiveRouteDefinitionRepository mongoReactiveRouteDefinitionRepository;

    @Override
    public Flux<RouteDefinition> getRouteDefinitions() {

        return mongoReactiveRouteDefinitionRepository.findAll();
    }

    @Override
    public Mono<Void> save(Mono<RouteDefinition> route) {
        return Mono.empty();
    }

    @Override
    public Mono<Void> delete(Mono<String> routeId) {
        return Mono.empty();
    }
}
