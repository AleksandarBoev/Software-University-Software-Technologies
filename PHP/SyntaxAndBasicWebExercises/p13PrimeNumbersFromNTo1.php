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
    function isPrime($num) {
        for ($j = 2; $j <= sqrt($num); $j++){
            if ($num % $j == 0) {
                return false;
            }
        }
        return true;
    }
        if (isset($_GET['num'])) {
            $n = intval($_GET['num']);
            while ($n >= 2) {
                if (isPrime($n)) {
                    echo $n . " ";
                }
                $n--;
            }
        }
    ?>
</body>
</html>