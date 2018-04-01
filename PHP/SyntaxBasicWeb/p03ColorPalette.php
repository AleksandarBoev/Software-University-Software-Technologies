<!DOCTYPE html>
<html lang="en">
<head>

    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        div {
            display: inline-block;
            width: 150px;
            padding: 2px;
            margin: 5px;
        }
    </style>
</head>
<body>
<?php
    $stop = false;
    $count = 0;
    for ($c1 = 0; $c1 <= 255; $c1+=51){
        for ($c2 = 0; $c2 <= 255; $c2+=51){
            for ($c3 = 0; $c3 <= 255; $c3+=51){
                echo "<div style='background: rgb($c1, $c2, $c3)'>rgb ($c1, $c2, $c3)</div>";
            }
        }
    }
?>
</body>
</html>
