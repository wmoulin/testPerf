package fr.threerest.gatling.scenario

import io.gatling.core.Predef.intToFiniteDuration
import io.gatling.core.Predef.scenario
import io.gatling.http.request.builder.HttpRequestBuilder.toActionBuilder
import fr.threerest.gatling.scenario.service.Authors


object Scenario {

  val authors = scenario("test get ressource Authors")
    .exec(Authors.listAll)

  val authorsNav = scenario("test get ressource Authors and one author")
    .exec(Authors.listAll)
    .exec(Authors.listId)

}