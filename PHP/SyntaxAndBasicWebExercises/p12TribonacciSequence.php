<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
<form>
    N: <input type="text" name="num" />
    <input type="submit" />
</form>
<?php
if (isset($_GET['num'])) {
    $n = $_GET['num'];
    $f1 = 1;
    $f2 = 1;
    $f3 = 2;
    $fsum = $f1 + $f2 + $f3;
    echo $f1 . " ";
    echo $f2 . " ";
    echo $f3 . " ";
    for ($i = 2; $i < $n - 1; $i++){
        echo $fsum . " ";
        $f1 = $f2;
        $f2 = $f3;
        $f3 = $fsum;
        $fsum = $f1 + $f2 + $f3;
    }
}
?>
</body>
</html>