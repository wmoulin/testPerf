package fr.threerest.gatling.simulation

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

object Injections {
  val minUser = 20
  val maxUserRatio = 50

  val rampDuration = 5 minutes
  val pauseDuration = 1 minutes
  val enduranceRampDuration = 2 minutes
  val enduranceDuration = 1 hours // 10 hours
  val enduranceStepDuration = 10 minutes // 1 hours

  val maxUser = minUser * maxUserRatio

  //val single = constantUsersPerSec(1) during (1 seconds)
  val single = constantUsersPerSec(600) during (1 minutes)

  /** Mode d'injection pour les tests de charge */
  val rampCharge = rampUsersPerSec(minUser) to maxUser during (rampDuration)

  /** Mode d'injection pour les tests de robustesse */
  val robustesse = List(constantUsersPerSec(maxUser) during (30 seconds),
    nothingFor(pauseDuration),
    constantUsersPerSec(minUser) during (30 seconds))

  def enduranceByStep(usersStep: Int*) = {
    usersStep.map(step => constantUsersPerSec(step) during (Injections.enduranceStepDuration))
  }
  
  def endurance(usersStep: Int) = {
    List(rampUsersPerSec(minUser) to usersStep during (enduranceRampDuration),
         constantUsersPerSec(usersStep) during (Injections.enduranceDuration))
  }

}
