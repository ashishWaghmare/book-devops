Assignment –Lab
# Setup your info
    git config --global user.name "My Name"
    git config --global user.email my_name@abc.com
    git config --global http.proxy http://another-ip-address:808

# Create a local git repository
    mkdir mygitrepo
    cd mygitrepo
    git init
    
# Commit the initial code
    echo "First Line">> first.html
    git add first.html
    git commit -m "first commit"
    
# Update the code

## Push code to Repository

## Pull code from Repository

   
# Use git commands to
## Get the updated files
    git pull origin master
## List the changes
    git status
## Create branch
    git branch mybranch
    git checkout mybranch
    echo "Second Line" >> first.html
    git add first.html
    git commit -m "first commit"
## Merge branch
    git checkout master
    git merge master
