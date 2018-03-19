function largestNums(input) {
    let arr = input.map(Number);
    arr = arr.sort((a, b) => b - a);
    for (let i = 0; i < Math.min(arr.length, 3); i++){
        console.log(arr[i]);
    }
}

// largestNums([20, 30]);