<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
    <style>
        div {
            display: inline-block;
            margin: 5px;
            width: 20px;
            height: 20px;
        }
    </style> 
</head>
<body>
    <?php
        function drawBox($colorIntensity) {
            echo "<div style='background-color: rgb($colorIntensity, $colorIntensity, $colorIntensity)'></div>";
        }

        for ($i = 0; $i < 5; $i++){
            for ($j = 0; $j < 10; $j++){
                $currentColor = $i * 51 + $j * 5;
                drawBox($currentColor);
            }
            echo "<br/>";
        }
    ?>
</body>
</html>