
# Jenkins

Make sure mchine running Jenkins has 
1. java is correctly installed
1. mvn is correctly installed

## Install and configure Jenkins

1. Download latest jenkins from machine

1. Open command line and launch jenkins

![Launch](images/jen-1.PNG)
      java -jar jenkins.war
      
## Setup M3 in Jenkins

![GTconfig/jen-m3.png)

Now enter M3 as installation name

![M3config](images/jen-con-m3.png)

### Build a pipeline job using Jenkins

Enter some name of Pipeline and click Second item from list
Once complete click "OK"

![M3config](images/jen-pipeline.png)

Now under section of Pipeline. Click on Try sample and create Job

![Jobconfig](images/jen-pipeline.png)

### Create a maven project for TestNG

   		 <dependency>
			<groupId>org.testng</groupId>
			<artifactId>testng</artifactId>
			<version>6.8.5</version>
		</dependency>
    
### Add TestNG test suite in the project
### Integrate it with Jenkins

## Modify the micro Service code in pom.xml
		
