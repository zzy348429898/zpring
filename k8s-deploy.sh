#!/bin/bash

# 切换到 Minikube 的 Docker 环境
eval $(minikube docker-env)

# 构建镜像
docker build -t zpring-service:v1 .

# 应用 K8s 配置
kubectl apply -f k8s-deploy.yaml

# 自动开启端口转发 (可选)
# kubectl port-forward service/zpring-service 8080:8080

eval $(minikube docker-env -u)