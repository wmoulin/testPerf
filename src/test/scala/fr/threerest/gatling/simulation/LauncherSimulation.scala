package fr.threerest.gatling.simulation

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import io.gatling.http.request.builder.HttpRequestBuilder.toActionBuilder
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.core.controller.inject.InjectionStep
import io.gatling.http.protocol.HttpProtocolBuilder


class LauncherSimulation extends Simulation {

  def run(scn: ScenarioBuilder, iss: InjectionStep*): SetUp = run(scn, iss.toIterable)
  
  def run(scn: ScenarioBuilder, iss: Iterable[InjectionStep]): SetUp = {
    val baseUrl = System.getProperty("baseUrl", "http://localhost:8888")
    setUp(
      scn.inject(iss)).protocols(configureHttp(baseUrl))
  }
  
  def configureHttp(url: String): HttpProtocolBuilder = {
    http
      .baseURL(url)
      // Here are the common headers
      .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
      .doNotTrackHeader("1")
      .acceptLanguageHeader("fr-FR,fr;q=0.5")
      .acceptEncodingHeader("gzip, deflate")
      .userAgentHeader("Mozilla/5.0 (X11; Linux x86_64; rv:45.0) Gecko/20100101 Firefox/45.0")
  }

}
