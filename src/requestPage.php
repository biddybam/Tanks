<?php 


//IMPORTANT
//IF IT HAS A POST VARIABLE, JUST QUERY THAT USER, ELSE QUERY ALL PLAYERS
$link = mysqli_connect("localhost","JohnM","2people", "JohnM");
  if(!$link)
  {
    die('Could not connect: ' . mysqli_error());
  }

echo 'ConnectionOKa '; mysqli_close($link); 
echo 'testline2 ';
echo 'testline3';
//echo $_POST["usr"];
?> 