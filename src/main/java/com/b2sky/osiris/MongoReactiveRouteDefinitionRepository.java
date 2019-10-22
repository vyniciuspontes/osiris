package com.b2sky.osiris;

import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoReactiveRouteDefinitionRepository extends ReactiveMongoRepository<RouteDefinition, String> {
}
