Assignment –Lab
## Create a repository on GitHub
  Login to github
  Click on right top corner on "+" sign"
## Push the local changes to GitHub
  git remote add origin "your_url"
## Pull the code from GitHub
  From gitlab UI modify code 
  On your laptop
    git remote pull origin
## Create and checkout a branch
    git branch newbranch
    git checkout newbranch

## Add a new feature, commit and push changes to GitHub
    echo "sample branch only change" >> branch.txt
    git add branch.txt
    git commit -m "branch change"
    git push origin --all
## Create a pull request
Open github UI and open given repo
Click on "Pull Requests" icon
## Review the changes on GitHub and merge the branch into the main branch
