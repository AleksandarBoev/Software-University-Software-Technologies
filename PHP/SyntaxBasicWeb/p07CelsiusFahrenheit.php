<?php

function celsiusToFahrenheit($cel)
{
    return (9 / 5) * $cel + 32;
}

function fahrenheitToCelsius($fah)
{
    return ($fah - 32) / (9 / 5);
}

$msgAfterCelsius = "";
if (isset($_GET['cel'])) {
    $cel = floatval($_GET['cel']);
    $fah = celsiusToFahrenheit($cel);
    $msgAfterCelsius = "$cel &deg;C = $fah &deg;F";
}
$msgAfterFahrenheit = "";
if (isset($_GET['fah'])) {
    $fah = floatval($_GET['fah']);
    $cel = fahrenheitToCelsius($fah);
    $msgAfterFahrenheit = "$fah &deg;F = $cel &deg;C";
}

?>


<form>
    Celsius: <input type="text" name="cel" />
    <input type="submit" value="Convert">
    <?= $msgAfterCelsius ?>
</form>
<!--ako beshe edna obshta forma, nqmashe da raboti-->
<form>
    Fahrenheit: <input type="text" name="fah" />
    <input type="submit" value="Convert">
    <?= $msgAfterFahrenheit ?>
</form>

