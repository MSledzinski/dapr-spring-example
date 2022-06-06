IMAGE_NAME:=dapr1
IMAGE_TAG:=latest

default:
	cat ./Makefile

dist:
	./mvnw clean install

image:
	docker build -t $(IMAGE_NAME):$(IMAGE_TAG) .

publish: image
	docker tag $(IMAGE_NAME):$(IMAGE_TAG) localhost:5000/$(IMAGE_NAME):$(IMAGE_TAG)
	docker push localhost:5000/$(IMAGE_NAME):$(IMAGE_TAG)

all: dist image publish

deploy:
	kubectl apply -f k8-deployment-svc.yml