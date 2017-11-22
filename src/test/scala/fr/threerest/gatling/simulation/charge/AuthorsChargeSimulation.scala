package fr.threerest.gatling.simulation.charge

import fr.threerest.gatling.scenario.Scenario
import fr.threerest.gatling.simulation.LauncherSimulation
import fr.threerest.gatling.simulation.Injections

/**
 * Test de charge
 */
class AuthorsChargeSimulation extends LauncherSimulation {

  run(Scenario.authors, Injections.rampCharge)
  //run(Scenario.authors, Injections.single)
}
