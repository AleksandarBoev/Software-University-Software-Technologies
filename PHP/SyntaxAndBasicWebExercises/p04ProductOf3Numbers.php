<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
<form>
    X: <input type="text" name="num1"/>
    Y: <input type="text" name="num2"/>
    Z: <input type="text" name="num3"/>
    <input type="submit"/>
</form>
<?php
if (isset($_GET['num1']) && isset($_GET['num2']) && isset($_GET['num3'])) {
    $array = [intval($_GET['num1']), intval($_GET['num2']), intval($_GET['num3'])];

    $count = count(array_filter($array, function ($x) {
        if ($x < 0) {
            return $x;
        }
    }));

//    $countZeros = count(array_filter($array, function ($y) {
//        if ($y === 0) {
//            return $y;
//        }
//    }));


    if ($count % 2 == 0 || ($array[0] == 0 || $array[1] == 0 || $array[2] == 0)) {
        echo "Positive";
    } else {
        echo "Negative";
    }

}

?>

</body>
</html>