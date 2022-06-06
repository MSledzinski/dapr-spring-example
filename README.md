Simple example of two Spring Boot services Dapr1 and Dapr2
Dapr1 calling Dapr2


__NOTE: it is not secure / quality setup - only as dev playground__


Setup:
* Install Docker and Kind

* Create Kind cluster and local docker registry
`> create-king-with-docker-reg.sh`

* Setup ingress (Nginx)
`> kubectl apply -f k8-nginx.yml`

* Install Dapr

* Install Dapr in K8 Kind cluster
`> create-dapr-k8.sh`

* Build and deploy apps
`> cd code/dapr1 && make publish && make deploy`
`> cd code/dapr2 && make publish && make deploy`

* Dapr Dashboard at http://localhost:8080/configurations/daprsystem


* Call service:
  * for normal answer
    `> curl 'localhost:8081/api/value?command=abc' `

  * for error
    `> curl 'localhost:8081/api/value?command=throw' `

  * for delayed answer
    `> curl 'localhost:8081/api/value?command=wait' `