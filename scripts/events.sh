#!/bin/bash

set -e

count=${1:-1}

for id in $(seq 1 ${count}); do
  curl -v http://localhost:8080/events \
    -H "Content-Type: application/json" \
    -d '{"id": "'${id}'", "executionTime": "'$(date +%s)'"}}'
done
