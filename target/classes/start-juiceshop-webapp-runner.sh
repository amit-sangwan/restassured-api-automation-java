#!/bin/bash

# Check if Docker is installed
if ! command -v docker &> /dev/null; then
    echo "Docker is not installed. Please install Docker before running this script."
    echo "Install instructions: https://docs.docker.com/get-docker/"
    exit 1
fi

# Start Juice Shop container
docker run --rm -d -p 3000:3000 --name juice-shop amittsangwan/custom-juice-shop:v2

echo "Waiting for Juice Shop to start..."
echo "Service running on: http://localhost:3000/"

sleep 10

# Run REST Assured tests:
#                         mvn clean test

# To Stop container use:
#                       docker stop juice-shop
