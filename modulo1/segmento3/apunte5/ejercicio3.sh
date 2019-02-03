#!/bin/bash

for((i = 1; i < 101; i++)) { 
       	declare -i suma+=i
   	 echo "$suma"
}

exit 0
