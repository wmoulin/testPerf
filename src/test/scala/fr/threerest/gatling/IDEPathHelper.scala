import java.nio.file.Path

import java.net.URI
import java.nio.file.Paths
import java.io.File

object IDEPathHelper {

	val gatlingConfUrl: Path = Paths.get(getClass.getClassLoader.getResource("gatling.conf").toURI)
	val projectRootDir = 	gatlingConfUrl.subpath(0, gatlingConfUrl.getNameCount - 4).toString();


	val mavenSourcesDirectory = Paths.get(projectRootDir,"src", "test", "scala")
	val mavenResourcesDirectory = Paths.get(projectRootDir,"src", "test", "resources")
	val mavenTargetDirectory = Paths.get(projectRootDir,"target")
	val mavenBinariesDirectory = Paths.get(mavenTargetDirectory.toString(), "test-classes")

	val dataDirectory = Paths.get(mavenResourcesDirectory.toString(), "data")
	val bodiesDirectory = Paths.get(mavenResourcesDirectory.toString(), "bodies")

	val recorderOutputDirectory = mavenSourcesDirectory
	val resultsDirectory = Paths.get(mavenTargetDirectory.toString(), "results")

	val recorderConfigFile = Paths.get(mavenResourcesDirectory.toString(), "recorder.conf")
}
