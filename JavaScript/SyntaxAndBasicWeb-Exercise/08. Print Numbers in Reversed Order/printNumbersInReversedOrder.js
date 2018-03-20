function solve(arr){
    arr = [...arr].reverse().map(s => s);
    for (let i = 0; i < arr.length; i++){
        console.log(arr[i]);
    }
}

// solve(['1', '2', '3']);