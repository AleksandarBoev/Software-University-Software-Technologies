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
            $n = intval($_GET['num']);
            $output = [];
            for ($i = $n; $i >= 1; $i--){
                $output[] = $i;
            }

            echo(implode(" " , $output));
        }
    ?>
</body>
</html>