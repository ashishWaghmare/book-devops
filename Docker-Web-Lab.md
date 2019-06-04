# Docker Lab with Browser Only
 
Remember to replace username with your actual docker hub username in below commands

1. Sign up account at
      https://hub.docker.com/
1. Login to page
      https://labs.play-with-docker.com
1. Start button should appear

1. In browser opened, click on Add instance, which should open terminal

1. Clone pure Web Site repo from url
 
    git clone https://github.com/dockersamples/linux_tweet_app

1. Now build image as per
     
    docker build . -i username/website

1. Publish images as
    
    docker push username/website
      
1. Now run image to create container

    docker run -p 8989:80 username/website
      
 
