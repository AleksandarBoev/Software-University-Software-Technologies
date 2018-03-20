function solve(arr){
    let countNegatives = 0;
    for (let i = 0; i < arr.length; i++){
        if (arr[i].includes('-')){
            countNegatives++;
        }
    }

    if (countNegatives % 2 == 0){
        console.log('Positive');
    } else {
        console.log('Negative');
    }
}

// solve(['-2', '3', '-1']);