package fr.threerest.gatling.scenario.service

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Authors {
  val listAll = http("list all Authors")
    .get("/authors")
    
  val listId = http("list Author id=1")
    .get("/authors/1")
}
