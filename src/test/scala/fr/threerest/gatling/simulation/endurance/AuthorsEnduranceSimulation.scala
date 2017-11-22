package fr.threerest.gatling.simulation.endurance

import fr.threerest.gatling.scenario.Scenario
import fr.threerest.gatling.simulation.LauncherSimulation
import fr.threerest.gatling.simulation.Injections

/**
 * Test d'endurance
 */
class AuthorsEnduranceSimulation extends LauncherSimulation {

  val injection = Injections.endurance(10)
  
  run(Scenario.authors, injection)

}
