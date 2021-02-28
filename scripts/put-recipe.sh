#!/bin/bash

if [ -n $1 ]; then
  RECIPE_ID=$1
else
  RECIPE_ID=1
fi

TS=`date`

curl -v -X PUT -d "{\"id\": 1, \"name\": \"My Recipe Updated\", \"description\": \"Now with description $TS\"}" \
-H "Content-Type: application/json" http://localhost:8080/recipe/v1/recipes/$RECIPE_ID

echo
