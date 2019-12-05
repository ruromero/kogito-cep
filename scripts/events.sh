#!/bin/bash

set -e

count=${1:-1}

for id in $(seq 1 ${count}); do
  curl -v http://localhost:8080/ \
    -H "Content-Type: application/json" \
    -H "Ce-Id: ${id:0}" \
    -H "Ce-Specversion: 1.0" \
    -H "Ce-Type: org.kogito.serverless.examples.registration.registered" \
    -H "Ce-Source: source-1" \
    -d '{"username": "ruben", "type": "premium", "details": {"firstName": "Ruben", "lastName": "Romero"}}'
done
