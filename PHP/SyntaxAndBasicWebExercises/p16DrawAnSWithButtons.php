<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
</head>
<body>
<?php
    function drawBlueButton(){
        echo "<button style='background-color: blue'>1</button>";
    }

    function drawWhiteButton(){
        echo "<button >0</button>";
    }

    function drawBlueButtonTimes($n) {
        for ($i = 0; $i < $n; $i++){
            drawBlueButton();
        }
    }

    function drawWhiteButtonTimes($n) {
        for ($i = 0; $i < $n; $i++){
            drawWhiteButton();
    }
}


    for ($row = 1; $row <= 9; $row++){
        if ($row == 1 || $row == 9 || $row == 5) {
            drawBlueButtonTimes(5);
        } else if ($row < 5 && $row > 1) {
            drawBlueButton();
            drawWhiteButtonTimes(4);
        } else if ($row > 5 && $row < 9) {
            drawWhiteButtonTimes(4);
            drawBlueButton();
        }
        echo "<br/>";
    }
?>
</body>
</html>