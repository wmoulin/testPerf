Projet de test de performances :

__robustesse__ : Gros nombres de requêtes, pause et charge faible. (l'appli ne doit pas tomber)
__endurance__ : Une limite d'utilisateur sur une longue durée.
__charge__ : Augmentation constante du nombres d'utilisateur de min à max sur une durée définie.

mvn gatling:execute -Dgatling.simulationClass=fr.threerest.gatling.simulation.charge.AuthorsChargeSimulation
