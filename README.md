Tech Stack: Serenity BDD with JAVA.
Framework Design: Created a Maven project with all required dependencies copied over from the Serenity cucumber starter project. Please ensure all dependencies are loaded before running the test.
All dependencies are available in pom.xml file
To clone the project please clone from the repository and build the project
Entry point for this project is the feature file where the test scenario has been documented for better understanding of the user journey
You can run the test directly from the feature file by clicking the run or green button to the left of the scenario title or run './mvnw clean verify' from the command line
The framework include: 1. Feature > Search.feature 2. PageObjects > CareerPage and HomePage 3. StepDefinitions > SearchStepsdef
Search.feature file contains the test scenario as this allows for gherkin syntax in writting the scenario steps to be automated
CareerPage and HomePage contains locators and methods which drives the test
SearchStepsDef contains binding step definition which directly links the both the feature file and the page objects for better co-ordination and to maintain an organised architechtural design for the project

Any questions i am happy to answer them.

Please note: Running the tests under Maven
To run the tests with Maven, open a command window and run:

./mvnw clean verify

Viewing the reports
The command above when executed will produce a Serenity test report in the target/site/serenity directory.

Joseph
