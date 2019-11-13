
# Minikube Notes


alias k=kubectl

minikube stop
minikube start
source <(kubectl completion bash | sed s/kubectl/k/g)
minikube addons enable heapster
minikube service monitoring-grafana -n kube-system


eval $(minikube docker-env)

docker build -t kubia .

k run kubia --image=kubia --port=8080 --generator=run-pod/v1  --image-pull-policy=Never
k create deployment kubia --image=kubia -o yaml --dry-run > kubia-deployment.yml

## Scaling

   k apply -f kubia-deployment.yml

Or with command line below should work

   k scale deployments kubia --replicas=3

## Display to users
  
   k get svc
   minikube service kubia-http 


## Get ususage repors
k describe nodes
k top pod



## Cluster Auto Scaling

gcloud container clusters update kubia --enable-autoscaling \
--min-nodes=3 --max-nodes=5
