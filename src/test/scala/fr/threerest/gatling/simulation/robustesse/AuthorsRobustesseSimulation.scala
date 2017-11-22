package fr.threerest.gatling.simulation.robustesse

import fr.threerest.gatling.scenario.Scenario
import fr.threerest.gatling.simulation.LauncherSimulation
import fr.threerest.gatling.simulation.Injections


/**
 * Test de robustesse
 */
class AuthorsRobustesseSimulation extends LauncherSimulation {

  run(Scenario.authors, Injections.robustesse)

}
