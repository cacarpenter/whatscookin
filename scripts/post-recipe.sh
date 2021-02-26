#!/bin/bash

curl -v -d '{"name": "My Recipe"}' -H "Content-Type: application/json" http://localhost:8080/recipe/v1/recipes

echo
