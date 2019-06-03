# Windows

Make sure Docker Toolbox is used and not Docker Machine. Docker Toolbox has been deprecated but will be used for our lab excercise.

https://github.com/docker/toolbox/releases

# Windows 7

# Windows 10

Disable Hyper V.


# Check completition

Launch Quickstart Terminal as shown in below screen

![Launch](images/dck-eclipse.PNG)


Type command 

      docker run hello-world
    
# Docker

![Launch](images/dck-fin.PNG)

# Microservice and Docker 

Jump to folder which has your micro-service code. For me it was this path

      C:\Users\ashis\Documents\lab2\customer-service

Convert that to Unix like path and Docker Quickstart terminal

      cd /C/Users/ashis/Documents/lab2/customer-service
      
Now type command below in Docker Quickstart terminal
      
       docker build . -t customer-service
       
 Now expose the service to port you want, for my case 
 
       docker run  -p 9090:8080 customer-service
       

      
