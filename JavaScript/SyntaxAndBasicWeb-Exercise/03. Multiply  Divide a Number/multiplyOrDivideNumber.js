function solve(arr){
    let number1 = Number(arr[0]);
    let number2 = Number(arr[1]);

    if (number1 > number2){
        console.log(number1 / number2);
    } else {
        console.log(number1 * number2);
    }
}

// solve(['144', '12']);