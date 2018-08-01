# VsCodeTestProject
Test of the 2019 build system

Key components that 1736 is curious about:
 - [ ] OS support 
   - [x] Lubuntu
   - [ ] Manjaro
   - [ ] Windows
 - [X] CasseroleWebServer support
   - [X] Add Jetty .jar dependencies to the build
   - [X] Add a deploy target to copy .html/.css/.js resources to the correct folder on the RIO
 - [ ] Log file snagger integration with build
 - [ ] Debugger behavior/performance
 - [X] Investigate QDriverStation as an alternative to the "legit" one on linux
   - Works with 2018 protocol, though a memory leak crashes it after ~ 5 minutes. To be investigated...
 - [X] Add git info to software via manifest changes @ build time 
   - [ ] Add a small library to retrieve the info at runtime
   - [ ] Add a deploy lock that aborts the deploy (but not the build) if git has uncommitted changes

# Development Features
- Run `./gradlew deploy` in the root of the repo to build & deploy robot code
- Run `./gradlew clean` in the root of the repo to clean up all temp files
- Run `../gradlew run` in the websocketTest folder to start up a local version of the robot webserver as a test. Ctrl-c to quit.

