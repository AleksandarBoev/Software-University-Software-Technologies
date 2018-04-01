<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <?php
        if (isset($_GET['personName'])) {
            $name = $_GET['personName'];
            echo "Hello, " . $name;
        } else {
            ?>
            <form>
                Name: <input type="text" name="personName"/>
                <input type="submit"/>
            </form>
            <?php
        }
    ?>
</body>
</html>