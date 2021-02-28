#!/bin/bash

if [ -n $1 ]; then
  RECIPE_ID=$1
fi

curl -v http://localhost:8080/recipe/v1/recipes/$RECIPE_ID

echo
