#!/bin/sh
set -o errexit

# pre-req - dapr installed OR
# https://docs.dapr.io/operations/hosting/kubernetes/kubernetes-deploy/ - with Helm3

dapr init --kubernetes --wait

echo "Dapr check\n"
dapr status -k

echo "K8 check\n"
kubectl get pods --namespace dapr-system

# Dashboard at http://localhost:8080/configurations/daprsystem