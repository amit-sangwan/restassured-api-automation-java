#!/bin/bash

# Check if Docker is installed
if ! command -v docker &> /dev/null; then
    echo "Docker is not installed. Please install Docker before running this script."
    echo "Install instructions: https://docs.docker.com/get-docker/"
    exit 1
fi

# Start Juice Shop container
docker run --rm -d -p 3000:3000 --name juice-shop bkimminich/juice-shop

echo "Waiting for Juice Shop to start..."
sleep 10

# Run REST Assured tests
#mvn clean test

# Stop container
#docker stop juice-shop
