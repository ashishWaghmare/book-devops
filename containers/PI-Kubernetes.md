# Pi Clusters

Below instructions is meant to create k8s on More than 2 Raspberry Pi Model 3+

## Required Hardware

## Required Software

## Enable SSH Layer

## IP check of all PI
You can use Android Fing application, if your phone, raspberry pi and latop are on same network.
Otherwise, use below to identify all machines

    nmap -sP 192.168.0.1/24

### Master
    ssh pi@192.168.0.105
    ssh-copy-id pi@192.168.0.105
    k3sup install --ip 192.168.0.104 --user pi
    kubectl get pods
    export KUBECONFIG=/home/ashishwaghmare/Hacks/pi-setup/kubeconfig 
    kubectl get nodes
    kubectl get pods --all-namespaces
    
### Slaves
From your laptop execute below commands

    ssh pi@192.168.0.104
    ssh-copy-id pi@192.168.0.104
    k3sup join --user pi --server-ip 192.168.0.104 --ip 192.168.0.105
    kubectl get nodes
    kubectl get pods --all-namespaces


    
