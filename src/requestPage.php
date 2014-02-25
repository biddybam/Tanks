<?php 
$con = mysqli_connect("localhost","JohnM","2people", "JohnM");
  if(!$con)
  {
    die('Could not connect: ' . mysqli_error());
  }

echo 'Connection OK'; mysql_close($link); 
?> 