function solve(arr){
    let solution = [];
    for (let i = 0; i < arr.length; i++){
        if (arr[i] !== 'Stop'){
            solution.push(arr[i]);
        } else {
            break;
        }
    }

    for (let i = 0; i < solution.length; i++){
        console.log(solution[i]);
    }

}

// solve(['1', '2', '3', 'Stop', '5', '6', '7']);