START=$(date)

cf push -p RobocodeV1.war

END=$(date)

DIFF=$(( $END - $START))

echo "It took $DIFF seconds"
