# NBCUCraftAssignment
## Solution to nbcu craft assignment
## Licensing Information can be found at the following link: https://api.nasa.gov/api.html#sounds
## Project source can be downloaded from the following link: https://github.com/iunwachukwu/NBCUCraftAssignment.git
## Author and Conttributor List  
#### Innocent Nwachukwu, QA Automation Engineer.
#### All known bug fixes can be sent to iunwachukwu@yahoo.com testing and validations.
#### Reported bugs will tracked using JIRA and prioritized by PDM for Development.
## Package List
```
com/nbcu/tests
```
## File List
```
.README.md
.project
pom.xml
```
## Source File List
```
NasaSoundNegativeOneTest.java
NasaSoundsGetTest.java
```
## Other Project Folder List
```
.settings
src/test/java
test-output
```
## How to run the automation test after downloading Project source from GIT Repo
This application is an automation test for a RESTful Web Service. The application was developed and tested using Eclipse IDE. 
The application project can be exported into any IDE of choice. To run the program in Eclipse IDE, right-click on the project 
name in the "Package Explorer" and select "Run As" "TESTNG Test" from the menu list.  The test can also be run by selecting 
"Run As" "Maven Test" from the menu list.
## Expected Program result
The program will print on the IDE console in JSON format ten count of wave sounds from the NASA Voyager.  The limit of the sounds printed 
for this test is ten.
## Known Bugs
1. The application will still print ten count of wave sounds when the limit of the sounds to be printed is changed from 10 to -1 in test code.
2. The application throws an internal server exceptions when a negative numbers like -5  is used as the limit value.
