START=$(date)

cf push -p HelloWorld.war

END=$(date)

DIFF=$(( $END - $START))

echo "It took $DIFF seconds"
